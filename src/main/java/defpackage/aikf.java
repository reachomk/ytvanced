package defpackage;

import android.util.SparseArray;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: aikf */
public final class aikf {
    public final aiku a;
    public final aikq b;
    public final Set c = new CopyOnWriteArraySet();
    public final Set d = new CopyOnWriteArraySet();
    public final aikk e = new aikk();
    public volatile aikc f = new aijy();
    private final Set g = new CopyOnWriteArraySet();
    private final SparseArray h;

    public aikf(bcaa bcaa, aiku aiku) {
        aikd aikq = new aikq(bcaa);
        this.a = aiku;
        this.b = aikq;
        this.e.a(this.f);
        this.h = new SparseArray(aikc.n.length);
        for (int i : aikc.n) {
            aiko aiko = new aiko(i);
            aiko.a(this.f);
            this.h.put(i, aiko);
        }
        a(aikq);
    }

    public final synchronized void a(aikc aikc, aiki aiki) {
        amqw.a((Object) aikc);
        if (this.f != aikc) {
            Object a = this.b.a();
            aikc aikc2 = this.f;
            int a2 = a();
            aikr b = b();
            this.f = aikc;
            this.e.a(this.f);
            for (int i : aikc.n) {
                ((aiko) this.h.get(i)).a(this.f);
            }
            int a3 = a();
            aikr b2 = b();
            for (aikg aikg : this.d) {
                aikc2.b(aikg);
                aikc.a(aikg);
                if (a2 != a3) {
                    aikg.a(a2, a3);
                }
            }
            a2 = amqq.a(b, b2) ^ 1;
            for (aikd aikd : this.g) {
                aikc2.b(aikd);
                aikc.a(aikd);
                if (a2 != 0) {
                    aikd.a(b2);
                }
            }
            this.b.a(b(), aiki, true);
            this.b.b(a);
            for (aikh b3 : this.c) {
                b3.b();
            }
        }
    }

    public final xca a(int i) {
        return (xca) this.h.get(i);
    }

    public final int a() {
        return this.f.e();
    }

    public final void a(aikd aikd) {
        this.g.add(aikd);
        this.f.a(aikd);
    }

    public final synchronized aizm a(aiqq aiqq) {
        aikm aikm;
        aijx aijx;
        if (this.f instanceof aijx) {
            aijx = (aijx) this.f;
        } else {
            aijx = new aijw(this.f, this.a);
        }
        aikm = new aikm(aijx, this.b);
        aizl a = !this.f.c(aiqq) ? aikm.a(aiqq) : null;
        if (a != null) {
            aikm.a(a, aikm.a(a));
        }
        return aikm;
    }

    /* JADX WARNING: Missing block: B:21:0x004b, code skipped:
            return;
     */
    public final synchronized void a(int r4, int r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = 0;
        r1 = r3.f;	 Catch:{ all -> 0x004c }
        r1 = r1.a(r4);	 Catch:{ all -> 0x004c }
        r0 = defpackage.xty.a(r5, r0, r1);	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x004a;
    L_0x000e:
        if (r4 != 0) goto L_0x0018;
    L_0x0010:
        r0 = r3.f;	 Catch:{ all -> 0x004c }
        r0 = r0.e();	 Catch:{ all -> 0x004c }
        if (r5 == r0) goto L_0x004a;
    L_0x0018:
        r0 = r3.b;	 Catch:{ all -> 0x004c }
        r1 = r3.f;	 Catch:{ all -> 0x004c }
        r2 = r3.f;	 Catch:{ all -> 0x004c }
        r4 = r2.a(r4, r5);	 Catch:{ all -> 0x004c }
        r5 = r0.b;	 Catch:{ all -> 0x004c }
        if (r5 == 0) goto L_0x0045;
    L_0x0026:
        r5 = r5.get();	 Catch:{ all -> 0x004c }
        if (r5 != 0) goto L_0x002d;
    L_0x002c:
        goto L_0x0045;
    L_0x002d:
        r5 = r0.a;	 Catch:{ all -> 0x004c }
        r5 = r5.get();	 Catch:{ all -> 0x004c }
        r5 = (defpackage.aizy) r5;	 Catch:{ all -> 0x004c }
        r0 = new aizl;	 Catch:{ all -> 0x004c }
        r1 = defpackage.aizn.JUMP;	 Catch:{ all -> 0x004c }
        r4 = r4.e();	 Catch:{ all -> 0x004c }
        r0.<init>(r1, r4);	 Catch:{ all -> 0x004c }
        r5.b(r0);	 Catch:{ all -> 0x004c }
        monitor-exit(r3);
        return;
    L_0x0045:
        r1.a(r4);	 Catch:{ all -> 0x004c }
        monitor-exit(r3);
        return;
    L_0x004a:
        monitor-exit(r3);
        return;
    L_0x004c:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aikf.a(int, int):void");
    }

    public final aikr b() {
        aikc aikc = this.f;
        int e = aikc.e();
        return e != -1 ? aikc.a(0, e) : null;
    }

    static {
        xtl.b("PlaybackQueueManager");
    }
}
