package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbvz */
final class bbvz extends AtomicInteger implements bbmo, bbnc {
    private static final bbwa k;
    public static final long serialVersionUID = -3491074160481096299L;
    public final boolean a;
    public final bbyr b;
    public bbnc c;
    public volatile long d;
    private final bbmo e;
    private final bbnv f;
    private final int g;
    private volatile boolean h;
    private volatile boolean i;
    private final AtomicReference j = new AtomicReference();

    bbvz(bbmo bbmo, bbnv bbnv, int i) {
        this.e = bbmo;
        this.f = bbnv;
        this.g = i;
        this.a = false;
        this.b = new bbyr();
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.c, bbnc)) {
            this.c = bbnc;
            this.e.a((bbnc) this);
        }
    }

    public final void b_(Object obj) {
        long j = this.d + 1;
        this.d = j;
        AtomicReference atomicReference = (bbwa) this.j.get();
        if (atomicReference != null) {
            bbnz.a(atomicReference);
        }
        try {
            bbmm bbmm = (bbmm) bbow.a(this.f.a(obj), "The ObservableSource returned is null");
            bbwa bbwa = new bbwa(this, j, this.g);
            bbwa bbwa2;
            do {
                bbwa2 = (bbwa) this.j.get();
                if (bbwa2 == k) {
                    break;
                }
            } while (!this.j.compareAndSet(bbwa2, bbwa));
            bbmm.b(bbwa);
        } catch (Throwable th) {
            bbnm.a(th);
            this.c.bK_();
            a(th);
        }
    }

    public final void a(Throwable th) {
        if (this.h || !bbyw.a(this.b, th)) {
            bbzf.a(th);
            return;
        }
        e();
        this.h = true;
        b();
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            b();
        }
    }

    public final void bK_() {
        if (!this.i) {
            this.i = true;
            this.c.bK_();
            e();
        }
    }

    public final boolean c() {
        return this.i;
    }

    private final void e() {
        bbwa bbwa = (bbwa) this.j.get();
        bbwa bbwa2 = k;
        if (bbwa != bbwa2) {
            AtomicReference atomicReference = (bbwa) this.j.getAndSet(bbwa2);
            if (atomicReference != k && atomicReference != null) {
                bbnz.a(atomicReference);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (getAndIncrement() == 0) {
            bbmo bbmo = this.e;
            AtomicReference atomicReference = this.j;
            int i = 1;
            loop0:
            while (!this.i) {
                if (this.h) {
                    Object obj = atomicReference.get();
                    if (((Throwable) this.b.get()) != null) {
                        bbmo.a(bbyw.a(this.b));
                        return;
                    } else if (obj == null) {
                        bbmo.a();
                        return;
                    }
                }
                bbwa bbwa = (bbwa) atomicReference.get();
                if (bbwa != null) {
                    bbpg bbpg = bbwa.a;
                    if (bbpg != null) {
                        if (bbwa.b) {
                            boolean b = bbpg.b();
                            if (((Throwable) this.b.get()) != null) {
                                bbmo.a(bbyw.a(this.b));
                                return;
                            } else if (b) {
                                atomicReference.compareAndSet(bbwa, null);
                            }
                        }
                        Object obj2 = null;
                        while (!this.i) {
                            if (bbwa == atomicReference.get()) {
                                if (((Throwable) this.b.get()) != null) {
                                    bbmo.a(bbyw.a(this.b));
                                    break loop0;
                                }
                                Object bI_;
                                boolean z = bbwa.b;
                                try {
                                    bI_ = bbpg.bI_();
                                } catch (Throwable th) {
                                    bbnm.a(th);
                                    bbyw.a(this.b, th);
                                    atomicReference.compareAndSet(bbwa, null);
                                    e();
                                    this.c.bK_();
                                    this.h = true;
                                    bI_ = null;
                                    obj2 = 1;
                                }
                                Object obj3 = bI_ != null ? null : 1;
                                if (z) {
                                    if (obj3 != null) {
                                        atomicReference.compareAndSet(bbwa, null);
                                    }
                                } else if (bI_ == null) {
                                    if (obj2 != null) {
                                        continue;
                                    }
                                }
                                bbmo.b_(bI_);
                            } else {
                                continue;
                            }
                        }
                        return;
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    break;
                }
            }
        }
    }

    static {
        AtomicReference bbwa = new bbwa(null, -1, 1);
        k = bbwa;
        bbnz.a(bbwa);
    }
}
