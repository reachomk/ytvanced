package defpackage;

/* renamed from: cff */
final class cff implements cfe {
    private final /* synthetic */ cfg a;

    cff(cfg cfg) {
        this.a = cfg;
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
