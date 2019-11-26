package defpackage;

/* renamed from: ajlf */
final /* synthetic */ class ajlf implements Runnable {
    private final ajlg a;

    ajlf(ajlg ajlg) {
        this.a = ajlg;
    }

    public final void run() {
        ajlg ajlg = this.a;
        wq wqVar = ajlg.c;
        if (wqVar != null) {
            vl vlVar = ajlg.d;
            if (vlVar != null) {
                wqVar.a(vlVar.a());
            }
        }
        ajlg.d = null;
    }
}
