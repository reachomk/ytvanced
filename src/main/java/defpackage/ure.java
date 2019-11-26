package defpackage;

import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;

/* renamed from: ure */
final class ure implements OnValueChangeListener {
    private final /* synthetic */ uqx a;

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        int actualMaximum = this.a.aa.getActualMaximum(5);
        int X = this.a.X();
        if (i2 == 1 && i == actualMaximum) {
            this.a.aa.add(5, 1);
        } else if (i2 == X && i == 1) {
            this.a.aa.add(5, -1);
        } else {
            this.a.aa.add(5, i2 - i);
        }
        this.a.W();
    }

    /* synthetic */ ure(uqx uqx) {
        this.a = uqx;
    }
}
