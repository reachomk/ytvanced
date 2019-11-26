package defpackage;

import java.util.Iterator;

/* renamed from: bbqw */
abstract class bbqw extends bbyo {
    public static final long serialVersionUID = -2252972430506210021L;
    public Iterator a;
    public volatile boolean b;
    private boolean c;

    bbqw(Iterator it) {
        this.a = it;
    }

    public final int a(int i) {
        return 1;
    }

    public abstract void a(long j);

    public abstract void c();

    public final Object bI_() {
        Iterator it = this.a;
        if (it == null) {
            return null;
        }
        if (!this.c) {
            this.c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        return bbow.a(this.a.next(), "Iterator.next() returned a null value");
    }

    public final boolean b() {
        Iterator it = this.a;
        return it == null || !it.hasNext();
    }

    public final void e() {
        this.a = null;
    }

    public final void b(long j) {
        if (!bbyq.a(j) || bbyu.a(this, j) != 0) {
            return;
        }
        if (j != Long.MAX_VALUE) {
            a(j);
        } else {
            c();
        }
    }

    public final void d() {
        this.b = true;
    }
}
