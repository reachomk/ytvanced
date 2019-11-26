package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: wxf */
public final class wxf extends anje implements wxg {
    private final anko a;

    public static wxf a() {
        return new wxf(anko.f());
    }

    protected wxf() {
        this(anko.f());
    }

    private wxf(anko anko) {
        this.a = anko;
    }

    /* Access modifiers changed, original: protected|final */
    public final anjv b() {
        return this.a;
    }

    public final void a(Object obj, Object obj2) {
        this.a.a_(obj2);
    }

    public final void a(Object obj, Exception exception) {
        Throwable exception2;
        if (exception2 == null) {
            exception2 = new ExecutionException("No exception provided to CallbackFuture.onError", null);
        }
        this.a.a(exception2);
    }

    public final Object get() {
        return ankv.a(this.a);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|10|11|12) */
    /* JADX WARNING: Missing block: B:13:0x0027, code skipped:
            r6 = th;
     */
    /* JADX WARNING: Missing block: B:14:0x0028, code skipped:
            r2 = 1;
     */
    /* JADX WARNING: Missing block: B:16:0x002b, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
    public final java.lang.Object get(long r6, java.util.concurrent.TimeUnit r8) {
        /*
        r5 = this;
        r0 = r5.a;
        r1 = 1;
        r2 = 0;
        r6 = r8.toNanos(r6);	 Catch:{ all -> 0x001d }
        r3 = java.lang.System.nanoTime();	 Catch:{ all -> 0x001d }
        r3 = r3 + r6;
    L_0x000d:
        r8 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ InterruptedException -> 0x001f }
        r6 = r0.get(r6, r8);	 Catch:{ InterruptedException -> 0x001f }
        if (r2 == 0) goto L_0x001c;
    L_0x0015:
        r7 = java.lang.Thread.currentThread();
        r7.interrupt();
    L_0x001c:
        return r6;
    L_0x001d:
        r6 = move-exception;
        goto L_0x0029;
    L_0x001f:
        r6 = java.lang.System.nanoTime();	 Catch:{ all -> 0x0027 }
        r6 = r3 - r6;
        r2 = 1;
        goto L_0x000d;
    L_0x0027:
        r6 = move-exception;
        r2 = 1;
    L_0x0029:
        if (r2 == 0) goto L_0x0032;
    L_0x002b:
        r7 = java.lang.Thread.currentThread();
        r7.interrupt();
    L_0x0032:
        goto L_0x0034;
    L_0x0033:
        throw r6;
    L_0x0034:
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxf.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ Future c() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ Object d() {
        return this.a;
    }
}
