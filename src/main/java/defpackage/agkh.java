package defpackage;

/* renamed from: agkh */
final class agkh implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ agkf b;

    agkh(agkf agkf, String str) {
        this.b = agkf;
        this.a = str;
    }

    public final void run() {
        this.b.a.b.setText(this.a);
    }
}
