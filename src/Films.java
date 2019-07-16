public class Films implements Comparable<Films> {
    private String nameOfMovie;
    private int durationOfMovie;

    public Films(String nameOfMovie, int durationOfMovie) {
        this.nameOfMovie = nameOfMovie;
        this.durationOfMovie = durationOfMovie;
    }

    public String getNameOfMovie() {
        return nameOfMovie;
    }

    public void setNameOfMovie(String nameOfMovie) {
        this.nameOfMovie = nameOfMovie;
    }

    public int getDurationOfMovie() {
        return durationOfMovie;
    }

    public void setDurationOfMovie(int durationOfMovie) {
        this.durationOfMovie = durationOfMovie;
    }

    @Override
    public String toString() {
        return nameOfMovie + "  |  " +
                "durationOfMovie: " + durationOfMovie + " minutes";
    }


    @Override
    public int compareTo(Films o) {
        return nameOfMovie.compareTo(o.getNameOfMovie());
    }
}
