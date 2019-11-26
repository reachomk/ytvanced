package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: ilw */
public final class ilw extends akpl implements OnClickListener, iko {
    private final Context a;
    private final xci b;
    private final TextView c = ((TextView) this.g.findViewById(R.id.position));
    private final TextView d = ((TextView) this.g.findViewById(R.id.title));
    private final TextView e = ((TextView) this.g.findViewById(R.id.annotation));
    private final ImageView f = ((ImageView) this.g.findViewById(R.id.expand_button));
    private final View g;
    private final akvp h;
    private awjr i;
    private final float j;
    private final float k;
    private final float l;
    private akor m;

    public ilw(Context context, xci xci, akvp akvp) {
        this.a = context;
        this.b = xci;
        this.h = akvp;
        this.g = LayoutInflater.from(context).inflate(R.layout.playlist_segment_header, null);
        this.g.setOnClickListener(this);
        this.j = this.c.getTextSize();
        this.k = this.d.getTextSize();
        this.l = this.e.getTextSize();
    }

    private final void a(akor akor, TextView textView, arml arml) {
        Spanned a = ajqy.a(arml);
        if (TextUtils.isEmpty(a)) {
            textView.setVisibility(8);
            return;
        }
        if (akor != null && akor.a("nested_fragment_key", false)) {
            textView.setTextSize(0, this.a.getResources().getDimension(R.dimen.small_font_size));
        }
        textView.setText(a);
        textView.setVisibility(0);
    }

    private final void a(awjr awjr, boolean z) {
        this.f.setVisibility(8);
        if ((awjr.a & 128) != 0) {
            arwh a;
            anxp anxp = awjr.h;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.toggleButtonRenderer);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aphv aphv = (aphv) b;
            arwf arwf;
            if (z) {
                arwf = aphv.j;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
            } else {
                arwf = aphv.d;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
            }
            this.f.setImageResource(this.h.a(a));
            if ((aphv.a & 262144) != 0) {
                CharSequence charSequence;
                aodx aodx = aphv.n;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                aodx aodx2 = aphv.o;
                if (aodx2 == null) {
                    aodx2 = aodx.c;
                }
                aodv aodv;
                if (z) {
                    aodv = aodx.b;
                    if (aodv == null) {
                        aodv = aodv.c;
                    }
                    charSequence = aodv.b;
                } else {
                    aodv = aodx2.b;
                    if (aodv == null) {
                        aodv = aodv.c;
                    }
                    charSequence = aodv.b;
                }
                this.f.setContentDescription(charSequence);
            }
            this.f.setVisibility(0);
        }
    }

    public final View K_() {
        return this.g;
    }

    public final void a(akpb akpb) {
        akor akor = this.m;
        if (akor != null) {
            ikl a = ikm.a(akor);
            awjr b = ikm.b(akor);
            if (a != null && b != null) {
                a.b.remove(b);
            }
        }
    }

    public final void onClick(View view) {
        awjr awjr = this.i;
        if (awjr != null) {
            this.b.d(new ilb(awjr));
        }
    }

    public final void a(boolean z) {
        a(this.i, z);
    }
}
