package errorHandling;

public class Calculator {

    public static double divisionOperation (double sayi1, double sayi2)throws DivideByZeroException{
        if (sayi2 == 0){
            throw new DivideByZeroException("Sıfıra bölme işlemi hatası");
    }
    return sayi1 / sayi2;
}
}
