package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;

/* renamed from: usd */
final class usd implements OnItemSelectedListener {
    private final /* synthetic */ EditText a;
    private final /* synthetic */ usc b;

    usd(usc usc, EditText editText) {
        this.b = usc;
        this.a = editText;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (adapterView.getSelectedItem() != usg.a) {
            arml arml;
            aqyb aqyb = (aqyb) adapterView.getSelectedItem();
            EditText editText = this.a;
            aqyf aqyf = aqyb.e;
            if (aqyf == null) {
                aqyf = aqyf.k;
            }
            if ((aqyf.a & 1) != 0) {
                aqyf = aqyb.e;
                if (aqyf == null) {
                    aqyf = aqyf.k;
                }
                arml = aqyf.d;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            editText.setText(ajqy.a(arml));
            usc usc = this.b;
            aqyf aqyf2 = aqyb.e;
            if (aqyf2 == null) {
                aqyf2 = aqyf.k;
            }
            usc.d = aqyf2.f;
        }
    }
}
