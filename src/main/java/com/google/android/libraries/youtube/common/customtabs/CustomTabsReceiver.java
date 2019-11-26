package com.google.android.libraries.youtube.common.customtabs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public class CustomTabsReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", dataString);
            intent = Intent.createChooser(intent2, null);
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
    }
}
