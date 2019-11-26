package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: anqn */
public final class anqn {
    private static anqn c;
    public final Context a;
    public final ScheduledExecutorService b;
    private anos d = new anos(this);
    private int e = 1;

    public static synchronized anqn a(Context context) {
        anqn anqn;
        synchronized (anqn.class) {
            if (c == null) {
                c = new anqn(context, Executors.newSingleThreadScheduledExecutor());
            }
            anqn = c;
        }
        return anqn;
    }

    private anqn(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public final synchronized ryi a(anox anox) {
        if (!this.d.a(anox)) {
            this.d = new anos(this);
            this.d.a(anox);
        }
        return anox.b.a;
    }

    public final synchronized int a() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }
}
