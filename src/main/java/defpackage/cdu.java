package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: cdu */
final class cdu extends ConstantState {
    public final cdy a;

    cdu(cdy cdy) {
        this.a = cdy;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable(Resources resources) {
        return newDrawable();
    }

    public final Drawable newDrawable() {
        return new cdr(this);
    }
}
