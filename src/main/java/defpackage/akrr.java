package defpackage;

import android.view.ViewPropertyAnimator;

/* renamed from: akrr */
public final class akrr extends akrj {
    public ViewPropertyAnimator b;

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        this.a.a().K_().setAlpha(0.0f);
        return true;
    }

    public final void b() {
        akpy akpy = this.a;
        this.b = akpy.a().K_().animate();
        this.b.alpha(1.0f).setDuration(akpy.b()).setListener(new akrq(this, akpy)).start();
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
        akpy akpy = this.a;
        akpy.a().K_().setAlpha(1.0f);
        akpy.d().run();
    }
}
