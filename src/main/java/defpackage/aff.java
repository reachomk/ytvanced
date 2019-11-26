package defpackage;

import android.view.Menu;
import android.view.Window.Callback;

/* renamed from: aff */
final class aff implements ajm {
    private final /* synthetic */ aek a;

    aff(aek aek) {
        this.a = aek;
    }

    public final void a(aiw aiw, boolean z) {
        Menu m = aiw.m();
        afc a = this.a.a(m == aiw ? aiw : m);
        if (a == null) {
            return;
        }
        if (m != aiw) {
            this.a.a(a.a, a, m);
            this.a.a(a, true);
            return;
        }
        this.a.a(a, z);
    }

    public final boolean a(aiw aiw) {
        if (aiw == null) {
            aek aek = this.a;
            if (aek.k) {
                Callback e = aek.e();
                if (!(e == null || this.a.m)) {
                    e.onMenuOpened(108, null);
                }
            }
        }
        return true;
    }
}
