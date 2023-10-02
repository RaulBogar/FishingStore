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
@ToString
public class Rod {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Double length;

    @Column(nullable = false, length = 3)
    private Integer weight;

    @Column(nullable = false, length = 2)
    private Integer maxDrag;

    @ManyToMany(cascade = {CascadeType.ALL})
    private Set<Brand> brands;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = FishingMethod.class)
    private Set<FishingMethod> fishingMethods;



}
