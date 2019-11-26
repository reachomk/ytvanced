package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: etb */
public final class etb implements OnClickListener {
    public final View a;
    public aphv b;
    public ete c;
    private final aaas d;
    private final akvp e;
    private final xhv f;
    private final akpi g;
    private final ImageView h;
    private final TextView i;

    public etb(aaas aaas, akvp akvp, xhv xhv, akpi akpi, View view) {
        this.d = (aaas) amqw.a((Object) aaas);
        this.e = (akvp) amqw.a((Object) akvp);
        this.a = (View) amqw.a((Object) view);
        this.f = (xhv) amqw.a((Object) xhv);
        this.g = (akpi) amqw.a((Object) akpi);
        this.h = (ImageView) view.findViewById(R.id.toggle_button_icon);
        this.i = (TextView) view.findViewById(R.id.toggle_button_text);
        this.a.setOnClickListener(this);
    }

    public final void a(aphv aphv) {
        this.b = aphv;
        c();
        this.g.a(this.b, this.a);
    }

    private final boolean d() {
        aphv aphv = this.b;
        return aphv == null || aphv.c;
    }

    public final void a() {
        this.a.setVisibility(8);
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = this.i;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void b() {
        if (!d()) {
            aphy aphy = (aphy) ((anxo) this.b.toBuilder());
            aphy.a(this.b.b ^ 1);
            this.b = (aphv) ((anxl) aphy.build());
            ete ete = this.c;
            if (ete != null) {
                boolean z = this.b.b;
                ete.a();
            }
            c();
        }
    }

    public final void c() {
        if (d()) {
            a();
            return;
        }
        aphv aphv;
        if (this.h != null) {
            arwf arwf;
            aphv = this.b;
            if (aphv.b) {
                arwf = aphv.j;
                if (arwf == null) {
                    arwf = arwf.c;
                }
            } else {
                arwf = aphv.d;
                if (arwf == null) {
                    arwf = arwf.c;
                }
            }
            if (arwf != null) {
                CharSequence charSequence;
                ImageView imageView = this.h;
                akvp akvp = this.e;
                arwh a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                imageView.setImageResource(akvp.a(a));
                ImageView imageView2 = this.h;
                aphv aphv2 = this.b;
                if (aphv2.b) {
                    charSequence = aphv2.l;
                } else {
                    charSequence = aphv2.f;
                }
                imageView2.setContentDescription(charSequence);
                this.h.setVisibility(0);
            } else {
                this.h.setVisibility(8);
            }
        }
        if (this.i != null) {
            CharSequence a2;
            aphv = this.b;
            arml arml = null;
            if (aphv.b) {
                if ((aphv.a & 4096) != 0) {
                    arml = aphv.k;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                a2 = ajqy.a(arml);
            } else {
                if ((aphv.a & 64) != 0) {
                    arml = aphv.e;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                a2 = ajqy.a(arml);
            }
            xpr.a(this.i, a2);
        }
        this.a.setVisibility(0);
    }

    public final void onClick(View view) {
        aphv aphv = this.b;
        if (aphv != null) {
            apxu apxu;
            if (aphv.b) {
                apxu = aphv.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = aphv.h;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
            this.d.a(apxu, hashMap);
            if (this.f.c()) {
                b();
            }
        }
    }
}
