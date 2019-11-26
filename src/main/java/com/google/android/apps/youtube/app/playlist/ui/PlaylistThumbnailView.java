package com.google.android.apps.youtube.app.playlist.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.ajrc;
import defpackage.imm;
import defpackage.ra;
import defpackage.xoe;
import defpackage.xpr;
import defpackage.xwe;

public class PlaylistThumbnailView extends ViewGroup {
    public ImageView a;
    public YouTubeTextView b;
    private Rect c;
    private Rect d;
    private Paint e;
    private float f;
    private float g;
    private float h;
    private int i;
    private int j;
    private int k;
    private int l;
    private xoe m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private Drawable r;
    private Rect s;
    private int t;

    public PlaylistThumbnailView(Context context) {
        super(context);
        a(context, null, 0, 0);
    }

    public PlaylistThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    public PlaylistThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public PlaylistThumbnailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = new Rect();
        this.d = new Rect();
        this.a = new ImageView(context);
        this.a.setScaleType(ScaleType.CENTER_CROP);
        this.a.setLayoutParams(new LayoutParams(-2, -1));
        this.b = new YouTubeTextView(context);
        this.b.setTypeface(ajrc.ROBOTO_REGULAR.a(context));
        this.b.setGravity(81);
        this.e = new Paint();
        this.e.setStyle(Style.FILL);
        this.o = true;
        this.m = new xoe(context);
        Resources resources = getResources();
        this.f = resources.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, imm.a, i, i2);
        this.p = obtainStyledAttributes.getBoolean(imm.f, false);
        this.g = obtainStyledAttributes.getDimension(imm.c, resources.getDimension(R.dimen.large_font_size));
        this.h = resources.getDimension(R.dimen.full_bleed_mixes_text_label_size);
        this.b.setTextSize(0, this.g);
        int a = xwe.a(context, R.attr.ytOverlayTextPrimary);
        this.n = a;
        this.b.setTextColor(a);
        a = obtainStyledAttributes.getResourceId(imm.b, 0);
        this.i = a;
        this.j = R.drawable.quantum_ic_youtube_mix_white_48;
        a(a);
        this.k = resources.getColor(obtainStyledAttributes.getResourceId(imm.d, R.color.thumbnail_overlay_background_solid));
        this.l = resources.getColor(obtainStyledAttributes.getResourceId(imm.e, R.color.thumbnail_overlay_background_transparent));
        obtainStyledAttributes.recycle();
        this.t = 1;
        this.s = new Rect();
        addView(this.a);
        addView(this.b);
    }

    public final void a(boolean z) {
        if (this.o != z) {
            this.o = z;
            xpr.a(this.b, z);
            invalidate();
        }
    }

    public final void b(boolean z) {
        if (this.p != z) {
            this.p = z;
            requestLayout();
        }
    }

    public final void a(int i) {
        if (i != 0) {
            this.r = ra.a(getContext(), i);
            a(this.r, this.c);
            this.r = xoe.a(this.r, this.n);
        }
        invalidate();
    }

    public final void b(int i) {
        this.b.setTextSize(0, getResources().getDimension(i));
    }

    private final void c(boolean z) {
        float f;
        int i;
        this.q = z;
        YouTubeTextView youTubeTextView = this.b;
        if (z) {
            f = this.h;
        } else {
            f = this.g;
        }
        youTubeTextView.setTextSize(0, f);
        if (z) {
            i = this.j;
        } else {
            i = this.i;
        }
        a(i);
        requestLayout();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int size;
        int i3;
        if (MeasureSpec.getMode(i) == 1073741824 || MeasureSpec.getMode(i2) != 1073741824) {
            size = MeasureSpec.getSize(i);
            i2 = (int) (((float) size) / this.f);
            i3 = i;
            i = i2;
            i2 = MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            i = MeasureSpec.getSize(i2);
            size = (int) (((float) i) * this.f);
            i3 = MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        if (size > 0 && i > 0) {
            if (this.p) {
                this.a.measure(i2, i2);
            } else {
                this.a.measure(i3, i2);
            }
            int i4 = this.q ? (size + size) / 3 : i;
            int i5 = (int) (((float) i) * 0.1f);
            int i6 = this.t;
            int i7 = i6 - 1;
            if (i6 != 0) {
                int i8 = 0;
                if (i7 == 2) {
                    this.d.set(0, i - ((int) getResources().getDimension(R.dimen.full_bleed_mix_icon_size)), size, i);
                    this.c.set(this.d.left, this.d.top, this.d.right, this.d.bottom);
                } else if (i7 != 3) {
                    if (a()) {
                        this.d.set(0, 0, size - i4, i);
                    } else {
                        this.d.set(i4, 0, size, i);
                    }
                    i5 /= 2;
                    this.b.measure(MeasureSpec.makeMeasureSpec(this.d.width(), 1073741824), MeasureSpec.makeMeasureSpec((this.d.height() / 2) - i5, 1073741824));
                    this.c.set(this.d.left, (this.d.top + (this.d.height() / 2)) + i5, this.d.right, this.d.bottom);
                } else {
                    this.d.set(0, 0, size, i);
                    this.c.set(this.d.left, (this.d.top + (this.d.height() / 2)) - (((int) getResources().getDimension(R.dimen.full_bleed_mix_icon_size)) / 2), this.d.right, this.d.bottom);
                }
                int childCount = getChildCount();
                if (childCount > 2) {
                    while (i8 < childCount) {
                        View childAt = getChildAt(i8);
                        if (!(childAt == this.a || childAt == this.b)) {
                            childAt.measure(i3, i2);
                        }
                        i8++;
                    }
                }
            } else {
                throw null;
            }
        }
        setMeasuredDimension(size, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i3 -= i;
        i4 -= i2;
        int i5 = this.q ? (i3 + i3) / 3 : i4;
        if (a()) {
            i5 = i3 - i5;
            this.b.layout(0, 0, i5, i4 / 2);
        } else {
            this.b.layout(i5, 0, i3, i4 / 2);
            i5 = 0;
        }
        if (this.p) {
            this.a.layout(i5, 0, i4 + i5, i4);
        } else {
            this.a.layout(0, 0, i3, i4);
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            a(drawable, this.c);
        }
        i5 = getChildCount();
        if (i5 > 2) {
            for (i = 0; i < i5; i++) {
                View childAt = getChildAt(i);
                if (!(childAt == this.a || childAt == this.b)) {
                    childAt.layout(0, 0, i3, i4);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.o && view == this.a) {
            int i;
            if (this.p) {
                i = this.k;
            } else {
                i = this.l;
            }
            this.e.setColor(i);
            canvas.drawRect(this.d, this.e);
            Drawable drawable = this.r;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
        return drawChild;
    }

    private final boolean a() {
        return abe.g(this) == 1;
    }

    private final void a(Drawable drawable, Rect rect) {
        if (rect.width() != 0 && rect.height() != 0) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int width = rect.width();
            int height = rect.height();
            int i = this.t;
            if (i == 3 || i == 4) {
                intrinsicWidth = (int) getResources().getDimension(R.dimen.full_bleed_mix_icon_size);
                intrinsicHeight = (int) getResources().getDimension(R.dimen.full_bleed_mix_icon_size);
            } else if (intrinsicWidth > width || intrinsicHeight > height) {
                float f = (float) width;
                float f2 = ((float) intrinsicWidth) / f;
                float f3 = (float) height;
                float f4 = ((float) intrinsicHeight) / f3;
                height = f2 > f4 ? (int) (f / f2) : (int) (f3 / f4);
                i = height;
                Gravity.apply(49, height, i, rect, this.s, abe.g(this));
                drawable.setBounds(this.s.left, this.s.top, this.s.right, this.s.bottom);
            }
            height = intrinsicWidth;
            i = intrinsicHeight;
            Gravity.apply(49, height, i, rect, this.s, abe.g(this));
            drawable.setBounds(this.s.left, this.s.top, this.s.right, this.s.bottom);
        }
    }

    public final void c(int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                c(true);
            } else if (i2 == 2 || i2 == 3) {
                removeView(this.b);
                c(true);
            } else {
                c(false);
            }
            this.t = i;
            return;
        }
        throw null;
    }
}
