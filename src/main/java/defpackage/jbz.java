package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;

/* renamed from: jbz */
final /* synthetic */ class jbz implements Runnable {
    private final Context a;
    private final String b;
    private final OnClickListener c;

    jbz(Context context, String str, OnClickListener onClickListener) {
        this.a = context;
        this.b = str;
        this.c = onClickListener;
    }

    public final void run() {
        Context context = this.a;
        String str = this.b;
        new Builder(context).setMessage(str).setPositiveButton("Restart", this.c).setNegativeButton(17039360, null).show();
    }
}
