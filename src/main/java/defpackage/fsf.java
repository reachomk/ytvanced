package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: fsf */
final /* synthetic */ class fsf implements OnGlobalLayoutListener {
    private final fsc a;

    fsf(fsc fsc) {
        this.a = fsc;
    }

    public final void onGlobalLayout() {
        fsc fsc = this.a;
        if (fsc.d == 0) {
            fsc.d = fsc.a.getHeight();
        } else if (!(fsc.e || fsc.b.c() == ejd.INLINE_FULLSCREEN)) {
            int height = fsc.a.getHeight();
            int i = fsc.d;
            if (height < i && fsc.f == 1) {
                fsc.f = 2;
                fsc.a();
            } else if (height >= i && fsc.f == 2) {
                fsc.f = 1;
                fsc.a();
            }
        }
    }
}
