package com.google.firebase.iid;

import android.content.Intent;
import defpackage.anpk;
import defpackage.anpq;

@Deprecated
public class FirebaseInstanceIdService extends anpq {
    /* Access modifiers changed, original: protected|final */
    public final Intent a() {
        return (Intent) anpk.a().c.poll();
    }

    public final void a(Intent intent) {
        if (!"com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("CMD");
            if (stringExtra == null) {
                return;
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.a().f();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId a = FirebaseInstanceId.a();
                FirebaseInstanceId.a.c("");
                a.b();
            }
        }
    }
}
