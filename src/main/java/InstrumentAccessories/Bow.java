package InstrumentAccessories;

public class Bow<T extends Instrument.Strings.Strings> extends InstrumentAccessories {

    public Bow(String description, double unitCost, double salePrice) {
        super(description, unitCost, salePrice);
    }

}
