package com.google.android.libraries.youtube.conversation.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;
import defpackage.aab;
import defpackage.abe;
import defpackage.akle;
import defpackage.aygk;
import defpackage.xnk;
import defpackage.xwn;
import java.util.ArrayList;
import java.util.List;

public class FacePileView extends FrameLayout {
    public xnk a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;
    private final aab f;
    private final List g;

    public FacePileView(Context context) {
        this(context, null);
    }

    public FacePileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FacePileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new aab(10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xwn.c);
        this.b = obtainStyledAttributes.getDimensionPixelSize(xwn.g, context.getResources().getDimensionPixelSize(R.dimen.conversation_facepile_border_size));
        this.c = obtainStyledAttributes.getDimensionPixelSize(xwn.f, context.getResources().getDimensionPixelSize(R.dimen.conversation_facepile_offset));
        this.d = obtainStyledAttributes.getDimensionPixelSize(xwn.d, context.getResources().getDimensionPixelSize(R.dimen.conversation_facepile_stroke_width));
        this.e = obtainStyledAttributes.getBoolean(xwn.e, false);
        obtainStyledAttributes.recycle();
        this.g = new ArrayList();
    }

    public final void a(List list, int i) {
        View childAt;
        this.g.clear();
        this.g.addAll(list);
        while (getChildCount() > list.size()) {
            childAt = getChildAt(getChildCount() - 1);
            removeView(childAt);
            this.f.a(childAt);
        }
        while (getChildCount() < list.size()) {
            childAt = (View) this.f.a();
            if (childAt == null) {
                childAt = new FrameLayout(getContext());
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                Paint paint = shapeDrawable.getPaint();
                paint.setStyle(Style.STROKE);
                paint.setStrokeWidth((float) this.d);
                int i2 = this.b;
                childAt.setLayoutParams(new LayoutParams(i2, i2));
                childAt.setBackground(new InsetDrawable(shapeDrawable, this.d / 2));
                CircularImageView circularImageView = new CircularImageView(getContext(), null);
                i2 = this.b;
                int i3 = this.d;
                i2 -= i3 + i3;
                circularImageView.setLayoutParams(new LayoutParams(i2, i2, 17));
                childAt.setTag(R.id.image_view_controller_tag, new akle(this.a, circularImageView));
                childAt.setTag(R.id.background_paint_tag, paint);
                childAt.addView(circularImageView);
            }
            addView(childAt);
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt2 = getChildAt(i4);
            ((akle) childAt2.getTag(R.id.image_view_controller_tag)).a((aygk) list.get(i4));
            ((Paint) childAt2.getTag(R.id.background_paint_tag)).setColor(i);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int g = abe.g(this);
        boolean z2 = g == 1;
        if (g == 1) {
            g = getPaddingRight();
        } else {
            g = getPaddingLeft();
        }
        i2 = getChildCount();
        i4 = 0;
        while (i4 < i2) {
            int childCount = z2 != this.e ? (getChildCount() - 1) - i4 : i4;
            View childAt = getChildAt(i4);
            childCount *= this.c;
            int i5 = this.b;
            childAt.layout(childCount + g, 0, (childCount + i5) + g, i5);
            i4++;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        for (i = 0; i < getChildCount(); i++) {
            i2 = MeasureSpec.makeMeasureSpec(this.b, 1073741824);
            getChildAt(i).measure(i2, i2);
        }
        setMeasuredDimension(((getPaddingLeft() + getPaddingRight()) + this.b) + (this.c * (getChildCount() - 1)), (getPaddingTop() + getPaddingBottom()) + this.b);
    }
}
