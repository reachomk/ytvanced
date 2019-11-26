package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteActivity;
import com.google.android.youtube.R;

/* renamed from: adxe */
public final class adxe extends nf {
    public adwl a;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mdx_smart_remote_fragment, viewGroup, false);
        ((adxf) xse.a(M_())).a(new adxi(inflate, new adxd(this))).a(this);
        return inflate;
    }

    public final void W_() {
        super.W_();
        adqi adqi = this.a;
        adqi.s = ((MdxSmartRemoteActivity) p()).i;
        adqi.d.a = true;
        adqi.b.a(adqi);
        adqe adqe = adqi.c;
        if (adqe != null) {
            adqi.a(adqe.d(), adqi.c.h().bv_());
        }
    }

    public final void N_() {
        super.N_();
        adqi adqi = this.a;
        adqi.d.a = false;
        adqi.b.b(adqi);
        adqe adqe = adqi.c;
        if (adqe != null && adqi.e) {
            adqe.a(3, null, null);
        }
    }
}
