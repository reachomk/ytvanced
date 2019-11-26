package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: wvd */
final class wvd implements OnClickListener {
    private final /* synthetic */ wuw a;

    wvd(wuw wuw) {
        this.a = wuw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
