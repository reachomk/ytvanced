package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: xwy */
public final /* synthetic */ class xwy implements OnClickListener {
    private final xwv a;
    private final xwx b;
    private final String c;

    public xwy(xwv xwv, xwx xwx, String str) {
        this.a = xwv;
        this.b = xwx;
        this.c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        xwv xwv = this.a;
        xwx xwx = this.b;
        String str = this.c;
        if (i == -1) {
            xwv.a(xwx, str);
        }
    }
}
