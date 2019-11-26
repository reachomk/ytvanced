package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioGroup;
import com.google.android.youtube.R;

/* renamed from: hxa */
final /* synthetic */ class hxa implements OnClickListener {
    private final hwx a;

    hxa(hwx hwx) {
        this.a = hwx;
    }

    public final void onClick(View view) {
        hwx hwx = this.a;
        RadioGroup radioGroup = (RadioGroup) hwx.d.findViewById(R.id.option_items_list);
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId != -1) {
            Object tag = radioGroup.findViewById(checkedRadioButtonId).getTag();
            aaas aaas;
            apxu apxu;
            if (tag instanceof avum) {
                new hwx(hwx.a, hwx.b).a((avum) tag);
            } else if (tag instanceof avui) {
                avui avui = (avui) tag;
                aaas = hwx.b;
                apxu = avui.c;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            } else if (tag instanceof avue) {
                avue avue = (avue) tag;
                aaas = hwx.b;
                apxu = avue.c;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
            hwx.c.dismiss();
        }
    }
}
