package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: fea */
final /* synthetic */ class fea implements OnClickListener {
    private final fdn a;
    private final fdl b;

    fea(fdn fdn, fdl fdl) {
        this.a = fdn;
        this.b = fdl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(this.b);
    }
}
