package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: gyq */
final /* synthetic */ class gyq implements OnClickListener {
    private final gyl a;
    private final azns b;

    gyq(gyl gyl, azns azns) {
        this.a = gyl;
        this.b = azns;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(this.b);
    }
}
