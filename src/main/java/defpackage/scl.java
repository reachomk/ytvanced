package defpackage;

import android.os.Bundle;
import com.google.android.youtube.R;

/* renamed from: scl */
final class scl implements Runnable {
    private final /* synthetic */ sci a;

    scl(sci sci) {
        this.a = sci;
    }

    public final void run() {
        this.a.a.ac.b(false);
        scf scf = this.a.a;
        String a = scf.a((int) R.string.ccl_failed_authorization_timeout);
        scg scg = new scg();
        Bundle bundle = new Bundle();
        bundle.putString("message", a);
        scg.f(bundle);
        scg.a(scf.v, "dlg");
        scf = this.a.a;
        scf.ab = false;
        sbu sbu = scf.Z;
        if (sbu != null && sbu.f() == 2) {
            this.a.a.Z.g();
        }
    }
}
