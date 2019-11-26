package defpackage;

import java.util.List;

/* renamed from: npl */
public final class npl extends npm implements npa {
    private final npq g;

    public npl(String str, nom nom, npq npq, String str2) {
        super(str, -1, nom, str2, npq, null);
        this.g = npq;
    }

    public final npj c() {
        return null;
    }

    public final npa d() {
        return this;
    }

    public final npj b(int i) {
        return this.g.a(this, i);
    }

    public final int a(long j, long j2) {
        npq npq = this.g;
        int i = npq.e;
        int a = npq.a(j2);
        if (npq.g == null) {
            int i2 = npq.e + ((int) (j / ((npq.f * 1000000) / npq.b)));
            if (i2 < i) {
                i2 = i;
            } else if (a != -1 && i2 > a) {
                return a;
            }
            return i2;
        }
        int i3 = a;
        a = i;
        while (a <= i3) {
            int i4 = (a + i3) / 2;
            long a2 = npq.a(i4);
            if (a2 >= j) {
                if (a2 <= j) {
                    a = i4;
                    break;
                }
                i3 = i4 - 1;
            } else {
                a = i4 + 1;
            }
        }
        if (a != i) {
            a = i3;
        }
        return a;
    }

    public final long a(int i) {
        return this.g.a(i);
    }

    public final long a(int i, long j) {
        npq npq = this.g;
        List list = npq.g;
        if (list != null) {
            return (((npr) list.get(i - npq.e)).b * 1000000) / npq.b;
        }
        if (i == npq.a(j)) {
            return j - npq.a(i);
        }
        return (npq.f * 1000000) / npq.b;
    }

    public final int a() {
        return this.g.e;
    }

    public final int a(long j) {
        return this.g.a(j);
    }

    public final boolean b() {
        return this.g.a();
    }
}
