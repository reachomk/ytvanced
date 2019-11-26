package defpackage;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: amc */
public final class amc {
    public final amd a;
    public final amb b = new amb();
    public final List c = new ArrayList();

    public amc(amd amd) {
        this.a = amd;
    }

    public final void a(View view) {
        this.c.add(view);
        this.a.c(view);
    }

    public final boolean b(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.d(view);
        return true;
    }

    public final void a(View view, int i, boolean z) {
        if (i < 0) {
            i = this.a.a();
        } else {
            i = a(0);
        }
        this.b.a(i, z);
        if (z) {
            a(view);
        }
        this.a.a(view, i);
    }

    public final int a(int i) {
        if (i >= 0) {
            int a = this.a.a();
            int i2 = i;
            while (i2 < a) {
                int e = i - (i2 - this.b.e(i2));
                if (e != 0) {
                    i2 += e;
                } else {
                    while (this.b.c(i2)) {
                        i2++;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    public final View b(int i) {
        return this.a.b(a(i));
    }

    public final void a(View view, int i, LayoutParams layoutParams, boolean z) {
        if (i < 0) {
            i = this.a.a();
        } else {
            i = a(i);
        }
        this.b.a(i, z);
        if (z) {
            a(view);
        }
        this.a.a(view, i, layoutParams);
    }

    public final int a() {
        return this.a.a() - this.c.size();
    }

    public final int b() {
        return this.a.a();
    }

    public final View c(int i) {
        return this.a.b(i);
    }

    /* Access modifiers changed, original: final */
    public final void d(int i) {
        i = a(i);
        this.b.d(i);
        this.a.c(i);
    }

    /* Access modifiers changed, original: final */
    public final int c(View view) {
        int a = this.a.a(view);
        if (a == -1 || this.b.c(a)) {
            return -1;
        }
        return a - this.b.e(a);
    }

    public final boolean d(View view) {
        return this.c.contains(view);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.toString());
        stringBuilder.append(", hidden list:");
        stringBuilder.append(this.c.size());
        return stringBuilder.toString();
    }
}
