package defpackage;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

/* renamed from: erd */
public final /* synthetic */ class erd implements OnCheckedChangeListener {
    private final era a;

    public erd(era era) {
        this.a = era;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        era era = this.a;
        if (era.c != null) {
            aqxl aqxl = (aqxl) radioGroup.findViewById(i).getTag();
            if (aqxl != null) {
                era.c.a(aqxl.b);
            }
        }
    }
}
