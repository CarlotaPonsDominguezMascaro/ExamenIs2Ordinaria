package model;

import java.util.List;

public class Movie {
    private final String image;
    private final String title;
    private final String director;
    private final List<String> actors;
    private final int year;
    private final double reviews;
    private final Genre genre;
    private final int duration;
    private int peopleWhoWatch;

    public Movie(String image, String title, String director, List<String> actors, int year, double reviews, Genre genre, int duration, int peopleWhoWatch) {
        this.image = image;
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.year = year;
        this.reviews = reviews;
        this.genre = genre;
        this.duration = duration;
        this.peopleWhoWatch = peopleWhoWatch;
    }

    public int getYear() {
        return year;
    }

    public double getReviews() {
        return reviews;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPeopleWhoWatchIt() {
        return peopleWhoWatch;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Movie{");
        sb.append("image='").append(image).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", director='").append(director).append('\'');
        sb.append(", actors=").append(actors);
        sb.append(", year=").append(year);
        sb.append(", reviews=").append(reviews);
        sb.append(", genre=").append(genre);
        sb.append(", duration=").append(duration);
        sb.append(",people that has seen it ").append(peopleWhoWatch);
        sb.append("}\n");
        return sb.toString();
    }
}
