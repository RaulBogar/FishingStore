package fishingStore.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;
@Getter
@Setter
@Entity
public class Line {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,length = 4)
    private Double thickness;

    @Column(nullable = false)
    private String material;

    @Column(nullable = false,length = 2)
    private Integer maxDrag;

    @ManyToMany(cascade = {CascadeType.ALL})
    private Set<Brand> brands;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = FishingMethod.class)
    private Set<FishingMethod> fishingMethods;




}
