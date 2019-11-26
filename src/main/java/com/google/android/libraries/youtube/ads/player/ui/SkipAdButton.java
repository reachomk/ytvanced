package com.google.android.libraries.youtube.ads.player.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ayiv;
import defpackage.ra;
import defpackage.vzg;
import defpackage.vzo;
import defpackage.vzq;

public final class SkipAdButton extends FrameLayout {
    private static final SparseArray t = new SparseArray();
    private static final float[] u = new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public vzq a;
    public vzo b;
    public CharSequence c;
    public CharSequence d;
    public ImageView e;
    public TextView f;
    public LinearLayout g;
    public int h;
    public int i;
    public int j;
    public int k;
    public ColorDrawable l;
    public ayiv m;
    public int n;
    public int o;
    public ValueAnimator p;
    public boolean q;
    public boolean r;
    public int s;
    private final Paint v = new Paint();
    private final Paint w = new Paint();
    private boolean x;

    public SkipAdButton(Context context) {
        super(context);
        a(context);
    }

    public SkipAdButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public SkipAdButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public SkipAdButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context);
    }

    private final void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.skip_ad_button, this, true);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.ad_skip_ad_button_min_height));
        this.g = (LinearLayout) findViewById(R.id.skip_ad_button_container);
        this.e = (ImageView) findViewById(R.id.skip_ad_button_icon);
        this.j = ra.c(context, R.color.skip_ad_button_background_color);
        this.k = ra.c(context, R.color.skip_ad_button_inverted_background_color);
        this.v.setColor(this.j);
        this.v.setStyle(Style.FILL);
        this.w.setColor(ra.c(context, R.color.skip_ad_button_border_color));
        this.w.setStrokeWidth(getResources().getDimension(R.dimen.ad_skip_ad_button_border_width));
        this.w.setStyle(Style.STROKE);
        this.f = (TextView) findViewById(R.id.skip_ad_button_text);
        this.c = this.f.getText();
        this.h = this.f.getCurrentTextColor();
        this.i = ra.c(context, R.color.skip_ad_button_inverted_foreground_color);
        TextView textView = this.f;
        this.b = new vzo(textView, this.c, this.h, textView.getTextSize(), this.f.getBackground(), this.f.getAlpha());
        this.l = new ColorDrawable(this.j);
        LinearLayout linearLayout = this.g;
        this.a = new vzq(linearLayout, this.l, linearLayout.getAlpha());
        a(this.x);
        Resources resources = context.getResources();
        this.n = resources.getDimensionPixelSize(R.dimen.skip_button_default_bottom_margin);
        this.o = resources.getDimensionPixelSize(R.dimen.skip_button_cta_bottom_margin);
        this.d = resources.getText(R.string.skip_ads);
    }

    public final void a(boolean z) {
        this.x = z;
        this.b.a(ra.c(getContext(), !z ? R.color.skip_ad_button_foreground_color : R.color.skip_ad_button_high_contrast_foreground_color));
    }

    public final boolean a() {
        return this.m != null;
    }

    public final void setVisibility(int i) {
        if (!this.r && this.q && i == 0) {
            this.r = true;
            this.g.addOnLayoutChangeListener(new vzg(this));
        }
        super.setVisibility(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchDraw(Canvas canvas) {
        int width = this.g.getWidth();
        int height = this.g.getHeight();
        int top = this.g.getTop();
        int left = this.g.getLeft();
        canvas.drawRect((float) left, (float) top, (float) (left + width), (float) (top + height), this.v);
        if (!this.x) {
            canvas.drawLines(new float[]{r0, r11, r10, r11, r10, r11, r10, r1, r10, r1, r0, r1}, this.w);
        }
        super.dispatchDraw(canvas);
    }

    public static void a(Drawable drawable, float f) {
        if (f != 0.0f) {
            int round = Math.round(f * 20.0f);
            ColorFilter colorFilter = (ColorFilter) t.get(round);
            if (colorFilter == null) {
                float f2 = ((float) round) / 20.0f;
                float[] fArr = (float[]) u.clone();
                for (int i = 0; i < fArr.length; i++) {
                    float f3 = fArr[i];
                    if (f3 < 0.0f) {
                        fArr[i] = f3 * f2;
                    }
                }
                ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(fArr);
                drawable.setColorFilter(colorMatrixColorFilter);
                t.put(round, colorMatrixColorFilter);
                return;
            }
            drawable.setColorFilter(colorFilter);
            return;
        }
        drawable.setColorFilter(null);
    }
}
