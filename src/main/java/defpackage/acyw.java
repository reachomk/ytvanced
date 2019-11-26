package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: acyw */
public final class acyw {
    public final boolean A;
    public final Set a;
    public final Set b;
    public final int c;
    public final Set d;
    public final Set e;
    public final autl f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final adkl m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final long u;
    public final int v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final String z;

    public acyw(ausm ausm, adok adok) {
        autl autl;
        ausm ausm2 = ausm;
        adok adok2 = adok;
        this.a = amuw.a(ausm2.b);
        this.b = amuw.a(ausm2.e);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        auso auso = ausm2.c;
        if (auso == null) {
            auso = auso.d;
        }
        if ((auso.a & 4) != 0) {
            auso = ausm2.c;
            if (auso == null) {
                auso = auso.d;
            }
            ausc ausc = auso.c;
            if (ausc == null) {
                ausc = ausc.D;
            }
            this.g = ausc.d;
            this.h = ausc.c;
            this.i = ausc.e;
            this.j = ausc.f;
            this.c = ausc.j;
            this.k = ausc.g;
            anyd anyd = ausc.h;
            int i = 5;
            if (anyd.isEmpty()) {
                Collection arrayList;
                if (adir.a(adok2.a)) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList();
                    ausp ausp = (ausp) ausq.g.createBuilder();
                    ausp.e(2);
                    ausp.a(150);
                    ausp.c(10);
                    ausp.d(1500);
                    ausp.b(adok.b(7));
                    arrayList.add((ausq) ((anxl) ausp.build()));
                    ausp = (ausp) ausq.g.createBuilder();
                    ausp.e(4);
                    ausp.a(200);
                    ausp.c(5);
                    ausp.d(3000);
                    ausp.b(adok.b(44));
                    arrayList.add((ausq) ((anxl) ausp.build()));
                }
                hashSet.addAll(arrayList);
            } else {
                hashSet.addAll(anyd);
            }
            auso auso2 = ausm2.c;
            if (auso2 == null) {
                auso2 = auso.d;
            }
            ausc ausc2 = auso2.c;
            if (ausc2 == null) {
                ausc2 = ausc.D;
            }
            anyd = ausc2.i;
            if (anyd.isEmpty()) {
                Collection arrayList2;
                if (adir.a(adok2.a)) {
                    arrayList2 = new ArrayList();
                } else {
                    arrayList2 = new ArrayList();
                    int i2 = 0;
                    while (i2 < i) {
                        int i3 = i2 != 0 ? 4 : 3;
                        int pow = i2 != 0 ? (int) (Math.pow(2.0d, (double) (i2 - 1)) * 30.0d) : 0;
                        int i4 = i2 + i2;
                        ausr ausr = (ausr) auss.d.createBuilder();
                        adok.a(ausr, i3, i4, pow);
                        adok.a(ausr);
                        arrayList2.add((auss) ((anxl) ausr.build()));
                        ausr = (ausr) auss.d.createBuilder();
                        adok.a(ausr, i3, i4, pow);
                        adok.b(ausr);
                        arrayList2.add((auss) ((anxl) ausr.build()));
                        i4 = i2 + 1;
                        int i5 = (i4 + i4) - 1;
                        ausr ausr2 = (ausr) auss.d.createBuilder();
                        adok.a(ausr2, 3, i5, 7);
                        adok.a(ausr2);
                        arrayList2.add((auss) ((anxl) ausr2.build()));
                        ausr2 = (ausr) auss.d.createBuilder();
                        adok.a(ausr2, 3, i5, 7);
                        adok.b(ausr2);
                        arrayList2.add((auss) ((anxl) ausr2.build()));
                        ausr = adok.a(i2);
                        adok.a(ausr);
                        arrayList2.add((auss) ((anxl) ausr.build()));
                        ausr = adok.a(i2);
                        adok.b(ausr);
                        arrayList2.add((auss) ((anxl) ausr.build()));
                        i2 = i4;
                        i = 5;
                    }
                }
                hashSet2.addAll(arrayList2);
            } else {
                hashSet2.addAll(anyd);
            }
            this.l = ausc.k;
            boolean z = ausc.m;
            this.m = adkl.c().a(ausc.l > 0).b(ausc.o).a();
            this.n = ausc.n;
            this.o = ausc.q;
            this.p = ausc.r;
            this.r = ausc.t;
            this.q = ausc.s;
            this.s = ausc.p;
            this.t = ausc.u;
            this.u = TimeUnit.MINUTES.toMillis((long) ausc.v);
            TimeUnit.MINUTES.toMillis((long) ausc.A);
            this.v = ausc.w;
            this.w = ausc.x;
            this.x = ausc.y;
            this.y = ausc.z;
            this.z = ausc.B;
            z = ausc.C;
        } else {
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
            this.c = 0;
            this.k = -1;
            this.l = false;
            this.m = adkl.c().a();
            this.n = false;
            this.o = false;
            this.p = false;
            this.r = 60;
            this.q = 3;
            this.s = false;
            this.t = false;
            this.u = 0;
            this.v = 0;
            this.w = 0;
            this.x = false;
            this.y = false;
            this.z = "";
        }
        auso auso3 = ausm2.c;
        if (auso3 == null) {
            auso3 = auso.d;
        }
        if ((auso3.a & 1) != 0) {
            auso3 = ausm2.c;
            if (auso3 == null) {
                auso3 = auso.d;
            }
            ausa ausa = auso3.b;
            if (ausa == null) {
                ausa = ausa.c;
            }
            this.A = ausa.b;
        } else {
            this.A = false;
        }
        if ((ausm2.a & 16) != 0) {
            autn autn = ausm2.d;
            if (autn == null) {
                autn = autn.c;
            }
            autl = autn.b;
            if (autl == null) {
                autl = autl.d;
            }
        } else {
            autl = null;
        }
        this.f = autl;
        this.d = Collections.unmodifiableSet(hashSet);
        this.e = Collections.unmodifiableSet(hashSet2);
    }
}
