package Day42;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    ArrayList<Tester> testersList = new ArrayList<>();
    ArrayList<Developer> developersList = new ArrayList<>();
    String PO;
    String BA;
    String SM;

    public void setInfo(String PO, String BA, String SM){
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }



    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTesters(Tester[] testers){
        if (testers.length == 0) {
            return;
        }
        this.testersList.addAll(Arrays.asList(testers));
    }

    public void removeTester(long employeeID){
        testersList.removeIf(p -> p.employeeID == employeeID);
    }



    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }

    public void addDeveloper(Developer[] developers){
        if (developers.length == 0) {
            return;
        }
        this.developersList.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(long employeeID){
        developersList.removeIf(p -> p.employeeID == employeeID);
    }



    public String toString(){
        return testersList.size() + " testers, " + developersList.size() + " developes, PO: " + PO+ ", BA: " + BA + ", scrum master " + SM;
    }

}
