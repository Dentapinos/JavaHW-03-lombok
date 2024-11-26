package entity;

import lombok.Builder;
import lombok.Value;
import materials.TableBaseDesign;
import materials.TableColors;
import materials.TableMaterials;

@Builder
@Value
public class TableBase {
    TableMaterials material;
    TableBaseDesign design;
    TableColors color;
    int width;
    int depth;
    int height;
}
