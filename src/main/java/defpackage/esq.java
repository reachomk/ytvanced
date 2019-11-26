package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: esq */
final /* synthetic */ class esq implements OnClickListener {
    private final eso a;
    private final axwa b;

    esq(eso eso, axwa axwa) {
        this.a = eso;
        this.b = axwa;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(this.b, false, false);
    }
}
