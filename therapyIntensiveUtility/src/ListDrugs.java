import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDrugs implements IListDrugs {

    public static void main(String[] args) {
        System.out.println(list());
        System.out.println(selectDrugs(drugs));
    }

    public static List<String> list() {

        drugs.add("\n1.ACETILCISTEINA");
        drugs.add("\n2.ACIDO TRANEXAMICO");
        drugs.add("\n3.ADRENALINA");
        drugs.add("\n4.AMIODARONE CLORIDRATO");
        drugs.add("\n5.ATRACURIUM");
        drugs.add("\n6.CALCIO CLORURO");
        drugs.add("\n7.CALCIO GLUCONATO");
        drugs.add("\n8.DICLOFENAC");

        return drugs;
    }// end main method

    //elcono -  el il nome della lista da inserire per poter selezionare i dati interesati
    public static List<String> selectDrugs(List<String> elenco) {

        List<String> elencoFarmaciDaSommninistrare = new ArrayList<>();
        String output = "";
        int userInput = 0;
        int selezionaFarmaci = 0;

        output += "Seleziona farmaca dal elenco: " + elenco;

        do {
            String out = "";
            if (userInput == 0) {
                 elencoFarmaciDaSommninistrare.clear();

                 do{

                    selezionaFarmaci = Integer.parseInt(JOptionPane.showInputDialog(output));
                    //  System.out.println(selezionaFarmaci);
                    if (selezionaFarmaci == -1)
                        continue;

                    elencoFarmaciDaSommninistrare.add(elenco.get(selezionaFarmaci - 1));
                }while (selezionaFarmaci != -1);// end while (selezionaFarmaci != -1)

                out = "Farmaci selezionati sono corretti? si = 1 /no = 0" + elencoFarmaciDaSommninistrare;
                userInput = Integer.parseInt(JOptionPane.showInputDialog(out));
            }// end if (userInput == 0)

        } while (userInput != 1);// end while(userInput == 0)


        return elencoFarmaciDaSommninistrare;
    }// end selectDrugs() method

    public static List<String> controlloCompatibilita(){
// conectio of the database ????
        return null;
    }// end controlloCompatibilita() method


}// end class ListDrugs
