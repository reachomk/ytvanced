package defpackage;

import android.os.SystemClock;

/* renamed from: affm */
final class affm implements affo {
    private long a;

    private affm() {
    }

    public final void a() {
        this.a = SystemClock.elapsedRealtimeNanos();
    }

    public final void a(boolean z) {
        if (this.a != 0) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = this.a;
            StringBuilder stringBuilder = new StringBuilder(48);
            stringBuilder.append("deltaNs=");
            stringBuilder.append(elapsedRealtimeNanos - j);
            stringBuilder.append(" wasSuccessful=");
            stringBuilder.append(z);
            xtl.c("MVFE.Profiler", stringBuilder.toString());
            this.a = 0;
        }
    }

    /* synthetic */ affm(byte b) {
    }
}
