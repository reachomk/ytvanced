package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: akwr */
public final class akwr implements akot, OnClickListener {
    private final akvq a;
    private final aaas b;
    private final akvr c;
    private final View d;
    private final TextView e = ((TextView) this.d.findViewById(R.id.text));
    private auvj f;

    public akwr(Context context, aaas aaas, akvr akvr, akvq akvq) {
        amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (akvr) amqw.a((Object) akvr);
        this.a = akvq;
        this.d = View.inflate(context, R.layout.contextual_menu_item_layout, null);
        this.d.setOnClickListener(this);
    }

    public final void a(akpb akpb) {
    }

    public final void onClick(View view) {
        akvq akvq = this.a;
        if (akvq != null) {
            akvq.a();
        }
        if (abmk.d(this.f) != null) {
            Map a = this.c.a();
            a.put(acwi.b, Boolean.TRUE);
            this.b.a(abmk.d(this.f), a);
        } else if (abmk.c(this.f) != null) {
            this.b.a(abmk.c(this.f), this.c.a());
        }
    }

    public final View K_() {
        return this.d;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        anvu anvu;
        auvj auvj = (auvj) obj;
        this.e.setText(abmk.a(auvj));
        this.f = auvj;
        int i = auvj.a;
        if ((i & 1) != 0) {
            auvl auvl = auvj.b;
            if (auvl == null) {
                auvl = auvl.f;
            }
            anvu = auvl.e;
        } else if ((i & 2) != 0) {
            auvp auvp = auvj.c;
            if (auvp == null) {
                auvp = auvp.h;
            }
            anvu = auvp.g;
        } else if ((i & 8) != 0) {
            auvd auvd = auvj.e;
            if (auvd == null) {
                auvd = auvd.g;
            }
            anvu = auvd.e;
        } else if ((i & 16) != 0) {
            auvf auvf = auvj.f;
            if (auvf == null) {
                auvf = auvf.g;
            }
            anvu = auvf.e;
        } else if ((i & 4) != 0) {
            auwb auwb = auvj.d;
            if (auwb == null) {
                auwb = auwb.l;
            }
            anvu = auwb.k;
        } else {
            anvu = anvu.a;
        }
        if (!anvu.c()) {
            acvx acvx = (acvx) xsb.a(this.c.a(), (Object) "com.google.android.libraries.youtube.logging.interaction_logger", acvx.class);
            if (acvx != null) {
                acvx.a(new acvs(anvu), null);
            }
        }
    }
}
