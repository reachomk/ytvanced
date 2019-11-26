package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.Map;

/* renamed from: fvv */
final /* synthetic */ class fvv implements OnClickListener {
    private final fvw a;
    private final apxu b;
    private final Map c;

    fvv(fvw fvw, apxu apxu, Map map) {
        this.a = fvw;
        this.b = apxu;
        this.c = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b(this.b, this.c);
    }
}
