package com.google.android.libraries.quantum.fab;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.youtube.R;
import defpackage.ufl;

public class FloatingActionButton extends ImageView {
    private int a;
    private int b;
    private int c;

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ufl.a, i, R.style.QuantumFloatingActionButton);
        int color = obtainStyledAttributes.getColor(ufl.c, 0);
        int color2 = obtainStyledAttributes.getColor(ufl.d, 0);
        int i2 = obtainStyledAttributes.getInt(ufl.e, 0);
        if (VERSION.SDK_INT >= 21) {
            setElevation(obtainStyledAttributes.getDimension(ufl.b, 0.0f));
        }
        if (!(this.b == color && this.c == color2)) {
            Drawable drawable;
            this.b = color;
            this.c = color2;
            GradientDrawable a = a(color);
            try {
                drawable = (Drawable) Class.forName("android.graphics.drawable.RippleDrawable").getConstructor(new Class[]{ColorStateList.class, Drawable.class, Drawable.class}).newInstance(new Object[]{ColorStateList.valueOf(color2), a, null});
            } catch (Exception unused) {
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, a(color2));
                stateListDrawable.addState(new int[0], a(17170445));
                drawable = new LayerDrawable(new Drawable[]{a, stateListDrawable});
            }
            color = getPaddingTop();
            i = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            setBackgroundDrawable(drawable);
            setPadding(i, color, paddingRight, paddingBottom);
        }
        Resources resources = getResources();
        if (i2 != 1) {
            this.a = resources.getDimensionPixelSize(R.dimen.quantum_fab_diameter_default);
            color = resources.getDimensionPixelSize(R.dimen.quantum_fab_padding_default);
        } else {
            this.a = resources.getDimensionPixelSize(R.dimen.quantum_fab_diameter_mini);
            color = resources.getDimensionPixelSize(R.dimen.quantum_fab_padding_mini);
        }
        setScaleType(ScaleType.CENTER_INSIDE);
        setPadding(color, color, color, color);
        requestLayout();
        obtainStyledAttributes.recycle();
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        StateListAnimator stateListAnimator = new StateListAnimator();
        int[] iArr = new int[]{16842910, 16842919};
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        String str = "translationZ";
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(str, new float[]{getElevation()});
        stateListAnimator.addState(iArr, ObjectAnimator.ofPropertyValuesHolder(this, propertyValuesHolderArr));
        iArr = new int[0];
        propertyValuesHolderArr = new PropertyValuesHolder[1];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(str, new float[]{0.0f});
        stateListAnimator.addState(iArr, ObjectAnimator.ofPropertyValuesHolder(this, propertyValuesHolderArr));
        setStateListAnimator(stateListAnimator);
    }

    public final LayoutParams getLayoutParams() {
        LayoutParams layoutParams = super.getLayoutParams();
        if (layoutParams != null) {
            int i = this.a;
            layoutParams.height = i;
            layoutParams.width = i;
        }
        return layoutParams;
    }

    private static GradientDrawable a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}
