import manager.MaterialManager;
import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MaterialManager materialManager = new MaterialManager();
        //tao 5 doi tuong thit
        Material meat1 = new Meat("1","sp1", LocalDate.now().plusDays(5),1000,5);
        Material meat2 = new Meat("2","sp2", LocalDate.now().plusDays(1),1000,5);
        Material meat3 = new Meat("3","sp3", LocalDate.now().plusDays(3),1000,5);
        Material meat4 = new Meat("4","sp4", LocalDate.now().plusDays(2),1000,5);
        Material meat5 = new Meat("5","sp5", LocalDate.now().plusDays(4),1000,5);
        materialManager.addNewMaterial(meat1);
        materialManager.addNewMaterial(meat2);
        materialManager.addNewMaterial(meat3);
        materialManager.addNewMaterial(meat4);
        materialManager.addNewMaterial(meat5);
        //tao 5 doi tuong bot
        Material crispy1 = new CrispyFlour("6","sp6",LocalDate.now().plusMonths(1),2000,10);
        Material crispy2 = new CrispyFlour("7","sp7",LocalDate.now().plusMonths(2),2000,10);
        Material crispy3 = new CrispyFlour("8","sp8",LocalDate.now().plusMonths(4),2000,10);
        Material crispy4 = new CrispyFlour("9","sp9",LocalDate.now().plusMonths(3),2000,10);
        Material crispy5 = new CrispyFlour("10","sp10",LocalDate.now().plusMonths(4),2000,10);
        materialManager.addNewMaterial(crispy1);
        materialManager.addNewMaterial(crispy2);
        materialManager.addNewMaterial(crispy3);
        materialManager.addNewMaterial(crispy4);
        materialManager.addNewMaterial(crispy5);
        //check chiet khau
        double result = materialManager.getRealMoney();
        System.out.println(result);
        //check chenh lech
        double differ = materialManager.getDifference();
        System.out.println(differ);

    }
}
