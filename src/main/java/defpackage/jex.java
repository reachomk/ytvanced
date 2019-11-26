package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: jex */
final /* synthetic */ class jex implements OnCheckedChangeListener {
    private final jet a;

    jex(jet jet) {
        this.a = jet;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        jet jet = this.a;
        jet.b.a(z);
        if (z) {
            jet.c.performClick();
        } else {
            jet.b();
        }
    }
}
