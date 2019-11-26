package defpackage;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Process;

/* renamed from: jct */
public final class jct implements OnClickListener {
    private final /* synthetic */ Activity a;
    private final /* synthetic */ long b = 1500;

    public jct(Activity activity) {
        this.a = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.a;
        ((AlarmManager) activity.getSystemService("alarm")).setExact(3, this.b, PendingIntent.getActivity(activity, 0, ebl.b(activity), 134217728));
        Process.killProcess(Process.myPid());
    }
}
