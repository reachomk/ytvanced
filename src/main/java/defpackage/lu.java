package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: lu */
final class lu extends ConstantState {
    private final ConstantState a;

    public lu(ConstantState constantState) {
        this.a = constantState;
    }

    public final Drawable newDrawable() {
        lq lqVar = new lq();
        lqVar.e = this.a.newDrawable();
        lqVar.e.setCallback(lqVar.d);
        return lqVar;
    }

    public final Drawable newDrawable(Resources resources) {
        lq lqVar = new lq();
        lqVar.e = this.a.newDrawable(resources);
        lqVar.e.setCallback(lqVar.d);
        return lqVar;
    }

    public final Drawable newDrawable(Resources resources, Theme theme) {
        lq lqVar = new lq();
        lqVar.e = this.a.newDrawable(resources, theme);
        lqVar.e.setCallback(lqVar.d);
        return lqVar;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
}
