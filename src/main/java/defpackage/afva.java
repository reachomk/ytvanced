package defpackage;

/* renamed from: afva */
final class afva extends afvg {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    afva(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        StringBuilder stringBuilder = new StringBuilder(94);
        stringBuilder.append("NotificationSettings{appLevelEnabled=");
        stringBuilder.append(z);
        stringBuilder.append(", osLevelEnabled=");
        stringBuilder.append(z2);
        stringBuilder.append(", osChannelLevelEnabled=");
        stringBuilder.append(z3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afvg) {
            afvg afvg = (afvg) obj;
            return this.a == afvg.a() && this.b == afvg.b() && this.c == afvg.c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003;
        if (this.c) {
            i = 1231;
        }
        return i2 ^ i;
    }
}
