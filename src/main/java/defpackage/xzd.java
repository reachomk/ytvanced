package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: xzd */
final /* synthetic */ class xzd implements OnClickListener {
    private final xze a;
    private final aphg b;

    xzd(xze xze, aphg aphg) {
        this.a = xze;
        this.b = aphg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        xze xze = this.a;
        aphg aphg = this.b;
        aaas aaas = xze.a;
        apxu apxu = aphg.n;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
