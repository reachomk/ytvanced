package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.animation.DecelerateInterpolator;
import com.google.android.youtube.R;

/* renamed from: aihe */
public final class aihe extends aihk {
    public final int a;
    public final int b;
    public final ValueAnimator c = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public boolean d;
    public boolean e;
    public int f;
    public long g;
    public final aihl h;

    public aihe(aigy aigy) {
        Resources resources = aigy.getResources();
        this.a = resources.getColor(R.color.accelerating_buffer_bar_color);
        int color = resources.getColor(R.color.accelerated_buffer_bar_color);
        this.b = color;
        this.f = color;
        this.h = new aihh(aigy);
        this.c.setInterpolator(new DecelerateInterpolator());
        this.c.setDuration((long) resources.getInteger(R.integer.accelerated_buffer_bar_anim_duration));
        this.c.addUpdateListener(new aihg(this));
        this.c.addListener(new aihj(this, resources));
    }

    public final long a() {
        if (!this.d || !this.e) {
            return this.j;
        }
        long j = this.i;
        if (this.c.isRunning()) {
            float floatValue = ((Float) this.c.getAnimatedValue()).floatValue();
            long j2 = this.g;
            j = Math.min(j2 + ((long) Math.round(floatValue * ((float) (j - j2)))), j);
        }
        return j;
    }

    public final int b() {
        if (this.d && this.e) {
            return this.f;
        }
        return this.n;
    }
}
