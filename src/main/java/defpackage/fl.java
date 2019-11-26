package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.design.button.MaterialButton;

/* renamed from: fl */
public final class fl {
    public static final boolean a = (VERSION.SDK_INT >= 21);
    public final MaterialButton b;
    public final ia c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Mode j;
    public ColorStateList k;
    public ColorStateList l;
    public ColorStateList m;
    public hu n;
    public final boolean o = false;
    public boolean p = false;
    public boolean q;
    public LayerDrawable r;

    public fl(MaterialButton materialButton, ia iaVar) {
        this.b = materialButton;
        this.c = iaVar;
    }

    public final InsetDrawable a(Drawable drawable) {
        return new InsetDrawable(drawable, this.d, this.f, this.e, this.g);
    }

    public final hu a() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (a) {
            return (hu) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(1);
        }
        return (hu) this.r.getDrawable(1);
    }
}
