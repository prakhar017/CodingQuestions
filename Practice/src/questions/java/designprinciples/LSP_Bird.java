package java.designprinciples;

public interface LSP_Bird {

}

interface FlyingBird extends LSP_Bird {

    void fly();
}


class Parrot implements FlyingBird {

    @Override
    public void fly() {
        System.out.println(" Able to fly");
    }
}


/* class Ostrich implements FlyingBird{


    @Override
    public void fly() {
        throw new RuntimeException();
    }
} */


class Ostrich implements LSP_Bird {


}
