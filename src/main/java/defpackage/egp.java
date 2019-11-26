package defpackage;

import android.os.Bundle;

/* renamed from: egp */
public final class egp extends egj {
    public egs a;

    public egp(nn nnVar, exu exu) {
        super(nnVar, exu, "ProgressBarDialogFragment");
    }

    public final void h() {
        if (e() == null) {
            egl egl = new egl();
            Bundle bundle = new Bundle();
            bundle.putDouble("progressbar_height", 0.5d);
            bundle.putDouble("progressbar_width", 0.5d);
            egl.f(bundle);
            amqw.b(true);
            a(egl);
        }
    }
}
