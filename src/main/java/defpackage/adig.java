package defpackage;

/* renamed from: adig */
final class adig extends adiu {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final adiw g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final String o;
    public final String p;
    public final long q;
    public final int r;

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final adiw g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final boolean k() {
        return this.k;
    }

    public final boolean l() {
        return this.l;
    }

    public final boolean m() {
        return this.m;
    }

    public final int n() {
        return this.n;
    }

    public final String o() {
        return this.o;
    }

    public final String p() {
        return this.p;
    }

    public final long q() {
        return this.q;
    }

    public final int r() {
        return this.r;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        String valueOf = String.valueOf(this.g);
        int i7 = this.h;
        boolean z = this.i;
        boolean z2 = this.j;
        boolean z3 = this.k;
        boolean z4 = this.l;
        boolean z5 = this.m;
        int i8 = this.n;
        String str = this.o;
        int i9 = i8;
        String str2 = this.p;
        boolean z6 = z4;
        boolean z7 = z5;
        long j = this.q;
        int i10 = this.r;
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 503) + String.valueOf(str).length()) + String.valueOf(str2).length());
        stringBuilder.append("MdxUserContext{mdxConnectionCountDay=");
        stringBuilder.append(i);
        stringBuilder.append(", mdxConnectionCountWeek=");
        stringBuilder.append(i2);
        stringBuilder.append(", mdxConnectionCountMonth=");
        stringBuilder.append(i3);
        stringBuilder.append(", castAvailableSessionCountDay=");
        stringBuilder.append(i4);
        stringBuilder.append(", castAvailableSessionCountWeek=");
        stringBuilder.append(i5);
        stringBuilder.append(", castAvailableSessionCountMonth=");
        stringBuilder.append(i6);
        stringBuilder.append(", pageType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", currentVideoDuration=");
        stringBuilder.append(i7);
        stringBuilder.append(", fullScreen=");
        stringBuilder.append(z);
        stringBuilder.append(", hd=");
        stringBuilder.append(z2);
        stringBuilder.append(", sd=");
        stringBuilder.append(z3);
        stringBuilder.append(", playlistPlayback=");
        stringBuilder.append(z6);
        stringBuilder.append(", videoControlsVisible=");
        stringBuilder.append(z7);
        stringBuilder.append(", uncastedVideoCount=");
        stringBuilder.append(i9);
        stringBuilder.append(", videoId=");
        stringBuilder.append(str);
        stringBuilder.append(", playlistId=");
        stringBuilder.append(str2);
        stringBuilder.append(", currentTime=");
        stringBuilder.append(j);
        stringBuilder.append(", casterCategory=");
        stringBuilder.append(i10);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adiu) {
            adiu adiu = (adiu) obj;
            if (this.a == adiu.a() && this.b == adiu.b() && this.c == adiu.c() && this.d == adiu.d() && this.e == adiu.e() && this.f == adiu.f() && this.g.equals(adiu.g()) && this.h == adiu.h() && this.i == adiu.i() && this.j == adiu.j() && this.k == adiu.k() && this.l == adiu.l() && this.m == adiu.m() && this.n == adiu.n()) {
                String str = this.o;
                if (str == null ? adiu.o() != null : !str.equals(adiu.o())) {
                    str = this.p;
                    if (str == null ? adiu.p() == null : str.equals(adiu.p())) {
                        return this.q == adiu.q() && this.r == adiu.r();
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ (!this.i ? 1237 : 1231)) * 1000003) ^ (!this.j ? 1237 : 1231)) * 1000003) ^ (!this.k ? 1237 : 1231)) * 1000003) ^ (!this.l ? 1237 : 1231)) * 1000003;
        if (this.m) {
            i = 1231;
        }
        hashCode = (((hashCode ^ i) * 1000003) ^ this.n) * 1000003;
        String str = this.o;
        i = 0;
        hashCode = (hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003;
        str = this.p;
        if (str != null) {
            i = str.hashCode();
        }
        long j = this.q;
        return ((((hashCode ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.r;
    }

    public final adit s() {
        return new adif(this);
    }

    /* synthetic */ adig(int i, int i2, int i3, int i4, int i5, int i6, adiw adiw, int i7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i8, String str, String str2, long j, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = adiw;
        this.h = i7;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = i8;
        this.o = str;
        this.p = str2;
        this.q = j;
        this.r = i9;
    }
}
