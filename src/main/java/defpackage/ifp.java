package defpackage;

import android.graphics.Rect;

/* renamed from: ifp */
public final /* synthetic */ class ifp implements bcvk {
    private final ifl a;

    public ifp(ifl ifl) {
        this.a = ifl;
    }

    public final void a(Object obj) {
        ifl ifl = this.a;
        Rect rect = (Rect) obj;
        if (!ifl.E.equals(rect)) {
            ifl.E.set(rect);
            ifl.k.setPadding(ifl.E.left, ifl.E.top, ifl.E.right, ifl.E.bottom);
            ifl.h.a(ifl.E);
            ifl.j.a(ifl.E);
        }
    }
}
