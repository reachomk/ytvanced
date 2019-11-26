package defpackage;

/* renamed from: agei */
public final class agei extends agem {
    private final boolean a;
    private final boolean b;
    private final int c;
    private final int d;
    private final long e;
    private final long f;
    private final boolean g;
    private final int h;
    private final boolean i;

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
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

    public final int h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        int i = this.c;
        int i2 = this.d;
        long j = this.e;
        long j2 = this.f;
        boolean z3 = this.g;
        int i3 = this.h;
        boolean z4 = this.i;
        StringBuilder stringBuilder = new StringBuilder(362);
        stringBuilder.append("OfflineModuleConfig{enablePlaylistAutoSync=");
        stringBuilder.append(z);
        stringBuilder.append(", enableYouTubeBundles=");
        stringBuilder.append(z2);
        stringBuilder.append(", transferRetryStrategy=");
        stringBuilder.append(i);
        stringBuilder.append(", transferMaxRetries=");
        stringBuilder.append(i2);
        stringBuilder.append(", transferBaseRetryMilliSecs=");
        stringBuilder.append(j);
        stringBuilder.append(", transferMaxRetryMilliSecs=");
        stringBuilder.append(j2);
        stringBuilder.append(", disableOfflineWhenDatabaseOpenException=");
        stringBuilder.append(z3);
        stringBuilder.append(", databaseOpenRetries=");
        stringBuilder.append(i3);
        stringBuilder.append(", enableFallbackToAudioOnlyDownload=");
        stringBuilder.append(z4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agem) {
            agem agem = (agem) obj;
            return this.a == agem.a() && this.b == agem.b() && this.c == agem.c() && this.d == agem.d() && this.e == agem.e() && this.f == agem.f() && this.g == agem.g() && this.h == agem.h() && this.i == agem.i();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        int i3 = !this.b ? 1237 : 1231;
        int i4 = this.c;
        int i5 = this.d;
        long j = this.e;
        long j2 = this.f;
        i2 = (((((((((((((i2 ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ (!this.g ? 1237 : 1231)) * 1000003) ^ this.h) * 1000003;
        if (this.i) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public /* synthetic */ agei(boolean z, boolean z2, int i, int i2, long j, long j2, boolean z3, int i3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = z3;
        this.h = i3;
        this.i = z4;
    }
}
