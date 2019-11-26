package defpackage;

/* renamed from: ubg */
public final class ubg extends ubb {
    protected ubg(int i) {
        super(i);
    }

    public final int a(ubl ubl, int i) {
        return 0;
    }

    public final String b(ubl ubl, int i) {
        return "";
    }

    public final String c(ubl ubl, int i) {
        return "";
    }

    public final int c(ubl ubl) {
        return ubl.a.get((this.k + ubl.b) + 8);
    }

    public final int a(ubl ubl) {
        return ubl.a.getInt((this.k + ubl.b) + 4);
    }

    public final int b(ubl ubl) {
        return ubl.b(c(ubl)) * a(ubl);
    }
}
