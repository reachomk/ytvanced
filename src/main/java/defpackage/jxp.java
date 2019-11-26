package defpackage;

/* renamed from: jxp */
public final class jxp extends kld {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    /* Access modifiers changed, original: final */
    public final int a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final int b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final int c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final int d() {
        return this.d;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder stringBuilder = new StringBuilder(176);
        stringBuilder.append("SlimMetadataToggleButtonColorConfiguration{defaultIconColorRes=");
        stringBuilder.append(i);
        stringBuilder.append(", selectedIconColorRes=");
        stringBuilder.append(i2);
        stringBuilder.append(", defaultTextColorRes=");
        stringBuilder.append(i3);
        stringBuilder.append(", selectedTextColorRes=");
        stringBuilder.append(i4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kld) {
            kld kld = (kld) obj;
            return this.a == kld.a() && this.b == kld.b() && this.c == kld.c() && this.d == kld.d();
        }
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public /* synthetic */ jxp(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
