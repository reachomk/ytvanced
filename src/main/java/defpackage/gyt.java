package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: gyt */
final /* synthetic */ class gyt implements OnClickListener {
    private final gyl a;

    gyt(gyl gyl) {
        this.a = gyl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
