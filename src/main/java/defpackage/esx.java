package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: esx */
final /* synthetic */ class esx implements OnClickListener {
    private final esy a;
    private final aygq b;

    esx(esy esy, aygq aygq) {
        this.a = esy;
        this.b = aygq;
    }

    public final void onClick(View view) {
        esy esy = this.a;
        Object obj = this.b;
        aaas aaas = esy.a;
        apxu apxu = obj.h;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, acwi.a(obj));
    }
}
