package defpackage;

import android.graphics.Rect;

/* renamed from: hzg */
final /* synthetic */ class hzg implements bcvk {
    private final hzh a;

    hzg(hzh hzh) {
        this.a = hzh;
    }

    public final void a(Object obj) {
        hzh hzh = this.a;
        Rect rect = (Rect) obj;
        if (!hzh.a.equals(rect)) {
            hzh.a.set(rect);
            int g = abe.g(hzh);
            int i = 0;
            int i2 = g == 1 ? hzh.a.left : 0;
            if (g != 1) {
                i = hzh.a.right;
            }
            hzh.d.setPadding(i2, hzh.a.top, i, hzh.a.bottom);
        }
    }
}
