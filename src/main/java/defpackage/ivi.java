package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

/* renamed from: ivi */
final class ivi implements OnItemSelectedListener {
    private final /* synthetic */ akby a;
    private final /* synthetic */ ivg b;

    ivi(ivg ivg, akby akby) {
        this.b = ivg;
        this.a = akby;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        CharSequence charSequence;
        this.a.setExtension(akbx.a, Integer.valueOf(i));
        xpr.a(this.b.c, ajqy.a(this.a.d[i]));
        this.b.b.d(new isq(i));
        Spinner spinner = this.b.d;
        arml arml = this.a.b[i];
        armn armn = arml.e;
        if (armn == null) {
            armn = armn.c;
        }
        if ((armn.a & 1) != 0) {
            armn armn2 = arml.e;
            if (armn2 == null) {
                armn2 = armn.c;
            }
            aodv aodv = armn2.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            charSequence = aodv.b;
        } else {
            charSequence = null;
        }
        spinner.setContentDescription(charSequence);
    }
}
