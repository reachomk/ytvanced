package defpackage;

/* renamed from: uwh */
final /* synthetic */ class uwh implements Runnable {
    private final uwi a;

    uwh(uwi uwi) {
        this.a = uwi;
    }

    public final void run() {
        uwi uwi = this.a;
        int i = uwi.a;
        if (i >= 0) {
            uwi.setValueIndex(i);
            uwi.setSummary(((axgu) uwi.b.get(uwi.a)).b);
            int i2 = 0;
            while (i2 < uwi.b.size()) {
                uwi.c.a((axgu) uwi.b.get(i2), i2 == uwi.a);
                i2++;
            }
        }
    }
}
