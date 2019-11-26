package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: vfj */
public final class vfj implements vcs {
    private static final vfi a = new vfi();
    private final xsc b;
    private final xua c;
    private final vfn d;
    private final bcaa e;
    private final ahlm f;
    private final veq g;

    public final vsi a(aakj aakj, String str, String str2, String str3, String str4, long j, int i, xvk xvk) {
        xak.b();
        aafy a = this.g.a(str, aakj.x(), str2, str3, j, i, this.f.a(), xvk);
        if (a == null || a.c()) {
            return vsi.a;
        }
        ajxg[] ajxgArr = a.a.a;
        aogi aogi = null;
        if (ajxgArr != null) {
            for (ajxg ajxg : ajxgArr) {
                aogi aogi2 = ajxg.b;
                if (aogi2 != null) {
                    aogi = aogi2;
                    break;
                }
            }
        }
        vsd vsd = new vsd(new aafx(aogi), i, aakj.k(), aakj.b(), str4, aakj.y(), aakj.x());
        return new vsi(vsd, this.d.a(vsd, a.b(), aakj.n()));
    }

    public final List a(aakj aakj) {
        amqw.a((Object) aakj);
        List<aogi> q = aakj.q();
        if (q == null || q.isEmpty()) {
            return Collections.emptyList();
        }
        int a;
        PriorityQueue priorityQueue = new PriorityQueue(q.size(), a);
        for (aogi aogi : q) {
            a = aogh.a(aogi.d);
            if (a == 0 || a != 3 || aogi.b <= 0) {
                a = aogh.a(aogi.d);
                if (a == 0 || a != 2) {
                    int a2 = aogh.a(aogi.d);
                    if (a2 != 0) {
                        if (a2 != 4) {
                        }
                    }
                }
            }
            priorityQueue.add(aogi);
        }
        if (priorityQueue.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (priorityQueue.size() > 0) {
            int i2;
            aogi aogi2 = (aogi) priorityQueue.poll();
            aafx aafx = new aafx(aogi2);
            a = aogh.a(aogi2.d);
            if (a != 0 && a == 2) {
                i2 = 0;
            } else {
                i2 = i;
                i++;
            }
            arrayList.add(new vsd(aafx, i2, aakj.k(), aakj.b(), this.c.a(), aakj.y(), aakj.x()));
        }
        return arrayList;
    }

    public final boolean b(aakj aakj) {
        amqw.a((Object) aakj);
        return aakj.q().isEmpty() ^ 1;
    }

    public final List a(vsd vsd, aajj aajj, String str, xvk xvk) {
        xak.b();
        amqw.a((Object) vsd);
        List m = vsd.m();
        if (m.isEmpty()) {
            vsd vsd2 = vsd;
            String str2 = str;
            aafy a = this.g.a(vsd2, str2, "", this.f.a(), xvk);
            if (a == null) {
                return Collections.emptyList();
            }
            if (a.c()) {
                return Arrays.asList(new aaga[]{new vse(vta.a)});
            }
            m = a.b();
        }
        return this.d.a(vsd, m, aajj);
    }

    public final vrq a(vrt vrt) {
        xak.b();
        vso vso = ((vse) vrt.c).a;
        aafv a = (!(vso instanceof vtk) || TextUtils.isEmpty(((vtk) vso).d())) ? null : this.g.a(vrt.c, vrt.d);
        vfn vfn = this.d;
        akcb akcb = a != null ? a.a : null;
        aakj aakj = vrt.d;
        if (akcb == null || (akcb.f == null && akcb.p.length <= 0)) {
            if (aakj == null) {
                return null;
            }
            ajxu ajxu = aakj.a;
            if (ajxu == null || ajxu.v == null) {
                return null;
            }
        }
        return new vrr(vfn.b.a(), akcb, aakj);
    }

    public final long a() {
        return ((vnx) this.e.get()).f;
    }

    public final void a(aaga aaga) {
        if (!aaga.o()) {
            ((vnx) this.e.get()).a(this.b.a());
        }
    }

    public final aakj a(vqy vqy, aakj aakj) {
        return aakj.s();
    }

    public /* synthetic */ vfj(vfl vfl) {
        this.b = (xsc) amqw.a(vfl.a);
        this.c = (xua) amqw.a(vfl.b);
        this.d = (vfn) amqw.a(vfl.c);
        this.e = (bcaa) amqw.a(vfl.e);
        this.f = (ahlm) amqw.a(vfl.f);
        this.g = (veq) amqw.a(vfl.d);
    }
}
