package defpackage;

/* renamed from: awqe */
public enum awqe implements anxv {
    PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN(0),
    PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_NOOP(1),
    PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_OPEN_AD(3);
    
    private final int d;

    public final int getNumber() {
        return this.d;
    }

    public static awqe a(int i) {
        if (i == 0) {
            return PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        }
        if (i != 1) {
            return i != 3 ? null : PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_OPEN_AD;
        } else {
            return PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_NOOP;
        }
    }

    public static anxx a() {
        return awqh.a;
    }

    private awqe(int i) {
        this.d = i;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
