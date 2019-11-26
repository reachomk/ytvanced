package defpackage;

/* renamed from: agkk */
final /* synthetic */ class agkk implements Runnable {
    private final agki a;
    private final String b;

    agkk(agki agki, String str) {
        this.a = agki;
        this.b = str;
    }

    public final void run() {
        agki agki = this.a;
        agki.a.c.setText(this.b);
    }
}
