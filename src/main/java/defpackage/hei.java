package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hei */
final /* synthetic */ class hei implements OnClickListener {
    private final hef a;

    hei(hef hef) {
        this.a = hef;
    }

    public final void onClick(View view) {
        hef hef = this.a;
        if (view.equals(hef.c)) {
            hef.b.a(hef.c.isSelected() ^ 1);
            hef.a();
            return;
        }
        if (view.equals(hef.d)) {
            hef.b.b(hef.d.isSelected() ^ 1);
            hef.a();
        }
    }
}
