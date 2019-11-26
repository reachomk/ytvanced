package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: aefc */
public final class aefc implements aeeu {
    public final amro a;
    public amro b;
    private final bcaa c;
    private final afhh d;
    private final Map e = Collections.synchronizedMap(new aefe());
    private final Map f;

    public aefc(amro amro, bcaa bcaa, afhh afhh, aenq aenq, aeez aeez) {
        amro amro2 = aefb.a;
        this.a = amro;
        this.c = bcaa;
        this.b = amro2;
        this.d = afhh;
        this.f = amur.a(Integer.valueOf(0), aenq, Integer.valueOf(3), aeez);
    }

    public final boolean a(String str, String str2, long j, int i, int i2, int i3) {
        return b(str, str2, j, i, i2, i3);
    }

    public final boolean a(String str, int i, String str2, long j) {
        return b(str, aajy.a(i, str2), j, 1, 1, 1);
    }

    public final long a(aahr aahr, long j) {
        String str;
        aeew a;
        String str2;
        if (aahr.G()) {
            str = aahr.b;
            if (TextUtils.isEmpty(str)) {
                a = aefc.a(j);
            } else {
                str2 = aahr.e;
                xvd.a(str);
                xvd.a(str2);
                if (this.c.get() == null) {
                    a = aefc.a(j);
                } else {
                    Set a2 = a();
                    str = aefc.a(a2, str, str2);
                    if (str == null) {
                        a = aefc.a(j);
                    } else {
                        ofj a3 = a(a2, str);
                        if (a3 != null) {
                            a = aefc.a(a2, str, a3, j);
                        } else {
                            a = aefc.a(j);
                        }
                    }
                }
            }
        } else {
            a = null;
        }
        if (a == null || a.a == -1) {
            str = aahr.b;
            if (TextUtils.isEmpty(str)) {
                a = aefc.a(j);
            } else {
                str2 = aahr.e;
                long c = aahr.c();
                long toMicros = TimeUnit.MILLISECONDS.toMicros(aahr.c);
                xvd.a(str);
                xvd.a(str2);
                if (this.c.get() == null) {
                    a = aefc.a(j);
                } else {
                    this.c.get();
                    ofj a4 = aeex.a(c, toMicros);
                    if (a4 == null) {
                        a = aefc.a(j);
                    } else {
                        Set a5 = a();
                        a = aefc.a(a5, aefc.a(a5, str, str2), a4, j);
                    }
                }
            }
        }
        j = a.a;
        return j == -2 ? TimeUnit.MILLISECONDS.toMicros(aahr.c) : j;
    }

