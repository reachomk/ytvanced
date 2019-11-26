package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ydc */
public final class ydc extends akpl {
    private final TextView a;

    public ydc(Context context) {
        this.a = (TextView) LayoutInflater.from(context).inflate(R.layout.add_connection_section_header, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        aomq aomq = (aomq) obj;
        TextView textView = this.a;
        arml arml = aomq.b;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
    }
}
