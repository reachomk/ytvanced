package defpackage;

import android.os.SystemClock;

/* renamed from: oyf */
public final class oyf {
    private boolean a;

    public final synchronized boolean a() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean b() {
        boolean z;
        z = this.a;
        this.a = false;
        return z;
    }

    public final synchronized void c() {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized boolean a(long j) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        j += elapsedRealtime;
        while (true) {
            z = this.a;
            if (!z && elapsedRealtime < j) {
                wait(j - elapsedRealtime);
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        return z;
    }
}
