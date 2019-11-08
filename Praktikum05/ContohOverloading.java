import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class ContohOverloading{
    public void jumlah(int a, int b){
        System.out.println("Jumlah 2 angka = " + (a+b));
    }

    public void jumlah(int a, int b, int c){
        System.out.println("Jumlah 3 angka = " + (a+b+c));
    }

    public void jumlah(double a, int b){
        System.out.println("Jumlah 2 angka = " + (a+b));
    }

    public void jumlah(int b, double a){
        System.out.println("Jumlah 2 angka = " + (a+b));
    }
}