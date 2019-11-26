package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: gwb */
final class gwb implements OnCheckedChangeListener {
    private final /* synthetic */ axgk a;
    private final /* synthetic */ gvy b;

    gwb(gvy gvy, axgk axgk) {
        this.b = gvy;
        this.a = axgk;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        apxu apxu;
        this.b.b.a(this.a, z);
        if (z) {
            apxu = this.a.g;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = this.a.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        this.b.a.a(apxu, null);
    }
}
