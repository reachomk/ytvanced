package defpackage;

/* renamed from: bcfz */
public final class bcfz extends Exception {
    public final String a;

    public bcfz(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Missing mandatory configuration field: ");
        stringBuilder.append(str);
        super(stringBuilder.toString());
        this.a = str;
    }
}
