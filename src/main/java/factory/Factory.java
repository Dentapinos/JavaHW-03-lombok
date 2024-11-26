package factory;

import entity.Table;
import entity.TableBase;
import entity.TableTop;

public interface Factory {
    TableTop createTableTop();
    TableBase createTableBase();
    Table createTable();
}
