package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: wiu */
final class wiu implements OnGlobalLayoutListener {
    private final /* synthetic */ wih a;

    wiu(wih wih) {
        this.a = wih;
    }

    public final void onGlobalLayout() {
        wih wih = this.a;
        wih.a(wih.u);
        wih = this.a;
        wih.a(wih.v);
        wih = this.a;
        wih.a(wih.w);
        wih = this.a;
        wih.a(wih.x);
        this.a.t.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
