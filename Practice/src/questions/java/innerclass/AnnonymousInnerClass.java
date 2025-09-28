package java.innerclass;

public class AnnonymousInnerClass {
    public void show() {
        System.out.println(" Inside show");
    }
}


/*  Extra Code Needed
class B extends AnnonymousInnerClass{
    public void show (){
        System.out.println("Inside B");
    }
}
*/

class Main2 {
    public static void main (String args[]){


/*      EXtra Code Needed
        AnnonymousInnerClass annonymousInnerClass = new B();
        annonymousInnerClass.show();
        Inside B
 */

        AnnonymousInnerClass annonymousInnerClass = new AnnonymousInnerClass()
        {
            public void show (){
                System.out.println("Inside B");
            }
        };

        annonymousInnerClass.show();
    }
}