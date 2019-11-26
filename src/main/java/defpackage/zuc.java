package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zuc */
public final class zuc implements zwh {
    private final akkq a;

    public zuc(akkq akkq) {
        this.a = (akkq) amqw.a((Object) akkq);
    }

    public final void a(Context context, zud zud, aqj aqj, zwj zwj) {
        arml arml;
        zue zue = (zue) aqj;
        arwp g = zud.g();
        akkq akkq = this.a;
        ImageView imageView = zue.p;
        aygk aygk = g.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        zwr zwr = zue.s;
        apdx apdx = g.e;
        if (apdx == null) {
            apdx = apdx.g;
        }
        zwr.a(apdx);
        TextView textView = zue.q;
        if ((g.a & 2) != 0) {
            arml = g.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        xpr.a(zue.r, ajqy.a((CharSequence) "\n", ajqy.b(g.d)));
        zue.a.setOnClickListener(new zub(zwj, g));
    }

    public final aqj a(Context context, ViewGroup viewGroup, zug zug, boolean z) {
        return new zue(LayoutInflater.from(context).inflate(!z ? R.layout.info_card_episode_watch_next : R.layout.info_card_episode, viewGroup, false), z);
    }
}
