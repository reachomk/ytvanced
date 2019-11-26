package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: vfn */
public final class vfn {
    public final xsc a;
    public final xua b;
    public final aamj c;
    public final bcaa d;
    private final zzl e;

    public vfn(xsc xsc, xua xua, aamj aamj, zzl zzl, bcaa bcaa) {
        this.a = xsc;
        this.b = xua;
        this.c = aamj;
        this.e = zzl;
        this.d = bcaa;
    }

    public final List a(vsd vsd, List list, aajj aajj) {
        Collection arrayList = new ArrayList(list.size());
        for (aogm aogm : list) {
            if ((aogm.a & 32) == 0) {
                vse a = a(vsd, aogm, aajj, this.b.a());
                if (a == null) {
                    return amul.g();
                }
                arrayList.add(a);
            } else {
                arrayList.addAll(a(vsd, aogm, aajj));
            }
        }
        return amul.a(arrayList);
    }

    public final List a(vsd vsd, aogm aogm, aajj aajj) {
        axak axak;
        ArrayList arrayList = new ArrayList();
        axbs axbs = aogm.g;
        if (axbs == null) {
            axbs = axbs.e;
        }
        if ((axbs.a & 1) != 0) {
            axak = axbs.b;
            if (axak == null) {
                axak = axak.a;
            }
            arrayList.add(a(vsd, axak, aajj, this.b.a()));
        }
        if ((axbs.a & 2) != 0) {
            axak = axbs.c;
            if (axak == null) {
                axak = axak.a;
            }
            arrayList.add(a(vsd, axak, aajj, this.b.a()));
        }
        if ((axbs.a & 4) != 0) {
            axak axak2 = axbs.d;
            if (axak2 == null) {
                axak2 = axak.a;
            }
            arrayList.add(a(vsd, axak2, aajj, this.b.a()));
        }
        return arrayList;
    }

    public final vse a(vsd vsd, aogm aogm, aajj aajj, String str) {
        vso vtk;
        aogm aogm2 = aogm;
        aajj aajj2 = aajj;
        amqw.a((Object) vsd);
        if (vsd.e() == vsm.PRE_ROLL) {
            xak.b();
        }
        aajx aajx = (aajx) this.d.get();
        aamj aamj = this.c;
        long a = this.a.a();
        int i = aogm2.a;
        if ((i & 1) != 0) {
            vsd vsd2 = vsd;
            String str2 = str;
            ayxm ayxm;
            if (wcf.g(this.e)) {
                ayxm ayxm2 = aogm2.b;
                if (ayxm2 == null) {
                    ayxm2 = ayxm.o;
                }
                aakj a2 = vfn.a(ayxm2, aajx, aamj, aajj2);
                ayxm = aogm2.b;
                if (ayxm == null) {
                    ayxm = ayxm.o;
                }
                vso vtk2 = new vtk(vsd, str, a2, ayxm, a);
            } else {
                ayxm = aogm2.b;
                if (ayxm == null) {
                    ayxm = ayxm.o;
                }
                vtk = new vtk(vsd, aajj, str, ayxm, aajx, aamj, a);
            }
        } else if ((i & 2) != 0) {
            arku arku = aogm2.c;
            if (arku == null) {
                arku = arku.b;
            }
            vtk = new vrx(vsd, aajj, str, a, arku);
        } else if ((i & 4) == 0) {
            xtl.c("Received unsupported ad type, this should never happen.");
            vtk = null;
        } else {
            axzh axzh = aogm2.d;
            if (axzh == null) {
                axzh = axzh.h;
            }
            vtk = new vsu(vsd, aajj2, str, axzh);
        }
        if (vtk != null) {
            return new vse(vtk);
        }
        return null;
    }

    private final vse a(vsd vsd, axak axak, aajj aajj, String str) {
        anxp anxp = axak;
        aajj aajj2 = aajj;
        amqw.a((Object) vsd);
        if (vsd.e() == vsm.PRE_ROLL) {
            xak.b();
        }
        aajx aajx = (aajx) this.d.get();
        aamj aamj = this.c;
        long a = this.a.a();
        vso vso = null;
        if (anxp == null) {
            xtl.c("Received null renderer, this should never happen.");
        } else {
            anxr access$000 = anxl.checkIsLite(ayxl.a);
            anxp.a(access$000);
            vsd vsd2;
            String str2;
            anxr access$0002;
            Object b;
            if (anxp.h.a(access$000.d)) {
                vsd2 = vsd;
                str2 = str;
                if (wcf.g(this.e)) {
                    access$0002 = anxl.checkIsLite(ayxl.a);
                    anxp.a(access$0002);
                    b = anxp.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    ayxm ayxm = (ayxm) b;
                    vso = new vtk(vsd, str, vfn.a(ayxm, aajx, aamj, aajj2), ayxm, a);
                } else {
                    access$0002 = anxl.checkIsLite(ayxl.a);
                    anxp.a(access$0002);
                    b = anxp.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    vso = new vtk(vsd, aajj, str, (ayxm) b, aajx, aamj, a);
                }
            } else {
                access$000 = anxl.checkIsLite(arkv.a);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d)) {
                    vsd2 = vsd;
                    str2 = str;
                    access$0002 = anxl.checkIsLite(arkv.a);
                    anxp.a(access$0002);
                    b = anxp.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    vso = new vrx(vsd, aajj, str, a, (arku) b);
                } else {
                    access$000 = anxl.checkIsLite(axzc.a);
                    anxp.a(access$000);
                    if (anxp.h.a(access$000.d)) {
                        access$000 = anxl.checkIsLite(axzc.a);
                        anxp.a(access$000);
                        b = anxp.h.b(access$000.d);
                        if (b == null) {
                            b = access$000.b;
                        } else {
                            b = access$000.a(b);
                        }
                        vso = new vsu(vsd, aajj2, str, (axzh) b);
                    } else {
                        xtl.c("Received unsupported ad type, this should never happen.");
                    }
                }
            }
        }
        return new vse(vso);
    }

    public static aakj a(ayxm ayxm, aajx aajx, aamj aamj, aajj aajj) {
        aojg aojg = ayxm.c;
        if (aojg == null) {
            aojg = aojg.d;
        }
        if (aojg.b.size() != 0) {
            aojg = ayxm.c;
            if (aojg == null) {
                aojg = aojg.d;
            }
            aakj a = vsn.a(aajx, aojg, aajj);
            if (a != null) {
                return a;
            }
        }
        ajxu ajxu = (ajxu) aamj.a(ayxm.b.d(), ajxu.class);
        if (ajxu == null) {
            afpc.a(1, afpf.ad, "AdBreakRenderer path ad playerResponse cannot be deserialized.");
            ajxu = new ajxu();
        }
        return new aakj(ajxu, 0, aajx);
    }
}
