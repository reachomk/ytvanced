package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.pfs;

public final class AnalyticsReceiver extends BroadcastReceiver {
    private pfs a;

    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new pfs();
        }
        pfs.a(context, intent);
    }
}
