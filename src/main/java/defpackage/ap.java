package defpackage;

/* renamed from: ap */
public class ap extends am {
    public final void b(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.a) {
            obj2 = this.e;
            obj3 = am.b;
            this.e = obj;
        }
        if (obj2 == obj3) {
            a.a().b(this.g);
        }
    }

    public final void a(Object obj) {
        am.a("setValue");
        this.f++;
        this.d = obj;
        a(null);
    }
}
