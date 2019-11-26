package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import com.google.android.youtube.R;

/* renamed from: baew */
public final class baew {
    public static final String a = baew.class.getSimpleName();

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    public static boolean a(android.app.Activity r6, boolean r7) {
        /*
        r0 = defpackage.baew.a();
        r1 = 0;
        if (r0 == 0) goto L_0x00ea;
    L_0x0007:
        r0 = r6.getPackageManager();
        r2 = "android.software.vr.mode";
        r0 = r0.hasSystemFeature(r2);
        if (r0 == 0) goto L_0x00ea;
    L_0x0013:
        r0 = new android.content.ComponentName;
        r2 = "com.google.vr.vrcore.common.VrCoreListenerService";
        r3 = "com.google.vr.vrcore";
        r0.<init>(r3, r2);
        r6.setVrModeEnabled(r7, r0);	 Catch:{ NameNotFoundException -> 0x0044, UnsupportedOperationException -> 0x0021 }
        r6 = 1;
        return r6;
    L_0x0021:
        r6 = move-exception;
        r7 = a;
        r6 = java.lang.String.valueOf(r6);
        r0 = r6.length();
        r2 = new java.lang.StringBuilder;
        r0 = r0 + 23;
        r2.<init>(r0);
        r0 = "Failed to set VR mode: ";
        r2.append(r0);
        r2.append(r6);
        r6 = r2.toString();
        android.util.Log.w(r7, r6);
        goto L_0x00e9;
    L_0x0044:
        r7 = move-exception;
        r0 = a;
        r7 = java.lang.String.valueOf(r7);
        r4 = r7.length();
        r5 = new java.lang.StringBuilder;
        r4 = r4 + 25;
        r5.<init>(r4);
        r4 = "No VR service component: ";
        r5.append(r4);
        r5.append(r7);
        r7 = r5.toString();
        android.util.Log.w(r0, r7);
        r7 = defpackage.baew.a();
        if (r7 == 0) goto L_0x00e9;
    L_0x006b:
        r7 = r6.getPackageManager();
        r0 = "android.hardware.vr.high_performance";
        r7 = r7.hasSystemFeature(r0);
        if (r7 == 0) goto L_0x00e9;
    L_0x0077:
        r7 = r6.getPackageManager();
        r7 = r7.getInstalledApplications(r1);
        r7 = r7.iterator();
    L_0x0083:
        r0 = r7.hasNext();
        r4 = -1;
        r5 = -2;
        if (r0 == 0) goto L_0x00b8;
    L_0x008b:
        r0 = r7.next();
        r0 = (android.content.pm.ApplicationInfo) r0;
        r0 = r0.packageName;
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0083;
    L_0x0099:
        r7 = r6.getContentResolver();
        r0 = "enabled_vr_listeners";
        r7 = android.provider.Settings.Secure.getString(r7, r0);
        r0 = new android.content.ComponentName;
        r0.<init>(r3, r2);
        if (r7 == 0) goto L_0x00b6;
    L_0x00aa:
        r0 = r0.flattenToString();
        r7 = r7.contains(r0);
        if (r7 == 0) goto L_0x00b6;
    L_0x00b4:
        r7 = 0;
        goto L_0x00b9;
    L_0x00b6:
        r7 = -2;
        goto L_0x00b9;
    L_0x00b8:
        r7 = -1;
    L_0x00b9:
        r0 = defpackage.bafz.a();
        if (r0 == 0) goto L_0x00c0;
    L_0x00bf:
        goto L_0x00e2;
    L_0x00c0:
        if (r7 != r4) goto L_0x00d1;
    L_0x00c2:
        r7 = new baev;
        r7.<init>(r6);
        r0 = 2131952244; // 0x7f130274 float:1.9540925E38 double:1.0533243623E-314;
        r2 = 2131952475; // 0x7f13035b float:1.9541394E38 double:1.0533244765E-314;
        defpackage.baew.a(r6, r0, r2, r7);
        goto L_0x00e9;
    L_0x00d1:
        if (r7 != r5) goto L_0x00e2;
    L_0x00d3:
        r7 = new baey;
        r7.<init>(r6);
        r0 = 2131952243; // 0x7f130273 float:1.9540923E38 double:1.053324362E-314;
        r2 = 2131952476; // 0x7f13035c float:1.9541396E38 double:1.053324477E-314;
        defpackage.baew.a(r6, r0, r2, r7);
        goto L_0x00e9;
    L_0x00e2:
        r6 = a;
        r7 = "Failed to handle missing VrCore package.";
        android.util.Log.w(r6, r7);
    L_0x00e9:
        return r1;
    L_0x00ea:
        defpackage.baew.a();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baew.a(android.app.Activity, boolean):boolean");
    }

    public static boolean a() {
        return VERSION.SDK_INT >= 24;
    }

    private static void a(Context context, int i, int i2, OnClickListener onClickListener) {
        Builder builder = new Builder(context, R.style.GvrDialogTheme);
        builder.setMessage(i).setTitle(R.string.dialog_title_warning).setPositiveButton(i2, onClickListener).setNegativeButton(R.string.cancel_button, new baex());
        builder.create().show();
    }

    private baew() {
    }
}
