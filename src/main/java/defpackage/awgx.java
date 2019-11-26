package defpackage;

/* renamed from: awgx */
public enum awgx implements anxv {
    UNKNOWN(0),
    STANDARD(1),
    FULLSCREEN(2),
    MINI(3),
    BACKGROUND(4);
    
    private final int f;

    public final int getNumber() {
        return this.f;
    }

    public static awgx a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STANDARD;
        }
        if (i == 2) {
            return FULLSCREEN;
        }
        if (i != 3) {
            return i != 4 ? null : BACKGROUND;
        } else {
            return MINI;
        }
    }

    public static anxx a() {
        return awgw.a;
    }

    private awgx(int i) {
        this.f = i;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
