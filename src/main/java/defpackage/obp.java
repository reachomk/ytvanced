package defpackage;

/* renamed from: obp */
public final class obp extends Exception {
    public obp(int i, int i2, int i3) {
        StringBuilder stringBuilder = new StringBuilder(78);
        stringBuilder.append("Unhandled format: ");
        stringBuilder.append(i);
        stringBuilder.append(" Hz, ");
        stringBuilder.append(i2);
        stringBuilder.append(" channels in encoding ");
        stringBuilder.append(i3);
        super(stringBuilder.toString());
    }
}
