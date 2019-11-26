package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: dpo */
final class dpo implements Runnable {
    private final /* synthetic */ dos a;

    dpo(dos dos) {
        this.a = dos;
    }

    public final void run() {
        Object obj = (acuz) this.a.z.get();
        synchronized (obj.n) {
            if (obj.c) {
                afpc.a(2, afpf.logging, "HeartbeatClient.configure() have been called more than once.");
                return;
            }
            aukt aukt;
            arvt b = obj.q.b();
            afot afot = null;
            if (b == null) {
                aukt = null;
            } else {
                aukv aukv = b.n;
                if (aukv == null) {
                    aukv = aukv.d;
                }
                aukt = aukv.c;
                if (aukt == null) {
                    aukt = aukt.f;
                }
            }
            if (aukt != null) {
                if (aukt.b) {
                    long j;
                    synchronized (obj.n) {
                        obj.p.addObserver(obj);
                        obj.l = obj.r.a(obj, afqf.class, new acvc(obj));
                        obj.m = obj.r.a(obj, afqh.class, new acvb(obj));
                        if (obj.g == null) {
                            obj.h = new acvf(obj);
                            obj.i = new acvi(obj);
                            obj.g = new tub();
                            obj.g.a(obj.o);
                        }
                        obj.g.a(obj.h);
                        obj.g.a(obj.i);
                    }
                    if (aukt.c <= 0) {
                        j = acuz.a;
                    } else {
                        j = TimeUnit.SECONDS.toMillis((long) aukt.c);
                    }
                    obj.e = j;
                    if (aukt.d <= 0) {
                        j = acuz.b;
                    } else {
                        j = TimeUnit.SECONDS.toMillis((long) aukt.d);
                    }
                    obj.f = j;
                    boolean z = aukt.e;
                    obj.d = z;
                    obj.j = z ? obj.s.c() : null;
                    if (obj.d && !obj.s.a()) {
                        afot = new afot(obj.s.h(), obj.s.g());
                    }
                    obj.k = afot;
                    if (ucv.b(obj.o.getApplicationContext())) {
                        obj.e();
                    } else {
                        obj.d();
                    }
                    obj.c = true;
                }
            }
            synchronized (obj.n) {
                tub tub = obj.g;
                if (tub != null) {
                    tub.b(obj.o);
                    obj.g.b(obj.h);
                    obj.g.b(obj.i);
                    obj.p.deleteObserver(obj);
                    obj.r.a(obj.l);
                    obj.r.a(obj.m);
                }
                obj.c();
            }
            obj.c = true;
        }
    }
}
