package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbpu */
final class bbpu extends AtomicInteger implements bbmb, bbnc {
    public static final long serialVersionUID = 9032184911934499404L;
    public volatile boolean a;
    private final bblv b;
    private final int c;
    private final int d;
    private final bbpt e = new bbpt(this);
    private final AtomicBoolean f = new AtomicBoolean();
    private int g;
    private int h;
    private bbpg i;
    private bctr j;
    private volatile boolean k;

    bbpu(bblv bblv, int i) {
        this.b = bblv;
        this.c = i;
        this.d = i - (i >> 2);
    }

    public final void a(bctr bctr) {
        if (bbyq.a(this.j, bctr)) {
            this.j = bctr;
            int i = this.c;
            long j = i != Integer.MAX_VALUE ? (long) i : Long.MAX_VALUE;
            if (bctr instanceof bbpb) {
                bbpb bbpb = (bbpb) bctr;
                int a = bbpb.a(3);
                if (a == 1) {
                    this.g = 1;
                    this.i = bbpb;
                    this.k = true;
                    this.b.a(this);
                    b();
                    return;
                } else if (a == 2) {
                    this.g = 2;
                    this.i = bbpb;
                    this.b.a(this);
                    bctr.b(j);
                    return;
                }
            }
            i = this.c;
            if (i == Integer.MAX_VALUE) {
                this.i = new bbxb(bbmc.a);
            } else {
                this.i = new bbxc(i);
            }
            this.b.a(this);
            bctr.b(j);
        }
    }

    public final void a(Throwable th) {
        if (this.f.compareAndSet(false, true)) {
            bbnz.a(this.e);
            this.b.a_(th);
            return;
        }
        bbzf.a(th);
    }

    public final void a() {
        this.k = true;
        b();
    }

    public final void bK_() {
        this.j.d();
        bbnz.a(this.e);
    }

    public final boolean c() {
        return bbnz.a((bbnc) this.e.get());
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:11:0x001e, code skipped:
            if (r1 != null) goto L_0x0031;
     */
    public final void b() {
        /*
        r4 = this;
        r0 = r4.getAndIncrement();
        if (r0 != 0) goto L_0x005d;
    L_0x0006:
        r0 = r4.c();
        if (r0 != 0) goto L_0x005d;
    L_0x000c:
        r0 = r4.a;
        if (r0 != 0) goto L_0x0057;
    L_0x0010:
        r0 = r4.k;
        r1 = r4.i;	 Catch:{ all -> 0x004f }
        r1 = r1.bI_();	 Catch:{ all -> 0x004f }
        r1 = (defpackage.bblx) r1;	 Catch:{ all -> 0x004f }
        r2 = 0;
        r3 = 1;
        if (r0 != 0) goto L_0x0021;
    L_0x001e:
        if (r1 == 0) goto L_0x0057;
    L_0x0020:
        goto L_0x0031;
    L_0x0021:
        if (r1 != 0) goto L_0x0031;
    L_0x0023:
        r0 = r4.f;
        r0 = r0.compareAndSet(r2, r3);
        if (r0 == 0) goto L_0x0030;
    L_0x002b:
        r0 = r4.b;
        r0.bL_();
    L_0x0030:
        return;
    L_0x0031:
        r4.a = r3;
        r0 = r4.e;
        r1.a(r0);
        r0 = r4.g;
        if (r0 == r3) goto L_0x0057;
    L_0x003c:
        r0 = r4.h;
        r0 = r0 + r3;
        r1 = r4.d;
        if (r0 != r1) goto L_0x004c;
    L_0x0043:
        r4.h = r2;
        r1 = r4.j;
        r2 = (long) r0;
        r1.b(r2);
        goto L_0x0057;
    L_0x004c:
        r4.h = r0;
        goto L_0x0057;
    L_0x004f:
        r0 = move-exception;
        defpackage.bbnm.a(r0);
        r4.b(r0);
        return;
    L_0x0057:
        r0 = r4.decrementAndGet();
        if (r0 != 0) goto L_0x0006;
    L_0x005d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbpu.b():void");
    }

    /* Access modifiers changed, original: final */
    public final void b(Throwable th) {
        if (this.f.compareAndSet(false, true)) {
            this.j.d();
            this.b.a_(th);
            return;
        }
        bbzf.a(th);
    }

    public final /* synthetic */ void c_(Object obj) {
        bblx bblx = (bblx) obj;
        if (this.g != 0 || this.i.a(bblx)) {
            b();
        } else {
            a(new bbnl());
        }
    }
}
