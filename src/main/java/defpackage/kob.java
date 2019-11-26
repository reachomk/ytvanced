package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kob */
public final class kob extends akpl {
    public final xci a;
    private final akkq b;
    private final akou c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;

    public kob(Context context, akkq akkq, xci xci, flu flu) {
        amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.a = (xci) amqw.a((Object) xci);
        this.c = (akou) amqw.a((Object) flu);
        View inflate = View.inflate(context, R.layout.ypc_post_tip_watch_screen, null);
        this.g = (ImageView) inflate.findViewById(R.id.viewer_thumbnail);
        this.d = (TextView) inflate.findViewById(R.id.confirmation_msg_header);
        this.e = (TextView) inflate.findViewById(R.id.confirmation_msg);
        this.f = (TextView) inflate.findViewById(R.id.done);
        this.f.setOnClickListener(new koa(this));
        this.c.a(inflate);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c.a();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        azoi azoi = (azoi) obj;
        if (etj.a(akor)) {
            this.e.setTextSize(2, 18.0f);
            this.d.setTextSize(2, 18.0f);
            this.d.setLines(2);
        } else {
            this.e.setTextSize(2, 22.0f);
            this.d.setTextSize(2, 22.0f);
        }
        akkq akkq = this.b;
        ImageView imageView = this.g;
        aygk aygk = azoi.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.d;
        arml arml = azoi.c;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        textView = this.e;
        arml = azoi.d;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        textView = this.f;
        arml arml2 = azoi.e;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        textView.setText(ajqy.a(arml2));
        this.c.a(akor);
    }
}
