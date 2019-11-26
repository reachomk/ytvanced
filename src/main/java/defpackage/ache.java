package defpackage;

/* renamed from: ache */
final class ache {
    public final boolean a;
    public int b = 44100;
    public int c = 1;
    public final int d;
    public boolean e = false;

    ache(int i, boolean z) {
        this.d = i;
        this.a = z;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        boolean z2 = this.e;
        StringBuilder stringBuilder = new StringBuilder(114);
        stringBuilder.append("[ specifyProfile=");
        stringBuilder.append(z);
        stringBuilder.append(", sampleRate=");
        stringBuilder.append(i);
        stringBuilder.append(", channelCount=");
        stringBuilder.append(i2);
        stringBuilder.append(", bitrate=");
        stringBuilder.append(i3);
        stringBuilder.append(", isSupported=");
        stringBuilder.append(z2);
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }
}
