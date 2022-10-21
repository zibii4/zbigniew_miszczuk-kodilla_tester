public class Grades {

    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    //Zwracająca ostatnio dodaną ocenę
    public int getLastValue() {
        int lastElement = grades[size - 1];
        return lastElement;
    }

    //Zwracajaca średnia ocene
    public int average() {
        int sum = 0;
        for (int value : grades) {
            sum += value;
        }
        return sum / size;
    }
}

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(2);
        grades.add(4);

        int ostatniaWartosc = grades.getLastValue();
        System.out.println(ostatniaWartosc);

        int srednia = grades.average();
        System.out.println(srednia);
    }