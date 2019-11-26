package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import com.google.android.youtube.R;

/* renamed from: llb */
public final class llb extends lkn implements ajkk, eye {
    private final eyb a;
    private final ajjz b;
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final int e;
    private final lle f;
    private final int g;
    private float h;

    public llb(Context context, ajjz ajjz, eyb eyb) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.watch_while_mini_player_width);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.watch_while_mini_player_padding);
        this.b = ajjz;
        this.a = eyb;
        this.g = dimensionPixelOffset;
        this.f = new lle(this, ofFloat);
        this.h = 1.777f;
        this.e = (int) (((float) (dimensionPixelSize * dimensionPixelSize)) / 1.777f);
    }

    public final float m() {
        return 1.0f;
    }

    public final float n() {
        return 0.0f;
    }

    public final float o() {
        return 0.0f;
    }

    public final float p() {
        return 0.0f;
    }

    public final float q() {
        return 0.0f;
    }

    public final float r() {
        return 0.0f;
    }

    public final void f() {
        this.b.a((ajkk) this);
        this.a.a(this);
        a(llb.b(this.b.a));
    }

    public final void g() {
        this.f.a();
        this.b.b(this);
        this.a.b(this);
    }

    public final Rect h() {
        return this.d;
    }

    public final Rect i() {
        return this.d;
    }

    public final Rect j() {
        return i;
    }

    public final Rect k() {
        return i;
    }

    public final Rect l() {
        return i;
    }

    public final void b_(int i, int i2) {
        this.c.set(0, 0, i, i2);
        b();
    }

    public final void a(int i, int i2) {
        float f = 1.777f;
        if (i > 0 && i2 > 0) {
            f = ((float) i) / ((float) i2);
        }
        float b = llb.b(f);
        if (Math.abs(this.h - b) >= 0.001f) {
            lle lle = this.f;
            f = this.h;
            lle.a();
            lle.b = f;
            lle.c = b;
            f /= b;
            if (f < 1.0f) {
                f = 1.0f / f;
            }
            lle.a.setDuration((long) (f * 200.0f));
            lle.a.start();
        }
    }

    public final void a() {
        b();
    }

    private static float b(float f) {
        return ((double) f) != 0.0d ? Math.min(1.777f, Math.max(0.5627462f, f)) : 1.777f;
    }

    public final void a(float f) {
        this.h = f;
        b();
    }

    private final void b() {
        int round = (int) Math.round(Math.sqrt((double) (((float) this.e) / this.h)));
        int i = this.e / round;
        int height = this.c.height();
        int i2 = this.a.b;
        int width = this.c.width();
        int i3 = this.g;
        width = (width - i3) - i;
        height = ((height + i2) - i3) - round;
        this.d.set(width, height, i + width, round + height);
        t();
    }
}
