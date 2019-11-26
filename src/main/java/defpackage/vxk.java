package defpackage;

/* renamed from: vxk */
final class vxk extends vxc {
    private final boolean a;
    private final boolean b;
    private final int c;
    private final int d;
    private final int e;
    private final vyg f;
    private final vye g;
    private final vxe h;
    private final vyc i;
    private final vxi j;
    private final vxg k;
    private final vya l;

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public final int f() {
        return this.e;
    }

    public final vyg g() {
        return this.f;
    }

    public final vye h() {
        return this.g;
    }

    public final vxe i() {
        return this.h;
    }

    public final vyc j() {
        return this.i;
    }

    public final vxi k() {
        return this.j;
    }

    public final vxg l() {
        return this.k;
    }

    public final vya m() {
        return this.l;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.i);
        String valueOf5 = String.valueOf(this.j);
        String valueOf6 = String.valueOf(this.k);
        String valueOf7 = String.valueOf(this.l);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        int length5 = valueOf5.length();
        StringBuilder stringBuilder = new StringBuilder(((((((length + 312) + length2) + length3) + length4) + length5) + valueOf6.length()) + valueOf7.length());
        stringBuilder.append("AdOverlayState{adOverlayShown=");
        stringBuilder.append(z);
        stringBuilder.append(", overflowMenuShown=");
        stringBuilder.append(z2);
        stringBuilder.append(", currentPositionMillis=");
        stringBuilder.append(i);
        stringBuilder.append(", bufferedPositionMillis=");
        stringBuilder.append(i2);
        stringBuilder.append(", durationMillis=");
        stringBuilder.append(i3);
        stringBuilder.append(", skipButtonState=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", mdxAdOverlayState=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", adProgressTextState=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", learnMoreOverlayState=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", adTitleOverlayState=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", adReEngagementState=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", brandInteractionState=");
        stringBuilder.append(valueOf7);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vxc) {
            vxc vxc = (vxc) obj;
            return this.a == vxc.b() && this.b == vxc.c() && this.c == vxc.d() && this.d == vxc.e() && this.e == vxc.f() && this.f.equals(vxc.g()) && this.g.equals(vxc.h()) && this.h.equals(vxc.i()) && this.i.equals(vxc.j()) && this.j.equals(vxc.k()) && this.k.equals(vxc.l()) && this.l.equals(vxc.m());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (this.b) {
            i = 1231;
        }
        return ((((((((((((((((((((i2 ^ i) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    /* synthetic */ vxk(boolean z, boolean z2, int i, int i2, int i3, vyg vyg, vye vye, vxe vxe, vyc vyc, vxi vxi, vxg vxg, vya vya) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = vyg;
        this.g = vye;
        this.h = vxe;
        this.i = vyc;
        this.j = vxi;
        this.k = vxg;
        this.l = vya;
    }
}
