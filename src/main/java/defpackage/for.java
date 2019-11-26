package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import java.util.concurrent.Executor;

/* renamed from: for */
public final class for {
    public final Activity a;
    public final NfcAdapter b;
    public final Executor c;

    public for(Activity activity, Executor executor) {
        this.a = (Activity) amqw.a((Object) activity);
        this.c = (Executor) amqw.a((Object) executor);
        this.b = NfcAdapter.getDefaultAdapter(activity);
        String str = "android.nfc.action.NDEF_DISCOVERED";
        IntentFilter intentFilter = new IntentFilter(str);
        intentFilter.addAction("android.nfc.action.TECH_DISCOVERED");
        intentFilter.addAction("android.nfc.action.TAG_DISCOVERED");
        new IntentFilter[1][0] = intentFilter;
        Intent intent = new Intent(str);
        intent.setPackage(activity.getPackageName());
        PendingIntent.getActivity(activity, 0, intent, 0);
    }
}
