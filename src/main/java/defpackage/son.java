package defpackage;

import java.util.List;

/* renamed from: son */
public final class son implements sxc {
    private final sxk a;
    private final soq b;
    private final aobz c;

    private son(sxk sxk, soq soq, aobz aobz) {
        this.a = sxk;
        this.b = soq;
        this.c = aobz;
    }

    public static sxc a(sxk sxk, soq soq, aobz aobz) {
        return new son(sxk, soq, aobz);
    }

    public final aobz a() {
        return this.c;
    }

    public final /* synthetic */ swn a(cmg cmg, swk swk, Object obj, String str, Object obj2, List list, swp swp) {
        bdho bdho = (bdho) obj2;
        snp snp = new snp(this.b.a(cmg, swk, obj, str, bdho, list));
        this.a.a(cmg, bdho, swp != null ? swp.a(snp) : snp);
        return snp;
    }
}
