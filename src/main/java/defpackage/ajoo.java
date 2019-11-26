package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ajoo */
public final class ajoo extends ajps {
    public static final long a = TimeUnit.SECONDS.toMillis(30);
    public final bcaa b;
    public bdfg c = bdfg.h();
    public byte[] d;
    public ajox e;
    private final ScheduledExecutorService f;
    private final bcaa g;
    private final ahjf h;
    private final Executor i;
    private String j;
    private final Set k = new HashSet();
    private atdv l;
    private ajoq m;

    public ajoo(bcaa bcaa, ScheduledExecutorService scheduledExecutorService, bcaa bcaa2, ahjf ahjf, Handler handler, Executor executor) {
        this.b = (bcaa) amqw.a((Object) bcaa);
        this.f = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.g = (bcaa) amqw.a((Object) bcaa2);
        this.h = ahjf;
        amqw.a((Object) handler);
        this.i = executor;
    }

    public final void a(ajox ajox) {
        this.e = (ajox) amqw.a((Object) ajox);
    }

    public final synchronized void a(ahkm ahkm) {
        for (ajot a : this.k) {
            a.a(ahkm);
        }
    }

    public final synchronized void a(ahkn ahkn) {
        int ordinal = ahkn.a.ordinal();
        ajoq ajoq;
        if (ordinal == 0) {
            e();
        } else if (ordinal == 1) {
            e();
            this.k.addAll((Collection) this.g.get());
            this.c = bdfg.h();
        } else if (ordinal == 2) {
            ajoq = this.m;
            if (ajoq == null || !ajoq.b()) {
                aakj aakj = ahkn.b;
                atdv l = aakj != null ? aakj.l() : null;
                this.j = aakj.b();
                this.l = l;
                this.d = aakj.x();
                b();
            }
        } else if (ordinal == 8) {
            ajoq = this.m;
            if (ajoq == null || !ajoq.b()) {
                b();
            }
        }
        for (ajot a : this.k) {
            a.a(ahkn);
        }
    }

    public final void a(ahkr ahkr) {
        for (ajot a : this.k) {
            a.a(ahkr);
        }
        if (ahkr.a == 5) {
            ajoq ajoq = this.m;
            if (ajoq != null && ajoq.b != null) {
                a(ajoq);
            }
        }
    }

    public final void b(String str) {
        ajoq ajoq = this.m;
        if (ajoq != null) {
            ajoq.a();
            this.m = null;
        }
    }

    public final void ba_() {
        g();
        this.k.addAll((Collection) this.g.get());
        this.c = bdfg.h();
        b();
    }

    private final void b() {
        ArrayList arrayList = new ArrayList();
        ajov ajoq = new ajoq(this, this.j, this.l);
        Object obj = null;
        for (ajot ajot : this.k) {
            atdv atdv = this.l;
            if (atdv == null || !ajot.b(atdv)) {
                arrayList.add(ajot);
            } else {
                ajot.a(ajoq);
                ajot.b();
                ajoq.d.add(null);
                if (obj == null) {
                    b(ajoq, a);
                    obj = 1;
                }
            }
        }
        this.c.e_(ajoq.b);
        a(arrayList);
    }

