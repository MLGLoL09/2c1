/**
 * Das Programm soll vektorprodukte ausgeben
 * @author Sebastian Weigl
 * @version 06-01-2024
 */

public class VektorMathe {
    /**
     * das vektorprodukt 2d wird ausgerechenet mit dezimalzahlen
     * @param a uebernimmt einen dezimalwert
     * @param b uebernimmt einen dezimalwert
     * @param c uebernimmt einen dezimalwert
     * @param d uebernimmt einen dezimalwert
     * @return gibt das vektorprodukt zurueck
     */
    public static double inneres(double a, double b, double c, double d) {
        return a*c+b*d;
    }

    /**
     * das vektorprodukt 2d wird ausgerechenet mit ganzen Zahlen
     * @param a uebernimmt eine ganze Zahl
     * @param b uebernimmt eine ganze Zahl
     * @param c uebernimmt eine ganze Zahl
     * @param d uebernimmt eine ganze Zahl
     * @return gibt das vektorprodukt zurueck
     */
    public static int inneres(int a, int b, int c, int d) {
        return a*c+b*d;
    }

    /**
     * das vektorprodukt 2d wird ausgerechenet mit dezimalzahlen
     * @param a uebernimmt einen dezimalwert
     * @param b uebernimmt einen dezimalwert
     * @param c uebernimmt einen dezimalwert
     * @param d uebernimmt einen dezimalwert
     * @param e uebernimmt einen dezimalwert
     * @param f uebernimmt einen dezimalwert
     * @return gibt das vektorprodukt zurueck
     */
    public static double inneres(double a, double b, double c, double d, double e, double f) {
        return a*d+b*e+c*f;
    }

    /**
     * das vektorprodukt 3d wird ausgerechenet mit ganzen Zahlen
     * @param a uebernimmt eine ganze Zahl
     * @param b uebernimmt eine ganze Zahl
     * @param c uebernimmt eine ganze Zahl
     * @param d uebernimmt eine ganze Zahl
     * @param e uebernimmt eine ganze Zahl
     * @param f uebernimmt eine ganze Zahl
     * @return gibt das vektorprodukt zurueck
     */
    public static int inneres(int a, int b, int c, int d, int e,int f) {
        return a*d+b*e+c*f;
    }
}
