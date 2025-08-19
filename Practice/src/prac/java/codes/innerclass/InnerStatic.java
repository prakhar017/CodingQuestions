package prac.basics.java.codes.innerclass;

public class InnerStatic {
    // Cant make outer as static

    int age = 10;

    public void show (){
        System.out.println(" Inside outer");
    }

    static class InnerMostClass{

        public void innerMost (){
            System.out.println(" Inside inner most");
        }

    }

}

class Main1 {
    public static void main (String args[]){

        // Creating outer's object
        InnerStatic innerStatic = new InnerStatic();
        innerStatic.show();

        // Creating inner's object, for this we need object of OuterClass
        InnerStatic.InnerMostClass innerMostClass = new InnerStatic.InnerMostClass();
        innerMostClass.innerMost();
    }
}
