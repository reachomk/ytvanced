package defpackage;

/* renamed from: qn */
final class qn implements qq {
    private final String a;
    private final int b;
    private final String c;

    qn(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final void a(pj pjVar) {
        pjVar.a(this.a, this.b, this.c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CancelTask[");
        stringBuilder.append("packageName:");
        stringBuilder.append(this.a);
        stringBuilder.append(", id:");
        stringBuilder.append(this.b);
        stringBuilder.append(", tag:");
        stringBuilder.append(this.c);
        stringBuilder.append(", all:false]");
        return stringBuilder.toString();
    }
}
