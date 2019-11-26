package defpackage;

/* renamed from: bczy */
final class bczy extends bcum implements bcvl {
    private final bcum a;
    private final bcue b;
    private Object c;
    private Throwable d;

    public bczy(bcum bcum, bcue bcue) {
        this.a = bcum;
        this.b = bcue;
    }

    public final void a(Object obj) {
        this.c = obj;
        this.b.a(this);
    }

    public final void a(Throwable th) {
        this.d = th;
        this.b.a(this);
    }

    public final void a() {
        try {
            Throwable th = this.d;
            if (th != null) {
                this.d = null;
                this.a.a(th);
            } else {
                Object obj = this.c;
                this.c = null;
                this.a.a(obj);
            }
            this.b.b();
        } catch (Throwable th2) {
            this.b.b();
        }
    }
}
