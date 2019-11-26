package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbue */
final class bbue extends AtomicInteger implements bbmo, bbnc {
    private static final bbub[] k = new bbub[0];
    private static final bbub[] l = new bbub[0];
    public static final long serialVersionUID = -2117620485640801370L;
    public final bbmo a;
    public final boolean b;
    public final int c;
    public final bbyr d = new bbyr();
    private final bbnv e;
    private final int f;
    private volatile bbpd g;
    private volatile boolean h;
    private volatile boolean i;
    private final AtomicReference j;
    private bbnc m;
    private long n;
    private long o;
    private int p;
    private Queue q;
    private int r;

    bbue(bbmo bbmo, bbnv bbnv, int i, int i2) {
        this.a = bbmo;
        this.e = bbnv;
        this.b = false;
        this.f = i;
        this.c = i2;
        if (i != Integer.MAX_VALUE) {
            this.q = new ArrayDeque(i);
        }
        this.j = new AtomicReference(k);
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.m, bbnc)) {
            this.m = bbnc;
            this.a.a((bbnc) this);
        }
    }

    public final void b_(Object obj) {
        if (!this.h) {
            try {
                bbmm bbmm = (bbmm) bbow.a(this.e.a(obj), "The mapper returned a null ObservableSource");
                if (this.f != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i = this.r;
                        if (i != this.f) {
                            this.r = i + 1;
                        } else {
                            this.q.offer(bbmm);
                            return;
                        }
                    }
                }
                a(bbmm);
            } catch (Throwable th) {
                bbnm.a(th);
                this.m.bK_();
                a(th);
            }
        }
    }

    /* JADX WARNING: Missing block: B:11:0x0026, code skipped:
            if (decrementAndGet() != 0) goto L_0x0059;
     */
    private final void a(defpackage.bbmm r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7 instanceof java.util.concurrent.Callable;
        r1 = 0;
        if (r0 == 0) goto L_0x008a;
    L_0x0005:
        r7 = (java.util.concurrent.Callable) r7;
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r2 = 1;
        r7 = r7.call();	 Catch:{ all -> 0x005d }
        if (r7 == 0) goto L_0x0069;
    L_0x0011:
        r3 = r6.get();
        if (r3 != 0) goto L_0x0029;
    L_0x0017:
        r3 = r6.compareAndSet(r1, r2);
        if (r3 == 0) goto L_0x0029;
    L_0x001d:
        r3 = r6.a;
        r3.b_(r7);
        r7 = r6.decrementAndGet();
        if (r7 == 0) goto L_0x0069;
    L_0x0028:
        goto L_0x0059;
    L_0x0029:
        r3 = r6.g;
        if (r3 != 0) goto L_0x0041;
    L_0x002d:
        r3 = r6.f;
        if (r3 != r0) goto L_0x0039;
    L_0x0031:
        r3 = new bbxb;
        r4 = r6.c;
        r3.<init>(r4);
        goto L_0x003f;
    L_0x0039:
        r4 = new bbxc;
        r4.<init>(r3);
        r3 = r4;
    L_0x003f:
        r6.g = r3;
    L_0x0041:
        r7 = r3.a(r7);
        if (r7 != 0) goto L_0x0052;
    L_0x0047:
        r7 = new java.lang.IllegalStateException;
        r3 = "Scalar queue full?!";
        r7.<init>(r3);
        r6.a(r7);
        goto L_0x0069;
    L_0x0052:
        r7 = r6.getAndIncrement();
        if (r7 == 0) goto L_0x0059;
    L_0x0058:
        return;
    L_0x0059:
        r6.e();
        goto L_0x0069;
    L_0x005d:
        r7 = move-exception;
        defpackage.bbnm.a(r7);
        r3 = r6.d;
        defpackage.bbyw.a(r3, r7);
        r6.b();
    L_0x0069:
        r7 = r6.f;
        if (r7 == r0) goto L_0x0089;
    L_0x006d:
        monitor-enter(r6);
        r7 = r6.q;	 Catch:{ all -> 0x0086 }
        r7 = r7.poll();	 Catch:{ all -> 0x0086 }
        r7 = (defpackage.bbmm) r7;	 Catch:{ all -> 0x0086 }
        if (r7 != 0) goto L_0x007f;
    L_0x0078:
        r0 = r6.r;	 Catch:{ all -> 0x0086 }
        r0 = r0 + -1;
        r6.r = r0;	 Catch:{ all -> 0x0086 }
        r1 = 1;
    L_0x007f:
        monitor-exit(r6);	 Catch:{ all -> 0x0086 }
        if (r1 == 0) goto L_0x0000;
    L_0x0082:
        r6.b();
        goto L_0x0089;
    L_0x0086:
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0086 }
        throw r7;
    L_0x0089:
        return;
    L_0x008a:
        r0 = new bbub;
        r2 = r6.n;
        r4 = 1;
        r4 = r4 + r2;
        r6.n = r4;
        r0.<init>(r6, r2);
    L_0x0096:
        r2 = r6.j;
        r2 = r2.get();
        r2 = (defpackage.bbub[]) r2;
        r3 = l;
        if (r2 == r3) goto L_0x00b8;
    L_0x00a2:
        r3 = r2.length;
        r4 = r3 + 1;
        r4 = new defpackage.bbub[r4];
        java.lang.System.arraycopy(r2, r1, r4, r1, r3);
        r4[r3] = r0;
        r3 = r6.j;
        r2 = r3.compareAndSet(r2, r4);
        if (r2 == 0) goto L_0x0096;
    L_0x00b4:
        r7.b(r0);
        return;
    L_0x00b8:
        defpackage.bbnz.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbue.a(bbmm):void");
    }

    private final void a(bbub bbub) {
        bbub[] bbubArr;
        Object obj;
        do {
            bbubArr = (bbub[]) this.j.get();
            int length = bbubArr.length;
            if (length != 0) {
                int i = 0;
                while (i < length) {
                    if (bbubArr[i] == bbub) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i < 0) {
                    return;
                }
                if (length != 1) {
                    obj = new bbub[(length - 1)];
                    System.arraycopy(bbubArr, 0, obj, 0, i);
                    System.arraycopy(bbubArr, i + 1, obj, i, (length - i) - 1);
                } else {
                    obj = k;
                }
            } else {
                return;
            }
        } while (!this.j.compareAndSet(bbubArr, obj));
    }

    public final void a(Throwable th) {
        if (this.h) {
            bbzf.a(th);
        } else if (bbyw.a(this.d, th)) {
            this.h = true;
            b();
        } else {
            bbzf.a(th);
        }
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
            if (f()) {
                Throwable a = bbyw.a(this.d);
                if (a != null && a != bbyw.a) {
                    bbzf.a(a);
                }
            }
        }
    }

    public final boolean c() {
        return this.i;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (getAndIncrement() == 0) {
            e();
        }
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        bbmo bbmo = this.a;
        int i = 1;
        while (!g()) {
            Object bI_;
            int size;
            bbpd bbpd = this.g;
            if (bbpd != null) {
                while (!g()) {
                    bI_ = bbpd.bI_();
                    if (bI_ != null) {
                        bbmo.b_(bI_);
                    }
                }
                return;
            }
            boolean z = this.h;
            bbpd bbpd2 = this.g;
            bbub[] bbubArr = (bbub[]) this.j.get();
            int length = bbubArr.length;
            if (this.f != Integer.MAX_VALUE) {
                synchronized (this) {
                    size = this.q.size();
                }
            } else {
                size = 0;
            }
            if (!z || ((bbpd2 != null && !bbpd2.b()) || length != 0 || size != 0)) {
                if (length != 0) {
                    long j = this.o;
                    size = this.p;
                    if (length <= size || bbubArr[size].a != j) {
                        if (length <= size) {
                            size = 0;
                        }
                        int i2 = size;
                        for (size = 0; size < length && bbubArr[i2].a != j; size++) {
                            i2++;
                            if (i2 == length) {
                                i2 = 0;
                            }
                        }
                        this.p = i2;
                        this.o = bbubArr[i2].a;
                        size = i2;
                    }
                    int i3 = 0;
                    bI_ = null;
                    while (i3 < length) {
                        if (!g()) {
                            bbub bbub = bbubArr[size];
                            if (!g()) {
                                bbpg bbpg = bbub.c;
                                if (bbpg != null) {
                                    while (true) {
                                        try {
                                            Object bI_2 = bbpg.bI_();
                                            if (bI_2 == null) {
                                                break;
                                            }
                                            bbmo.b_(bI_2);
                                            if (g()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            bbnm.a(th);
                                            bbnz.a((AtomicReference) bbub);
                                            bbyw.a(this.d, th);
                                            if (!g()) {
                                                a(bbub);
                                                i3++;
                                                bI_ = 1;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = bbub.b;
                                bbpg bbpg2 = bbub.c;
                                if (z2 && (bbpg2 == null || bbpg2.b())) {
                                    a(bbub);
                                    if (!g()) {
                                        bI_ = 1;
                                    }
                                }
                                size++;
                                if (size == length) {
                                    size = 0;
                                }
                                i3++;
                            }
                        }
                        return;
                    }
                    this.p = size;
                    this.o = bbubArr[size].a;
                    if (bI_ != null) {
                        if (this.f != Integer.MAX_VALUE) {
                            synchronized (this) {
                                bbmm bbmm = (bbmm) this.q.poll();
                                if (bbmm == null) {
                                    this.r--;
                                } else {
                                    a(bbmm);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    break;
                }
            } else {
                Throwable a = bbyw.a(this.d);
                if (a != bbyw.a) {
                    if (a != null) {
                        bbmo.a(a);
                    } else {
                        bbmo.a();
                    }
                }
                return;
            }
        }
    }

    private final boolean g() {
        if (this.i) {
            return true;
        }
        if (((Throwable) this.d.get()) == null) {
            return false;
        }
        f();
        Throwable a = bbyw.a(this.d);
        if (a != bbyw.a) {
            this.a.a(a);
        }
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        this.m.bK_();
        bbub[] bbubArr = (bbub[]) this.j.get();
        bbub[] bbubArr2 = l;
        int i = 0;
        if (bbubArr != bbubArr2) {
            bbubArr = (bbub[]) this.j.getAndSet(bbubArr2);
            if (bbubArr != l) {
                int length = bbubArr.length;
                while (i < length) {
                    bbnz.a(bbubArr[i]);
                    i++;
                }
                return true;
            }
        }
        return false;
    }
}
