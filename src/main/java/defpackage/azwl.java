package defpackage;

/* renamed from: azwl */
public enum azwl implements anxv {
    TRANSITION_VALUE_TYPE_NONE(0),
    TRANSITION_VALUE_TYPE_X_Y(1),
    TRANSITION_VALUE_TYPE_WIDTH_HEIGHT(2),
    TRANSITION_VALUE_TYPE_SCALE(3),
    TRANSITION_VALUE_TYPE_ALPHA(4),
    TRANSITION_VALUE_TYPE_ROTATION(5);
    
    private final int g;

    public final int getNumber() {
        return this.g;
    }

    public static azwl a(int i) {
        if (i == 0) {
            return TRANSITION_VALUE_TYPE_NONE;
        }
        if (i == 1) {
            return TRANSITION_VALUE_TYPE_X_Y;
        }
        if (i == 2) {
            return TRANSITION_VALUE_TYPE_WIDTH_HEIGHT;
        }
        if (i == 3) {
            return TRANSITION_VALUE_TYPE_SCALE;
        }
        if (i != 4) {
            return i != 5 ? null : TRANSITION_VALUE_TYPE_ROTATION;
        } else {
            return TRANSITION_VALUE_TYPE_ALPHA;
        }
    }

    public static anxx a() {
        return azwk.a;
    }

    private azwl(int i) {
        this.g = i;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
