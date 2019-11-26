package com.google.android.libraries.youtube.mdx.smartpairing;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.youtube.R;
import defpackage.adbt;
import defpackage.adbu;
import defpackage.aduv;
import defpackage.advo;
import defpackage.advq;
import defpackage.adwc;
import defpackage.nf;
import defpackage.xfc;

public final class PairWithTvActivity extends adbu implements xfc {
    private advq g;

    /* Access modifiers changed, original: protected|final */
    public final int l() {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(!getIntent().getBooleanExtra("com.google.android.libraries.youtube.mdx.smartpairing.darkTheme", false) ? R.style.f270Mdx.Theme.Settings : R.style.f271Mdx.Theme.Settings.Dark);
        g().b(true);
    }

    public final void a(advq advq) {
        this.g = advq;
        this.g.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final nf c(int i) {
        if (i == 0) {
            return new advo();
        }
        if (i == 1) {
            return new adwc();
        }
        if (i == 2) {
            return new aduv();
        }
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("Unknown current index ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, nf nfVar) {
        if (i == 0) {
            return nfVar instanceof advo;
        }
        if (i != 1) {
            return i != 2 ? false : nfVar instanceof aduv;
        } else {
            return nfVar instanceof adwc;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, Activity activity) {
        if (i == 0) {
            activity.setTitle(R.string.mdx_pair_with_tv_prefs_title);
        } else if (i == 1) {
            activity.setTitle(R.string.mdx_pref_use_tv_code_title);
        } else if (i == 2) {
            activity.setTitle(R.string.mdx_pref_delete_tv_codes_code_title);
        } else {
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("Unknown current index ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d(int i) {
        if (i == 0) {
            return false;
        }
        adbt.a(this, PairWithTvActivity.class, 0);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object n() {
        return this.g;
    }
}
