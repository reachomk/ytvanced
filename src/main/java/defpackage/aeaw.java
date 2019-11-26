package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: aeaw */
public final class aeaw extends nf {
    public static String b;
    public aeas a;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mdx_tvsignin_waiting_fragment, viewGroup, false);
        ((aeax) xse.a(M_())).a(new aeba(inflate, new aeav(this))).a(this);
        return inflate;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        b = (String) amqw.a(this.j.getString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountName"));
    }

    public final void W_() {
        super.W_();
        this.a.e.run();
    }

    public final void N_() {
        super.N_();
        aeas aeas = this.a;
        aeas.f.removeCallbacks(aeas.e);
    }
}
