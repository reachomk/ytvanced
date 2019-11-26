package defpackage;

import java.util.Set;

/* renamed from: lqs */
public final class lqs implements ext, lqt {
    private final aikf a;
    private final lqv b;
    private final xca c;
    private final Set d = new zl();
    private final Set e = new zl();

    public lqs(exu exu, aikf aikf, lqv lqv) {
        this.a = aikf;
        this.b = lqv;
        this.c = aikf.e;
        exu.a((ext) this);
    }

    public final long a(int i) {
        return 0;
    }

    public final void a(akoq akoq) {
    }

    public final void a(akor akor, int i) {
    }

    public final lqz b() {
        return a((enm) this.a.b());
    }

    public final int c() {
        return this.a.a();
    }

    public final void b(int i) {
        int i2 = 0;
        if (xty.a(i, 0, d())) {
            int[] iArr = aikc.n;
            int length = iArr.length;
            while (i2 < length) {
                int i3 = iArr[i2];
                int size = this.a.a(i3).size();
                if (i >= size) {
                    i -= size;
                    i2++;
                } else {
                    this.a.a(i3, i);
                    return;
                }
            }
        }
    }

    public final void a(lqw lqw) {
        this.d.add(lqw);
        this.b.b.add(lqw);
    }

    public final void b(lqw lqw) {
        this.d.add(lqw);
        this.b.a(lqw);
    }

    public final int a(lqz lqz) {
        return this.c.indexOf(lqz.a);
    }

    public final int d() {
        return this.c.size();
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final Object c(int i) {
        return a((enm) this.c.get(i));
    }

    public final void b(akng akng) {
        this.e.add(akng);
        this.c.a(akng);
    }

    public final void a(akng akng) {
        this.e.remove(akng);
        this.c.b(akng);
    }

    public final void a() {
        for (akng b : this.e) {
            this.c.b(b);
        }
        for (lqw a : this.d) {
            this.b.a(a);
        }
    }

    private final lqz a(enm enm) {
        return enm != null ? this.b.a(enm) : null;
    }
}
