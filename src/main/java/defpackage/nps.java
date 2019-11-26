package defpackage;

import java.util.List;

/* renamed from: nps */
public final class nps extends npq {
    public final npt d;
    public final npt h;

    public nps(npj npj, long j, long j2, int i, long j3, List list, npt npt, npt npt2) {
        super(npj, j, j2, i, j3, list);
        this.d = npt;
        this.h = npt2;
    }

    public final npj a(npm npm) {
        npt npt = this.d;
        if (npt == null) {
            return this.a;
        }
        nom nom = npm.b;
        return new npj(npt.a(nom.a, 0, nom.c, 0), 0, -1);
    }

    public final npj a(npm npm, int i) {
        long j;
        List list = this.g;
        if (list != null) {
            j = ((npr) list.get(i - this.e)).a;
        } else {
            j = ((long) (i - this.e)) * this.f;
        }
        long j2 = j;
        npt npt = this.h;
        nom nom = npm.b;
        return new npj(npt.a(nom.a, i, nom.c, j2), 0, -1);
    }

    public final int a(long j) {
        List list = this.g;
        if (list != null) {
            return (list.size() + this.e) - 1;
        }
        if (j == -1) {
            return -1;
        }
        return (this.e + ((int) nxf.a(j, (this.f * 1000000) / this.b))) - 1;
    }
}
