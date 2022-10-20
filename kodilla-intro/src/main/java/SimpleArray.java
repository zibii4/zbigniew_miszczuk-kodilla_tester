public class SimpleArray {
    public static void main(String[] args) {
        String[] movies = new String[5];
        movies[0] = "Zbigniew";
        movies[1] = "Miszczuk";
        movies[2] = "Harry";
        movies[3] = "Potter";
        movies[4] = "Hermiona";
        String movie = movies[2];
        System.out.println(movie);
        int numberOfElements = movies.length;
        System.out.println(numberOfElements);
    }
}
