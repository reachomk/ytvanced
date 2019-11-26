package defpackage;

/* renamed from: vzs */
public abstract class vzs {
    public Object b;
    public Object c;
    public boolean d;
    public boolean e = false;

    public vzs(Object obj) {
        this.b = obj;
    }

    public abstract void a();

    public abstract void a(Object obj, boolean z);

    public final void a(Object obj) {
        this.e = true;
        this.c = obj;
        a();
        obj = this.b;
        if (obj != null) {
            b(obj, this.d);
        }
    }

    public final void b(Object obj, boolean z) {
        if (this.e) {
            a(obj, z);
        }
        this.b = obj;
        this.d = z;
    }
}
