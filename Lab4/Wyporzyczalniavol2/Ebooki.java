package Wyporzyczalniavol2;

import java.util.Date;
import java.util.UUID;

public class Ebooki {

    private Utwor utwor_ebook;
    public int iloscstron;
    public int wielkosc;
    public UUID ID;
    public Date dwyd;
    boolean wyporzyczony;

    public Ebooki() {
        this.utwor_ebook = new Utwor();
        utwor_ebook.setAutor("ssss");
        utwor_ebook.setCena(25);
        utwor_ebook.setNr_wew(9);
        utwor_ebook.setTyt("????");
        utwor_ebook.dwyd = new Date();
        this.ID = UUID.randomUUID();
        this.wielkosc =888;
        this.iloscstron = 7384782;

    }
    public Date getDwyd() {return utwor_ebook.dwyd;}
    public String getTyt() { return utwor_ebook.getTyt(); }
    public int getNr_wew() { return utwor_ebook.getNr_wew(); }
    public int getCena() { return utwor_ebook.getCena(); }
    public String getAutor() { return utwor_ebook.getAutor(); }

    public void wyp() {

        if (this.wyporzyczony) {

            System.out.println("Wyporzyczone:" + utwor_ebook.getTyt());

        } else {

            this.wyporzyczony = true;
            this.dwyd = new Date();
        }
    }

    public void zwrot() {

        if (this.wyporzyczony) {

            this.wyporzyczony = false;

        } else {

            System.out.println("Zwrocona:" + utwor_ebook.getTyt());

        }
    }

    public void info() {

        System.out.println("tytuł " + utwor_ebook.getTyt() + "\n" + "wydanie " + utwor_ebook.getNr_wew() + "\n" + "autor  " + utwor_ebook.getAutor() + "\n" + "wydawca " + utwor_ebook.getWyd()+ "\n" + "cena " + utwor_ebook.getCena());

    }
    public UUID getID() {
        return this.ID;
    }
}

