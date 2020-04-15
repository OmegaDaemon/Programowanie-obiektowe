package Wyporzyczalniavol2;

import java.util.Date;
import java.util.UUID;

public class Audiobooki
{
    private Utwor utwor_audio;
    public int dlugosc;
    public int wielkosc;
    public UUID ID;
    public Date dwyd;
    boolean wyporzyczony;

    public Audiobooki()
    {
        this.utwor_audio = new Utwor();
        utwor_audio.setAutor("sasa");
        utwor_audio.setCena(20);
        utwor_audio.setNr_wew(8);
        utwor_audio.setTyt("coscos");
        utwor_audio.dwyd = new Date();
        this.ID = UUID.randomUUID();
        this.dlugosc = 999;
        this.wielkosc = 87;
    }

    public Date getDwyd() {return utwor_audio.dwyd;}
    public String getTyt() { return utwor_audio.tyt;}
    public int getNr_wew() { return utwor_audio.nr_wew;}
    public int getCena() { return utwor_audio.cena; }
    public String getAutor() { return utwor_audio.autor; }

    public void wyp() {

        if (this.wyporzyczony) {

            System.out.println("Wyporzyczone:" + utwor_audio.getTyt());

        } else {

            this.wyporzyczony = true;
            this.dwyd = new Date();
        }
    }

    public void zwrot() {

        if (this.wyporzyczony) {

            this.wyporzyczony = false;

        } else {

            System.out.println("Zwrocona:" + utwor_audio.getTyt());

        }
    }

    public void info() {

        System.out.println("tytuł " + utwor_audio.getTyt() + "\n" + "wydanie " + utwor_audio.getNr_wew() + "\n" + "autor  " + utwor_audio.getAutor() + "\n" + "wydawca " + this.getDwyd() + "\n" + "cena " + utwor_audio.getCena());

    }
    public UUID getID() {
        return this.ID;
    }
}