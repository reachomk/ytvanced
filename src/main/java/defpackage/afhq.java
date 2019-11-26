package defpackage;

/* renamed from: afhq */
public final class afhq {
    public static double a(double d) {
        double d2 = (((((((((((4.30638E-5d * d) + 2.765672E-4d) * d) + 1.520143E-4d) * d) + 0.0092705272d) * d) + 0.0422820123d) * d) + 0.0705230784d) * d) + 1.0d;
        d2 *= d2;
        d2 *= d2;
        d2 *= d2;
        return 1.0d - (1.0d / (d2 * d2));
    }

    public static double b(double d) {
        double d2;
        double d3 = -Math.log1p((-d) * d);
        if (d3 >= 5.0d) {
            d3 = Math.sqrt(d3) - 1.5d;
            d2 = ((((((((((((((-2.00214257E-4d * d3) + 1.00950558E-4d) * d3) + 0.00134934322d) * d3) - 1146.06555004928d) * d3) + 0.00573950773d) * d3) - 536.9087524864d) * d3) + 0.00943887047d) * d3) + 1.00167406d) * d3;
            d3 = 2.83297682d;
        } else {
            d3 -= 1.75d;
            d2 = ((((((((((((((2.81022636E-8d * d3) + 3.43273939E-7d) * d3) - 1208725.1273435317d) * d3) - 969299.9369769563d) * d3) + 2.1858087E-4d) * d3) - 3514.74804588544d) * d3) - 988.42291208192d) * d3) + 0.246640727d) * d3;
            d3 = 1.50140941d;
        }
        return (d2 + d3) * d;
    }
}
