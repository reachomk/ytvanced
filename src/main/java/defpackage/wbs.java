package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: wbs */
public final class wbs extends was implements vcq {
    public final vso b;
    public final vqp c;
    public ahjn d = null;
    public final vcp e;
    private final vqy f;
    private final vuh g;
    private final int h;
    private boolean i;
    private boolean j;
    private List k;
    private int l;
    private int m;
    private PriorityQueue n;
    private PriorityQueue o;
    private aaas p;
    private bcuo q;

    wbs(vrk vrk, vuh vuh, vqy vqy, vso vso, String str, ahjn ahjn, aiqh aiqh, vcp vcp, vqp vqp, int i, aaas aaas) {
        PriorityQueue priorityQueue;
        vqy vqy2 = vqy;
        vcp vcp2 = vcp;
        vqp vqp2 = vqp;
        amqw.a((Object) vrk);
        this.g = (vuh) amqw.a((Object) vuh);
        this.b = (vso) amqw.a((Object) vso);
        this.f = vqy2;
        this.e = vcp2;
        this.k = new ArrayList();
        this.m = -1;
        PriorityQueue priorityQueue2 = new PriorityQueue(this.b.u().size() + 1, a);
        for (aojo aojo : this.b.u()) {
            if (aojo.c >= 0) {
                priorityQueue2.add(aojo);
            }
        }
        this.n = priorityQueue2;
        int i2 = this.m;
        if (this.b.I() == null) {
            priorityQueue = new PriorityQueue();
        } else {
            PriorityQueue priorityQueue3 = new PriorityQueue();
            for (aols aols : this.b.I().g) {
                aolu aolu;
                wau wau;
                long f = (long) (this.b.f() * 1000);
                if (aols == null) {
                    aolu = null;
                } else {
                    aolu = aols.b;
                    if (aolu == null) {
                        aolu = aolu.e;
                    }
                }
                if (aolu != null) {
                    int a = aolx.a(aolu.b);
                    if (a == 0) {
                        a = 1;
                    }
                    a--;
                    if (a == 1) {
                        f = (long) Math.round(aolu.c * ((float) f));
                    } else if (a == 2) {
                        f = aolu.d;
                    }
                    apxu apxu = aols.c;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    wau = new wau(apxu, f);
                    if (wau != null && wau.a > ((long) i2)) {
                        priorityQueue3.add(wau);
                    }
                }
                wau = null;
                priorityQueue3.add(wau);
            }
            priorityQueue = priorityQueue3;
        }
        this.o = priorityQueue;
        this.d = (ahjn) amqw.a((Object) ahjn);
        this.c = vqp2;
        this.h = i;
        this.p = aaas;
        vqp2.a(vqy.d(), str);
        vqp2.a(vqy2);
        vqp2.a = new vse(vso);
        vqp2.c = this.d;
        if (vcp2 != null) {
            vcp2.b = this;
        }
        this.q = aiqh.b.a(new wbr(this));
    }

    public final void a(aagw aagw) {
    }

    public final void a(aagw aagw, aaha aaha) {
    }

    public final void a(ahkr ahkr) {
    }

    public final void e() {
    }

    public final void k() {
    }

    public final void b() {
        vcp vcp = this.e;
        if (vcp != null) {
            vcp.h();
            this.e.b = null;
        }
        bcuo bcuo = this.q;
        if (bcuo != null) {
            bcuo.b();
            this.q = null;
        }
    }

    public final vqp c() {
        return this.c;
    }

    public final String n() {
        return this.b.j;
    }

    public final void a(vqi vqi) {
        vuh vuh = this.g;
        this.f.j();
        vuh.a(new vqk(vqi));
    }

    public final void l() {
        if (!this.j && this.i) {
            vcp vcp = this.e;
            tps a = vcp != null ? vcp.a.a(tqh.ABANDON) : null;
            if (this.b.I() != null) {
                a(this.b.I().o, a, this.c);
            }
            this.g.a(this.b.E(), this.c.a(a), this.c);
        }
    }

