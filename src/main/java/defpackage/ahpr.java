package defpackage;

import android.os.Looper;

/* renamed from: ahpr */
final class ahpr implements Runnable {
    ahpr() {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
