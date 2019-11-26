package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: uxo */
public final class uxo implements akot {
    private final acvx a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));

    public uxo(Context context, int i, acvx acvx) {
        this.a = (acvx) amqw.a((Object) acvx);
        this.b = LayoutInflater.from(context).inflate(i, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aoet aoet = (aoet) obj;
        this.a.a(aoet.c.d(), null);
        arml arml = aoet.b;
        if (arml == null) {
            arml = arml.f;
        }
        Spanned a = ajqy.a(arml);
        this.c.setText(a);
        this.b.setContentDescription(a);
    }
}
