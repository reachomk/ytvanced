package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: gel */
final /* synthetic */ class gel implements OnClickListener {
    private final gei a;

    gel(gei gei) {
        this.a = gei;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        gei gei = this.a;
        nt ntVar = gei.ag;
        if (ntVar != null) {
            ntVar.a().a(gei).a();
        } else {
            xtl.c("fragmentManager is null");
        }
        xpr.a(gei.ae);
    }
}
