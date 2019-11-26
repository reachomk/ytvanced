package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: affs */
public final class affs implements nlx {
    private final nvi a;
    private final List b = new ArrayList();
    private final HashMap c = new HashMap();
    private final ozb d;
    private final nwi e;
    private final amro f;
    private final amro g;
    private final amro h;
    private final boolean i;
    private int j;
    private long k;
    private boolean l;
    private volatile boolean m;
    private long n;

    public affs(nvi nvi, nwi nwi, amro amro, amro amro2, amro amro3, ozb ozb, boolean z) {
        this.a = nvi;
        this.e = nwi;
        this.f = amro;
        this.g = amro2;
        this.h = amro3;
        this.d = ozb;
        this.i = z;
    }

    public final void a(Object obj, int i) {
        this.b.add(obj);
        this.c.put(obj, new affv(i));
        this.j += i;
    }

    public final void a(Object obj) {
        this.b.remove(obj);
        this.j -= ((affv) this.c.remove(obj)).a;
        c();
    }

    public final void b() {
        this.a.a(this.j);
    }

    public final nvi a() {
        return this.a;
    }

    public final boolean a(Object obj, long j, long j2, boolean z) {
        int i;
        affv affv;
        if (j2 != -1) {
            long j3 = j2 - j;
            if (j3 <= a(j3)) {
                i = 1;
                affv = (affv) this.c.get(obj);
                affv.b = i;
                affv.d = j2;
                affv.c = z;
                j = j2 - j;
                c();
                return this.l && j2 != -1 && j <= a(j) && j2 <= this.k;
            }
        }
        i = 0;
        affv = (affv) this.c.get(obj);
        affv.b = i;
        affv.d = j2;
        affv.c = z;
        j = j2 - j;
        c();
        if (!this.l) {
        }
    }

    private final long a(long j) {
        long intValue = ((long) ((Integer) this.f.get()).intValue()) * 1000;
        long intValue2 = 1000 * ((long) ((Integer) this.g.get()).intValue());
        int intValue3 = ((Integer) this.h.get()).intValue();
        if (intValue <= intValue2) {
            return intValue;
        }
        if (j != 0 && this.n != -1) {
            return Math.min(intValue, intValue2 + (((long) intValue3) * (this.e.a() - this.n)));
        }
        this.n = this.e.a();
        return intValue2;
    }

    private final void c() {
        boolean z;
        int b = this.a.b();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = 1;
            if (i2 >= this.b.size()) {
                break;
            }
            affv affv = (affv) this.c.get(this.b.get(i2));
            i3 |= affv.c;
            i4 |= affv.d != -1 ? 1 : 0;
            if (affv.b != 1) {
                i6 = 0;
            }
            i5 |= i6;
            i2++;
        }
        if (this.b.isEmpty() || ((i3 == 0 && i4 == 0) || i5 == 0 || b >= this.j)) {
            z = false;
        } else {
            z = true;
        }
        this.l = z;
        i2 = !this.i ? 0 : -10;
        if (z) {
            if (!this.m) {
                this.d.a(i2);
                this.m = true;
            }
        } else if (this.m) {
            this.d.d(i2);
            this.m = false;
        }
        this.k = -1;
        if (this.l) {
            while (i < this.b.size()) {
                long j = ((affv) this.c.get(this.b.get(i))).d;
                if (j != -1) {
                    long j2 = this.k;
                    if (j2 == -1 || j < j2) {
                        this.k = j;
                    }
                }
                i++;
            }
        }
    }
}
