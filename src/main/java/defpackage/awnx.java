package defpackage;

/* renamed from: awnx */
public enum awnx implements anxv {
    PRIVATE(0),
    PUBLIC(1),
    UNLISTED(2),
    REVOCABLE_UNLISTED(3);
    
    public final int d;

    public final int getNumber() {
        return this.d;
    }

    public static awnx a(int i) {
        if (i == 0) {
            return PRIVATE;
        }
        if (i == 1) {
            return PUBLIC;
        }
        if (i != 2) {
            return i != 3 ? null : REVOCABLE_UNLISTED;
        } else {
            return UNLISTED;
        }
    }

    public static anxx a() {
        return awoa.a;
    }

    private awnx(int i) {
        this.d = i;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
