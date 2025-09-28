package java.designpatterns;

public class Pizza {

    // Required
    private String size;


    // Optional
    private boolean cheese;
    private boolean toppings;

    private Pizza(Builder builder){
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.toppings = builder. toppings;

    }

    public  static class Builder {

        private String size;

        private boolean cheese;
        private boolean toppings;

        public Builder( String size){
            this.size = size;
        }

        public Builder cheese( boolean value){
            cheese =value;
            return this;

        }

        public  Builder toppings( boolean value){
            toppings = value;
            return  this;
        }


        public Pizza build(){
            return new Pizza(this);
        }


    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", toppings=" + toppings +
                '}';
    }
}


class Pizza_Main {
    public static void main(String[] args) {


        Pizza pizza = new Pizza.Builder("Large")
                .cheese(true)
                .toppings(true)
                .build();

        System.out.println(pizza);

    }
}
