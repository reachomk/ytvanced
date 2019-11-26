package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: glj */
final /* synthetic */ class glj implements OnDismissListener {
    private final glk a;

    glj(glk glk) {
        this.a = glk;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.b.b();
    }
}
