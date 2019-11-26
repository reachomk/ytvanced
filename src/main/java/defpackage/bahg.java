package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: bahg */
final class bahg implements OnCancelListener {
    private final /* synthetic */ Runnable a;

    bahg(Runnable runnable) {
        this.a = runnable;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.run();
    }
}
