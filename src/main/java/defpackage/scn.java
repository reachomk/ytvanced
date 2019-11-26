package defpackage;

import java.util.TimerTask;

/* renamed from: scn */
final class scn extends TimerTask {
    public final /* synthetic */ scf a;

    public final void run() {
        this.a.aa.post(new scm(this));
    }

    /* synthetic */ scn(scf scf) {
        this.a = scf;
    }
}
