package defpackage;

/* renamed from: vxm */
final class vxm extends vxe {
    private final int a;
    private final boolean b;
    private final vrd c;

    public final int c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final vrd e() {
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 91);
        stringBuilder.append("AdProgressTextState{timeRemainingMillis=");
        stringBuilder.append(i);
        stringBuilder.append(", showAdChoices=");
        stringBuilder.append(z);
        stringBuilder.append(", adCountMetadata=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vxe) {
            vxe vxe = (vxe) obj;
            return this.a == vxe.c() && this.b == vxe.d() && this.c.equals(vxe.e());
        }
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    /* synthetic */ vxm(int i, boolean z, vrd vrd) {
        this.a = i;
        this.b = z;
        this.c = vrd;
    }
}
