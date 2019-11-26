package com.google.android.apps.youtube.app.ui.ads;

import android.content.Context;
import android.support.design.textfield.TextInputLayout;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;

public class BaselineAlignableTextInputLayout extends TextInputLayout {
    public BaselineAlignableTextInputLayout(Context context) {
        super(context);
    }

    public BaselineAlignableTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaselineAlignableTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final int getBaseline() {
        EditText editText = this.a;
        if (editText == null) {
            return super.getBaseline();
        }
        ViewParent parent = editText.getParent();
        if (parent instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) parent;
            if (frameLayout.getLayoutParams() instanceof LayoutParams) {
                return (editText.getBaseline() + ((LayoutParams) frameLayout.getLayoutParams()).topMargin) + getPaddingTop();
            }
        }
        return super.getBaseline();
    }
}
