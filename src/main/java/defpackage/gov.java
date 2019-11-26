package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: gov */
public final class gov implements OnClickListener {
    public final View a;
    public final acwa b;
    public final aaas c;
    public TextView d;
    public ImageView e;
    public LinearLayout f;
    public TextView g;
    public ajzp h;

    public gov(View view, acwa acwa, aaas aaas) {
        this.a = (View) amqw.a((Object) view);
        this.b = (acwa) amqw.a((Object) acwa);
        this.c = (aaas) amqw.a((Object) aaas);
    }

    public final void onClick(View view) {
        aphg aphg;
        aaas aaas;
        apxu apxu;
        if (view == this.e || view == this.g) {
            aphg = (aphg) ajzv.a(this.h.k, aphg.class);
            if (aphg != null) {
                aaas = this.c;
                apxu = aphg.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
                if ((aphg.a & 262144) != 0) {
                    this.b.t().a(3, new acvs(aphg.r), null);
                }
            }
        } else if (view == this.f) {
            aphg = (aphg) ajzv.a(this.h.l, aphg.class);
            if (aphg != null) {
                aaas = this.c;
                apxu = aphg.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
                if ((aphg.a & 262144) != 0) {
                    this.b.t().a(3, new acvs(aphg.r), null);
                }
            }
        }
    }

    public final void a() {
        View view = this.a;
        if (view != null) {
            ggh.a(view.findViewById(R.id.reel_bottom_bar), false);
            ggh.a(this.a.findViewById(R.id.reel_viewer_bottom_bar), false);
            ggh.a(this.a.findViewById(R.id.reel_creator_bottom_bar), false);
        }
    }

    public static String a(aphg aphg) {
        if (aphg != null) {
            aodx aodx = aphg.q;
            if (aodx == null) {
                aodx = aodx.c;
            }
            aodv aodv = aodx.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            if ((aodv.a & 2) != 0) {
                aodx aodx2 = aphg.q;
                if (aodx2 == null) {
                    aodx2 = aodx.c;
                }
                aodv aodv2 = aodx2.b;
                if (aodv2 == null) {
                    aodv2 = aodv.c;
                }
                return aodv2.b;
            }
        }
        return null;
    }

    public static void a(TextView textView, aphg aphg) {
        if (textView != null && aphg != null) {
            arml arml;
            if ((aphg.a & 128) != 0) {
                arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
        }
    }

    public static void a(TextView textView, arml arml) {
        if (textView != null) {
            textView.setText(ajqy.a(arml));
        }
    }
}
