package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbxl */
public final class bbxl extends bbmp implements Runnable {
    private final Executor a;
    private final bbxa b;
    private volatile boolean c;
    private final AtomicInteger d = new AtomicInteger();
    private final bbmz e = new bbmz();

    public bbxl(Executor executor) {
        this.a = executor;
        this.b = new bbxa();
    }

    public final bbnc a(Runnable runnable) {
        if (this.c) {
            return bboc.INSTANCE;
        }
        Object bbxo = new bbxo(bbzf.a(runnable));
        this.b.a(bbxo);
        if (this.d.getAndIncrement() == 0) {
            try {
                this.a.execute(this);
            } catch (RejectedExecutionException e) {
                this.c = true;
                this.b.e();
                bbzf.a(e);
                return bboc.INSTANCE;
            }
        }
        return bbxo;
    }

    public final bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return a(runnable);
        }
        if (this.c) {
            return bboc.INSTANCE;
        }
        bboe bboe = new bboe();
        bboe bboe2 = new bboe(bboe);
        bbnc bbxx = new bbxx(new bbxn(this, bboe2, bbzf.a(runnable)), this.e);
        this.e.a(bbxx);
        Executor executor = this.a;
        if (executor instanceof ScheduledExecutorService) {
            try {
                bbxx.a(((ScheduledExecutorService) executor).schedule(bbxx, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.c = true;
                bbzf.a(e);
                return bboc.INSTANCE;
            }
        }
        bbxx.a(new bbxh(bbxk.a.a(bbxx, j, timeUnit)));
        bbnz.c(bboe, bbxx);
        return bboe2;
    }

    public final void bK_() {
        if (!this.c) {
            this.c = true;
            this.e.bK_();
            if (this.d.getAndIncrement() == 0) {
                this.b.e();
            }
        }
    }

    public final boolean c() {
        return this.c;
    }

    /* JADX WARNING: Missing block: B:10:0x001c, code skipped:
            if (r3.c == false) goto L_0x0022;
     */
    /* JADX WARNING: Missing block: B:11:0x001e, code skipped:
            r0.e();
     */
    /* JADX WARNING: Missing block: B:12:0x0021, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:13:0x0022, code skipped:
            r1 = r3.d.addAndGet(-r1);
     */
    /* JADX WARNING: Missing block: B:14:0x0029, code skipped:
            if (r1 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Missing block: B:16:0x002c, code skipped:
            return;
     */
    public final void run() {
        /*
        r3 = this;
        r0 = r3.b;
        r1 = 1;
    L_0x0003:
        r2 = r3.c;
        if (r2 != 0) goto L_0x002d;
    L_0x0007:
        r2 = r0.bI_();
        r2 = (java.lang.Runnable) r2;
        if (r2 == 0) goto L_0x001a;
    L_0x000f:
        r2.run();
        r2 = r3.c;
        if (r2 == 0) goto L_0x0007;
    L_0x0016:
        r0.e();
        return;
    L_0x001a:
        r2 = r3.c;
        if (r2 == 0) goto L_0x0022;
    L_0x001e:
        r0.e();
        return;
    L_0x0022:
        r2 = r3.d;
        r1 = -r1;
        r1 = r2.addAndGet(r1);
        if (r1 == 0) goto L_0x002c;
    L_0x002b:
        goto L_0x0003;
    L_0x002c:
        return;
    L_0x002d:
        r0.e();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbxl.run():void");
    }
}
