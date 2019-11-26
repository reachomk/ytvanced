package defpackage;

/* renamed from: qyx */
public enum qyx implements rfd {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    private final int f;

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static qyx a(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i != 2) {
            return i != 3 ? null : DESTROYED;
        } else {
            return DISABLED;
        }
    }

    private qyx(int i) {
        this.f = i;
    }

    static {
        qza qza = new qza();
    }
}
