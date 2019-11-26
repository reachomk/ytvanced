package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: cvn */
public final class cvn extends cvo {
    public cvn(Drawable drawable) {
        super(drawable);
    }

    public final boolean a(cvl cvl) {
        if (this == cvl) {
            return true;
        }
        if (cvl instanceof cvn) {
            return this.a.equals(((cvn) cvl).a);
        }
        return false;
    }
}
