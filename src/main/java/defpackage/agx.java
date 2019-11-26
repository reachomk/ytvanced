package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: agx */
final class agx implements aho {
    private aht a;
    private final SparseBooleanArray b = new SparseBooleanArray();
    private int c;
    private int d;
    private int e;
    private int f;
    private final /* synthetic */ agv g;

    agx(agv agv) {
        this.g = agv;
    }

    public final void a(int i) {
        this.c = i;
        this.b.clear();
        i = this.g.c.a();
        this.d = i;
        this.g.f.a(this.c, i);
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        if (i <= i2) {
            i = b(i);
            i2 = b(i2);
            this.e = b(i3);
            i3 = b(i4);
            this.f = i3;
            if (i5 == 1) {
                a(this.e, i2, 1, true);
                a(i2 + this.g.b, this.f, 1, false);
                return;
            }
            a(i, i3, i5, false);
            a(this.e, i - this.g.b, i5, true);
        }
    }

    private final int b(int i) {
        return i - (i % this.g.b);
    }

    private final void a(int i, int i2, int i3, boolean z) {
        int i4 = i;
        while (i4 <= i2) {
            this.g.g.a(z ? (i2 + i) - i4 : i4, i3);
            i4 += this.g.b;
        }
    }

    public final void a(int i, int i2) {
        if (!this.b.get(i)) {
            aht aht = this.a;
            if (aht != null) {
                this.a = aht.d;
            } else {
                agv agv = this.g;
                aht = new aht(agv.a, agv.b);
            }
            aht.b = i;
            i = Math.min(this.g.b, this.d - i);
            aht.c = i;
            this.g.c.a(aht.a, aht.b, i);
            while (this.b.size() >= 10) {
                i = this.b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.b;
                int keyAt = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i3 = this.e - i;
                int i4 = keyAt - this.f;
                if (i3 <= 0 || (i3 < i4 && i2 != 2)) {
                    if (i4 <= 0 || (i3 >= i4 && i2 != 1)) {
                        break;
                    }
                    c(keyAt);
                } else {
                    c(i);
                }
            }
            this.b.put(aht.b, true);
            this.g.f.a(this.c, aht);
        }
    }

    public final void a(aht aht) {
        aht.d = this.a;
        this.a = aht;
    }

    private final void c(int i) {
        this.b.delete(i);
        this.g.f.b(this.c, i);
    }
}
