package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kav */
final /* synthetic */ class kav implements OnClickListener {
    private final kas a;

    kav(kas kas) {
        this.a = kas;
    }

    public final void onClick(View view) {
        kas kas = this.a;
        jif jif = kas.c;
        if (jif != null) {
            jif.a(kas, kas.b);
        }
        kas.a.onClick(view);
    }
}
