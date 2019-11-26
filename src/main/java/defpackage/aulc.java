package defpackage;

/* renamed from: aulc */
public enum aulc implements anxv {
    UNKNOWN(0),
    USER_AUTH(1),
    VISITOR_ID(2),
    PLUS_PAGE_ID(3);
    
    public final int e;

    public final int getNumber() {
        return this.e;
    }

    public static aulc a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return USER_AUTH;
        }
        if (i != 2) {
            return i != 3 ? null : PLUS_PAGE_ID;
        } else {
            return VISITOR_ID;
        }
    }

    public static anxx a() {
        return aulf.a;
    }

    private aulc(int i) {
        this.e = i;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
