package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewOverlay;
import com.google.android.youtube.R;

/* renamed from: uiv */
public final class uiv {
    public final int a;
    public final Context b;
    public final View c;
    public final ViewOverlay d;
    public uiw e;
    public float f = 1.0f;
    public final int g;
    public final int h;

    public uiv(Context context, View view) {
        this.b = context;
        this.c = view;
        Resources resources = context.getResources();
        this.a = resources.getInteger(R.integer.callout_animation_duration_ms);
        this.d = view.getOverlay();
        this.g = resources.getColor(R.color.callout_drawable_background_color);
        this.h = resources.getColor(R.color.callout_drawable_text_color);
    }

    public final void a() {
        if (this.d != null) {
            uiw uiw = this.e;
            if (uiw != null) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(uiw, "alpha", new int[]{0});
                ofInt.setDuration((long) this.a);
                ofInt.addListener(new uiy(this, uiw));
                ofInt.start();
                this.e = null;
            }
        }
    }
}
