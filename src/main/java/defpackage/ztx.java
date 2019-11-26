package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ztx */
public final class ztx implements zwh {
    private final akkq a;

    public ztx(akkq akkq) {
        this.a = (akkq) amqw.a((Object) akkq);
    }

    public final void a(Context context, zud zud, aqj aqj, zwj zwj) {
        arml arml;
        ztz ztz = (ztz) aqj;
        arwn b = zud.b();
        akkq akkq = this.a;
        ImageView imageView = ztz.p;
        aygk aygk = b.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = ztz.q;
        arml arml2 = null;
        if ((b.a & 8) != 0) {
            arml = b.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = ztz.r;
        if ((b.a & 4) != 0) {
            arml = b.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = ztz.s;
        if ((b.a & 2) != 0) {
            arml2 = b.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml2));
        ztz.a.setOnClickListener(new zua(zwj, b));
    }

    public final aqj a(Context context, ViewGroup viewGroup, zug zug, boolean z) {
        return new ztz(LayoutInflater.from(context).inflate(!z ? R.layout.info_card_collaborator_watch_next : R.layout.info_card_collaborator, viewGroup, false));
    }
}
