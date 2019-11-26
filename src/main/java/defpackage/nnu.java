package defpackage;

/* renamed from: nnu */
public final class nnu extends Exception {
    public final int a;

    public nnu(int i, int i2, int i3, int i4) {
        StringBuilder stringBuilder = new StringBuilder(82);
        stringBuilder.append("AudioTrack init failed: ");
        stringBuilder.append(i);
        stringBuilder.append(", Config(");
        stringBuilder.append(i2);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(i3);
        stringBuilder.append(str);
        stringBuilder.append(i4);
        stringBuilder.append(")");
        super(stringBuilder.toString());
        this.a = i;
    }
}
