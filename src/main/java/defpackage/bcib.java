package defpackage;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.os.SystemClock;
import android.util.Log;
import org.chromium.base.TraceEvent;

/* renamed from: bcib */
public final class bcib extends bcic implements IdleHandler {
    private long a;
    private long b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    private bcib() {
        super();
    }

    private final void a() {
        if (TraceEvent.a && !this.f) {
            this.a = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler(this);
            this.f = true;
        } else if (this.f && !TraceEvent.a) {
            Looper.myQueue().removeIdleHandler(this);
            this.f = false;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        if (this.e == 0) {
            TraceEvent.a("Looper.queueIdle");
        }
        this.b = SystemClock.elapsedRealtime();
        a();
        super.a(str);
    }

    /* Access modifiers changed, original: final */
    public final void b(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        if (elapsedRealtime > 16) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("observed a task that took ");
            stringBuilder.append(elapsedRealtime);
            stringBuilder.append("ms: ");
            stringBuilder.append(str);
            bcib.a(5, stringBuilder.toString());
        }
        super.b(str);
        a();
        this.c++;
        this.e++;
    }

    private static void a(int i, String str) {
        if (TraceEvent.a) {
            TraceEvent.nativeInstant("TraceEvent.LooperMonitor:IdleStats", str);
        }
        Log.println(i, "TraceEvent.LooperMonitor", str);
    }

    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.a;
        if (j == 0) {
            this.a = elapsedRealtime;
            j = elapsedRealtime;
        }
        j = elapsedRealtime - j;
        this.d++;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e);
        stringBuilder.append(" tasks since last idle.");
        TraceEvent.a("Looper.queueIdle", stringBuilder.toString());
        if (j > 48) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append(" tasks and ");
            stringBuilder.append(this.d);
            stringBuilder.append(" idles processed so far, ");
            stringBuilder.append(this.e);
            stringBuilder.append(" tasks bursted and ");
            stringBuilder.append(j);
            stringBuilder.append("ms elapsed since last idle");
            bcib.a(3, stringBuilder.toString());
        }
        this.a = elapsedRealtime;
        this.e = 0;
        return true;
    }

    /* synthetic */ bcib(byte b) {
        super();
    }
}
