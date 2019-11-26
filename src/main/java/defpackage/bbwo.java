package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbwo */
final class bbwo extends AtomicInteger implements bbnc {
    public static final long serialVersionUID = 2983708048395377667L;
    public final bbmo a;
    public final bbwn[] b;
    public volatile boolean c;
    private final bbnv d;
    private final Object[] e;
    private final boolean f = false;

    bbwo(bbmo bbmo, bbnv bbnv, int i) {
        this.a = bbmo;
        this.d = bbnv;
        this.b = new bbwn[i];
        this.e = new Object[i];
    }

    public final void bK_() {
        if (!this.c) {
            this.c = true;
            e();
            if (getAndIncrement() == 0) {
                f();
            }
        }
    }

    public final boolean c() {
        return this.c;
    }

    private final void b() {
        f();
        e();
    }

    private final void e() {
        for (bbwn bbwn : this.b) {
            bbnz.a(bbwn.d);
        }
    }

    private final void f() {
        for (bbwn bbwn : this.b) {
            bbwn.a.e();
        }
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            bbwn[] bbwnArr = this.b;
            bbmo bbmo = this.a;
            Object[] objArr = this.e;
            int i = 1;
            while (true) {
                int i2 = 0;
                int i3 = 0;
                for (bbwn bbwn : bbwnArr) {
                    Throwable th;
                    if (objArr[i3] == null) {
                        boolean z = bbwn.b;
                        Object bI_ = bbwn.a.bI_();
                        if (this.c) {
                            b();
                            return;
                        }
                        if (z) {
                            th = bbwn.c;
                            if (th != null) {
                                b();
                                bbmo.a(th);
                                return;
                            } else if (bI_ == null) {
                                b();
                                bbmo.a();
                                return;
                            }
                        }
                        if (bI_ == null) {
                            i2++;
                        } else {
                            objArr[i3] = bI_;
                        }
                    } else if (bbwn.b) {
                        th = bbwn.c;
                        if (th != null) {
                            b();
                            bbmo.a(th);
                            return;
                        }
                    } else {
                        continue;
                    }
                    i3++;
                }
                if (i2 != 0) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    try {
                        bbmo.b_(bbow.a(this.d.a(objArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(objArr, null);
                    } catch (Throwable th2) {
                        bbnm.a(th2);
                        b();
                        bbmo.a(th2);
                    }
                }
            }
        }
    }
}
