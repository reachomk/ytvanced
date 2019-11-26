package com.google.android.libraries.youtube.notification;

import android.content.Intent;
import defpackage.afuk;
import defpackage.afup;

public final class NotificationProcessingService extends afup {
    public afuk a;

    public NotificationProcessingService() {
        super("NotificationProcessingService");
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            this.a.a(intent.getByteArrayExtra("com.google.android.libraries.youtube.notification.pref.notification_renderer"), intent.getStringExtra("renderer_class_name"));
        }
    }

    public final /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }
}
