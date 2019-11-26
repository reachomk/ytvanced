package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: vet */
public final class vet implements aala, vfk, vlv {
    public final bcaa a;
    public final long b;
    public final xsc c;
    public final xci d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;
    public final vfp h;
    public final zzl i;
    public String j = "";
    private final vju k;
    private final Executor l;
    private final Executor m;
    private final Executor n;
    private final bcaa o;
    private final bcaa p;
    private final bcaa q;
    private final bcaa r;
    private final ConcurrentHashMap s = new ConcurrentHashMap();

    public vet(bcaa bcaa, vdj vdj, vju vju, xsc xsc, Executor executor, Executor executor2, Executor executor3, xci xci, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bctz bctz, bcaa bcaa7, bcaa bcaa8, vfp vfp, zzl zzl) {
        this.a = bcaa;
        this.b = vdj.d();
        this.c = xsc;
        this.l = executor;
        this.m = executor2;
        this.n = executor3;
        this.d = xci;
        this.k = vju;
        this.e = bcaa2;
        this.o = bcaa3;
        this.p = bcaa4;
        this.q = bcaa5;
        this.r = bcaa6;
        this.f = bcaa7;
        this.g = bcaa8;
        this.h = vfp;
        this.i = zzl;
        bctz.c().c(ves.a).a(new vev(this));
    }

    public final void a(aakj aakj) {
        xak.b();
        if (!aakj.k()) {
            aogi r = aakj.r();
            if (r != null && r.c.size() != 0) {
                for (aogm aogm : r.c) {
                    if ((aogm.a & 1) != 0) {
                        anko f = anko.f();
                        this.s.put(aakj.b(), f);
                        vfn vfn = (vfn) this.f.get();
                        ayxm ayxm = aogm.b;
                        if (ayxm == null) {
                            ayxm = ayxm.o;
                        }
                        f.a_(vfn.a(ayxm, (aajx) vfn.d.get(), vfn.c, aakj.n()));
                        return;
                    }
                }
            }
        }
    }

