package defpackage;

import android.text.Editable;
import android.text.Selection;

/* renamed from: iqx */
final /* synthetic */ class iqx implements isl {
    private final iqu a;

    iqx(iqu iqu) {
        this.a = iqu;
    }

    public final void a(abnv abnv) {
        iqu iqu = this.a;
        abnx abnx = iqu.at;
        abnx.d.add(athc.QUERY_BUILDER);
        abnx.b();
        iqu.al();
        iqu.aF.setText(abnv.b);
        Editable text = iqu.aF.getText();
        Selection.setSelection(text, text.length());
        xpr.b(iqu.aF);
    }
}
