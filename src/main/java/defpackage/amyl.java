package defpackage;

/* renamed from: amyl */
public enum amyl {
    STRING('s', amyn.GENERAL, "-#", true),
    BOOLEAN('b', amyn.BOOLEAN, "-", true),
    CHAR('c', amyn.CHARACTER, "-", true),
    DECIMAL('d', amyn.INTEGRAL, "-0+ ,", false),
    OCTAL('o', amyn.INTEGRAL, "-#0", false),
    HEX('x', amyn.INTEGRAL, "-#0", true),
    FLOAT('f', amyn.FLOAT, "-#0+ ,", false),
    EXPONENT('e', amyn.FLOAT, "-#0+ ", true),
    GENERAL('g', amyn.FLOAT, "-0+ ,", true),
    EXPONENT_HEX('a', amyn.FLOAT, "-#0+ ", true);
    
    public static final amyl[] b = null;
    public final char c;
    public final amyn d;
    public final int e;
    public final String f;

    public static int a(char c) {
        return (c | 32) - 97;
    }

    private amyl(char c, amyn amyn, String str, boolean z) {
        this.c = c;
        this.d = amyn;
        this.e = amyo.a(str, z);
        StringBuilder stringBuilder = new StringBuilder(2);
        stringBuilder.append("%");
        stringBuilder.append(c);
        this.f = stringBuilder.toString();
    }

    static {
        b = new amyl[26];
        amyl[] values = amyl.values();
        int length = values.length;
        int i;
        while (i < length) {
            amyl amyl = values[i];
            b[amyl.a(amyl.c)] = amyl;
            i++;
        }
    }
}
