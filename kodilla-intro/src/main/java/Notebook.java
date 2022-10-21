public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
       public void checkWeight() {
           if (this.weight < 500) {
               System.out.println("The device is light.");
           } else if (this.weight > 500 && this.weight < 1700) {
               System.out.println("The device is not too heavy.");
           } else {
               System.out.println("Very heavy device");
           }
       }
        public void checkYear(){
            if (this.year < 2000 && this.price > 500){
                System.out.println("stare urzadzenie");
            } else if (this.year > 1990 && this.weight < 1700) {
                System.out.println("nowe urządzenie.");
            }
           }

        }




