package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: agwd */
public final class agwd implements xcp {
    private static final long a = TimeUnit.MINUTES.toMillis(1);
    private final Context b;
    private final ScheduledExecutorService c;
    private final agwa d;
    private ScheduledFuture e;
    private long f = Long.MAX_VALUE;

    public agwd(Context context, xci xci, ScheduledExecutorService scheduledExecutorService, agwa agwa) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = agwa;
        xci.a((Object) this);
    }

    public final synchronized void a(String str, String str2, long j) {
        try {
            Class cls = Class.forName(str);
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                b(cls, str2);
            }
            if (this.f > j) {
                this.f = j;
            }
        } catch (ClassNotFoundException e) {
            xtl.a("Failed to resolve transfer service.", e);
        }
    }

    private final synchronized void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.e = null;
        }
        this.f = Long.MAX_VALUE;
    }

    private final synchronized void b(Class cls, String str) {
        this.e = this.c.schedule(new agwg(this, cls, str), a, TimeUnit.MILLISECONDS);
    }

    public final synchronized void a(Class cls, String str) {
        if (this.d.c() >= this.f) {
            Context context = this.b;
            xva.a(context, new Intent(context, cls).setAction(str));
            this.f = Long.MAX_VALUE;
            return;
        }
        b(cls, str);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xlz.class, afqh.class};
        } else if (i == 0) {
            a();
            return null;
        } else if (i == 1) {
            a();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
