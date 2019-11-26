package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.youtube.mdx.smartpairing.PairWithTvActivity;
import com.google.android.youtube.R;

/* renamed from: adwc */
public final class adwc extends nf {
    public advv a;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mdx_use_tv_code_fragment, viewGroup, false);
        advq a = ((advt) xse.a(M_())).a(new advs(null, null, inflate, new adwe(this)));
        a.a(this);
        ((PairWithTvActivity) p()).a(a);
        return inflate;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        advv advv = this.a;
        nn p = p();
        advv.e = p;
        if (!xrn.c(p)) {
            advv.f.requestFocus();
        }
        ((InputMethodManager) p.getSystemService("input_method")).showSoftInput(advv.f, 1);
        if (bundle != null) {
            advv.f.setText(bundle.getString("extraTvCode1"));
            advv.g.setText(bundle.getString("extraTvCode2"));
            advv.h.setText(bundle.getString("extraTvCode3"));
            advv.i.setText(bundle.getString("extraTvCode4"));
        }
    }

    public final void W_() {
        super.W_();
        advv advv = this.a;
        nv nvVar = this.v;
        advv.c.d();
        advv.a.a = nvVar;
    }

    public final void N_() {
        super.N_();
        advv advv = this.a;
        advv.c.e();
        advv.a.a = null;
    }

    public final void e(Bundle bundle) {
        advv advv = this.a;
        bundle.putString("extraTvCode1", String.valueOf(advv.f.getText()));
        bundle.putString("extraTvCode2", String.valueOf(advv.g.getText()));
        bundle.putString("extraTvCode3", String.valueOf(advv.h.getText()));
        bundle.putString("extraTvCode4", String.valueOf(advv.i.getText()));
    }
}
