package defpackage;

/* renamed from: vdl */
final class vdl extends vdj {
    private final String a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;

    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public final long f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
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

    public final String toString() {
        String str = this.a;
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        long j4 = this.e;
        long j5 = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        boolean z3 = this.i;
        boolean z4 = this.j;
        boolean z5 = this.k;
        boolean z6 = this.l;
        boolean z7 = z6;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 446);
        stringBuilder.append("AdsModuleConfig{getAppVersionForAds=");
        stringBuilder.append(str);
        stringBuilder.append(", getMidrollAdsFreqCapMillis=");
        stringBuilder.append(j);
        stringBuilder.append(", getImmediateAdExpireTimeMillis=");
        stringBuilder.append(j2);
        stringBuilder.append(", getAdsTimeoutMillis=");
        stringBuilder.append(j3);
        stringBuilder.append(", getAdWarningMillis=");
        stringBuilder.append(j4);
        stringBuilder.append(", getMidrollPrefetchMillis=");
        stringBuilder.append(j5);
        stringBuilder.append(", trackUserPresence=");
        stringBuilder.append(z);
        stringBuilder.append(", shouldAllowInnertubeCaching=");
        stringBuilder.append(z2);
        stringBuilder.append(", shouldPreventYoutubeHeaders=");
        stringBuilder.append(z3);
        stringBuilder.append(", shouldPreventAdsHeaders=");
        stringBuilder.append(z4);
        stringBuilder.append(", shouldBlockAds=");
        stringBuilder.append(z5);
        stringBuilder.append(", shouldBlockOfflineAds=");
        stringBuilder.append(z7);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vdj) {
            vdj vdj = (vdj) obj;
            return this.a.equals(vdj.a()) && this.b == vdj.b() && this.c == vdj.c() && this.d == vdj.d() && this.e == vdj.e() && this.f == vdj.f() && this.g == vdj.g() && this.h == vdj.h() && this.i == vdj.i() && this.j == vdj.j() && this.k == vdj.k() && this.l == vdj.l();
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        long j4 = this.e;
        long j5 = this.f;
        int i = 1237;
        hashCode = (((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ (!this.g ? 1237 : 1231)) * 1000003) ^ (!this.h ? 1237 : 1231)) * 1000003) ^ (!this.i ? 1237 : 1231)) * 1000003) ^ (!this.j ? 1237 : 1231)) * 1000003) ^ (!this.k ? 1237 : 1231)) * 1000003;
        if (this.l) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* synthetic */ vdl(String str, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
    }
}
