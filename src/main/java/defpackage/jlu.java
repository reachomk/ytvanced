package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: jlu */
final class jlu implements OnClickListener {
    private final /* synthetic */ jlq a;

    jlu(jlq jlq) {
        this.a = jlq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.d.setChecked(true);
        dialogInterface.dismiss();
    }
}
