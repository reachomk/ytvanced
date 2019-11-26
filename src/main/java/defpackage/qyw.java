package defpackage;

/* renamed from: qyw */
public enum qyw implements rfd {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    private final int g;

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static qyw a(int i) {
        if (i == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i == 1) {
            return SYMMETRIC;
        }
        if (i == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i != 3) {
            return i != 4 ? null : REMOTE;
        } else {
            return ASYMMETRIC_PUBLIC;
        }
    }

    private qyw(int i) {
        this.g = i;
    }

    static {
        qyy qyy = new qyy();
    }
}
