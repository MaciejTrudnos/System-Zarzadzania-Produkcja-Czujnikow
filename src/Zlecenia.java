/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
class Zlecenia {
    private String Kontrahent;
    private String OstatecznyTerminRealizacji;
    private String NazwaCzujnika;
    private String TypCzujnika;
    private String RozmiarObudowy;
    private String DlugoscKorpusu;
    private String ZasiegDzialania;
    private String Ilosc;
    private String Uwagi;
    private int ID;
    private String Status;
    
    
    public Zlecenia (int ID,String kontrahent, String OstatecznyTerminRealizacji, String NazwaCzujnika, String TypCzujnika, String RozmiarObudowy, String DlugoscKorpusu, String ZasiegDzialania, String Ilosc, String Uwagi, String Status)
    {
       
        this.Kontrahent = kontrahent;
        this.OstatecznyTerminRealizacji = OstatecznyTerminRealizacji;
        this.NazwaCzujnika = NazwaCzujnika;
        this.TypCzujnika = TypCzujnika;
        this.RozmiarObudowy = RozmiarObudowy;
        this.DlugoscKorpusu = DlugoscKorpusu;
        this.ZasiegDzialania = ZasiegDzialania;
        this.Ilosc = Ilosc;
        this.Uwagi = Uwagi;
        this.ID = ID;
        this.Status = Status;
        
    }
    public int getID(){
        return ID;
    }
    public String getKontrahent(){
        return Kontrahent;
    }
    public String getOstatecznyTerminRealizacji(){
        return OstatecznyTerminRealizacji;
    }
    public String getNazwaCzujnika(){
        return NazwaCzujnika;
    }
    public String getTypCzujnika(){
        return TypCzujnika;
    }
    public String getRozmiarObudowy(){
        return RozmiarObudowy;
    }
    public String getDlugoscKorpusu(){
        return DlugoscKorpusu;
    }
    public String getZasiegDzialania(){
        return ZasiegDzialania;
    }
    public String getIlosc(){
        return Ilosc;
    }
    public String getUwagi(){
        return Uwagi;
    }
    public String getStatus(){
        return Status;
    }
}
