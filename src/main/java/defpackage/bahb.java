package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bahb */
public final class bahb {
    public static void a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setAction("com.google.vrtoolkit.cardboard.CONFIGURE").addFlags(268435456);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        Integer num = null;
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            if (baga.a(str)) {
                int i = resolveInfo.priority;
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                    int i2 = applicationInfo != null ? applicationInfo.flags : 0;
                    if (!((i2 & 1) == 0 && (i2 & 128) == 0)) {
                        i++;
                    }
                } catch (NameNotFoundException unused) {
                }
                if (num == null) {
                    num = Integer.valueOf(i);
                } else if (i > num.intValue()) {
                    num = Integer.valueOf(i);
                    arrayList.clear();
                } else if (i < num.intValue()) {
                }
                Intent intent2 = new Intent(intent);
                intent2.setClassName(str, resolveInfo.activityInfo.name);
                arrayList.add(intent2);
            }
        }
        List c = bahk.c(context);
        if ((c == null || c.isEmpty()) && VERSION.SDK_INT >= 23) {
            if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                Activity a = baff.a(context);
                if (a == null) {
                    Log.w(bagg.a, "An Activity Context is required, aborting storage permission request.");
                } else {
                    a.requestPermissions(new String[]{r0}, 239);
                }
            }
        }
        if (arrayList.isEmpty()) {
            bahf bahf = new bahf(context);
            Builder b = bahb.b(context);
            b.setTitle(R.string.dialog_title).setMessage(R.string.dialog_message_no_cardboard).setPositiveButton(R.string.go_to_playstore_button, bahf).setNegativeButton(R.string.cancel_button, null);
            bahb.a(context, b.create());
            return;
        }
        if (arrayList.size() == 1) {
            intent = (Intent) arrayList.get(0);
        }
        context.startActivity(intent);
    }

    public static AlertDialog a(Context context, Runnable runnable) {
        bahe bahe = new bahe(context);
        Builder b = bahb.b(context);
        b.setTitle(R.string.dialog_title_incompatible_phone).setMessage(R.string.dialog_message_incompatible_phone).setCancelable(false).setPositiveButton(R.string.dialog_button_open_help_center, bahe).setNegativeButton(R.string.dialog_button_got_it, new bahd());
        if (runnable != null) {
            b.setOnCancelListener(new bahg(runnable));
        }
        AlertDialog create = b.create();
        create.setCanceledOnTouchOutside(false);
        return bahb.a(context, create);
    }

    private static AlertDialog a(Context context, AlertDialog alertDialog) {
        alertDialog.getWindow().setFlags(8, 8);
        alertDialog.show();
        Activity a = baff.a(context);
        if (a != null) {
            alertDialog.getWindow().getDecorView().setSystemUiVisibility(a.getWindow().getDecorView().getSystemUiVisibility());
        }
        alertDialog.getWindow().clearFlags(8);
        return alertDialog;
    }

    private static Builder b(Context context) {
        return new Builder(context, R.style.GvrDialogTheme);
    }

    static {
        bagg bagg = new bagg();
    }
}
