package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: ers */
final /* synthetic */ class ers implements OnClickListener {
    private final erq a;
    private final eru b;
    private final akor c;

    ers(erq erq, eru eru, akor akor) {
        this.a = erq;
        this.b = eru;
        this.c = akor;
    }

    public final void onClick(View view) {
        erq erq = this.a;
        eru eru = this.b;
        akor akor = this.c;
        Map a = acwi.a(eru.a, false);
        a.putAll(akor.b());
        aaas aaas = erq.a;
        apxu apxu = eru.a.f;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, a);
    }
}
