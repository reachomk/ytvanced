package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;

/* renamed from: wjf */
public final class wjf extends akpl {
    private final akkq a;
    private final akoj b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.title));
    private final FixedAspectRatioFrameLayout e = ((FixedAspectRatioFrameLayout) this.c.findViewById(R.id.comment_video_thumbnail_layout));
    private final ImageView f = ((ImageView) this.c.findViewById(R.id.comment_video_thumbnail));
    private final View g = this.c.findViewById(R.id.divider);

    public wjf(Context context, akkq akkq, aaas aaas) {
        amqw.a((Object) context);
        amqw.a((Object) akkq);
        amqw.a((Object) aaas);
        this.a = akkq;
        this.c = View.inflate(context, R.layout.comment_video_thumbnail_header, null);
        this.b = new akoj(aaas, this.c);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.b.a();
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        apxu apxu;
        aqco aqco = (aqco) obj;
        akoj akoj = this.b;
        acvx acvx = akor.a;
        arml arml = null;
        if ((aqco.a & 4) != 0) {
            apxu = aqco.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        TextView textView = this.d;
        if ((aqco.a & 1) != 0) {
            arml = aqco.b;
            if (arml == null) {
                arml = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml));
        aygk aygk = aqco.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        float g = aklb.g(aygk);
        if (g > 0.0f) {
            this.e.a = g;
        }
        aygk = aqco.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        boolean a = aklb.a(aygk);
        xpr.a(this.e, a);
        akkq akkq = this.a;
        ImageView imageView = this.f;
        aygk aygk2 = aqco.c;
        if (aygk2 == null) {
            aygk2 = aygk.f;
        }
        akkq.a(imageView, aygk2);
        xpr.a(this.f, a);
        this.g.setVisibility(!aqco.e ? 8 : 0);
    }
}
