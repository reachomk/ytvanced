package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abuf */
final /* synthetic */ class abuf implements OnClickListener {
    private final abuc a;
    private final apxu b;

    abuf(abuc abuc, apxu apxu) {
        this.a = abuc;
        this.b = apxu;
    }

    public final void onClick(View view) {
        abuc abuc = this.a;
        apxu apxu = this.b;
        if (apxu == null) {
            Object a = abuc.a.a("listenerKey");
            if (a instanceof abyb) {
                ((abyb) a).Z();
            }
            return;
        }
        abuc.b.a(apxu, null);
    }
}
