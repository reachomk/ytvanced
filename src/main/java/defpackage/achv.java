package defpackage;

import android.os.Process;

/* renamed from: achv */
final /* synthetic */ class achv implements Runnable {
    private final achs a;

    achv(achs achs) {
        this.a = achs;
    }

    public final void run() {
        achs achs = this.a;
        try {
            Process.setThreadPriority(-2);
            achs.g();
            achs.c = true;
            achs.a = null;
        } catch (Throwable th) {
            achs.c = true;
            achs.a = null;
            throw th;
        }
    }
}
