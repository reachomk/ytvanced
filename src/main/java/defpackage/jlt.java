package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: jlt */
final class jlt implements OnClickListener {
    private final /* synthetic */ jlq a;

    jlt(jlq jlq) {
        this.a = jlq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(false);
        this.a.a(1);
        dialogInterface.dismiss();
    }
}