    private final boolean b(String str, String str2, long j, int i, int i2, int i3) {
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        xvd.a(str);
        xvd.a(str2);
        int i4 = i3;
        for (int i5 = i2; i5 <= i4; i5++) {
            if (i5 != 1) {
                aeer aeer = (aeer) this.f.get(Integer.valueOf(i5));
                if (aeer != null && aeer.a(str3, str4, j2)) {
                    return true;
                }
            } else if (this.c.get() != null) {
                Set<oww> a = a();
                String a2 = aefc.a(a, str3, str4);
                if (a2 != null) {
                    ofj a3 = a((Set) a, a2);
                    if (a3 != null) {
                        int b = a3.b(j2);
                        int min = Math.min(a3.c.length - 1, b + i);
                        if (min >= b && min < a3.c.length) {
                            long b2 = aefc.b(a3, j2);
                            long j3 = a3.c[min] - b2;
                            for (oww b3 : a) {
                                if (b3.b(a2, b2, j3)) {
                                    return true;
                                }
                            }
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f A:{SYNTHETIC, Splitter:B:22:0x006f} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    private final defpackage.ofj a(java.util.Set r23, java.lang.String r24) {
        /*
        r22 = this;
        r1 = r22;
        r9 = r24;
        r0 = r1.e;
        r0 = r0.containsKey(r9);
        if (r0 == 0) goto L_0x000e;
    L_0x000c:
        goto L_0x00ed;
    L_0x000e:
        r0 = new ovm;
        r3 = 0;
        r4 = 0;
        r6 = -1;
        r2 = r0;
        r8 = r24;
        r2.<init>(r3, r4, r6, r8);
        r2 = new aefd;
        r3 = r23;
        r2.<init>(r3);
        r3 = r1.d;
        if (r3 == 0) goto L_0x002a;
    L_0x0026:
        r2 = r3.a(r2);
    L_0x002a:
        r3 = r1.e;
        r4 = r1.c;
        r4.get();
        r4 = 1;
        r5 = 0;
        r6 = 0;
        r2.a(r0);	 Catch:{ IOException -> 0x007d, all -> 0x0078 }
        r7 = new oza;	 Catch:{ IOException -> 0x007d, all -> 0x0078 }
        r8 = 8;
        r7.<init>(r8);	 Catch:{ IOException -> 0x007d, all -> 0x0078 }
        r10 = r7.a;	 Catch:{ IOException -> 0x007d, all -> 0x0078 }
        r10 = r2.a(r10, r5, r8);	 Catch:{ IOException -> 0x007d, all -> 0x0078 }
        r11 = 2;
        if (r10 != r8) goto L_0x005d;
    L_0x0047:
        r8 = r7.k();	 Catch:{ IOException -> 0x007d, all -> 0x0078 }
        r10 = 440786851; // 0x1a45dfa3 float:4.0919297E-23 double:2.1777764E-315;
        if (r8 == r10) goto L_0x005b;
    L_0x0050:
        r7 = r7.k();	 Catch:{ IOException -> 0x007d, all -> 0x0078 }
        r8 = 1718909296; // 0x66747970 float:2.8862439E23 double:8.492540315E-315;
        if (r7 != r8) goto L_0x005d;
    L_0x0059:
        r7 = 1;
        goto L_0x005e;
    L_0x005b:
        r7 = 2;
        goto L_0x005e;
    L_0x005d:
        r7 = 0;
    L_0x005e:
        if (r7 == r4) goto L_0x006f;
    L_0x0060:
        if (r7 == r11) goto L_0x0066;
    L_0x0062:
        defpackage.aeex.a(r2);
        goto L_0x0080;
    L_0x0066:
        r7 = new ogn;	 Catch:{ IOException -> 0x007d, all -> 0x0078 }
        r7.<init>();	 Catch:{ IOException -> 0x007d, all -> 0x0078 }
        defpackage.aeex.a(r2);
        goto L_0x0081;
    L_0x006f:
        r7 = new ohk;	 Catch:{ IOException -> 0x007d, all -> 0x0078 }
        r7.<init>();	 Catch:{ IOException -> 0x007d, all -> 0x0078 }
        defpackage.aeex.a(r2);
        goto L_0x0081;
    L_0x0078:
        r0 = move-exception;
        defpackage.aeex.a(r2);
        throw r0;
    L_0x007d:
        defpackage.aeex.a(r2);
    L_0x0080:
        r7 = r6;
    L_0x0081:
        if (r7 == 0) goto L_0x00e5;
    L_0x0083:
        r7 = defpackage.aeex.a(r7);
        r8 = new aefa;
        r8.<init>(r0, r2, r7);
        r0 = new ofl;	 Catch:{ all -> 0x00d7 }
        r11 = r8.b;	 Catch:{ all -> 0x00d7 }
        r2 = r8.a;	 Catch:{ all -> 0x00d7 }
        r12 = r2.d;	 Catch:{ all -> 0x00d7 }
        r14 = r11.a(r2);	 Catch:{ all -> 0x00d7 }
        r10 = r0;
        r10.<init>(r11, r12, r14);	 Catch:{ all -> 0x00d7 }
        r2 = r8.c;	 Catch:{ all -> 0x00d7 }
        r17 = 0;
        r18 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r20 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r16 = r2;
        r16.a(r17, r18, r20);	 Catch:{ all -> 0x00d7 }
        r2 = r8.c;	 Catch:{ all -> 0x00d7 }
        r2 = r2.a;	 Catch:{ all -> 0x00d7 }
        r10 = 0;
    L_0x00b4:
        if (r10 != 0) goto L_0x00c1;
    L_0x00b6:
        r11 = r8.c;	 Catch:{ all -> 0x00d7 }
        r11 = r11.b;	 Catch:{ all -> 0x00d7 }
        if (r11 != 0) goto L_0x00c1;
    L_0x00bc:
        r10 = r2.a(r0, r6);	 Catch:{ all -> 0x00d7 }
        goto L_0x00b4;
    L_0x00c1:
        if (r10 == r4) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00c5;
    L_0x00c4:
        r4 = 0;
    L_0x00c5:
        defpackage.oxz.b(r4);	 Catch:{ all -> 0x00d7 }
        r0 = r8.b;	 Catch:{ Exception -> 0x00de }
        defpackage.aeex.a(r0);	 Catch:{ Exception -> 0x00de }
        r0 = r7.b;
        r2 = r0 instanceof defpackage.ofj;
        if (r2 == 0) goto L_0x00ea;
    L_0x00d3:
        r6 = r0;
        r6 = (defpackage.ofj) r6;
        goto L_0x00ea;
    L_0x00d7:
        r0 = move-exception;
        r2 = r8.b;	 Catch:{ Exception -> 0x00de }
        defpackage.aeex.a(r2);	 Catch:{ Exception -> 0x00de }
        throw r0;	 Catch:{ Exception -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        r2 = "Exception loading ChunkIndex";
        defpackage.xtl.b(r2, r0);
        goto L_0x00ea;
    L_0x00e5:
        r0 = "Unable to sniff ChunkIndex extractor";
        defpackage.xtl.d(r0);
    L_0x00ea:
        r3.put(r9, r6);
    L_0x00ed:
        r0 = r1.e;
        r0 = r0.get(r9);
        r0 = (defpackage.ofj) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aefc.a(java.util.Set, java.lang.String):ofj");
    }

    private static aeew a(long j) {
        return new aeew(j, -1, -1, -1);
    }

    private final Set a() {
        List list = (List) this.b.get();
        oww oww = (oww) this.a.get();
        if (!list.isEmpty()) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(list);
            if (oww != null) {
                hashSet.add(oww);
            }
            return hashSet;
        } else if (oww != null) {
            return Collections.singleton(oww);
        } else {
            return Collections.emptySet();
        }
    }

    private static String a(Set set, String str, String str2) {
        String str3 = null;
        long j = Long.MIN_VALUE;
        for (oww c : set) {
            for (String str4 : c.c()) {
                if (str.equals(aeey.a(str4))) {
                    if (str2.equals(aeey.b(str4))) {
                        long c2 = aeey.c(str4);
                        if (str3 == null || c2 > j) {
                            str3 = str4;
                            j = c2;
                        }
                    }
                }
            }
        }
        return str3;
    }

    private static aeew a(Set set, String str, ofj ofj, long j) {
        ofj ofj2 = ofj;
        long j2 = j;
        TreeSet treeSet = new TreeSet();
        for (oww a : set) {
            NavigableSet<oxf> a2 = a.a(str);
            if (a2 != null) {
                for (oxf oxf : a2) {
                    aeev aeev = new aeev(aefc.a(ofj2, oxf.b), aefc.a(ofj2, oxf.b + oxf.c));
                    aeev aeev2 = new aeev(aeev.a, aeev.b);
                    long j3 = aeev.b;
                    TreeSet treeSet2 = new TreeSet(treeSet.subSet(aeev2, true, new aeev(j3, j3), true));
                    if (!treeSet2.isEmpty() && ((aeev) treeSet2.last()).b > aeev.b) {
                        treeSet2.remove(treeSet2.last());
                    }
                    treeSet.removeAll(treeSet2);
                    aeev aeev3 = (aeev) treeSet.floor(aeev);
                    aeev2 = (aeev) treeSet.ceiling(aeev);
                    Object obj = null;
                    if (aeev3 != null && aeev3.a(aeev)) {
                        obj = 1;
                    }
                    if (aeev.a(aeev2)) {
                        if (obj != null) {
                            aeev3.b = Math.max(aeev.b, aeev2.b);
                        } else {
                            aeev.b = Math.max(aeev.b, aeev2.b);
                            treeSet.add(aeev);
                        }
                        treeSet.remove(aeev2);
                    } else if (obj != null) {
                        aeev3.b = Math.max(aeev.b, aeev3.b);
                    } else {
                        treeSet.add(aeev);
                    }
                }
            }
        }
        aeev aeev4 = (aeev) treeSet.floor(new aeev(j2, 2147483647L));
        if (aeev4 != null) {
            long j4 = aeev4.b;
            if (j2 < j4) {
                int b = ofj2.b(j4);
                if (b == ofj2.a - 1 && aeev4.b == ofj2.e[b] + ofj2.d[b]) {
                    return new aeew(j, aefc.b(ofj, j), -2, aefc.b(ofj2, aeev4.b));
                }
                j4 = aefc.b(ofj, j);
                long j5 = aeev4.b;
                return new aeew(j, j4, j5, aefc.b(ofj2, j5));
            }
        }
        return new aeew(j, aefc.b(ofj, j), 0, -1);
    }

    private static long a(ofj ofj, long j) {
        int binarySearch = Arrays.binarySearch(ofj.c, j);
        if (binarySearch == -1) {
            return -1;
        }
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        }
        return ofj.e[binarySearch] + ((ofj.d[binarySearch] * (j - ofj.c[binarySearch])) / ((long) ofj.b[binarySearch]));
    }

    private static long b(ofj ofj, long j) {
        int b = ofj.b(j);
        return ofj.c[b] + ((((long) ofj.b[b]) * (j - ofj.e[b])) / ofj.d[b]);
    }
}
