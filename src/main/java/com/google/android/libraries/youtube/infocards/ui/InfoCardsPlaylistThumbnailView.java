package com.google.android.libraries.youtube.infocards.ui;

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
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.ajrc;
import defpackage.ra;
import defpackage.xwe;
import defpackage.zty;

public class InfoCardsPlaylistThumbnailView extends ViewGroup {
    public ImageView a;
    public YouTubeTextView b;
    private Rect c;
    private Rect d;
    private Paint e;
    private float f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private Drawable k;
    private Rect l;

    public InfoCardsPlaylistThumbnailView(Context context) {
        super(context);
        a(context, null, 0, 0);
    }

    public InfoCardsPlaylistThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    public InfoCardsPlaylistThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public InfoCardsPlaylistThumbnailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = new Rect();
        this.d = new Rect();
        this.a = new ImageView(context);
        this.a.setScaleType(ScaleType.CENTER_CROP);
        this.b = new YouTubeTextView(context);
        this.b.setTypeface(ajrc.ROBOTO_REGULAR.a(context));
        this.b.setGravity(81);
        this.e = new Paint();
        this.e.setStyle(Style.FILL);
        this.i = true;
        Resources resources = getResources();
        this.f = resources.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zty.a, i, i2);
        this.j = obtainStyledAttributes.getBoolean(zty.g, false);
        this.b.setTextSize(0, obtainStyledAttributes.getDimension(zty.d, resources.getDimension(R.dimen.large_font_size)));
        this.b.setTextColor(obtainStyledAttributes.getColor(zty.c, xwe.a(context, R.attr.ytTextPrimary, 0)));
        i = obtainStyledAttributes.getResourceId(zty.b, 0);
        if (i != 0) {
            this.k = ra.a(context, i);
        }
        this.g = resources.getColor(obtainStyledAttributes.getResourceId(zty.e, R.color.info_card_thumbnail_overlay_background_solid));
        this.h = resources.getColor(obtainStyledAttributes.getResourceId(zty.f, R.color.info_card_thumbnail_overlay_background_transparent));
        obtainStyledAttributes.recycle();
        this.l = new Rect();
        addView(this.a);
        addView(this.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (MeasureSpec.getMode(i) == 1073741824) {
            i2 = MeasureSpec.getSize(i);
            i3 = (int) (((float) i2) / this.f);
            i4 = i;
            i = i3;
            i3 = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        } else if (MeasureSpec.getMode(i2) == 1073741824) {
            i = MeasureSpec.getSize(i2);
            i3 = (int) (((float) i) * this.f);
            i4 = MeasureSpec.makeMeasureSpec(i3, 1073741824);
            int i6 = i3;
            i3 = i2;
            i2 = i6;
        } else {
            i4 = i;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (i2 > 0 && i > 0) {
            if (this.j) {
                this.a.measure(i3, i3);
            } else {
                this.a.measure(i4, i3);
            }
            if (a()) {
                this.d.set(0, 0, i2 - i, i);
            } else {
                this.d.set(i, 0, i2, i);
            }
            this.c.set(this.d.left, (this.d.top + (this.d.height() / 2)) + ((int) (((float) i) * 0.1f)), this.d.right, this.d.bottom);
            this.b.measure(MeasureSpec.makeMeasureSpec(this.d.width(), 1073741824), MeasureSpec.makeMeasureSpec(this.d.height() / 2, 1073741824));
            int childCount = getChildCount();
            if (childCount > 2) {
                while (i5 < childCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == this.a || childAt == this.b)) {
                        childAt.measure(i4, i3);
                    }
                    i5++;
                }
            }
        }
        setMeasuredDimension(i2, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        i3 -= i;
        i4 -= i2;
        if (a()) {
            i5 = i3 - i4;
            this.b.layout(0, 0, i5, i4 / 2);
        } else {
            this.b.layout(i4, 0, i3, i4 / 2);
            i5 = 0;
        }
        if (this.j) {
            this.a.layout(i5, 0, i4 + i5, i4);
        } else {
            this.a.layout(0, 0, i3, i4);
        }
        Drawable drawable = this.k;
        Rect rect = this.c;
        if (!(rect.width() == 0 || rect.height() == 0)) {
            i2 = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int width = rect.width();
            int height = rect.height();
            if (i2 <= width && intrinsicHeight <= height) {
                width = i2;
                height = intrinsicHeight;
            } else {
                float f = (float) width;
                float f2 = ((float) i2) / f;
                float f3 = (float) height;
                float f4 = ((float) intrinsicHeight) / f3;
                if (f2 > f4) {
                    height = (int) (f3 / f2);
                } else {
                    width = (int) (f / f4);
                }
            }
            Gravity.apply(49, width, height, rect, this.l, abe.g(this));
            drawable.setBounds(this.l.left, this.l.top, this.l.right, this.l.bottom);
        }
        i5 = getChildCount();
        if (i5 > 2) {
            for (i2 = 0; i2 < i5; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt == this.a || childAt == this.b)) {
                    childAt.layout(0, 0, i3, i4);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.i && view == this.a) {
            int i;
            if (this.j) {
                i = this.g;
            } else {
                i = this.h;
            }
            this.e.setColor(i);
            canvas.drawRect(this.d, this.e);
            Drawable drawable = this.k;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
        return drawChild;
    }

    private final boolean a() {
        return abe.g(this) == 1;
    }
}
