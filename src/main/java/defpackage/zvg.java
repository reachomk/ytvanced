package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zvg */
final class zvg implements OnClickListener {
    private final /* synthetic */ zwj a;
    private final /* synthetic */ arxt b;

    zvg(zwj zwj, arxt arxt) {
        this.a = zwj;
        this.b = arxt;
    }

    public final void onClick(View view) {
        zwj zwj = this.a;
        if (zwj.g) {
            aaas aaas = zwj.l;
            apxu apxu = this.b.i;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
