package defpackage;

import java.util.List;

/* renamed from: npp */
public final class npp extends npq {
    public final List d;

    public npp(npj npj, long j, long j2, int i, long j3, List list, List list2) {
        super(npj, j, j2, i, j3, list);
        this.d = list2;
    }

    public final boolean a() {
        return true;
    }

    public final npj a(npm npm, int i) {
        return (npj) this.d.get(i - this.e);
    }

    public final int a(long j) {
        return (this.e + this.d.size()) - 1;
    }
}
