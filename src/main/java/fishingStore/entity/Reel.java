package fishingStore.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@Entity
public class Reel {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 3)
    private Integer spoolCapacity;

    @Column(nullable = false, length = 3)
    private Integer weight;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private Set<Brand> brands;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = FishingMethod.class)
    private Set<FishingMethod> fishingMethods;


}
