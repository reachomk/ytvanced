package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abtr */
final class abtr implements OnClickListener {
    private final /* synthetic */ aufj a;
    private final /* synthetic */ acvs b;
    private final /* synthetic */ abto c;

    abtr(abto abto, aufj aufj, acvs acvs) {
        this.c = abto;
        this.a = aufj;
        this.b = acvs;
    }

    public final void onClick(View view) {
        aaas aaas = this.c.b;
        apxu apxu = this.a.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
        this.c.a.a(3, this.b, null);
    }
}
