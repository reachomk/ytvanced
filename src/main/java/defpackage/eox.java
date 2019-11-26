package defpackage;

import android.view.View;

/* renamed from: eox */
final /* synthetic */ class eox implements eow {
    private final View a;
    private final bcaa b;

    eox(View view, bcaa bcaa) {
        this.a = view;
        this.b = bcaa;
    }

    public final void a(boolean z) {
        View view = this.a;
        bcaa bcaa = this.b;
        String valueOf = String.valueOf(view);
        String valueOf2 = String.valueOf(view.getParent());
        valueOf.length();
        valueOf2.length();
        xpw xpw = (xpw) bcaa.get();
        if (!z) {
            view = null;
        }
        xpw.a(view);
    }
}
