package calismalar2;

public class A18 {
    public static void main(String[] args) {
        String k = "Learning java is easy";
        String arr[]=k.split("");

        String enCoktkrr="";
        int maxSayac=0;
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])){
                    sayac++;
                }
                }
            if (sayac>maxSayac){
                maxSayac=sayac;
                enCoktkrr=arr[i];
            }else if (sayac==maxSayac){
                enCoktkrr+=" ,"+arr[i];

            }
            sayac=0;
            }
        System.out.println("maximum occurring character is :" + enCoktkrr);
        }
    }
/*
       String arr[]=scsn.nextLine().split("");

        String enCoktkrr="";
        int maxSayac=0;
        int sayac=0;

        for (int i = 0; i < arr.length; i++) { //ilk index karşılaştırılan karakter ilk karakter sabit kalır alt satıra geçer
        for (int j = i+1; j < arr.length; j++) {// karşılaştırılan kendinden bir sonraki karakterle başlayan diğer karakterler. üsteeki sabit karakterle diğer kalanı karşıaştırır ve sononda ikinci ye geçer.4
        if (arr[i].equalsIgnoreCase(arr[j])){
        sayac++;
        }
        } if (sayac>maxSayac){
        maxSayac=sayac;
        enCoktkrr=arr[i];
        }else if (sayac==maxSayac){
        enCoktkrr+=" ,"+arr[i];

        }
        sayac=0;
        }

 */