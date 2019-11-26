package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.youtube.R;

/* renamed from: psf */
public final class psf extends psh {
    public static final psf a = new psf();
    public static final int b = psh.c;
    private static final Object e = new Object();

    psf() {
    }

    public final Dialog a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return psf.a((Context) activity, i, new qad(psh.a(activity, i, "d"), activity, i2), onCancelListener);
    }

    public final boolean a(Activity activity, puf puf, int i, OnCancelListener onCancelListener) {
        Dialog a = psf.a((Context) activity, i, new qac(psh.a(activity, i, "d"), puf), onCancelListener);
        if (a == null) {
            return false;
        }
        psf.a(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        psf.a(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final void a(Context context, int i) {
        a(context, i, b(context, i, "n"));
    }

    public static Dialog a(Activity activity, OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(pzy.c(activity, 18));
        builder.setPositiveButton("", null);
        Dialog create = builder.create();
        psf.a(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public static pwc a(Context context, pwf pwf) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        pwc pwc = new pwc(pwf);
        context.registerReceiver(pwc, intentFilter);
        pwc.a = context;
        if (psl.a(context, "com.google.android.gms")) {
            return pwc;
        }
        pwf.a();
        pwc.a();
        return null;
    }

    public final int a(Context context) {
        return psl.d(context);
    }

    private static Dialog a(Context context, int i, qaa qaa, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(pzy.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = pzy.e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, qaa);
        }
        String a = pzy.a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        return builder.create();
    }

    private static void a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        Object obj = "Cannot display null dialog";
        if (activity instanceof nn) {
            nt f = ((nn) activity).f();
            psn psn = new psn();
            dialog = (Dialog) pzr.a((Object) dialog, obj);
            dialog.setOnCancelListener(null);
            dialog.setOnDismissListener(null);
            psn.c = dialog;
            if (onCancelListener != null) {
                psn.Z = onCancelListener;
            }
            psn.a(f, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        psd psd = new psd();
        dialog = (Dialog) pzr.a((Object) dialog, obj);
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        psd.a = dialog;
        if (onCancelListener != null) {
            psd.b = onCancelListener;
        }
        psd.show(fragmentManager, str);
    }

    public final void a(Context context, int i, PendingIntent pendingIntent) {
        if (i == 18) {
            b(context);
        } else if (pendingIntent != null) {
            CharSequence b = pzy.b(context, i);
            CharSequence d = pzy.d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            qg qgVar = new qg(context);
            qgVar.a();
            qgVar.b(true);
            qgVar.a(b);
            qj qhVar = new qh();
            qhVar.a(d);
            qgVar.a(qhVar);
            if (qbc.a(context)) {
                pzr.a(qbf.a());
                qgVar.a(context.getApplicationInfo().icon);
                qgVar.i = 2;
                if (qbc.b(context)) {
                    qgVar.a((int) R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    qgVar.f = pendingIntent;
                }
            } else {
                qgVar.a(17301642);
                qgVar.e(resources.getString(R.string.common_google_play_services_notification_ticker));
                qgVar.a(System.currentTimeMillis());
                qgVar.f = pendingIntent;
                qgVar.b(d);
            }
            if (qbf.c()) {
                pzr.a(qbf.c());
                synchronized (e) {
                }
                String str = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
                String a = pzy.a(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel(str, a, 4));
                } else if (!a.equals(notificationChannel.getName())) {
                    notificationChannel.setName(a);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                qgVar.x = str;
            }
            Notification e = qgVar.e();
            if (i == 1 || i == 2 || i == 3) {
                psl.b.set(false);
                i = 10436;
            } else {
                i = 39789;
            }
            notificationManager.notify(i, e);
        } else {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        }
    }

    public final void b(Context context) {
        new pse(this, context).sendEmptyMessageDelayed(1, 120000);
    }
}