    public final void a(aakj aakj, boolean z, String str) {
        if (c(aakj)) {
            xci xci = this.d;
            if (xci != null) {
                xci.d(new vqj());
            }
            vqy vqy = null;
            String a = this.k.a(str, vsm.PRE_ROLL, null);
            vka vka = new vka(a, vsm.PRE_ROLL, 0, aakj, vkc.a, z, null, null);
            if (aakj.k()) {
                ((vjt) this.e.get()).a(a, aakj, vka, vsm.PRE_ROLL);
                this.l.execute(new vez(this, aakj, a, vka, str));
                return;
            }
            List a2 = ((vcs) this.a.get()).a(aakj);
            if (!a2.isEmpty() && ((vsd) a2.get(0)).e() == vsm.PRE_ROLL) {
                vqy = (vsd) a2.get(0);
            }
            this.l.execute(new vey(this, vqy, a, vka, aakj, str, a2));
            if (vqy != null) {
                if (!aakj.k()) {
                    for (aogi aogi : aakj.q()) {
                        int a3 = aogh.a(aogi.d);
                        if (a3 != 0 && a3 == 2) {
                            if (aogi.c.size() != 0) {
                                for (aogm aogm : aogi.c) {
                                    if ((aogm.a & 2) != 0) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                ((vjt) this.e.get()).a(a, aakj, vka, vqy, vsm.PRE_ROLL);
            }
        }
    }

    public final List b(aakj aakj) {
        return ((vcs) this.a.get()).a(aakj);
    }

    public final List a(vsd vsd, aakj aakj, String str, xvk xvk) {
        amul g;
        vsd vsd2 = vsd;
        Future future = (Future) this.s.remove(aakj.b());
        if ((wcf.h(this.i) || wcf.i(this.i)) && future != null && vsd.e() == vsm.PRE_ROLL) {
            vfn vfn = (vfn) this.f.get();
            List<aogm> m = vsd.m();
            aajj n = aakj.n();
            Collection arrayList = new ArrayList(m.size());
            Object obj = null;
            for (aogm aogm : m) {
                int i = aogm.a;
                if ((i & 32) != 0) {
                    arrayList.addAll(vfn.a(vsd2, aogm, n));
                } else if (obj != null || (i & 1) == 0) {
                    vse a = vfn.a(vsd2, aogm, n, vfn.b.a());
                    if (a == null) {
                        g = amul.g();
                        break;
                    }
                    arrayList.add(a);
                } else {
                    try {
                        aakj aakj2 = (aakj) future.get();
                        String a2 = vfn.b.a();
                        ayxm ayxm = aogm.b;
                        if (ayxm == null) {
                            ayxm = ayxm.o;
                        }
                        arrayList.add(new vse(new vtk(vsd, a2, aakj2, ayxm, vfn.a.a())));
                        obj = 1;
                    } catch (Exception unused) {
                        g = amul.g();
                    }
                }
            }
            g = amul.a(arrayList);
        } else {
            g = ((vcs) this.a.get()).a(vsd2, aakj.n(), str, xvk);
        }
        List list = g;
        a(list, aakj);
        return list;
    }

    public final vsi a(aakj aakj, String str, String str2, String str3, String str4, long j, int i, xvk xvk) {
        vsi a = ((vcs) this.a.get()).a(aakj, str, str2, str3, str4, j, i, xvk);
        a(a.c, aakj);
        return a;
    }

    private final void a(List list, aakj aakj) {
        if (!list.isEmpty()) {
            boolean e = wcf.e(this.i);
            aopb a = wcf.a(this.i);
            Object obj = null;
            if (a != null && a.l) {
                obj = 1;
            }
            if (e || obj != null) {
                List arrayList = new ArrayList();
                for (aaga aaga : list) {
                    vso vso = ((vse) aaga).a;
                    if (e && (vso instanceof vtk)) {
                        arrayList.add(new vrt(this.h.a.a(), aaga.l(), aaga, aakj));
                    }
                    if (!(obj == null || (vso instanceof vrx) || (vso instanceof vta))) {
                        arrayList.add(new vsa(this.h.a.a(), aaga.l(), aaga, aakj));
                    }
                }
                if (!arrayList.isEmpty()) {
                    a(arrayList);
                }
            }
        }
    }

    public final void a(List list) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(list);
        } else {
            this.m.execute(new vfb(this, list));
        }
    }

    public final void b(List list) {
        for (vss vss : list) {
            if (vss instanceof vrt) {
                ((vln) this.o.get()).a((vrt) vss);
            } else if (vss instanceof vsa) {
                ((vln) this.p.get()).a((vsa) vss);
            } else if (vss instanceof vst) {
                ((vln) this.r.get()).a((vst) vss);
            } else if (vss instanceof vry) {
                ((vln) this.q.get()).a((vry) vss);
            } else {
                String valueOf = String.valueOf(vss.a());
                String str = "Received unknown slot type: ";
                xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
        }
    }

    public final void a(vss vss) {
        if (vss == null) {
            xtl.c("Should never ask to fill a null slot. This should never happen.");
        }
        anjv a;
        if (vss instanceof vst) {
            this.d.d(new vpt());
            Object obj = (vst) vss;
            a = anic.a(anjf.a(obj), new vfa(this), this.l);
            a.a(new vfd(this, obj, a), this.m);
        } else if (vss instanceof vrt) {
            a = anic.a(anjf.a((vrt) vss), new vfc(this), this.n);
            a.a(new vff(this, vss, a), this.m);
        } else {
            if (vss instanceof vry) {
                Object obj2 = (vry) vss;
                anjv a2 = anic.a(anjf.a(obj2), new veu(this), aniv.a);
                a2.a(new vex(this, obj2, a2), aniv.a);
            }
            String valueOf = String.valueOf(vss);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
            stringBuilder.append("Received unsupported slot type: ");
            stringBuilder.append(valueOf);
            xtl.c(stringBuilder.toString());
        }
    }

    public final void a(aaga aaga) {
        ((vcs) this.a.get()).a(aaga);
    }

    public final boolean c(aakj aakj) {
        return ((vcs) this.a.get()).b(aakj);
    }

    public final aakj a(vqy vqy, aakj aakj) {
        return ((vcs) this.a.get()).a(vqy, aakj);
    }

    public final void a(String str, vka vka, vsd vsd, aakj aakj, String str2) {
        String str3 = str2;
        aakj aakj2 = aakj;
        String str4 = str;
        vka vka2 = vka;
        vsd vsd2 = vsd;
        ((vjt) this.e.get()).a(str3, aakj2, str4, vka2, vsd2, vsd.e(), a(vsd, aakj, str2, new xvk(this.c, this.b)));
    }
}
