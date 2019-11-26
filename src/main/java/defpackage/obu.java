package defpackage;

/* renamed from: obu */
final /* synthetic */ class obu implements Runnable {
    private final obr a;
    private final odk b;

    obu(obr obr, odk odk) {
        this.a = obr;
        this.b = odk;
    }

    public final void run() {
        obr obr = this.a;
        obr.a.c(this.b);
    }
}
