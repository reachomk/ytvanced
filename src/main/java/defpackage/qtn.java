package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: qtn */
public final class qtn {
    public static final Pattern a = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern b = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean c = new AtomicBoolean();
    public static final HashMap d = new HashMap();
    private static final Uri e = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri f = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static HashMap g;
    private static final HashMap h = new HashMap();
    private static final HashMap i = new HashMap();
    private static final HashMap j = new HashMap();
    private static Object k;
    private static boolean l;
    private static String[] m = new String[0];

    private static void b(ContentResolver contentResolver) {
        if (g == null) {
            c.set(false);
            g = new HashMap();
            k = new Object();
            l = false;
            contentResolver.registerContentObserver(e, true, new qtq());
            return;
        }
        if (c.getAndSet(false)) {
            g.clear();
            h.clear();
            i.clear();
            d.clear();
            j.clear();
            k = new Object();
            l = false;
        }
    }

    /* JADX WARNING: Missing block: B:10:0x001e, code skipped:
            return r14;
     */
    /* JADX WARNING: Missing block: B:39:0x0088, code skipped:
            return r14;
     */
    /* JADX WARNING: Missing block: B:41:0x008a, code skipped:
            return null;
     */
    /* JADX WARNING: Missing block: B:43:0x008c, code skipped:
            r14 = r14.query(e, null, null, new java.lang.String[]{r15}, null);
     */
    /* JADX WARNING: Missing block: B:44:0x009a, code skipped:
            if (r14 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Missing block: B:47:0x00a0, code skipped:
            if (r14.moveToFirst() != false) goto L_0x00a9;
     */
    /* JADX WARNING: Missing block: B:48:0x00a2, code skipped:
            defpackage.qtn.a(r1, r15, null);
     */
    /* JADX WARNING: Missing block: B:51:?, code skipped:
            r0 = r14.getString(1);
     */
    /* JADX WARNING: Missing block: B:52:0x00ad, code skipped:
            if (r0 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Missing block: B:54:0x00b3, code skipped:
            if (r0.equals(null) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Missing block: B:56:0x00b6, code skipped:
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:57:0x00b7, code skipped:
            defpackage.qtn.a(r1, r15, r0);
     */
    /* JADX WARNING: Missing block: B:58:0x00ba, code skipped:
            if (r0 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Missing block: B:59:0x00bd, code skipped:
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:60:0x00be, code skipped:
            r14.close();
     */
    /* JADX WARNING: Missing block: B:61:0x00c1, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:63:0x00c3, code skipped:
            r14.close();
     */
    /* JADX WARNING: Missing block: B:64:0x00c7, code skipped:
            return null;
     */
    public static java.lang.String a(android.content.ContentResolver r14, java.lang.String r15) {
        /*
        r0 = defpackage.qtn.class;
        monitor-enter(r0);
        defpackage.qtn.b(r14);	 Catch:{ all -> 0x00c8 }
        r1 = k;	 Catch:{ all -> 0x00c8 }
        r2 = g;	 Catch:{ all -> 0x00c8 }
        r2 = r2.containsKey(r15);	 Catch:{ all -> 0x00c8 }
        r3 = 0;
        if (r2 == 0) goto L_0x001f;
    L_0x0011:
        r14 = g;	 Catch:{ all -> 0x00c8 }
        r14 = r14.get(r15);	 Catch:{ all -> 0x00c8 }
        r14 = (java.lang.String) r14;	 Catch:{ all -> 0x00c8 }
        if (r14 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x001d;
    L_0x001c:
        r14 = r3;
    L_0x001d:
        monitor-exit(r0);	 Catch:{ all -> 0x00c8 }
        return r14;
    L_0x001f:
        r2 = m;	 Catch:{ all -> 0x00c8 }
        r4 = r2.length;	 Catch:{ all -> 0x00c8 }
        r5 = 0;
        r6 = 0;
    L_0x0024:
        r7 = 1;
        if (r6 >= r4) goto L_0x008b;
    L_0x0027:
        r8 = r2[r6];	 Catch:{ all -> 0x00c8 }
        r8 = r15.startsWith(r8);	 Catch:{ all -> 0x00c8 }
        if (r8 != 0) goto L_0x0032;
    L_0x002f:
        r6 = r6 + 1;
        goto L_0x0024;
    L_0x0032:
        r1 = l;	 Catch:{ all -> 0x00c8 }
        if (r1 == 0) goto L_0x003e;
    L_0x0036:
        r1 = g;	 Catch:{ all -> 0x00c8 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x00c8 }
        if (r1 == 0) goto L_0x0089;
    L_0x003e:
        r12 = m;	 Catch:{ all -> 0x00c8 }
        r1 = g;	 Catch:{ all -> 0x00c8 }
        r9 = f;	 Catch:{ all -> 0x00c8 }
        r10 = 0;
        r11 = 0;
        r13 = 0;
        r8 = r14;
        r14 = r8.query(r9, r10, r11, r12, r13);	 Catch:{ all -> 0x00c8 }
        r2 = new java.util.TreeMap;	 Catch:{ all -> 0x00c8 }
        r2.<init>();	 Catch:{ all -> 0x00c8 }
        if (r14 == 0) goto L_0x006e;
    L_0x0053:
        r4 = r14.moveToNext();	 Catch:{ all -> 0x0069 }
        if (r4 == 0) goto L_0x0065;
    L_0x0059:
        r4 = r14.getString(r5);	 Catch:{ all -> 0x0069 }
        r6 = r14.getString(r7);	 Catch:{ all -> 0x0069 }
        r2.put(r4, r6);	 Catch:{ all -> 0x0069 }
        goto L_0x0053;
    L_0x0065:
        r14.close();	 Catch:{ all -> 0x00c8 }
        goto L_0x006e;
    L_0x0069:
        r15 = move-exception;
        r14.close();	 Catch:{ all -> 0x00c8 }
        throw r15;	 Catch:{ all -> 0x00c8 }
    L_0x006e:
        r1.putAll(r2);	 Catch:{ all -> 0x00c8 }
        l = r7;	 Catch:{ all -> 0x00c8 }
        r14 = g;	 Catch:{ all -> 0x00c8 }
        r14 = r14.containsKey(r15);	 Catch:{ all -> 0x00c8 }
        if (r14 == 0) goto L_0x0089;
    L_0x007b:
        r14 = g;	 Catch:{ all -> 0x00c8 }
        r14 = r14.get(r15);	 Catch:{ all -> 0x00c8 }
        r14 = (java.lang.String) r14;	 Catch:{ all -> 0x00c8 }
        if (r14 == 0) goto L_0x0086;
    L_0x0085:
        goto L_0x0087;
    L_0x0086:
        r14 = r3;
    L_0x0087:
        monitor-exit(r0);	 Catch:{ all -> 0x00c8 }
        return r14;
    L_0x0089:
        monitor-exit(r0);	 Catch:{ all -> 0x00c8 }
        return r3;
    L_0x008b:
        monitor-exit(r0);	 Catch:{ all -> 0x00c8 }
        r9 = e;
        r12 = new java.lang.String[r7];
        r12[r5] = r15;
        r10 = 0;
        r11 = 0;
        r13 = 0;
        r8 = r14;
        r14 = r8.query(r9, r10, r11, r12, r13);
        if (r14 == 0) goto L_0x00c7;
    L_0x009c:
        r0 = r14.moveToFirst();	 Catch:{ all -> 0x00c2 }
        if (r0 != 0) goto L_0x00a9;
    L_0x00a2:
        defpackage.qtn.a(r1, r15, r3);	 Catch:{ all -> 0x00c2 }
        r14.close();
        return r3;
    L_0x00a9:
        r0 = r14.getString(r7);	 Catch:{ all -> 0x00c2 }
        if (r0 == 0) goto L_0x00b7;
    L_0x00af:
        r2 = r0.equals(r3);	 Catch:{ all -> 0x00c2 }
        if (r2 != 0) goto L_0x00b6;
    L_0x00b5:
        goto L_0x00b7;
    L_0x00b6:
        r0 = r3;
    L_0x00b7:
        defpackage.qtn.a(r1, r15, r0);	 Catch:{ all -> 0x00c2 }
        if (r0 == 0) goto L_0x00bd;
    L_0x00bc:
        goto L_0x00be;
    L_0x00bd:
        r0 = r3;
    L_0x00be:
        r14.close();
        return r0;
    L_0x00c2:
        r15 = move-exception;
        r14.close();
        throw r15;
    L_0x00c7:
        return r3;
    L_0x00c8:
        r14 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00c8 }
        goto L_0x00cc;
    L_0x00cb:
        throw r14;
    L_0x00cc:
        goto L_0x00cb;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtn.a(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    private static void a(Object obj, String str, String str2) {
        synchronized (qtn.class) {
            if (obj == k) {
                g.put(str, str2);
            }
        }
    }

    public static boolean a(ContentResolver contentResolver, String str, boolean z) {
        Object a = qtn.a(contentResolver);
        Object obj = (Boolean) qtn.a(h, str, Boolean.valueOf(z));
        if (obj != null) {
            return obj.booleanValue();
        }
        String a2 = qtn.a(contentResolver, str);
        if (!(a2 == null || a2.equals(""))) {
            if (a.matcher(a2).matches()) {
                obj = Boolean.valueOf(true);
                z = true;
            } else if (b.matcher(a2).matches()) {
                obj = Boolean.valueOf(false);
                z = false;
            } else {
                StringBuilder stringBuilder = new StringBuilder("attempt to read gservices key ");
                stringBuilder.append(str);
                stringBuilder.append(" (value \"");
                stringBuilder.append(a2);
                stringBuilder.append("\") as boolean");
                Log.w("Gservices", stringBuilder.toString());
            }
        }
        qtn.a(a, h, str, obj);
        return z;
    }

    public static Object a(ContentResolver contentResolver) {
        Object obj;
        synchronized (qtn.class) {
            qtn.b(contentResolver);
            obj = k;
        }
        return obj;
    }

    /* JADX WARNING: Missing block: B:10:0x0012, code skipped:
            return r2;
     */
    public static java.lang.Object a(java.util.HashMap r2, java.lang.String r3, java.lang.Object r4) {
        /*
        r0 = defpackage.qtn.class;
        monitor-enter(r0);
        r1 = r2.containsKey(r3);	 Catch:{ all -> 0x0016 }
        if (r1 == 0) goto L_0x0013;
    L_0x0009:
        r2 = r2.get(r3);	 Catch:{ all -> 0x0016 }
        if (r2 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0011;
    L_0x0010:
        r2 = r4;
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        return r2;
    L_0x0013:
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        r2 = 0;
        return r2;
    L_0x0016:
        r2 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public static void a(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (qtn.class) {
            if (obj == k) {
                hashMap.put(str, obj2);
                g.remove(str);
            }
        }
    }
}
