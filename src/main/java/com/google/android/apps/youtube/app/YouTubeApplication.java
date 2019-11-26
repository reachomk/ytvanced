package com.google.android.apps.youtube.app;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Process;
import defpackage.amnn;
import defpackage.dng;
import defpackage.doi;
import defpackage.dol;
import defpackage.don;
import defpackage.dqn;
import defpackage.dtg;
import defpackage.dtj;
import defpackage.dul;
import defpackage.foz;
import defpackage.vdj;
import defpackage.xax;
import defpackage.xaz;
import defpackage.xdo;
import defpackage.xdp;
import defpackage.xul;
import defpackage.zxb;
import java.util.List;

public class YouTubeApplication extends doi {
    /* Access modifiers changed, original: protected|final */
    public final void c() {
        ((dqn) b()).a(this);
    }

    public final dtg d() {
        return this.a.a();
    }

    public final xdp e() {
        return d().j();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean f() {
        int myPid = Process.myPid();
        Object a = foz.a(myPid);
        String str = null;
        if (a == null) {
            List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        a = runningAppProcessInfo.processName;
                        break;
                    }
                }
            }
            a = null;
        }
        if (!(a == null || getPackageName().equals(a))) {
            Intent intent = new Intent("com.google.android.youtube.api.service.START");
            intent.setPackage(getApplicationInfo().packageName);
            ResolveInfo resolveService = getPackageManager().resolveService(intent, 0);
            if (!(resolveService == null || resolveService.serviceInfo == null)) {
                str = resolveService.serviceInfo.processName;
            }
            if (str != null) {
                if (str.equals(a)) {
                    return false;
                }
                getApplicationContext();
                return true;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final dtg g() {
        dtj a = ((dtj) ((dtj) ((dtj) dul.o().a((Context) this)).b("main")).a(xdo.a(this))).a(vdj.a(xul.b(getApplicationContext())).a(true).b(true).a());
        don don = this.a;
        don.getClass();
        return (dtg) ((dtj) a.a((xax) new xaz(new dol(don)))).a();
    }

    public final zxb h() {
        return d().b();
    }

    public final /* synthetic */ Object n() {
        return (dng) amnn.a(this, dng.class);
    }
}
