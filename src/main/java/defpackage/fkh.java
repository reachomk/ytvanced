package defpackage;

/* renamed from: fkh */
final /* synthetic */ class fkh implements Runnable {
    private final fke a;

    fkh(fke fke) {
        this.a = fke;
    }

    public final void run() {
        fke fke = this.a;
        Integer num = fke.e;
        if (num != null) {
            fke.a(num.intValue());
        }
    }
}
