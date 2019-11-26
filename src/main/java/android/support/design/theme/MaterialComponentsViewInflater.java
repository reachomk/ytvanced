package android.support.design.theme;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.design.button.MaterialButton;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import defpackage.afj;
import defpackage.akx;
import defpackage.alg;
import defpackage.fn;
import defpackage.he;

public class MaterialComponentsViewInflater extends afj {
    public static int floatingToolbarItemBackgroundResId = -1;

    /* Access modifiers changed, original: protected */
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        if (shouldInflateAppCompatButton(context, attributeSet)) {
            return new AppCompatButton(context, attributeSet);
        }
        return new MaterialButton(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public boolean shouldInflateAppCompatButton(Context context, AttributeSet attributeSet) {
        if (VERSION.SDK_INT != 23 && VERSION.SDK_INT != 24 && VERSION.SDK_INT != 25) {
            return false;
        }
        if (floatingToolbarItemBackgroundResId == -1) {
            floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
        }
        int i = floatingToolbarItemBackgroundResId;
        if (!(i == 0 || i == -1)) {
            i = 0;
            while (i < attributeSet.getAttributeCount()) {
                if (attributeSet.getAttributeNameResource(i) == 16842964 && floatingToolbarItemBackgroundResId == attributeSet.getAttributeListValue(i, null, 0)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public akx createCheckBox(Context context, AttributeSet attributeSet) {
        return new fn(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public alg createRadioButton(Context context, AttributeSet attributeSet) {
        return new he(context, attributeSet);
    }
}
