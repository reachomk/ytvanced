package defpackage;

import android.os.CountDownTimer;

/* renamed from: vbv */
final class vbv extends CountDownTimer {
    private final /* synthetic */ vbs a;

    vbv(vbs vbs, long j) {
        this.a = vbs;
        super(j, 1000);
    }

    public final void onTick(long j) {
        this.a.a = j;
    }

    public final void onFinish() {
        vbx vbx = this.a.b;
        if (vbx != null) {
            vbx.aa();
        }
    }
}
