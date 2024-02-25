package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Buff {
    private int id;
    private int id_char;
    private float atk_per;
    private float def_per;
    private float hp_per;
    private float atk;
    private float spd;
    private float spd_per;
    private float nrg;
    private float cd_per;



}
