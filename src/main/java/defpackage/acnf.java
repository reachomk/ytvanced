package defpackage;

/* renamed from: acnf */
final /* synthetic */ class acnf implements Runnable {
    private final acnc a;

    acnf(acnc acnc) {
        this.a = acnc;
    }

    public final void run() {
        acnc acnc = this.a;
        acnc.aB.setMaxLines(acnc.aB.getLineCount());
    }
}
