package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaMeasureFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cmm */
public class cmm implements coh {
    private static final AtomicInteger a = new AtomicInteger();
    private static final YogaMeasureFunction b = new cmo();
    private static final Map c = new HashMap();
    public final int t;

    protected cmm() {
        Class cls = getClass();
        synchronized (c) {
            if (!c.containsKey(cls)) {
                c.put(cls, Integer.valueOf(a.incrementAndGet()));
            }
            this.t = ((Integer) c.get(cls)).intValue();
        }
    }

    public int A() {
        return 1;
    }

    /* Access modifiers changed, original: protected */
    public int a(int i, int i2) {
        return aocf.UNSET_ENUM_VALUE;
    }

    /* Access modifiers changed, original: protected */
    public csq a(cmg cmg, csq csq) {
        return csq;
    }

    public Object a(coj coj, Object obj) {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public void a(aca aca, int i, int i2, int i3) {
    }

    /* Access modifiers changed, original: protected */
    public void a(View view, aca aca) {
    }

    /* Access modifiers changed, original: protected */
    public void a(cmg cmg, cmn cmn) {
    }

    /* Access modifiers changed, original: protected */
    public void a(crh crh, crh crh2) {
    }

    /* Access modifiers changed, original: protected */
    public void a(csq csq) {
    }

    public void a(String str) {
    }

    public void b(Object obj) {
    }

    public void b(String str) {
    }

    /* Access modifiers changed, original: protected */
    public void c(cmg cmg, Object obj) {
    }

    public void d(cmg cmg, Object obj) {
    }

    /* Access modifiers changed, original: protected */
    public void e(cmg cmg) {
    }

    /* Access modifiers changed, original: protected */
    public void e(cmg cmg, Object obj) {
    }

    /* Access modifiers changed, original: protected */
    public void f(cmg cmg) {
    }

    /* Access modifiers changed, original: protected */
    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public int q() {
        return 0;
    }

    public boolean r() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public boolean s() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public boolean t() {
        return false;
    }

    public boolean u() {
        return false;
    }

    public boolean v() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public int w() {
        return 3;
    }

    /* Access modifiers changed, original: protected */
    public boolean x() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public boolean y() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public boolean z() {
        return false;
    }

    public final Object a(Context context) {
        boolean d = cno.d();
        if (d) {
            String valueOf = String.valueOf(((cma) this).b());
            String str = "createMountContent:";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            cno.a();
        }
        try {
            Object b = b(context);
            if (d) {
                cno.c();
            }
            return b;
        } catch (Throwable th) {
            if (d) {
                cno.c();
            }
        }
    }

    public final void a(cmg cmg, Object obj) {
        cmg.g = "mount";
        boolean d = cno.d();
        if (d) {
            String valueOf = String.valueOf(((cma) this).b());
            String str = "onMount:";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            cno.a();
        }
        try {
            c(cmg, obj);
            if (d) {
                cno.c();
            }
        } catch (Exception e) {
            cmg.c();
            cmm.a(e);
            if (d) {
                cno.c();
            }
        } catch (Throwable th) {
            if (d) {
                cno.c();
            }
        }
        cmg.c();
    }

    public final void b(cmg cmg, Object obj) {
        cmg.g = "bind";
        boolean d = cno.d();
        if (d) {
            String valueOf = String.valueOf(((cma) this).b());
            String str = "onBind:";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            cno.a();
        }
        try {
            e(cmg, obj);
            if (d) {
                cno.c();
            }
            cmg.c();
        } catch (Throwable th) {
            if (d) {
                cno.c();
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078 A:{Catch:{ Exception -> 0x0062, all -> 0x0115 }} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077 A:{Catch:{ Exception -> 0x0062, all -> 0x0115 }} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x0040, B:19:0x005d] */
    /* JADX WARNING: Missing block: B:21:0x0062, code skipped:
            r4 = move-exception;
     */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            defpackage.cmm.a(r4);
     */
    /* JADX WARNING: Missing block: B:76:0x0115, code skipped:
            r7 = move-exception;
     */
    /* JADX WARNING: Missing block: B:77:0x0116, code skipped:
            r8 = new defpackage.cmr(r0, r7);
     */
    public final defpackage.coz b(defpackage.cmg r7, boolean r8) {
        /*
        r6 = this;
        r0 = r6;
        r0 = (defpackage.cma) r0;
        r1 = defpackage.cma.g(r0);
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x000c;
    L_0x000b:
        goto L_0x0010;
    L_0x000c:
        if (r8 == 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0010;
    L_0x000f:
        r2 = 1;
    L_0x0010:
        r8 = r7.d();
        r8 = r6.a(r7, r8);
        r7.a(r8);
        r8 = defpackage.cno.d();
        if (r8 == 0) goto L_0x003d;
    L_0x0021:
        r1 = r0.b();
        r1 = java.lang.String.valueOf(r1);
        r4 = "createLayout:";
        r5 = r1.length();
        if (r5 != 0) goto L_0x0037;
    L_0x0031:
        r1 = new java.lang.String;
        r1.<init>(r4);
        goto L_0x003a;
    L_0x0037:
        r4.concat(r1);
    L_0x003a:
        defpackage.cno.a();
    L_0x003d:
        r1 = 0;
        if (r2 == 0) goto L_0x0051;
    L_0x0040:
        r1 = defpackage.coz.a(r7);	 Catch:{ all -> 0x0115 }
        r4 = r7.d();	 Catch:{ all -> 0x0115 }
        r1.f = r3;	 Catch:{ all -> 0x0115 }
        r3 = defpackage.csq.a(r4);	 Catch:{ all -> 0x0115 }
        r1.L = r3;	 Catch:{ all -> 0x0115 }
        goto L_0x00ad;
    L_0x0051:
        r4 = r0.a();	 Catch:{ all -> 0x0115 }
        if (r4 != 0) goto L_0x009e;
    L_0x0057:
        r4 = defpackage.cma.f(r0);	 Catch:{ all -> 0x0115 }
        if (r4 != 0) goto L_0x0067;
    L_0x005d:
        r4 = r6.b(r7);	 Catch:{ Exception -> 0x0062 }
        goto L_0x0075;
    L_0x0062:
        r4 = move-exception;
        defpackage.cmm.a(r4);	 Catch:{ all -> 0x0115 }
        goto L_0x0074;
    L_0x0067:
        r4 = r7.j;	 Catch:{ Exception -> 0x0070 }
        r5 = r7.k;	 Catch:{ Exception -> 0x0070 }
        r4 = r6.a(r7, r4, r5);	 Catch:{ Exception -> 0x0070 }
        goto L_0x0075;
    L_0x0070:
        r4 = move-exception;
        defpackage.cmm.a(r4);	 Catch:{ all -> 0x0115 }
    L_0x0074:
        r4 = r1;
    L_0x0075:
        if (r4 != 0) goto L_0x0078;
    L_0x0077:
        goto L_0x00ad;
    L_0x0078:
        r5 = r4.j;	 Catch:{ all -> 0x0115 }
        if (r5 <= 0) goto L_0x00ad;
    L_0x007c:
        r1 = r4.j();	 Catch:{ all -> 0x0115 }
        r1.a(r7, r3);	 Catch:{ all -> 0x0115 }
        r3 = r1.p;	 Catch:{ all -> 0x0115 }
        r3 = r1.c(r3);	 Catch:{ all -> 0x0115 }
        r3 = (defpackage.coz) r3;	 Catch:{ all -> 0x0115 }
        r4 = r1.a();	 Catch:{ all -> 0x0115 }
        if (r4 != 0) goto L_0x0092;
    L_0x0091:
        goto L_0x009c;
    L_0x0092:
        r4 = r1.q;	 Catch:{ all -> 0x0115 }
        if (r4 != 0) goto L_0x0097;
    L_0x0096:
        goto L_0x009c;
    L_0x0097:
        r1 = r1.p;	 Catch:{ all -> 0x0115 }
        r4.a(r3);	 Catch:{ all -> 0x0115 }
    L_0x009c:
        r1 = r3;
        goto L_0x00ad;
    L_0x009e:
        r1 = r0.p;	 Catch:{ all -> 0x0115 }
        r1 = r1.e();	 Catch:{ all -> 0x0115 }
        r7.a(r1);	 Catch:{ all -> 0x0115 }
        r1 = r0.c(r7);	 Catch:{ all -> 0x0115 }
        r1 = (defpackage.coz) r1;	 Catch:{ all -> 0x0115 }
    L_0x00ad:
        if (r8 == 0) goto L_0x00b2;
    L_0x00af:
        defpackage.cno.c();
    L_0x00b2:
        if (r1 == 0) goto L_0x0112;
    L_0x00b4:
        r8 = defpackage.cmg.a;
        if (r1 != r8) goto L_0x00b9;
    L_0x00b8:
        goto L_0x0112;
    L_0x00b9:
        r8 = r0.q;
        if (r8 != 0) goto L_0x00be;
    L_0x00bd:
        goto L_0x00ca;
    L_0x00be:
        if (r2 == 0) goto L_0x00c1;
    L_0x00c0:
        goto L_0x00c7;
    L_0x00c1:
        r3 = defpackage.cma.f(r0);
        if (r3 != 0) goto L_0x00ca;
    L_0x00c7:
        r8.a(r1);
    L_0x00ca:
        r8 = r1.B();
        if (r8 != 0) goto L_0x00e4;
    L_0x00d0:
        r8 = r6.n();
        if (r8 == 0) goto L_0x00dd;
    L_0x00d6:
        r8 = defpackage.cma.d(r0);
        if (r8 == 0) goto L_0x00dd;
    L_0x00dc:
        goto L_0x00df;
    L_0x00dd:
        if (r2 == 0) goto L_0x00e4;
    L_0x00df:
        r8 = b;
        r1.a(r8);
    L_0x00e4:
        r1.b(r0);
        r8 = r7.b;
        defpackage.csn.a(r8);
        if (r2 != 0) goto L_0x00f1;
    L_0x00ee:
        r6.e(r7);
    L_0x00f1:
        r7 = r0.s;
        if (r7 == 0) goto L_0x0111;
    L_0x00f5:
        r7 = r7.isEmpty();
        if (r7 != 0) goto L_0x0111;
    L_0x00fb:
        r7 = r0.s;
        r8 = r1.J;
        if (r8 != 0) goto L_0x010c;
    L_0x0101:
        r8 = new java.util.ArrayList;
        r0 = r7.size();
        r8.<init>(r0);
        r1.J = r8;
    L_0x010c:
        r8 = r1.J;
        r8.addAll(r7);
    L_0x0111:
        return r1;
    L_0x0112:
        r7 = defpackage.cmg.a;
        return r7;
    L_0x0115:
        r7 = move-exception;
        r8 = new cmr;
        r8.<init>(r0, r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmm.b(cmg, boolean):coz");
    }

    private static void a(Exception exception) {
        if (exception instanceof RuntimeException) {
            throw ((RuntimeException) exception);
        }
        throw new RuntimeException(exception);
    }

    public static void a(cmg cmg, coi coi) {
        coj coj = cmg.h.r;
    }

    /* Access modifiers changed, original: protected */
    public cma b(cmg cmg) {
        return (cls) cls.a(cmg).c();
    }

    /* Access modifiers changed, original: protected */
    public cma a(cmg cmg, int i, int i2) {
        return (cls) cls.a(cmg).c();
    }

    /* Access modifiers changed, original: protected */
    public cmn c(cmg cmg) {
        return b(cmg, false);
    }

    /* Access modifiers changed, original: protected */
    public void a(cmg cmg, cmn cmn, int i, int i2, crd crd) {
        String valueOf = String.valueOf(this);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 89);
        stringBuilder.append("You must override onMeasure() if you return true in canMeasure(), ComponentLifecycle is: ");
        stringBuilder.append(valueOf);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected */
    public Object b(Context context) {
        throw new RuntimeException("Trying to mount a MountSpec that doesn't implement @OnCreateMountContent");
    }

    /* Access modifiers changed, original: protected */
    public cpy p() {
        getClass().getSimpleName();
        return new cny(w());
    }

    public final boolean a(cma cma, cma cma2) {
        if (t()) {
            return b(cma, cma2);
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean b(cma cma, cma cma2) {
        return cma.a(cma2) ^ 1;
    }

    protected static coj a(cmg cmg, int i, Object[] objArr) {
        coj a = cmg.a(i, objArr);
        ComponentTree componentTree = cmg.m;
        if (componentTree != null) {
            componentTree.B.a(cmg.h.l, a);
        }
        return a;
    }

    static {
        cmp cmp = new cmp();
    }
}
