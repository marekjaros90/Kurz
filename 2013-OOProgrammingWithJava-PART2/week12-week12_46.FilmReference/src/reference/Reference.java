package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class Reference {

    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {
        List<Film> films = new ArrayList<Film>(this.ratingRegister.filmRatings().keySet());

        if (films.isEmpty()) {
            return null;
        }

        if (this.ratingRegister.getPersonalRatings(person).isEmpty()) {

            Map<Film, List<Rating>> filmRatings = this.ratingRegister.filmRatings();

            Collections.sort(films, new FilmComparator(filmRatings));

            return films.get(0);

        } else {

            Map<Film, Rating> personRating = this.ratingRegister.getPersonalRatings(person);
            Set<Person> set = sameTaste(person).keySet();
            List<Person> sameTaste = new ArrayList<Person>(set);
            Collections.sort(sameTaste, new PersonComparator(sameTaste(person)));

            if (sameTaste.isEmpty()) {
                return null;
            }

            Person bestMatch = sameTaste.get(0);

            Map<Film, Rating> bestMatchRating = this.ratingRegister.getPersonalRatings(bestMatch);

            int recommendedValue = 0;
            Film recommendedFilm = new Film("hoj");

            for (Film f : bestMatchRating.keySet()) {

                if (personRating.containsKey(f)) {
                    continue;
                }

                if (bestMatchRating.get(f).getValue() > recommendedValue) {
                    recommendedValue = bestMatchRating.get(f).getValue();
                    recommendedFilm = f;
                }
            }

            if (recommendedValue == 0) {
                return null;
            }

            return recommendedFilm;
        }
    }

    public Map<Person, Integer> sameTaste(Person person) {
        Map<Film, Rating> personRatings = this.ratingRegister.getPersonalRatings(person);
        Map<Person, Integer> peopleIdentities = new HashMap<Person, Integer>();

        List<Person> reviewers = this.ratingRegister.reviewers();

        for (Person reviewer : reviewers) {

            if (reviewer.equals(person)) {
                continue;
            }

            Map<Film, Rating> reviewerRatings = this.ratingRegister.getPersonalRatings(reviewer);

            int similarity = 0;

            for (Film film : reviewerRatings.keySet()) {
                if (personRatings.containsKey(film)) {
                    similarity += reviewerRatings.get(film).getValue() * personRatings.get(film).getValue();
                }
            }

            if (similarity > 0) {
                peopleIdentities.put(reviewer, similarity);
            }

        }

        return peopleIdentities;
    }
}
