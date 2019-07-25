package main.java.movies;

class Movies {

    private final String genre;
    private final int price;

    Movies(String name, String genre, int price) {
        this.genre = genre;
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

}
