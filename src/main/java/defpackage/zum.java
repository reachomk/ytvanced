package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zum */
public final class zum implements zwh {
    private final akkq a;

    public zum(akkq akkq) {
        this.a = (akkq) amqw.a((Object) akkq);
    }

    public final void a(Context context, zud zud, aqj aqj, zwj zwj) {
        zuo zuo = (zuo) aqj;
        arxf c = zud.c();
        akkq akkq = this.a;
        ImageView imageView = zuo.p.a;
        aygk aygk = c.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = zuo.q;
        arml arml = c.d;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        zuo.r.setVisibility(zuo.q.getVisibility());
        textView = zuo.s;
        arml = c.e;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = zuo.t;
        arml = c.f;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        arml arml2 = c.g;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        CharSequence a = ajqy.a(arml2);
        xpr.a(zuo.u, a);
        TextView textView2 = zuo.p.b;
        arml arml3 = c.c;
        if (arml3 == null) {
            arml3 = arml.f;
        }
        xpr.a(textView2, ajqy.a(arml3));
        zuo.p.setContentDescription(" ");
        textView2 = zuo.u;
        String valueOf = String.valueOf(a);
        String string = context.getString(R.string.accessibility_playlist_card);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 1) + String.valueOf(string).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(" ");
        stringBuilder.append(string);
        textView2.setContentDescription(stringBuilder.toString());
        zuo.a.setOnClickListener(new zul(zwj, c));
    }

    public final aqj a(Context context, ViewGroup viewGroup, zug zug, boolean z) {
        return new zuo(LayoutInflater.from(context).inflate(!z ? R.layout.info_card_playlist_watch_next : R.layout.info_card_playlist, viewGroup, false));
    }
}
