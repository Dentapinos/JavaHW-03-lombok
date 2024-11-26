package entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import materials.TableBaseDesign;
import materials.TableColors;
import materials.TableMaterials;

@Builder
@Setter
@Getter
@ToString
public class Order {
    TableBaseDesign design;
    TableColors colorTableTop;
    TableColors colorTableBase;
    TableMaterials materialTableTop;
    TableMaterials materialTableBase;

    int heightTable;
    int widthTableTop;
    int depthTableTop;

    int widthTableBase;
    int depthTableBase;

    boolean usbPanel;
    boolean shelfForSystemUnit;
    String locationShelves;

    boolean cutoutsOnTheSides;
    boolean cutoutFront;
    boolean cutoutRear;

    int quantity;
}
