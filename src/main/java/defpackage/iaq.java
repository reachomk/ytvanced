package defpackage;

/* renamed from: iaq */
final class iaq extends idn {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final aicd k;

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final boolean d() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final boolean e() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final boolean g() {
        return this.g;
    }

    /* Access modifiers changed, original: final */
    public final boolean h() {
        return this.h;
    }

    /* Access modifiers changed, original: final */
    public final boolean i() {
        return this.i;
    }

    /* Access modifiers changed, original: final */
    public final boolean j() {
        return this.j;
    }

    /* Access modifiers changed, original: final */
    public final aicd k() {
        return this.k;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        boolean z7 = this.g;
        boolean z8 = this.h;
        boolean z9 = this.i;
        boolean z10 = this.j;
        String valueOf = String.valueOf(this.k);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 278);
        stringBuilder.append("MidUiModel{isControlsOverlayVisible=");
        stringBuilder.append(z);
        stringBuilder.append(", isVideoInNewState=");
        stringBuilder.append(z2);
        stringBuilder.append(", isFullscreen=");
        stringBuilder.append(z3);
        stringBuilder.append(", isInInlineMode=");
        stringBuilder.append(z4);
        stringBuilder.append(", hasNext=");
        stringBuilder.append(z5);
        stringBuilder.append(", hasPrevious=");
        stringBuilder.append(z6);
        stringBuilder.append(", autonavVisible=");
        stringBuilder.append(z7);
        stringBuilder.append(", isUserScrubbing=");
        stringBuilder.append(z8);
        stringBuilder.append(", isFullscreenEngagementViewVisible=");
        stringBuilder.append(z9);
        stringBuilder.append(", isExtendedRelatedEndScreenShowing=");
        stringBuilder.append(z10);
        stringBuilder.append(", style=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof idn) {
            idn idn = (idn) obj;
            return this.a == idn.a() && this.b == idn.b() && this.c == idn.c() && this.d == idn.d() && this.e == idn.e() && this.f == idn.f() && this.g == idn.g() && this.h == idn.h() && this.i == idn.i() && this.j == idn.j() && this.k.equals(idn.k());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((((((((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003) ^ (!this.c ? 1237 : 1231)) * 1000003) ^ (!this.d ? 1237 : 1231)) * 1000003) ^ (!this.e ? 1237 : 1231)) * 1000003) ^ (!this.f ? 1237 : 1231)) * 1000003) ^ (!this.g ? 1237 : 1231)) * 1000003) ^ (!this.h ? 1237 : 1231)) * 1000003) ^ (!this.i ? 1237 : 1231)) * 1000003;
        if (this.j) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.k.hashCode();
    }

    /* Access modifiers changed, original: final */
    public final idq l() {
        return new iat(this);
    }

    /* synthetic */ iaq(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, aicd aicd) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = aicd;
    }
}
