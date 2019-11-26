package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: hfq */
final /* synthetic */ class hfq implements OnCheckedChangeListener {
    private final hfo a;

    hfq(hfo hfo) {
        this.a = hfo;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        hfo hfo = this.a;
        amqw.a(hfo.e);
        hfo.e.a(!z ? adih.DISABLED : adih.ENABLED);
    }
}
