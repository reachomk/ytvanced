package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.litho.ComponentTree;

/* renamed from: cmg */
public class cmg {
    public static final coz a = new cqf();
    public final Context b;
    public final String c;
    public final cnh d;
    public final crg e;
    public final cpb f;
    public String g;
    public cma h;
    public final cqx i;
    public int j;
    public int k;
    public csq l;
    public ComponentTree m;

    private cmg(Context context, String str, cnh cnh, csq csq) {
        if (cnh == null || str != null) {
            this.b = context;
            this.i = cqx.a(context.getResources().getConfiguration());
            this.l = csq;
            this.d = cnh;
            this.c = str;
            this.e = null;
            this.f = null;
            return;
        }
        throw new IllegalStateException("When a ComponentsLogger is set, a LogTag must be set");
    }

    public cmg(cmg cmg, crg crg, cpb cpb, csq csq) {
        this.b = cmg.b;
        this.i = cmg.i;
        this.j = cmg.j;
        this.k = cmg.k;
        this.h = cmg.h;
        this.m = cmg.m;
        this.d = cmg.d;
        this.c = cmg.c;
        if (crg == null) {
            crg = cmg.e;
        }
        this.e = crg;
        if (cpb == null) {
            cpb = cmg.f;
        }
        this.f = cpb;
        if (csq == null) {
            csq = cmg.l;
        }
        this.l = csq;
    }

    public cmg(Context context, String str, cnh cnh, csq csq, byte b) {
        this(context, str, cnh, csq);
    }

    public cmg(Context context, String str, cnh cnh) {
        this(context, str, cnh, null);
    }

    private cmg(cmg cmg) {
        this(cmg, cmg.e, cmg.f, cmg.l);
    }

    public cmg(Context context) {
        this(context, null, null, null);
    }

    /* Access modifiers changed, original: final */
    public final cmg a() {
        return new cmg(this);
    }

    public final Resources b() {
        return this.b.getResources();
    }

