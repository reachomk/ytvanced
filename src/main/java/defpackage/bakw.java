package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: bakw */
public final class bakw extends bakv {
    public List d;
    public List e;
    public balb f;
    private List g;
    private cjs h;
    private long[] i;
    private long[] j;
    private List k;
    private String l;
    private cjx m = null;

    public bakw(String str, ckg ckg, cil... cilArr) {
        Iterator it;
        bakw bakw = this;
        bakm bakm = ckg;
        super(str);
        int i = 0;
        bakw.j = new long[0];
        bakw.f = new balb();
        long j = ckg.a().a;
        bakw.g = new ckw(bakm, cilArr);
        bakm a = ckg.h().a().a();
        bakw.l = ckg.h().h().a;
        bakw.d = new ArrayList();
        bakw.e = new ArrayList();
        bakw.k = new ArrayList();
        bakw.d.addAll(a.i().a);
        if (a.k() != null) {
            bakw.e.addAll(a.k().a);
        }
        if (a.l() != null) {
            bakw.k.addAll(a.l().a);
        }
        if (a.j() != null) {
            bakw.j = a.j().a;
        }
        String str2 = "subs";
        bakw.m = (cjx) bani.a(a, str2);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((cis) bakm.e).c().a(cko.class));
        bakw.h = a.a();
        List a2 = bakm.e.a(ckl.class);
        if (a2.size() > 0) {
            long j2;
            Iterator it2 = a2.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((ckl) it2.next()).a(ckq.class).iterator();
                while (it3.hasNext()) {
                    ckq ckq = (ckq) it3.next();
                    if (ckq.a == j) {
                        int i2;
                        if (bani.a(((cis) bakm.e).c(), "/moof/traf/subs").size() > 0) {
                            bakw.m = new cjx();
                        }
                        LinkedList<Long> linkedList = new LinkedList();
                        int size = arrayList.size();
                        int i3 = 0;
                        long j3 = 1;
                        while (i3 < size) {
                            Iterator it4;
                            it = ((cko) arrayList.get(i3)).a(ckp.class).iterator();
                            while (true) {
                                i2 = i3 + 1;
                                if (!it.hasNext()) {
                                    break;
                                }
                                bakm bakm2 = (ckp) it.next();
                                int i4 = i3;
                                ckg ckg2;
                                if (bakm2.a().a == j) {
                                    Iterator it5;
                                    Iterator it6;
                                    String str3;
                                    cjx cjx = (cjx) bani.a(bakm2, str2);
                                    if (cjx != null) {
                                        long j4 = j3 - 1;
                                        for (cka cka : cjx.a) {
                                            it5 = it;
                                            cka cka2 = new cka();
                                            it6 = it2;
                                            str3 = str2;
                                            cka2.b.addAll(cka.b);
                                            if (j4 != 0) {
                                                cka2.a = j4 + cka.a;
                                                j4 = 0;
                                            } else {
                                                cka2.a = cka.a;
                                            }
                                            bakw.m.a.add(cka2);
                                            it = it5;
                                            it2 = it6;
                                            str2 = str3;
                                        }
                                    }
                                    it5 = it;
                                    it6 = it2;
                                    str3 = str2;
                                    it = bakm2.a(ckr.class).iterator();
                                    while (it.hasNext()) {
                                        ckr ckr = (ckr) it.next();
                                        cks a3 = ((ckp) ckr.j).a();
                                        Iterator it7 = ckr.c.iterator();
                                        Object obj = 1;
                                        while (it7.hasNext()) {
                                            Iterator it8;
                                            int i5;
                                            Iterator it9;
                                            List list;
                                            ckn ckn;
                                            cku cku = (cku) it7.next();
                                            if (ckr.i()) {
                                                it8 = it;
                                                if (bakw.d.size() != 0) {
                                                    List list2 = bakw.d;
                                                    it4 = it3;
                                                    i5 = size;
                                                    it9 = it7;
                                                    if (((ckd) list2.get(list2.size() - 1)).b != cku.a) {
                                                        j2 = j;
                                                    } else {
                                                        list = bakw.d;
                                                        ckd ckd = (ckd) list.get(list.size() - 1);
                                                        j2 = j;
                                                        ckd.a++;
                                                    }
                                                } else {
                                                    j2 = j;
                                                    it4 = it3;
                                                    i5 = size;
                                                    it9 = it7;
                                                }
                                                bakw.d.add(new ckd(1, cku.a));
                                            } else {
                                                it8 = it;
                                                j2 = j;
                                                it4 = it3;
                                                i5 = size;
                                                it9 = it7;
                                                if ((a3.n() & 8) != 0) {
                                                    bakw.d.add(new ckd(1, a3.c));
                                                } else {
                                                    bakw.d.add(new ckd(1, ckq.b));
                                                }
                                            }
                                            if (ckr.k()) {
                                                if (bakw.e.size() != 0) {
                                                    list = bakw.e;
                                                    if (((long) ((ciw) list.get(list.size() - 1)).b) == cku.d) {
                                                        list = bakw.e;
                                                        ciw ciw = (ciw) list.get(list.size() - 1);
                                                        ciw.a++;
                                                    }
                                                }
                                                bakw.e.add(new ciw(1, bana.a(cku.d)));
                                            }
                                            if (ckr.j()) {
                                                ckn = cku.c;
                                            } else if (obj != null && (ckr.n() & 4) == 4) {
                                                ckn = ckr.b;
                                            } else if ((a3.n() & 32) != 0) {
                                                ckn = a3.e;
                                            } else {
                                                ckn = ckq.d;
                                            }
                                            if (!(ckn == null || ckn.a)) {
                                                linkedList.add(Long.valueOf(j3));
                                            }
                                            j3++;
                                            ckg2 = ckg;
                                            size = i5;
                                            it = it8;
                                            it7 = it9;
                                            it3 = it4;
                                            j = j2;
                                            obj = null;
                                        }
                                        it4 = it3;
                                        ckg2 = ckg;
                                    }
                                    it4 = it3;
                                    ckg2 = ckg;
                                    i3 = i4;
                                    it = it5;
                                    it2 = it6;
                                    str2 = str3;
                                } else {
                                    it4 = it3;
                                    ckg2 = ckg;
                                    i3 = i4;
                                }
                            }
                            it4 = it3;
                            bakm = ckg;
                            i3 = i2;
                            i = 0;
                        }
                        long[] jArr = bakw.j;
                        size = jArr.length;
                        bakw.j = new long[(linkedList.size() + size)];
                        System.arraycopy(jArr, i, bakw.j, i, size);
                        for (Long longValue : linkedList) {
                            i2 = size + 1;
                            bakw.j[size] = longValue.longValue();
                            size = i2;
                        }
                    } else {
                        bakm = ckg;
                    }
                }
                bakm = ckg;
            }
            j2 = j;
            ArrayList arrayList2 = new ArrayList();
            arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            i = 0;
            while (i < size2) {
                int i6;
                Iterator it10 = ((cko) arrayList.get(i)).a(ckp.class).iterator();
                while (true) {
                    i6 = i + 1;
                    if (!it10.hasNext()) {
                        break;
                    }
                    civ civ = (ckp) it10.next();
                    if (civ.a().a == j2) {
                        bakw.c = bakw.a(bani.a(civ, "sgpd"), bani.a(civ, "sbgp"), bakw.c);
                    }
                }
                i = i6;
            }
        } else {
            bakw.c = bakw.a(a.a(bamv.class), a.a(bamu.class), bakw.c);
        }
        bakw.i = cke.a(bakw.d);
        cjk g = ckg.h().g();
        ckf a4 = ckg.a();
        balb balb = bakw.f;
        balb.i = a4.a;
        balb.d = g.a;
        balb.a = g.e;
        balb.c = g.b;
        balb.b = g.c;
        balb.g = a4.g;
        balb.f = a4.f;
        balb.j = a4.b;
        balb.e = a4.e;
        bakm bakm3 = ckg;
        cjc cjc = (cjc) bani.a(bakm3, "edts/elst");
        cjo cjo = (cjo) bani.a(bakm3, "../mvhd");
        if (cjc != null) {
            for (cjb cjb : cjc.a) {
                List list3 = bakw.b;
                long j5 = cjb.c;
                long j6 = g.c;
                double d = cjb.d;
                double d2 = (double) cjb.b;
                cjk cjk = g;
                double d3 = (double) cjo.c;
                Double.isNaN(d2);
                Double.isNaN(d3);
                list3.add(new baku(j5, j6, d, d2 / d3));
                bakw = this;
                g = cjk;
            }
        }
    }

    private static Map a(List list, List list2, Map map) {
        Map map2 = map;
        for (bamv bamv : list) {
            Object obj = null;
            for (bamu bamu : list2) {
                if (bamu.a.equals(((bamr) bamv.a.get(0)).a())) {
                    int i = 0;
                    for (bamx bamx : bamu.b) {
                        int i2 = bamx.b;
                        if (i2 > 0) {
                            bamr bamr = (bamr) bamv.a.get(i2 - 1);
                            Object obj2 = (long[]) map2.get(bamr);
                            if (obj2 == null) {
                                obj2 = new long[0];
                            }
                            int a = bana.a(bamx.a);
                            int length = obj2.length;
                            long[] jArr = new long[(a + length)];
                            System.arraycopy(obj2, 0, jArr, 0, length);
                            for (length = 0; ((long) length) < bamx.a; length++) {
                                jArr[obj2.length + length] = (long) (i + length);
                            }
                            map2.put(bamr, jArr);
                        }
                        i = (int) (((long) i) + bamx.a);
                    }
                    obj = 1;
                }
            }
            if (obj == null) {
                String a2 = ((bamr) bamv.a.get(0)).a();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(a2).length() + 37);
                stringBuilder.append("Could not find SampleToGroupBox for ");
                stringBuilder.append(a2);
                stringBuilder.append(".");
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        return map2;
    }

    public final void close() {
        bakm bakm = null;
        civ civ = bakm.e;
        if (civ instanceof bako) {
            ((bako) civ).close();
        }
        int length = bakm.length;
        for (int i = 0; i < length; i++) {
            bakm.close();
        }
    }

    public final List h() {
        return this.g;
    }

    public final synchronized long[] i() {
        return this.i;
    }

    public final cjs j() {
        return this.h;
    }

    public final List a() {
        return this.e;
    }

    public final long[] b() {
        if (this.j.length == this.g.size()) {
            return null;
        }
        return this.j;
    }

    public final List c() {
        return this.k;
    }

    public final balb k() {
        return this.f;
    }

    public final String l() {
        return this.l;
    }

    public final cjx d() {
        return this.m;
    }
}
