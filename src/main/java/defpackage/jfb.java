package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.NumberPicker;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: jfb */
public final class jfb extends FrameLayout {
    private final NumberPicker a = ((NumberPicker) findViewById(R.id.time_picker));
    private List b;

    public jfb(Context context) {
        super(context, null, 0);
        setLayoutParams(new LayoutParams(-1, -2));
        jfb.inflate(context, R.layout.setting_time_picker, this);
    }

    public final void a(List list) {
        if (!list.isEmpty()) {
            this.b = list;
            NumberPicker numberPicker = this.a;
            Iterable iterable = this.b;
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(iterable.size() - 1);
            numberPicker.setDisplayedValues((String[]) amux.a(iterable, String.class));
        }
    }

    public final void a(String str) {
        if (this.b.contains(str)) {
            this.a.setValue(this.b.indexOf(str));
        }
    }

    public final int a() {
        return this.a.getValue();
    }

    public final String b() {
        return (String) this.b.get(this.a.getValue());
    }
}
