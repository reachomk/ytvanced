package defpackage;

import android.os.CountDownTimer;

/* renamed from: ihf */
final class ihf extends CountDownTimer {
    private final /* synthetic */ ihg a;

    ihf(ihg ihg, long j) {
        this.a = ihg;
        super(j, 1000);
    }

    public final void onTick(long j) {
        this.a.b = j;
    }

    public final void onFinish() {
        ihg ihg = this.a;
        ihg.b = 0;
        ihg.a(vra.ENDCAP_ENDED);
    }
}
