package eksempelklasser;

import java.util.Arrays;

public enum Studium  // legges under package eksempelklasser
{
    Data ("Ingeniørfag - data"),         // enumkonstanten Data
    IT ("Informasjonsteknologi"),        // enumkonstanten IT
    Anvendt ("Anvendt datateknologi"),   // enumkonstanten Anvendt
    Elektro ("Ingengiørfag - elektronikk og informasjonsteknologi"),
    Enkeltemne ("Enkeltemnestudent");    // enumkonstanten Enkeltemne

    private final String fulltnavn;      // instansvariabel
    private Studium(String fulltnavn) { this.fulltnavn = fulltnavn; }

    public String toString() { return fulltnavn; }
}

