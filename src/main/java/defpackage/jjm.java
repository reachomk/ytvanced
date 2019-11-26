package defpackage;

import android.graphics.Rect;

/* renamed from: jjm */
public final /* synthetic */ class jjm implements bcvk {
    private final jjn a;

    public jjm(jjn jjn) {
        this.a = jjn;
    }

    public final void a(Object obj) {
        jjn jjn = this.a;
        xpb xpb = ((xqg) obj).a;
        jjn.f.setEmpty();
        jjn.g = xpb.b;
        Rect rect = xpb.a;
        eif eif = jjn.e;
        if (eif == null || !eif.c().a() || (jjn.a.isInMultiWindowMode() && !jjn.b.f())) {
            jjn.a(rect.left, rect.top, rect.right, rect.bottom);
        } else {
            jjn.a(0, 0, 0, 0);
        }
    }
}
