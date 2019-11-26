package defpackage;

/* renamed from: qxm */
public enum qxm implements rfd {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);
    
    private final int e;

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static qxm a(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i != 1) {
            return i != 2 ? null : COMPRESSED;
        } else {
            return UNCOMPRESSED;
        }
    }

    private qxm(int i) {
        this.e = i;
    }

    static {
        qxl qxl = new qxl();
    }
}
