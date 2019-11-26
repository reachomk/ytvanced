package defpackage;

/* renamed from: ahho */
final class ahho extends ahhq {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final int g;
    private final int h;
    private final bcaa i;
    private final boolean j;
    private final long k;
    private final int l;
    private final boolean m;

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final bcaa i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final long k() {
        return this.k;
    }

    public final int l() {
        return this.l;
    }

    public final boolean m() {
        return this.m;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        int i = this.g;
        int i2 = this.h;
        String valueOf = String.valueOf(this.i);
        boolean z7 = this.j;
        long j = this.k;
        int i3 = this.l;
        boolean z8 = this.m;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 485);
        stringBuilder.append("PlayerModuleConfig{onesieEnabled=");
        stringBuilder.append(z);
        stringBuilder.append(", enableVss2StatsTracking=");
        stringBuilder.append(z2);
        stringBuilder.append(", enableGmsCoreFirstPartyApis=");
        stringBuilder.append(z3);
        stringBuilder.append(", enableRawCcSupport=");
        stringBuilder.append(z4);
        stringBuilder.append(", enableLegacyHeartbeatFlow=");
        stringBuilder.append(z5);
        stringBuilder.append(", enableAggressiveLossOfForeground=");
        stringBuilder.append(z6);
        stringBuilder.append(", backgroundNotificationIconResourceId=");
        stringBuilder.append(i);
        stringBuilder.append(", subtitleCacheSize=");
        stringBuilder.append(i2);
        stringBuilder.append(", referringAppProvider=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", useV19SystemCaptionSettings=");
        stringBuilder.append(z7);
        stringBuilder.append(", playerFetcherTimeoutMillis=");
        stringBuilder.append(j);
        stringBuilder.append(", maximumConsecutiveSkippedUnplayableVideos=");
        stringBuilder.append(i3);
        stringBuilder.append(", enableVss2UserPresenceTracking=");
        stringBuilder.append(z8);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahhq) {
            ahhq ahhq = (ahhq) obj;
            if (this.a == ahhq.a() && this.b == ahhq.b() && this.c == ahhq.c() && this.d == ahhq.d() && this.e == ahhq.e() && this.f == ahhq.f() && this.g == ahhq.g() && this.h == ahhq.h()) {
                bcaa bcaa = this.i;
                if (bcaa == null ? ahhq.i() == null : bcaa.equals(ahhq.i())) {
                    return this.j == ahhq.j() && this.k == ahhq.k() && this.l == ahhq.l() && this.m == ahhq.m();
                }
            }
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((((((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003) ^ (!this.c ? 1237 : 1231)) * 1000003) ^ (!this.d ? 1237 : 1231)) * 1000003) ^ (!this.e ? 1237 : 1231)) * 1000003) ^ (!this.f ? 1237 : 1231)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003;
        bcaa bcaa = this.i;
        i2 = (i2 ^ (bcaa != null ? bcaa.hashCode() : 0)) * 1000003;
        int i3 = !this.j ? 1237 : 1231;
        long j = this.k;
        i2 = (((((i2 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.l) * 1000003;
        if (this.m) {
            i = 1231;
        }
        return i2 ^ i;
    }

    /* synthetic */ ahho(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, bcaa bcaa, boolean z7, long j, int i3, boolean z8) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = i;
        this.h = i2;
        this.i = bcaa;
        this.j = z7;
        this.k = j;
        this.l = i3;
        this.m = z8;
    }
}
