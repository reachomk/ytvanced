package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: eta */
final /* synthetic */ class eta implements OnClickListener {
    private final esy a;
    private final etc b;
    private final akor c;

    eta(esy esy, etc etc, akor akor) {
        this.a = esy;
        this.b = etc;
        this.c = akor;
    }

    public final void onClick(View view) {
        esy esy = this.a;
        etc etc = this.b;
        akor akor = this.c;
        Map a = acwi.a(etc.a, false);
        a.putAll(akor.b());
        aaas aaas = esy.a;
        apxu apxu = etc.a.f;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, a);
    }
}
