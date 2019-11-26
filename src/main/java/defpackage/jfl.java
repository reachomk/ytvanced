package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

/* renamed from: jfl */
final class jfl implements OnClickListener {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ jfm b;

    jfl(jfm jfm, Intent intent) {
        this.b = jfm;
        this.a = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.a.startActivity(this.a);
    }
}
