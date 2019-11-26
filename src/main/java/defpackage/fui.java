package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.Map;

/* renamed from: fui */
final /* synthetic */ class fui implements OnClickListener {
    private final fuf a;
    private final apxu b;
    private final Map c;

    fui(fuf fuf, apxu apxu, Map map) {
        this.a = fuf;
        this.b = apxu;
        this.c = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b(this.b, this.c);
    }
}
