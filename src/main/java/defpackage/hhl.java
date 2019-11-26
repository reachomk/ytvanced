package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: hhl */
final /* synthetic */ class hhl implements OnClickListener {
    private final hhi a;
    private final agqy b;

    hhl(hhi hhi, agqy agqy) {
        this.a = hhi;
        this.b = agqy;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        hhi hhi = this.a;
        agqy agqy = this.b;
        ((ahcn) hhi.a.get()).a(agqy.a(), agqy.A(), null, (acvx) hhi.b.get());
    }
}
