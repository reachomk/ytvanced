package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.share.ui.ConversationIconView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: yga */
public final class yga implements akmz, akok, akot {
    public final allw a;
    public aqoz b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.conversation_name));
    private final TextView e = ((TextView) this.c.findViewById(R.id.last_post_activity));
    private final TextView f = ((TextView) this.c.findViewById(R.id.last_post_activity_bullet));
    private final TextView g = ((TextView) this.c.findViewById(R.id.last_post_timestamp));
    private final TextView h = ((TextView) this.c.findViewById(R.id.read_receipt_bullet));
    private final TextView i = ((TextView) this.c.findViewById(R.id.read_receipt));
    private final akle j;
    private final akkl k;
    private final ConversationIconView l;
    private final ImageView m;
    private final akmx n;
    private final akoj o;
    private yco p;

    public yga(aaas aaas, Context context, akkl akkl, xci xci, akmx akmx, allw allw) {
        this.k = (akkl) amqw.a((Object) akkl);
        this.c = View.inflate(context, R.layout.conversation_switcher_item, null);
        amqw.a((Object) xci);
        this.n = (akmx) amqw.a((Object) akmx);
        this.a = (allw) amqw.a((Object) allw);
        this.o = new akoj(aaas, this.c, (akok) this);
        this.j = new akle(akkl, (ImageView) this.c.findViewById(R.id.video_thumbnail));
        this.l = (ConversationIconView) this.c.findViewById(R.id.conversation_icon);
        this.m = (ImageView) this.c.findViewById(R.id.notifications_muted);
        this.c.setOnLongClickListener(new yfz(this));
    }

    public final View K_() {
        return this.c;
    }

    public final boolean a(View view) {
        aqoz aqoz = this.b;
        if (aqoz != null) {
            akmx akmx = this.n;
            Uri a = ycq.a((aqoz.a & 1) != 0 ? aqoz.b : null);
            ycn ycn = new ycn(this.p);
            ycn.d = false;
            this.p = (yco) akmx.b(a, ycn.a());
            b();
        }
        return false;
    }

    public final void a(akpb akpb) {
        this.o.a();
        this.n.a((akmz) this);
    }

    public final void a(Uri uri, Uri uri2) {
        this.p = (yco) this.n.a(uri);
        b();
    }

    private final void b() {
        yco yco = this.p;
        if (yco != null) {
            Typeface defaultFromStyle;
            if (yco.d) {
                this.f.setVisibility(0);
                defaultFromStyle = Typeface.defaultFromStyle(1);
            } else {
                this.f.setVisibility(4);
                defaultFromStyle = Typeface.defaultFromStyle(0);
            }
            this.d.setTypeface(defaultFromStyle);
            this.e.setTypeface(defaultFromStyle);
            this.g.setTypeface(defaultFromStyle);
            this.h.setTypeface(defaultFromStyle);
            this.i.setTypeface(defaultFromStyle);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        aqoz aqoz = (aqoz) obj;
        akoj akoj = this.o;
        acvx acvx = akor.a;
        arml arml = null;
        if ((aqoz.a & 8) != 0) {
            apxu = aqoz.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akor.a.a(aqoz.r.d(), null);
        this.b = aqoz;
        Uri a = ycq.a((aqoz.a & 1) != 0 ? aqoz.b : null);
        akmx akmx = this.n;
        ycn ycn = new ycn();
        ycn.c = aqoz.j;
        ycn.d = aqoz.o;
        this.p = (yco) akmx.b(a, ycn.a());
        this.n.a(a, (akmz) this);
        TextView textView = this.d;
        arml arml2 = aqoz.d;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
        textView = this.e;
        arml2 = aqoz.h;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
        textView = this.g;
        arml2 = aqoz.i;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
        textView = this.i;
        arml2 = aqoz.k;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
        View view = this.h;
        arml2 = aqoz.k;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(view, TextUtils.isEmpty(ajqy.a(arml2)) ^ 1);
        int i = 0;
        this.l.setVisibility(0);
        this.e.setMaxLines(1);
        ConversationIconView conversationIconView = this.l;
        List list = aqoz.c;
        xnk xnk = this.k;
        if ((aqoz.a & 4) != 0) {
            arml = aqoz.e;
            if (arml == null) {
                arml = arml.f;
            }
        }
        conversationIconView.a(list, xnk, ajqy.a(arml));
        if (aqoz.l.size() <= 0) {
            this.j.b();
            this.j.a(8);
        } else {
            this.j.a((aygk) aqoz.l.get(0));
            this.j.a(0);
        }
        b();
        ImageView imageView = this.m;
        if (!aqoz.q) {
            i = 8;
        }
        imageView.setVisibility(i);
    }
}
