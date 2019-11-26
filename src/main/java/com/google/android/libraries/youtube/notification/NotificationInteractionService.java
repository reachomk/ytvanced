package com.google.android.libraries.youtube.notification;

import android.app.IntentService;
import android.content.Intent;
import defpackage.afug;
import defpackage.afxn;
import defpackage.xfc;

public final class NotificationInteractionService extends IntentService {
    public afxn a;

    public NotificationInteractionService() {
        super("NotificationInteractionService");
    }

    public final void onCreate() {
        super.onCreate();
        ((afug) ((xfc) getApplication()).n()).a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            this.a.a(intent);
        }
    }
}
