package defpackage;

/* renamed from: aode */
public enum aode implements anxv {
    ATTRIBUTE_UNKNOWN(0),
    ATTRIBUTE_ACCOUNT_CREATION_HAS_PHONE(1),
    UNRECOGNIZED(-1);
    
    private final int d;

    public final String toString() {
        return Integer.toString(getNumber());
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static aode a(int i) {
        if (i != 0) {
            return i != 1 ? null : ATTRIBUTE_ACCOUNT_CREATION_HAS_PHONE;
        } else {
            return ATTRIBUTE_UNKNOWN;
        }
    }

    public static anxx a() {
        return aodd.a;
    }

    private aode(int i) {
        this.d = i;
    }
}
