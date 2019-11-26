package defpackage;

/* renamed from: ayza */
public enum ayza implements anxv {
    EFFECT_SUBPACKAGE_ID_UNSPECIFIED(0),
    EFFECT_SUBPACKAGE_ID_EXPRESSIVE(1),
    EFFECT_SUBPACKAGE_ID_PRESET(2);
    
    public final int d;

    public final int getNumber() {
        return this.d;
    }

    public static ayza a(int i) {
        if (i == 0) {
            return EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
        }
        if (i != 1) {
            return i != 2 ? null : EFFECT_SUBPACKAGE_ID_PRESET;
        } else {
            return EFFECT_SUBPACKAGE_ID_EXPRESSIVE;
        }
    }

    public static anxx a() {
        return ayyz.a;
    }

    private ayza(int i) {
        this.d = i;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
