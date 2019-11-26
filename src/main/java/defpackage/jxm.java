package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: jxm */
final /* synthetic */ class jxm implements OnCheckedChangeListener {
    private final hwl a;

    jxm(hwl hwl) {
        this.a = hwl;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.a(z);
    }
}
