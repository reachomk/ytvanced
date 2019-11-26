package defpackage;

/* renamed from: azdn */
public enum azdn implements anxv {
    UNKNOWN(0),
    WIFI(1),
    CELLULAR(2);
    
    private final int d;

    public final int getNumber() {
        return this.d;
    }

    public static azdn a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return i != 2 ? null : CELLULAR;
        } else {
            return WIFI;
        }
    }

    public static anxx a() {
        return azdq.a;
    }

    private azdn(int i) {
        this.d = i;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
