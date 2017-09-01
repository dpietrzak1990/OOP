package AnalogDigitalAdapter;

import java.util.Random;

/**
 * Created by RENT on 2017-08-31.
 */
public class RadioFM implements IAnalogSignal {

    private double[] _analogSignal;
    Random rand = new Random();



    @Override
    public double[] getAnalog() {
        return _analogSignal;
    }

    @Override
    public void setAnalog(double[] _analogData) {
        _analogSignal = _analogData;

    }

    @Override
    public void printDigit() {

    }
}
