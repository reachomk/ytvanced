package defpackage;

import android.view.ViewPropertyAnimator;

/* renamed from: akrt */
public final class akrt extends akrl {
    public ViewPropertyAnimator c;

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return true;
    }

    public final void b() {
        akrd akrd = this.b;
        this.c = akrd.a().K_().animate();
        this.c.alpha(0.0f).setDuration(akrd.b()).setListener(new akrs(this, akrd)).start();
    }

    public final void c() {
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            d();
        }
    }

    public final void d() {
        akrd akrd = this.b;
        akrd.a().K_().setAlpha(1.0f);
        akrd.d().run();
    }
}
