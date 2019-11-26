package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: rzt */
public final class rzt {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Pattern b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean d = new AtomicBoolean();
    public static final HashMap e = new HashMap();
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
            d.set(false);
            g = new HashMap();
            k = new Object();
            l = false;
            contentResolver.registerContentObserver(a, true, new rzv());
        } else if (d.getAndSet(false)) {
            g.clear();
            h.clear();
            e.clear();
            i.clear();
            j.clear();
            k = new Object();
            l = false;
        }
    }

    /* JADX WARNING: Missing block: B:10:0x001d, code skipped:
            return r8;
     */
    /* JADX WARNING: Missing block: B:27:0x0056, code skipped:
            return r8;
     */
    /* JADX WARNING: Missing block: B:29:0x0058, code skipped:
            return r10;
     */
    /* JADX WARNING: Missing block: B:31:0x005a, code skipped:
            r8 = r8.query(a, null, null, new java.lang.String[]{r9}, null);
     */
    /* JADX WARNING: Missing block: B:32:0x0069, code skipped:
            if (r8 == null) goto L_0x0096;
     */
    /* JADX WARNING: Missing block: B:35:0x006f, code skipped:
            if (r8.moveToFirst() != false) goto L_0x0079;
     */
    /* JADX WARNING: Missing block: B:36:0x0071, code skipped:
            defpackage.rzt.a(r1, r9, null);
     */
    /* JADX WARNING: Missing block: B:39:?, code skipped:
            r0 = r8.getString(1);
     */
    /* JADX WARNING: Missing block: B:40:0x007d, code skipped:
            if (r0 == null) goto L_0x0087;
     */
    /* JADX WARNING: Missing block: B:42:0x0083, code skipped:
            if (r0.equals(r10) != false) goto L_0x0086;
     */
    /* JADX WARNING: Missing block: B:44:0x0086, code skipped:
            r0 = r10;
     */
    /* JADX WARNING: Missing block: B:45:0x0087, code skipped:
            defpackage.rzt.a(r1, r9, r0);
     */
    /* JADX WARNING: Missing block: B:46:0x008a, code skipped:
            if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Missing block: B:47:0x008c, code skipped:
            r10 = r0;
     */
    /* JADX WARNING: Missing block: B:48:0x008d, code skipped:
            r8.close();
     */
    /* JADX WARNING: Missing block: B:49:0x0090, code skipped:
            return r10;
     */
    /* JADX WARNING: Missing block: B:51:0x0092, code skipped:
            r8.close();
     */
    /* JADX WARNING: Missing block: B:52:0x0096, code skipped:
            return r10;
     */
    public static java.lang.String a(android.content.ContentResolver r8, java.lang.String r9, java.lang.String r10) {
        /*
        r0 = defpackage.rzt.class;
        monitor-enter(r0);
        defpackage.rzt.b(r8);	 Catch:{ all -> 0x0097 }
        r1 = k;	 Catch:{ all -> 0x0097 }
        r2 = g;	 Catch:{ all -> 0x0097 }
        r2 = r2.containsKey(r9);	 Catch:{ all -> 0x0097 }
        if (r2 == 0) goto L_0x001e;
    L_0x0010:
        r8 = g;	 Catch:{ all -> 0x0097 }
        r8 = r8.get(r9);	 Catch:{ all -> 0x0097 }
        r8 = (java.lang.String) r8;	 Catch:{ all -> 0x0097 }
        if (r8 == 0) goto L_0x001b;
    L_0x001a:
        goto L_0x001c;
    L_0x001b:
        r8 = r10;
    L_0x001c:
        monitor-exit(r0);	 Catch:{ all -> 0x0097 }
        return r8;
    L_0x001e:
        r2 = m;	 Catch:{ all -> 0x0097 }
        r3 = r2.length;	 Catch:{ all -> 0x0097 }
        r4 = 0;
        r5 = 0;
    L_0x0023:
        if (r5 >= r3) goto L_0x0059;
    L_0x0025:
        r6 = r2[r5];	 Catch:{ all -> 0x0097 }
        r6 = r9.startsWith(r6);	 Catch:{ all -> 0x0097 }
        if (r6 != 0) goto L_0x0030;
    L_0x002d:
        r5 = r5 + 1;
        goto L_0x0023;
    L_0x0030:
        r1 = l;	 Catch:{ all -> 0x0097 }
        if (r1 == 0) goto L_0x003c;
    L_0x0034:
        r1 = g;	 Catch:{ all -> 0x0097 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0097 }
        if (r1 == 0) goto L_0x0057;
    L_0x003c:
        r1 = m;	 Catch:{ all -> 0x0097 }
        defpackage.rzt.c(r8, r1);	 Catch:{ all -> 0x0097 }
        r8 = g;	 Catch:{ all -> 0x0097 }
        r8 = r8.containsKey(r9);	 Catch:{ all -> 0x0097 }
        if (r8 == 0) goto L_0x0057;
    L_0x0049:
        r8 = g;	 Catch:{ all -> 0x0097 }
        r8 = r8.get(r9);	 Catch:{ all -> 0x0097 }
        r8 = (java.lang.String) r8;	 Catch:{ all -> 0x0097 }
        if (r8 == 0) goto L_0x0054;
    L_0x0053:
        goto L_0x0055;
    L_0x0054:
        r8 = r10;
    L_0x0055:
        monitor-exit(r0);	 Catch:{ all -> 0x0097 }
        return r8;
    L_0x0057:
        monitor-exit(r0);	 Catch:{ all -> 0x0097 }
        return r10;
    L_0x0059:
        monitor-exit(r0);	 Catch:{ all -> 0x0097 }
        r3 = a;
        r0 = 1;
        r6 = new java.lang.String[r0];
        r6[r4] = r9;
        r4 = 0;
        r5 = 0;
        r7 = 0;
        r2 = r8;
        r8 = r2.query(r3, r4, r5, r6, r7);
        if (r8 == 0) goto L_0x0096;
    L_0x006b:
        r2 = r8.moveToFirst();	 Catch:{ all -> 0x0091 }
        if (r2 != 0) goto L_0x0079;
    L_0x0071:
        r0 = 0;
        defpackage.rzt.a(r1, r9, r0);	 Catch:{ all -> 0x0091 }
        r8.close();
        return r10;
    L_0x0079:
        r0 = r8.getString(r0);	 Catch:{ all -> 0x0091 }
        if (r0 == 0) goto L_0x0087;
    L_0x007f:
        r2 = r0.equals(r10);	 Catch:{ all -> 0x0091 }
        if (r2 != 0) goto L_0x0086;
    L_0x0085:
        goto L_0x0087;
    L_0x0086:
        r0 = r10;
    L_0x0087:
        defpackage.rzt.a(r1, r9, r0);	 Catch:{ all -> 0x0091 }
        if (r0 == 0) goto L_0x008d;
    L_0x008c:
        r10 = r0;
    L_0x008d:
        r8.close();
        return r10;
    L_0x0091:
        r9 = move-exception;
        r8.close();
        throw r9;
    L_0x0096:
        return r10;
    L_0x0097:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0097 }
        goto L_0x009b;
    L_0x009a:
        throw r8;
    L_0x009b:
        goto L_0x009a;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rzt.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    private static void a(Object obj, String str, String str2) {
        synchronized (rzt.class) {
            if (obj == k) {
                g.put(str, str2);
            }
        }
    }

    @Deprecated
    public static String a(ContentResolver contentResolver, String str) {
        return rzt.a(contentResolver, str, null);
    }

    public static long a(ContentResolver contentResolver, String str, long j) {
        Object a = rzt.a(contentResolver);
        Object obj = (Long) rzt.a(i, str, Long.valueOf(j));
        if (obj != null) {
            return obj.longValue();
        }
        String a2 = rzt.a(contentResolver, str);
        if (a2 != null) {
            try {
                long parseLong = Long.parseLong(a2);
                obj = Long.valueOf(parseLong);
                j = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        rzt.a(a, i, str, obj);
        return j;
    }

    public static boolean a(ContentResolver contentResolver, String str, boolean z) {
        Object a = rzt.a(contentResolver);
        Object obj = (Boolean) rzt.a(h, str, Boolean.valueOf(z));
        if (obj != null) {
            return obj.booleanValue();
        }
        String a2 = rzt.a(contentResolver, str);
        if (!(a2 == null || a2.equals(""))) {
            if (b.matcher(a2).matches()) {
                obj = Boolean.valueOf(true);
                z = true;
            } else if (c.matcher(a2).matches()) {
                obj = Boolean.valueOf(false);
                z = false;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("attempt to read gservices key ");
                stringBuilder.append(str);
                stringBuilder.append(" (value \"");
                stringBuilder.append(a2);
                stringBuilder.append("\") as boolean");
                Log.w("Gservices", stringBuilder.toString());
            }
        }
        rzt.a(a, h, str, obj);
        return z;
    }

    public static Map a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f, null, null, strArr, null);
        Map treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    public static void b(ContentResolver contentResolver, String... strArr) {
        synchronized (rzt.class) {
            rzt.b(contentResolver);
            HashSet hashSet = new HashSet((((m.length + 1) << 2) / 3) + 1);
            hashSet.addAll(Arrays.asList(m));
            ArrayList arrayList = new ArrayList();
            Object obj = strArr[0];
            if (hashSet.add(obj)) {
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                strArr = new String[0];
            } else {
                m = (String[]) hashSet.toArray(new String[hashSet.size()]);
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            if (l) {
                if (!g.isEmpty()) {
                    if (strArr.length != 0) {
                        rzt.c(contentResolver, strArr);
                    }
                }
            }
            rzt.c(contentResolver, m);
        }
    }

    private static void c(ContentResolver contentResolver, String[] strArr) {
        g.putAll(rzt.a(contentResolver, strArr));
        l = true;
    }

    public static Object a(ContentResolver contentResolver) {
        Object obj;
        synchronized (rzt.class) {
            rzt.b(contentResolver);
            obj = k;
        }
        return obj;
    }

    /* JADX WARNING: Missing block: B:10:0x0012, code skipped:
            return r2;
     */
    public static java.lang.Object a(java.util.HashMap r2, java.lang.String r3, java.lang.Object r4) {
        /*
        r0 = defpackage.rzt.class;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rzt.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public static void a(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (rzt.class) {
            if (obj == k) {
                hashMap.put(str, obj2);
                g.remove(str);
            }
        }
    }
}
