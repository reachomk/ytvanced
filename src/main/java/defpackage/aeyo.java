package defpackage;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: aeyo */
final class aeyo extends ous {
    private final List c = new ArrayList();
    private final aexc d;
    private final Handler e;

    aeyo(aexc aexc, Handler handler) {
        this.d = aexc;
        this.e = handler;
    }

    public final ouu a(oao[] oaoArr, opz opz, ook ook, oau oau) {
        affh a;
        afgv f;
        affe affe;
        int i = 0;
        int i2 = 1;
        oav a2 = oau.a(oau.a(oau.a(ook.a), new oaw(), false).b, new oav(), true);
        amqw.b(a2.a instanceof afaj);
        afaj afaj = (afaj) a2.a;
        synchronized (afaj) {
            a = afaj.a();
            f = afaj.f();
            affe = afaj.a;
        }
        afak afak = new afak(afaj, f, a.c);
        if (!afaj.m) {
            this.e.post(new aeyr(afaj, f));
            afaj.m = true;
        }
        oan[] oanArr = new oan[4];
        oum[] oumArr = new oum[4];
        if (this.d.a() && f.a.length > 0) {
            if (afak.d == 3) {
                i2 = 2;
            }
            oanArr[i2] = oan.a;
            oumArr[i2] = a(afaj, opz, f.a, afak);
        }
        if (f.b.length > 0) {
            if (affe.b == 4) {
                i = 3;
            }
            oanArr[i] = oan.a;
            oumArr[i] = a(afaj, opz, f.b, afak);
        }
        ouu ouu = new ouu(oanArr, oumArr, afak);
        aeoj aeoj = afaj.e;
        if (aeoj != null) {
            aeoj.a(ouu, a);
        }
        return ouu;
    }

    public final void a(Object obj) {
        if (obj != null) {
            amqw.a(obj instanceof afak);
            afak afak = (afak) obj;
            afaj afaj = afak.a;
            aexc aexc = this.d;
            afjv afjv = aexc.f;
            afjs b = aexc.b();
            aexc aexc2 = this.d;
            afjc afjc = aexc2.c;
            xhv xhv = aexc2.d;
            synchronized (afaj) {
                afaj.p = afak;
            }
            if (afaj.k) {
                afaj.a(afjc, xhv, afdp.a(afjv, b));
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(afaj afaj) {
        if (afaj != null) {
            aeoj aeoj = afaj.e;
            if (aeoj != null) {
                aeoj.a(null, null);
            }
        }
        our our = this.a;
        if (our != null) {
            our.c();
        }
    }

    public final void a(nyx nyx, Object obj) {
        synchronized (this.c) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                oam oam = (aexa) ((WeakReference) it.next()).get();
                if (oam != null) {
                    oak a = nyx.a(oam);
                    a.a(obj);
                    a.a();
                } else {
                    it.remove();
                }
            }
        }
    }

    private final oum a(afaj afaj, opz opz, aahr[] aahrArr, afak afak) {
        afaj afaj2 = afaj;
        opz opz2 = opz;
        aahr[] aahrArr2 = aahrArr;
        afak afak2 = afak;
        int i = 0;
        while (i < opz2.b) {
            opx a = opz2.a(i);
            Collection arrayList = new ArrayList(a.a);
            for (int i2 = 0; i2 < a.a; i2++) {
                String str = a.a(i2).a;
                for (aahr aahr : aahrArr2) {
                    if (aahr.e.equals(str)) {
                        arrayList.add(Integer.valueOf(i2));
                        break;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                i++;
            } else if (arrayList.size() == 1) {
                return new ouf(a, ((Integer) arrayList.get(0)).intValue(), 0, afak2);
            } else {
                aajj d;
                String str2;
                afgp b;
                afev affg;
                aajj aajj;
                int i3;
                aexs aexs = this.d.a;
                aeyq aeyq = new aeyq(afaj2);
                aexc aexc = this.d;
                int[] a2 = anhe.a(arrayList);
                afjc afjc = aexc.c;
                xhv xhv = aexc.d;
                afjs a3 = afdp.a(aexc.f, aexc.b());
                synchronized (afaj) {
                    d = afaj.d();
                    str2 = afaj.e().c;
                    b = afaj.b();
                }
                if (afjc.l()) {
                    affg = new affg();
                    aajj = d;
                } else {
                    aeqo aeqo = aexs.b;
                    aeeu aeeu = aexs.c;
                    boolean ae = d.ae();
                    int i4 = a3.b;
                    int i5 = i4;
                    String str3 = str2;
                    boolean z = ae;
                    aajj = d;
                    affg = new affn(aeqo, xhv, d, aeeu, z, i5, a3.c, afak2.b.f, aeyq, d.ao(), str3, afjc, afjc.a(xhv), new aexv(b), new aexu(afaj2));
                }
                aeoj aeoj = afaj2.e;
                awdg awdg = aajj.c;
                if ((awdg.a & 2) != 0) {
                    arhh arhh = awdg.d;
                    if (arhh == null) {
                        arhh = arhh.bv;
                    }
                    i3 = arhh.bu;
                } else {
                    i3 = 0;
                }
                aexa aexa = new aexa(affg, a, afak, aeoj, i3 != 0 ? (long) i3 : 2000, a2);
                synchronized (this.c) {
                    this.c.add(new WeakReference(aexa));
                }
                return aexa;
            }
        }
        throw new IllegalStateException("getTrackSelection() failed");
    }
}
