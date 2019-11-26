package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.io.File;

/* renamed from: acky */
public final class acky implements Runnable {
    private final boolean a;
    private final Context b;
    private final acfe c;
    private final xsc d;

    public acky(boolean z, Context context, acfe acfe, xsc xsc) {
        this.a = z;
        this.b = context;
        this.c = acfe;
        this.d = xsc;
    }

    public final void run() {
        abzv abzv = new abzv(this.b, this.d);
        xak.b();
        for (File delete : abzv.a.listFiles()) {
            delete.delete();
        }
        SharedPreferences a = xly.a(this.b);
        String str = "SHARED_PREF_STREAM_CONFIG_KEY";
        String string = a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            Editor edit = a.edit();
            edit.remove(str);
            edit.remove("SHARED_PREF_LS_TIMESTAMP_KEY");
            edit.commit();
            if (this.a) {
                aceo a2 = aceo.a(string);
                if (a2 != null && !TextUtils.isEmpty(a2.c)) {
                    this.c.a(a2.c, new ackx());
                }
            }
        }
    }
}
