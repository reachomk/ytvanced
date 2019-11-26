package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: qhu */
public final class qhu {
    public static final qia a = qhx.a().b();
    private static String e = null;
    private static boolean f = false;
    private static int g = 0;
    private static BroadcastReceiver h = null;
    public final Context b;
    public Messenger c;
    public MessengerCompat d;
    private final Map i = new zj();
    private Messenger j;
    private PendingIntent k;

    public qhu(Context context) {
        this.b = context;
    }

    public static String a(Context context) {
        String str = e;
        if (str != null) {
            return str;
        }
        String str2;
        Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        if (!qbf.c()) {
            str2 = "com.google.android.c2dm.intent.REGISTER";
            for (ResolveInfo resolveInfo : packageManager.queryIntentServices(new Intent(str2), 0)) {
                if (qhu.a(packageManager, resolveInfo.serviceInfo.packageName, str2)) {
                    f = false;
                    return e;
                }
            }
        }
        str2 = "com.google.iid.TOKEN_REQUEST";
        for (ResolveInfo resolveInfo2 : packageManager.queryBroadcastReceivers(new Intent(str2), 0)) {
            if (qhu.a(packageManager, resolveInfo2.activityInfo.packageName, str2)) {
                f = true;
                return e;
            }
        }
        str = "InstanceID";
        Log.w(str, "Failed to resolve IID implementation package, falling back");
        if (qhu.a(packageManager, "com.google.android.gms")) {
            f = qbf.c();
            return e;
        } else if (qbf.b() || !qhu.a(packageManager, "com.google.android.gsf")) {
            Log.w(str, "Google Play services is missing, unable to get tokens");
            return null;
        } else {
            f = false;
            return e;
        }
    }

