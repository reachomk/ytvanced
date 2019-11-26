package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: vfa */
final /* synthetic */ class vfa implements amqd {
    private final vet a;

    vfa(vet vet) {
        this.a = vet;
    }

    public final Object a(Object obj) {
        vet vet = this.a;
        vst vst = (vst) obj;
        xak.b();
        vqy vqy = vst.g;
        if (vqy == null || (vqy instanceof vsd)) {
            vsd vsd = (vsd) vqy;
            if (vsd == null) {
                if (!vst.f.k()) {
                    throw new IllegalStateException("Got null adBreak for non-offline playerResponse");
                } else if (vst.b == vsm.PRE_ROLL) {
                    List a = ((vcs) vet.a.get()).a(vst.f);
                    if (a.isEmpty() || ((vsd) a.get(0)).e() != vsm.PRE_ROLL) {
                        return null;
                    }
                    vsd = (vsd) a.get(0);
                } else {
                    throw new IllegalStateException("Got null adBreak for non-preroll");
                }
            }
            vsd vsd2 = vsd;
            List<aaga> a2 = vet.a(vsd2, vst.f, vst.d, new xvk(vet.c, vet.b));
            ArrayList arrayList = new ArrayList();
            vfn vfn = (vfn) vet.f.get();
            aakj aakj = vst.f;
            Object vrc = aakj.s() != null ? new vrc(vsd2, vfn.b.a(), aakj.s()) : null;
            if (vrc != null) {
                arrayList.add(vrc);
            }
            for (aaga aaga : a2) {
                vso vso = ((vse) aaga).a;
                arrayList.add(vso);
                vrc = vso.m() != null ? new vrj(vso, ((vfn) vet.f.get()).b.a()) : null;
                if (vrc != null) {
                    arrayList.add(vrc);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() == 1) {
                if (arrayList.get(0) instanceof vrx) {
                    vsv vsv;
                    vrx vrx = (vrx) arrayList.get(0);
                    vss[] vssArr = new vss[1];
                    vfp vfp = vet.h;
                    arku arku = vrx.a;
                    String str = vst.d;
                    ajmq ajmq = vst.e;
                    aakj aakj2 = vst.f;
                    if (vst.b == vsm.PRE_ROLL) {
                        vsv = new vsv(0, 0);
                    } else {
                        vsv = vst.c;
                    }
                    vssArr[0] = vfp.a(arku, str, ajmq, aakj2, vsd2, vsv);
                    vet.a(Arrays.asList(vssArr));
                    return null;
                } else if (arrayList.get(0) instanceof vta) {
                    return (vsq) arrayList.get(0);
                }
            }
            return new vru(vsd2, arrayList);
        }
        throw new IllegalStateException("Unexpected to get non-InstreamAdBreak object");
    }
}
