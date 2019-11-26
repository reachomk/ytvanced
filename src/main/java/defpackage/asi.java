package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;

/* renamed from: asi */
final class asi implements OnClickListener {
    private final aig a = new aig(this.b.a.getContext(), this.b.b);
    private final /* synthetic */ asj b;

    asi(asj asj) {
        this.b = asj;
    }

    public final void onClick(View view) {
        asj asj = this.b;
        Callback callback = asj.c;
        if (callback != null && asj.d) {
            callback.onMenuItemSelected(0, this.a);
        }
    }
}
