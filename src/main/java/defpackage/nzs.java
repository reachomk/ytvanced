package defpackage;

/* renamed from: nzs */
final class nzs implements Comparable {
    public final oak a;
    public int b;
    public long c;
    public Object d;

    public nzs(oak oak) {
        this.a = oak;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        nzs nzs = (nzs) obj;
        Object obj2 = this.d;
        int i = 0;
        if ((obj2 != null ? null : 1) == (nzs.d != null ? null : 1)) {
            if (obj2 != null) {
                i = this.b - nzs.b;
                if (i == 0) {
                    return ozp.b(this.c, nzs.c);
                }
            }
        } else if (obj2 != null) {
            return -1;
        } else {
            i = 1;
        }
        return i;
    }
}
