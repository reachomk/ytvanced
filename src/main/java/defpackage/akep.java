package defpackage;

/* renamed from: akep */
final class akep extends akev {
    private final akhr b;
    private final amur c;
    private final int d;
    private final float e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final int m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final float s;
    private final boolean t;
    private final boolean u;
    private final int v;

    public final akhr a() {
        return this.b;
    }

    public final amur b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final float d() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.i;
    }

    public final boolean i() {
        return this.j;
    }

    public final boolean j() {
        return this.k;
    }

    public final boolean k() {
        return this.l;
    }

    public final int l() {
        return this.m;
    }

    public final boolean m() {
        return this.n;
    }

    public final boolean n() {
        return this.o;
    }

    public final boolean o() {
        return this.p;
    }

    public final boolean p() {
        return this.q;
    }

    public final boolean q() {
        return this.r;
    }

    public final float r() {
        return this.s;
    }

    public final boolean s() {
        return this.t;
    }

    public final boolean t() {
        return this.u;
    }

    public final int u() {
        return this.v;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        float f = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        boolean z5 = this.j;
        boolean z6 = this.k;
        boolean z7 = this.l;
        int i2 = this.m;
        boolean z8 = this.n;
        boolean z9 = this.o;
        boolean z10 = this.p;
        boolean z11 = this.q;
        boolean z12 = this.r;
        float f2 = this.s;
        boolean z13 = this.t;
        boolean z14 = this.u;
        int i3 = this.v;
        int i4 = i3;
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 728) + valueOf2.length());
        stringBuilder.append("ElementsLaunchConfig{defaultSurfaceConfig=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", surfaceConfigMap=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", elementsImageClient=");
        stringBuilder.append(i);
        stringBuilder.append(", lithoPoolMultiplier=");
        stringBuilder.append(f);
        stringBuilder.append(", lithoPoolOnRB=");
        stringBuilder.append(z);
        stringBuilder.append(", useUnifiedTemplateResolver=");
        stringBuilder.append(z2);
        stringBuilder.append(", prewarmUnifiedTemplateResolver=");
        stringBuilder.append(z3);
        stringBuilder.append(", useArenaEkoProcessor=");
        stringBuilder.append(z4);
        stringBuilder.append(", replaceRBGridRow=");
        stringBuilder.append(z5);
        stringBuilder.append(", useLegacyVisible=");
        stringBuilder.append(z6);
        stringBuilder.append(", cleanupRBComponentSubscriptions=");
        stringBuilder.append(z7);
        stringBuilder.append(", cleanupRBComponentSubscriptionsRange=");
        stringBuilder.append(i2);
        stringBuilder.append(", cleanupRBComponentSubscriptionsDuplicates=");
        stringBuilder.append(z8);
        stringBuilder.append(", useUtpEkoArena=");
        stringBuilder.append(z9);
        stringBuilder.append(", supportAnimationDrawable=");
        stringBuilder.append(z10);
        stringBuilder.append(", supportElementsCommandExtension=");
        stringBuilder.append(z11);
        stringBuilder.append(", enableElementsPerformanceMetric=");
        stringBuilder.append(z12);
        stringBuilder.append(", elementsPerformanceMetricSampleRate=");
        stringBuilder.append(f2);
        stringBuilder.append(", delayResolveInElementObserver=");
        stringBuilder.append(z13);
        stringBuilder.append(", enablePbToFbMetric=");
        stringBuilder.append(z14);
        stringBuilder.append(", ekoProcessorMaxLruCacheSize=");
        stringBuilder.append(i4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akev) {
            akev akev = (akev) obj;
            return this.b.equals(akev.a()) && amvr.b(this.c, akev.b()) && this.d == akev.c() && Float.floatToIntBits(this.e) == Float.floatToIntBits(akev.d()) && this.f == akev.e() && this.g == akev.f() && this.h == akev.g() && this.i == akev.h() && this.j == akev.i() && this.k == akev.j() && this.l == akev.k() && this.m == akev.l() && this.n == akev.m() && this.o == akev.n() && this.p == akev.o() && this.q == akev.p() && this.r == akev.q() && Float.floatToIntBits(this.s) == Float.floatToIntBits(akev.r()) && this.t == akev.s() && this.u == akev.t() && this.v == akev.u();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ (!this.f ? 1237 : 1231)) * 1000003) ^ (!this.g ? 1237 : 1231)) * 1000003) ^ (!this.h ? 1237 : 1231)) * 1000003) ^ (!this.i ? 1237 : 1231)) * 1000003) ^ (!this.j ? 1237 : 1231)) * 1000003) ^ (!this.k ? 1237 : 1231)) * 1000003) ^ (!this.l ? 1237 : 1231)) * 1000003) ^ this.m) * 1000003) ^ (!this.n ? 1237 : 1231)) * 1000003) ^ (!this.o ? 1237 : 1231)) * 1000003) ^ (!this.p ? 1237 : 1231)) * 1000003) ^ (!this.q ? 1237 : 1231)) * 1000003) ^ (!this.r ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.s)) * 1000003) ^ (!this.t ? 1237 : 1231)) * 1000003;
        if (this.u) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.v;
    }

    /* synthetic */ akep(akhr akhr, amur amur, int i, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, float f2, boolean z13, boolean z14, int i3) {
        this.b = akhr;
        this.c = amur;
        this.d = i;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = i2;
        this.n = z8;
        this.o = z9;
        this.p = z10;
        this.q = z11;
        this.r = z12;
        this.s = f2;
        this.t = z13;
        this.u = z14;
        this.v = i3;
    }
}
