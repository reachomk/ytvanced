package defpackage;

/* renamed from: babe */
public enum babe implements anxv {
    COMMENT_STYLE_UNSPECIFIED(0),
    COMMENT_NORMAL(1),
    COMMENT_LIGHT(2);
    
    public final int d;

    public final int getNumber() {
        return this.d;
    }

    public static babe a(int i) {
        if (i == 0) {
            return COMMENT_STYLE_UNSPECIFIED;
        }
        if (i != 1) {
            return i != 2 ? null : COMMENT_LIGHT;
        } else {
            return COMMENT_NORMAL;
        }
    }

    public static anxx a() {
        return babh.a;
    }

    private babe(int i) {
        this.d = i;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
