package defpackage;

import android.view.View;

/* renamed from: bps */
public final class bps implements biv {
    public final void a(View view, float f) {
        if (f >= 0.0f && f < 1.0f) {
            view.setTranslationX((-f) * ((float) view.getWidth()));
            view.setAlpha(Math.max(0.0f, 1.0f - f));
            f = Math.max(0.0f, 1.0f - (f * 0.3f));
            view.setScaleX(f);
            view.setScaleY(f);
            return;
        }
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }
}
