package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* renamed from: frp */
final class frp implements yqc {
    private final View a;
    private final xsd b;

    frp(View view, xsd xsd) {
        this.a = (View) amqw.a((Object) view);
        this.b = (xsd) amqw.a((Object) xsd);
    }

    public final yxs a(yxv yxv, apa apa) {
        return new yyy(yxv, this.a, apa, this.b);
    }

    public final yxr a(yxt yxt) {
        return new yxr(yxt, this.a.findViewById(R.id.edit_chat_name));
    }
}
