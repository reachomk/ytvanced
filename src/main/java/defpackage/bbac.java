package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* renamed from: bbac */
final class bbac implements bbek {
    public final Object a = new Object();
    public final bawg b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public bbej f;
    public Collection g = new LinkedHashSet();
    public bavx h;
    private final batp i = batp.a(bbac.class, null);
    private final Executor j;
    private baud k;
    private long l;

    bbac(Executor executor, bawg bawg) {
        this.j = executor;
        this.b = bawg;
    }

    public final Runnable a(bbej bbej) {
        throw null;
    }

    /* JADX WARNING: Missing block: B:30:?, code skipped:
            r7 = defpackage.bbby.a(r3.a(), r9.a());
     */
    /* JADX WARNING: Missing block: B:31:0x004d, code skipped:
            if (r7 != null) goto L_0x0051;
     */
    /* JADX WARNING: Missing block: B:33:0x0051, code skipped:
            r7 = r7.a(r0.c, r0.b, r0.a);
     */
    /* JADX WARNING: Missing block: B:34:0x005b, code skipped:
            r6.b.a();
     */
    /* JADX WARNING: Missing block: B:35:0x0060, code skipped:
            return r7;
     */
    public final defpackage.bazo a(defpackage.bauw r7, defpackage.baum r8, defpackage.barv r9) {
        /*
        r6 = this;
        r0 = new bbfc;	 Catch:{ all -> 0x0064 }
        r0.<init>(r7, r8, r9);	 Catch:{ all -> 0x0064 }
        r7 = 0;
        r1 = 0;
    L_0x0008:
        r8 = r6.a;	 Catch:{ all -> 0x0064 }
        monitor-enter(r8);	 Catch:{ all -> 0x0064 }
        r3 = r6.h;	 Catch:{ all -> 0x0061 }
        if (r3 == 0) goto L_0x001b;
    L_0x000f:
        r7 = new bbbq;	 Catch:{ all -> 0x0061 }
        r7.<init>(r3);	 Catch:{ all -> 0x0061 }
        monitor-exit(r8);	 Catch:{ all -> 0x0061 }
        r8 = r6.b;
        r8.a();
        return r7;
    L_0x001b:
        r3 = r6.k;	 Catch:{ all -> 0x0061 }
        if (r3 != 0) goto L_0x002a;
    L_0x001f:
        r7 = r6.a(r0);	 Catch:{ all -> 0x0061 }
        monitor-exit(r8);	 Catch:{ all -> 0x0061 }
        r8 = r6.b;
        r8.a();
        return r7;
    L_0x002a:
        if (r7 != 0) goto L_0x002d;
    L_0x002c:
        goto L_0x003e;
    L_0x002d:
        r4 = r6.l;	 Catch:{ all -> 0x0061 }
        r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r7 != 0) goto L_0x003e;
    L_0x0033:
        r7 = r6.a(r0);	 Catch:{ all -> 0x0061 }
        monitor-exit(r8);	 Catch:{ all -> 0x0061 }
        r8 = r6.b;
        r8.a();
        return r7;
    L_0x003e:
        r1 = r6.l;	 Catch:{ all -> 0x0061 }
        monitor-exit(r8);	 Catch:{ all -> 0x0061 }
        r7 = r3.a();	 Catch:{ all -> 0x0064 }
        r8 = r9.a();	 Catch:{ all -> 0x0064 }
        r7 = defpackage.bbby.a(r7, r8);	 Catch:{ all -> 0x0064 }
        if (r7 != 0) goto L_0x0051;
    L_0x004f:
        r7 = r3;
        goto L_0x0008;
    L_0x0051:
        r8 = r0.c;	 Catch:{ all -> 0x0064 }
        r9 = r0.b;	 Catch:{ all -> 0x0064 }
        r0 = r0.a;	 Catch:{ all -> 0x0064 }
        r7 = r7.a(r8, r9, r0);	 Catch:{ all -> 0x0064 }
        r8 = r6.b;
        r8.a();
        return r7;
    L_0x0061:
        r7 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0061 }
        throw r7;	 Catch:{ all -> 0x0064 }
    L_0x0064:
        r7 = move-exception;
        r8 = r6.b;
        r8.a();
        goto L_0x006c;
    L_0x006b:
        throw r7;
    L_0x006c:
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbac.a(bauw, baum, barv):bazo");
    }

    private final bbai a(batz batz) {
        int size;
        bbai bbai = new bbai(this, batz);
        this.g.add(bbai);
        synchronized (this.a) {
            size = this.g.size();
        }
        if (size == 1) {
            this.b.a(this.c);
        }
        return bbai;
    }

    /* JADX WARNING: Missing block: B:13:0x0028, code skipped:
            r3.b.a();
     */
    /* JADX WARNING: Missing block: B:14:0x002d, code skipped:
            return;
     */
    public final void a(defpackage.bavx r4) {
        /*
        r3 = this;
        r0 = r3.a;
        monitor-enter(r0);
        r1 = r3.h;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        return;
    L_0x0009:
        r3.h = r4;	 Catch:{ all -> 0x002e }
        r1 = r3.b;	 Catch:{ all -> 0x002e }
        r2 = new bbag;	 Catch:{ all -> 0x002e }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x002e }
        r1.a(r2);	 Catch:{ all -> 0x002e }
        r4 = r3.a();	 Catch:{ all -> 0x002e }
        if (r4 != 0) goto L_0x0027;
    L_0x001b:
        r4 = r3.e;	 Catch:{ all -> 0x002e }
        if (r4 == 0) goto L_0x0027;
    L_0x001f:
        r1 = r3.b;	 Catch:{ all -> 0x002e }
        r1.a(r4);	 Catch:{ all -> 0x002e }
        r4 = 0;
        r3.e = r4;	 Catch:{ all -> 0x002e }
    L_0x0027:
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        r4 = r3.b;
        r4.a();
        return;
    L_0x002e:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbac.a(bavx):void");
    }

    public final void b(bavx bavx) {
        Runnable runnable;
        a(bavx);
        synchronized (this.a) {
            Collection<bbai> collection = this.g;
            runnable = this.e;
            this.e = null;
            if (!collection.isEmpty()) {
                this.g = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (bbai b : collection) {
                b.b(bavx);
            }
            this.b.execute(runnable);
        }
    }

    public final boolean a() {
        int isEmpty;
        synchronized (this.a) {
            isEmpty = this.g.isEmpty() ^ 1;
        }
        return isEmpty;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:10:0x001e, code skipped:
            r0 = new java.util.ArrayList();
            r2 = r1.size();
            r3 = 0;
     */
    /* JADX WARNING: Missing block: B:11:0x0028, code skipped:
            if (r3 >= r2) goto L_0x005a;
     */
    /* JADX WARNING: Missing block: B:12:0x002a, code skipped:
            r4 = (defpackage.bbai) r1.get(r3);
            r5 = r9.a();
            r6 = r4.b.a();
            r5 = defpackage.bbby.a(r5, r6.a());
     */
    /* JADX WARNING: Missing block: B:13:0x0042, code skipped:
            if (r5 == null) goto L_0x0057;
     */
    /* JADX WARNING: Missing block: B:14:0x0044, code skipped:
            r7 = r8.j;
            r6 = r6.c;
     */
    /* JADX WARNING: Missing block: B:15:0x0048, code skipped:
            if (r6 == null) goto L_0x004b;
     */
    /* JADX WARNING: Missing block: B:16:0x004b, code skipped:
            r6 = r7;
     */
    /* JADX WARNING: Missing block: B:17:0x004c, code skipped:
            r6.execute(new defpackage.bbaf(r4, r5));
            r0.add(r4);
     */
    /* JADX WARNING: Missing block: B:18:0x0057, code skipped:
            r3 = r3 + 1;
     */
    /* JADX WARNING: Missing block: B:19:0x005a, code skipped:
            r9 = r8.a;
     */
    /* JADX WARNING: Missing block: B:20:0x005c, code skipped:
            monitor-enter(r9);
     */
    /* JADX WARNING: Missing block: B:23:0x0061, code skipped:
            if (a() != false) goto L_0x0065;
     */
    /* JADX WARNING: Missing block: B:24:0x0063, code skipped:
            monitor-exit(r9);
     */
    /* JADX WARNING: Missing block: B:25:0x0064, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:26:0x0065, code skipped:
            r8.g.removeAll(r0);
     */
    /* JADX WARNING: Missing block: B:27:0x0070, code skipped:
            if (r8.g.isEmpty() == false) goto L_0x0079;
     */
    /* JADX WARNING: Missing block: B:28:0x0072, code skipped:
            r8.g = new java.util.LinkedHashSet();
     */
    /* JADX WARNING: Missing block: B:30:0x007d, code skipped:
            if (a() != false) goto L_0x0096;
     */
    /* JADX WARNING: Missing block: B:31:0x007f, code skipped:
            r8.b.a(r8.d);
     */
    /* JADX WARNING: Missing block: B:32:0x0088, code skipped:
            if (r8.h == null) goto L_0x0096;
     */
    /* JADX WARNING: Missing block: B:33:0x008a, code skipped:
            r0 = r8.e;
     */
    /* JADX WARNING: Missing block: B:34:0x008c, code skipped:
            if (r0 == null) goto L_0x0096;
     */
    /* JADX WARNING: Missing block: B:35:0x008e, code skipped:
            r8.b.a(r0);
            r8.e = null;
     */
    /* JADX WARNING: Missing block: B:36:0x0096, code skipped:
            monitor-exit(r9);
     */
    /* JADX WARNING: Missing block: B:37:0x0097, code skipped:
            r8.b.a();
     */
    /* JADX WARNING: Missing block: B:38:0x009c, code skipped:
            return;
     */
    public final void a(defpackage.baud r9) {
        /*
        r8 = this;
        r0 = r8.a;
        monitor-enter(r0);
        r8.k = r9;	 Catch:{ all -> 0x00a2 }
        r1 = r8.l;	 Catch:{ all -> 0x00a2 }
        r3 = 1;
        r1 = r1 + r3;
        r8.l = r1;	 Catch:{ all -> 0x00a2 }
        if (r9 == 0) goto L_0x00a0;
    L_0x000e:
        r1 = r8.a();	 Catch:{ all -> 0x00a2 }
        if (r1 != 0) goto L_0x0016;
    L_0x0014:
        goto L_0x00a0;
    L_0x0016:
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x00a2 }
        r2 = r8.g;	 Catch:{ all -> 0x00a2 }
        r1.<init>(r2);	 Catch:{ all -> 0x00a2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00a2 }
        r0 = new java.util.ArrayList;
        r0.<init>();
        r2 = r1.size();
        r3 = 0;
    L_0x0028:
        if (r3 >= r2) goto L_0x005a;
    L_0x002a:
        r4 = r1.get(r3);
        r4 = (defpackage.bbai) r4;
        r5 = r9.a();
        r6 = r4.b;
        r6 = r6.a();
        r7 = r6.a();
        r5 = defpackage.bbby.a(r5, r7);
        if (r5 == 0) goto L_0x0057;
    L_0x0044:
        r7 = r8.j;
        r6 = r6.c;
        if (r6 == 0) goto L_0x004b;
    L_0x004a:
        goto L_0x004c;
    L_0x004b:
        r6 = r7;
    L_0x004c:
        r7 = new bbaf;
        r7.<init>(r4, r5);
        r6.execute(r7);
        r0.add(r4);
    L_0x0057:
        r3 = r3 + 1;
        goto L_0x0028;
    L_0x005a:
        r9 = r8.a;
        monitor-enter(r9);
        r1 = r8.a();	 Catch:{ all -> 0x009d }
        if (r1 != 0) goto L_0x0065;
    L_0x0063:
        monitor-exit(r9);	 Catch:{ all -> 0x009d }
        return;
    L_0x0065:
        r1 = r8.g;	 Catch:{ all -> 0x009d }
        r1.removeAll(r0);	 Catch:{ all -> 0x009d }
        r0 = r8.g;	 Catch:{ all -> 0x009d }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x009d }
        if (r0 == 0) goto L_0x0079;
    L_0x0072:
        r0 = new java.util.LinkedHashSet;	 Catch:{ all -> 0x009d }
        r0.<init>();	 Catch:{ all -> 0x009d }
        r8.g = r0;	 Catch:{ all -> 0x009d }
    L_0x0079:
        r0 = r8.a();	 Catch:{ all -> 0x009d }
        if (r0 != 0) goto L_0x0096;
    L_0x007f:
        r0 = r8.b;	 Catch:{ all -> 0x009d }
        r1 = r8.d;	 Catch:{ all -> 0x009d }
        r0.a(r1);	 Catch:{ all -> 0x009d }
        r0 = r8.h;	 Catch:{ all -> 0x009d }
        if (r0 == 0) goto L_0x0096;
    L_0x008a:
        r0 = r8.e;	 Catch:{ all -> 0x009d }
        if (r0 == 0) goto L_0x0096;
    L_0x008e:
        r1 = r8.b;	 Catch:{ all -> 0x009d }
        r1.a(r0);	 Catch:{ all -> 0x009d }
        r0 = 0;
        r8.e = r0;	 Catch:{ all -> 0x009d }
    L_0x0096:
        monitor-exit(r9);	 Catch:{ all -> 0x009d }
        r9 = r8.b;
        r9.a();
        return;
    L_0x009d:
        r0 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x009d }
        throw r0;
    L_0x00a0:
        monitor-exit(r0);	 Catch:{ all -> 0x00a2 }
        return;
    L_0x00a2:
        r9 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00a2 }
        goto L_0x00a6;
    L_0x00a5:
        throw r9;
    L_0x00a6:
        goto L_0x00a5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbac.a(baud):void");
    }

    public final batp b() {
        return this.i;
    }
}
