package Wyporzyczalniavol2;

import java.util.Date;
import java.util.UUID;

public class Filmy {

    private Wyporzyczalniavol2.Utwor utwor_film;
    public int dlugosc;
    public int wielkosc;
    public UUID ID;
    public Date dwyd;
    boolean wyporzyczony;

    public Filmy() {
        this.utwor_film = new Utwor();
        utwor_film.setAutor("sasa");
        utwor_film.setCena(20);
        utwor_film.setNr_wew(8);
        utwor_film.setTyt("coscos");
        utwor_film.dwyd = new Date();
        this.ID = UUID.randomUUID();
        this.dlugosc = 32424;
        this.wielkosc = 234324;
    }
    public Date getDwyd() {return utwor_film.dwyd;}
    public String getTyt() { return utwor_film.getTyt(); }
    public int getNr_wew() { return utwor_film.getNr_wew(); }
    public int getCena() { return utwor_film.getCena(); }
    public String getAutor() { return utwor_film.getAutor(); }

    public void wyp() {

        if (this.wyporzyczony) {

            System.out.println("Wyporzyczone:" + utwor_film.getTyt());

        } else {

            this.wyporzyczony = true;
            this.dwyd = new Date();
        }
    }

    public void zwrot() {

        if (this.wyporzyczony) {

            this.wyporzyczony = false;

        } else {

            System.out.println("Zwrocona:" + utwor_film.getTyt());

        }
    }

    public void info() {

        System.out.println("tytuł " + utwor_film.getTyt() + "\n" + "wydanie " + utwor_film.getNr_wew() + "\n" + "autor  " + utwor_film.getAutor() + "\n" + "wydawca " + this.getDwyd() + "\n" + "cena " + utwor_film.getCena());

    }
    public UUID getID() {
        return this.ID;
    }
}




