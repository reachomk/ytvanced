package defpackage;

/* renamed from: ahqk */
final class ahqk implements Runnable {
    private final /* synthetic */ double a;
    private final /* synthetic */ double b;
    private final /* synthetic */ String c;
    private final /* synthetic */ ahqj d;

    ahqk(ahqj ahqj, double d, double d2, String str) {
        this.d = ahqj;
        this.a = d;
        this.b = d2;
        this.c = str;
    }

    public final void run() {
        ajex ajex = this.d.n;
        double d = this.a;
        double d2 = this.b;
        String str = this.c;
        String d3 = Double.toString(d);
        String d4 = Double.toString(d2);
        int length = String.valueOf(d3).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 2) + String.valueOf(d4).length()) + String.valueOf(str).length());
        stringBuilder.append(d3);
        d3 = ":";
        stringBuilder.append(d3);
        stringBuilder.append(d4);
        stringBuilder.append(d3);
        stringBuilder.append(str);
        ajex.a(stringBuilder.toString());
    }
}
