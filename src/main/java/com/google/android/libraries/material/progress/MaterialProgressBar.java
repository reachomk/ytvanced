package com.google.android.libraries.material.progress;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.provider.Settings.Global;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.youtube.R;
import defpackage.ra;
import defpackage.tsp;
import defpackage.tss;
import defpackage.tst;
import defpackage.tsx;
import defpackage.ttb;
import defpackage.ttf;
import defpackage.tth;

public class MaterialProgressBar extends ProgressBar {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private tst f;
    private Drawable g;

    private MaterialProgressBar(Context context) {
        super(context, null, 16842872);
        c();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
        a(context, attributeSet, 0);
        d();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
        a(context, attributeSet, i);
        d();
    }

    private final void c() {
        super.getProgress();
    }

    private final void d() {
        e();
        if (isIndeterminate()) {
            getProgressDrawable().setVisible(false, false);
            getIndeterminateDrawable().setVisible(g(), true);
            return;
        }
        getProgressDrawable().setVisible(g(), true);
        getIndeterminateDrawable().setVisible(false, false);
    }

    private final void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tth.a, i, R.style.f675Widget.GoogleLib.Progress.Circular.Indeterminate.Large);
        this.d = obtainStyledAttributes.getDimensionPixelSize(tth.f, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(tth.g, 0);
        int i2 = obtainStyledAttributes.getInt(tth.e, 0);
        this.a = i2;
        String str = "Invalid determinate progress style";
        if (i2 == 0) {
            a(obtainStyledAttributes, true);
        } else if (i2 == 1 || i2 == 2) {
            b(obtainStyledAttributes, true);
        } else {
            throw new IllegalArgumentException(str);
        }
        i2 = obtainStyledAttributes.getInt(tth.d, 1);
        this.b = i2;
        if (i2 == 0) {
            a(obtainStyledAttributes, false);
        } else if (i2 == 1) {
            b(obtainStyledAttributes, false);
        } else {
            throw new IllegalArgumentException(str);
        }
        obtainStyledAttributes.recycle();
    }

    public final synchronized void setIndeterminate(boolean z) {
        super.setIndeterminate(z);
        e();
        Drawable h = h();
        if (h != null) {
            h.setVisible(g(), false);
        }
    }

    private final void e() {
        if (isIndeterminate()) {
            if (this.a != 0) {
                setMinimumHeight(this.d);
            } else {
                setMinimumHeight(0);
            }
        } else if (this.b != 0) {
            setMinimumHeight(this.d);
        } else {
            setMinimumHeight(0);
        }
    }

    private final void a(TypedArray typedArray, boolean z) {
        int[] intArray;
        int dimensionPixelSize;
        int i = typedArray.getInt(tth.i, 3);
        if (typedArray.hasValue(tth.c)) {
            intArray = getResources().getIntArray(typedArray.getResourceId(tth.c, -1));
        } else if (typedArray.hasValue(tth.b)) {
            intArray = new int[]{typedArray.getColor(tth.b, 0)};
        } else {
            intArray = null;
        }
        if (intArray == null) {
            intArray = getResources().getIntArray(R.array.material_google_colors);
        }
        String str = "Invalid progress circle size";
        if (i == 1) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_size_small);
        } else if (i == 2) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_size_medium);
        } else if (i == 3) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_size_large);
        } else {
            throw new IllegalStateException(str);
        }
        this.c = dimensionPixelSize;
        if (i == 1) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_stroke_width_small);
        } else if (i == 2) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_stroke_width_medium);
        } else if (i == 3) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_stroke_width_large);
        } else {
            throw new IllegalStateException(str);
        }
        if (i == 1) {
            i = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_inset_small);
        } else if (i == 2) {
            i = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_inset_medium);
        } else if (i == 3) {
            i = getResources().getDimensionPixelSize(R.dimen.material_progress_circle_inset_large);
        } else {
            throw new IllegalStateException(str);
        }
        if (z) {
            this.g = ra.a(getContext(), (int) R.drawable.quantum_ic_sync_grey600_24);
            this.f = new tst(dimensionPixelSize, i, intArray);
            setIndeterminateDrawable(this.f);
            return;
        }
        setProgressDrawable(new tss(dimensionPixelSize, i, intArray[0]));
    }

    private final void b(TypedArray typedArray, boolean z) {
        int color;
        if (typedArray.hasValue(tth.b)) {
            color = typedArray.getColor(tth.b, -1);
        } else {
            color = getResources().getColor(R.color.quantum_googblue);
        }
        int i = color;
        int color2 = typedArray.getColor(tth.j, -1);
        Theme theme = getContext().getTheme();
        int[] iArr = new int[1];
        boolean z2 = false;
        iArr[0] = 16842803;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(iArr);
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        int i2 = typedArray.getInt(tth.h, 0);
        float f2 = color2 != -1 ? 1.0f : f;
        if (z) {
            int i3 = this.d;
            if (this.a == 2) {
                z2 = true;
            }
            setIndeterminateDrawable(new ttb(i3, i, color2, f2, z2, a(i2)));
            return;
        }
        setProgressDrawable(new tsx(this.d, i, color2, f2, a(i2)));
    }

    private static int a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        StringBuilder stringBuilder = new StringBuilder(59);
        stringBuilder.append("Invalid attribute value for mtrlLinearGrowFrom: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private final int f() {
        return !isIndeterminate() ? this.b : this.a;
    }

    /* JADX WARNING: Missing block: B:10:0x001d, code skipped:
            if (getWindowVisibility() == 0) goto L_0x0027;
     */
    private final boolean g() {
        /*
        r2 = this;
        r0 = defpackage.abe.H(r2);
        if (r0 == 0) goto L_0x0029;
    L_0x0006:
        r0 = r2.getWindowVisibility();
        if (r0 != 0) goto L_0x0029;
    L_0x000c:
        r0 = r2;
    L_0x000d:
        r1 = r0.getVisibility();
        if (r1 != 0) goto L_0x0029;
    L_0x0013:
        r0 = r0.getParent();
        if (r0 != 0) goto L_0x0020;
    L_0x0019:
        r0 = r2.getWindowVisibility();
        if (r0 != 0) goto L_0x0029;
    L_0x001f:
        goto L_0x0027;
    L_0x0020:
        r1 = r0 instanceof android.view.View;
        if (r1 == 0) goto L_0x0027;
    L_0x0024:
        r0 = (android.view.View) r0;
        goto L_0x000d;
    L_0x0027:
        r0 = 1;
        return r0;
    L_0x0029:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.material.progress.MaterialProgressBar.g():boolean");
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        h().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        if (h() instanceof tsp) {
            ((tsp) h()).a();
        }
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            a();
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (f() == 0) {
            setMeasuredDimension((this.c + getPaddingLeft()) + getPaddingRight(), (this.c + getPaddingTop()) + getPaddingBottom());
            return;
        }
        i = getMeasuredWidth();
        int i3 = this.d;
        int i4 = this.e;
        setMeasuredDimension(i, resolveSizeAndState((((i3 + i4) + i4) + getPaddingTop()) + getPaddingBottom(), i2, 0));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (f() != 0) {
            i -= getPaddingLeft() + getPaddingRight();
            i2 -= getPaddingTop() + getPaddingBottom();
            Drawable indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setBounds(0, 0, i, i2);
            }
            indeterminateDrawable = getProgressDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setBounds(0, 0, i, i2);
            }
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    private final Drawable h() {
        return !isIndeterminate() ? getProgressDrawable() : getIndeterminateDrawable();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        i();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        i();
    }

    private final void i() {
        if (f() == 0 && isIndeterminate()) {
            Context context = getContext();
            if (Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f || (VERSION.SDK_INT >= 21 && ((PowerManager) context.getSystemService("power")).isPowerSaveMode())) {
                if (h() != this.g) {
                    this.f.a();
                    this.f.setCallback(null);
                    unscheduleDrawable(this.f);
                    setIndeterminateDrawable(this.g);
                    onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
                }
            } else if (h() != this.f) {
                this.g.setVisible(false, false);
                this.g.setCallback(null);
                unscheduleDrawable(this.g);
                setIndeterminateDrawable(this.f);
                onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
            }
        }
        Drawable h = h();
        if (h != null) {
            boolean g = g();
            if ((h instanceof tsp) && !g) {
                ((tsp) h).a();
                return;
            }
            h.setVisible(g, true);
        }
    }

    public final void a() {
        if (getVisibility() != 0) {
            setVisibility(0);
        } else if (g()) {
            h().setVisible(true, false);
        }
    }

    public final void b() {
        if (g()) {
            Drawable h = h();
            if (h instanceof tsp) {
                ((tsp) h).a(new ttf(this));
                return;
            } else {
                setVisibility(4);
                return;
            }
        }
        setVisibility(4);
    }

    static {
        MaterialProgressBar.class.getSimpleName();
    }
}
