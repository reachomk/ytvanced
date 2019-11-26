package defpackage;

/* renamed from: rab */
public enum rab implements rfd {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    private final int g;

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static rab a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i != 3) {
            return i != 4 ? null : CRUNCHY;
        } else {
            return RAW;
        }
    }

    private rab(int i) {
        this.g = i;
    }

    static {
        rae rae = new rae();
    }
}
