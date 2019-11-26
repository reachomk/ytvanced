package defpackage;

import java.util.ArrayList;

/* renamed from: aknx */
final class aknx implements akng {
    private int[] a;
    private final /* synthetic */ aknu b;

    public aknx(aknu aknu) {
        this.b = aknu;
        c();
    }

    private final void b() {
        int d = this.b.a.d() + 1;
        int[] iArr = this.a;
        if (iArr == null) {
            this.a = new int[Math.max(d, 32)];
            return;
        }
        int length = iArr.length;
        if (length < d) {
            int[] iArr2 = new int[Math.max(length + length, d)];
            System.arraycopy(this.a, 0, iArr2, 0, length);
            this.a = iArr2;
        }
    }

    private final void c() {
        this.b.d.clear();
        int d = this.b.a.d();
        b();
        this.b.d.ensureCapacity(d);
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            if (this.b.b.a(this.b.a.c(i2))) {
                this.b.d.add(Integer.valueOf(i2));
                int i3 = i + 1;
                this.a[i2] = i;
                i = i3;
            } else {
                this.a[i2] = i;
            }
        }
        this.a[d] = i;
        this.b.b();
    }

    public final void bF_() {
        c();
    }

    public final void d_(int i, int i2) {
        c();
    }

    public final void f_(int i, int i2) {
        c();
    }

    public final void e_(int i, int i2) {
        int d = this.b.a.d();
        b();
        int[] iArr = this.a;
        int i3 = i + i2;
        System.arraycopy(iArr, i, iArr, i3, ((d + 1) - i) - i2);
        int i4 = this.a[i];
        int i5 = 0;
        while (i < i3) {
            Object c = this.b.a.c(i);
            int i6 = i4 + i5;
            this.a[i] = i6;
            if (this.b.b.a(c)) {
                this.b.d.add(i6, Integer.valueOf(i));
                i5++;
            }
            i++;
        }
        for (i = i4 + i5; i < this.b.d(); i++) {
            ArrayList arrayList = this.b.d;
            arrayList.set(i, Integer.valueOf(((Integer) arrayList.get(i)).intValue() + i2));
        }
        if (i5 > 0) {
            while (i3 <= d) {
                int[] iArr2 = this.a;
                iArr2[i3] = iArr2[i3] + i5;
                i3++;
            }
            this.b.b(i4, i5);
        }
    }

    public final void g_(int i, int i2) {
        int d = this.b.a.d();
        int[] iArr = this.a;
        int i3 = iArr[i];
        int i4 = i + i2;
        int i5 = iArr[i4] - i3;
        System.arraycopy(iArr, i4, iArr, i, (d + 1) - i);
        if (i5 > 0) {
            this.b.d.subList(i3, i3 + i5).clear();
            while (i <= d) {
                iArr = this.a;
                iArr[i] = iArr[i] - i5;
                i++;
            }
            this.b.d(i3, i5);
        }
        while (i3 < this.b.d()) {
            ArrayList arrayList = this.b.d;
            arrayList.set(i3, Integer.valueOf(((Integer) arrayList.get(i3)).intValue() - i2));
            i3++;
        }
    }
}
