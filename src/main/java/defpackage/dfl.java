package defpackage;

@Deprecated
/* renamed from: dfl */
public final class dfl {
    public static final dfl b = new dfl(-1, -2);
    public static final dfl c = new dfl(320, 50);
    public static final dfl d = new dfl(300, 250);
    public static final dfl e = new dfl(468, 60);
    public static final dfl f = new dfl(728, 90);
    public static final dfl g = new dfl(160, 600);
    public final pbi a;

    public dfl(pbi pbi) {
        this.a = pbi;
    }

    private dfl(int i, int i2) {
        this(new pbi(i, i2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dfl)) {
            return false;
        }
        return this.a.equals(((dfl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.d;
    }
}
