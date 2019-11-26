package defpackage;

/* renamed from: uwj */
final /* synthetic */ class uwj implements Runnable {
    private final uwk a;

    uwj(uwk uwk) {
        this.a = uwk;
    }

    public final void run() {
        uwk uwk = this.a;
        uwk.setChecked(true);
        uwk.b.a(uwk.c, true);
        uwk.a.a(uwk.d, true);
    }
}
