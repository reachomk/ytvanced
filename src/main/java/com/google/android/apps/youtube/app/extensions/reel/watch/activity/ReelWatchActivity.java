package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.youtube.R;
import defpackage.acvx;
import defpackage.acwa;
import defpackage.acwc;
import defpackage.aej;
import defpackage.ahyg;
import defpackage.aiqq;
import defpackage.ajrb;
import defpackage.anze;
import defpackage.aygk;
import defpackage.aygm;
import defpackage.exu;
import defpackage.fmu;
import defpackage.gkz;
import defpackage.gla;
import defpackage.gml;
import defpackage.gmp;
import defpackage.mt;
import defpackage.nt;
import defpackage.or;
import defpackage.wxd;
import defpackage.wxe;
import defpackage.xey;
import defpackage.xfc;
import defpackage.xse;

public class ReelWatchActivity extends aej implements acwa, xfc {
    private static final String j = gmp.class.getCanonicalName();
    public gml g;
    public ahyg h;
    public exu i;
    private gla k;
    private gmp l;
    private nt m;

    public static Intent a(Context context, aiqq aiqq) {
        Intent intent = new Intent(context, ReelWatchActivity.class);
        intent.setFlags(262144);
        intent.putExtra("com.google.android.apps.youtube.PlaybackStartDescriptor", aiqq);
        return intent;
    }

    public static int a(aygk aygk) {
        return (aygk == null || aygk.b.size() <= 0) ? 1 : ((aygm) aygk.b.get(0)).d;
    }

    public static int b(aygk aygk) {
        return (aygk == null || aygk.b.size() <= 0) ? 1 : ((aygm) aygk.b.get(0)).c;
    }

    public static Bundle c(aygk aygk) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.youtube.ThumbnailData", new ajrb((anze) aygk));
        return bundle;
    }

    public static void a(Context context, wxd wxd, Intent intent, wxe wxe, Bundle bundle) {
        if (wxd == null) {
            context.startActivity(intent);
        } else if (bundle == null || VERSION.SDK_INT < 21) {
            wxd.a(intent, 2200, wxe);
        } else {
            intent.putExtras(bundle);
            wxd.a(intent, 2200, mt.a(context, R.anim.reel_activity_slide_up, R.anim.reel_activity_fade_out).a(), wxe);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        fmu.a(this);
        l().a(this);
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 21) {
            postponeEnterTransition();
        }
        this.g.a(0, 2);
        setContentView((int) R.layout.reel_watch_activity);
        a(bundle);
        this.i.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        a(null);
    }

    private final void a(Bundle bundle) {
        this.m = f();
        or a = this.m.a();
        this.l = null;
        if (bundle != null) {
            this.l = (gmp) this.m.a(bundle, j);
        }
        if (this.l == null) {
            this.l = new gmp();
        }
        a.b(R.id.fragment_container, this.l);
        a.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        gmp gmp = this.l;
        if (gmp != null) {
            this.m.a(bundle, j, gmp);
        }
    }

    private final gla l() {
        if (this.k == null) {
            this.k = ((gkz) xse.a(getApplication())).b(new xey(this));
        }
        return this.k;
    }

    public final void onResume() {
        super.onResume();
        this.i.b();
    }

    public final void onPause() {
        if (isFinishing()) {
            setRequestedOrientation(-1);
        }
        super.onPause();
        this.i.c();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.i.a(configuration);
    }

    public final void onBackPressed() {
        gmp gmp = this.l;
        if (gmp != null) {
            gmp.a(acwc.MOBILE_BACK_BUTTON);
        } else {
            super.onBackPressed();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDestroy() {
        super.onDestroy();
        this.i.d();
    }

    public final acvx t() {
        return this.h.a();
    }

    public final /* synthetic */ Object n() {
        return l();
    }
}
