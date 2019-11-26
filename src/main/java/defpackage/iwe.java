package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iwe */
final /* synthetic */ class iwe implements OnClickListener {
    private final iwa a;
    private final apxu b;

    iwe(iwa iwa, apxu apxu) {
        this.a = iwa;
        this.b = apxu;
    }

    public final void onClick(View view) {
        iwa iwa = this.a;
        iwa.a.a(this.b, null);
    }
}
