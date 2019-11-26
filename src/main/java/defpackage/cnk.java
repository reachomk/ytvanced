package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: cnk */
public final class cnk {
    public static final Object a = new Object();
    public static final Map b = new HashMap(4);
    public static final WeakHashMap c = new WeakHashMap();
    private static cnj d;

    /* JADX WARNING: Missing block: B:19:0x0057, code skipped:
            return r4;
     */
    public static defpackage.cpy a(android.content.Context r4, defpackage.cmm r5) {
        /*
        r0 = r5.w();
        r1 = 0;
        if (r0 == 0) goto L_0x005b;
    L_0x0007:
        r0 = a;
        monitor-enter(r0);
        r2 = b;	 Catch:{ all -> 0x0058 }
        r2 = r2.get(r4);	 Catch:{ all -> 0x0058 }
        r2 = (android.util.SparseArray) r2;	 Catch:{ all -> 0x0058 }
        if (r2 != 0) goto L_0x0043;
    L_0x0014:
        r2 = defpackage.cns.a(r4);	 Catch:{ all -> 0x0058 }
        r3 = c;	 Catch:{ all -> 0x0058 }
        r2 = r3.containsKey(r2);	 Catch:{ all -> 0x0058 }
        if (r2 == 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        return r1;
    L_0x0022:
        r1 = d;	 Catch:{ all -> 0x0058 }
        if (r1 != 0) goto L_0x0039;
    L_0x0026:
        r1 = new cnj;	 Catch:{ all -> 0x0058 }
        r2 = 0;
        r1.<init>(r2);	 Catch:{ all -> 0x0058 }
        d = r1;	 Catch:{ all -> 0x0058 }
        r1 = r4.getApplicationContext();	 Catch:{ all -> 0x0058 }
        r1 = (android.app.Application) r1;	 Catch:{ all -> 0x0058 }
        r2 = d;	 Catch:{ all -> 0x0058 }
        r1.registerActivityLifecycleCallbacks(r2);	 Catch:{ all -> 0x0058 }
    L_0x0039:
        r2 = new android.util.SparseArray;	 Catch:{ all -> 0x0058 }
        r2.<init>();	 Catch:{ all -> 0x0058 }
        r1 = b;	 Catch:{ all -> 0x0058 }
        r1.put(r4, r2);	 Catch:{ all -> 0x0058 }
    L_0x0043:
        r4 = r5.t;	 Catch:{ all -> 0x0058 }
        r4 = r2.get(r4);	 Catch:{ all -> 0x0058 }
        r4 = (defpackage.cpy) r4;	 Catch:{ all -> 0x0058 }
        if (r4 != 0) goto L_0x0056;
    L_0x004d:
        r4 = r5.p();	 Catch:{ all -> 0x0058 }
        r5 = r5.t;	 Catch:{ all -> 0x0058 }
        r2.put(r5, r4);	 Catch:{ all -> 0x0058 }
    L_0x0056:
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        return r4;
    L_0x0058:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        throw r4;
    L_0x005b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnk.a(android.content.Context, cmm):cpy");
    }
}
