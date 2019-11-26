package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;

/* renamed from: ta */
final class ta extends ConstantState {
    public int a;
    public ConstantState b;
    public ColorStateList c = null;
    public Mode d = sy.a;

    ta(ta taVar) {
        if (taVar != null) {
            this.a = taVar.a;
            this.b = taVar.b;
            this.c = taVar.c;
            this.d = taVar.d;
        }
    }

    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    public final Drawable newDrawable(Resources resources) {
        if (VERSION.SDK_INT >= 21) {
            return new tb(this, resources);
        }
        return new sy(this, resources);
    }

    public final int getChangingConfigurations() {
        int i = this.a;
        ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }
}
