package defpackage;

/* renamed from: paj */
final /* synthetic */ class paj implements Runnable {
    private final pak a;
    private final odk b;

    paj(pak pak, odk odk) {
        this.a = pak;
        this.b = odk;
    }

    public final void run() {
        pak pak = this.a;
        pak.a.a(this.b);
    }
}
