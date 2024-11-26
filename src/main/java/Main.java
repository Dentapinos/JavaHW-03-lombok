
import entity.Order;
import factory.Factory;
import factory.FactoryImpl;
import materials.TableBaseDesign;
import materials.TableColors;
import materials.TableMaterials;

public class Main {
    static Order order;

    public static void main(String[] args) {
        Order order;
        System.out.println("Стол заказов");
        order = Order.builder()
                .widthTableTop(1000)
                .depthTableTop(700)
                .colorTableTop(TableColors.MUAR)
                .materialTableTop(TableMaterials.WOOD)
                .cutoutsOnTheSides(true)
                .cutoutRear(true)
                .cutoutFront(true)
                .widthTableBase(800)
                .depthTableBase(300)
                .materialTableBase(TableMaterials.METAL)
                .design(TableBaseDesign.DESIGN_MEDIUM)
                .colorTableBase(TableColors.MUAR)
                .quantity(10)
                .usbPanel(true)
                .shelfForSystemUnit(true)
                .locationShelves("справа")
                .quantity(10)
                .build();

        Factory factory = new FactoryImpl(order);
        factory.createTableTop();
        factory.createTableBase();
        factory.createTable();
        System.out.println(order);
    }
}
