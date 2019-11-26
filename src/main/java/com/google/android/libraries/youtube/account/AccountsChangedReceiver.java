package com.google.android.libraries.youtube.account;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.pl;
import defpackage.xtl;

public class AccountsChangedReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            pl.a(context, AccountsChangedJobIntentService.class, intent);
        } else {
            xtl.d("AccountsChangedReceiver: null intent received. Ignoring.");
        }
    }
}
