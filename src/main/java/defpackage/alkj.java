package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: alkj */
final class alkj implements OnGlobalLayoutListener {
    public final /* synthetic */ alkc a;

    alkj(alkc alkc) {
        this.a = alkc;
    }

    public final void onGlobalLayout() {
        this.a.aa.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int height = this.a.aa.getHeight();
        this.a.ab.setAlpha(0.0f);
        this.a.ab.animate().alpha(1.0f).setDuration(250).start();
        this.a.ac.setTranslationY((float) height);
        this.a.ac.animate().translationY(0.0f).setDuration(250).setListener(new alki(this)).start();
    }
}
