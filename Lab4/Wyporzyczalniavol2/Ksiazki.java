package Wyporzyczalniavol2;

import java.util.Date;
import java.util.UUID;

public class Ksiazki {

    private Wyporzyczalniavol2.Utwor utwor_ksiazki;
    public int iloscstron;
    public UUID ID;
    public Date dwyd;
    boolean wyporzyczony;

    public Ksiazki() {
        this.utwor_ksiazki = new Utwor();
        utwor_ksiazki.setAutor("ssss");
        utwor_ksiazki.setCena(25);
        utwor_ksiazki.setNr_wew(9);
        utwor_ksiazki.setTyt("????");
        utwor_ksiazki.dwyd = new Date();
        this.ID = UUID.randomUUID();
        this.iloscstron = 75765;

    }
    public Date getDwyd() {return utwor_ksiazki.dwyd;}
    public String getTyt() { return utwor_ksiazki.getTyt(); }
    public int getNr_wew() { return utwor_ksiazki.getNr_wew(); }
    public int getCena() { return utwor_ksiazki.getCena(); }
    public String getAutor() { return utwor_ksiazki.getAutor(); }

    public void wyp() {

        if (this.wyporzyczony) {

            System.out.println("Wyporzyczone:" + utwor_ksiazki.getTyt());

        } else {

            this.wyporzyczony = true;
            this.dwyd = new Date();
        }
    }

    public void zwrot() {

        if (this.wyporzyczony) {

            this.wyporzyczony = false;

        } else {

            System.out.println("Zwrocona:" + utwor_ksiazki.getTyt());

        }
    }

    public void info() {

        System.out.println("tytuł " + utwor_ksiazki.getTyt() + "\n" + "wydanie " + utwor_ksiazki.getNr_wew() + "\n" + "autor  " + utwor_ksiazki.getAutor() + "\n" + "wydawca " + this.getDwyd() + "\n" + "cena " + utwor_ksiazki.getCena());

    }

    public UUID getID() {
        return this.ID;
    }
}

