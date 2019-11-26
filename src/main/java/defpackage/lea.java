package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: lea */
final /* synthetic */ class lea implements OnClickListener {
    private final leb a;

    lea(leb leb) {
        this.a = leb;
    }

    public final void onClick(View view) {
        leb leb = this.a;
        if (leb.d.a()) {
            leb.a();
        } else {
            leb.e.a(leb.b, null, new lee(leb));
        }
    }
}
