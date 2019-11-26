package defpackage;

/* renamed from: pap */
final /* synthetic */ class pap implements Runnable {
    private final pak a;
    private final odk b;

    pap(pak pak, odk odk) {
        this.a = pak;
        this.b = odk;
    }

    public final void run() {
        pak pak = this.a;
        odk odk = this.b;
        odk.a();
        pak.a.b(odk);
    }
}
