package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: yri */
final /* synthetic */ class yri implements OnClickListener {
    private final yrf a;
    private final yrd b;

    yri(yrf yrf, yrd yrd) {
        this.a = yrf;
        this.b = yrd;
    }

    public final void onClick(View view) {
        yrf yrf = this.a;
        yrf.q.a(this.b);
    }
}
