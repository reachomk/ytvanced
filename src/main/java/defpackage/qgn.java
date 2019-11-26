package defpackage;

import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: qgn */
public final class qgn {
    public final GoogleHelp a;
    public final qgp b;

    public qgn(GoogleHelp googleHelp) {
        qgm qgm = new qgm();
        this.a = googleHelp;
        this.b = qgm;
    }

    public final void a(Runnable runnable) {
        Thread a = this.b.a(runnable);
        a.setPriority(4);
        a.start();
    }
}
