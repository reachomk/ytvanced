package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: bbhf */
public final class bbhf {
    private static final bbhf c = new bbhf(new bbhi());
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;
    private final bbhm d;

    private bbhf(bbhm bbhm) {
        this.d = bbhm;
    }

    public static Object a(bbhj bbhj) {
        return c.b(bbhj);
    }

    public static Object a(bbhj bbhj, Object obj) {
        return c.b(bbhj, obj);
    }

    private final synchronized Object b(bbhj bbhj) {
        bbhk bbhk;
        bbhk = (bbhk) this.a.get(bbhj);
        if (bbhk == null) {
            bbhk = new bbhk(bbhj.a());
            this.a.put(bbhj, bbhk);
        }
        ScheduledFuture scheduledFuture = bbhk.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            bbhk.c = null;
        }
        bbhk.b++;
        return bbhk.a;
    }

    private final synchronized Object b(bbhj bbhj, Object obj) {
        bbhk bbhk = (bbhk) this.a.get(bbhj);
        if (bbhk != null) {
            boolean z = true;
            amqw.a(obj == bbhk.a, (Object) "Releasing the wrong instance");
            amqw.b(bbhk.b > 0, (Object) "Refcount has already reached zero");
            int i = bbhk.b - 1;
            bbhk.b = i;
            if (i == 0) {
                if (bbby.a) {
                    bbhj.a(obj);
                    this.a.remove(bbhj);
                } else {
                    if (bbhk.c != null) {
                        z = false;
                    }
                    amqw.b(z, (Object) "Destroy task already scheduled");
                    if (this.b == null) {
                        this.b = this.d.a();
                    }
                    bbhk.c = this.b.schedule(new bbcz(new bbhh(this, bbhk, bbhj, obj)), 1, TimeUnit.SECONDS);
                }
            }
        } else {
            String valueOf = String.valueOf(bbhj);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 29);
            stringBuilder.append("No cached instance found for ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return null;
    }
}
