package defpackage;

/* renamed from: achh */
final class achh {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public boolean g = false;

    achh(int i, int i2, int i3, int i4, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i4;
        this.a = z;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.f;
        boolean z2 = this.g;
        StringBuilder stringBuilder = new StringBuilder(151);
        stringBuilder.append("[ specifyProfile=");
        stringBuilder.append(z);
        stringBuilder.append(", width=");
        stringBuilder.append(i);
        stringBuilder.append(", height=");
        stringBuilder.append(i2);
        stringBuilder.append(", minBitrate=");
        stringBuilder.append(i3);
        stringBuilder.append(", bitrate=");
        stringBuilder.append(i4);
        stringBuilder.append(", maxBitrate=");
        stringBuilder.append(i5);
        stringBuilder.append(", isSupported=");
        stringBuilder.append(z2);
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }
}
