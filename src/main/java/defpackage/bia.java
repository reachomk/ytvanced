package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: bia */
final class bia extends AnimatorListenerAdapter implements bhd {
    private final View a;
    private final int b;
    private final ViewGroup c;
    private final boolean d;
    private boolean e;
    private boolean f = false;

    bia(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        this.d = true;
        a(true);
    }

    public final void a() {
    }

    public final void d() {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationPause(Animator animator) {
        if (!this.f) {
            bht.a(this.a, this.b);
        }
    }

    public final void onAnimationResume(Animator animator) {
        if (!this.f) {
            bht.a(this.a, 0);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    public final void onAnimationEnd(Animator animator) {
        e();
    }

    public final void a(bgx bgx) {
        e();
        bgx.b((bhd) this);
    }

    public final void b() {
        a(false);
    }

    public final void c() {
        a(true);
    }

    private final void e() {
        if (!this.f) {
            bht.a(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        a(false);
    }

    private final void a(boolean z) {
        if (this.d && this.e != z) {
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                this.e = z;
                bhr.a(viewGroup, z);
            }
        }
    }
}
