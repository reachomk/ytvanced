package defpackage;

import android.content.Context;
import android.view.SurfaceHolder;

/* renamed from: afke */
public final class afke extends afkc {
    public afke(Context context) {
        super(context);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.getHolder().setFormat(842094169);
        super.surfaceCreated(surfaceHolder);
    }

    public final afkn o() {
        return afkn.YUV_SURFACE;
    }
}
