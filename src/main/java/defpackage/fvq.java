package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.Map;

/* renamed from: fvq */
final /* synthetic */ class fvq implements OnClickListener {
    private final fvn a;
    private final apxu b;
    private final Map c;

    fvq(fvn fvn, apxu apxu, Map map) {
        this.a = fvn;
        this.b = apxu;
        this.c = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b(this.b, this.c);
    }
}
