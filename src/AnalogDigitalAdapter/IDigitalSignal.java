package AnalogDigitalAdapter;

/**
 * Created by RENT on 2017-08-31.
 */
public interface IDigitalSignal {
    byte[] getDigit();
    void setDigit(byte[] digitData);
    void printDigit();
}
