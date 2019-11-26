package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.amqw;
import java.util.ArrayList;
import java.util.List;

public class SlimMetadataButtonContainerLayout extends ViewGroup {
    private int a;
    private boolean b;
    private List c;
    private SparseIntArray d;
    private int e;
    private boolean f;

    public SlimMetadataButtonContainerLayout(Context context) {
        super(context);
        a(context);
    }

    public SlimMetadataButtonContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public SlimMetadataButtonContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public SlimMetadataButtonContainerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context);
    }

    private final void a(Context context) {
        this.c = new ArrayList();
        this.d = new SparseIntArray();
        this.e = 5;
        this.a = context.getResources().getDimensionPixelSize(R.dimen.slim_metadata_button_max_width);
    }

    public final void a(int i) {
        this.e = i;
        requestLayout();
    }

    public final void a(boolean z) {
        this.f = z;
        requestLayout();
    }

    public final void b(boolean z) {
        this.b = z;
        requestLayout();
    }

    public final void onViewAdded(View view) {
        amqw.b(view instanceof SlimMetadataButtonView);
        this.c.add((SlimMetadataButtonView) view);
    }

    public final void onViewRemoved(View view) {
        if (view instanceof SlimMetadataButtonView) {
            this.c.remove((SlimMetadataButtonView) view);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int size;
        int i3 = this.a * this.e;
        if (MeasureSpec.getMode(i) != 0) {
            size = MeasureSpec.getSize(i);
            if (this.f) {
                i3 = Math.min(size, i3);
            } else if (this.c.size() <= 2) {
                i3 = this.a;
                i3 += i3;
            } else {
                i3 = size;
            }
        }
        size = a();
        if (size == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int a = a(0, size);
        int i4 = i3 / this.e;
        if (!this.f && a > 0) {
            i4 = i3 / Math.max(1, a);
        }
        i3 = 0;
        a = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < size) {
            int a2 = a(i3, size);
            int size2 = this.b ? this.c.size() : a2;
            int i7 = i6;
            i6 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i6 < size2) {
                SlimMetadataButtonView slimMetadataButtonView = (SlimMetadataButtonView) this.c.get(i7);
                boolean z = i6 >= a2;
                slimMetadataButtonView.a = z;
                slimMetadataButtonView.requestLayout();
                slimMetadataButtonView.measure(MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
                if (!z) {
                    i8 += slimMetadataButtonView.getMeasuredWidth();
                    i9 = Math.max(i9, slimMetadataButtonView.getMeasuredHeight());
                }
                i7++;
                i6++;
            }
            int i10 = i2;
            this.d.put(i3, i8);
            i5 += i9;
            a = Math.max(a, i8);
            i3++;
            i6 = i7;
        }
        setMeasuredDimension(a + (getPaddingLeft() + getPaddingRight()), i5 + (getPaddingTop() + getPaddingBottom()));
    }

    private final int a() {
        int size = this.c.size();
        if (this.b) {
            size = Math.min(size, this.e);
        }
        int i = this.e;
        return ((size + i) - 1) / i;
    }

    private final int a(int i, int i2) {
        int size = (this.c.size() + 1) / i2;
        if (i2 == 1 || this.b) {
            size = Math.min(this.c.size(), this.e);
        }
        return (i < i2 - ((size * i2) - this.c.size()) || this.b) ? size : size - 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int a = a();
        if (a == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int paddingTop = getPaddingTop();
        int i6 = 0;
        int i7 = 0;
        while (i6 < a) {
            int i8 = (i5 - this.d.get(i6)) / 2;
            int a2 = a(i6, a);
            if (this.b) {
                a2 = this.c.size();
            }
            int i9 = i7;
            int i10 = i8;
            i7 = 0;
            i8 = 0;
            while (i7 < a2) {
                int i11;
                SlimMetadataButtonView slimMetadataButtonView = (SlimMetadataButtonView) this.c.get(i9);
                int measuredWidth = slimMetadataButtonView.getMeasuredWidth();
                int measuredHeight = slimMetadataButtonView.getMeasuredHeight();
                measuredWidth += i10;
                if (abe.g(this) == 1) {
                    i11 = i5 - i10;
                    i10 = i5 - measuredWidth;
                } else {
                    i11 = measuredWidth;
                }
                slimMetadataButtonView.layout(i10, paddingTop, i11, slimMetadataButtonView.getMeasuredHeight() + paddingTop);
                i8 = Math.max(i8, measuredHeight);
                i9++;
                i7++;
                i10 = measuredWidth;
            }
            paddingTop += i8;
            i6++;
            i7 = i9;
        }
    }
}
