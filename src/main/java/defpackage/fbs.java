package defpackage;

import android.graphics.Rect;

/* renamed from: fbs */
final /* synthetic */ class fbs implements bcvk {
    private final fbp a;

    fbs(fbp fbp) {
        this.a = fbp;
    }

    public final void a(Object obj) {
        fbp fbp = this.a;
        xqg xqg = (xqg) obj;
        if (fbp.e != null) {
            Rect rect = new Rect();
            if (fbp.d.f()) {
                rect.set(xqg.a.a);
            }
            if (!fbp.c.equals(rect)) {
                fbp.c.set(rect);
                fbp.e.setPadding(fbp.c.left, 0, fbp.c.right, 0);
            }
        }
    }
}
