package TestLearn.RuntimePoly;

import java.util.Objects;

public class ICICI extends Bank{
    int rateOfInterest=8;

    public int getRateOfInterest() {
        return rateOfInterest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ICICI icici = (ICICI) o;
        return rateOfInterest == icici.rateOfInterest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rateOfInterest);
    }
}
