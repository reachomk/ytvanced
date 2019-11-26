package defpackage;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.google.android.youtube.R;

/* renamed from: kfe */
final class kfe {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    private final Context e;

    public kfe(Context context) {
        this.e = context;
        this.a = context.getResources().getDimensionPixelSize(R.dimen.metadata_swap_full_displacement);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.metadata_swap_half_displacement);
        this.c = (long) context.getResources().getInteger(R.integer.endorsement_thumbnail_duration_ms);
        this.d = (long) context.getResources().getInteger(R.integer.endorsement_text_duration_ms);
    }

    public final Animation a(float f, float f2, long j, int i) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(j);
        alphaAnimation.setInterpolator(this.e, i);
        return alphaAnimation;
    }

    public final Animation a(int i, int i2, long j, int i3) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) i, (float) i2);
        translateAnimation.setDuration(j);
        translateAnimation.setInterpolator(this.e, i3);
        return translateAnimation;
    }
}
