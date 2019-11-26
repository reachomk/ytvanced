package defpackage;

import java.util.ArrayList;

/* renamed from: tab */
public final class tab extends apc {
    private final /* synthetic */ taa a;

    public final void a() {
        ArrayList arrayList = this.a.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tad tad = (tad) arrayList.get(i);
            if (tad.c) {
                tad.b.a();
                tad.c = false;
            }
        }
        this.a.k.clear();
        b(0, this.a.b.a());
        taa taa = this.a;
        taa.o = -1;
        taa.p = -1;
        taa.d();
    }

    public final void a(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            b(i4);
            a(i4);
        }
        this.a.d();
    }

    public final void a(int i, int i2, Object obj) {
        a(i, i2);
    }

    public final void b(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            a(i + i3);
        }
        this.a.d();
    }

    public final void c(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            b(i);
        }
        this.a.d();
    }

    public final void d(int i, int i2) {
        b(i);
        a(i2);
        this.a.d();
    }

    private final void a(int i) {
        int size = this.a.k.size();
        int i2 = -1;
        if (size > 0) {
            i2 = ((tad) this.a.k.get(size - 1)).a;
        }
        Object a = this.a.c.a(i);
        tai tai = a != null ? (tai) this.a.a.get(a.getClass()) : null;
        if (i <= i2) {
            i2 = this.a.a(i);
            for (int i3 = i2; i3 < this.a.k.size(); i3++) {
                tad tad = (tad) this.a.k.get(i3);
                tad.a++;
            }
            if (tai != null) {
                this.a.k.add(i2, new tad(i, tai, a));
            }
        } else if (tai != null) {
            this.a.k.add(new tad(i, tai, a));
        }
        this.a.s = true;
        taa taa = this.a;
        i2 = taa.o;
        if (i <= i2) {
            taa.o = i2 + 1;
        }
        i2 = taa.p;
        if (i <= i2) {
            taa.p = i2 + 1;
        }
    }

    private final void b(int i) {
        this.a.s = true;
        taa taa = this.a;
        int i2 = taa.o;
        if (i < i2) {
            taa.o = i2 - 1;
        }
        i2 = taa.p;
        if (i < i2) {
            taa.p = i2 - 1;
        }
        int size = taa.k.size();
        if (i <= (size > 0 ? ((tad) this.a.k.get(size - 1)).a : -1)) {
            size = this.a.a(i);
            tad tad = (tad) this.a.k.get(size);
            if (tad.a == i) {
                this.a.k.remove(size);
                if (tad.c) {
                    tad.b.a();
                }
            }
            while (size < this.a.k.size()) {
                tad tad2 = (tad) this.a.k.get(size);
                tad2.a--;
                size++;
            }
        }
    }

    /* synthetic */ tab(taa taa) {
        this.a = taa;
    }
}
