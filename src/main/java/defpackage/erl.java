package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: erl */
final class erl implements OnClickListener {
    private final /* synthetic */ erm a;

    erl(erm erm) {
        this.a = erm;
    }

    public final void onClick(View view) {
        erk erk = this.a.h;
        aaas aaas = erk.b;
        apxu apxu = erk.c.h;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
        erk = this.a.h;
        erk.a.c(new akwd(erk.c));
    }
}
