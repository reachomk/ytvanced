package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ilj */
final /* synthetic */ class ilj implements OnClickListener {
    private final ilf a;

    ilj(ilf ilf) {
        this.a = ilf;
    }

    public final void onClick(View view) {
        ilf ilf = this.a;
        ilf.c.onClick(view);
        ilf.b.onClick(view);
        eyx eyx = new eyx();
        eyx.c(ilf.f);
        bhf.a(ilf.d, eyx);
        ilf.c();
    }
}
