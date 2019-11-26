package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kev */
public final class kev extends akpl {
    public apxu a;
    public apxu b;
    private final TextView c;
    private final TextView d;
    private final akou e;

    public kev(Context context, aaas aaas, flu flu) {
        amqw.a((Object) aaas);
        this.e = (akou) amqw.a((Object) flu);
        View inflate = LayoutInflater.from(context).inflate(R.layout.link_sub_menu, null);
        this.c = (TextView) inflate.findViewById(R.id.link_text);
        this.d = (TextView) inflate.findViewById(R.id.title_text);
        flu.a(inflate);
        flu.a(false);
        this.c.setOnClickListener(new keu(this, aaas));
        this.d.setOnClickListener(new kex(this, aaas));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.e.a();
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        apxu apxu;
        auah auah = (auah) obj;
        TextView textView = this.c;
        apxu apxu2 = null;
        if ((auah.a & 4) != 0) {
            arml = auah.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.d;
        if ((auah.a & 1) != 0) {
            arml = auah.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        if ((auah.a & 8) != 0) {
            apxu = auah.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        this.a = apxu;
        if ((auah.a & 2) != 0) {
            apxu2 = auah.c;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
        }
        this.b = apxu2;
        this.e.a(akor);
    }
}
