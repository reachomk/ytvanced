package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: zfh */
final class zfh implements OnClickListener {
    private final /* synthetic */ Runnable a;

    zfh(Runnable runnable) {
        this.a = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.run();
        dialogInterface.dismiss();
    }
}
