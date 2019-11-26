package defpackage;

import java.io.File;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: aevk */
public final class aevk implements Comparator, oxd {
    private final TreeSet a;
    private final amro b;
    private final long c;
    private final long d;
    private final float e;
    private final long f;
    private final long g;
    private final float h;
    private boolean i;
    private long j;

    public aevk(amro amro, argz argz, argz argz2) {
        Object obj = null;
        if (argz != null && argz2 != null && argz.c > 0 && argz2.c > 0) {
            obj = 1;
        }
        this.b = amro;
        long j = 1073741824;
        this.c = obj != null ? argz.b : 1073741824;
        this.d = obj != null ? argz.c : 5368709120L;
        this.e = obj != null ? argz.d : 0.2f;
        this.f = obj != null ? argz2.b : 33554432;
        if (obj != null) {
            j = argz2.c;
        }
        this.g = j;
        this.h = obj != null ? argz2.d : 0.15f;
        this.a = new TreeSet(this);
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
        this.i = true;
    }

    public final void a(oww oww, long j) {
        if (this.i) {
            a(oww);
        }
    }

    public final void a(oww oww, oxf oxf) {
        this.a.add(oxf);
        this.j += oxf.c;
        if (this.i) {
            a(oww);
        }
    }

    public final void a(oxf oxf) {
        this.a.remove(oxf);
        this.j -= oxf.c;
    }

    public final void a(oww oww, oxf oxf, oxf oxf2) {
        a(oxf);
        a(oww, oxf2);
    }

    private final void a(oww oww) {
        long c = c();
        while (true) {
            long j = this.j;
            if (j > 0 && j > c) {
                try {
                    oww.b((oxf) this.a.first());
                } catch (owv unused) {
                }
            } else {
                return;
            }
        }
    }

    public final long c() {
        if (!this.i) {
            return 0;
        }
        File file = (File) this.b.get();
        long usableSpace = file.getUsableSpace();
        usableSpace = Math.min(this.g, Float.valueOf(this.h * ((float) Math.max(0, (usableSpace - Math.max(this.c, Math.min(this.d, Float.valueOf(((float) (file.getTotalSpace() - (file.getFreeSpace() - usableSpace))) * this.e).longValue()))) + this.j))).longValue());
        if (usableSpace < this.f) {
            return 0;
        }
        return usableSpace;
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
