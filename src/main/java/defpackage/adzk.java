package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
import com.google.android.youtube.R;

/* renamed from: adzk */
public final class adzk extends nf {
    public adze a;
    public aeab b;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mdx_tvsignin_account_chooser_fragment, viewGroup, false);
        ((adzp) xse.a(M_())).a(new adzo(inflate, new adzn(this))).a(this);
        return inflate;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        bundle = this.j;
        Object obj = (bundle == null || !bundle.getBoolean("com.google.android.libraries.youtube.mdx.tvsignin.keyNotifyProgressApi", false)) ? null : 1;
        TvSignInActivity tvSignInActivity = (TvSignInActivity) p();
        adze adze = this.a;
        Object obj2 = tvSignInActivity.h;
        boolean z = tvSignInActivity.i;
        boolean z2 = tvSignInActivity.k;
        if (!(obj == null || z2)) {
            adze.e.a((String) amqw.a(obj2), "canceled");
        }
        adze.f.b(acwc.MDX_TV_SIGN_IN_ACCOUNT_CHOOSER_CANCEL_BUTTON, null);
        if (adze.d.a()) {
            adze.n = (uue) amqw.a(adze.b.d());
            if (z) {
                adze.a.a(adze.n.b);
                adze.a.c();
                return;
            }
            adze.h.setVisibility(0);
            adze.m.setVisibility(8);
            adze.j.setText(adze.n.d);
            adze.k.setText(adze.n.b);
            aaft aaft = adze.n.e;
            if (aaft != null) {
                adze.c.a(adze.i, aaft.d());
            }
            adze.l.setText(adze.g.getResources().getString(R.string.mdx_tvsignin_account_chooser_continue_as, new Object[]{r8}));
            adze.f.b(acwc.MDX_TV_SIGN_IN_ACCOUNT_CHOOSER_CONTINUE_AS_BUTTON, null);
            adze.f.b(acwc.MDX_TV_SIGN_IN_ACCOUNT_CHOOSER_SWITCH_ACCOUNTS_BUTTON, null);
            return;
        }
        adze.h.setVisibility(8);
        adze.m.setVisibility(0);
        adze.f.b(acwc.MDX_TV_SIGN_IN_ACCOUNT_CHOOSER_SIGN_IN_BUTTON, null);
    }

    public final void a(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            String str = (String) amqw.a(intent.getStringExtra("authAccount"));
            this.a.a.a(str);
        }
    }
}
