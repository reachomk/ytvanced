package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wsq */
public final class wsq extends nd implements akcp, akyw, wmk {
    public akzb Z;
    public akkq aa;
    public aaas ab;
    public acvx ac;
    public wmh ad;
    public xci ae;
    private aphg af;
    private aymq ag;

    public final void a(boolean z) {
    }

    public final void b() {
    }

    public final boolean e() {
        return true;
    }

    public static wsq a(aymq aymq) {
        amqw.a((Object) aymq);
        wsq wsq = new wsq();
        Bundle bundle = new Bundle();
        bundle.putByteArray("UnlimitedFamilyMessageInterstitialRenderer", aymq.toByteArray());
        wsq.f(bundle);
        return wsq;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((wss) xse.b(M_())).a(this);
        a(0, (int) R.style.UnlimitedFamily);
    }

    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        a.setOnKeyListener(new wst(this));
        return a;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle == null) {
            bundle = this.j;
        }
        try {
            this.ag = (aymq) anxl.parseFrom(aymq.h, bundle.getByteArray("UnlimitedFamilyMessageInterstitialRenderer"), anxa.c());
        } catch (anyg unused) {
        }
        arml arml = null;
        if (this.ag == null) {
            return null;
        }
        aphg aphg;
        arml arml2;
        arml arml3;
        View inflate = layoutInflater.inflate(R.layout.family_post_purchase_fragment_view, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.thumb_image_view);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.content);
        TextView textView3 = (TextView) inflate.findViewById(R.id.footer);
        TextView textView4 = (TextView) inflate.findViewById(R.id.action);
        TextView textView5 = (TextView) inflate.findViewById(R.id.dismiss);
        Map hashMap = new HashMap();
        hashMap.put("confirmDialogControllerListener", this);
        aphj aphj = this.ag.g;
        if (aphj == null) {
            aphj = aphj.d;
        }
        a(textView4, aphj, null);
        aphj aphj2 = this.ag.f;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        a(textView5, aphj2, hashMap);
        aphj2 = this.ag.g;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        if ((aphj2.a & 1) == 0) {
            aphg = null;
        } else {
            aphj2 = this.ag.g;
            if (aphj2 == null) {
                aphj2 = aphj.d;
            }
            aphg = aphj2.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        }
        this.af = aphg;
        aymq aymq = this.ag;
        if ((aymq.a & 2) != 0) {
            arml2 = aymq.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        xpr.a(textView, ajqy.a(arml2));
        aymq aymq2 = this.ag;
        if ((aymq2.a & 4) != 0) {
            arml3 = aymq2.d;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        } else {
            arml3 = null;
        }
        xpr.a(textView2, aabb.a(arml3, this.ab, false));
        aymq2 = this.ag;
        if ((aymq2.a & 8) != 0) {
            arml = aymq2.e;
            if (arml == null) {
                arml = arml.f;
            }
        }
        xpr.a(textView3, aabb.a(arml, this.ab, false));
        akkq akkq = this.aa;
        aygk aygk = this.ag.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        this.ad.a((wmk) this);
        return inflate;
    }

    private final akyy a(TextView textView, aphj aphj, Map map) {
        akyy a = this.Z.a(textView);
        aphg aphg = null;
        if (!(aphj == null || (aphj.a & 1) == 0)) {
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        }
        a.a(aphg, this.ac, map);
        a.c = this;
        return a;
    }

    public final void a() {
        dismiss();
    }

    public final void c() {
        f();
    }

    public final void d() {
        f();
    }

    public final void a(aphf aphf) {
        W();
        if (aphf != null && ((aphg) ((anxl) aphf.build())).equals(this.af)) {
            anxp anxp = this.af.m;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
            anxp.a(access$000);
            if (!anxp.h.a(access$000.d)) {
                dismiss();
            }
        }
    }

    public final void W() {
        this.ae.d(new wse());
    }
}
