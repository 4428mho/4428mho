package projects2.P05_HalukMarket;

import javax.swing.*;

public class Runner {
    public static void main(String[] args) {

       
        System.out.format("vefa");
        String ileti="kurs öğrencileri :\n"+"ali\n"+"\nveli";
        String[] seçenekler={"evet","hayır","sene ne"};
        String mesaj="kayfe için mi";
        JOptionPane.showMessageDialog(null,"emin misiniz?","Baslık-1",0);
        JOptionPane.showMessageDialog(null,"siz bilirsiniz","Baslık-2",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,ileti,"kurs",1);
        int seçim = JOptionPane.showOptionDialog(null,mesaj,"yasabır",JOptionPane.YES_NO_CANCEL_OPTION,2,null,seçenekler,null);
        JOptionPane.showMessageDialog(null,seçenekler[seçim]);

    }
}
