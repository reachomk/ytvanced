package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: xzg */
final /* synthetic */ class xzg implements OnClickListener {
    private final xze a;
    private final aphg b;

    xzg(xze xze, aphg aphg) {
        this.a = xze;
        this.b = aphg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        xze xze = this.a;
        aphg aphg = this.b;
        aaas aaas = xze.a;
        apxu apxu = aphg.m;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
