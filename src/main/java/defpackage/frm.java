package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: frm */
final /* synthetic */ class frm implements xsd {
    private final frn a;

    frm(frn frn) {
        this.a = frn;
    }

    public final void a(Object obj) {
        frn frn = this.a;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            frn.ai = null;
        } else {
            frn.ai = View.inflate(frn.M_(), R.layout.chat_participants_title, null);
            ((TextView) frn.ai.findViewById(R.id.title)).setText(str);
        }
        frn.ae.b();
    }
}
