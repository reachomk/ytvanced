package com.google.android.libraries.youtube.mdx.background;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.aczy;
import defpackage.adah;
import defpackage.xse;
import defpackage.xtl;

public class MdxBackgroundScanBootReceiver extends BroadcastReceiver {
    private static final String b = xtl.b("MDX.BootReceiver");
    public adah a;

    public final void onReceive(Context context, Intent intent) {
        xtl.c(b, "MdxBackgroundScanBootReceiver: onReceive");
        ((aczy) xse.a(context)).a(this);
        this.a.a();
    }
}
