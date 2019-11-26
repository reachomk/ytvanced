package defpackage;

/* renamed from: qyf */
public enum qyf implements rfd {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    
    private final int f;

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static qyf a(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        if (i == 2) {
            return NIST_P256;
        }
        if (i != 3) {
            return i != 4 ? null : NIST_P521;
        } else {
            return NIST_P384;
        }
    }

    private qyf(int i) {
        this.f = i;
    }

    static {
        qyi qyi = new qyi();
    }
}
