package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: yyn */
final /* synthetic */ class yyn implements OnClickListener {
    private final yyl a;

    yyn(yyl yyl) {
        this.a = yyl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a.run();
    }
}
