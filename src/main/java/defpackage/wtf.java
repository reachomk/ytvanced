package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: wtf */
public final class wtf implements akot {
    public aynd a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));
    private final TextView d = ((TextView) this.b.findViewById(R.id.message));
    private final TextView e = ((TextView) this.b.findViewById(R.id.dismiss_button));
    private final TextView f;
    private final aaas g;

    public wtf(Context context, ViewGroup viewGroup, aaas aaas) {
        amqw.a((Object) context);
        this.g = (aaas) amqw.a((Object) aaas);
        this.b = LayoutInflater.from(context).inflate(R.layout.unlimited_user_notification, viewGroup, false);
        this.e.setOnClickListener(new wte(this));
        this.f = (TextView) this.b.findViewById(R.id.update_button);
        this.f.setOnClickListener(new wth(this));
    }

    public final void a(aphg aphg) {
        if (aphg != null) {
            int i = aphg.a;
            aaas aaas;
            apxu apxu;
            if ((i & 4096) != 0) {
                aaas = this.g;
                apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            } else if ((i & 2048) != 0) {
                aaas = this.g;
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, acwi.a(this.a));
            }
        }
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.a = null;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aphj aphj;
        aphg aphg;
        CharSequence charSequence;
        aynd aynd = (aynd) obj;
        this.a = aynd;
        CharSequence charSequence2 = null;
        akor.a.a(aynd.f.d(), null);
        TextView textView = this.c;
        if ((aynd.a & 1) != 0) {
            arml = aynd.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        xpr.a(this.d, ajqy.a(System.getProperty("line.separator"), ajqy.b((arml[]) aynd.c.toArray(new arml[0]))));
        if ((aynd.a & 4) != 0) {
            aphj = aynd.e;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        } else {
            aphg = null;
        }
        TextView textView2 = this.e;
        if (aphg == null) {
            charSequence = null;
        } else {
            arml arml2;
            if ((aphg.a & 128) != 0) {
                arml2 = aphg.g;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            charSequence = ajqy.a(arml2);
        }
        xpr.a(textView2, charSequence);
        if ((aynd.a & 2) != 0) {
            aphj = aynd.d;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        } else {
            aphg = null;
        }
        TextView textView3 = this.f;
        if (aphg != null) {
            arml arml3;
            if ((aphg.a & 128) != 0) {
                arml3 = aphg.g;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            }
            charSequence2 = ajqy.a(arml3);
        }
        xpr.a(textView3, charSequence2);
    }
}
