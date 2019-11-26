package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bala */
public final class bala implements balf {
    private static Logger b = Logger.getLogger(bala.class.getName());
    public final HashMap a = new HashMap();
    private final Set c = new HashSet();
    private final Set d = new HashSet();
    private final HashMap e = new HashMap();
    private balc f;

    private static long a(long j, long j2) {
        return j2 != 0 ? bala.a(j2, j % j2) : j;
    }

    public final civ a(bakx bakx) {
        Iterator it;
        long[] jArr;
        int i;
        long j;
        int i2;
        bako bako;
        long size;
        baky baky;
        long j2;
        cis cjk;
        long j3;
        int i3;
        cis bank;
        Map map;
        bakx bakx2 = bakx;
        if (this.f == null) {
            this.f = new bale(bakx2);
        }
        Logger logger = b;
        Level level = Level.FINE;
        String valueOf = String.valueOf(bakx);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 15);
        stringBuilder.append("Creating movie ");
        stringBuilder.append(valueOf);
        String str = "com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder";
        logger.logp(level, str, "build", stringBuilder.toString());
        for (baky baky2 : bakx2.d) {
            List h = baky2.h();
            this.a.put(baky2, h);
            jArr = new long[h.size()];
            for (int i4 = 0; i4 < jArr.length; i4++) {
                jArr[i4] = ((bakz) h.get(i4)).a();
            }
            this.e.put(baky2, jArr);
        }
        bako bako2 = new bako();
        LinkedList linkedList = new LinkedList();
        String str2 = "isom";
        linkedList.add(str2);
        linkedList.add("iso2");
        linkedList.add("avc1");
        bako2.a(new cje(str2, 0, linkedList));
        Map hashMap = new HashMap();
        for (baky baky22 : bakx2.d) {
            jArr = this.f.a(baky22);
            int[] iArr = new int[jArr.length];
            i = 0;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    break;
                }
                j = jArr[i] - 1;
                i2 = i + 1;
                if (length == i2) {
                    bako = bako2;
                    size = (long) baky22.h().size();
                } else {
                    bako = bako2;
                    size = jArr[i2] - 1;
                }
                iArr[i] = bana.a(size - j);
                i = i2;
                bako2 = bako;
            }
            bako = bako2;
            hashMap.put(baky22, iArr);
        }
        bako = bako2;
        cis cjl = new cjl();
        cis cjo = new cjo();
        cjo.a(bakx2.c);
        cjo.b(bakx2.b);
        cjo.d = bakx2.a;
        size = bala.b(bakx);
        long j4 = 0;
        for (baky baky3 : bakx2.d) {
            j = (bala.a(baky3) * size) / baky3.k().b;
            if (j > j4) {
                j4 = j;
            }
        }
        cjo.a(j4);
        cjo.c = size;
        size = 0;
        for (baky baky4 : bakx2.d) {
            if (size < baky4.k().i) {
                size = baky4.k().i;
            }
        }
        cjo.e = size + 1;
        cjl.a(cjo);
        Iterator it2 = bakx2.d.iterator();
        while (it2.hasNext()) {
            cis cis;
            int i5;
            cis cis2;
            Iterator it3;
            ckg ckg;
            bako bako3;
            bako bako4;
            bako bako5;
            Map map2;
            String str3;
            baky baky5;
            baky baky6 = (baky) it2.next();
            ckg ckg2 = new ckg();
            cis ckf = new ckf();
            ckf.a(true);
            ckf.b(true);
            ckf.m = ckf.n() | 4;
            ckf.m = ckf.n() | 8;
            ckf.e = baky6.k().e;
            baky6.k();
            ckf.c = 0;
            ckf.a(baky6.k().d);
            ckf.a((bala.a(baky6) * bala.b(bakx)) / baky6.k().b);
            ckf.g = baky6.k().g;
            ckf.f = baky6.k().f;
            ckf.b = baky6.k().j;
            ckf.b(baky6.k().c);
            ckf.a = baky6.k().i;
            ckf.d = baky6.k().h;
            ckg2.a(ckf);
            if (baky6.f() == null || baky6.f().size() <= 0) {
                cis = null;
            } else {
                ckf = new cjc();
                ArrayList arrayList = new ArrayList();
                i5 = 0;
                for (baku baku : baky6.f()) {
                    double d = baku.b;
                    j2 = ((baky) bakx2.d.iterator().next()).k().b;
                    Iterator it4 = bakx2.d.iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = it4;
                        j2 = bakx.a(((baky) it4.next()).k().b, j2);
                        it4 = it5;
                    }
                    double d2 = (double) j2;
                    Double.isNaN(d2);
                    long round = Math.round(d * d2);
                    long j5 = (baku.c * baky6.k().b) / baku.a;
                    if (round >= 4294967296L || j5 > 2147483647L) {
                        i5 = 1;
                    }
                    arrayList.add(new cjb(ckf, round, j5, baku.d));
                }
                ckf.a = arrayList;
                ckf.l = i5;
                cis = new ciz();
                cis.a(ckf);
            }
            ckg2.a(cis);
            bako2 = new cjh();
            ckg2.a((cis) bako2);
            cjk = new cjk();
            cjk.a = baky6.k().d;
            cjk.b = baky6.k().c;
            cjk.d = baky6.e();
            cjk.c = baky6.k().b;
            cjk.e = baky6.k().a;
            bako2.a(cjk);
            cjk = new cjf();
            bako2.a(cjk);
            cjk.a = baky6.l();
            bako cjj = new cjj();
            if (baky6.l().equals("vide")) {
                cjj.a(new ckj());
            } else if (baky6.l().equals("soun")) {
                cjj.a(new cjv());
            } else if (baky6.l().equals("text")) {
                cjj.a(new cjn());
            } else if (baky6.l().equals("subt")) {
                cjj.a(new ckc());
            } else if (baky6.l().equals("hint")) {
                cjj.a(new cji());
            } else if (baky6.l().equals("sbtl")) {
                cjj.a(new cjn());
            }
            cis cix = new cix();
            cis cja = new cja();
            cix.a(cja);
            cis ciy = new ciy();
            ciy.m = 1;
            cja.a(ciy);
            cjj.a(cix);
            bako cju = new cju();
            cju.a(baky6.j());
            ArrayList arrayList2 = new ArrayList();
            long[] i6 = baky6.i();
            ckd ckd = null;
            int i7 = 0;
            int i8;
            for (i5 = i6.length; i7 < i5; i5 = i8) {
                long[] jArr2;
                cis2 = cjl;
                it3 = it2;
                j3 = i6[i7];
                if (ckd == null) {
                    jArr2 = i6;
                    i8 = i5;
                } else {
                    jArr2 = i6;
                    i8 = i5;
                    if (ckd.b == j3) {
                        ckd.a++;
                        i7++;
                        cjl = cis2;
                        it2 = it3;
                        i6 = jArr2;
                    }
                }
                ckd = new ckd(1, j3);
                arrayList2.add(ckd);
                i7++;
                cjl = cis2;
                it2 = it3;
                i6 = jArr2;
            }
            cis2 = cjl;
            it3 = it2;
            cjl = new cke();
            cjl.a = arrayList2;
            cju.a(cjl);
            List a = baky6.a();
            if (!(a == null || a.isEmpty())) {
                cjo = new cit();
                cjo.a = a;
                cju.a(cjo);
            }
            long[] b = baky6.b();
            if (b != null && b.length > 0) {
                cjo = new ckb();
                cjo.a = b;
                cju.a(cjo);
            }
            if (!(baky6.c() == null || baky6.c().isEmpty())) {
                cjl = new cjq();
                cjl.a = baky6.c();
                cju.a(cjl);
            }
            int[] iArr2 = (int[]) hashMap.get(baky6);
            cjo = new cjt();
            cjo.a = new LinkedList();
            long j6 = -2147483648L;
            int i9 = 0;
            while (i9 < iArr2.length) {
                j = (long) iArr2[i9];
                if (j6 == j) {
                    ckg = ckg2;
                    bako3 = bako2;
                } else {
                    ckg = ckg2;
                    bako3 = bako2;
                    cjo.a.add(new cjw((long) (i9 + 1), j, 1));
                    j6 = (long) iArr2[i9];
                }
                i9++;
                ckg2 = ckg;
                bako2 = bako3;
            }
            ckg = ckg2;
            bako3 = bako2;
            cju.a(cjo);
            cjl = new cjr();
            cjl.a = (long[]) this.e.get(baky6);
            cju.a(cjl);
            iArr2 = (int[]) hashMap.get(baky6);
            cjy cjy = new cjy();
            this.c.add(cjy);
            long[] jArr3 = new long[iArr2.length];
            String str4 = "Calculating chunk offsets for track_";
            String str5 = "createStco";
            if (b.isLoggable(Level.FINE)) {
                Logger logger2 = b;
                Level level2 = Level.FINE;
                j = baky6.k().i;
                bako4 = cjj;
                bako5 = cju;
                StringBuilder stringBuilder2 = new StringBuilder(56);
                stringBuilder2.append(str4);
                stringBuilder2.append(j);
                logger2.logp(level2, str, str5, stringBuilder2.toString());
            } else {
                bako4 = cjj;
                bako5 = cju;
            }
            int i10 = 0;
            long j7 = 0;
            while (i10 < iArr2.length) {
                long j8;
                int[] iArr3;
                cjy cjy2;
                String str6;
                if (b.isLoggable(Level.FINER)) {
                    Logger logger3 = b;
                    Level level3 = Level.FINER;
                    j8 = j7;
                    j7 = baky6.k().i;
                    iArr3 = iArr2;
                    StringBuilder stringBuilder3 = new StringBuilder(74);
                    stringBuilder3.append(str4);
                    stringBuilder3.append(j7);
                    stringBuilder3.append(" chunk ");
                    stringBuilder3.append(i10);
                    logger3.logp(level3, str, str5, stringBuilder3.toString());
                } else {
                    iArr3 = iArr2;
                    j8 = j7;
                }
                it = bakx2.d.iterator();
                j7 = j8;
                while (it.hasNext()) {
                    Iterator it6;
                    baky4 = (baky) it.next();
                    if (b.isLoggable(Level.FINEST)) {
                        Logger logger4 = b;
                        Level level4 = Level.FINEST;
                        it6 = it;
                        cjy2 = cjy;
                        j3 = baky4.k().i;
                        str6 = str4;
                        StringBuilder stringBuilder4 = new StringBuilder(44);
                        stringBuilder4.append("Adding offsets of track_");
                        stringBuilder4.append(j3);
                        logger4.logp(level4, str, str5, stringBuilder4.toString());
                    } else {
                        it6 = it;
                        cjy2 = cjy;
                        str6 = str4;
                    }
                    iArr2 = (int[]) hashMap.get(baky4);
                    int i11 = 0;
                    j2 = 0;
                    while (i11 < i10) {
                        j2 += (long) iArr2[i11];
                        i11++;
                        hashMap = hashMap;
                    }
                    map2 = hashMap;
                    if (baky4 == baky6) {
                        jArr3[i10] = j7;
                    }
                    i11 = bana.a(j2);
                    while (true) {
                        str3 = str;
                        baky5 = baky6;
                        if (((long) i11) >= ((long) iArr2[i10]) + j2) {
                            break;
                        }
                        j7 += ((long[]) this.e.get(baky4))[i11];
                        i11++;
                        str = str3;
                        baky6 = baky5;
                    }
                    bakx2 = bakx;
                    hashMap = map2;
                    it = it6;
                    cjy = cjy2;
                    str4 = str6;
                    str = str3;
                    baky6 = baky5;
                }
                cjy2 = cjy;
                map2 = hashMap;
                str3 = str;
                baky5 = baky6;
                str6 = str4;
                i10++;
                bakx2 = bakx;
                iArr2 = iArr3;
            }
            cjl = cjy;
            map2 = hashMap;
            str3 = str;
            baky5 = baky6;
            cjl.a = jArr3;
            cjo = bako5;
            cjo.a(cjl);
            HashMap hashMap2 = new HashMap();
            for (Entry entry : baky5.g().entrySet()) {
                str = ((bamr) entry.getKey()).a();
                List list = (List) hashMap2.get(str);
                if (list == null) {
                    list = new ArrayList();
                    hashMap2.put(str, list);
                }
                list.add((bamr) entry.getKey());
            }
            for (Entry entry2 : hashMap2.entrySet()) {
                cis bamv = new bamv();
                str = (String) entry2.getKey();
                bamv.a = (List) entry2.getValue();
                cis bamu = new bamu();
                bamu.a = str;
                bamx bamx = null;
                for (i3 = 0; i3 < baky5.h().size(); i3++) {
                    i2 = 0;
                    for (i10 = 0; i10 < ((List) entry2.getValue()).size(); i10++) {
                        if (Arrays.binarySearch((long[]) baky5.g().get((bamr) ((List) entry2.getValue()).get(i10)), (long) i3) >= 0) {
                            i2 = i10 + 1;
                        }
                    }
                    if (bamx != null && bamx.b == i2) {
                        bamx.a++;
                    } else {
                        bamx = new bamx(1, i2);
                        bamu.b.add(bamx);
                    }
                }
                cjo.a(bamv);
                cjo.a(bamu);
            }
            baky baky7 = baky5;
            if (baky7 instanceof balm) {
                balm balm = (balm) baky7;
                hashMap = map2;
                iArr2 = (int[]) hashMap.get(baky7);
                bank = new bank();
                bank.d = "cenc";
                bank.m = 1;
                List m = balm.m();
                if (balm.n()) {
                    short[] sArr = new short[m.size()];
                    i2 = 0;
                    while (true) {
                        i = sArr.length;
                        if (i2 >= i) {
                            break;
                        }
                        sArr[i2] = (short) ((banq) m.get(i2)).a();
                        i2++;
                    }
                    bank.b = Arrays.copyOf(sArr, i);
                } else {
                    bank.a = (short) 8;
                    bank.c = balm.h().size();
                }
                cjk = new banl();
                cja = new balw();
                if (balm.n()) {
                    cja.m = cja.n() | 2;
                } else {
                    cja.m = cja.n() & 16777213;
                }
                cja.b = m;
                j7 = (long) (((cja.d() > 4294967296L ? 16 : 8) + (cja.a() ? cja.a.length + 4 : 0)) + 4);
                jArr = new long[iArr2.length];
                i7 = 0;
                for (i10 = 0; i10 < iArr2.length; i10++) {
                    jArr[i10] = j7;
                    i9 = 0;
                    while (i9 < iArr2[i10]) {
                        j7 += (long) ((banq) m.get(i7)).a();
                        i9++;
                        i7++;
                        hashMap = hashMap;
                        baky7 = baky7;
                    }
                    map = hashMap;
                    baky5 = baky7;
                }
                map = hashMap;
                baky5 = baky7;
                cjk.a = jArr;
                cjo.a(bank);
                cjo.a(cjk);
                cjo.a(cja);
                this.d.add(cjk);
            } else {
                baky5 = baky7;
                map = map2;
            }
            if (baky5.d() != null) {
                cjo.a(baky5.d());
            }
            cjl = bako4;
            cjl.a(cjo);
            bako3.a(cjl);
            cjl = cis2;
            cjl.a((cis) ckg);
            bakx2 = bakx;
            hashMap = map;
            it2 = it3;
            str = str3;
        }
        map = hashMap;
        bako bako6 = bako;
        bako6.a(cjl);
        long j9 = 0;
        for (cjr cjr : bani.a(cjl, "trak/mdia/minf/stbl/stsz", false)) {
            long j10 = 0;
            for (long j22 : cjr.a) {
                j10 += j22;
            }
            j9 += j10;
        }
        bald bald = new bald(this, bakx, map, j9);
        bako6.a((cis) bald);
        j3 = 16;
        bald c;
        while (c instanceof cis) {
            bank = c;
            for (Object obj : bank.c().b()) {
                if (c == obj) {
                    break;
                }
                j3 += obj.d();
            }
            c = bank.c();
        }
        for (cjy cjy3 : this.c) {
            long[] jArr4 = cjy3.a;
            for (i3 = 0; i3 < jArr4.length; i3++) {
                jArr4[i3] = jArr4[i3] + j3;
            }
        }
        for (banl banl : this.d) {
            long d3 = banl.d() + 44;
            bank = banl;
            while (true) {
                civ c2 = bank.c();
                for (cis cjk2 : c2.b()) {
                    if (cjk2 == bank) {
                        break;
                    }
                    d3 += cjk2.d();
                }
                if (!(c2 instanceof cis)) {
                    break;
                }
                Object obj2 = c2;
            }
            long[] jArr5 = banl.a;
            for (int i12 = 0; i12 < jArr5.length; i12++) {
                jArr5[i12] = jArr5[i12] + d3;
            }
            banl.a = jArr5;
        }
        return bako6;
    }

    private static long a(baky baky) {
        List<baku> f = baky.f();
        if (f == null || f.size() <= 0) {
            return baky.e();
        }
        double d = 0.0d;
        for (baku baku : f) {
            d += baku.b;
        }
        double d2 = (double) baky.k().b;
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    private static long b(bakx bakx) {
        long j = ((baky) bakx.d.iterator().next()).k().b;
        for (baky k : bakx.d) {
            j = bala.a(k.k().b, j);
        }
        return j;
    }
}
