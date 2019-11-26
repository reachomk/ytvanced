package defpackage;

/* renamed from: oby */
final /* synthetic */ class oby implements Runnable {
    private final obr a;
    private final odk b;

    oby(obr obr, odk odk) {
        this.a = obr;
        this.b = odk;
    }

    public final void run() {
        obr obr = this.a;
        odk odk = this.b;
        odk.a();
        obr.a.d(odk);
    }
}
