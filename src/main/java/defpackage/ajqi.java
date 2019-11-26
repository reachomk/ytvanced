package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: ajqi */
public class ajqi {
    public final WeakReference a;
    public boolean b;
    private final long c;
    private long d;
    private final List e;
    private final Map f;
    private final amqd g;
    private final TreeMap h;
    private ajqm i;
    private ajqm j;
    private long k;
    private long l;
    private ajqm m;

    public ajqi(ajng ajng, amqd amqd) {
        this(0, 0, ajng, amqd, false, null, new ajqm[0]);
    }

    private ajqi(long j, long j2, ajng ajng, amqd amqd, boolean z, ajqm ajqm, ajqm... ajqmArr) {
        this.l = 0;
        this.c = j;
        this.d = j2;
        this.a = new WeakReference(ajng);
        this.g = amqd;
        this.f = new HashMap();
        this.e = new ArrayList();
        this.b = z;
        this.j = ajqm;
        for (Object obj : ajqmArr) {
            this.e.add(obj);
            this.f.put(obj.e, obj);
            obj.c = this;
            this.f.put(obj.e, obj);
            if (ajqm != null) {
                this.k += obj.b;
            }
        }
        this.k -= j2 - j;
        this.i = !this.e.isEmpty() ? (ajqm) this.e.get(0) : null;
        this.h = new TreeMap();
    }

    public synchronized void a() {
        this.b = true;
    }

    public synchronized boolean a(long j) {
        boolean z;
        z = this.c <= j && j < this.d;
        return z;
    }

    public synchronized ajqm a(String str) {
        return (ajqm) this.f.get(str);
    }

    public final synchronized ajqm d(String str) {
        if (e(str) || this.f.get(str) == null) {
            return null;
        }
        List list = this.e;
        return (ajqm) list.get(list.indexOf(this.f.get(str)) + 1);
    }

    public final synchronized ajqm b(String str, long j) {
        Entry ceilingEntry = ((ajqm) ajqi.a(this, str, j).second).a.ceilingEntry(Long.valueOf(j));
        if (ceilingEntry != null) {
            return ((ajqi) ceilingEntry.getValue()).i;
        }
        return d(str);
    }

    /* JADX WARNING: Missing block: B:13:0x0034, code skipped:
            return false;
     */
    public final synchronized boolean a(long r7, long r9) {
        /*
        r6 = this;
        monitor-enter(r6);
        r1 = 0;
        r4 = 1;
        r0 = r6;
        r2 = r7;
        r7 = defpackage.ajqi.a(r0, r1, r2, r4);	 Catch:{ all -> 0x0035 }
        r1 = 0;
        r4 = 1;
        r0 = r6;
        r2 = r9;
        r8 = defpackage.ajqi.a(r0, r1, r2, r4);	 Catch:{ all -> 0x0035 }
        r9 = r7.isEmpty();	 Catch:{ all -> 0x0035 }
        r10 = 0;
        if (r9 != 0) goto L_0x0033;
    L_0x001a:
        r9 = r8.isEmpty();	 Catch:{ all -> 0x0035 }
        if (r9 != 0) goto L_0x0033;
    L_0x0020:
        r7 = r7.get(r10);	 Catch:{ all -> 0x0035 }
        r7 = (defpackage.ajqj) r7;	 Catch:{ all -> 0x0035 }
        r8 = r8.get(r10);	 Catch:{ all -> 0x0035 }
        r7 = r7.equals(r8);	 Catch:{ all -> 0x0035 }
        if (r7 == 0) goto L_0x0033;
    L_0x0030:
        r7 = 1;
        monitor-exit(r6);
        return r7;
    L_0x0033:
        monitor-exit(r6);
        return r10;
    L_0x0035:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajqi.a(long, long):boolean");
    }

    /* JADX WARNING: Missing block: B:8:0x0036, code skipped:
            return r0;
     */
    public synchronized defpackage.ajni a(defpackage.ajni r6, java.lang.String r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.a(r7);	 Catch:{ all -> 0x0039 }
        if (r0 == 0) goto L_0x0037;
    L_0x0007:
        r0 = new ajnf;	 Catch:{ all -> 0x0039 }
        r1 = r5.i;	 Catch:{ all -> 0x0039 }
        r1 = r1.d;	 Catch:{ all -> 0x0039 }
        r1 = r1.get();	 Catch:{ all -> 0x0039 }
        r1 = (defpackage.ajnd) r1;	 Catch:{ all -> 0x0039 }
        r1 = r1.k();	 Catch:{ all -> 0x0039 }
        r0.<init>(r1);	 Catch:{ all -> 0x0039 }
        r6 = (defpackage.ahkm) r6;	 Catch:{ all -> 0x0039 }
        r1 = r6.a;	 Catch:{ all -> 0x0039 }
        r6 = r5.a(r7, r1);	 Catch:{ all -> 0x0039 }
        r1 = r0.a;	 Catch:{ all -> 0x0039 }
        r3 = r0.b;	 Catch:{ all -> 0x0039 }
        r1 = r6 - r1;
        r3 = r3 + r1;
        r0.b = r3;	 Catch:{ all -> 0x0039 }
        r0.a = r6;	 Catch:{ all -> 0x0039 }
        r1 = r0.c;	 Catch:{ all -> 0x0039 }
        r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r3 <= 0) goto L_0x0035;
    L_0x0033:
        r0.c = r6;	 Catch:{ all -> 0x0039 }
    L_0x0035:
        monitor-exit(r5);
        return r0;
    L_0x0037:
        monitor-exit(r5);
        return r6;
    L_0x0039:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajqi.a(ajni, java.lang.String):ajni");
    }

