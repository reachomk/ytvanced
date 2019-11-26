package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: anqu */
public final class anqu {
    public static void a(Intent intent) {
        String str = "FirebaseMessaging";
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        stringExtra = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra != null) {
            bundle.putString("_nmn", stringExtra);
        }
        stringExtra = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra)) {
            bundle.putString("label", stringExtra);
        }
        stringExtra = intent.getStringExtra("from");
        String str2 = null;
        if (stringExtra != null && stringExtra.startsWith("/topics/")) {
            str2 = stringExtra;
        }
        if (str2 != null) {
            bundle.putString("_nt", str2);
        }
        try {
            bundle.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
        } catch (NumberFormatException e) {
            Log.w(str, "Error while parsing timestamp in GCM event", e);
        }
        stringExtra = "google.c.a.udt";
        if (intent.hasExtra(stringExtra)) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(intent.getStringExtra(stringExtra)));
            } catch (NumberFormatException e2) {
                Log.w(str, "Error while parsing use_device_time in GCM event", e2);
            }
        }
        anlq anlq = (anlq) anlf.c().a(anlq.class);
        if (anlq == null) {
            Log.w(str, "Unable to log event: analytics library is missing");
        } else {
            anlq.a();
        }
    }
}
