/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
class Pracownicy {
   
    private String Uzytkownik;
    private String Haslo;
    private int ID;
    
    public Pracownicy (int ID, String Uzytkownik, String Haslo)
    {
        this.ID = ID;
        this.Uzytkownik = Uzytkownik;
        this.Haslo = Haslo;
        
    }
    
    public int getID(){
        return ID;
    }

    public String getUzytkownik(){
        return Uzytkownik;
    }
    public String getHaslo(){
        return Haslo;
    }
}