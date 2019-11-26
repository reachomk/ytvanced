package defpackage;

import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;

/* renamed from: urd */
final class urd implements OnValueChangeListener {
    private final /* synthetic */ uqx a;

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        if (i2 == 0 && i == 11) {
            this.a.aa.add(2, 1);
        } else if (i2 == 11 && i == 0) {
            this.a.aa.add(2, -1);
        } else {
            this.a.aa.add(2, i2 - i);
        }
        this.a.W();
    }

    /* synthetic */ urd(uqx uqx) {
        this.a = uqx;
    }
}
