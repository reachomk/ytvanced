package com.google.android.apps.youtube.app.extensions.mediabrowser.impl;

import defpackage.fzj;
import defpackage.fzl;
import defpackage.tv;
import defpackage.ty;
import defpackage.ur;
import defpackage.wq;
import defpackage.xo;
import defpackage.xse;
import java.util.Collections;

public class MainAppMediaBrowserService extends tv {
    public fzl h;

    public final void onCreate() {
        super.onCreate();
        ((fzj) xse.a(getApplicationContext())).a(this);
        wq wqVar = (wq) this.h.c.get();
        wqVar.e();
        xo d = wqVar.d();
        if (d == null) {
            throw new IllegalArgumentException("Session token may not be null");
        } else if (this.g == null) {
            this.g = d;
            this.a.a(d);
        } else {
            throw new IllegalStateException("The session token has already been set");
        }
    }

    public final ty a() {
        return new ty("__EMPTY_ROOT__", null);
    }

    public final void a(ur urVar) {
        urVar.b(Collections.emptyList());
    }
}