    /* JADX WARNING: Missing block: B:11:0x0018, code skipped:
            defpackage.cxx.b.addAndGet(1);
            r5 = android.os.Looper.myLooper();
     */
    /* JADX WARNING: Missing block: B:12:0x0023, code skipped:
            if (r5 != null) goto L_0x004b;
     */
    /* JADX WARNING: Missing block: B:13:0x0025, code skipped:
            android.util.Log.w(com.facebook.litho.ComponentTree.a, "You cannot update state synchronously from a thread without a looper, using the default background layout thread instead");
            r1 = r0.f;
     */
    /* JADX WARNING: Missing block: B:14:0x002e, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r5 = r0.g;
     */
    /* JADX WARNING: Missing block: B:17:0x0031, code skipped:
            if (r5 == null) goto L_0x0038;
     */
    /* JADX WARNING: Missing block: B:18:0x0033, code skipped:
            r0.o.removeCallbacks(r5);
     */
    /* JADX WARNING: Missing block: B:19:0x0038, code skipped:
            r0.g = new defpackage.cnf(r0, r6);
            r0.o.post(r0.g);
     */
    /* JADX WARNING: Missing block: B:20:0x0046, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:21:0x0047, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:25:0x004b, code skipped:
            r1 = com.facebook.litho.ComponentTree.d;
     */
    /* JADX WARNING: Missing block: B:26:0x004d, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            r2 = (java.lang.ref.WeakReference) com.facebook.litho.ComponentTree.d.get();
     */
    /* JADX WARNING: Missing block: B:29:0x0056, code skipped:
            if (r2 == null) goto L_0x0065;
     */
    /* JADX WARNING: Missing block: B:31:0x005c, code skipped:
            if (r2.get() == null) goto L_0x0065;
     */
    /* JADX WARNING: Missing block: B:32:0x005e, code skipped:
            r5 = (android.os.Handler) r2.get();
     */
    /* JADX WARNING: Missing block: B:33:0x0065, code skipped:
            r2 = new android.os.Handler(r5);
            com.facebook.litho.ComponentTree.d.set(new java.lang.ref.WeakReference(r2));
            r5 = r2;
     */
    /* JADX WARNING: Missing block: B:34:0x0075, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:35:0x0076, code skipped:
            r2 = r0.f;
     */
    /* JADX WARNING: Missing block: B:36:0x0078, code skipped:
            monitor-enter(r2);
     */
    /* JADX WARNING: Missing block: B:38:?, code skipped:
            r1 = r0.g;
     */
    /* JADX WARNING: Missing block: B:39:0x007b, code skipped:
            if (r1 == null) goto L_0x0080;
     */
    /* JADX WARNING: Missing block: B:40:0x007d, code skipped:
            r5.removeCallbacks(r1);
     */
    /* JADX WARNING: Missing block: B:41:0x0080, code skipped:
            r0.g = new defpackage.cnf(r0, r6);
            r5.post(r0.g);
     */
    /* JADX WARNING: Missing block: B:42:0x008c, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:43:0x008d, code skipped:
            return;
     */
    public final void a(defpackage.cmq r5, java.lang.String r6) {
        /*
        r4 = this;
        r4.i();
        r0 = r4.m;
        if (r0 == 0) goto L_0x0097;
    L_0x0007:
        r1 = r4.h;
        r1 = r1.l;
        monitor-enter(r0);
        r2 = r0.v;	 Catch:{ all -> 0x0094 }
        if (r2 != 0) goto L_0x0012;
    L_0x0010:
        monitor-exit(r0);	 Catch:{ all -> 0x0094 }
        return;
    L_0x0012:
        r2 = r0.y;	 Catch:{ all -> 0x0094 }
        r2.a(r1, r5);	 Catch:{ all -> 0x0094 }
        monitor-exit(r0);	 Catch:{ all -> 0x0094 }
        r5 = defpackage.cxx.b;
        r1 = 1;
        r5.addAndGet(r1);
        r5 = android.os.Looper.myLooper();
        if (r5 != 0) goto L_0x004b;
    L_0x0025:
        r5 = com.facebook.litho.ComponentTree.a;
        r1 = "You cannot update state synchronously from a thread without a looper, using the default background layout thread instead";
        android.util.Log.w(r5, r1);
        r1 = r0.f;
        monitor-enter(r1);
        r5 = r0.g;	 Catch:{ all -> 0x0048 }
        if (r5 == 0) goto L_0x0038;
    L_0x0033:
        r2 = r0.o;	 Catch:{ all -> 0x0048 }
        r2.removeCallbacks(r5);	 Catch:{ all -> 0x0048 }
    L_0x0038:
        r5 = new cnf;	 Catch:{ all -> 0x0048 }
        r5.<init>(r0, r6);	 Catch:{ all -> 0x0048 }
        r0.g = r5;	 Catch:{ all -> 0x0048 }
        r5 = r0.o;	 Catch:{ all -> 0x0048 }
        r6 = r0.g;	 Catch:{ all -> 0x0048 }
        r5.post(r6);	 Catch:{ all -> 0x0048 }
        monitor-exit(r1);	 Catch:{ all -> 0x0048 }
        return;
    L_0x0048:
        r5 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0048 }
        throw r5;
    L_0x004b:
        r1 = com.facebook.litho.ComponentTree.d;
        monitor-enter(r1);
        r2 = com.facebook.litho.ComponentTree.d;	 Catch:{ all -> 0x0091 }
        r2 = r2.get();	 Catch:{ all -> 0x0091 }
        r2 = (java.lang.ref.WeakReference) r2;	 Catch:{ all -> 0x0091 }
        if (r2 == 0) goto L_0x0065;
    L_0x0058:
        r3 = r2.get();	 Catch:{ all -> 0x0091 }
        if (r3 == 0) goto L_0x0065;
    L_0x005e:
        r5 = r2.get();	 Catch:{ all -> 0x0091 }
        r5 = (android.os.Handler) r5;	 Catch:{ all -> 0x0091 }
        goto L_0x0075;
    L_0x0065:
        r2 = new android.os.Handler;	 Catch:{ all -> 0x0091 }
        r2.<init>(r5);	 Catch:{ all -> 0x0091 }
        r5 = com.facebook.litho.ComponentTree.d;	 Catch:{ all -> 0x0091 }
        r3 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0091 }
        r3.<init>(r2);	 Catch:{ all -> 0x0091 }
        r5.set(r3);	 Catch:{ all -> 0x0091 }
        r5 = r2;
    L_0x0075:
        monitor-exit(r1);	 Catch:{ all -> 0x0091 }
        r2 = r0.f;
        monitor-enter(r2);
        r1 = r0.g;	 Catch:{ all -> 0x008e }
        if (r1 == 0) goto L_0x0080;
    L_0x007d:
        r5.removeCallbacks(r1);	 Catch:{ all -> 0x008e }
    L_0x0080:
        r1 = new cnf;	 Catch:{ all -> 0x008e }
        r1.<init>(r0, r6);	 Catch:{ all -> 0x008e }
        r0.g = r1;	 Catch:{ all -> 0x008e }
        r6 = r0.g;	 Catch:{ all -> 0x008e }
        r5.post(r6);	 Catch:{ all -> 0x008e }
        monitor-exit(r2);	 Catch:{ all -> 0x008e }
        return;
    L_0x008e:
        r5 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x008e }
        throw r5;
    L_0x0091:
        r5 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0091 }
        throw r5;
    L_0x0094:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0094 }
        throw r5;
    L_0x0097:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmg.a(cmq, java.lang.String):void");
    }

    public final void b(cmq cmq, String str) {
        i();
        ComponentTree componentTree = this.m;
        if (componentTree != null) {
            String str2 = this.h.l;
            if (componentTree.m) {
                synchronized (componentTree) {
                    if (componentTree.v == null) {
                        return;
                    }
                    componentTree.y.a(str2, cmq);
                    componentTree.a(true, str);
                    return;
                }
            }
            throw new RuntimeException("Triggering async state updates on this component tree is disabled, use sync state updates.");
        }
    }

    public final void a(cmq cmq) {
        ComponentTree componentTree = this.m;
        if (componentTree != null) {
            componentTree.a(this.h.l, cmq);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        this.g = null;
    }

    private final void i() {
        String str = this.g;
        if (str != null) {
            StringBuilder stringBuilder = new StringBuilder(str.length() + 107);
            stringBuilder.append("Updating the state of a component during ");
            stringBuilder.append(str);
            stringBuilder.append(" leads to unexpected behaviour, consider using lazy state updates.");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(csq csq) {
        this.l = csq;
    }

    /* Access modifiers changed, original: protected */
    public csq d() {
        return this.l;
    }

    public final csq e() {
        return csq.a(this.l);
    }

    public coj a(int i, Object[] objArr) {
        return new coj(this.h, i, objArr);
    }

    /* Access modifiers changed, original: final */
    public final coz f() {
        return coz.a(this);
    }

    /* Access modifiers changed, original: final */
    public final coz a(cma cma) {
        cma = cma.j();
        cma.d(this);
        return cma.b(cma.p, false);
    }

    public static cmg a(cmg cmg, cma cma) {
        cmg a = cmg.a();
        a.h = cma;
        a.m = cmg.m;
        return a;
    }

    public final boolean g() {
        ComponentTree componentTree = this.m;
        if (componentTree == null) {
            return false;
        }
        return componentTree.i;
    }

    public final int h() {
        ComponentTree componentTree = this.m;
        if (componentTree == null) {
            return cuj.s;
        }
        return componentTree.C;
    }
}
