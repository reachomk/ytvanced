package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: wea */
final /* synthetic */ class wea implements OnClickListener {
    private final Context a;
    private final asop b;
    private final wcx c;

    wea(Context context, asop asop, wcx wcx) {
        this.a = context;
        this.b = asop;
        this.c = wcx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wdx.a(this.a, this.b, this.c);
    }
}
