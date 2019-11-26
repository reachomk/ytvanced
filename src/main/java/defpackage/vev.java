package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: vev */
final /* synthetic */ class vev implements bcvk {
    private final vet a;

    vev(vet vet) {
        this.a = vet;
    }

    public final void a(Object obj) {
        vet vet = this.a;
        ahkn ahkn = (ahkn) obj;
        if (wcf.j(vet.i) && !TextUtils.equals(vet.j, ahkn.e)) {
            vet.j = ahkn.e;
            if (ahkn.a == airi.PLAYBACK_LOADED) {
                aakj aakj = ahkn.b;
                ajmq ajmq = ahkn.d;
                String str = vet.j;
                if (vet.c(aakj)) {
                    ajmv e = ajmq.e();
                    if (e != null) {
                        e.b((ajmy) vet.g.get());
                        e.a((ajmy) vet.g.get());
                    }
                    vet.d.d(new vqj());
                    vet.d.d(new vqb());
                    if (aakj.k()) {
                        vet.a(Arrays.asList(new vss[]{vet.h.a(str, ajmq, aakj, null, null)}));
                        return;
                    }
                    List a = ((vcs) vet.a.get()).a(aakj);
                    List arrayList = new ArrayList();
                    int i = 0;
                    while (i < a.size()) {
                        List list;
                        Object a2;
                        vsd vsd = (vsd) a.get(i);
                        vsd vsd2 = i != a.size() + -1 ? (vsd) a.get(i + 1) : null;
                        if (vsd.c.a.c.size() != 0) {
                            for (aogm aogm : vsd.m()) {
                                if ((aogm.a & 2) != 0) {
                                    vsv vsv;
                                    vfp vfp = vet.h;
                                    arku arku = aogm.c;
                                    if (arku == null) {
                                        arku = arku.b;
                                    }
                                    if (vsd.e() == vsm.PRE_ROLL) {
                                        vsv = new vsv(0, 0);
                                        list = a;
                                    } else {
                                        list = a;
                                        vsv = new vsv(vfp.a(vsd), vfp.a(vsd2));
                                    }
                                    a2 = vfp.a(arku, str, ajmq, aakj, vsd, vsv);
                                }
                            }
                            list = a;
                            a2 = vet.h.a(str, ajmq, aakj, vsd, vsd2);
                        } else {
                            list = a;
                            a2 = vet.h.a(str, ajmq, aakj, vsd, vsd2);
                        }
                        vet.d.d(new vpy());
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                        i++;
                        a = list;
                    }
                    vet.a(arrayList);
                }
            }
        }
    }
}
