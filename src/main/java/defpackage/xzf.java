package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;

/* renamed from: xzf */
final /* synthetic */ class xzf implements OnShowListener {
    private final xze a;
    private final avll b;

    xzf(xze xze, avll avll) {
        this.a = xze;
        this.b = avll;
    }

    public final void onShow(DialogInterface dialogInterface) {
        xze xze = this.a;
        avll avll = this.b;
        aaas aaas = xze.a;
        apxu apxu = avll.d;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
    }
}
