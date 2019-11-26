package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zua */
final class zua implements OnClickListener {
    private final /* synthetic */ zwj a;
    private final /* synthetic */ arwn b;

    zua(zwj zwj, arwn arwn) {
        this.a = zwj;
        this.b = arwn;
    }

    public final void onClick(View view) {
        zwj zwj = this.a;
        if (zwj.g) {
            aaas aaas = zwj.l;
            apxu apxu = this.b.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
