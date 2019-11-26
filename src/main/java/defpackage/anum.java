package defpackage;

import android.os.ConditionVariable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anum */
public final class anum {
    public static volatile anun a = anup.a;
    public static volatile anuo b = null;
    private static final ConditionVariable c = new ConditionVariable();
    private static final Map d = Collections.synchronizedMap(new HashMap());
    private static volatile Thread e = null;

    /* JADX WARNING: Missing block: B:11:0x0023, code skipped:
            if (r3 != null) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:12:0x0025, code skipped:
            monitor-enter(r2);
     */
    /* JADX WARNING: Missing block: B:14:?, code skipped:
            r0.a(r4);
            d.put(r4, c);
     */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r2.open();
     */
    /* JADX WARNING: Missing block: B:17:0x0033, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:21:?, code skipped:
            d.remove(r4);
     */
    /* JADX WARNING: Missing block: B:25:?, code skipped:
            r2.open();
     */
    /* JADX WARNING: Missing block: B:30:0x0049, code skipped:
            if (java.lang.Thread.holdsLock(r2) != false) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:31:0x004b, code skipped:
            r2.block();
     */
    /* JADX WARNING: Missing block: B:32:0x004e, code skipped:
            return;
     */
    public static void a(java.lang.String r4) {
        /*
        r0 = a;
        r1 = d;
        monitor-enter(r1);
        r2 = d;	 Catch:{ all -> 0x004f }
        r2 = r2.get(r4);	 Catch:{ all -> 0x004f }
        r2 = (android.os.ConditionVariable) r2;	 Catch:{ all -> 0x004f }
        r3 = c;	 Catch:{ all -> 0x004f }
        if (r2 != r3) goto L_0x0013;
    L_0x0011:
        monitor-exit(r1);	 Catch:{ all -> 0x004f }
        return;
    L_0x0013:
        if (r2 == 0) goto L_0x0017;
    L_0x0015:
        r3 = 1;
        goto L_0x0022;
    L_0x0017:
        r2 = new android.os.ConditionVariable;	 Catch:{ all -> 0x004f }
        r2.<init>();	 Catch:{ all -> 0x004f }
        r3 = d;	 Catch:{ all -> 0x004f }
        r3.put(r4, r2);	 Catch:{ all -> 0x004f }
        r3 = 0;
    L_0x0022:
        monitor-exit(r1);	 Catch:{ all -> 0x004f }
        if (r3 != 0) goto L_0x0045;
    L_0x0025:
        monitor-enter(r2);
        r0.a(r4);	 Catch:{ all -> 0x0037 }
        r0 = d;	 Catch:{ all -> 0x0037 }
        r1 = c;	 Catch:{ all -> 0x0037 }
        r0.put(r4, r1);	 Catch:{ all -> 0x0037 }
        r2.open();	 Catch:{ all -> 0x0035 }
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        goto L_0x0045;
    L_0x0035:
        r4 = move-exception;
        goto L_0x0043;
    L_0x0037:
        r0 = move-exception;
        r1 = d;	 Catch:{ all -> 0x003e }
        r1.remove(r4);	 Catch:{ all -> 0x003e }
        throw r0;	 Catch:{ all -> 0x003e }
    L_0x003e:
        r4 = move-exception;
        r2.open();	 Catch:{ all -> 0x0035 }
        throw r4;	 Catch:{ all -> 0x0035 }
    L_0x0043:
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        throw r4;
    L_0x0045:
        r4 = java.lang.Thread.holdsLock(r2);
        if (r4 != 0) goto L_0x004e;
    L_0x004b:
        r2.block();
    L_0x004e:
        return;
    L_0x004f:
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004f }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anum.a(java.lang.String):void");
    }
}
