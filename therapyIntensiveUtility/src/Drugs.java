import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Drugs extends  ListDrugs implements IListDrugs{

   static List<String> ELENCO_FARAMACI = new ArrayList<>();
   static List<String> listaFarmaciDaSomministrare = new ArrayList<>();
   static int numeroLumiDispositivo;

   public static void main(String[] args) {
      String out = "";

      ELENCO_FARAMACI = list();
      JOptionPane.showMessageDialog(null,ELENCO_FARAMACI);

      listaFarmaciDaSomministrare =  selectDrugs(ELENCO_FARAMACI);
      numeroLumiDispositivo = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of the lumen"));

      out += "Elenco dei farmaci da somministrare: " + listaFarmaciDaSomministrare;
      out += "\nNumero di limi in uso: " + numeroLumiDispositivo;
      JOptionPane.showMessageDialog(null, out);

      out = "Comaptibilità: " + controlloCompatibilita();
      JOptionPane.showMessageDialog(null,out);





   }// end mai method


}// end interface ListDrugs
