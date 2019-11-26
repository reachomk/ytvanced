package defpackage;

import android.app.Activity;
import android.app.AlertDialog;

/* renamed from: gll */
final class gll implements bqj {
    public final AlertDialog a;
    public final /* synthetic */ glk b;

    gll(glk glk, AlertDialog alertDialog) {
        this.b = glk;
        this.a = alertDialog;
    }

    public final /* synthetic */ void a(Object obj) {
        glk glk = this.b;
        if (!glk.c.a) {
            ((Activity) glk.a).runOnUiThread(new glo(this));
        }
    }
}
