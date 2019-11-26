package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: afop */
public final class afop {
    private final aqts a;
    private final xsc b;
    private final afoo c;
    private final Queue d = new ConcurrentLinkedQueue();
    private final ScheduledExecutorService e;
    private Future f;

    public afop(afmx afmx, xsc xsc, xbp xbp, ScheduledExecutorService scheduledExecutorService) {
        this.a = afmx.c();
        this.b = xsc;
        this.c = new afoo(xbp);
        this.e = scheduledExecutorService;
    }

    public final synchronized void a(njz njz) {
        xak.b();
        c(njz);
        this.d.add(njz);
        c();
    }

    public final synchronized void a(List list) {
        xak.b();
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                c((njz) list.get(i));
            }
            this.d.addAll(list);
            c();
        }
    }

    private final void c(njz njz) {
        String uuid = UUID.randomUUID().toString();
        njz.copyOnWrite();
        nka nka = (nka) njz.instance;
        if (uuid != null) {
            nka.a |= 1;
            nka.b = uuid;
            if (!njz.d()) {
                long a = this.b.a();
                njz.copyOnWrite();
                nka nka2 = (nka) njz.instance;
                nka2.a |= 8;
                nka2.e = a;
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(njz njz) {
        c(njz);
        this.c.a(xbl.a(njz.a(), njz), false);
    }

    public final synchronized xbu a() {
        xak.b();
        b();
        return this.c.d();
    }

    public final synchronized void a(Set set) {
        xak.b();
        this.c.a();
        try {
            for (njz a : set) {
                this.c.a(a.a());
            }
            this.c.c();
        } finally {
            this.c.b();
        }
    }

    private final void c() {
        if (this.a.b) {
            Future future = this.f;
            if (future == null || future.isDone()) {
                this.f = this.e.schedule(new afor(this), (long) this.a.d, TimeUnit.SECONDS);
                return;
            }
            return;
        }
        b();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b() {
        xak.b();
        if (!this.d.isEmpty()) {
            ArrayList<xbl> arrayList = new ArrayList();
            while (true) {
                njz njz = (njz) this.d.poll();
                if (njz == null) {
                    break;
                }
                arrayList.add(xbl.a(njz.a(), njz));
            }
            afoo afoo = this.c;
            xak.b();
            afoo.a(true);
            try {
                for (xbl b : arrayList) {
                    afoo.b(b, true);
                }
                afoo.c(true);
            } finally {
                afoo.b(true);
            }
        }
        Future future = this.f;
        if (future != null) {
            future.cancel(false);
        }
    }
}
