package prac.basics.java.codes.innerclass;

public class InnerClass {

    int age = 10;

    public void show (){
         System.out.println(" Inside outer");
     }

     class InnerMostClass{

         public void innerMost (){
             System.out.println(" Inside inner most");
         }

     }

}

class Main {
    public static void main (String args[]){

        // Creating outer's object
        InnerClass innerClass = new InnerClass();
        innerClass.show();

        // Creating inner's object, for this we need object of OuterClass
        InnerClass.InnerMostClass innerMostClass = innerClass.new InnerMostClass();
        innerMostClass.innerMost();
    }
}
