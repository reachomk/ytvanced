package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.List;

/* renamed from: cyx */
final class cyx implements TextWatcher {
    public List a;
    private int b;
    private final /* synthetic */ cyy c;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        cyy cyy = this.c;
        if (cyy.f == 3) {
            this.b = cyy.getLineCount();
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        cyy cyy = this.c;
        if (cyy.f != 3 || this.b == cyy.getLineCount()) {
            cyy = this.c;
            i2 = cyy.f;
            if (i2 != 4) {
                if (i2 != 1) {
                    cyq.b(cyy.b, charSequence.toString());
                    return;
                }
            }
        }
        cyq.a(this.c.b, charSequence.toString());
    }

    public final void afterTextChanged(Editable editable) {
        cyy cyy = this.c;
        coj coj = cyy.c;
        if (coj != null) {
            String obj = editable.toString();
            dcq dcq = (dcq) cyq.a.a();
            if (dcq == null) {
                dcq = new dcq();
            }
            dcq.a = cyy;
            dcq.b = obj;
            coj.a.m().a(coj, dcq);
            dcq.a = null;
            dcq.b = null;
            cyq.a.a(dcq);
        }
    }

    /* synthetic */ cyx(cyy cyy) {
        this.c = cyy;
    }
}
