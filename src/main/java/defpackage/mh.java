package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

/* renamed from: mh */
final class mh extends ConstantState {
    private final ConstantState a;

    public mh(ConstantState constantState) {
        this.a = constantState;
    }

    public final Drawable newDrawable() {
        lz lzVar = new lz();
        lzVar.e = (VectorDrawable) this.a.newDrawable();
        return lzVar;
    }

    public final Drawable newDrawable(Resources resources) {
        lz lzVar = new lz();
        lzVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return lzVar;
    }

    public final Drawable newDrawable(Resources resources, Theme theme) {
        lz lzVar = new lz();
        lzVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return lzVar;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
}
