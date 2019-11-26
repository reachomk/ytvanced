package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ejv */
public final class ejv implements xcp {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    private final xsc c;
    private final xci d;
    private final ScheduledExecutorService e;
    private final Executor f;
    private final Set g = Collections.newSetFromMap(new WeakHashMap());
    private final Map h = new HashMap();

    public ejv(xsc xsc, xci xci, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.c = xsc;
        this.d = xci;
        this.e = scheduledExecutorService;
        this.f = executor;
    }

    public final void a(eka eka) {
        if (this.g.isEmpty()) {
            this.d.a((Object) this);
        }
        this.g.add(eka);
    }

    public final void b(eka eka) {
        this.g.remove(eka);
        if (this.g.isEmpty()) {
            this.d.b(this);
        }
    }

    public final void a(agls agls) {
        this.h.put(agls.a.a(), Long.valueOf(this.c.a()));
        for (eka a : this.g) {
            a.a(agls);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{agls.class};
        } else if (i == 0) {
            agls agls = (agls) obj;
            xak.a();
            String a = agls.a.a();
            long longValue = this.h.containsKey(a) ? ((Long) this.h.get(a)).longValue() : 0;
            long a2 = this.c.a();
            longValue = a2 - longValue <= 500 ? (longValue + 500) - a2 : 0;
            if (longValue != 0) {
                this.b.put(a, agls);
                if (!this.a.containsKey(a)) {
                    anij ejy = new ejy(this, a);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    ScheduledExecutorService scheduledExecutorService = this.e;
                    anku a3 = anku.a(ejy);
                    a3.a(new anji(scheduledExecutorService.schedule(a3, longValue, timeUnit)), aniv.a);
                    anjf.a(a3, new ejx(this, a), this.f);
                    this.a.put(a, a3);
                    return null;
                }
            }
            a(agls);
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
