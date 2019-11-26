package com.google.android.libraries.youtube.mdx.tvsignin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.adbt;
import defpackage.adbu;
import defpackage.adzk;
import defpackage.adzu;
import defpackage.aead;
import defpackage.aeae;
import defpackage.aeaw;
import defpackage.amqw;
import defpackage.nf;
import defpackage.xse;
import defpackage.xtl;

public final class TvSignInActivity extends adbu {
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    private aeae l;

    /* Access modifiers changed, original: protected|final */
    public final int l() {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        this.l = ((aead) xse.a((Context) this)).pq();
        this.l.a();
        this.g = getIntent().getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAuthCode");
        this.h = (String) amqw.a(getIntent().getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyScreenId"));
        String str = "com.google.android.libraries.youtube.mdx.tvsignin.isMdxAssisted";
        this.k = getIntent().getBooleanExtra(str, false);
        this.i = getIntent().getBooleanExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountChooserUi", false);
        super.onCreate(bundle);
        Intent intent = new Intent();
        intent.putExtra(str, this.k);
        setResult(0, intent);
    }

    /* Access modifiers changed, original: protected|final */
    public final nf c(int i) {
        if (i == 0) {
            return new adzk();
        }
        if (i == 1) {
            return new adzu();
        }
        if (i == 2) {
            return new aeaw();
        }
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("Unknown current index ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, nf nfVar) {
        if (i == 0) {
            return nfVar instanceof adzk;
        }
        if (i != 1) {
            return i != 2 ? false : nfVar instanceof aeaw;
        } else {
            return nfVar instanceof adzu;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d(int i) {
        if (!this.j ? i != 0 : i != 1) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.libraries.youtube.mdx.tvsignin.keyNotifyProgressApi", true);
        adbt.a(this, TvSignInActivity.class, 0, bundle);
        return true;
    }

    static {
        xtl.b("MDX.TvSignInActivity");
    }
}
