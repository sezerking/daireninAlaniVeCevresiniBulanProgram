import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,aci;
        double pi=3.14;

        Scanner scn=new Scanner(System.in);

        System.out.println("Dairenin yaricapini giriniz: ");
        r=scn.nextInt();
        System.out.println("Merkez acinin olcusunu giriniz: ");
        aci=scn.nextInt();
        double alan=(pi*(r*r)*aci)/360;
        double cevre=2*pi*r;

        System.out.println("Dairenin alani: "+alan);
        System.out.println("Dairenin cevresi: "+cevre);
    }
}
