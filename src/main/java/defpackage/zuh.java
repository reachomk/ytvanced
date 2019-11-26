package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zuh */
public final class zuh implements zwh {
    private final akkq a;

    public zuh(akkq akkq) {
        this.a = (akkq) amqw.a((Object) akkq);
    }

    public final void a(Context context, zud zud, aqj aqj, zwj zwj) {
        arml arml;
        zuj zuj = (zuj) aqj;
        arxb f = zud.f();
        akkq akkq = this.a;
        ImageView imageView = zuj.p;
        aygk aygk = f.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        zwr zwr = zuj.s;
        apdx apdx = f.d;
        if (apdx == null) {
            apdx = apdx.g;
        }
        zwr.a(apdx);
        TextView textView = zuj.q;
        arml arml2 = null;
        if ((f.a & 32) != 0) {
            arml = f.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        TextView textView2 = zuj.r;
        if ((f.a & 16) != 0) {
            arml2 = f.f;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        xpr.a(textView2, ajqy.a(arml2));
        aqj.a.setOnClickListener(new zuk(zwj, f));
    }

    public final aqj a(Context context, ViewGroup viewGroup, zug zug, boolean z) {
        return new zuj(LayoutInflater.from(context).inflate(!z ? R.layout.info_card_movie_watch_next : R.layout.info_card_movie, viewGroup, false), z);
    }
}
