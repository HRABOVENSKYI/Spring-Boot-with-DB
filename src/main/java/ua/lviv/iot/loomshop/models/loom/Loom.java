package ua.lviv.iot.loomshop.models.loom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "looms")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected Country originCountry;
    protected double price;
    protected double powerInWatts;
    protected int widthOfTheFormedTissue;
    protected String materialOfTheProducedFabric;

    // Copy constructor
    public Loom(Loom loom) {
        this.id = loom.getId();
        this.originCountry = loom.getOriginCountry();
        this.price = loom.getPrice();
        this.powerInWatts = loom.getPowerInWatts();
        this.widthOfTheFormedTissue = loom.getWidthOfTheFormedTissue();
        this.materialOfTheProducedFabric = loom.getMaterialOfTheProducedFabric();
    }
}
