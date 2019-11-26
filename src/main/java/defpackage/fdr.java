package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fdr */
final /* synthetic */ class fdr implements OnClickListener {
    private final fdn a;
    private final aphg b;
    private final EditText c;

    fdr(fdn fdn, aphg aphg, EditText editText) {
        this.a = fdn;
        this.b = aphg;
        this.c = editText;
    }

    public final void onClick(View view) {
        fdn fdn = this.a;
        aphg aphg = this.b;
        EditText editText = this.c;
        if ((aphg.a & 2048) != 0) {
            Map hashMap = new HashMap();
            hashMap.put("SilentSubmitUserFeedbackCommandResolver.DESCRIPTION_KEY", editText.getText().toString());
            aaas aaas = fdn.a;
            apxu apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
        fdn.a(1);
    }
}
