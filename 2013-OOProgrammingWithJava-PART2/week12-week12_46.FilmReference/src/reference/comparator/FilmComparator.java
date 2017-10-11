package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }


    @Override
    public int compare(Film o1, Film o2) {
        if(this.averageRating(o1) == this.averageRating(o2)) {
            return 0;
        } else if(this.averageRating(o1) > this.averageRating(o2)) {
            return -1;
        } else {
            return 1;
        }
    }

    private double averageRating(Film film) {
        int sum = 0;
        int count = 0;
        for (Rating rating : this.ratings.get(film)) {
            sum += rating.getValue();
            count++;
        }
        return (double)sum/count;
    }

}
