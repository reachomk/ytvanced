package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ybu */
final class ybu implements OnClickListener {
    private final /* synthetic */ ybo a;

    ybu(ybo ybo) {
        this.a = ybo;
    }

    public final void onClick(View view) {
        this.a.aq.setVisibility(0);
        this.a.ar.setVisibility(8);
        this.a.d(-2);
    }
}
