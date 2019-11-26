package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Pair;

/* renamed from: ahav */
final /* synthetic */ class ahav implements OnClickListener {
    private final ahaw a;
    private final ahcr b;
    private final Pair c;

    ahav(ahaw ahaw, ahcr ahcr, Pair pair) {
        this.a = ahaw;
        this.b = ahcr;
        this.c = pair;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ahaw ahaw = this.a;
        ahcr ahcr = this.b;
        Pair pair = this.c;
        if (i == -1) {
            if (ahcr != null) {
                ahcr.a();
            }
            ((Runnable) pair.second).run();
        } else if (i == -2 && ahcr != null) {
            ahcr.b();
        }
        ahaw.a();
    }
}
