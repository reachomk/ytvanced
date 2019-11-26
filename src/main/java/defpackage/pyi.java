package defpackage;

/* renamed from: pyi */
public abstract class pyi {
    public Object a;
    public boolean b = false;
    private final /* synthetic */ pyd c;

    public pyi(pyd pyd, Object obj) {
        this.c = pyd;
        this.a = obj;
    }

    public abstract void b();

    public abstract void c();

    public final void d() {
        e();
        synchronized (this.c.E) {
            this.c.E.remove(this);
        }
    }

    public final void e() {
        synchronized (this) {
            this.a = null;
        }
    }
}
