package defpackage;

/* renamed from: ixw */
final class ixw implements bbio {
    public final /* synthetic */ ixp a;

    ixw(ixp ixp) {
        this.a = ixp;
    }

    public final void a(Throwable th) {
        this.a.c.post(new iya(this, th));
    }

    public final void a() {
        this.a.c.post(new iyd(this));
    }
}
