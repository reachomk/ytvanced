package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: nga */
public final class nga implements AnimationListener {
    public final ImageView a;
    public final Animation b;
    public final float c;
    private final float d;

    nga(ImageView imageView, Animation animation) {
        this.a = imageView;
        this.b = animation;
        this.c = nga.a(imageView.getResources(), R.dimen.preview_to_player_anim_start_alpha);
        this.d = nga.a(imageView.getResources(), R.dimen.preview_to_player_anim_end_alpha);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.clearAnimation();
        this.a.setAlpha(this.d);
    }

    private static float a(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }
}
