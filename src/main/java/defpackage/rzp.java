package defpackage;

import android.provider.BaseColumns;
import java.util.HashMap;

/* renamed from: rzp */
public class rzp implements BaseColumns {
    private static HashMap a = new HashMap();

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARNING: Missing block: B:26:0x0053, code skipped:
            r4 = null;
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            r5 = r12;
            r6 = r13;
            r12 = r5.query(r6, new java.lang.String[]{"value"}, "name=?", new java.lang.String[]{r14}, null);
     */
    /* JADX WARNING: Missing block: B:29:0x0067, code skipped:
            if (r12 == null) goto L_0x007b;
     */
    /* JADX WARNING: Missing block: B:32:0x006d, code skipped:
            if (r12.moveToFirst() != false) goto L_0x0070;
     */
    /* JADX WARNING: Missing block: B:34:0x0070, code skipped:
            r4 = r12.getString(0);
            defpackage.rzp.a(r1, r0, r14, r4);
     */
    /* JADX WARNING: Missing block: B:35:0x0077, code skipped:
            r12.close();
     */
    /* JADX WARNING: Missing block: B:36:0x007a, code skipped:
            return r4;
     */
    /* JADX WARNING: Missing block: B:38:?, code skipped:
            defpackage.rzp.a(r1, r0, r14, null);
     */
    /* JADX WARNING: Missing block: B:39:0x007e, code skipped:
            if (r12 == null) goto L_0x0083;
     */
    /* JADX WARNING: Missing block: B:40:0x0080, code skipped:
            r12.close();
     */
    /* JADX WARNING: Missing block: B:41:0x0083, code skipped:
            return null;
     */
    /* JADX WARNING: Missing block: B:42:0x0084, code skipped:
            r13 = th;
     */
    /* JADX WARNING: Missing block: B:43:0x0085, code skipped:
            r4 = r12;
     */
    /* JADX WARNING: Missing block: B:44:0x0087, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:45:0x0088, code skipped:
            r4 = r12;
            r12 = null;
     */
    /* JADX WARNING: Missing block: B:46:0x008c, code skipped:
            r12 = move-exception;
     */
    /* JADX WARNING: Missing block: B:47:0x008d, code skipped:
            r13 = r12;
     */
    /* JADX WARNING: Missing block: B:48:0x008f, code skipped:
            r12 = move-exception;
     */
    /* JADX WARNING: Missing block: B:49:0x0090, code skipped:
            r0 = r12;
            r12 = null;
     */
    /* JADX WARNING: Missing block: B:51:?, code skipped:
            r2 = new java.lang.StringBuilder();
            r2.append("Can't get key ");
            r2.append(r14);
            r2.append(" from ");
            r2.append(r13);
            android.util.Log.e("GoogleSettings", r2.toString(), r0);
     */
    /* JADX WARNING: Missing block: B:52:0x00b0, code skipped:
            if (r4 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Missing block: B:53:0x00b2, code skipped:
            r4.close();
     */
    /* JADX WARNING: Missing block: B:54:0x00b5, code skipped:
            return r12;
     */
    /* JADX WARNING: Missing block: B:55:0x00b6, code skipped:
            if (r4 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Missing block: B:56:0x00b8, code skipped:
            r4.close();
     */
    /* JADX WARNING: Missing block: B:57:0x00bb, code skipped:
            throw r13;
     */
    public static java.lang.String a(android.content.ContentResolver r12, android.net.Uri r13, java.lang.String r14) {
        /*
        r0 = defpackage.rzp.class;
        monitor-enter(r0);
        r1 = a;	 Catch:{ all -> 0x00bf }
        r1 = r1.get(r13);	 Catch:{ all -> 0x00bf }
        r1 = (defpackage.rzu) r1;	 Catch:{ all -> 0x00bf }
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x0022;
    L_0x000f:
        r1 = new rzu;	 Catch:{ all -> 0x00bf }
        r1.<init>();	 Catch:{ all -> 0x00bf }
        r4 = a;	 Catch:{ all -> 0x00bf }
        r4.put(r13, r1);	 Catch:{ all -> 0x00bf }
        r4 = new rzs;	 Catch:{ all -> 0x00bf }
        r4.<init>(r1);	 Catch:{ all -> 0x00bf }
        r12.registerContentObserver(r13, r2, r4);	 Catch:{ all -> 0x00bf }
        goto L_0x003c;
    L_0x0022:
        r4 = r1.c;	 Catch:{ all -> 0x00bf }
        r4 = r4.getAndSet(r3);	 Catch:{ all -> 0x00bf }
        if (r4 == 0) goto L_0x003c;
    L_0x002a:
        monitor-enter(r1);	 Catch:{ all -> 0x00bf }
        r4 = r1.a;	 Catch:{ all -> 0x0039 }
        r4.clear();	 Catch:{ all -> 0x0039 }
        r4 = new java.lang.Object;	 Catch:{ all -> 0x0039 }
        r4.<init>();	 Catch:{ all -> 0x0039 }
        r1.b = r4;	 Catch:{ all -> 0x0039 }
        monitor-exit(r1);	 Catch:{ all -> 0x0039 }
        goto L_0x003c;
    L_0x0039:
        r12 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0039 }
        throw r12;	 Catch:{ all -> 0x00bf }
    L_0x003c:
        monitor-exit(r0);	 Catch:{ all -> 0x00bf }
        monitor-enter(r1);
        r0 = r1.b;	 Catch:{ all -> 0x00bc }
        r4 = r1.a;	 Catch:{ all -> 0x00bc }
        r4 = r4.containsKey(r14);	 Catch:{ all -> 0x00bc }
        if (r4 == 0) goto L_0x0052;
    L_0x0048:
        r12 = r1.a;	 Catch:{ all -> 0x00bc }
        r12 = r12.get(r14);	 Catch:{ all -> 0x00bc }
        r12 = (java.lang.String) r12;	 Catch:{ all -> 0x00bc }
        monitor-exit(r1);	 Catch:{ all -> 0x00bc }
        return r12;
    L_0x0052:
        monitor-exit(r1);	 Catch:{ all -> 0x00bc }
        r4 = 0;
        r7 = new java.lang.String[r2];	 Catch:{ SQLException -> 0x008f }
        r5 = "value";
        r7[r3] = r5;	 Catch:{ SQLException -> 0x008f }
        r8 = "name=?";
        r9 = new java.lang.String[r2];	 Catch:{ SQLException -> 0x008f }
        r9[r3] = r14;	 Catch:{ SQLException -> 0x008f }
        r10 = 0;
        r5 = r12;
        r6 = r13;
        r12 = r5.query(r6, r7, r8, r9, r10);	 Catch:{ SQLException -> 0x008f }
        if (r12 == 0) goto L_0x007b;
    L_0x0069:
        r2 = r12.moveToFirst();	 Catch:{ SQLException -> 0x0087, all -> 0x0084 }
        if (r2 != 0) goto L_0x0070;
    L_0x006f:
        goto L_0x007b;
    L_0x0070:
        r4 = r12.getString(r3);	 Catch:{ SQLException -> 0x0087, all -> 0x0084 }
        defpackage.rzp.a(r1, r0, r14, r4);	 Catch:{ SQLException -> 0x0087, all -> 0x0084 }
        r12.close();
        return r4;
    L_0x007b:
        defpackage.rzp.a(r1, r0, r14, r4);	 Catch:{ SQLException -> 0x0087, all -> 0x0084 }
        if (r12 == 0) goto L_0x0083;
    L_0x0080:
        r12.close();
    L_0x0083:
        return r4;
    L_0x0084:
        r13 = move-exception;
        r4 = r12;
        goto L_0x00b6;
    L_0x0087:
        r0 = move-exception;
        r11 = r4;
        r4 = r12;
        r12 = r11;
        goto L_0x0092;
    L_0x008c:
        r12 = move-exception;
        r13 = r12;
        goto L_0x00b6;
    L_0x008f:
        r12 = move-exception;
        r0 = r12;
        r12 = r4;
    L_0x0092:
        r1 = "GoogleSettings";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008c }
        r2.<init>();	 Catch:{ all -> 0x008c }
        r3 = "Can't get key ";
        r2.append(r3);	 Catch:{ all -> 0x008c }
        r2.append(r14);	 Catch:{ all -> 0x008c }
        r14 = " from ";
        r2.append(r14);	 Catch:{ all -> 0x008c }
        r2.append(r13);	 Catch:{ all -> 0x008c }
        r13 = r2.toString();	 Catch:{ all -> 0x008c }
        android.util.Log.e(r1, r13, r0);	 Catch:{ all -> 0x008c }
        if (r4 == 0) goto L_0x00b5;
    L_0x00b2:
        r4.close();
    L_0x00b5:
        return r12;
    L_0x00b6:
        if (r4 == 0) goto L_0x00bb;
    L_0x00b8:
        r4.close();
    L_0x00bb:
        throw r13;
    L_0x00bc:
        r12 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00bc }
        throw r12;
    L_0x00bf:
        r12 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00bf }
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rzp.a(android.content.ContentResolver, android.net.Uri, java.lang.String):java.lang.String");
    }

    private static void a(rzu rzu, Object obj, String str, String str2) {
        synchronized (rzu) {
            if (obj == rzu.b) {
                rzu.a.put(str, str2);
            }
        }
    }
}
