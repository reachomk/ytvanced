package defpackage;

import java.util.concurrent.Executor;

/* renamed from: anhk */
public abstract class anhk extends aniz implements Runnable {
    private anjv a;
    private Class f;
    private Object g;

    public static anjv a(anjv anjv, Class cls, anim anim, Executor executor) {
        anhj anhj = new anhj(anjv, cls, anim);
        anjv.a(anhj, ankc.a(executor, anhj));
        return anhj;
    }

    public abstract Object a(Object obj, Throwable th);

    public abstract void b(Object obj);

    anhk(anjv anjv, Class cls, Object obj) {
        this.a = (anjv) amqw.a((Object) anjv);
        this.f = (Class) amqw.a((Object) cls);
        this.g = amqw.a(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    public final void run() {
        /*
        r7 = this;
        r0 = r7.a;
        r1 = r7.f;
        r2 = r7.g;
        r3 = 1;
        r4 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x000a:
        r5 = 1;
        goto L_0x000d;
    L_0x000c:
        r5 = 0;
    L_0x000d:
        if (r1 != 0) goto L_0x0011;
    L_0x000f:
        r6 = 1;
        goto L_0x0012;
    L_0x0011:
        r6 = 0;
    L_0x0012:
        r5 = r5 | r6;
        if (r2 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0017;
    L_0x0016:
        r3 = 0;
    L_0x0017:
        r3 = r3 | r5;
        r4 = r7.isCancelled();
        r3 = r3 | r4;
        if (r3 != 0) goto L_0x0061;
    L_0x001f:
        r3 = 0;
        r7.a = r3;
        r4 = defpackage.anjf.a(r0);	 Catch:{ ExecutionException -> 0x002b, all -> 0x0029 }
        r5 = r4;
        r4 = r3;
        goto L_0x0037;
    L_0x0029:
        r4 = move-exception;
        goto L_0x0036;
    L_0x002b:
        r4 = move-exception;
        r4 = r4.getCause();
        r4 = defpackage.amqw.a(r4);
        r4 = (java.lang.Throwable) r4;
    L_0x0036:
        r5 = r3;
    L_0x0037:
        if (r4 == 0) goto L_0x005e;
    L_0x0039:
        r1 = r1.isInstance(r4);
        if (r1 == 0) goto L_0x005a;
    L_0x003f:
        r0 = r7.a(r2, r4);	 Catch:{ all -> 0x004b }
        r7.f = r3;
        r7.g = r3;
        r7.b(r0);
        return;
    L_0x004b:
        r0 = move-exception;
        r7.a(r0);	 Catch:{ all -> 0x0054 }
        r7.f = r3;
        r7.g = r3;
        return;
    L_0x0054:
        r0 = move-exception;
        r7.f = r3;
        r7.g = r3;
        throw r0;
    L_0x005a:
        r7.a(r0);
        return;
    L_0x005e:
        r7.a_(r5);
    L_0x0061:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anhk.run():void");
    }

    /* Access modifiers changed, original: protected|final */
    public final String ax_() {
        String valueOf;
        Object stringBuilder;
        anjv anjv = this.a;
        Class cls = this.f;
        Object obj = this.g;
        String ax_ = super.ax_();
        if (anjv != null) {
            valueOf = String.valueOf(anjv);
            StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 16);
            stringBuilder2.append("inputFuture=[");
            stringBuilder2.append(valueOf);
            stringBuilder2.append("], ");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        if (cls != null && obj != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(obj);
            StringBuilder stringBuilder3 = new StringBuilder(((String.valueOf(stringBuilder).length() + 29) + valueOf2.length()) + valueOf3.length());
            stringBuilder3.append(stringBuilder);
            stringBuilder3.append("exceptionType=[");
            stringBuilder3.append(valueOf2);
            stringBuilder3.append("], fallback=[");
            stringBuilder3.append(valueOf3);
            stringBuilder3.append("]");
            return stringBuilder3.toString();
        } else if (ax_ == null) {
            return null;
        } else {
            valueOf = String.valueOf(stringBuilder);
            return ax_.length() == 0 ? new String(valueOf) : valueOf.concat(ax_);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        a(this.a);
        this.a = null;
        this.f = null;
        this.g = null;
    }
}
