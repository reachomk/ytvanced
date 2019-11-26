package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.anc;
import defpackage.ane;

public class FitWindowsFrameLayout extends FrameLayout implements anc {
    private ane a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(ane ane) {
        this.a = ane;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean fitSystemWindows(Rect rect) {
        ane ane = this.a;
        if (ane != null) {
            ane.a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
