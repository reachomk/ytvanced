package defpackage;

/* renamed from: ycm */
public final class ycm implements akmw {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final CharSequence f;
    public final CharSequence g;
    public final boolean h;
    public final boolean i;
    public final aqmz j;
    public final apxu k;

    public final akmw a(akmw akmw) {
        ycm ycm = (ycm) akmw;
        long j = this.c;
        long j2 = ycm.c;
        if (j > j2) {
            return this;
        }
        if (j2 > j) {
            ycl a = ycm.a();
            a.a = this.d;
            a.d = this.e;
            a.f = this.i;
            return a.a();
        }
        ycl a2 = a();
        a2.a = ycm.d;
        a2.d = ycm.e;
        a2.c = ycm.g;
        a2.b = ycm.f;
        a2.e = ycm.h;
        a2.f = ycm.i;
        a2.g = ycm.j;
        a2.h = ycm.k;
        return a2.a();
    }

    public final ycl a() {
        return new ycl(this);
    }

    /* synthetic */ ycm(String str, String str2, long j, boolean z, CharSequence charSequence, CharSequence charSequence2, boolean z2, boolean z3, boolean z4, aqmz aqmz, apxu apxu) {
        this.a = xvd.a(str);
        this.b = xvd.a(str2);
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = charSequence;
        this.g = charSequence2;
        this.h = z3;
        this.i = z4;
        this.j = aqmz;
        this.k = apxu;
    }
}
