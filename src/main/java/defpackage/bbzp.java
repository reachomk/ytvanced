package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: bbzp */
public final class bbzp extends bbzx {
    private static final bbzs[] c = new bbzs[0];
    private static final bbzs[] d = new bbzs[0];
    public final AtomicReference a;
    private final AtomicReference b;
    private final ReadWriteLock e;
    private final Lock f;
    private final Lock g;
    private final AtomicReference h;
    private long i;

    public static bbzp b() {
        return new bbzp();
    }

    public static bbzp e(Object obj) {
        return new bbzp(obj);
    }

    bbzp() {
        this.e = new ReentrantReadWriteLock();
        this.f = this.e.readLock();
        this.g = this.e.writeLock();
        this.b = new AtomicReference(c);
        this.a = new AtomicReference();
        this.h = new AtomicReference();
    }

    private bbzp(Object obj) {
        this();
        this.a.lazySet(bbow.a(obj, "defaultValue is null"));
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:26:0x005f, code skipped:
            if (r6 == null) goto L_0x0098;
     */
    /* JADX WARNING: Missing block: B:28:0x0065, code skipped:
            if (r0.a(r6) != false) goto L_0x0098;
     */
    /* JADX WARNING: Missing block: B:30:0x0069, code skipped:
            if (r0.e != false) goto L_0x0098;
     */
    /* JADX WARNING: Missing block: B:31:0x006b, code skipped:
            monitor-enter(r0);
     */
    /* JADX WARNING: Missing block: B:33:?, code skipped:
            r6 = r0.d;
     */
    /* JADX WARNING: Missing block: B:34:0x006e, code skipped:
            if (r6 != null) goto L_0x0074;
     */
    /* JADX WARNING: Missing block: B:35:0x0070, code skipped:
            r0.c = false;
     */
    /* JADX WARNING: Missing block: B:36:0x0072, code skipped:
            monitor-exit(r0);
     */
    /* JADX WARNING: Missing block: B:37:0x0073, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:38:0x0074, code skipped:
            r0.d = null;
     */
    /* JADX WARNING: Missing block: B:39:0x0077, code skipped:
            monitor-exit(r0);
     */
    /* JADX WARNING: Missing block: B:40:0x0078, code skipped:
            r6 = r6.a;
     */
    /* JADX WARNING: Missing block: B:41:0x007a, code skipped:
            if (r6 == null) goto L_0x0067;
     */
    /* JADX WARNING: Missing block: B:42:0x007c, code skipped:
            r1 = 0;
     */
    /* JADX WARNING: Missing block: B:44:0x007e, code skipped:
            if (r1 >= 4) goto L_0x008d;
     */
    /* JADX WARNING: Missing block: B:45:0x0080, code skipped:
            r3 = r6[r1];
     */
    /* JADX WARNING: Missing block: B:46:0x0082, code skipped:
            if (r3 == null) goto L_0x008d;
     */
    /* JADX WARNING: Missing block: B:48:0x0088, code skipped:
            if (r0.a(r3) != false) goto L_0x0067;
     */
    /* JADX WARNING: Missing block: B:49:0x008a, code skipped:
            r1 = r1 + 1;
     */
    /* JADX WARNING: Missing block: B:50:0x008d, code skipped:
            r6 = (java.lang.Object[]) r6[4];
     */
    public final void a(defpackage.bbmo r6) {
        /*
        r5 = this;
        r0 = new bbzs;
        r0.<init>(r6, r5);
        r6.a(r0);
    L_0x0008:
        r1 = r5.b;
        r1 = r1.get();
        r1 = (defpackage.bbzs[]) r1;
        r2 = d;
        if (r1 == r2) goto L_0x0099;
    L_0x0014:
        r2 = r1.length;
        r3 = r2 + 1;
        r3 = new defpackage.bbzs[r3];
        r4 = 0;
        java.lang.System.arraycopy(r1, r4, r3, r4, r2);
        r3[r2] = r0;
        r2 = r5.b;
        r1 = r2.compareAndSet(r1, r3);
        if (r1 == 0) goto L_0x0008;
    L_0x0027:
        r6 = r0.e;
        if (r6 == 0) goto L_0x002f;
    L_0x002b:
        r5.a(r0);
        goto L_0x0098;
    L_0x002f:
        r6 = r0.e;
        if (r6 != 0) goto L_0x0098;
    L_0x0033:
        monitor-enter(r0);
        r6 = r0.e;	 Catch:{ all -> 0x0095 }
        if (r6 == 0) goto L_0x003a;
    L_0x0038:
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
        return;
    L_0x003a:
        r6 = r0.b;	 Catch:{ all -> 0x0095 }
        if (r6 == 0) goto L_0x0040;
    L_0x003e:
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
        return;
    L_0x0040:
        r6 = r0.a;	 Catch:{ all -> 0x0095 }
        r1 = r6.f;	 Catch:{ all -> 0x0095 }
        r1.lock();	 Catch:{ all -> 0x0095 }
        r2 = r6.i;	 Catch:{ all -> 0x0095 }
        r0.f = r2;	 Catch:{ all -> 0x0095 }
        r6 = r6.a;	 Catch:{ all -> 0x0095 }
        r6 = r6.get();	 Catch:{ all -> 0x0095 }
        r1.unlock();	 Catch:{ all -> 0x0095 }
        r1 = 1;
        if (r6 == 0) goto L_0x0059;
    L_0x0057:
        r2 = 1;
        goto L_0x005a;
    L_0x0059:
        r2 = 0;
    L_0x005a:
        r0.c = r2;	 Catch:{ all -> 0x0095 }
        r0.b = r1;	 Catch:{ all -> 0x0095 }
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
        if (r6 == 0) goto L_0x0098;
    L_0x0061:
        r6 = r0.a(r6);
        if (r6 != 0) goto L_0x0098;
    L_0x0067:
        r6 = r0.e;
        if (r6 != 0) goto L_0x0098;
    L_0x006b:
        monitor-enter(r0);
        r6 = r0.d;	 Catch:{ all -> 0x0092 }
        if (r6 != 0) goto L_0x0074;
    L_0x0070:
        r0.c = r4;	 Catch:{ all -> 0x0092 }
        monitor-exit(r0);	 Catch:{ all -> 0x0092 }
        return;
    L_0x0074:
        r1 = 0;
        r0.d = r1;	 Catch:{ all -> 0x0092 }
        monitor-exit(r0);	 Catch:{ all -> 0x0092 }
        r6 = r6.a;
    L_0x007a:
        if (r6 == 0) goto L_0x0067;
    L_0x007c:
        r1 = 0;
    L_0x007d:
        r2 = 4;
        if (r1 >= r2) goto L_0x008d;
    L_0x0080:
        r3 = r6[r1];
        if (r3 == 0) goto L_0x008d;
    L_0x0084:
        r2 = r0.a(r3);
        if (r2 != 0) goto L_0x0067;
    L_0x008a:
        r1 = r1 + 1;
        goto L_0x007d;
    L_0x008d:
        r6 = r6[r2];
        r6 = (java.lang.Object[]) r6;
        goto L_0x007a;
    L_0x0092:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0092 }
        throw r6;
    L_0x0095:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
        throw r6;
    L_0x0098:
        return;
    L_0x0099:
        r0 = r5.h;
        r0 = r0.get();
        r0 = (java.lang.Throwable) r0;
        r1 = defpackage.bbyw.a;
        if (r0 != r1) goto L_0x00a9;
    L_0x00a5:
        r6.a();
        return;
    L_0x00a9:
        r6.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbzp.a(bbmo):void");
    }

    public final void a(bbnc bbnc) {
        if (this.h.get() != null) {
            bbnc.bK_();
        }
    }

    public final void b_(Object obj) {
        bbow.a(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h.get() == null) {
            obj = bbyy.a(obj);
            g(obj);
            for (bbzs a : (bbzs[]) this.b.get()) {
                a.a(obj, this.i);
            }
        }
    }

    public final void a(Throwable th) {
        bbow.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h.compareAndSet(null, th)) {
            Object a = bbyy.a(th);
            for (bbzs a2 : f(a)) {
                a2.a(a, this.i);
            }
            return;
        }
        bbzf.a(th);
    }

    public final void a() {
        if (this.h.compareAndSet(null, bbyw.a)) {
            bbyy bbyy = bbyy.a;
            for (bbzs a : f(bbyy)) {
                a.a(bbyy, this.i);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bbzs bbzs) {
        bbzs[] bbzsArr;
        Object obj;
        do {
            bbzsArr = (bbzs[]) this.b.get();
            int length = bbzsArr.length;
            if (length != 0) {
                int i = 0;
                while (i < length) {
                    if (bbzsArr[i] == bbzs) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i < 0) {
                    return;
                }
                if (length != 1) {
                    obj = new bbzs[(length - 1)];
                    System.arraycopy(bbzsArr, 0, obj, 0, i);
                    System.arraycopy(bbzsArr, i + 1, obj, i, (length - i) - 1);
                } else {
                    obj = c;
                }
            } else {
                return;
            }
        } while (!this.b.compareAndSet(bbzsArr, obj));
    }

    private final bbzs[] f(Object obj) {
        bbzs[] bbzsArr = (bbzs[]) this.b.getAndSet(d);
        if (bbzsArr != d) {
            g(obj);
        }
        return bbzsArr;
    }

    private final void g(Object obj) {
        this.g.lock();
        this.i++;
        this.a.lazySet(obj);
        this.g.unlock();
    }
}
