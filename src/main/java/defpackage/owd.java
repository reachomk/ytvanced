package defpackage;

/* renamed from: owd */
public final class owd extends owb {
    public final int a;

    public owd(int i, ovm ovm) {
        StringBuilder stringBuilder = new StringBuilder(26);
        stringBuilder.append("Response code: ");
        stringBuilder.append(i);
        super(stringBuilder.toString(), ovm, 1);
        this.a = i;
    }
}
