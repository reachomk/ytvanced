package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: klx */
final /* synthetic */ class klx implements OnClickListener {
    private final klu a;
    private final aygq b;

    klx(klu klu, aygq aygq) {
        this.a = klu;
        this.b = aygq;
    }

    public final void onClick(View view) {
        klu klu = this.a;
        Object obj = this.b;
        aaas aaas = klu.a;
        apxu apxu = obj.h;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, acwi.a(obj));
    }
}
