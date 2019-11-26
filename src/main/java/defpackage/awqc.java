package defpackage;

/* renamed from: awqc */
public enum awqc implements anxv {
    PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN(0),
    PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_NOOP(1),
    PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_TOGGLE_STATE(2),
    PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_OPEN_AD(3);
    
    private final int e;

    public final int getNumber() {
        return this.e;
    }

    public static awqc a(int i) {
        if (i == 0) {
            return PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_NOOP;
        }
        if (i != 2) {
            return i != 3 ? null : PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_OPEN_AD;
        } else {
            return PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_TOGGLE_STATE;
        }
    }

    public static anxx a() {
        return awqf.a;
    }

    private awqc(int i) {
        this.e = i;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
