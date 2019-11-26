package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: akrm */
public final class akrm extends akrk {
    public ViewPropertyAnimator b;
    public ViewPropertyAnimator c;
    private float d;
    private float e;

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        akre akre = this.a;
        this.d = (float) (akre.j() - akre.h());
        this.e = (float) (akre.k() - akre.i());
        View K_ = akre.a().K_();
        float f = this.d;
        float translationX = K_.getTranslationX();
        float f2 = this.e;
        float translationY = K_.getTranslationY();
        View K_2 = akre.b().K_();
        K_2.setAlpha(0.0f);
        K_2.setTranslationX(-(f - translationX));
        K_2.setTranslationY(-(f2 - translationY));
        return true;
    }

    public final void b() {
        akre akre = this.a;
        long c = akre.c();
        this.b = akre.a().K_().animate();
        this.b.setDuration(c).alpha(0.0f).translationX(this.d).translationY(this.e).setListener(new akrp(this, akre)).start();
        this.c = akre.b().K_().animate();
        this.c.setDuration(c).alpha(1.0f).translationX(0.0f).translationY(0.0f).setListener(new akro(this, akre)).start();
    }

    public final void c() {
        ViewPropertyAnimator viewPropertyAnimator = this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            d();
        }
        viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            e();
        }
    }

    public final void d() {
        akre akre = this.a;
        akrm.a(akre.a().K_());
        akre.e().run();
    }

    public final void e() {
        akre akre = this.a;
        akrm.a(akre.b().K_());
        akre.g().run();
    }

    private static void a(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
}
