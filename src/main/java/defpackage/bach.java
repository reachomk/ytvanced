package defpackage;

/* renamed from: bach */
public enum bach implements anxv {
    LOCATION_STYLE_UNSPECIFIED(0),
    LOCATION_NORMAL(1),
    LOCATION_LIGHT(2);
    
    public final int d;

    public final int getNumber() {
        return this.d;
    }

    public static bach a(int i) {
        if (i == 0) {
            return LOCATION_STYLE_UNSPECIFIED;
        }
        if (i != 1) {
            return i != 2 ? null : LOCATION_LIGHT;
        } else {
            return LOCATION_NORMAL;
        }
    }

    public static anxx a() {
        return bacg.a;
    }

    private bach(int i) {
        this.d = i;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
