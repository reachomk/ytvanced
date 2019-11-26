package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zvd */
public final class zvd implements zwh {
    private final akkq a;

    public zvd(akkq akkq) {
        this.a = (akkq) amqw.a((Object) akkq);
    }

    public final void a(Context context, zud zud, aqj aqj, zwj zwj) {
        arml arml;
        arml arml2;
        zvf zvf = (zvf) aqj;
        arxt e = zud.e();
        akkq akkq = this.a;
        ImageView imageView = zvf.p;
        aygk aygk = e.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = zvf.q;
        arml arml3 = null;
        if ((e.a & 8) != 0) {
            arml = e.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        zvf.r.setVisibility(zvf.q.getVisibility());
        textView = zvf.s;
        if ((e.a & 4) != 0) {
            arml = e.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        xpr.a(zvf.t, zvd.a(e));
        textView = zvf.u;
        if ((e.a & 16) != 0) {
            arml = e.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = zvf.v;
        if ((e.a & 32) != 0) {
            arml = e.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        if ((e.a & 64) != 0) {
            arml2 = e.h;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        CharSequence a = ajqy.a(arml2);
        xpr.a(zvf.w, a);
        String str = " ";
        zvf.s.setContentDescription(str);
        zvf.t.setContentDescription(str);
        TextView textView2 = zvf.w;
        String valueOf = String.valueOf(xvd.a(a));
        if ((e.a & 4) != 0) {
            arml3 = e.d;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        }
        String valueOf2 = String.valueOf(xvd.a(ajqy.b(arml3)));
        str = String.valueOf(xvd.a(zvd.a(e)));
        String string = context.getString(R.string.accessibility_video_card);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder stringBuilder = new StringBuilder((((length + 4) + length2) + str.length()) + String.valueOf(string).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("; ");
        stringBuilder.append(valueOf2);
        valueOf = " ";
        stringBuilder.append(valueOf);
        stringBuilder.append(str);
        stringBuilder.append(valueOf);
        stringBuilder.append(string);
        textView2.setContentDescription(stringBuilder.toString());
        zvf.a.setOnClickListener(new zvg(zwj, e));
    }

    public final aqj a(Context context, ViewGroup viewGroup, zug zug, boolean z) {
        return new zvf(LayoutInflater.from(context).inflate(!z ? R.layout.info_card_video_watch_next : R.layout.info_card_video, viewGroup, false));
    }

    private static CharSequence a(arxt arxt) {
        arxd arxd = arxt.c;
        if (arxd == null) {
            arxd = arxd.c;
        }
        arml arml = null;
        if ((arxd.a & 1) == 0) {
            return null;
        }
        arxd = arxt.c;
        if (arxd == null) {
            arxd = arxd.c;
        }
        apdn apdn = arxd.b;
        if (apdn == null) {
            apdn = apdn.d;
        }
        if ((apdn.a & 1) != 0) {
            arxd arxd2 = arxt.c;
            if (arxd2 == null) {
                arxd2 = arxd.c;
            }
            apdn apdn2 = arxd2.b;
            if (apdn2 == null) {
                apdn2 = apdn.d;
            }
            arml = apdn2.b;
            if (arml == null) {
                arml = arml.f;
            }
        }
        return ajqy.a(arml);
    }
}
