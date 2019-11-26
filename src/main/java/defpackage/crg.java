package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: crg */
public final class crg {
    public Map a;
    public Map b;
    public Map c;
    public Map d;
    public HashSet e;

    public crg() {
        this(null);
    }

    /* JADX WARNING: Missing block: B:13:0x001f, code skipped:
            if (r1.isEmpty() == false) goto L_0x0021;
     */
    private crg(defpackage.crg r7) {
        /*
        r6 = this;
        r6.<init>();
        if (r7 == 0) goto L_0x0086;
    L_0x0005:
        monitor-enter(r6);
        r0 = r7.a();	 Catch:{ all -> 0x0083 }
        r1 = r7.g();	 Catch:{ all -> 0x0083 }
        if (r0 != 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0018;
    L_0x0011:
        r2 = r0.isEmpty();	 Catch:{ all -> 0x0083 }
        if (r2 != 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0021;
    L_0x0018:
        if (r1 != 0) goto L_0x001b;
    L_0x001a:
        goto L_0x0073;
    L_0x001b:
        r2 = r1.isEmpty();	 Catch:{ all -> 0x0083 }
        if (r2 != 0) goto L_0x0073;
    L_0x0021:
        r6.h();	 Catch:{ all -> 0x0083 }
        if (r0 == 0) goto L_0x004c;
    L_0x0026:
        r2 = r0.keySet();	 Catch:{ all -> 0x004a }
        r2 = r2.iterator();	 Catch:{ all -> 0x004a }
    L_0x002e:
        r3 = r2.hasNext();	 Catch:{ all -> 0x004a }
        if (r3 == 0) goto L_0x004c;
    L_0x0034:
        r3 = r2.next();	 Catch:{ all -> 0x004a }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x004a }
        r4 = r6.a;	 Catch:{ all -> 0x004a }
        r5 = r0.get(r3);	 Catch:{ all -> 0x004a }
        r5 = (java.util.List) r5;	 Catch:{ all -> 0x004a }
        r5 = defpackage.crg.a(r5);	 Catch:{ all -> 0x004a }
        r4.put(r3, r5);	 Catch:{ all -> 0x004a }
        goto L_0x002e;
    L_0x004a:
        r7 = move-exception;
        goto L_0x0072;
    L_0x004c:
        if (r1 == 0) goto L_0x0073;
    L_0x004e:
        r0 = r1.keySet();	 Catch:{ all -> 0x004a }
        r0 = r0.iterator();	 Catch:{ all -> 0x004a }
    L_0x0056:
        r2 = r0.hasNext();	 Catch:{ all -> 0x004a }
        if (r2 == 0) goto L_0x0073;
    L_0x005c:
        r2 = r0.next();	 Catch:{ all -> 0x004a }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x004a }
        r3 = r6.c;	 Catch:{ all -> 0x004a }
        r4 = r1.get(r2);	 Catch:{ all -> 0x004a }
        r4 = (java.util.List) r4;	 Catch:{ all -> 0x004a }
        r4 = defpackage.crg.a(r4);	 Catch:{ all -> 0x004a }
        r3.put(r2, r4);	 Catch:{ all -> 0x004a }
        goto L_0x0056;
    L_0x0072:
        throw r7;	 Catch:{ all -> 0x0083 }
    L_0x0073:
        r0 = r7.e();	 Catch:{ all -> 0x0083 }
        r6.a(r0);	 Catch:{ all -> 0x0083 }
        r7 = r7.f();	 Catch:{ all -> 0x0083 }
        r6.b(r7);	 Catch:{ all -> 0x0083 }
        monitor-exit(r6);	 Catch:{ all -> 0x0083 }
        return;
    L_0x0083:
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0083 }
        throw r7;
    L_0x0086:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crg.<init>(crg):void");
    }

    public static crg a(crg crg) {
        return cuj.j ? new crg(crg) : null;
    }

    public final synchronized void a(String str, cmq cmq) {
        h();
        List list = (List) this.a.get(str);
        if (list == null) {
            list = crg.a(null);
            this.a.put(str, list);
        }
        list.add(cmq);
    }

    public final void a(crg crg, boolean z) {
        Map g;
        if (z) {
            g = crg.g();
        } else {
            g = crg.a();
        }
        synchronized (this) {
            if (g != null) {
                Map map = this.a;
                if (map != null) {
                    if (!map.isEmpty()) {
                        for (String str : g.keySet()) {
                            List list;
                            synchronized (this) {
                                list = (List) this.a.get(str);
                            }
                            if (list != null) {
                                List list2 = (List) g.get(str);
                                if (list.size() == list2.size()) {
                                    synchronized (this) {
                                        this.a.remove(str);
                                    }
                                } else {
                                    list.removeAll(list2);
                                }
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = crg.e;
        ArrayList arrayList = new ArrayList();
        if (hashSet != null) {
            Map map2 = crg.d;
            if (map2 != null) {
                arrayList.addAll(map2.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    String str2 = (String) arrayList.get(i);
                    if (!hashSet.contains(str2)) {
                        crg.d.remove(str2);
                    }
                }
            }
        }
        a(crg.e());
        b(crg.f());
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list != null ? list.size() : 4);
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    private final synchronized Map e() {
        return this.d;
    }

    public final synchronized Map a() {
        return this.a;
    }

    private final synchronized Map f() {
        return this.b;
    }

    private final synchronized Map g() {
        return this.c;
    }

    public final synchronized void a(List list, String str) {
        Map map = this.b;
        if (map != null) {
            for (List list2 : map.values()) {
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    csn.a((crr) list2.get(i), list, str);
                }
            }
            this.b = null;
        }
    }

    private final void a(Map map) {
        if (map != null && !map.isEmpty()) {
            synchronized (this) {
                b();
                this.d.clear();
                this.d.putAll(map);
            }
        }
    }

    private final void b(Map map) {
        if (map != null && !map.isEmpty()) {
            synchronized (this) {
                d();
                this.b.putAll(map);
            }
        }
    }

    public final synchronized void b() {
        if (this.d == null) {
            this.d = new HashMap(4);
        }
    }

    public final synchronized void c() {
        if (this.e == null) {
            this.e = new HashSet();
        }
    }

    public final synchronized void d() {
        if (this.b == null) {
            this.b = new HashMap();
        }
    }

    private final synchronized void h() {
        if (this.a == null) {
            this.a = new HashMap(4);
        }
        if (this.c == null) {
            this.c = new HashMap(4);
        }
    }
}
