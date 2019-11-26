package defpackage;

import android.view.Window.Callback;

/* renamed from: aev */
final class aev implements ajm {
    private final /* synthetic */ aek a;

    aev(aek aek) {
        this.a = aek;
    }

    public final boolean a(aiw aiw) {
        Callback e = this.a.e();
        if (e != null) {
            e.onMenuOpened(108, aiw);
        }
        return true;
    }

    public final void a(aiw aiw, boolean z) {
        this.a.b(aiw);
    }
}
