package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: dqg */
final class dqg implements Runnable {
    private final /* synthetic */ xci a;
    private final /* synthetic */ dos b;

    dqg(dos dos, xci xci) {
        this.b = dos;
        this.a = xci;
    }

    public final void run() {
        afpi afpi = (afpi) this.b.j.get();
        afpc.a(afpi);
        this.a.a(this.b.m.get());
        apxn a = ((zyw) this.b.aj.get()).a();
        if (a != null) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.ah) {
                actz actz = (actz) this.b.k.get();
                afmi afmi = (afmi) this.b.l.get();
                HashMap hashMap = new HashMap();
                Map a2 = afmi.a();
                hashMap.put("client.device.brand", (String) a2.get("cbrand"));
                hashMap.put("client.device.model", (String) a2.get("cmodel"));
                hashMap.put("client.device.os", (String) a2.get("cos"));
                hashMap.put("client.device.os_version", (String) a2.get("cosver"));
                hashMap.put("client.device.platform", (String) a2.get("cplatform"));
                hashMap.put("client.name", ((String) a2.get("c")).toUpperCase(Locale.getDefault()));
                hashMap.put("client.version", (String) a2.get("cver"));
                PackageManager packageManager = actz.c.getPackageManager();
                String packageName = actz.c.getPackageName();
                int i = 0;
                try {
                    hashMap.put("client.versionCode", Integer.toString(packageManager.getPackageInfo(packageName, 0).versionCode));
                } catch (NameNotFoundException e) {
                    xtl.a(actz.a, "Failed to look up PackageInfo; unable to determine app versionCode", e);
                }
                try {
                    i = packageManager.getApplicationInfo(packageName, 128).metaData.getInt("com.google.android.apps.youtube.config.BuildChangelist");
                } catch (NameNotFoundException e2) {
                    xtl.a(actz.a, "Failed to look up ApplicationInfo; unable to determine build changelist", e2);
                }
                if (i != 0) {
                    hashMap.put("client.build.changelist", Integer.toString(i));
                }
                afpi.b = hashMap;
                afpi.e();
                Thread.setDefaultUncaughtExceptionHandler(new acuc(actz, Thread.getDefaultUncaughtExceptionHandler()));
                ((Executor) this.b.aa.get()).execute(new acub(actz));
            }
        }
    }
}
