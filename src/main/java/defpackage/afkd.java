package defpackage;

import android.content.Context;
import android.view.SurfaceHolder.Callback;

/* renamed from: afkd */
public final class afkd extends afkc implements afkh, Callback {
    public afkd(Context context) {
        super(context);
        this.a.setSecure(true);
    }

    public final afkn o() {
        return afkn.SECURE_SURFACE;
    }
}
