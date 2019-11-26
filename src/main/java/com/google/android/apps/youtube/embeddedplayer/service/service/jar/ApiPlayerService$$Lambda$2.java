package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import defpackage.bcaa;
import defpackage.mlp;
import defpackage.uys;
import java.security.AccessControlException;

final /* synthetic */ class ApiPlayerService$$Lambda$2 implements Runnable {
    private final ApiPlayerService a;

    ApiPlayerService$$Lambda$2(ApiPlayerService apiPlayerService) {
        this.a = apiPlayerService;
    }

    public final void run() {
        mlp mlp = this.a.a.a;
        if (mlp.e) {
            bcaa bcaa = mlp.g;
            if (bcaa != null) {
                ((uys) bcaa.get()).a("Third-party signOut invocation.", true);
                return;
            }
        }
        throw new AccessControlException("Permission denied: unauthorized usage of SignOut API");
    }
}
