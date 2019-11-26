package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jsp */
final /* synthetic */ class jsp implements OnClickListener {
    private final jsn a;

    jsp(jsn jsn) {
        this.a = jsn;
    }

    public final void onClick(View view) {
        jsn jsn = this.a;
        Object obj = jsn.a;
        if (obj != null && (obj.a & 4) != 0) {
            Object obj2 = obj.d;
            if (obj2 == null) {
                obj2 = apxu.d;
            }
            jsn.a(obj, amul.a(obj2));
        }
    }
}
