package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: ywp */
final /* synthetic */ class ywp implements bqk {
    private final ywk a;
    private final xsd b;

    ywp(ywk ywk, xsd xsd) {
        this.a = ywk;
        this.b = xsd;
    }

    public final void a(bqn bqn) {
        ywk ywk = this.a;
        xsd xsd = this.b;
        if (xsd != null) {
            Object bqn2;
            if (TextUtils.isEmpty(bqn2.getMessage())) {
                bqn2 = new bqn(ywk.a.getString(R.string.generic_error), bqn2);
            }
            xsd.a(bqn2);
        }
    }
}
