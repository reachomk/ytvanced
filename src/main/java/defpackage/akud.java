package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: akud */
final /* synthetic */ class akud implements OnClickListener {
    private final akty a;

    akud(akty akty) {
        this.a = akty;
    }

    public final void onClick(View view) {
        akty akty = this.a;
        if (!akty.i) {
            akty.i = true;
            akty.h();
            akty.j();
        }
    }
}
