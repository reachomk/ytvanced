package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: akrv */
public final class akrv extends akri {
    public ViewPropertyAnimator b;

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return akrv.b(this.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(akqw akqw) {
        boolean b = akrv.b(this.a.a(akqw));
        if (!b) {
            return b;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.b;
        if (viewPropertyAnimator == null) {
            return b;
        }
        viewPropertyAnimator.setListener(null).cancel();
        this.b = null;
        return true;
    }

    private static boolean b(akqy akqy) {
        View K_ = akqy.a().K_();
        float g = ((float) (akqy.g() - akqy.e())) - K_.getTranslationX();
        float h = ((float) (akqy.h() - akqy.f())) - K_.getTranslationY();
        if (g == 0.0f && h == 0.0f) {
            K_.setTranslationX(0.0f);
            K_.setTranslationY(0.0f);
            return false;
        }
        K_.setTranslationX(-g);
        K_.setTranslationY(-h);
        return true;
    }

    public final void b() {
        akqy akqy = this.a;
        this.b = akqy.a().K_().animate();
        this.b.setDuration(akqy.b()).translationX(0.0f).translationY(0.0f).setListener(new akru(this, akqy)).start();
    }

    public final void c() {
        ViewPropertyAnimator viewPropertyAnimator = this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            d();
        }
    }

    public final void d() {
        akqy akqy = this.a;
        View K_ = akqy.a().K_();
        K_.setTranslationX(0.0f);
        K_.setTranslationY(0.0f);
        akqy.d().run();
    }
}
