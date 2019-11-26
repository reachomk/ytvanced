package defpackage;

import java.util.Iterator;

/* renamed from: uoc */
final class uoc implements Comparable, Iterable {
    private final int a;
    private final int b;
    private final int c;
    private final /* synthetic */ uod d;

    public uoc(uod uod, int i, int i2, int i3) {
        this.d = uod;
        this.a = uhy.a(i, uod.b.length);
        boolean z = false;
        if (i2 > 0 && i + i2 <= uod.b.length) {
            z = true;
        }
        uhy.a(z);
        this.b = i2;
        this.c = i3;
    }

    private final long a() {
        uod uod = this.d;
        long b = uod.a.b(uod.b[this.a]);
        uod uod2 = this.d;
        long b2 = uod2.a.b(uod2.b[(this.a + this.b) - 1]);
        uod uod3 = this.d;
        long j = uod3.d;
        if (j > b) {
            b = uod3.c;
            if (b < b2) {
                b2 = uod3.a.b(uod3.b[this.a]);
                uod3 = this.d;
                return Math.abs((b + ((j - b) / 2)) - (b2 + ((uod3.a.b(uod3.b[(this.a + this.b) - 1]) - b2) / 2))) - Long.MIN_VALUE;
            }
        }
        return (long) this.c;
    }

    public final Iterator iterator() {
        return new uiu(this.d.b, this.a, this.b);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        uoc uoc = (uoc) obj;
        long a = a();
        long a2 = uoc.a();
        int i = -1;
        if (a == a2) {
            int i2 = this.a;
            int i3 = uoc.a;
            if (i2 < i3) {
                i = 1;
            } else if (i2 == i3) {
                i = 0;
            }
            return i;
        } else if (a >= a2) {
            return i;
        } else {
            return 1;
        }
        return i;
    }
}
