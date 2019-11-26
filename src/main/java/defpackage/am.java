package defpackage;

import java.util.Map.Entry;

/* renamed from: am */
public class am {
    public static final Object b = new Object();
    public final Object a = new Object();
    public int c = 0;
    public volatile Object d;
    public volatile Object e;
    public int f;
    public final Runnable g;
    private final i h = new i();
    private boolean i;
    private boolean j;

    public am() {
        Object obj = b;
        this.d = obj;
        this.e = obj;
        this.f = -1;
        this.g = new al(this);
    }

    /* Access modifiers changed, original: protected */
    public void a(Object obj) {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public void b() {
    }

    /* Access modifiers changed, original: protected */
    public void c() {
    }

    private final void b(an anVar) {
        if (anVar.b) {
            if (anVar.a()) {
                int i = anVar.c;
                int i2 = this.f;
                if (i < i2) {
                    anVar.c = i2;
                    anVar.a.a(this.d);
                }
            } else {
                anVar.a(false);
            }
        }
    }

    public final void a(an anVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (anVar == null) {
                m a = this.h.a();
                while (a.hasNext()) {
                    b((an) ((Entry) a.next()).getValue());
                    if (this.j) {
                        break;
                    }
                }
            }
            b(anVar);
            anVar = null;
            if (!this.j) {
                this.i = false;
                return;
            }
        }
    }

    public final void a(af afVar, ar arVar) {
        if (afVar.y_().a() != z.DESTROYED) {
            ao aoVar = new ao(this, afVar, arVar);
            an anVar = (an) this.h.a(arVar, aoVar);
            if (anVar != null && !anVar.a(afVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (anVar == null) {
                afVar.y_().a(aoVar);
            }
        }
    }

    public void a(ar arVar) {
        am.a("removeObserver");
        an anVar = (an) this.h.b(arVar);
        if (anVar != null) {
            anVar.b();
            anVar.a(false);
        }
    }

    public final Object a() {
        Object obj = this.d;
        return obj == b ? null : obj;
    }

    public static void a(String str) {
        if (!a.a().b()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot invoke ");
            stringBuilder.append(str);
            stringBuilder.append(" on a background thread");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
