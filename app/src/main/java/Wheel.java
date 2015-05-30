/**
 * Created by Bob on 5/15/2015.
 */
public class Wheel {
    private double m_diameterInInches;

    public Wheel(double diameter) {
        m_diameterInInches = diameter;
    }
    public double DistancePerRev() {
        return Math.PI * m_diameterInInches;
    }
}
