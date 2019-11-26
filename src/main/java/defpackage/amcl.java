package defpackage;

/* renamed from: amcl */
public final class amcl {
    public static final amcl a = new amcl();
    public final boolean b;
    public final int c;

    private amcl(boolean z, int i) {
        this.b = z;
        this.c = i;
    }

    private amcl() {
        this(true, 0);
    }

    private amcl(int i) {
        this(false, i);
    }

    public static amcl a(int i) {
        return new amcl(i);
    }
}
