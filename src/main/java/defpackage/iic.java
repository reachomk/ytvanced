package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iic */
final class iic implements OnClickListener {
    private final /* synthetic */ ihy a;

    iic(ihy ihy) {
        this.a = ihy;
    }

    public final void onClick(View view) {
        ihy ihy = this.a;
        vwe vwe = ihy.d;
        if (vwe != null) {
            vwe.a(ihy.b, ihy.c);
        }
    }
}
