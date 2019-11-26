package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: frg */
final /* synthetic */ class frg implements OnClickListener {
    private final frf a;
    private final String b;
    private final String c;

    frg(frf frf, String str, String str2) {
        this.a = frf;
        this.b = str;
        this.c = str2;
    }

    public final void onClick(View view) {
        frf frf = this.a;
        String str = this.b;
        String str2 = this.c;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            frf.ad.a(frn.a(str, str2));
        }
    }
}
