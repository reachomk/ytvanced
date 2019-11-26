package defpackage;

/* renamed from: cnx */
public final class cnx extends coj {
    private final coj d;
    private final coj e;

    protected cnx(coj coj, coj coj2) {
        this.d = coj;
        this.e = coj2;
    }

    public final void a(Object obj) {
        this.d.a(obj);
        this.e.a(obj);
    }

    public final boolean a(coj coj) {
        if (this == coj) {
            return true;
        }
        if (coj != null && coj.getClass() == getClass()) {
            cnx cnx = (cnx) coj;
            return this.d.a(cnx.d) && this.e.a(cnx.e);
        }
    }
}