    public final void a(vra vra) {
        if (!this.j) {
            this.j = true;
            if (vra == vra.VIDEO_ENDED || vra == vra.SURVEY_ENDED) {
                tps tps;
                vqp vqp = this.c;
                vqp.d = false;
                vqp.e = TimeUnit.SECONDS.toMillis((long) this.b.f());
                vcp vcp = this.e;
                tps tps2 = null;
                if (vcp == null) {
                    tps = null;
                } else {
                    tps = tqd.a(null, vcp.a.c.a(false));
                }
                vqo a = this.c.a(tps);
                while (this.n.size() > 0) {
                    this.g.a((aojo) this.n.poll(), a);
                }
                while (this.o.size() > 0) {
                    this.p.a(((wau) this.o.poll()).b, null);
                }
                vcp = this.e;
                if (vcp != null) {
                    tps2 = vcp.d();
                }
                a(this.b.w(), tps2);
                this.l = 5;
            }
            if (vra == vra.AD_VIDEO_TIMEOUT) {
                vqk vqk = new vqk(new vqi(vql.VIDEO_PLAYBACK_ERROR_LOAD_TIMEOUT, "ad.loadtimeout.fatal"));
                this.g.a(this.b.D(), vqk);
                if (this.b.I() != null) {
                    a(this.b.I().b, new aftl[0]);
                }
            }
        }
    }

    public final void d() {
        vso vso = this.b;
        if ((vso instanceof vrx) && !this.i) {
            this.g.a(vso.p());
            this.i = true;
        }
    }

    public final void a(int i, int i2) {
        tps tps;
        vcp vcp = this.e;
        if (vcp == null) {
            tps = null;
        } else {
            tps = vcp.a.a(tqh.SKIP);
        }
        vqz vqz = new vqz(i, i2);
        vqo a = this.c.a(tps);
        this.g.a(this.b.v(), vqz, a);
        if (this.b.I() != null) {
            a(this.b.I().e, vqz, a);
        }
    }

    public final void f() {
        this.g.a(this.b.C());
        if (this.b.I() != null) {
            a(this.b.I().h, new aftl[0]);
        }
    }

    public final void g() {
        this.c.d = true;
        if (!(this.i || q())) {
            p();
            this.i = true;
        }
        if (this.l == 0) {
            this.l = 1;
            return;
        }
        vcp vcp = this.e;
        tps a = vcp != null ? vcp.a() : null;
        a(this.b.z(), a);
        if (this.b.I() != null) {
            a(this.b.I().d, a, this.c);
        }
    }

    public final void h() {
        this.g.a(this.b.x());
        if (this.b.I() != null) {
            a(this.b.I().f, new aftl[0]);
        }
    }

    public final void a(afif afif) {
        vqk vqk = new vqk(vqi.a(afif));
        if (this.l != 5) {
            this.g.a(this.b.x(), vqk);
            this.g.a(this.b.D(), vqk);
            if (this.b.I() != null) {
                a(this.b.I().b, vqk);
            }
            this.l = 5;
        }
    }

    public final void i() {
        this.c.d = false;
        vcp vcp = this.e;
        tps b = vcp != null ? vcp.b() : null;
        a(this.b.y(), b);
        if (this.b.I() != null) {
            a(this.b.I().c, b, this.c);
        }
    }

    public final void a(ahkm ahkm) {
        if (ahkm.g && !this.j) {
            a((int) ahkm.a);
        }
    }

    public final void a(vqg vqg) {
        a((int) vqg.a);
    }

