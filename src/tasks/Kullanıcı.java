package tasks;

import java.time.LocalDateTime;

public class Kullanıcı {
    String name;
    LocalDateTime kayıtZamanı;
    public Kullanıcı (){}
    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
    }
}
