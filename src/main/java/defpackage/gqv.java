package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: gqv */
public final class gqv extends akpl {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.comment_zero_state_primary_text));
    private final TextView c = ((TextView) this.a.findViewById(R.id.comment_zero_state_secondary_text));

    public gqv(Context context) {
        this.a = LayoutInflater.from(context).inflate(R.layout.comment_zero_state, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        aqcq aqcq = (aqcq) obj;
        akor.a.a(aqcq.d.d(), null);
        TextView textView = this.b;
        arml arml = aqcq.b;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        textView = this.c;
        arml arml2 = aqcq.c;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        textView.setText(ajqy.a(arml2));
    }
}
