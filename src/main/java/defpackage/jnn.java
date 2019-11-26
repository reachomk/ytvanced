package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jnn */
public final class jnn implements OnClickListener {
    private final /* synthetic */ Object a;
    private final /* synthetic */ jno b;

    public jnn(jno jno, Object obj) {
        this.b = jno;
        this.a = obj;
    }

    public final void onClick(View view) {
        int checkedRadioButtonId = this.b.e.getCheckedRadioButtonId();
        if (checkedRadioButtonId != -1) {
            Object tag = this.b.e.findViewById(checkedRadioButtonId).getTag();
            aaas aaas;
            apxu apxu;
            if (tag instanceof ayam) {
                aaas = this.b.b;
                apxu = ((ayam) tag).d;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            } else if (tag instanceof ayac) {
                aaas = this.b.b;
                apxu = ((ayac) tag).c;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
            this.b.f.dismiss();
            tag = this.a;
            if (tag != null) {
                this.b.c.d(zyp.a(tag));
            }
        }
    }
}
