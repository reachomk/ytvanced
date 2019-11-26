package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: aldq */
final /* synthetic */ class aldq implements OnCheckedChangeListener {
    private final aldp a;
    private final axxt b;

    aldq(aldp aldp, axxt axxt) {
        this.a = aldp;
        this.b = axxt;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.a(this.b, z);
    }
}
