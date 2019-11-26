package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

/* renamed from: aksc */
final class aksc implements OnItemSelectedListener {
    private final Spinner a;
    private final String b;
    private final /* synthetic */ akrz c;

    public aksc(akrz akrz, Spinner spinner, String str) {
        this.c = akrz;
        this.a = spinner;
        this.b = str;
    }

    public final void onNothingSelected(AdapterView adapterView) {
        this.c.b();
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.c.b();
        aqyf aqyf = (aqyf) this.a.getSelectedItem();
        String str = this.b;
        if (str != null && aqyf != null && (aqyf.a & 128) != 0) {
            Spinner spinner = this.a;
            aodv aodv = aqyf.h;
            if (aodv == null) {
                aodv = aodv.c;
            }
            String str2 = aodv.b;
            StringBuilder stringBuilder = new StringBuilder((str.length() + 1) + String.valueOf(str2).length());
            stringBuilder.append(str);
            stringBuilder.append(" ");
            stringBuilder.append(str2);
            spinner.setContentDescription(stringBuilder.toString());
        }
    }
}
