package defpackage;

/* renamed from: bcby */
public enum bcby implements anxv {
    UNKNOWN(0),
    CRONET(1);
    
    public final int b;

    public final int getNumber() {
        return this.b;
    }

    public static bcby a(int i) {
        if (i != 0) {
            return i != 1 ? null : CRONET;
        } else {
            return UNKNOWN;
        }
    }

    public static anxx a() {
        return bcbx.a;
    }

    private bcby(int i) {
        this.b = i;
    }

    public final String toString() {
        return Integer.toString(this.b);
    }
}
