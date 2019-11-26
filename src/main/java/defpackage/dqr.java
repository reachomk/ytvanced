package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: dqr */
public final class dqr extends akpl {
    public final uya a;
    public apxu b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.channel));

    public dqr(Context context, aaas aaas, uya uya) {
        amqw.a((Object) context);
        this.a = uya;
        this.c = LayoutInflater.from(context).inflate(R.layout.fusion_account_channel, null);
        this.c.setOnClickListener(new dqq(this, aaas));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        aoep aoep = (aoep) obj;
        TextView textView = this.d;
        if (textView != null) {
            arml arml;
            if ((aoep.a & 1) != 0) {
                arml = aoep.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
        }
        apxu apxu = aoep.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        this.b = apxu;
    }
}