    private static boolean a(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return qhu.a(packageManager, str);
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 56) + String.valueOf(str2).length());
        stringBuilder.append("Possible malicious package ");
        stringBuilder.append(str);
        stringBuilder.append(" declares ");
        stringBuilder.append(str2);
        stringBuilder.append(" without permission");
        Log.w("InstanceID", stringBuilder.toString());
        return false;
    }

    private static boolean a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            e = applicationInfo.packageName;
            int i = applicationInfo.uid;
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    private final synchronized void b(Intent intent) {
        if (this.k == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.k = PendingIntent.getBroadcast(this.b, 0, intent2, 0);
        }
        intent.putExtra("app", this.k);
    }

    public static String a(Bundle bundle) {
        String str = "SERVICE_NOT_AVAILABLE";
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string == null) {
                string = bundle.getString("unregistered");
            }
            if (string != null) {
                return string;
            }
            string = bundle.getString("error");
            if (string != null) {
                throw new IOException(string);
            }
            String valueOf = String.valueOf(bundle);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 29);
            stringBuilder.append("Unexpected response from GCM ");
            stringBuilder.append(valueOf);
            Log.w("InstanceID", stringBuilder.toString(), new Throwable());
            throw new IOException(str);
        }
        throw new IOException(str);
    }

    private final void a(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.i.get(str);
            this.i.put(str, obj);
            qhu.a(obj2, obj);
        }
    }

    private static void a(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 24);
                stringBuilder.append("Failed to send response ");
                stringBuilder.append(valueOf);
                Log.w("InstanceID", stringBuilder.toString());
            }
        }
    }

    public final void a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
                CharSequence stringExtra = intent.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("unregistered");
                }
                String group;
                if (stringExtra != null) {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        group = matcher.group(1);
                        action = matcher.group(2);
                        Object extras = intent.getExtras();
                        extras.putString("registration_id", action);
                        a(group, extras);
                    }
                    return;
                }
                Object stringExtra2 = intent.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 49);
                    stringBuilder.append("Unexpected response, no error or registration id ");
                    stringBuilder.append(valueOf);
                    Log.w("InstanceID", stringBuilder.toString());
                    return;
                }
                String str = null;
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (!"ID".equals(split[1])) {
                        String str2 = "Unexpected structured response ";
                        Log.w("InstanceID", stringExtra2.length() == 0 ? new String(str2) : str2.concat(stringExtra2));
                    }
                    if (split.length > 2) {
                        action = split[2];
                        String str3 = split[3];
                        if (str3.startsWith(":")) {
                            str3 = str3.substring(1);
                        }
                        str = action;
                        stringExtra2 = str3;
                    } else {
                        stringExtra2 = "UNKNOWN";
                    }
                    intent.putExtra("error", stringExtra2);
                }
                if (str == null) {
                    synchronized (getClass()) {
                        for (String group2 : this.i.keySet()) {
                            Object obj = this.i.get(group2);
                            this.i.put(group2, stringExtra2);
                            qhu.a(obj, stringExtra2);
                        }
                    }
                    return;
                }
                a(str, stringExtra2);
            }
        }
    }

    public final Bundle b(Bundle bundle) {
        Bundle c = c(bundle);
        if (c != null) {
            String str = "google.messenger";
            if (c.containsKey(str)) {
                c = c(bundle);
                if (c != null && c.containsKey(str)) {
                    return null;
                }
            }
        }
        return c;
    }

    private static synchronized String a() {
        String num;
        synchronized (qhu.class) {
            int i = g;
            g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0129 A:{SYNTHETIC} */
    private final android.os.Bundle c(android.os.Bundle r9) {
        /*
        r8 = this;
        r0 = new android.os.ConditionVariable;
        r0.<init>();
        r1 = defpackage.qhu.a();
        r2 = r8.getClass();
        monitor-enter(r2);
        r3 = r8.i;	 Catch:{ all -> 0x0179 }
        r3.put(r1, r0);	 Catch:{ all -> 0x0179 }
        monitor-exit(r2);	 Catch:{ all -> 0x0179 }
        r2 = r8.j;
        if (r2 != 0) goto L_0x002d;
    L_0x0018:
        r2 = r8.b;
        defpackage.qhu.a(r2);
        r2 = new android.os.Messenger;
        r3 = new qhv;
        r4 = android.os.Looper.getMainLooper();
        r3.<init>(r8, r4);
        r2.<init>(r3);
        r8.j = r2;
    L_0x002d:
        r2 = e;
        if (r2 == 0) goto L_0x0171;
    L_0x0031:
        r2 = new android.content.Intent;
        r3 = f;
        if (r3 != 0) goto L_0x003a;
    L_0x0037:
        r3 = "com.google.android.c2dm.intent.REGISTER";
        goto L_0x003c;
    L_0x003a:
        r3 = "com.google.iid.TOKEN_REQUEST";
    L_0x003c:
        r2.<init>(r3);
        r3 = e;
        r2.setPackage(r3);
        r2.putExtras(r9);
        r8.b(r2);
        r9 = java.lang.String.valueOf(r1);
        r9 = r9.length();
        r3 = new java.lang.StringBuilder;
        r9 = r9 + 5;
        r3.<init>(r9);
        r9 = "|ID|";
        r3.append(r9);
        r3.append(r1);
        r9 = "|";
        r3.append(r9);
        r9 = r3.toString();
        r3 = "kid";
        r2.putExtra(r3, r9);
        r9 = java.lang.String.valueOf(r1);
        r9 = r9.length();
        r3 = new java.lang.StringBuilder;
        r9 = r9 + 5;
        r3.<init>(r9);
        r9 = "|ID|";
        r3.append(r9);
        r3.append(r1);
        r9 = "|";
        r3.append(r9);
        r9 = r3.toString();
        r3 = "X-kid";
        r2.putExtra(r3, r9);
        r9 = e;
        r3 = "com.google.android.gsf";
        r9 = r3.equals(r9);
        r3 = "useGsf";
        r3 = r2.getStringExtra(r3);
        if (r3 == 0) goto L_0x00aa;
    L_0x00a4:
        r9 = "1";
        r9 = r9.equals(r3);
    L_0x00aa:
        r3 = r8.c;
        if (r3 == 0) goto L_0x00c1;
    L_0x00ae:
        r3 = r8.j;
        r4 = "google.messenger";
        r2.putExtra(r4, r3);
        r3 = android.os.Message.obtain();
        r3.obj = r2;
        r4 = r8.c;	 Catch:{ RemoteException -> 0x00c1 }
        r4.send(r3);	 Catch:{ RemoteException -> 0x00c1 }
        goto L_0x011f;
    L_0x00c1:
        if (r9 != 0) goto L_0x00f1;
    L_0x00c3:
        r9 = r8.j;
        r3 = "google.messenger";
        r2.putExtra(r3, r9);
        r9 = "messenger2";
        r3 = "1";
        r2.putExtra(r9, r3);
        r9 = r8.d;
        if (r9 == 0) goto L_0x00e1;
    L_0x00d5:
        r9 = android.os.Message.obtain();
        r9.obj = r2;
        r3 = r8.d;	 Catch:{ RemoteException -> 0x00e1 }
        r3.a(r9);	 Catch:{ RemoteException -> 0x00e1 }
        goto L_0x011f;
    L_0x00e1:
        r9 = f;
        if (r9 == 0) goto L_0x00eb;
    L_0x00e5:
        r9 = r8.b;
        r9.sendBroadcast(r2);
        goto L_0x011f;
    L_0x00eb:
        r9 = r8.b;
        r9.startService(r2);
        goto L_0x011f;
    L_0x00f1:
        r9 = defpackage.qhu.class;
        monitor-enter(r9);
        r3 = h;	 Catch:{ all -> 0x016e }
        if (r3 != 0) goto L_0x0119;
    L_0x00f8:
        r3 = new qhy;	 Catch:{ all -> 0x016e }
        r3.<init>(r8);	 Catch:{ all -> 0x016e }
        h = r3;	 Catch:{ all -> 0x016e }
        r3 = new android.content.IntentFilter;	 Catch:{ all -> 0x016e }
        r4 = "com.google.android.c2dm.intent.REGISTRATION";
        r3.<init>(r4);	 Catch:{ all -> 0x016e }
        r4 = r8.b;	 Catch:{ all -> 0x016e }
        r4 = r4.getPackageName();	 Catch:{ all -> 0x016e }
        r3.addCategory(r4);	 Catch:{ all -> 0x016e }
        r4 = r8.b;	 Catch:{ all -> 0x016e }
        r5 = h;	 Catch:{ all -> 0x016e }
        r6 = "com.google.android.c2dm.permission.SEND";
        r7 = 0;
        r4.registerReceiver(r5, r3, r6, r7);	 Catch:{ all -> 0x016e }
    L_0x0119:
        monitor-exit(r9);	 Catch:{ all -> 0x016e }
        r9 = r8.b;
        r9.sendBroadcast(r2);
    L_0x011f:
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.block(r2);
        r0 = r8.getClass();
        monitor-enter(r0);
        r9 = r8.i;	 Catch:{ all -> 0x016b }
        r9 = r9.remove(r1);	 Catch:{ all -> 0x016b }
        r1 = r9 instanceof android.os.Bundle;	 Catch:{ all -> 0x016b }
        if (r1 == 0) goto L_0x0137;
    L_0x0133:
        r9 = (android.os.Bundle) r9;	 Catch:{ all -> 0x016b }
        monitor-exit(r0);	 Catch:{ all -> 0x016b }
        return r9;
    L_0x0137:
        r1 = r9 instanceof java.lang.String;	 Catch:{ all -> 0x016b }
        if (r1 == 0) goto L_0x0143;
    L_0x013b:
        r1 = new java.io.IOException;	 Catch:{ all -> 0x016b }
        r9 = (java.lang.String) r9;	 Catch:{ all -> 0x016b }
        r1.<init>(r9);	 Catch:{ all -> 0x016b }
        throw r1;	 Catch:{ all -> 0x016b }
    L_0x0143:
        r1 = "InstanceID";
        r9 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x016b }
        r2 = r9.length();	 Catch:{ all -> 0x016b }
        r2 = r2 + 12;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x016b }
        r3.<init>(r2);	 Catch:{ all -> 0x016b }
        r2 = "No response ";
        r3.append(r2);	 Catch:{ all -> 0x016b }
        r3.append(r9);	 Catch:{ all -> 0x016b }
        r9 = r3.toString();	 Catch:{ all -> 0x016b }
        android.util.Log.w(r1, r9);	 Catch:{ all -> 0x016b }
        r9 = new java.io.IOException;	 Catch:{ all -> 0x016b }
        r1 = "TIMEOUT";
        r9.<init>(r1);	 Catch:{ all -> 0x016b }
        throw r9;	 Catch:{ all -> 0x016b }
    L_0x016b:
        r9 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x016b }
        throw r9;
    L_0x016e:
        r0 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x016e }
        throw r0;
    L_0x0171:
        r9 = new java.io.IOException;
        r0 = "MISSING_INSTANCEID_SERVICE";
        r9.<init>(r0);
        throw r9;
    L_0x0179:
        r9 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0179 }
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhu.c(android.os.Bundle):android.os.Bundle");
    }
}
