package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: alnz */
final class alnz implements OnCheckedChangeListener {
    private final /* synthetic */ alnw a;

    alnz(alnw alnw) {
        this.a = alnw;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.b.a(z);
    }
}