    public synchronized long b(long j) {
        return ((Long) ajqi.a(this, j).first).longValue();
    }

    private static Pair a(ajqi ajqi, long j) {
        TreeMap treeMap = ajqi.h;
        Long valueOf = Long.valueOf(j);
        Entry floorEntry = treeMap.floorEntry(valueOf);
        if (floorEntry == null) {
            return new Pair(valueOf, ajqi.i);
        }
        ajqi ajqi2 = (ajqi) floorEntry.getValue();
        long longValue = ((Long) floorEntry.getKey()).longValue();
        long j2 = j - longValue;
        long j3 = ajqi2.d;
        if (longValue == (ajqi2.l + j3) + ajqi2.k && ajqi2.j != null) {
            return new Pair(Long.valueOf(j3 + j2), ajqi2.j);
        }
        for (ajqm ajqm : ajqi2.e) {
            longValue = ajqm.b;
            if (longValue > j2) {
                return new Pair(Long.valueOf(j2), ajqm);
            }
            j2 -= longValue;
        }
        return new Pair(Long.valueOf(j), ajqi.i);
    }

    public synchronized long a(String str, long j) {
        ajqm a = a(str);
        if (a != null) {
            ajqi ajqi = a.c;
            if (ajqi.b) {
                if (ajqi.j == null) {
                    long j2 = this.i.b;
                    if (j2 < j) {
                        j = j2;
                    }
                    Entry floorEntry = ajqi.i.a.floorEntry(Long.valueOf(j));
                    if (floorEntry != null) {
                        if (((ajqi) floorEntry.getValue()).d <= j) {
                            j += ((ajqi) floorEntry.getValue()).k;
                        }
                        j += ((ajqi) floorEntry.getValue()).l;
                    }
                } else {
                    while (ajqi.j != null && ajqi.b) {
                        for (ajqm ajqm : ajqi.e) {
                            if (ajqm == a) {
                                break;
                            }
                            j += ajqm.b;
                        }
                        j += ajqi.c + ajqi.l;
                        ajqi = ajqi.j.c;
                    }
                }
            }
        }
        return j;
    }

