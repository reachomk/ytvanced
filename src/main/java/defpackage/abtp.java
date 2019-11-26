package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abtp */
final class abtp implements OnClickListener {
    private final /* synthetic */ aued a;
    private final /* synthetic */ acvs b;
    private final /* synthetic */ abtm c;

    abtp(abtm abtm, aued aued, acvs acvs) {
        this.c = abtm;
        this.a = aued;
        this.b = acvs;
    }

    public final void onClick(View view) {
        aaas aaas = this.c.a;
        apxu apxu = this.a.r;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, this.c.h);
        this.c.b.a(3, this.b, null);
    }
}
