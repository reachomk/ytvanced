package defpackage;

/* renamed from: rck */
public final class rck extends rhf {
    public rck(qui qui, String str, String str2, qpa qpa, int i) {
        super(qui, str, str2, qpa, i, 3);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        synchronized (this.b) {
            qtm qtm = new qtm((String) this.c.invoke(null, new Object[]{this.a.a}));
            synchronized (this.b) {
                this.b.c = Long.valueOf(qtm.a);
                this.b.N = Long.valueOf(qtm.b);
            }
        }
    }
}
