package entity;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.NonFinal;
import materials.TableColors;
import materials.TableMaterials;

@Builder
@Value
public class TableTop {
    int width;
    int depth;
    TableColors color;
    TableMaterials materials;
    @NonFinal
    boolean cutoutsOnTheSides;
    @NonFinal
    boolean cutoutFront;
    @NonFinal
    boolean cutoutRear;
}
