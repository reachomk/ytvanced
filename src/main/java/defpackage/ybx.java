package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;

/* renamed from: ybx */
final class ybx implements OnClickListener {
    private final /* synthetic */ ybv a;

    ybx(ybv ybv) {
        this.a = ybv;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        xpr.a(this.a.ab);
        ybv ybv = this.a;
        ybv.aa.a(((Editable) ybv.ab.getText()).toString());
        this.a.dismiss();
    }
}
