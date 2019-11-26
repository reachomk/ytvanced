package defpackage;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jgb */
final class jgb implements OnClickListener {
    private final /* synthetic */ jgc a;

    jgb(jgc jgc) {
        this.a = jgc;
    }

    public final void onClick(View view) {
        apqu b = jgc.b(this.a.d);
        if (b != null) {
            arml arml;
            jgc jgc = this.a;
            arml arml2 = null;
            if (jgc.f == null) {
                jgc.g = View.inflate(jgc.a, R.layout.channel_offer_dialog, null);
                jgc.h = (ImageView) jgc.g.findViewById(R.id.thumbnail);
                jgc.i = (TextView) jgc.g.findViewById(R.id.header);
                jgc.j = (TextView) jgc.g.findViewById(R.id.title);
                jgc.k = (TextView) jgc.g.findViewById(R.id.subtitle);
                jgc.l = (TextView) jgc.g.findViewById(R.id.prices);
                jgc.m = (TextView) jgc.g.findViewById(R.id.additional_info);
                jgc.f = new Builder(jgc.a).setTitle(jgc.a.getString(R.string.more_offers)).setView(jgc.g).setNegativeButton(R.string.dismiss, null).setPositiveButton(R.string.visit_channel, new jge(jgc)).create();
            }
            jgc.e = b;
            TextView textView = jgc.i;
            if ((b.a & 1) != 0) {
                arml = b.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            textView = jgc.j;
            if ((b.a & 4) != 0) {
                arml = b.d;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            akkq akkq = jgc.b;
            ImageView imageView = jgc.h;
            aygk aygk = b.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk, akko.h);
            textView = jgc.k;
            if ((b.a & 8) != 0) {
                arml = b.e;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            xpr.a(textView, ajqy.a(arml));
            textView = jgc.l;
            if ((b.a & 16) != 0) {
                arml = b.f;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            xpr.a(textView, ajqy.a(arml));
            textView = jgc.m;
            if ((b.a & 32) != 0) {
                arml2 = b.g;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            xpr.a(textView, ajqy.a(arml2));
            jgc.f.show();
        }
    }
}
