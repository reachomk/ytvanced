package defpackage;

import android.util.SparseIntArray;

/* renamed from: ann */
public abstract class ann {
    private final SparseIntArray a = new SparseIntArray();
    private final SparseIntArray b = new SparseIntArray();

    public abstract int a(int i);

    public final void a() {
        this.a.clear();
    }

    public final void b() {
        this.b.clear();
    }

    public int a(int i, int i2) {
        int a = a(i);
        if (a == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int a2 = a(i4);
            i3 += a2;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = a2;
            }
        }
        if (a + i3 > i2) {
            return 0;
        }
        return i3;
    }

    public int b(int i, int i2) {
        int a = a(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int a2 = a(i5);
            i3 += a2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = a2;
            }
        }
        return i3 + a > i2 ? i4 + 1 : i4;
    }
}
