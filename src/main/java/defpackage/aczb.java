package defpackage;

/* renamed from: aczb */
final class aczb extends adac {
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;

    public final boolean a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        StringBuilder stringBuilder = new StringBuilder(165);
        stringBuilder.append("MdxBackgroundScanConfig{enabled=");
        stringBuilder.append(z);
        stringBuilder.append(", scanDurationSeconds=");
        stringBuilder.append(i);
        stringBuilder.append(", scanPeriodNoDevicesDetectedSeconds=");
        stringBuilder.append(i2);
        stringBuilder.append(", scanPeriodDevicesDetectedSeconds=");
        stringBuilder.append(i3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adac) {
            adac adac = (adac) obj;
            return this.a == adac.a() && this.b == adac.b() && this.c == adac.c() && this.d == adac.d();
        }
    }

    public final int hashCode() {
        return (((((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    /* synthetic */ aczb(boolean z, int i, int i2, int i3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
