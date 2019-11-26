package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: kju */
final class kju implements OnCheckedChangeListener {
    private final /* synthetic */ hwl a;
    private final /* synthetic */ kjs b;

    kju(kjs kjs, hwl hwl) {
        this.b = kjs;
        this.a = hwl;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.a(z);
        kjw kjw = this.b.b;
        if (kjw != null) {
            kjw.a(z);
        }
    }
}
