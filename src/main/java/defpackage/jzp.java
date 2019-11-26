package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jzp */
public final class jzp extends akpl {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.add_text));
    private final akoj c;

    public jzp(Context context, aaas aaas) {
        amqw.a((Object) context);
        this.a = LayoutInflater.from(context).inflate(R.layout.channel_list_add_channels, null);
        this.c = new akoj(aaas, this.a);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.c.a();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        apxu apxu;
        apmk apmk = (apmk) obj;
        akoj akoj = this.c;
        acvx acvx = akor.a;
        arml arml = null;
        if ((apmk.a & 2) != 0) {
            apxu = apmk.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        TextView textView = this.b;
        if ((apmk.a & 1) != 0) {
            arml = apmk.c;
            if (arml == null) {
                arml = arml.f;
            }
        }
        textView.setText(ajqy.a(arml));
    }
}
