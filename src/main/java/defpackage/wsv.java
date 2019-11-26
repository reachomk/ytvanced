package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wsv */
public final class wsv extends nd implements akyw, wmj {
    public akkq Z;
    public aaas aa;
    public acvx ab;
    public akzb ac;
    public wmh ad;
    public xci ae;
    private ImageView af;
    private LinearLayout ag;
    private TextView ah;
    private TextView ai;
    private TextView aj;
    private TextView ak;
    private ayms al;

    public final boolean e() {
        return false;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((wsu) xse.b(M_())).a(this);
        a(0, (int) R.style.UnlimitedFamily);
        this.ad.a((wmj) this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle == null) {
            bundle = this.j;
        }
        try {
            this.al = (ayms) anxl.parseFrom(ayms.k, bundle.getByteArray("UnlimitedFamilyProfileInterstitialRenderer"), anxa.c());
        } catch (anyg unused) {
        }
        arml arml = null;
        if (this.al == null) {
            return null;
        }
        arml arml2;
        View inflate = layoutInflater.inflate(R.layout.family_pre_purchase_fragment_view, viewGroup, false);
        this.af = (ImageView) inflate.findViewById(R.id.main_thumbnail);
        this.ag = (LinearLayout) inflate.findViewById(R.id.secondary_thumbnails);
        this.ah = (TextView) inflate.findViewById(R.id.member_info);
        this.ai = (TextView) inflate.findViewById(R.id.member_title);
        HashMap hashMap = new HashMap();
        hashMap.put("accountName", "myaccount");
        TextView textView = (TextView) inflate.findViewById(R.id.manage_button);
        aphj aphj = this.al.f;
        if (aphj == null) {
            aphj = aphj.d;
        }
        a(textView, aphj, false, hashMap);
        this.aj = (TextView) inflate.findViewById(R.id.additional_info_header);
        this.ak = (TextView) inflate.findViewById(R.id.additional_info);
        TextView textView2 = (TextView) inflate.findViewById(R.id.action_button);
        aphj aphj2 = this.al.j;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        a(textView2, aphj2, true, null);
        textView2 = (TextView) inflate.findViewById(R.id.dismiss_button);
        aphj2 = this.al.i;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        a(textView2, aphj2, true, null);
        akkq akkq = this.Z;
        ImageView imageView = this.af;
        aygk aygk = this.al.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        for (aygk a : this.al.c) {
            ImageView imageView2 = (ImageView) layoutInflater.inflate(R.layout.family_pre_purchase_fragment_secondary_thumbnail, this.ag, false);
            this.Z.a(imageView2, a);
            this.ag.addView(imageView2);
        }
        int childCount = this.ag.getChildCount();
        this.ag.setVisibility(childCount <= 0 ? 8 : 0);
        childCount = q().getDimensionPixelSize(childCount > 0 ? R.dimen.family_profile_main_thumbnail_size_small : R.dimen.family_profile_main_thumbnail_size_big);
        this.af.getLayoutParams().height = childCount;
        this.af.getLayoutParams().width = childCount;
        TextView textView3 = this.ah;
        ayms ayms = this.al;
        if ((ayms.a & 2) != 0) {
            arml2 = ayms.d;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        xpr.a(textView3, ajqy.a(arml2));
        textView3 = this.ai;
        ayms = this.al;
        if ((ayms.a & 4) != 0) {
            arml2 = ayms.e;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        xpr.a(textView3, ajqy.a(arml2));
        textView3 = this.aj;
        ayms = this.al;
        if ((ayms.a & 16) != 0) {
            arml2 = ayms.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        xpr.a(textView3, ajqy.a(arml2));
        textView3 = this.ak;
        ayms = this.al;
        if ((ayms.a & 32) != 0) {
            arml = ayms.h;
            if (arml == null) {
                arml = arml.f;
            }
        }
        xpr.a(textView3, aabb.a(arml, this.aa, false));
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ad.b(this);
    }

    private final akyy a(TextView textView, aphj aphj, boolean z, Map map) {
        akyy a = this.ac.a(textView);
        aphg aphg = null;
        if (!(aphj == null || (aphj.a & 1) == 0)) {
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        }
        a.a(aphg, this.ab, map);
        if (z) {
            a.c = this;
        }
        return a;
    }

    public final void a(aphf aphf) {
        dismiss();
    }

    public final void a(boolean z) {
        if (z) {
            f();
            this.ae.d(new wse());
        }
    }
}
