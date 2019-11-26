package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.NumberPicker;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: mkw */
public final class mkw extends FrameLayout {
    private final NumberPicker a = ((NumberPicker) findViewById(R.id.hours_picker));
    private final NumberPicker b = ((NumberPicker) findViewById(R.id.minutes_picker));
    private List c;
    private List d;

    public mkw(Context context) {
        super(context, null, 0);
        setLayoutParams(new LayoutParams(-1, -2));
        mkw.inflate(context, R.layout.watch_break_frequency_picker, this);
    }

    public final void a(List list, List list2) {
        amqw.a(list.isEmpty() ^ 1);
        amqw.a(list2.isEmpty() ^ 1);
        this.c = list;
        this.d = list2;
        mkw.a(this.a, this.c);
        mkw.a(this.b, this.d);
    }

    public final void a(int i) {
        List list = this.c;
        Integer valueOf = Integer.valueOf(i);
        amqw.a(list.contains(valueOf));
        this.a.setValue(this.c.indexOf(valueOf));
    }

    public final void b(int i) {
        List list = this.d;
        Integer valueOf = Integer.valueOf(i);
        amqw.a(list.contains(valueOf));
        this.b.setValue(this.d.indexOf(valueOf));
    }

    public final int a() {
        return ((Integer) this.c.get(this.a.getValue())).intValue();
    }

    public final int b() {
        return ((Integer) this.d.get(this.b.getValue())).intValue();
    }

    private static void a(NumberPicker numberPicker, List list) {
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(list.size() - 1);
        numberPicker.setDisplayedValues((String[]) amux.a(anhg.a.a().a((Iterable) list), String.class));
    }
}
