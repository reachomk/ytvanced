package defpackage;

import java.util.Iterator;

/* renamed from: aknb */
public abstract class aknb implements aknh {
    private final akmy a = new akmy();
    public final aknj c = new aknj();

    protected aknb() {
    }

    public void a(akoq akoq) {
        this.a.a(akoq);
    }

    public void a(akor akor, int i) {
        this.a.a(akor, this, i);
    }

    public final void b(akng akng) {
        this.c.a((xbz) akng);
    }

    public final void a(akng akng) {
        this.c.b(akng);
    }

    public final void b() {
        this.c.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(int i) {
        xak.a();
        a(i, 1);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, int i2) {
        xak.a();
        this.c.a(i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(int i, int i2) {
        xak.a();
        this.c.b(i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(int i, int i2) {
        xak.a();
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            ((xbz) it.next()).f_(i, i2);
        }
    }

    public final void d(int i, int i2) {
        xak.a();
        this.c.c(i, i2);
    }
}
