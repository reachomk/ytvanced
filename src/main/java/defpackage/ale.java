package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: ale */
final class ale extends PopupWindow {
    private static final boolean a = (VERSION.SDK_INT < 21);
    private boolean b;

    public ale(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        arz a = arz.a(context, attributeSet, afy.bG, i, i2);
        if (a.h(afy.bI)) {
            boolean a2 = a.a(afy.bI, false);
            if (a) {
                this.b = a2;
            } else {
                adi.a((PopupWindow) this, a2);
            }
        }
        setBackgroundDrawable(a.a(afy.bH));
        a.a();
    }

    public final void showAsDropDown(View view, int i, int i2) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void update(View view, int i, int i2, int i3, int i4) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
