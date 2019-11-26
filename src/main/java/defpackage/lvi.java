package defpackage;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: lvi */
public final class lvi implements eiw {
    public final SparseArray b = new SparseArray();

    public lvi(Context context, lla lla, lla lla2, lla lla3) {
        int f = xss.f(context);
        int g = xss.g(context);
        a(0, 2, lla, f, g);
        a(1, 1, lla2, f, g);
        a(2, 3, lla3, f, g);
    }

    public final eix a(int i) {
        return ((lvh) this.b.get(i)).b;
    }

    private final void a(int i, int i2, lla lla, int i3, int i4) {
        lvh lvh = new lvh(i2);
        lla.b_(i3, i4);
        lvh.b(lla);
        this.b.put(i, lvh);
    }
}
