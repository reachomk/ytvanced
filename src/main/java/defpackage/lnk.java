package defpackage;

import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: lnk */
final class lnk implements OnPreDrawListener {
    private float a;
    private final lni b;
    private final /* synthetic */ lnf c;

    lnk(lnf lnf, lni lni) {
        this.c = lnf;
        this.b = (lni) amqw.a((Object) lni);
    }

    public final boolean onPreDraw() {
        lmk lmk = this.c.c;
        float x = lmk != null ? lmk.a.getX() : 0.0f;
        if (this.a != x) {
            this.a = x;
            this.b.a(x);
        }
        return true;
    }
}
