package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* renamed from: joe */
public final class joe extends nd {
    public awte Z;
    public joj aa;
    public akkq ab;
    public aaas ac;
    public View ad;
    public TextView ae;
    public Button af;

    public final void b(Bundle bundle) {
        super.b(bundle);
        a(1, 0);
        String str = "vdpPurchaseDialogRenderer";
        if (this.j.containsKey(str)) {
            try {
                this.Z = (awte) aobp.a(this.j, str, awte.j, anxa.c());
                return;
            } catch (anyg e) {
                xtl.c(e.getMessage());
                return;
            }
        }
        xtl.c("No such key: vdpPurchaseDialogRenderer");
    }

    public final void W_() {
        super.W_();
        this.c.getWindow().setLayout(-1, -2);
        this.c.getWindow().setBackgroundDrawableResource(17170443);
        this.c.getWindow().setGravity(81);
        this.c.getWindow().setWindowAnimations(R.style.SlideUpDownAnimation);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.aa.h();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        arml arml;
        arml arml2;
        ((jog) xse.a(p())).a(this);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vdp_purchase_dialog, viewGroup);
        if ((this.Z.a & 1) != 0) {
            textView = (TextView) viewGroup2.findViewById(R.id.vdp_purchase_title);
            arml = this.Z.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        if ((this.Z.a & 2) != 0) {
            textView = (TextView) viewGroup2.findViewById(R.id.vdp_purchase_subtitle);
            arml = this.Z.c;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        if ((this.Z.a & 8) != 0) {
            textView = (TextView) viewGroup2.findViewById(R.id.vdp_purchase_price);
            arml2 = this.Z.e;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            textView.setText(ajqy.a(arml2));
        }
        HashMap hashMap = new HashMap();
        if ((this.Z.a & 4) != 0) {
            akkq akkq = this.ab;
            ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.vdp_purchase_carrier_logo);
            aygk aygk = this.Z.d;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
            aygk aygk2 = this.Z.d;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
            if (aygk2.b.size() > 0) {
                aygk2 = this.Z.d;
                if (aygk2 == null) {
                    aygk2 = aygk.f;
                }
                hashMap.put("thumbnailUrl", ((aygm) aygk2.b.get(0)).b);
            }
        }
        if ((this.Z.a & 16) != 0) {
            TextView textView2 = (TextView) viewGroup2.findViewById(R.id.vdp_purchase_description);
            arml arml3 = this.Z.f;
            if (arml3 == null) {
                arml3 = arml.f;
            }
            textView2.setText(ajqy.a(arml3));
        }
        this.ae = (TextView) viewGroup2.findViewById(R.id.vdp_purchase_consent);
        awte awte = this.Z;
        if ((awte.a & 32) == 0) {
            this.ae.setVisibility(8);
        } else {
            TextView textView3 = this.ae;
            arml2 = awte.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            textView3.setText(aabb.a(arml2, this.ac, false));
        }
        if ((this.Z.a & 64) != 0) {
            this.af = (Button) viewGroup2.findViewById(R.id.vdp_purchase_button);
            Button button = this.af;
            aphj aphj = this.Z.h;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 128) == 0) {
                arml2 = null;
            } else {
                aphj = this.Z.h;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                arml2 = aphg.g;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            button.setText(ajqy.a(arml2));
            this.af.setOnClickListener(new joh(this, hashMap));
            this.ad = viewGroup2.findViewById(R.id.progress);
        }
        return viewGroup2;
    }

    public final void B() {
        super.B();
        if (this.Z != null) {
            ((acwa) p()).t().a(this.Z.i.d(), null);
        }
    }
}
