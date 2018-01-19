package InstrumentAccessories;

public class Case<T extends Instrument.Instrument > {

    T forInstrument;

    public Case(T instrument) {
        this.forInstrument = instrument;
    }

}