    private final synchronized void a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ajot ajot = (ajot) arrayList.get(i);
            ajot.c();
            this.k.remove(ajot);
        }
    }

    private final void e() {
        this.l = null;
        this.j = "";
        g();
    }

    private final void g() {
        ajoq ajoq = this.m;
        if (ajoq != null) {
            ajoq.a();
            this.m = null;
        }
        for (ajot c : this.k) {
            c.c();
        }
        this.k.clear();
        this.c.bM_();
    }

    private final synchronized void b(ajoq ajoq, long j) {
        this.m = ajoq;
        a(ajoq, j);
    }

    public final synchronized void a(ajoq ajoq, long j) {
        ajoq.a = this.f.schedule(ajoq, j, TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Missing block: B:31:0x007e, code skipped:
            return r4;
     */
    public final synchronized boolean a(defpackage.ajoq r11) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r11.b;	 Catch:{ all -> 0x0081 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0081 }
        r1.<init>();	 Catch:{ all -> 0x0081 }
        r2 = r10.k;	 Catch:{ all -> 0x0081 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0081 }
        r3 = 1;
        r4 = 0;
        r5 = 0;
    L_0x0011:
        r6 = r2.hasNext();	 Catch:{ all -> 0x0081 }
        r7 = 3;
        if (r6 == 0) goto L_0x0050;
    L_0x0018:
        r6 = r2.next();	 Catch:{ all -> 0x0081 }
        r6 = (defpackage.ajot) r6;	 Catch:{ all -> 0x0081 }
        r8 = r6.b(r0);	 Catch:{ all -> 0x0081 }
        if (r8 == 0) goto L_0x0011;
    L_0x0024:
        r8 = r6.b(r11);	 Catch:{ all -> 0x0081 }
        if (r8 != r3) goto L_0x002e;
    L_0x002a:
        r1.add(r6);	 Catch:{ all -> 0x0081 }
        goto L_0x0011;
    L_0x002e:
        r9 = 2;
        if (r8 != r9) goto L_0x0035;
    L_0x0031:
        r6.a();	 Catch:{ all -> 0x0081 }
        goto L_0x0011;
    L_0x0035:
        if (r8 == 0) goto L_0x004e;
    L_0x0037:
        if (r8 == r7) goto L_0x003a;
    L_0x0039:
        goto L_0x0011;
    L_0x003a:
        r6 = r10.e;	 Catch:{ all -> 0x0081 }
        if (r6 == 0) goto L_0x0011;
    L_0x003e:
        r6 = defpackage.aiqr.h(r0);	 Catch:{ all -> 0x0081 }
        if (r6 == 0) goto L_0x0011;
    L_0x0044:
        r5 = r10.i;	 Catch:{ all -> 0x0081 }
        r6 = new ajon;	 Catch:{ all -> 0x0081 }
        r6.<init>(r10, r11);	 Catch:{ all -> 0x0081 }
        r5.execute(r6);	 Catch:{ all -> 0x0081 }
    L_0x004e:
        r5 = 1;
        goto L_0x0011;
    L_0x0050:
        r2 = r10.c;	 Catch:{ all -> 0x0081 }
        r11 = r11.b;	 Catch:{ all -> 0x0081 }
        r2.e_(r11);	 Catch:{ all -> 0x0081 }
        r10.a(r1);	 Catch:{ all -> 0x0081 }
        r11 = r0.b;	 Catch:{ all -> 0x0081 }
        r11 = defpackage.awah.a(r11);	 Catch:{ all -> 0x0081 }
        if (r11 != 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0074;
    L_0x0063:
        if (r11 != r7) goto L_0x0074;
    L_0x0065:
        r11 = r10.h;	 Catch:{ all -> 0x0081 }
        r1 = new ahjc;	 Catch:{ all -> 0x0081 }
        r2 = defpackage.ahjh.SKIP_IF_POSSIBLE;	 Catch:{ all -> 0x0081 }
        r0 = r0.c;	 Catch:{ all -> 0x0081 }
        r1.<init>(r2, r0);	 Catch:{ all -> 0x0081 }
        r11.a(r1);	 Catch:{ all -> 0x0081 }
        goto L_0x007d;
    L_0x0074:
        r11 = r10.k;	 Catch:{ all -> 0x0081 }
        r11 = r11.isEmpty();	 Catch:{ all -> 0x0081 }
        if (r11 != 0) goto L_0x007f;
    L_0x007c:
        r4 = r5;
    L_0x007d:
        monitor-exit(r10);
        return r4;
    L_0x007f:
        monitor-exit(r10);
        return r4;
    L_0x0081:
        r11 = move-exception;
        monitor-exit(r10);
        goto L_0x0085;
    L_0x0084:
        throw r11;
    L_0x0085:
        goto L_0x0084;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajoo.a(ajoq):boolean");
    }
}
