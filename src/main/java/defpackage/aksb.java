package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: aksb */
final /* synthetic */ class aksb implements OnClickListener {
    private final akrz a;

    aksb(akrz akrz) {
        this.a = akrz;
    }

    public final void onClick(View view) {
        akrz akrz = this.a;
        xpr.a(akrz.getCurrentFocus());
        akrz.b.a(akrz, akrz.e.getText().toString(), (aqyf) akrz.f.getSelectedItem(), (aqyf) akrz.g.getSelectedItem(), akrz.h.getText().toString());
    }
}