    private final void a(int i) {
        int i2 = this.h;
        if (i2 <= 0 || i - this.m <= i2) {
            long j = (long) i;
            this.c.e = j;
            if (!this.i && q()) {
                p();
                this.i = true;
            }
            while (this.n.size() > 0 && i >= ((aojo) this.n.peek()).c) {
                this.g.a((aojo) this.n.poll());
            }
            while (this.o.size() > 0 && j >= ((wau) this.o.peek()).a) {
                this.p.a(((wau) this.o.poll()).b, null);
            }
            this.m = i;
            i2 = this.b.f() * 1000;
            i = i2 > 0 ? (i << 2) / i2 : 0;
            if (i >= this.l) {
                i2 = i;
                while (i2 >= this.l) {
                    vcp vcp = this.e;
                    if (a(was.a(this.b, i2), vcp != null ? vcp.a(i2) : null)) {
                        break;
                    }
                    i2--;
                }
                this.l = i + 1;
            }
        }
    }

    private final void p() {
        vcp vcp = this.e;
        tps c = vcp != null ? vcp.c() : null;
        this.g.a(this.b.p());
        a(this.b.q(), c);
        if (this.b.I() != null) {
            a(this.b.I().a, c, this.c);
        }
    }

    private final boolean q() {
        return this.b.i.b();
    }

    public final void j() {
        this.g.a(this.b.l.o);
        if (this.b.I() != null) {
            a(this.b.I().p, new aftl[0]);
        }
    }

    public final void m() {
        String str = "clickchannel";
        if (!this.k.contains(str)) {
            this.k.add(str);
            this.g.a(this.b.l.f);
            if (this.b.I() != null) {
                a(this.b.I().n, new aftl[0]);
            }
        }
    }

    public final void o() {
        vcp vcp = this.e;
        if (vcp != null) {
            vcp.g();
        }
    }

