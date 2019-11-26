package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: bbpk */
public final class bbpk extends CountDownLatch implements bblv, bbmd, bbmr {
    private Object a;
    private Throwable b;
    private bbnc c;
    private volatile boolean d;

    public bbpk() {
        super(1);
    }

    public final void a(bbnc bbnc) {
        this.c = bbnc;
        if (this.d) {
            bbnc.bK_();
        }
    }

    public final void d_(Object obj) {
        this.a = obj;
        countDown();
    }

    public final void a_(Throwable th) {
        this.b = th;
        countDown();
    }

    public final void bL_() {
        countDown();
    }

    public final Object b() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.d = true;
                bbnc bbnc = this.c;
                if (bbnc != null) {
                    bbnc.bK_();
                }
                throw bbyw.a(e);
            }
        }
        Throwable e2 = this.b;
        if (e2 == null) {
            return this.a;
        }
        throw bbyw.a(e2);
    }
}
