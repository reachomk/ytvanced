package defpackage;

import android.os.Looper;

/* renamed from: afhp */
final class afhp implements Runnable {
    private final /* synthetic */ afhn a;

    afhp(afhn afhn) {
        this.a = afhn;
    }

    public final void run() {
        afhn afhn = this.a;
        afhn.b.unregisterListener(afhn);
        Looper.myLooper().quit();
    }
}
