package entity;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class TableImpl implements Table{
    TableTop tableTop;
    TableBase tableBase;
    boolean usbPanel;
    boolean shelfForSystemUnit;
    String locationShelves;

    @Override
    public void additionalEquipment() {
        System.out.println("USB панель: " + (usbPanel?"есть":"нет") );
        System.out.println("Полка под системный блок: " + (shelfForSystemUnit?"есть":"нет") );
        if (shelfForSystemUnit) {
            System.out.println("Расположение полки под системный блок с");
        }
    }
}
