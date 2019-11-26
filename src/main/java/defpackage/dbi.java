package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: dbi */
final class dbi implements Iterator {
    private final boolean a;
    private final List b;
    private int c;
    private int d;

    dbi(List list, int i, int i2, boolean z) {
        this.b = list;
        this.c = z ? i - 1 : i + 1;
        this.d = i2;
        this.a = z;
    }

    public final void remove() {
    }

    public final boolean hasNext() {
        while (this.d > 0) {
            int i = this.c;
            if (i < 0 || i >= this.b.size()) {
                break;
            }
            cyl cyl = (cyl) this.b.get(this.c);
            if (cyl.e().c() && !cyl.f()) {
                return true;
            }
            b();
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized cyl next() {
        if (!hasNext()) {
            return null;
        }
        cyl cyl = (cyl) this.b.get(this.c);
        b();
        this.d--;
        return cyl;
    }

    private final void b() {
        if (this.a) {
            this.c--;
        } else {
            this.c++;
        }
    }
}
