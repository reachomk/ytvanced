package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: ubf */
public final class ubf {
    public static boolean a(ubb ubb) {
        return (ubb instanceof uax) ^ 1;
    }

    public static ubn a(ubl ubl) {
        return ube.a(ubl, Collections.emptyList(), Arrays.asList(new String[]{"java.lang.Class"}), Collections.emptyList());
    }

    public static bccq a(ubn ubn, ubl ubl) {
        uax uax;
        bcch bcch;
        int i;
        bcck bcck;
        bccm bccm;
        int b;
        bccj bccj;
        bcci bcci;
        bccf bccf;
        int a;
        ubu ubu;
        ubu ubu2;
        ubw ubw;
        List a2;
        int b2;
        ubn ubn2 = ubn;
        ubl ubl2 = ubl;
        bccp bccp = (bccp) bccq.h.createBuilder();
        ArrayList arrayList = new ArrayList(ubn2.a.b);
        ubs ubs = new ubs();
        ubw b3 = ubn2.a.b();
        while (b3.a()) {
            uax = (uax) b3.b;
            ubs.a(b3.a, arrayList.size());
            bcck bcck2 = (bcck) bcch.f.createBuilder();
            String c = uax.c(ubl2);
            bcck2.copyOnWrite();
            bcch = (bcch) bcck2.instance;
            if (c != null) {
                bcch.a |= 2;
                bcch.c = c;
                i = uax.i;
                bcck2.copyOnWrite();
                bcch bcch2 = (bcch) bcck2.instance;
                bcch2.a |= 4;
                bcch2.e = i;
                arrayList.add((bcch) ((anxl) bcck2.build()));
                ubn2 = ubn;
            } else {
                throw new NullPointerException();
            }
        }
        ubw b4 = ubn2.a.b();
        while (b4.a()) {
            uax = (uax) b4.b;
            int b5 = ubs.b(b4.a);
            bcck = (bcck) ((anxo) ((bcch) arrayList.get(b5)).toBuilder());
            uax = uax.g;
            if (uax != null) {
                i = ubs.b(uax.e(ubl2));
                bcck.copyOnWrite();
                bcch = (bcch) bcck.instance;
                bcch.a |= 1;
                bcch.b = i + 1;
            } else {
                bcck.copyOnWrite();
                bcch bcch3 = (bcch) bcck.instance;
                bcch3.a &= -2;
                bcch3.b = 0;
            }
            arrayList.set(b5, (bcch) ((anxl) bcck.build()));
            ubn2 = ubn;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b3 = ubn2.b.b();
        while (b3.a()) {
            Object obj = b3.b;
            if (obj instanceof uba) {
                ubs.a(b3.a, arrayList2.size());
                bccm = (bccm) bccj.d.createBuilder();
                b = ubs.b(((uba) b3.b).a.e(ubl2));
                bccm.copyOnWrite();
                bccj = (bccj) bccm.instance;
                bccj.a |= 1;
                bccj.b = b + 1;
                arrayList2.add((bccj) ((anxl) bccm.build()));
            } else if (obj instanceof uay) {
                ubs.a(b3.a, arrayList3.size());
                bcci = (bcci) bccf.d.createBuilder();
                b = ubs.b(((uay) b3.b).a.e(ubl2));
                bcci.copyOnWrite();
                bccf = (bccf) bcci.instance;
                bccf.a |= 1;
                bccf.b = b + 1;
                arrayList3.add((bccf) ((anxl) bcci.build()));
            } else if (obj instanceof ubg) {
                ubs.a(b3.a, ((bccq) bccp.instance).e.size());
                ubg ubg = (ubg) b3.b;
                bccr bccr = (bccr) bccs.d.createBuilder();
                a = ubg.a(ubl2);
                bccr.copyOnWrite();
                bccs bccs = (bccs) bccr.instance;
                bccs.a |= 2;
                bccs.c = a;
                b = bccu.a(ubg.c(ubl2));
                if (b != 0) {
                    bccr.copyOnWrite();
                    bccs bccs2 = (bccs) bccr.instance;
                    bccs2.a |= 1;
                    bccs2.b = b;
                }
                bccs bccs3 = (bccs) ((anxl) bccr.build());
                bccp.copyOnWrite();
                bccq bccq = (bccq) bccp.instance;
                if (bccs3 != null) {
                    if (!bccq.e.a()) {
                        bccq.e = anxl.mutableCopy(bccq.e);
                    }
                    bccq.e.add(bccs3);
                } else {
                    throw new NullPointerException();
                }
            } else {
                continue;
            }
        }
        ubu ubu3 = ubn2.a;
        ubu ubu4 = ubn2.b;
        ubw b6 = ubu4.b();
        while (b6.a()) {
            ubu = ubu4;
            ubu2 = ubu3;
            ubb ubb = (ubb) b6.b;
            if (ubb instanceof ubg) {
                ubn2 = ubn;
                ubu4 = ubu;
                ubu3 = ubu2;
            } else {
                ubw = b6;
                a2 = ubf.a(ubl, ubs, ubu, ubu2, ubb, arrayList.size(), arrayList2.size(), arrayList3.size());
                b = ubs.b(ubw.a);
                if (b >= 0) {
                    if (ubb instanceof uba) {
                        bccm = (bccm) ((anxo) ((bccj) arrayList2.get(b)).toBuilder());
                        bccm.copyOnWrite();
                        ((bccj) bccm.instance).c = anxl.emptyIntList();
                        bccm.copyOnWrite();
                        bccj = (bccj) bccm.instance;
                        if (!bccj.c.a()) {
                            bccj.c = anxl.mutableCopy(bccj.c);
                        }
                        anvf.addAll(a2, bccj.c);
                        arrayList2.set(b, (bccj) ((anxl) bccm.build()));
                    } else if (ubb instanceof uay) {
                        bcci = (bcci) ((anxo) ((bccf) arrayList3.get(b)).toBuilder());
                        bcci.copyOnWrite();
                        ((bccf) bcci.instance).c = anxl.emptyIntList();
                        bcci.copyOnWrite();
                        bccf = (bccf) bcci.instance;
                        if (!bccf.c.a()) {
                            bccf.c = anxl.mutableCopy(bccf.c);
                        }
                        anvf.addAll(a2, bccf.c);
                        arrayList3.set(b, (bccf) ((anxl) bcci.build()));
                    }
                }
                b6 = ubw;
                ubu4 = ubu;
                ubu3 = ubu2;
                ubn2 = ubn;
            }
        }
        b6 = ubu3.b();
        while (b6.a()) {
            ubb ubb2 = (ubb) b6.b;
            int size = arrayList.size();
            ubw ubw2 = b6;
            int i2 = size;
            ubu = ubu4;
            int size2 = arrayList2.size();
            ubu2 = ubu3;
            a2 = ubf.a(ubl, ubs, ubu4, ubu3, ubb2, i2, size2, arrayList3.size());
            b = ubs.b(ubw2.a);
            bcck = (bcck) ((anxo) ((bcch) arrayList.get(b)).toBuilder());
            bcck.copyOnWrite();
            ((bcch) bcck.instance).d = anxl.emptyIntList();
            bcck.copyOnWrite();
            bcch = (bcch) bcck.instance;
            if (!bcch.d.a()) {
                bcch.d = anxl.mutableCopy(bcch.d);
            }
            anvf.addAll(a2, bcch.d);
            arrayList.set(b, (bcch) ((anxl) bcck.build()));
            b6 = ubw2;
            ubu4 = ubu;
            ubu3 = ubu2;
        }
        ubu ubu5 = new ubu();
        for (ubb ubb3 : r0.c) {
            b2 = ubs.b(ubb3.e(ubl2));
            if (ubb3 instanceof uax) {
                b2++;
            } else {
                if (ubb3 instanceof uba) {
                    a = arrayList.size() + 1;
                } else {
                    int size3;
                    if (ubb3 instanceof uay) {
                        a = arrayList.size() + 1;
                        size3 = arrayList2.size();
                    } else if (ubb3 instanceof ubg) {
                        a = (arrayList.size() + 1) + arrayList2.size();
                        size3 = arrayList3.size();
                    }
                    a += size3;
                }
                b2 += a;
            }
            if (!ubu5.c(ubb3.p)) {
                ubu5.a(ubb3.p, new ArrayList());
            }
            ((List) ubu5.b(ubb3.p)).add(Integer.valueOf(b2));
        }
        bccp.copyOnWrite();
        bccq bccq2 = (bccq) bccp.instance;
        if (!bccq2.b.a()) {
            bccq2.b = anxl.mutableCopy(bccq2.b);
        }
        anvf.addAll(arrayList, bccq2.b);
        bccp.copyOnWrite();
        bccq2 = (bccq) bccp.instance;
        if (!bccq2.c.a()) {
            bccq2.c = anxl.mutableCopy(bccq2.c);
        }
        anvf.addAll(arrayList2, bccq2.c);
        bccp.copyOnWrite();
        bccq2 = (bccq) bccp.instance;
        if (!bccq2.d.a()) {
            bccq2.d = anxl.mutableCopy(bccq2.d);
        }
        anvf.addAll(arrayList3, bccq2.d);
        ubw = ubu5.b();
        while (ubw.a()) {
            bccv bccv = (bccv) bccw.d.createBuilder();
            b = bccy.a(ubw.a);
            if (b != 0) {
                bccv.copyOnWrite();
                bccw bccw = (bccw) bccv.instance;
                bccw.a |= 1;
                bccw.b = b - 1;
            }
            for (b = 0; b < ((List) ubw.b).size(); b++) {
                b2 = ((Integer) ((List) ubw.b).get(b)).intValue();
                bccv.copyOnWrite();
                bccw bccw2 = (bccw) bccv.instance;
                if (!bccw2.c.a()) {
                    bccw2.c = anxl.mutableCopy(bccw2.c);
                }
                bccw2.c.d(b2);
            }
            bccp.copyOnWrite();
            bccq bccq3 = (bccq) bccp.instance;
            if (!bccq3.f.a()) {
                bccq3.f = anxl.mutableCopy(bccq3.f);
            }
            bccq3.f.add((bccw) ((anxl) bccv.build()));
        }
        return (bccq) ((anxl) bccp.build());
    }

    private static List a(ubl ubl, ubs ubs, ubu ubu, ubu ubu2, ubb ubb, int i, int i2, int i3) {
        int a = ubb.a(ubl);
        ArrayList arrayList = new ArrayList(a);
        for (int i4 = 0; i4 < a; i4++) {
            int a2 = ubb.a(ubl, i4);
            if (a2 != 0) {
                ubb ubb2 = (ubb) ubu.b(a2);
                if (ubb2 == null) {
                    ubb2 = (ubb) ubu2.b(a2);
                }
                a2 = ubs.b(a2);
                if (!(ubb2 == null || a2 == -1)) {
                    if (ubb2 instanceof uax) {
                        arrayList.add(Integer.valueOf(a2 + 1));
                    } else if (ubb2 instanceof uba) {
                        arrayList.add(Integer.valueOf((a2 + i) + 1));
                    } else if (ubb2 instanceof uay) {
                        arrayList.add(Integer.valueOf(((a2 + i) + i2) + 1));
                    } else if (ubb2 instanceof ubg) {
                        arrayList.add(Integer.valueOf((((a2 + i) + i2) + i3) + 1));
                    }
                }
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static void b(ubn ubn, ubl ubl) {
        String str;
        ubi.a(ubl, ubn);
        ubw b = ubn.b.b();
        while (true) {
            str = "app";
            if (!b.a()) {
                break;
            }
            ubb ubb = (ubb) b.b;
            if (ubb.l == null) {
                if ((ubb.o & 1) == 0) {
                    ubn.b.a(b.a);
                }
            } else if (ubb.q.equals(str)) {
                ubb = ((ubb) b.b).l;
                if (!((ubb instanceof uax) || ubb.q.equals(str))) {
                    ubb ubb2 = (ubb) b.b;
                    ubb2.p = 255;
                    ubb2.o |= 1;
                    ubn.c.add(ubb2);
                }
            }
        }
        b = ubn.b.b();
        while (b.a()) {
            if (!((ubb) b.b).q.equals(str)) {
                ubn.b.a(b.a);
            }
        }
        Iterator it = ubn.c.iterator();
        while (it.hasNext()) {
            String str2 = ((ubb) it.next()).q;
            if (!(str2 == null || str2.equals(str))) {
                it.remove();
            }
        }
    }
}
