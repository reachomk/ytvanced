package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iwd */
final /* synthetic */ class iwd implements OnClickListener {
    private final iwa a;
    private final apxu b;

    iwd(iwa iwa, apxu apxu) {
        this.a = iwa;
        this.b = apxu;
    }

    public final void onClick(View view) {
        iwa iwa = this.a;
        iwa.a.a(this.b, null);
    }
}
