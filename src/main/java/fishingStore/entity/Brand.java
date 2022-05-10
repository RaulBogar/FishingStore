package fishingStore.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Set;

import javax.persistence.*;

@Entity
@Setter
@Getter
@ToString
public class Brand {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 30,unique = true)
    private String name;

    @Column(nullable = false,length = 1)
    private Integer quality;

    @ToString.Exclude
    @JsonIgnore
    @ManyToMany(mappedBy = "brands")
    private Set<Rod> rods;

    @ToString.Exclude
    @JsonIgnore
    @ManyToMany(mappedBy = "brands")
    private Set<Reel> reels;

    @ToString.Exclude
    @JsonIgnore
    @ManyToMany(mappedBy = "brands")
    private Set<Line> lines;
}
