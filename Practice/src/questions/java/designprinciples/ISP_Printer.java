package java.designprinciples;

/*public interface Printer {

    void print();
    void scan();
    void fax();

}*/


interface ISP_Printer {

    void print();
}


interface ISP_Scanner {

    void scan();
}

class MultiFunctionPrinter implements ISP_Printer, ISP_Scanner {


    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }

}

class SingleFunctionPrinter implements ISP_Printer {


    @Override
    public void print() {

    }

}

