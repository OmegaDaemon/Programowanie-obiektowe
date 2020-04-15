package Wyporzyczalniavol2;

import java.util.Date;
import java.util.UUID;

public class Plyty {

    private Utwor utwor_plyty;
    public int wielkosc;
    public UUID ID;
    public Date dwyd;
    boolean wyporzyczony;

    public Plyty() {

        this.utwor_plyty = new Utwor();
        utwor_plyty.setAutor("sasa");
        utwor_plyty.setCena(20);
        utwor_plyty.setNr_wew(8);
        utwor_plyty.setTyt("coscos");
        utwor_plyty.dwyd = new Date();
        this.ID = UUID.randomUUID();
        this.wielkosc = 7768678;

    }
    public Date getDwyd() {return utwor_plyty.dwyd;}
    public String getTyt() { return utwor_plyty.getTyt(); }
    public int getNr_wew() { return utwor_plyty.getNr_wew(); }
    public int getCena() { return utwor_plyty.getCena(); }
    public String getAutor() { return utwor_plyty.getAutor(); }

    public void wyp() {

        if (this.wyporzyczony) {

            System.out.println("Wyporzyczone:" + utwor_plyty.getTyt());

        } else {

            this.wyporzyczony = true;
            this.dwyd = new Date();
        }
    }

    public void zwrot() {

        if (this.wyporzyczony) {

            this.wyporzyczony = false;

        } else {

            System.out.println("Zwrocona:" + utwor_plyty.getTyt());

        }
    }

    public void info() {

        System.out.println("tytuł " + utwor_plyty.getTyt() + "\n" + "wydanie " + utwor_plyty.getNr_wew() + "\n" + "autor  " + utwor_plyty.getAutor() + "\n" + "wydawca " + this.getDwyd() + "\n" + "cena " + utwor_plyty.getCena());

    }
    public UUID getID() {
        return this.ID;
    }

}
