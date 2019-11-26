package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: glf */
final /* synthetic */ class glf implements OnDismissListener {
    private final glg a;

    glf(glg glg) {
        this.a = glg;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.c.b();
    }
}
