package defpackage;

/* renamed from: nnt */
public final class nnt extends Exception {
    public final int a;

    public nnt(int i) {
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("AudioTrack write failed: ");
        stringBuilder.append(i);
        super(stringBuilder.toString());
        this.a = i;
    }
}
