package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class RatingRegister {

    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, Map<Film, Rating>> personRatings;

    public RatingRegister() {
        this.filmRatings = new HashMap<Film, List<Rating>>();
        this.personRatings = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!this.filmRatings.containsKey(film)) {
            this.filmRatings.put(film, new ArrayList<Rating>());
        }

        this.filmRatings.get(film).add(rating);
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!this.personRatings.containsKey(person)) {
            this.personRatings.put(person, new HashMap<Film, Rating>());
        }

        if (!this.personRatings.get(person).containsKey(film)) {
            this.personRatings.get(person).put(film, rating);
            this.addRating(film, rating);

        }
    }

    public Rating getRating(Person person, Film film) {
        if (this.personRatings.get(person).containsKey(film)) {
            return this.personRatings.get(person).get(film);
        }
        return Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (!this.personRatings.containsKey(person)) {
            return new HashMap();
        }
        return this.personRatings.get(person);
    }

    public List<Person> reviewers() {
        return new ArrayList<Person>(this.personRatings.keySet());
    }

    public List<Rating> getRatings(Film film) {
        return this.filmRatings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.filmRatings;
    }

}
