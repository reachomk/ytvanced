package com.google.android.apps.youtube.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;

public class PackageReplacedReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        YouTubeBackupAgent.c(context);
    }
}
