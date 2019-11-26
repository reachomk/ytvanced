package defpackage;

import android.animation.ValueAnimator;

/* renamed from: zcu */
final class zcu extends ValueAnimator {
    public zcu(zcv zcv) {
        setFloatValues(new float[]{0.0f, 1.0f});
        setDuration(300);
        addUpdateListener(new zct(zcv));
        addListener(new zcw(this, zcv));
    }
}
