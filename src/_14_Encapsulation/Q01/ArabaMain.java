package _14_Encapsulation.Q01;

public class ArabaMain {


    public static void main(String[] args) {
        Araba honda = new Araba();
        honda.setModel("civic");
        honda.setMotor(1600);
        honda.setRenk("beyaz"); 
        honda.setYıl(-2020);
        System.out.println("honda = " + honda);
        System.out.println(honda);
        Araba toyota = new Araba("avensis","beyaz",2000,2000);
        System.out.println(toyota);
        Araba volvo = new Araba("s80","füme",300,-2023);
        System.out.println(volvo);
        System.out.println("  sectiğiniz araç toyota "+"   modeli="+toyota.getModel()+"  renk="+toyota.getRenk()+"  motor="+toyota.getMotor()+"  yıl="+toyota.getYıl());


    }
}