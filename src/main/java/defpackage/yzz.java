package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;

/* renamed from: yzz */
public final /* synthetic */ class yzz implements OnClickListener {
    private final yzw a;

    public yzz(yzw yzw) {
        this.a = yzw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        yzw yzw = this.a;
        yzw.c.a(((Editable) yzw.b.getText()).toString());
    }
}