    public final void a(vtb vtb) {
        vtb vtb2 = vtb;
        vso vso = this.b;
        if ((vso instanceof vsu) && vtb2 != null) {
            aokk aokk = vtb2.c;
            boolean z = true;
            if (!(aokk == null || aokk.b)) {
                z = false;
            }
            vuh vuh = this.g;
            aago aago = (aago) ((aagi) vso).X().get(0);
            List arrayList = new ArrayList();
            Iterator it = aago.j().iterator();
            while (it.hasNext()) {
                String valueOf;
                String str;
                Uri uri = (Uri) it.next();
                ArrayList arrayList2 = new ArrayList();
                String valueOf2 = String.valueOf(aago.d());
                if (!TextUtils.isEmpty(aago.h())) {
                    arrayList2.add(new SimpleEntry("p", aago.h()));
                }
                String valueOf3 = String.valueOf(valueOf2);
                String str2 = "m.d-";
                boolean z2 = z;
                Iterator it2 = it;
                arrayList2.add(new SimpleEntry(valueOf3.length() == 0 ? new String(str2) : str2.concat(valueOf3), Long.toString(vtb2.e - vtb2.d)));
                arrayList2.add(new SimpleEntry("m.v", "2"));
                long j = vtb2.e;
                j += (long) vtb2.b.getOffset(j);
                valueOf3 = String.valueOf(valueOf2);
                str2 = "m.lt-";
                arrayList2.add(new SimpleEntry(valueOf3.length() == 0 ? new String(str2) : str2.concat(valueOf3), Long.toString((long) anhe.a(j / 1000))));
                if ((aago.f() == aagp.MULTI_SELECT || aago.f() == aagp.SINGLE_ANSWERS) && !TextUtils.isEmpty(aago.e())) {
                    valueOf = String.valueOf(valueOf2);
                    str = "r.o-";
                    arrayList2.add(new SimpleEntry(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), aago.e()));
                }
                valueOf = "a";
                str = "t";
                if (vtb2.f != null) {
                    arrayList2.add(new SimpleEntry(str, valueOf));
                    for (Integer intValue : vtb2.f) {
                        Object str3;
                        int intValue2 = intValue.intValue();
                        valueOf3 = String.valueOf(valueOf2);
                        str2 = "r.r-";
                        if (valueOf3.length() == 0) {
                            str3 = new String(str2);
                        } else {
                            str3 = str2.concat(valueOf3);
                        }
                        arrayList2.add(new SimpleEntry(str3, (String) aago.i().get(intValue2)));
                    }
                } else {
                    if (vtb2.g) {
                        Object str4;
                        valueOf2 = String.valueOf(valueOf2);
                        valueOf3 = "m.f-";
                        if (valueOf2.length() == 0) {
                            str4 = new String(valueOf3);
                        } else {
                            str4 = valueOf3.concat(valueOf2);
                        }
                        arrayList2.add(new SimpleEntry(str4, "1"));
                    }
                    if (uri.getQueryParameter(str) == null || !uri.getQueryParameter(str).equals(valueOf)) {
                        arrayList2.add(new SimpleEntry(str, "nr"));
                    } else {
                        arrayList2.add(new SimpleEntry(str, "pa"));
                    }
                }
                arrayList.add(new SimpleEntry(uri, arrayList2));
                z = z2;
                it = it2;
            }
            vuh.a(arrayList, z);
        }
    }

    public final tqg a() {
        return new tqg(this.b.f() * 1000, this.m);
    }

    public final Set a(tqh tqh) {
        Collection a;
        List linkedList = new LinkedList();
        vso vso = this.b;
        switch (tqh.ordinal()) {
            case 0:
                a = wbs.a(vso.q());
                break;
            case 1:
                a = wbs.a(vso.r());
                break;
            case 2:
                a = wbs.a(vso.s());
                break;
            case 3:
                a = wbs.a(vso.t());
                break;
            case 4:
                a = wbs.a(vso.w());
                break;
            case 5:
                a = wbs.a(vso.z());
                break;
            case 6:
                a = wbs.a(vso.y());
                break;
            case 8:
                a = wbs.a(vso.E());
                break;
            case 9:
                a = wbs.a(vso.v());
                break;
            case 12:
                a = wbs.a(vso.G());
                break;
            case 13:
                a = wbs.a(vso.H());
                break;
            case 14:
                a = wbs.a(vso.F());
                break;
            case 15:
                a = wbs.a(vso.A());
                break;
            case 16:
                a = wbs.a(vso.B());
                break;
            default:
                a = Collections.emptyList();
                break;
        }
        linkedList.addAll(a);
        return afti.a(linkedList, this.c.b);
    }

    public final void a(tps tps) {
        a(this.b.F(), tps);
        if (this.b.I() != null) {
            a(this.b.I().l, tps, this.c);
        }
    }

    public final void b(tps tps) {
        a(this.b.G(), tps);
        if (this.b.I() != null) {
            a(this.b.I().j, tps, this.c);
        }
    }

    public final void c(tps tps) {
        a(this.b.H(), tps);
        if (this.b.I() != null) {
            a(this.b.I().k, tps, this.c);
        }
    }

    public final boolean a(List list, tps tps) {
        return this.g.a(list, this.c.a(tps));
    }

    private static List a(List list) {
        if (list == null || list.size() == 0) {
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        for (aojo aojo : list) {
            if (!(aojo == null || (aojo.a & 1) == 0)) {
                try {
                    Uri a = xvt.a(aojo.b);
                    if (!(a == null || Uri.EMPTY.equals(a))) {
                        linkedList.add(a);
                    }
                } catch (MalformedURLException unused) {
                }
            }
        }
        return linkedList;
    }

    public final void a(List list, tps tps, vqp vqp) {
        vqo a = vqp.a(tps);
        a(list, a);
    }

    public final void a(List list, aftl... aftlArr) {
        if (this.p != null && !list.isEmpty()) {
            Map hashMap = new HashMap();
            if (aftlArr.length != 0) {
                hashMap.put("MacrosConverters.CustomConvertersKey", aftlArr);
            }
            aabd.a(this.p, list, hashMap);
        }
    }
}
