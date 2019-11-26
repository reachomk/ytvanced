package defpackage;

import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;

/* renamed from: adzn */
final class adzn implements adzl {
    private final /* synthetic */ adzk a;

    adzn(adzk adzk) {
        this.a = adzk;
    }

    public final void a() {
        TvSignInActivity tvSignInActivity = (TvSignInActivity) this.a.p();
        this.a.b.a(tvSignInActivity.h, "canceled");
        tvSignInActivity.finish();
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountName", str);
        TvSignInActivity tvSignInActivity = (TvSignInActivity) this.a.p();
        if (TextUtils.isEmpty(tvSignInActivity.g)) {
            adbt.a(tvSignInActivity, TvSignInActivity.class, 2, bundle);
        } else {
            adbt.a(tvSignInActivity, TvSignInActivity.class, 1, bundle);
        }
    }

    public final void b() {
        Intent newChooseAccountIntent;
        String str = "com.google";
        if (VERSION.SDK_INT >= 23) {
            newChooseAccountIntent = AccountManager.newChooseAccountIntent(null, null, new String[]{str}, null, null, null, null);
        } else {
            newChooseAccountIntent = AccountManager.newChooseAccountIntent(null, null, new String[]{str}, false, null, null, null, null);
        }
        this.a.startActivityForResult(newChooseAccountIntent, 1);
    }

    public final void c() {
        ((TvSignInActivity) this.a.p()).j = true;
    }
}
