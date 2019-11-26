package defpackage;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: oxs */
public final class oxs implements Comparator, oxd {
    private final long a;
    private final TreeSet b = new TreeSet(this);
    private long c;

    public oxs(long j) {
        this.a = j;
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
    }

    public final void a(oww oww, long j) {
        if (j != -1) {
            b(oww, j);
        }
    }

    public final void a(oww oww, oxf oxf) {
        this.b.add(oxf);
        this.c += oxf.c;
        b(oww, 0);
    }

    public final void a(oxf oxf) {
        this.b.remove(oxf);
        this.c -= oxf.c;
    }

    public final void a(oww oww, oxf oxf, oxf oxf2) {
        a(oxf);
        a(oww, oxf2);
    }

    private final void b(oww oww, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            try {
                oww.b((oxf) this.b.first());
            } catch (owv unused) {
            }
        }
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int a;
        oxf oxf = (oxf) obj;
        oxf oxf2 = (oxf) obj2;
        long j = oxf.f;
        long j2 = oxf2.f;
        if (j - j2 == 0) {
            a = oxf.compareTo(oxf2);
        } else if (j < j2) {
            return -1;
        } else {
            a = 1;
        }
        return a;
    }
}
