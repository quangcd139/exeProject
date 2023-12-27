
package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString

public class Character extends Base{
    private String name;
    private String image_url;

}


