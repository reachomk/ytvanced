package defpackage;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* renamed from: khe */
public final class khe extends akrl {
    private final bapu c;
    private boolean d = false;
    private ValueAnimator e;
    private long f;
    private long g;
    private long h;

    public khe(bapu bapu) {
        this.c = bapu;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        akrd akrd = this.b;
        khd khd = (khd) akrd.a();
        aqwj aqwj = khd.c;
        if (khd.a.e() && aqwj != null && aqwj.a == 1) {
            long b;
            if (khd.a.e == 0) {
                b = akrd.b();
                b += b;
            } else {
                b = 0;
            }
            this.f = b;
            this.g = (long) (((float) akrd.b()) * 2.5f);
            b = this.g - akrd.b();
            this.h = b;
            long j = this.f + b;
            amqw.a(j >= 0, "Blocking duration must be greater or equal to 0: %ld", j);
            this.a = j;
            return true;
        }
        this.d = true;
        return ((akra) this.c.get()).a(akrd.e().a(akrd.a()).a(akrd.b()).a(akrd.c()).b(akrd.d()).a());
    }

    public final void b() {
        if (this.d) {
            ((akra) this.c.get()).b();
            return;
        }
        akrd akrd = this.b;
        khd khd = (khd) akrd.a();
        SwipeLayout swipeLayout = khd.a;
        float alpha = khd.K_().getAlpha();
        r5 = new PropertyValuesHolder[2];
        r5[0] = PropertyValuesHolder.ofKeyframe("alpha", new Keyframe[]{Keyframe.ofFloat(0.0f, alpha), Keyframe.ofFloat(((float) this.h) / ((float) this.g), alpha), Keyframe.ofFloat(1.0f, 0.0f)});
        r5[1] = PropertyValuesHolder.ofInt("displacement", new int[]{swipeLayout.e, -swipeLayout.getWidth()});
        this.e = ValueAnimator.ofPropertyValuesHolder(r5);
        this.e.setStartDelay(this.f);
        this.e.setDuration(this.g);
        this.e.setInterpolator(new LinearInterpolator());
        this.e.addUpdateListener(new khh(khd, swipeLayout));
        this.e.addListener(new khg(this, akrd));
        this.e.start();
    }

    public final void c() {
        if (this.d) {
            ((akra) this.c.get()).c();
            return;
        }
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            d();
        }
    }

    public final void d() {
        this.e = null;
        akrd akrd = this.b;
        khd khd = (khd) akrd.a();
        khd.a.a(0);
        khd.K_().setAlpha(1.0f);
        akrd.d().run();
    }
}
