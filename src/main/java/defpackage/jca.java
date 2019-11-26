package defpackage;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Handler;
import android.os.Process;

/* renamed from: jca */
public final class jca {
    static void a(Handler handler, Context context, String str, OnClickListener onClickListener) {
        handler.post(new jbz(context, str, onClickListener));
    }

    static void a(Handler handler, Context context, String str, boolean z) {
        handler.post(new jcc(context, str, z));
    }

    static void a(Activity activity) {
        ((AlarmManager) activity.getSystemService("alarm")).setExact(3, 1500, PendingIntent.getActivity(activity, 0, new Intent().setClassName(activity, "com.google.android.youtube.HomeActivity"), 134217728));
        Process.killProcess(Process.myPid());
    }
}
