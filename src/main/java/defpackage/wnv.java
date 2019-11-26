package defpackage;

import android.view.ViewTreeObserver.OnScrollChangedListener;

/* renamed from: wnv */
final /* synthetic */ class wnv implements OnScrollChangedListener {
    private final wnw a;

    wnv(wnw wnw) {
        this.a = wnw;
    }

    public final void onScrollChanged() {
        wnw wnw = this.a;
        float min = 1.0f - Math.min(1.0f, ((float) wnw.b.getScrollY()) / ((float) (wnw.g - wnw.f)));
        wnw.a(wnw.a, (float) wnw.f, (float) wnw.g, min, false);
        wnw.a(wnw.d, (float) wnw.h, (float) wnw.i, min, true);
        wnw.a(wnw.c, (float) wnw.h, (float) wnw.i, min, true);
        wnw.a(wnw.e, (float) wnw.j, (float) wnw.k, min, true);
        min -= 8.0f;
        float max = Math.max(0.0f, min + min);
        wnw.d.setAlpha(max);
        wnw.c.setAlpha(max);
        wnw.e.setAlpha(max);
    }
}
