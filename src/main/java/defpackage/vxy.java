package defpackage;

/* renamed from: vxy */
final class vxy extends vyg {
    private final axop a;
    private final vzc b;
    private final vrd c;
    private final int d;
    private final boolean e;
    private final float f;
    private final int g;
    private final int h;
    private final vsm i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final float n;
    private final int o;

    public final axop a() {
        return this.a;
    }

    public final vzc b() {
        return this.b;
    }

    public final vrd c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final float f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final vsm i() {
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

    public final float n() {
        return this.n;
    }

    public final int o() {
        return this.o;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        boolean z = this.e;
        float f = this.f;
        int i2 = this.g;
        int i3 = this.h;
        String valueOf4 = String.valueOf(this.i);
        boolean z2 = this.j;
        boolean z3 = this.k;
        boolean z4 = this.l;
        boolean z5 = this.m;
        float f2 = this.n;
        int i4 = this.o;
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i5 = i4;
        StringBuilder stringBuilder = new StringBuilder((((length + 402) + length2) + valueOf3.length()) + valueOf4.length());
        stringBuilder.append("SkipButtonState{skipAdRenderer=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", contentMetadata=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", adCountMetadata=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", skipState=");
        stringBuilder.append(i);
        stringBuilder.append(", hidden=");
        stringBuilder.append(z);
        stringBuilder.append(", swipeToSkipProgress=");
        stringBuilder.append(f);
        stringBuilder.append(", timeRemainingUntilSkippableMillis=");
        stringBuilder.append(i2);
        stringBuilder.append(", timeRemainingInAdMillis=");
        stringBuilder.append(i3);
        stringBuilder.append(", breakType=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", DRCtaEnabled=");
        stringBuilder.append(z2);
        stringBuilder.append(", fullscreen=");
        stringBuilder.append(z3);
        stringBuilder.append(", countdownOnThumbnail=");
        stringBuilder.append(z4);
        stringBuilder.append(", countdownNextToThumbnail=");
        stringBuilder.append(z5);
        stringBuilder.append(", preskipScalingFactor=");
        stringBuilder.append(f2);
        stringBuilder.append(", preskipPadding=");
        stringBuilder.append(i5);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vyg) {
            vyg vyg = (vyg) obj;
            return this.a.equals(vyg.a()) && this.b.equals(vyg.b()) && this.c.equals(vyg.c()) && this.d == vyg.d() && this.e == vyg.e() && Float.floatToIntBits(this.f) == Float.floatToIntBits(vyg.f()) && this.g == vyg.g() && this.h == vyg.h() && this.i.equals(vyg.i()) && this.j == vyg.j() && this.k == vyg.k() && this.l == vyg.l() && this.m == vyg.m() && Float.floatToIntBits(this.n) == Float.floatToIntBits(vyg.n()) && this.o == vyg.o();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ (!this.e ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (!this.j ? 1237 : 1231)) * 1000003) ^ (!this.k ? 1237 : 1231)) * 1000003) ^ (!this.l ? 1237 : 1231)) * 1000003;
        if (this.m) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ Float.floatToIntBits(this.n)) * 1000003) ^ this.o;
    }

    /* synthetic */ vxy(axop axop, vzc vzc, vrd vrd, int i, boolean z, float f, int i2, int i3, vsm vsm, boolean z2, boolean z3, boolean z4, boolean z5, float f2, int i4) {
        this.a = axop;
        this.b = vzc;
        this.c = vrd;
        this.d = i;
        this.e = z;
        this.f = f;
        this.g = i2;
        this.h = i3;
        this.i = vsm;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = f2;
        this.o = i4;
    }
}
