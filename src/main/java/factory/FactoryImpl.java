package factory;

import entity.Order;
import entity.TableBase;
import entity.TableImpl;
import entity.TableTop;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FactoryImpl implements Factory {

    private final Order order;

    @Override
    public TableTop createTableTop() {
        TableTop tableTop = TableTop.builder()
                .width(order.getWidthTableTop())
                .depth(order.getDepthTableTop())
                .color(order.getColorTableTop())
                .materials(order.getMaterialTableTop())
                .cutoutsOnTheSides(order.isCutoutsOnTheSides())
                .cutoutFront(order.isCutoutFront())
                .cutoutRear(order.isCutoutRear())
                .build();
        System.out.println("Изготовлено "+ order.getQuantity() + " столешниц");
        return tableTop;
    }

    @Override
    public TableBase createTableBase() {
        TableBase tableBase = TableBase.builder()
                .material(order.getMaterialTableBase())
                .design(order.getDesign())
                .color(order.getColorTableBase())
                .height(order.getHeightTable())
                .build();
        System.out.println("Изготовлено "+ order.getQuantity() + " оснований стола");
        return tableBase;
    }

    @Override
    public TableImpl createTable() {
        TableImpl table = TableImpl.builder()
                .tableTop(createTableTop())
                .tableBase(createTableBase())
                .usbPanel(order.isUsbPanel())
                .shelfForSystemUnit(order.isShelfForSystemUnit())
                .locationShelves(order.getLocationShelves())
                .build();
        System.out.println("Изготовлено "+ order.getQuantity() + " столов");
        return table;
    }
}
