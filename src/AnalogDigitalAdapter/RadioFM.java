package AnalogDigitalAdapter;

import java.util.Random;

/**
 * Created by RENT on 2017-08-31.
 */
public class RadioFM implements IAnalogSignal {

    private double[] _tablica;
    Random rand = new Random();

    @Override
    public double[] getAnalog() {
        return new double[0];
    }

    @Override
    public void setAnalog(double[] analogData) {

    }

    @Override
    public void printDigit() {

    }
}
