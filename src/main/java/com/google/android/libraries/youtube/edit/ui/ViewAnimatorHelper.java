package com.google.android.libraries.youtube.edit.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ViewStub;
import android.widget.ViewAnimator;
import defpackage.xsd;

public class ViewAnimatorHelper extends ViewAnimator {
    private final SparseArray a = new SparseArray();

    public ViewAnimatorHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i, xsd xsd) {
        this.a.put(i, xsd);
    }

    public final void a(int i) {
        Object obj = null;
        int i2 = 0;
        while (i2 < getChildCount()) {
            obj = getChildAt(i2);
            if (obj.getId() == i) {
                break;
            }
            i2++;
        }
        if (obj != null) {
            if (obj instanceof ViewStub) {
                obj = ((ViewStub) obj).inflate();
                if (obj.getId() == -1) {
                    obj.setId(i);
                }
            }
            setDisplayedChild(i2);
            xsd xsd = (xsd) this.a.get(i);
            if (xsd != null) {
                xsd.a(obj);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("No such child with id: %s", new Object[]{Integer.valueOf(i)}));
    }

    public final int a() {
        return getChildAt(getDisplayedChild()).getId();
    }
}
