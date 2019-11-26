package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: agza */
final class agza {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private int c = 0;
    private int d = 0;

    agza() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean a(String str) {
        return this.a.containsKey(str);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:18:0x001a, code skipped:
            if (r3.d > 0) goto L_0x001d;
     */
    /* JADX WARNING: Missing block: B:19:0x001c, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:20:0x001d, code skipped:
            return false;
     */
    public final synchronized boolean a(int r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = 0;
        r1 = 1;
        if (r4 == r1) goto L_0x0037;
    L_0x0005:
        r2 = 3;
        if (r4 == r2) goto L_0x0037;
    L_0x0008:
        r2 = 4;
        if (r4 == r2) goto L_0x0037;
    L_0x000b:
        r2 = 7;
        if (r4 == r2) goto L_0x0037;
    L_0x000e:
        r2 = 5;
        if (r4 == r2) goto L_0x0037;
    L_0x0011:
        r2 = 6;
        if (r4 == r2) goto L_0x0037;
    L_0x0014:
        r2 = 2;
        if (r4 != r2) goto L_0x001e;
    L_0x0017:
        r4 = r3.d;	 Catch:{ all -> 0x003f }
        monitor-exit(r3);
        if (r4 > 0) goto L_0x001d;
    L_0x001c:
        return r1;
    L_0x001d:
        return r0;
    L_0x001e:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x003f }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003f }
        r2 = 34;
        r1.<init>(r2);	 Catch:{ all -> 0x003f }
        r2 = "Invalid transfer type: ";
        r1.append(r2);	 Catch:{ all -> 0x003f }
        r1.append(r4);	 Catch:{ all -> 0x003f }
        r4 = r1.toString();	 Catch:{ all -> 0x003f }
        r0.<init>(r4);	 Catch:{ all -> 0x003f }
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x0037:
        r4 = r3.c;	 Catch:{ all -> 0x003f }
        if (r4 <= 0) goto L_0x003d;
    L_0x003b:
        monitor-exit(r3);
        return r0;
    L_0x003d:
        monitor-exit(r3);
        return r1;
    L_0x003f:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agza.a(int):boolean");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:20:0x0034, code skipped:
            return true;
     */
    public final synchronized boolean a(java.lang.String r2, defpackage.agya r3, int r4) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.a(r4);	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0035;
    L_0x0007:
        r0 = r1.a;	 Catch:{ all -> 0x0038 }
        r0.put(r2, r3);	 Catch:{ all -> 0x0038 }
        r3 = r1.b;	 Catch:{ all -> 0x0038 }
        r0 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0038 }
        r3.put(r2, r0);	 Catch:{ all -> 0x0038 }
        r2 = 1;
        if (r4 != r2) goto L_0x0019;
    L_0x0018:
        goto L_0x002e;
    L_0x0019:
        r3 = 3;
        if (r4 == r3) goto L_0x002e;
    L_0x001c:
        r3 = 4;
        if (r4 == r3) goto L_0x002e;
    L_0x001f:
        r3 = 7;
        if (r4 == r3) goto L_0x002e;
    L_0x0022:
        r3 = 6;
        if (r4 == r3) goto L_0x002e;
    L_0x0025:
        r3 = 2;
        if (r4 != r3) goto L_0x0033;
    L_0x0028:
        r3 = r1.d;	 Catch:{ all -> 0x0038 }
        r3 = r3 + r2;
        r1.d = r3;	 Catch:{ all -> 0x0038 }
        goto L_0x0033;
    L_0x002e:
        r3 = r1.c;	 Catch:{ all -> 0x0038 }
        r3 = r3 + r2;
        r1.c = r3;	 Catch:{ all -> 0x0038 }
    L_0x0033:
        monitor-exit(r1);
        return r2;
    L_0x0035:
        r2 = 0;
        monitor-exit(r1);
        return r2;
    L_0x0038:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agza.a(java.lang.String, agya, int):boolean");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:23:0x0039, code skipped:
            return r0;
     */
    public final synchronized defpackage.agya b(java.lang.String r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.a;	 Catch:{ all -> 0x003a }
        r0 = r0.remove(r3);	 Catch:{ all -> 0x003a }
        r0 = (defpackage.agya) r0;	 Catch:{ all -> 0x003a }
        if (r0 == 0) goto L_0x0038;
    L_0x000b:
        r1 = r2.b;	 Catch:{ all -> 0x003a }
        r3 = r1.remove(r3);	 Catch:{ all -> 0x003a }
        r3 = (java.lang.Integer) r3;	 Catch:{ all -> 0x003a }
        r3 = r3.intValue();	 Catch:{ all -> 0x003a }
        r1 = 1;
        if (r3 != r1) goto L_0x001b;
    L_0x001a:
        goto L_0x0032;
    L_0x001b:
        r1 = 3;
        if (r3 == r1) goto L_0x0032;
    L_0x001e:
        r1 = 4;
        if (r3 == r1) goto L_0x0032;
    L_0x0021:
        r1 = 7;
        if (r3 == r1) goto L_0x0032;
    L_0x0024:
        r1 = 6;
        if (r3 == r1) goto L_0x0032;
    L_0x0027:
        r1 = 2;
        if (r3 != r1) goto L_0x0038;
    L_0x002a:
        r3 = r2.d;	 Catch:{ all -> 0x003a }
        r3 = r3 + -1;
        r2.d = r3;	 Catch:{ all -> 0x003a }
        monitor-exit(r2);
        return r0;
    L_0x0032:
        r3 = r2.c;	 Catch:{ all -> 0x003a }
        r3 = r3 + -1;
        r2.c = r3;	 Catch:{ all -> 0x003a }
    L_0x0038:
        monitor-exit(r2);
        return r0;
    L_0x003a:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agza.b(java.lang.String):agya");
    }
}
