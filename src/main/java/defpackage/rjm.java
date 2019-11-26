package defpackage;

/* renamed from: rjm */
public enum rjm implements rfd {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);
    
    public final int b;

    public final int a() {
        return this.b;
    }

    public static rjm a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i != 3) {
            return i != 4 ? null : NEVER;
        } else {
            return FAST_IF_RADIO_AWAKE;
        }
    }

    private rjm(int i) {
        this.b = i;
    }

    static {
        rjp rjp = new rjp();
    }
}
