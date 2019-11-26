package defpackage;

/* renamed from: arhi */
public enum arhi implements anxv {
    EXO_PLAYER_FEATURES_UNSPECIFIED(0),
    EXO_PLAYER_FEATURES_LIBVPX_ZERO_COPY(1),
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

    public static arhi a(int i) {
        if (i != 0) {
            return i != 1 ? null : EXO_PLAYER_FEATURES_LIBVPX_ZERO_COPY;
        } else {
            return EXO_PLAYER_FEATURES_UNSPECIFIED;
        }
    }

    public static anxx a() {
        return arhl.a;
    }

    private arhi(int i) {
        this.d = i;
    }
}
