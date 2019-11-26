package defpackage;

import java.util.List;

/* renamed from: npq */
public abstract class npq extends npn {
    public final int e;
    public final long f;
    public final List g;

    public npq(npj npj, long j, long j2, int i, long j3, List list) {
        super(npj, j, j2);
        this.e = i;
        this.f = j3;
        this.g = list;
    }

    public abstract int a(long j);

    public abstract npj a(npm npm, int i);

    public final long a(int i) {
        long j;
        List list = this.g;
        if (list != null) {
            j = ((npr) list.get(i - this.e)).a - this.c;
        } else {
            j = ((long) (i - this.e)) * this.f;
        }
        return nxf.a(j, 1000000, this.b);
    }

    public boolean a() {
        return this.g != null;
    }
}
