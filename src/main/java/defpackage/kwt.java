package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kwt */
public final class kwt extends akpl {
    public final View a;
    private final akkq b;
    private final akvp c;
    private final akoj d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final ImageView i;

    public kwt(Context context, akkq akkq, akvp akvp, aaas aaas, auxh auxh, ViewGroup viewGroup) {
        this.b = akkq;
        this.c = akvp;
        int ordinal = auxh.ordinal();
        int i = R.layout.rich_metadata_box_art;
        if (ordinal == 1) {
            i = R.layout.rich_metadata_topic;
        }
        this.a = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.f = (TextView) this.a.findViewById(R.id.title);
        this.g = (TextView) this.a.findViewById(R.id.subtitle);
        this.h = (TextView) this.a.findViewById(R.id.call_to_action);
        this.i = (ImageView) this.a.findViewById(R.id.call_to_action_icon);
        this.e = (ImageView) this.a.findViewById(R.id.thumbnail);
        this.d = new akoj(aaas, this.a);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.d.a();
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageResource(0);
            this.i.setVisibility(8);
        }
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        auxv auxv = (auxv) obj;
        aygk aygk = auxv.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        ImageView imageView = this.e;
        arml arml = null;
        if (imageView != null) {
            this.b.a(imageView, aygk);
            if (aygk != null) {
                aodx aodx = aygk.d;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                aodv aodv = aodx.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                if ((aodv.a & 2) != 0) {
                    imageView = this.e;
                    aodx aodx2 = aygk.d;
                    if (aodx2 == null) {
                        aodx2 = aodx.c;
                    }
                    aodv aodv2 = aodx2.b;
                    if (aodv2 == null) {
                        aodv2 = aodv.c;
                    }
                    imageView.setContentDescription(aodv2.b);
                }
            }
            this.e.setContentDescription(null);
        }
        TextView textView = this.f;
        if (textView != null) {
            arml arml2;
            if ((auxv.a & 4) != 0) {
                arml2 = auxv.d;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            xpr.a(textView, ajqy.a(arml2));
        }
        textView = this.g;
        if (textView != null) {
            arml arml3;
            if ((auxv.a & 8) != 0) {
                arml3 = auxv.e;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            } else {
                arml3 = null;
            }
            xpr.a(textView, ajqy.a(arml3));
        }
        textView = this.h;
        if (textView != null) {
            if ((auxv.a & 16) != 0) {
                arml = auxv.f;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            xpr.a(textView, ajqy.a(arml));
        }
        ImageView imageView2 = this.i;
        if (imageView2 != null) {
            if ((auxv.a & 32) == 0) {
                imageView2.setVisibility(8);
            } else {
                akvp akvp = this.c;
                arwf arwf = auxv.g;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                arwh a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                imageView2.setImageResource(akvp.a(a));
                this.i.setVisibility(0);
            }
        }
        if ((auxv.a & 64) != 0) {
            akoj akoj = this.d;
            acvx acvx = akor.a;
            apxu apxu = auxv.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
            akoj.a(acvx, apxu, akor.b());
        }
    }
}
