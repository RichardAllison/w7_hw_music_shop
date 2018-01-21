package InstrumentAccessories;

import Instrument.Strings.Violin;

public class InstrumentCase<T extends Instrument.Instrument > extends InstrumentAccessory {

    private T instrument;

    public InstrumentCase(String description, double unitCost, double salePrice) {
        super(description, unitCost, salePrice);
    }

    public void addInstrument(T instrument) {
        this.instrument = instrument;
    }

    public T getInstrument() {
        return this.instrument;
    }
}
