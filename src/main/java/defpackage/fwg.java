package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: fwg */
final /* synthetic */ class fwg implements OnClickListener {
    private final fwd a;
    private final apxu b;

    fwg(fwd fwd, apxu apxu) {
        this.a = fwd;
        this.b = apxu;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(this.b);
    }
}
