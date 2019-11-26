package defpackage;

import android.animation.ValueAnimator;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;

/* renamed from: zac */
public final class zac extends ValueAnimator {
    private final yxc a;
    private final yxd b;
    private final LayoutParams c = new LayoutParams(-2, -2);
    private final RelativeLayout.LayoutParams d = new RelativeLayout.LayoutParams(-2, -2);

    public zac(yxd yxd) {
        this.b = (yxd) amqw.a((Object) yxd);
        this.a = yxd.c;
        setFloatValues(new float[]{0.0f, 1.0f});
        setDuration(300);
        addUpdateListener(new zae(this));
    }

    private static int a(float f, float f2, float f3) {
        return (int) (((1.0f - f) * f2) + (f * f3));
    }

    public final void a(boolean z) {
        if (z) {
            start();
            return;
        }
        cancel();
        a(1.0f);
    }

    public final void b(boolean z) {
        if (z) {
            reverse();
            return;
        }
        cancel();
        a(0.0f);
    }

    /* Access modifiers changed, original: final */
    public final void a(float f) {
        this.c.gravity = this.a.a;
        LayoutParams layoutParams = this.c;
        yxc yxc = this.a;
        layoutParams.width = zac.a(f, (float) yxc.b, (float) yxc.c);
        layoutParams = this.c;
        yxc = this.a;
        layoutParams.height = zac.a(f, (float) yxc.d, (float) yxc.e);
        this.d.topMargin = zac.a(f, 0.0f, (float) this.a.h);
        this.d.leftMargin = zac.a(f, (float) this.a.f, 0.0f);
        this.d.rightMargin = zac.a(f, (float) this.a.g, 0.0f);
        yxd yxd = this.b;
        layoutParams = this.c;
        RelativeLayout.LayoutParams layoutParams2 = this.d;
        yxd.a.setLayoutParams(layoutParams);
        yxd.b.setLayoutParams(layoutParams2);
    }
}
