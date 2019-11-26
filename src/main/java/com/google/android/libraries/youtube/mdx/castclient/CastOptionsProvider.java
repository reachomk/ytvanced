package com.google.android.libraries.youtube.mdx.castclient;

import android.content.Context;
import defpackage.adbk;
import defpackage.adby;
import defpackage.tbr;
import defpackage.tbu;
import defpackage.tbz;
import defpackage.tcb;
import defpackage.tcc;
import defpackage.tce;
import defpackage.tcg;
import defpackage.xse;

public class CastOptionsProvider implements tcg {
    public String castAppId;
    public tbz castMediaOptionsFactory;
    public tce castOptionsBuilderFactory;
    public tbu launchOptionsBuilderFactory;
    public adby mdxModuleConfig;

    public tcc getCastOptions(Context context) {
        ((adbk) xse.a(context)).a(this);
        tcb a = this.castOptionsBuilderFactory.a().a(this.castAppId).c().b().a();
        tbr a2 = this.launchOptionsBuilderFactory.a();
        boolean z = true;
        if (this.mdxModuleConfig.g() != 1) {
            z = false;
        }
        return a.a(a2.a(z).a()).a(this.castMediaOptionsFactory.a().a().b()).d();
    }
}
