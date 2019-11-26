package defpackage;

/* renamed from: vxu */
final class vxu extends vyc {
    private final boolean a;
    private final boolean b;
    private final CharSequence c;

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final CharSequence c() {
        return this.c;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 90);
        stringBuilder.append("LearnMoreOverlayState{learnMoreCtaHidden=");
        stringBuilder.append(z);
        stringBuilder.append(", learnMoreCtaEnabled=");
        stringBuilder.append(z2);
        stringBuilder.append(", learnMoreText=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vyc) {
            vyc vyc = (vyc) obj;
            return this.a == vyc.a() && this.b == vyc.b() && this.c.equals(vyc.c());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (this.b) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.c.hashCode();
    }

    /* synthetic */ vxu(boolean z, boolean z2, CharSequence charSequence) {
        this.a = z;
        this.b = z2;
        this.c = charSequence;
    }
}
