package defpackage;

import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;

/* renamed from: urg */
final class urg implements OnValueChangeListener {
    private final /* synthetic */ uqx a;

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        this.a.aa.add(1, i2 - i);
        this.a.W();
    }

    /* synthetic */ urg(uqx uqx) {
        this.a = uqx;
    }
}
