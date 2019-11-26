package defpackage;

/* renamed from: annf */
final class annf {
    public final anmo a;
    public final ryl b = new ryl();
    public final /* synthetic */ annc c;

    public annf(annc annc, anmo anmo) {
        this.c = annc;
        this.a = anmo;
    }

    public final void a() {
        synchronized (this.c.b) {
            pzr.a(this.c.c == 0);
            this.c.c = 1;
        }
        this.c.a.b(new annh(this)).a(this.c, new anne(this));
    }
}
