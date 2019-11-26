package defpackage;

import android.os.CountDownTimer;

/* renamed from: acqu */
final class acqu extends CountDownTimer {
    private final /* synthetic */ acqr a;

    acqu(acqr acqr, long j) {
        this.a = acqr;
        super(j, 1000);
    }

    public final void onTick(long j) {
        this.a.b = j;
    }

    public final void onFinish() {
        acqw acqw = this.a.a;
        if (acqw != null) {
            acqw.f();
        }
    }
}
