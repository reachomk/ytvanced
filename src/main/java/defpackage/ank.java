package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: ank */
public final class ank implements apo {
    public int a;
    public int b;
    public int[] c;
    public int d;

    /* Access modifiers changed, original: final */
    public final void a(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        apn apn = recyclerView.n;
        if (recyclerView.m != null && apn != null && apn.p) {
            if (z) {
                if (!recyclerView.f.d()) {
                    apn.a(recyclerView.m.a(), (apo) this);
                }
            } else if (!recyclerView.q()) {
                apn.a(this.a, this.b, recyclerView.L, (apo) this);
            }
            int i = this.d;
            if (i > apn.q) {
                apn.q = i;
                apn.r = z;
                recyclerView.e.b();
            }
        }
    }

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 >= 0) {
            int i3 = this.d;
            i3 += i3;
            int[] iArr = this.c;
            if (iArr == null) {
                this.c = new int[4];
                Arrays.fill(this.c, -1);
            } else {
                int length = iArr.length;
                if (i3 >= length) {
                    this.c = new int[(i3 + i3)];
                    System.arraycopy(iArr, 0, this.c, 0, length);
                }
            }
            iArr = this.c;
            iArr[i3] = i;
            iArr[i3 + 1] = i2;
            this.d++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(int i) {
        if (this.c != null) {
            int i2 = this.d;
            i2 += i2;
            for (int i3 = 0; i3 < i2; i3 += 2) {
                if (this.c[i3] == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.d = 0;
    }
}
