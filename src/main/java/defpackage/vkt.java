package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: vkt */
public final class vkt implements vla, vrh {
    public final xci a;
    public final vst b;
    public final vky c = new vky();
    public vld d;
    public ajpa e;
    public vdo f;
    private final CopyOnWriteArrayList h;
    private final vlb i;
    private final bctz j;
    private final ajmp k;
    private bcuo l;

    public vkt(xci xci, CopyOnWriteArrayList copyOnWriteArrayList, vlb vlb, bctz bctz, vst vst) {
        ajmp ajmp;
        this.a = xci;
        this.h = copyOnWriteArrayList;
        this.i = vlb;
        this.j = bctz;
        this.b = vst;
        if (vst.b != vsm.PRE_ROLL) {
            vsv vsv = vst.c;
            ajmp vku = new vku(this, vsv.a, vsv.b, ajms.AD_MODULE, ajmr.AD_MARKER);
        } else {
            ajmp = null;
        }
        this.k = ajmp;
    }

    public final void b() {
        ajoz f = this.b.e.f();
        if (f != null) {
            this.a.d(new vph());
            f.a(new vkx(this));
            return;
        }
        throw new vlc();
    }

    public final void a(int i) {
        if (this.e == null) {
            d();
            return;
        }
        vso a = this.c.a(i);
        if (a == null) {
            d();
        } else if (a instanceof vsl) {
            a = (vsl) a;
            this.a.d(new vpk());
            this.d.a(this.b, a);
            this.e.a(a.i(), a.j, new vkw(this, a));
        } else if (a instanceof vsk) {
            a = (vsk) a;
            this.d.a(this.b, a);
            vkz vkz = new vkz(this, a);
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                vdo vdo = (vdo) it.next();
                if (vdo.a(vkz)) {
                    this.d.a(this.b, a, vlq.a);
                    this.f = vdo;
                    return;
                }
            }
            vkz.a(vra.VIDEO_ERROR);
        } else if (a instanceof vtg) {
            vld vld = this.d;
            vst vst = this.b;
            vky vky = this.c;
            vld.a(vst, vky.a, vky.b);
        } else {
            throw new IllegalStateException("Illegal layout type for playerBytesSlot");
        }
    }

    private final void a(vso vso, int i, int i2, int i3) {
        this.d.a(this.b, vso, new vlt(i, i2, i3));
        this.c.b = this.c.b + 1;
        a(this.c.b);
    }

    public final void a(int i, int i2) {
        vky vky = this.c;
        vso a = vky.a(vky.b);
        if (a == null || !a.W()) {
            this.d.a(this.b, a, new vly("Invalid receipient of skipAd request"));
        } else {
            a(a, 2, i, i2);
        }
    }

    public final void a() {
        vky vky = this.c;
        vso a = vky.a(vky.b);
        if (a instanceof vtk) {
            a(a, 3, -1, -1);
        } else {
            this.d.a(this.b, a, new vly("Invalid recipient of muteAd request"));
        }
    }

    public final void c() {
        this.l = this.j.c().c(vks.a).a(new vkv(this));
        if (this.b.b == vsm.PRE_ROLL) {
            b();
            return;
        }
        ajmv e = this.b.e.e();
        if (e != null) {
            e.a(this.k);
            return;
        }
        throw new vlc();
    }

    public final void d() {
        bcuo bcuo = this.l;
        if (bcuo != null) {
            bcuo.b();
        }
        ajmv e = this.b.e.e();
        if (e != null) {
            ajmp ajmp = this.k;
            if (ajmp != null) {
                e.b(ajmp);
            }
        }
        vdo vdo = this.f;
        if (vdo != null) {
            vdo.a();
        }
        this.f = null;
        ajpa ajpa = this.e;
        if (ajpa != null) {
            ajpa.a();
        }
        this.e = null;
        this.c.b = -1;
        this.d.b(this.b);
    }

    public final void a(List list) {
        int i = 0;
        if (this.e == null) {
            Object obj = (this.c.a.isEmpty() || (this.c.a.get(0) instanceof vtg)) ? 1 : null;
            this.c.a.clear();
            this.c.a.addAll(list);
            if (!(obj == null || this.b.b == vsm.PRE_ROLL || list.isEmpty() || !(list.get(0) instanceof vsl))) {
                vlb vlb = this.i;
                vso vso = (vso) list.get(0);
                float av = vso.i() != null ? vso.i().n().av() : 0.0f;
                aakj aakj = null;
                if (vso.i() != null) {
                    aakj = vso.i();
                } else if (!(vso.j() == null || vso.k() == null || vso.i == null)) {
                    aakj = new aakj(vso.j(), vso.k(), vso.i);
                }
                if (!(aakj == null || av <= 0.0f || ((Boolean) vlb.b.getAndSet(Boolean.valueOf(true))).booleanValue())) {
                    vlb.a.a(aakj, (long) (av * 1000.0f), vlb);
                }
            }
            return;
        }
        int i2 = 0;
        while (i2 < this.c.b && i2 < list.size()) {
            if (amqq.a(list.get(i2), this.c.a.get(i2))) {
                i2++;
            } else {
                throw new vlf();
            }
        }
        vky vky = this.c;
        vso a = vky.a(vky.b);
        if (a == null) {
            throw new vlf();
        } else if (this.c.b < list.size()) {
            vso vso2 = (vso) list.get(this.c.b);
            if (a instanceof vtg) {
                vky = this.c;
                vky.a.set(vky.b, vso2);
                i = 1;
            } else if (!amqq.a(a, vso2)) {
                throw new vlf();
            }
            i2 = this.c.b + 1;
            while (i2 < this.c.a.size()) {
                if (i2 > list.size()) {
                    this.c.b(i2);
                    break;
                } else {
                    this.c.a.set(i2, (vso) list.get(i2));
                    i2++;
                }
            }
            this.c.a.addAll(list.subList(i2, list.size()));
            if (i != 0) {
                a(this.c.b);
            }
        } else if (a instanceof vtg) {
            vky vky2 = this.c;
            vky2.b(vky2.b);
            a(this.c.b);
        } else {
            throw new vlf();
        }
    }
}
