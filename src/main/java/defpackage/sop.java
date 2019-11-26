package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: sop */
public final class sop implements sxb {
    private final sxj a;
    private final sos b;
    private final int c;
    private final sor d;

    private sop(sxj sxj, sos sos, int i, sor sor) {
        this.a = sxj;
        this.b = sos;
        this.c = i;
        this.d = sor;
    }

    public static sxb a(sxj sxj, sos sos, int i, sor sor) {
        return new sop(sxj, sos, i, sor);
    }

    public final cma a(cmg cmg, swk swk, anrc anrc, String str, bapc bapc, List list, swp swp) {
        snp snp = new snp(this.b.a(cmg, swk, anrc, bapc, list));
        this.a.a(cmg, bapc, swp != null ? swp.a(snp) : snp);
        return snp.a(cmg);
    }

    public final int a() {
        return this.c;
    }

    public final anrc a(ByteBuffer byteBuffer) {
        return this.d.a(byteBuffer);
    }
}
