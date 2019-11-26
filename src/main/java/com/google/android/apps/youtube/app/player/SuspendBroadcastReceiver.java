package com.google.android.apps.youtube.app.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.aizy;
import defpackage.hvd;
import defpackage.xse;

public class SuspendBroadcastReceiver extends BroadcastReceiver {
    public aizy a;
    private boolean b = false;

    public final void onReceive(Context context, Intent intent) {
        if (!this.b) {
            ((hvd) xse.a(context)).a(this);
            this.b = true;
        }
        this.a.j();
    }
}
