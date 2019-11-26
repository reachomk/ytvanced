package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: igk */
final class igk implements OnClickListener {
    private final int a;
    private final /* synthetic */ igd b;

    public igk(igd igd, int i) {
        this.b = igd;
        this.a = i;
    }

    public final void onClick(View view) {
        igd igd = this.b;
        int i = this.a;
        int isSelected = view.isSelected() ^ 1;
        igd.a(i, isSelected);
        if (igd.e) {
            if (isSelected != 0) {
                isSelected = igd.f;
                if (i < isSelected) {
                    igd.a(isSelected, false);
                } else {
                    for (isSelected = 0; isSelected < igd.f; isSelected++) {
                        igd.a(isSelected, false);
                    }
                }
            }
            igd.h();
            return;
        }
        igd.i();
    }
}
