package com.google.android.apps.youtube.app.application.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.ddv;
import defpackage.dea;
import defpackage.dek;
import defpackage.dfe;
import defpackage.xtl;

public class LocaleUpdatedReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        ddv ddv = new ddv(new dea(context));
        dek a = ddv.a();
        a.a(LocaleUpdatedJobService.class);
        a.c = "locale_updated_job_service";
        a.d = dfe.a;
        a.h = true;
        if (ddv.a(a.a()) != 0) {
            xtl.c("Error scheduling locale update service");
        }
    }
}
