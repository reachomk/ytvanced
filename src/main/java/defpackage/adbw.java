package defpackage;

/* renamed from: adbw */
final class adbw extends adby {
    private final adca b;
    private final String c;
    private final String d;
    private final zzf e;
    private final int f;
    private final boolean g;
    private final int h;
    private final boolean i;
    private final boolean j;
    private final String k;

    public final adca a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    /* Access modifiers changed, original: protected|final */
    public final zzf d() {
        return this.e;
    }

    public final int e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    public final int g() {
        return this.h;
    }

    public final boolean h() {
        return this.i;
    }

    public final boolean i() {
        return this.j;
    }

    public final String j() {
        return this.k;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        String valueOf2 = String.valueOf(this.e);
        int i = this.f;
        boolean z = this.g;
        int i2 = this.h;
        boolean z2 = this.i;
        boolean z3 = this.j;
        String str3 = this.k;
        int length = valueOf.length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 258) + length2) + length3) + valueOf2.length()) + String.valueOf(str3).length());
        stringBuilder.append("MdxModuleConfig{castAppIdConfigs=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", theme=");
        stringBuilder.append(str);
        stringBuilder.append(", dialAppName=");
        stringBuilder.append(str2);
        stringBuilder.append(", commonConfigs=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", remoteNotificationIconResId=");
        stringBuilder.append(i);
        stringBuilder.append(", lockscreenAdSupported=");
        stringBuilder.append(z);
        stringBuilder.append(", multiUserSession=");
        stringBuilder.append(i2);
        stringBuilder.append(", forceQueueingEnabled=");
        stringBuilder.append(z2);
        stringBuilder.append(", mdxPlaybackQueueEnabled=");
        stringBuilder.append(z3);
        stringBuilder.append(", castDataChannelNameSpace=");
        stringBuilder.append(str3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adby) {
            adby adby = (adby) obj;
            return this.b.equals(adby.a()) && this.c.equals(adby.b()) && this.d.equals(adby.c()) && this.e.equals(adby.d()) && this.f == adby.e() && this.g == adby.f() && this.h == adby.g() && this.i == adby.h() && this.j == adby.i() && this.k.equals(adby.j());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ (!this.g ? 1237 : 1231)) * 1000003) ^ this.h) * 1000003) ^ (!this.i ? 1237 : 1231)) * 1000003;
        if (this.j) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.k.hashCode();
    }

    /* synthetic */ adbw(adca adca, String str, String str2, zzf zzf, int i, boolean z, int i2, boolean z2, boolean z3, String str3) {
        this.b = adca;
        this.c = str;
        this.d = str2;
        this.e = zzf;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = z2;
        this.j = z3;
        this.k = str3;
    }
}
