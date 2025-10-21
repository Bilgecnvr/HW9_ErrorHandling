package errorHandling;

public class Test {
    public static void main(String[] args) {
        //Hatalı Bölme İşlemi
        try{
            double sonuc = Calculator.divisionOperation(10,0);
            System.out.println("1. işlemin Sonucu: " + sonuc);

        }catch (DivideByZeroException ex){
            System.out.println("1. İşlemde Hata Bulundu: " + ex.getMessage());
        }
        //Hatalı Olmayan Bölme işlemi
        try{
            double sonuc2 = Calculator.divisionOperation(10,2);
            System.out.println("2. işlemin Sonucu: " + sonuc2);
        } catch (DivideByZeroException ex) {
            System.out.println("2. İşlemde Hata Bulundu: " + ex.getMessage());
        }
    }
}
