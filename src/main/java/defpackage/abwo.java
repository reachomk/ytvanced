package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.youtube.R;

/* renamed from: abwo */
final class abwo implements AnimationListener {
    public final View a;
    public final View b;
    public final Handler c = new Handler();
    public final int d;
    public final int e;
    public final Runnable f = new abwr(this);
    public boolean g;
    public abwq h;

    abwo(ViewGroup viewGroup, View view, int i, int i2) {
        this.a = view;
        this.b = viewGroup;
        this.e = i;
        this.d = i2;
        viewGroup.removeAllViews();
        viewGroup.setTranslationY(0.0f);
        viewGroup.addView(view);
        viewGroup.setVisibility(8);
        a();
        this.g = false;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.setVisibility(8);
        abwq abwq = this.h;
        if (abwq != null) {
            abwq.a(this);
        }
    }

    public final void a() {
        this.a.findViewById(R.id.dock_bottom_shadow).setVisibility(8);
    }
}
