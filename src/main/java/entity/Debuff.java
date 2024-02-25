package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Debuff {
    private int id;
    private int id_char;
    private float def_per_desc;
    private float ele_res_desc;
    private float dam_desc;

}
