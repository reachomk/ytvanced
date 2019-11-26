package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;

/* renamed from: zwa */
public final class zwa extends aiua implements AnimatorUpdateListener {
    public final Resources a;
    public final View b = ((View) amqw.a(findViewById(R.id.info_card_teaser_overlay)));
    public final TextView c = ((TextView) amqw.a(this.s.findViewById(R.id.info_card_teaser_message)));
    public final TouchImageView d;
    public final zwd e;
    public boolean f;
    public final ValueAnimator g = ValueAnimator.ofFloat(new float[0]).setDuration(100);
    public final ValueAnimator h = ValueAnimator.ofFloat(new float[0]).setDuration(580);
    public final Handler i = new Handler();
    public final Runnable j = new zvz(this);
    public float k;
    public float l;
    public zvw m;
    public boolean n;
    public final PointF o = new PointF(0.0f, 0.0f);
    public float p;
    public Vibrator q;
    private final View r = ((View) amqw.a(findViewById(R.id.info_card_teaser_wrapper)));
    private final View s = ((View) amqw.a(findViewById(R.id.info_card_teaser_content)));
    private final View t = ((View) amqw.a(findViewById(R.id.info_card_teaser_background)));
    private final TouchImageView u = ((TouchImageView) amqw.a((TouchImageView) findViewById(R.id.info_card_teaser_icon)));
    private final amjw v;
    private boolean w;

    public zwa(Context context) {
        super(context);
        this.a = context.getResources();
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(R.layout.info_cards_teaser_overlay, this);
        this.g.addUpdateListener(this);
        this.h.addUpdateListener(this);
        this.d = (TouchImageView) from.inflate(R.layout.info_card_button, null);
        a(false);
        this.d.setVisibility(8);
        this.r.setVisibility(0);
        this.e = new zwd(new zwc(this), this.i);
        this.r.setOnClickListener(new zwb(this));
        this.v = new amjw(this.r, new zwe(this));
        this.r.setOnTouchListener(this.v);
        c();
    }

    private static float a(float f, float f2, float f3) {
        return f3 >= f ? f3 <= f2 ? (f3 - f) / (f2 - f) : 1.0f : 0.0f;
    }

    public final void a(boolean z) {
        if (z) {
            this.d.setContentDescription(getResources().getString(R.string.accessibility_annotation_overlay_info_cards_drawer_dismiss));
        } else {
            this.d.setContentDescription(getResources().getString(R.string.accessibility_info_cards));
        }
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void c() {
        this.g.cancel();
        this.h.cancel();
        this.i.removeCallbacks(this.j);
        this.k = 0.0f;
        this.l = 0.0f;
        zwd zwd = this.e;
        zwd.h.cancel();
        zwd.b.removeCallbacks(zwd.f);
        zwd.d = false;
        zwd.e = false;
        zwd.g = false;
        zwd.a.a(0.0f);
        c(false);
        f();
    }

    public final void b(boolean z) {
        this.i.removeCallbacks(this.j);
        if (z) {
            this.h.setFloatValues(new float[]{this.l, 0.0f});
            this.h.start();
        } else {
            this.h.cancel();
            this.l = 0.0f;
        }
        f();
    }

    public final void d() {
        if (this.k >= 1.0E-5f) {
            this.g.setFloatValues(new float[]{r0, 0.0f});
            this.g.start();
            f();
        }
    }

    public final void c(boolean z) {
        this.w = z;
        e();
        f();
    }

    public final void e() {
        zwd zwd = this.e;
        boolean z = false;
        if (this.f && this.w) {
            z = true;
        }
        zwd.a(z);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.g) {
            this.k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.h) {
            this.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        f();
    }

    public final void f() {
        abe.a(this.r, 0, (int) this.o.y, (int) (this.o.x * this.k), 0);
        float max = Math.max(zwa.a(0.0f, 250.0f, this.l), this.p);
        this.u.setAlpha(max);
        this.d.setAlpha(1.0f - max);
        this.d.setVisibility(!this.w ? 8 : 0);
        float a = zwa.a(250.0f, 580.0f, this.l);
        abe.c(this.t, a);
        float width = ((float) (this.t.getWidth() / 2)) * (1.0f - a);
        if (this.n) {
            abe.a(this.t, -width);
        } else {
            abe.a(this.t, width);
        }
        this.t.setAlpha(a);
        a = zwa.a(415.0f, 580.0f, this.l);
        this.c.setAlpha(a);
        if (Math.abs(a) < 1.0E-5f) {
            if (this.c.getVisibility() != 8) {
                this.c.setVisibility(8);
                zvw zvw = this.m;
                if (zvw != null) {
                    zvw.e();
                }
            }
        } else if (this.c.getVisibility() != 0) {
            this.c.setVisibility(0);
        }
        if (Math.abs(max) < 1.0E-5f) {
            if (getVisibility() != 8) {
                setVisibility(8);
                zvw zvw2 = this.m;
                if (zvw2 != null) {
                    zvw2.d();
                }
            }
        } else if (getVisibility() != 0) {
            setVisibility(0);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        abe.a(this.s, i / 10, 0, 0, 0);
    }
}
