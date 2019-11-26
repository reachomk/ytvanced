package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: advu */
final /* synthetic */ class advu implements OnClickListener {
    private final advv a;

    advu(advv advv) {
        this.a = advv;
    }

    public final void onClick(View view) {
        advv advv = this.a;
        String str = "";
        advv.f.setText(str);
        advv.g.setText(str);
        advv.h.setText(str);
        advv.i.setText(str);
        advv.f.requestFocus();
    }
}
