package defpackage;

/* renamed from: qyh */
public enum qyh implements rfd {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    private final int f;

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static qyh a(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i != 3) {
            return i != 4 ? null : SHA512;
        } else {
            return SHA256;
        }
    }

    private qyh(int i) {
        this.f = i;
    }

    static {
        qyk qyk = new qyk();
    }
}
