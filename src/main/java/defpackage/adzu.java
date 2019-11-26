package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
import com.google.android.youtube.R;

/* renamed from: adzu */
public final class adzu extends nf {
    public adzr a;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mdx_tvsignin_permissions_fragment, viewGroup, false);
        ((adzz) xse.a(M_())).a(new adzy(inflate, new adzx(this))).a(this);
        return inflate;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        String str = (String) amqw.a(this.j.getString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountName"));
        TvSignInActivity tvSignInActivity = (TvSignInActivity) p();
        adzr adzr = this.a;
        String str2 = tvSignInActivity.g;
        String str3 = tvSignInActivity.h;
        adzr.h.a(acwl.I, null, null);
        adzr.f.a(str3, "started");
        adzr.i = str3;
        adzr.c.getSettings().setJavaScriptEnabled(true);
        adzr.c.addJavascriptInterface(adzr.g, "approvalJsInterface");
        adzr.c.setWebViewClient(new adzq(adzr));
        new adzt(adzr, str2).execute(new Account[]{new Account(str, "com.google")});
    }
}