    public synchronized List b(String str) {
        ajqm ajqm = (ajqm) this.f.get(str);
        if (ajqm == null) {
            return null;
        }
        ajqi ajqi = ajqm.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        for (ajqi ajqi2 : ajqm.a.values()) {
            arrayList.addAll(ajqi2.f.keySet());
        }
        while (ajqi != null) {
            ajqi.f.keySet().removeAll(arrayList);
            ajqm ajqm2 = ajqi.j;
            if (ajqm2 == null) {
                ajqi = null;
            } else {
                ajqi = ajqm2.c;
            }
        }
        ajqm.c.e.remove(ajqm);
        ajqi ajqi3 = ajqm.c;
        if (ajqi3.i == ajqm) {
            ajqi3.i = (ajqm) amux.a(ajqi3.e, null);
        }
        Object obj = null;
        if (ajqm.c.e.isEmpty()) {
            ajqi3 = ajqm.c;
            ajqm ajqm3 = ajqi3.j;
            if (ajqm3 != null) {
                ajqm3.a.remove(Long.valueOf(ajqi3.c));
                obj = 1;
            }
        }
        if (this.b && this.i != null) {
            ajqi3 = ajqm.c;
            long j = ajqi3.k;
            if (obj != null) {
                a(ajqi3);
            } else {
                j = ajqm.b;
            }
            if (j != 0) {
                for (ajqi ajqi4 : this.i.a.tailMap(Long.valueOf(this.c)).values()) {
                    a(ajqi4);
                    if (ajqi4 != ajqm.c) {
                        ajqi4.l -= j;
                    } else {
                        ajqi4.k -= j;
                    }
                    b(ajqi4);
                }
            }
        }
        ajqm.c = null;
        return arrayList;
    }

    public final synchronized void g() {
        ArrayList arrayList = new ArrayList();
        this.h.clear();
        for (ajqm ajqm : this.e) {
            arrayList.add(ajqm.e);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b((String) arrayList.get(i));
        }
        this.i = null;
        this.m = null;
    }

    public synchronized ajqm a(aakj aakj, String str, int i) {
        return a(aakj, str, !aakj.j() ? TimeUnit.SECONDS.toMillis((long) aakj.h()) : Long.MAX_VALUE, i);
    }

    public synchronized ajqm a(aakj aakj, String str, long j, int i) {
        return new ajqm(this, new ajqh(this, str, aakj, i), j, str, aakj);
    }

    public synchronized void a(aakj aakj, String str) {
        if (!b()) {
            a(new ajqm(this, new ajqk(this, str, aakj), Long.MAX_VALUE, str, aakj));
        }
    }

    public synchronized boolean a(ajqm ajqm) {
        if (this.f.containsKey(ajqm.e)) {
            return false;
        }
        if (ajqm.c != this) {
            return false;
        }
        if (this.e.isEmpty()) {
            this.i = ajqm;
        }
        this.e.add(ajqm);
        this.f.put(ajqm.e, ajqm);
        return true;
    }

    public synchronized boolean b() {
        return this.i != null;
    }

    public synchronized void c() {
        this.g.a(null);
    }

