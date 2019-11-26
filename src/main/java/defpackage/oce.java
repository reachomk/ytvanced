package defpackage;

/* renamed from: oce */
public final class oce extends Exception {
    public final int a;

    public oce(int i) {
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("AudioTrack write failed: ");
        stringBuilder.append(i);
        super(stringBuilder.toString());
        this.a = i;
    }
}
