package drugs.infoDrugs;

import java.util.List;

public class InfoDrugs extends Drugs {
    private List<Drugs> drugsList;


    void addInfoDrugs( ) {
        for (Drugs nameElement : drugsList){
            drugsList.add(nameElement);
        }
    }
}
