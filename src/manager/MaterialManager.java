package manager;

import model.CrispyFlour;
import model.Discount;
import model.Material;
import model.Meat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MaterialManager implements Discount {
    List<Material> materialList = new ArrayList<>();

    public void addNewMaterial(Material material) {
        materialList.add(material);
    }

    public void showAllMaterial() {
        for (Material m : materialList) {
            System.out.println(m);
        }
    }

    public double getDifference() {
        double result = 0.0d;
        for (Material m : materialList) {
            result += m.getAmount() - getRealMoney();

        }
        return result;
    }


    @Override
    public double getRealMoney() {
        for (Material m : materialList) {
            if (m instanceof CrispyFlour) {
                if (LocalDate.now().plusMonths(2).isAfter(m.getManufacturingDate())) {
                    return m.getAmount() * 0.6;
                } else if (LocalDate.now().plusMonths(4).isAfter(m.getManufacturingDate())) {
                    return m.getAmount() * 0.8;
                }
            }
            if (m instanceof Meat) {
                if (LocalDate.now().plusDays(3).isAfter(m.getManufacturingDate())) {
                    return m.getAmount() * 0.5;
                } else if (LocalDate.now().plusDays(5).isAfter(m.getManufacturingDate())) {
                    return m.getAmount() * 0.7;
                }
            }
        }

        return -1;
    }

}
