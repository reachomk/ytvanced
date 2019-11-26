package defpackage;

/* renamed from: cfa */
final class cfa implements cfe {
    private final /* synthetic */ cex a;

    cfa(cex cex) {
        this.a = cex;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 11) + valueOf.length());
        stringBuilder.append(obj);
        stringBuilder.append("{fragment=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
