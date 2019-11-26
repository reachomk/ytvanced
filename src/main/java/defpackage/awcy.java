package defpackage;

/* renamed from: awcy */
public enum awcy implements anxv {
    UNKNOWN(0),
    OFF(1),
    ON(2),
    FORCED_ON(3);
    
    private final int e;

    public final int getNumber() {
        return this.e;
    }

    public static awcy a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return OFF;
        }
        if (i != 2) {
            return i != 3 ? null : FORCED_ON;
        } else {
            return ON;
        }
    }

    public static anxx a() {
        return awcx.a;
    }

    private awcy(int i) {
        this.e = i;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
