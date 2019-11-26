package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alnr */
public final class alnr implements akot {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.text));

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aylm aylm = (aylm) obj;
        TextView textView = this.b;
        if ((aylm.a & 1) != 0) {
            arml = aylm.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
    }

    /* synthetic */ alnr(Context context) {
        this.a = View.inflate(context, R.layout.sender_id_section, null);
    }
}
