package JavaProjects.P04_okulYönetimi.ogrcOgrtYonetimi;

public class Ogrenci extends Kisi{
    private String no;
    private String sınıf;
    public Ogrenci(){}

    @Override
    public String toString() {
        return "Ogrenci=" +
                "no='" + no + '\'' +
                ", sınıf='" + sınıf + '\'' +
                " " + super.toString();
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String no, String sınıf) {
        super(adSoyad, kimlikNo, yas);
        this.no = no;
        this.sınıf = sınıf;

    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }

}
