package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: kcn */
public final class kcn implements akot {
    public final aaas a;
    public apxu b;
    private final akkq c;
    private final View d;
    private final eso e;
    private final YouTubeTextView f = ((YouTubeTextView) this.d.findViewById(R.id.title));
    private final ImageView g = ((ImageView) this.d.findViewById(R.id.channel_avatar));
    private final YouTubeTextView h = ((YouTubeTextView) this.d.findViewById(R.id.subscriber_count));
    private final akko i;
    private final OnClickListener j;
    private final Context k;

    public kcn(Context context, akkq akkq, aaas aaas, est est, eur eur) {
        this.k = (Context) amqw.a((Object) context);
        this.c = (akkq) amqw.a((Object) akkq);
        this.a = (aaas) amqw.a((Object) aaas);
        this.d = LayoutInflater.from(context).inflate(R.layout.feed_channel_filter_header, null);
        this.i = akkq.a().g().a((int) R.drawable.missing_avatar).a();
        this.e = est.a((TextView) this.d.findViewById(R.id.subscribe_button), eur.a(this.d.findViewById(R.id.subscription_notification_view)));
        this.j = new kcm(this);
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        this.e.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        arml arml2;
        axwa axwa;
        ariq ariq = (ariq) obj;
        akkq akkq = this.c;
        ImageView imageView = this.g;
        aygk aygk = ariq.e;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk, this.i);
        if ((ariq.a & 1) != 0) {
            arml = ariq.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        this.f.setText(a);
        YouTubeTextView youTubeTextView = this.h;
        if ((ariq.a & 2) != 0) {
            arml2 = ariq.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        youTubeTextView.setText(ajqy.a(arml2));
        apxu apxu = ariq.d;
        if (apxu == null) {
            apxu = apxu.d;
        }
        this.b = apxu;
        this.g.setOnClickListener(this.j);
        this.f.setOnClickListener(this.j);
        this.h.setOnClickListener(this.j);
        this.g.setContentDescription(a);
        ario ario = ariq.g;
        if (ario == null) {
            ario = ario.c;
        }
        if (ario.a != 55419609) {
            axwa = null;
        } else {
            ario = ariq.g;
            if (ario == null) {
                ario = ario.c;
            }
            if (ario.a == 55419609) {
                axwa = (axwa) ario.b;
            } else {
                axwa = axwa.M;
            }
        }
        if (axwa != null) {
            axwa = (axwa) ((anxl) evj.b(this.k, (axwd) ((anxo) axwa.toBuilder()), a).build());
        }
        this.e.a(axwa, akor.a);
        akor.a.a(ariq.h.d(), null);
    }
}
