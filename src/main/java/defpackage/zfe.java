package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: zfe */
final class zfe implements OnClickListener {
    private final /* synthetic */ Runnable a;

    zfe(Runnable runnable) {
        this.a = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.run();
        dialogInterface.dismiss();
    }
}
