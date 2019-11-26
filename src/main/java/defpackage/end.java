package defpackage;

import android.graphics.Rect;

/* renamed from: end */
final /* synthetic */ class end implements bcvq {
    private final ena a;

    end(ena ena) {
        this.a = ena;
    }

    public final Object a(Object obj) {
        ena ena = this.a;
        xqg xqg = (xqg) obj;
        xof xof = xqg.a.b;
        Rect rect = new Rect();
        if (ena.a.f()) {
            rect.set(xqg.a.a);
        } else if (ena.a.g() && !xof.b.isEmpty()) {
            rect.set(xof.a.left, xof.b(), xof.a.right, xof.a.bottom);
        }
        return rect;
    }
}
