package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    private int id;
    private int id_char;
    private float normal_dame;
    private float e_dame;
    private float q_dame;

}
