package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yfr */
public final class yfr implements akot, alht {
    public final aaas a;
    public final View b;
    public aqox c;
    public boolean d;
    private final xoi e;
    private final View f;
    private final akle g;
    private final TextView h = ((TextView) this.f.findViewById(R.id.invite_description));
    private final TextView i = ((TextView) this.f.findViewById(R.id.shared_content_description));
    private final View j = this.f.findViewById(R.id.decline_button);
    private final View k;
    private yfx l;

    public yfr(Context context, akkl akkl, aaas aaas, xoi xoi) {
        amqw.a((Object) context);
        amqw.a((Object) akkl);
        this.a = (aaas) amqw.a((Object) aaas);
        this.e = (xoi) amqw.a((Object) xoi);
        this.f = View.inflate(context, R.layout.conversation_switcher_invite_item, null);
        ImageView imageView = (ImageView) this.f.findViewById(R.id.invite_user_thumbnail);
        imageView.setOnClickListener(new yfu(this));
        this.g = new akle(akkl, imageView);
        this.j.setOnClickListener(new yft(this));
        this.k = this.f.findViewById(R.id.invite_button);
        this.k.setOnClickListener(new yfw(this));
        this.b = this.f.findViewById(R.id.dim_overlay);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.f;
    }

    public final Object a() {
        return this.c;
    }

    public final void c() {
        this.b.setVisibility(0);
        this.b.setAlpha(0.0f);
        this.b.animate().alpha(1.0f).setListener(new yfv(this)).start();
    }

    public final void b() {
        this.d = false;
        d();
        this.l.d();
    }

    public final void a(bqn bqn) {
        this.d = false;
        d();
        this.e.c(bqn);
    }

    private final void d() {
        this.b.animate().alpha(0.0f).setListener(new yfy(this)).start();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aqox aqox = (aqox) obj;
        arml arml2 = null;
        akor.a.a(aqox.i.d(), null);
        this.l = (yfx) akor.a("sectionController");
        this.c = aqox;
        aqtk aqtk = aqox.b;
        if (aqtk == null) {
            aqtk = aqtk.c;
        }
        if ((aqtk.a & 1) != 0) {
            akle akle = this.g;
            aqtk aqtk2 = aqox.b;
            if (aqtk2 == null) {
                aqtk2 = aqtk.c;
            }
            aygk aygk = aqtk2.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akle.a(aygk);
        } else {
            this.g.b();
        }
        if ((aqox.a & 4) != 0) {
            arml = aqox.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        this.h.setText(a);
        int i = 0;
        this.h.setVisibility(!TextUtils.isEmpty(a) ? 0 : 8);
        if ((aqox.a & 8) != 0) {
            arml2 = aqox.e;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        a = ajqy.a(arml2);
        this.i.setText(a);
        TextView textView = this.i;
        if (TextUtils.isEmpty(a)) {
            i = 8;
        }
        textView.setVisibility(i);
    }
}
