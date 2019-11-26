package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.provider.Settings.System;
import android.util.Property;
import android.view.OrientationEventListener;

/* renamed from: zic */
final class zic extends OrientationEventListener {
    private final /* synthetic */ zhu a;

    zic(zhu zhu, Context context) {
        this.a = zhu;
        super(context);
    }

    public final void onOrientationChanged(int i) {
        int i2 = -1;
        if (i != -1 && !this.a.ad.a() && this.a.ae.getHeight() != 0 && System.getInt(this.a.ae.getContext().getContentResolver(), "accelerometer_rotation", 0) == 1) {
            i = (i + this.a.ar) % 360;
            for (int i3 : zhu.a) {
                int abs = Math.abs(i - i3);
                if (abs > 180) {
                    abs = 360 - abs;
                }
                if (abs < 20) {
                    i2 = i3;
                    break;
                }
            }
            if (i2 >= 0) {
                zhu zhu = this.a;
                if (i2 != zhu.ap) {
                    zhu.ap = i2;
                    zhu.a(zhu.ab.c());
                    i2 = zhu.ap;
                    float f = 360.0f - ((float) i2);
                    if (f > 180.0f) {
                        f = (float) (-i2);
                    }
                    zhu.ah.animate().rotation(f).setDuration(300).start();
                    i2 = zhu.am.a;
                    Property e = zhu.e(i2);
                    float a = zhu.a(i2, false);
                    Property e2 = zhu.e(zhu.ap);
                    float a2 = zhu.a(zhu.ap, false);
                    float a3 = zhu.a(zhu.ap, true);
                    AnimatorSet animatorSet = zhu.ai;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zhu.ai.cancel();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zhu.am, e.getName(), new float[]{((Float) e.get(zhu.am)).floatValue(), a});
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zhu.am, e2.getName(), new float[]{a2, a3});
                    ofFloat2.addListener(new zia(zhu, e, e2, a2));
                    ofFloat2.addUpdateListener(new zhw(zhu));
                    zhu.ai = new AnimatorSet();
                    zhu.ai.playSequentially(new Animator[]{ofFloat, ofFloat2});
                    zhu.ai.start();
                }
            }
        }
    }
}
