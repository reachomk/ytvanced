package defpackage;

import java.util.List;

/* renamed from: sou */
public final class sou implements sxe {
    private final sxj a;
    private final sot b;
    private final anwy c;

    public sou(sxj sxj, sot sot, anwy anwy) {
        this.a = sxj;
        this.b = sot;
        this.c = anwy;
    }

    public final cma a(cmg cmg, swk swk, anze anze, String str, bapc bapc, List list, swp swp) {
        snp snp = new snp(this.b.a(cmg, anze, bapc, list));
        this.a.a(cmg, bapc, swp != null ? swp.a(snp) : snp);
        return snp.a(cmg);
    }

    public final anwy a() {
        return this.c;
    }
}
