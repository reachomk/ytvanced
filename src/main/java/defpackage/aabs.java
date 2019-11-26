package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: aabs */
final class aabs {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public volatile boolean d = true;
    public final /* synthetic */ aabe e;
    private final xsc f;
    private final ReadWriteLock g;

    public aabs(aabe aabe, xsc xsc) {
        this.e = aabe;
        this.f = xsc;
        this.g = new ReentrantReadWriteLock(false);
    }

    public final Object a(amqd amqd) {
        this.g.readLock().lock();
        try {
            Object a = amqd.a(this);
            return a;
        } finally {
            this.g.readLock().unlock();
        }
    }

    public final void a(Runnable runnable) {
        this.g.writeLock().lock();
        try {
            runnable.run();
        } finally {
            this.g.writeLock().unlock();
        }
    }

    public final long a(int i) {
        return this.f.b() + TimeUnit.SECONDS.toMillis(Math.max((long) i, this.e.d));
    }

    public final aaeh a(String str) {
        aaeh aaeh = (aaeh) this.b.get(str);
        if (aaeh == null) {
            synchronized (this.b) {
                aaeh = (aaeh) this.b.get(str);
                if (aaeh == null) {
                    aaeh = aaeh.a(new aabw(this, str));
                    this.b.put(str, aaeh);
                }
            }
        }
        return aaeh;
    }

    public final void a(aadz aadz) {
        if (aadz != null) {
            a(aadz.a()).b_(aadz);
            Object b = aadz.c() == null ? aadz.b() : aadz.c();
            if (b != null) {
                Class cls = b.getClass();
                aaeh aaeh = (aaeh) this.c.get(cls);
                if (aaeh == null) {
                    synchronized (this.c) {
                        aaeh = (aaeh) this.c.get(cls);
                        if (aaeh == null) {
                            aaeh = aaeh.a(new aabz(this, cls));
                            this.c.put(cls, aaeh);
                        }
                    }
                }
                aaeh.b_(aadz);
            }
        }
    }

    public final aadq b(String str) {
        aabt aabt = (aabt) this.a.get(str);
        return aabt != null ? aabt.b : null;
    }

    public final aadu c(String str) {
        aabt aabt = (aabt) this.a.get(str);
        if (aabt != null) {
            return aabt.c;
        }
        return aadu.a;
    }

    public final aabt a(String str, aadq aadq, aadu aadu, long j) {
        String simpleName = aadq != null ? aadq.getClass().getSimpleName() : "null";
        aaep aaep = this.e.c;
        String valueOf = String.valueOf(str);
        String str2 = "put ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        aaep.a(simpleName, valueOf);
        aabt aabt = (aabt) this.a.put(str, new aabt(aadq, aadu, j, (byte) 0));
        return aabt == null ? aabt.a : aabt;
    }

    public final aabt d(String str) {
        aabt aabt = (aabt) this.a.remove(str);
        str = String.valueOf(str);
        String str2 = "remove ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        if (aabt == null) {
            this.e.c.a("UNKNOWN", str);
            return aabt.a;
        }
        this.e.c.a(aabt.b.getClass().getSimpleName(), str);
        return aabt;
    }
}
