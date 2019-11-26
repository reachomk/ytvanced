package defpackage;

/* renamed from: athc */
public enum athc implements anxv {
    INPUT_METHOD_UNKNOWN(0),
    KEYBOARD(1),
    PASTE(2),
    ON_SCREEN_KEYBOARD(3),
    IME(4),
    QUERY_BUILDER(5),
    SPEECH(6),
    HANDWRITING(7),
    TAB(8),
    GESTURE_DECODING_DYM_QUERY_BUILDER(9);
    
    public final int d;

    public final int getNumber() {
        return this.d;
    }

    public static athc a(int i) {
        switch (i) {
            case 0:
                return INPUT_METHOD_UNKNOWN;
            case 1:
                return KEYBOARD;
            case 2:
                return PASTE;
            case 3:
                return ON_SCREEN_KEYBOARD;
            case 4:
                return IME;
            case 5:
                return QUERY_BUILDER;
            case 6:
                return SPEECH;
            case 7:
                return HANDWRITING;
            case 8:
                return TAB;
            case 9:
                return GESTURE_DECODING_DYM_QUERY_BUILDER;
            default:
                return null;
        }
    }

    public static anxx a() {
        return athb.a;
    }

    private athc(int i) {
        this.d = i;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
