package defpackage;

/* renamed from: sfa */
final /* synthetic */ class sfa implements Runnable {
    private final sex a;

    sfa(sex sex) {
        this.a = sex;
    }

    public final void run() {
        sex sex = this.a;
        sez sez = sex.a;
        if (sez != null) {
            sez.a(sex.b());
        }
    }
}