    private static Pair a(ajqi ajqi, String str, long j) {
        ajqm a = ajqi.a(str);
        if (str == null || ajqi.a(str) == null) {
            return ajqi.a(ajqi, j);
        }
        return new Pair(Long.valueOf(j), a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARNING: Missing block: B:11:0x0019, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:57:0x0108, code skipped:
            return r0;
     */
    public static java.util.List a(defpackage.ajqi r17, java.lang.String r18, long r19, long r21) {
        /*
        r1 = r17;
        r0 = new java.util.ArrayList;
        r0.<init>();
        monitor-enter(r17);
        r2 = r17.d();	 Catch:{ all -> 0x0109 }
        if (r2 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0018;
    L_0x000f:
        if (r18 == 0) goto L_0x001a;
    L_0x0011:
        r2 = r17.a(r18);	 Catch:{ all -> 0x0109 }
        if (r2 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x001a;
    L_0x0018:
        monitor-exit(r17);	 Catch:{ all -> 0x0109 }
        return r0;
    L_0x001a:
        r2 = defpackage.ajqi.a(r17, r18, r19);	 Catch:{ all -> 0x0109 }
        r3 = new java.util.HashSet;	 Catch:{ all -> 0x0109 }
        r3.<init>();	 Catch:{ all -> 0x0109 }
        r4 = r2.first;	 Catch:{ all -> 0x0109 }
        r4 = (java.lang.Long) r4;	 Catch:{ all -> 0x0109 }
        r4 = r4.longValue();	 Catch:{ all -> 0x0109 }
        r2 = r2.second;	 Catch:{ all -> 0x0109 }
        r2 = (defpackage.ajqm) r2;	 Catch:{ all -> 0x0109 }
        r6 = r4;
        r4 = r21;
    L_0x0032:
        r8 = 0;
        r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r10 > 0) goto L_0x003a;
    L_0x0038:
        goto L_0x00d9;
    L_0x003a:
        if (r2 == 0) goto L_0x00d9;
    L_0x003c:
        r10 = r2.a;	 Catch:{ all -> 0x0109 }
        r10 = r10.isEmpty();	 Catch:{ all -> 0x0109 }
        r11 = 0;
        if (r10 == 0) goto L_0x0047;
    L_0x0045:
        r10 = r11;
        goto L_0x006b;
    L_0x0047:
        r10 = r2.a;	 Catch:{ all -> 0x0109 }
        r12 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0109 }
        r10 = r10.ceilingEntry(r12);	 Catch:{ all -> 0x0109 }
        if (r10 == 0) goto L_0x006b;
    L_0x0053:
        r12 = r10.getValue();	 Catch:{ all -> 0x0109 }
        r12 = r3.contains(r12);	 Catch:{ all -> 0x0109 }
        if (r12 != 0) goto L_0x005e;
    L_0x005d:
        goto L_0x006b;
    L_0x005e:
        r10 = r2.a;	 Catch:{ all -> 0x0109 }
        r12 = 1;
        r12 = r12 + r6;
        r12 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x0109 }
        r10 = r10.ceilingEntry(r12);	 Catch:{ all -> 0x0109 }
    L_0x006b:
        if (r10 == 0) goto L_0x0094;
    L_0x006d:
        r12 = r10.getKey();	 Catch:{ all -> 0x0109 }
        r12 = (java.lang.Long) r12;	 Catch:{ all -> 0x0109 }
        r12 = r12.longValue();	 Catch:{ all -> 0x0109 }
        r12 = r12 - r6;
        r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1));
        if (r14 <= 0) goto L_0x008a;
    L_0x007c:
        r11 = r10.getKey();	 Catch:{ all -> 0x0109 }
        r11 = (java.lang.Long) r11;	 Catch:{ all -> 0x0109 }
        r11 = r11.longValue();	 Catch:{ all -> 0x0109 }
        r11 = r2.a(r6, r11);	 Catch:{ all -> 0x0109 }
    L_0x008a:
        r2 = r10.getValue();	 Catch:{ all -> 0x0109 }
        r2 = (defpackage.ajqi) r2;	 Catch:{ all -> 0x0109 }
        r2 = r2.i;	 Catch:{ all -> 0x0109 }
    L_0x0092:
        r6 = r8;
        goto L_0x00ca;
    L_0x0094:
        r12 = r2.b;	 Catch:{ all -> 0x0109 }
        r12 = r12 - r6;
        r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x009f;
    L_0x009b:
        r11 = r2.a(r6);	 Catch:{ all -> 0x0109 }
    L_0x009f:
        r10 = r2.c;	 Catch:{ all -> 0x0109 }
        r12 = r2.e;	 Catch:{ all -> 0x0109 }
        r10 = r10.e(r12);	 Catch:{ all -> 0x0109 }
        if (r10 != 0) goto L_0x00b2;
    L_0x00a9:
        r6 = r2.c;	 Catch:{ all -> 0x0109 }
        r2 = r2.e;	 Catch:{ all -> 0x0109 }
        r2 = r6.d(r2);	 Catch:{ all -> 0x0109 }
        goto L_0x0092;
    L_0x00b2:
        r10 = r2.c;	 Catch:{ all -> 0x0109 }
        r12 = r10.d;	 Catch:{ all -> 0x0109 }
        r14 = r10.c;	 Catch:{ all -> 0x0109 }
        r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r16 != 0) goto L_0x00bf;
    L_0x00bc:
        r3.add(r10);	 Catch:{ all -> 0x0109 }
    L_0x00bf:
        r10 = r2.c;	 Catch:{ all -> 0x0109 }
        r12 = r10.j;	 Catch:{ all -> 0x0109 }
        if (r12 != 0) goto L_0x00c7;
    L_0x00c5:
        r4 = r8;
        goto L_0x00ca;
    L_0x00c7:
        r6 = r10.d;	 Catch:{ all -> 0x0109 }
        r2 = r12;
    L_0x00ca:
        if (r11 != 0) goto L_0x00ce;
    L_0x00cc:
        goto L_0x0032;
    L_0x00ce:
        r8 = r11.b;	 Catch:{ all -> 0x0109 }
        r12 = r11.a;	 Catch:{ all -> 0x0109 }
        r8 = r8 - r12;
        r4 = r4 - r8;
        r0.add(r11);	 Catch:{ all -> 0x0109 }
        goto L_0x0032;
    L_0x00d9:
        r3 = r0.isEmpty();	 Catch:{ all -> 0x0109 }
        if (r3 != 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x00eb;
    L_0x00e0:
        if (r2 == 0) goto L_0x00eb;
    L_0x00e2:
        r3 = r2.b;	 Catch:{ all -> 0x0109 }
        r2 = r2.a(r3);	 Catch:{ all -> 0x0109 }
        r0.add(r2);	 Catch:{ all -> 0x0109 }
    L_0x00eb:
        r2 = r0.isEmpty();	 Catch:{ all -> 0x0109 }
        if (r2 != 0) goto L_0x0107;
    L_0x00f1:
        r2 = r0.size();	 Catch:{ all -> 0x0109 }
        r2 = r2 + -1;
        r2 = r0.get(r2);	 Catch:{ all -> 0x0109 }
        r2 = (defpackage.ajqj) r2;	 Catch:{ all -> 0x0109 }
        r2 = r2.a();	 Catch:{ all -> 0x0109 }
        r2 = r1.a(r2);	 Catch:{ all -> 0x0109 }
        r1.m = r2;	 Catch:{ all -> 0x0109 }
    L_0x0107:
        monitor-exit(r17);	 Catch:{ all -> 0x0109 }
        return r0;
    L_0x0109:
        r0 = move-exception;
        monitor-exit(r17);	 Catch:{ all -> 0x0109 }
        goto L_0x010d;
    L_0x010c:
        throw r0;
    L_0x010d:
        goto L_0x010c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajqi.a(ajqi, java.lang.String, long, long):java.util.List");
    }

    /* JADX WARNING: Missing block: B:38:0x007b, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:59:0x011a, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:61:0x011c, code skipped:
            return false;
     */
    public synchronized boolean a(long r17, long r19, defpackage.ajqm... r21) {
        /*
        r16 = this;
        r1 = r16;
        r12 = r17;
        r5 = r19;
        r0 = r21;
        monitor-enter(r16);
        r2 = r1.i;	 Catch:{ all -> 0x011d }
        r14 = 0;
        if (r2 == 0) goto L_0x011b;
    L_0x000e:
        r2 = r0.length;	 Catch:{ all -> 0x011d }
        if (r2 == 0) goto L_0x011b;
    L_0x0011:
        r3 = 0;
    L_0x0012:
        if (r3 >= r2) goto L_0x0025;
    L_0x0014:
        r4 = r0[r3];	 Catch:{ all -> 0x011d }
        r7 = r1.f;	 Catch:{ all -> 0x011d }
        r4 = r4.e;	 Catch:{ all -> 0x011d }
        r4 = r7.containsKey(r4);	 Catch:{ all -> 0x011d }
        if (r4 != 0) goto L_0x0023;
    L_0x0020:
        r3 = r3 + 1;
        goto L_0x0012;
    L_0x0023:
        monitor-exit(r16);
        return r14;
    L_0x0025:
        r2 = r1.i;	 Catch:{ all -> 0x011d }
        r2 = r2.a;	 Catch:{ all -> 0x011d }
        r3 = java.lang.Long.valueOf(r17);	 Catch:{ all -> 0x011d }
        r2 = r2.floorEntry(r3);	 Catch:{ all -> 0x011d }
        r3 = r1.i;	 Catch:{ all -> 0x011d }
        r3 = r3.a;	 Catch:{ all -> 0x011d }
        r4 = java.lang.Long.valueOf(r19);	 Catch:{ all -> 0x011d }
        r3 = r3.floorEntry(r4);	 Catch:{ all -> 0x011d }
        r4 = 0;
        if (r2 == 0) goto L_0x0047;
    L_0x0040:
        r2 = r2.getValue();	 Catch:{ all -> 0x011d }
        r2 = (defpackage.ajqi) r2;	 Catch:{ all -> 0x011d }
        goto L_0x0048;
    L_0x0047:
        r2 = r4;
    L_0x0048:
        if (r3 == 0) goto L_0x0051;
    L_0x004a:
        r3 = r3.getValue();	 Catch:{ all -> 0x011d }
        r4 = r3;
        r4 = (defpackage.ajqi) r4;	 Catch:{ all -> 0x011d }
    L_0x0051:
        if (r2 == 0) goto L_0x0061;
    L_0x0053:
        if (r4 != r2) goto L_0x0061;
    L_0x0055:
        r3 = r2.a(r12);	 Catch:{ all -> 0x011d }
        if (r3 == 0) goto L_0x0061;
    L_0x005b:
        r3 = r4.a(r5);	 Catch:{ all -> 0x011d }
        if (r3 != 0) goto L_0x007a;
    L_0x0061:
        if (r2 == 0) goto L_0x0069;
    L_0x0063:
        r3 = r2.a(r12);	 Catch:{ all -> 0x011d }
        if (r3 != 0) goto L_0x007a;
    L_0x0069:
        if (r4 == 0) goto L_0x0071;
    L_0x006b:
        r3 = r4.a(r5);	 Catch:{ all -> 0x011d }
        if (r3 != 0) goto L_0x007a;
    L_0x0071:
        if (r2 != 0) goto L_0x0075;
    L_0x0073:
        if (r4 != r2) goto L_0x007a;
    L_0x0075:
        if (r2 != 0) goto L_0x0078;
    L_0x0077:
        goto L_0x007c;
    L_0x0078:
        if (r2 == r4) goto L_0x007c;
    L_0x007a:
        monitor-exit(r16);
        return r14;
    L_0x007c:
        r15 = new ajqi;	 Catch:{ all -> 0x011d }
        r2 = r1.a;	 Catch:{ all -> 0x011d }
        r2 = r2.get();	 Catch:{ all -> 0x011d }
        r7 = r2;
        r7 = (defpackage.ajng) r7;	 Catch:{ all -> 0x011d }
        r8 = r1.g;	 Catch:{ all -> 0x011d }
        r9 = r1.b;	 Catch:{ all -> 0x011d }
        r10 = r1.i;	 Catch:{ all -> 0x011d }
        r2 = r15;
        r3 = r17;
        r5 = r19;
        r11 = r21;
        r2.<init>(r3, r5, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x011d }
        r2 = r1.i;	 Catch:{ all -> 0x011d }
        r15.j = r2;	 Catch:{ all -> 0x011d }
        r2 = r2.a;	 Catch:{ all -> 0x011d }
        r3 = r15.c;	 Catch:{ all -> 0x011d }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x011d }
        r2.put(r3, r15);	 Catch:{ all -> 0x011d }
        r2 = r0.length;	 Catch:{ all -> 0x011d }
    L_0x00a7:
        if (r14 >= r2) goto L_0x00b5;
    L_0x00a9:
        r3 = r0[r14];	 Catch:{ all -> 0x011d }
        r4 = r1.f;	 Catch:{ all -> 0x011d }
        r5 = r3.e;	 Catch:{ all -> 0x011d }
        r4.put(r5, r3);	 Catch:{ all -> 0x011d }
        r14 = r14 + 1;
        goto L_0x00a7;
    L_0x00b5:
        r0 = r1.b;	 Catch:{ all -> 0x011d }
        if (r0 == 0) goto L_0x0118;
    L_0x00b9:
        r0 = r1.i;	 Catch:{ all -> 0x011d }
        r0 = r0.a;	 Catch:{ all -> 0x011d }
        r2 = -1;
        r2 = r2 + r12;
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x011d }
        r0 = r0.floorEntry(r2);	 Catch:{ all -> 0x011d }
        if (r0 == 0) goto L_0x00dd;
    L_0x00ca:
        r2 = r0.getValue();	 Catch:{ all -> 0x011d }
        r2 = (defpackage.ajqi) r2;	 Catch:{ all -> 0x011d }
        r2 = r2.l;	 Catch:{ all -> 0x011d }
        r0 = r0.getValue();	 Catch:{ all -> 0x011d }
        r0 = (defpackage.ajqi) r0;	 Catch:{ all -> 0x011d }
        r4 = r0.k;	 Catch:{ all -> 0x011d }
        r2 = r2 + r4;
        r15.l = r2;	 Catch:{ all -> 0x011d }
    L_0x00dd:
        r2 = r15.k;	 Catch:{ all -> 0x011d }
        r4 = 0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x0115;
    L_0x00e5:
        r0 = r1.i;	 Catch:{ all -> 0x011d }
        r0 = r0.a;	 Catch:{ all -> 0x011d }
        r2 = java.lang.Long.valueOf(r17);	 Catch:{ all -> 0x011d }
        r0 = r0.tailMap(r2);	 Catch:{ all -> 0x011d }
        r0 = r0.values();	 Catch:{ all -> 0x011d }
        r0 = r0.iterator();	 Catch:{ all -> 0x011d }
    L_0x00f9:
        r2 = r0.hasNext();	 Catch:{ all -> 0x011d }
        if (r2 == 0) goto L_0x0115;
    L_0x00ff:
        r2 = r0.next();	 Catch:{ all -> 0x011d }
        r2 = (defpackage.ajqi) r2;	 Catch:{ all -> 0x011d }
        if (r2 == r15) goto L_0x00f9;
    L_0x0107:
        r1.a(r2);	 Catch:{ all -> 0x011d }
        r3 = r2.l;	 Catch:{ all -> 0x011d }
        r5 = r15.k;	 Catch:{ all -> 0x011d }
        r3 = r3 + r5;
        r2.l = r3;	 Catch:{ all -> 0x011d }
        r1.b(r2);	 Catch:{ all -> 0x011d }
        goto L_0x00f9;
    L_0x0115:
        r1.b(r15);	 Catch:{ all -> 0x011d }
    L_0x0118:
        monitor-exit(r16);
        r0 = 1;
        return r0;
    L_0x011b:
        monitor-exit(r16);
        return r14;
    L_0x011d:
        r0 = move-exception;
        monitor-exit(r16);
        goto L_0x0121;
    L_0x0120:
        throw r0;
    L_0x0121:
        goto L_0x0120;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajqi.a(long, long, ajqm[]):boolean");
    }

    private final void a(ajqi ajqi) {
        this.h.remove(Long.valueOf(ajqi.c + ajqi.l));
        this.h.remove(Long.valueOf((ajqi.d + ajqi.l) + ajqi.k));
    }

    private final void b(ajqi ajqi) {
        this.h.put(Long.valueOf(ajqi.c + ajqi.l), ajqi);
        this.h.put(Long.valueOf((ajqi.d + ajqi.l) + ajqi.k), ajqi);
    }

    public synchronized boolean d() {
        return this.e.isEmpty() ^ 1;
    }

    public synchronized boolean e() {
        ajqm ajqm = this.i;
        if (ajqm != null) {
            if (!ajqm.a.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean f() {
        return this.m != null;
    }

    public final synchronized boolean e(String str) {
        boolean z;
        z = d() && TextUtils.equals(((ajqm) amux.b(this.e)).e, str);
        return z;
    }

    public synchronized boolean c(String str) {
        boolean z;
        z = f() && TextUtils.equals(this.m.e, str);
        return z;
    }
}
