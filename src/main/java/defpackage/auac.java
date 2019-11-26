package defpackage;

/* renamed from: auac */
public enum auac implements anxv {
    LIKE(0),
    DISLIKE(1),
    INDIFFERENT(2);
    
    public static final anxy d = null;
    public final int e;

    public final int getNumber() {
        return this.e;
    }

    public static auac a(int i) {
        if (i == 0) {
            return LIKE;
        }
        if (i != 1) {
            return i != 2 ? null : INDIFFERENT;
        } else {
            return DISLIKE;
        }
    }

    public static anxx a() {
        return auae.a;
    }

    private auac(int i) {
        this.e = i;
    }

    static {
        d = new auab();
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
