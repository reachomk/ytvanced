package defpackage;

import android.os.SystemClock;
import java.util.Deque;

/* renamed from: dah */
final class dah implements Runnable {
    private final /* synthetic */ Deque a;
    private final /* synthetic */ boolean b;

    dah(Deque deque, boolean z) {
        this.a = deque;
        this.b = z;
    }

    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        while (!this.a.isEmpty()) {
            ((cyi) this.a.pollFirst()).a(this.b, uptimeMillis);
        }
    }
}
