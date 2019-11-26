package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: gys */
final /* synthetic */ class gys implements OnCancelListener {
    private final gyl a;

    gys(gyl gyl) {
        this.a = gyl;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.dismiss();
    }
}
