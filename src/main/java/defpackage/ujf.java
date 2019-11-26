package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ujf */
public final class ujf {
    public final ujj a;
    public final ukz b;
    public final List c = new CopyOnWriteArrayList();

    public ujf(ujj ujj, ukz ukz) {
        this.a = (ujj) uhy.a((Object) ujj);
        this.b = (ukz) uhy.a((Object) ukz);
    }

    @Deprecated
    public final long a() {
        return this.b.g;
    }

    public final long b() {
        return this.a.b;
    }

    public final boolean c() {
        return (e() || this.a.h != 0 || f() || g() || i() || s()) ? false : true;
    }

    public final String d() {
        String str = this.a.e;
        return str == null ? "NORMAL" : str;
    }

    public final void a(String str) {
        this.a.e = str;
    }

    public final boolean e() {
        ujj ujj = this.a;
        return (ujj.f == 0 && ujj.g == this.b.g) ? false : true;
    }

    public final boolean f() {
        String str = this.a.e;
        return (str == null || str.equals("NORMAL")) ? false : true;
    }

    public final boolean g() {
        ujj ujj = this.a;
        return ujj.j != null && ujj.l > 1.0E-6f;
    }

    public final boolean h() {
        return this.a.a;
    }

    public final boolean i() {
        return this.a.k;
    }

    public final long j() {
        return this.a.f;
    }

    public final long k() {
        return this.a.f / 1000;
    }

    public final long l() {
        return this.a.g;
    }

    public final long m() {
        return this.a.g / 1000;
    }

    public final int n() {
        return this.a.h;
    }

    public final void a(boolean z) {
        ujj ujj = this.a;
        if (ujj.k != z) {
            ujj.k = z;
            a(ujh.Mute);
        }
    }

    public final void a(double d) {
        boolean z = true;
        boolean z2 = d >= 0.0d && d < 1.0d;
        uhy.a(z2);
        if (this.a.n + d >= 1.0d) {
            z = false;
        }
        uhy.a(z);
        this.a.m = d;
    }

    public final void b(double d) {
        boolean z = true;
        boolean z2 = d >= 0.0d && d < 1.0d;
        uhy.a(z2);
        if (this.a.m + d >= 1.0d) {
            z = false;
        }
        uhy.a(z);
        this.a.n = d;
    }

    public final void c(double d) {
        boolean z = true;
        boolean z2 = d >= 0.0d && d < 1.0d;
        uhy.a(z2);
        if (this.a.p + d >= 1.0d) {
            z = false;
        }
        uhy.a(z);
        this.a.o = d;
    }

    public final void d(double d) {
        boolean z = true;
        boolean z2 = d >= 0.0d && d < 1.0d;
        uhy.a(z2);
        if (this.a.o + d >= 1.0d) {
            z = false;
        }
        uhy.a(z);
        this.a.p = d;
    }

    public final double o() {
        return this.a.m;
    }

    public final double p() {
        return this.a.n;
    }

    public final double q() {
        return this.a.o;
    }

    public final double r() {
        return this.a.p;
    }

    public final boolean s() {
        return (o() == 0.0d && p() == 0.0d && q() == 0.0d && r() == 0.0d) ? false : true;
    }

    public final void a(long j) {
        ujj ujj = this.a;
        if (ujj.a) {
            uhy.b(ujj.g >= ujj.b);
            ujj = this.a;
            long j2 = ujj.g;
            long j3 = j2 - ujj.b;
            if (j <= j3) {
                j3 = ujj.c;
                if (j3 > 0) {
                    j2 -= j3;
                    if (j < j2) {
                        j = j2;
                    }
                }
            } else {
                j = j3;
            }
            if (j < 0) {
                j = 0;
            }
            if (ujj.f != j) {
                ujj.f = j;
                a(ujh.TrimStart);
            }
        }
    }

    public final void b(long j) {
        ujj ujj = this.a;
        if (ujj.a) {
            long j2 = this.b.g;
            uhy.b(ujj.f <= j2 - ujj.b);
            ujj = this.a;
            long j3 = ujj.f;
            long j4 = ujj.b + j3;
            if (j >= j4) {
                j4 = ujj.c;
                if (j4 > 0) {
                    j3 += j4;
                    if (j > j3) {
                        j = j3;
                    }
                }
            } else {
                j = j4;
            }
            if (j > j2) {
                j = j2;
            }
            if (ujj.g != j) {
                ujj.g = j;
                a(ujh.TrimEnd);
            }
        }
    }

    public final Uri t() {
        return this.a.j;
    }

    public final void a(Uri uri) {
        this.a.j = uri;
    }

    public final long u() {
        return this.a.i;
    }

    public final void c(long j) {
        ujj ujj = this.a;
        if (ujj.i != j) {
            ujj.i = j;
            a(ujh.AudioSwapOffset);
        }
    }

    public final float v() {
        return this.a.l;
    }

    public final void a(float f) {
        ujj ujj = this.a;
        if (ujj.l != f) {
            ujj.l = f;
            a(ujh.AudioSwapVolume);
        }
    }

    public final void a(ujk ujk) {
        this.c.add(ujk);
    }

    public final void b(ujk ujk) {
        this.c.remove(ujk);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujf)) {
            return false;
        }
        return uhv.a(this.b, ((ujf) obj).b);
    }

    public final String toString() {
        String name = getClass().getName();
        Object[] objArr = new Object[1];
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 14);
        stringBuilder.append("videoMetaData=");
        stringBuilder.append(valueOf);
        objArr[0] = stringBuilder.toString();
        return uhv.a(name, objArr);
    }

    private final void a(ujh ujh) {
        for (ujk a : this.c) {
            a.a(this, ujh);
        }
    }

    /* synthetic */ ujf(ukz ukz, long j, long j2, boolean z) {
        this.b = (ukz) uhy.a((Object) ukz);
        this.a = new ujj(ukz, j, j2, z);
    }
}
