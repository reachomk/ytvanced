package defpackage;

import android.app.Application;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: twi */
final class twi implements Runnable {
    private final /* synthetic */ twf a;

    twi(twf twf) {
        this.a = twf;
    }

    public final void run() {
        String str = "com.google.android.libraries.performance.primes.backgroundjobs.logger.LoggerJob";
        int totalPss = ucv.a(this.a.a.a).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("Background total pss kb: ");
        stringBuilder.append(totalPss);
        String str2 = "MiniHeapDumpMetric";
        tyv.b(str2, stringBuilder.toString(), new Object[0]);
        twg twg = this.a.a;
        twg.h.a(totalPss);
        if (!(twg.c || tyu.c(twg.a).exists() || ucw.a(twg.a).exists())) {
            long j = twg.l.get();
            if (j == 0 || twg.d + j <= SystemClock.elapsedRealtime()) {
                ucx ucx = twg.h;
                double d = twg.g;
                if (ucx.a() && ucx.b(totalPss) >= d) {
                    bcco bcco = (bcco) bccl.d.createBuilder();
                    bcco.copyOnWrite();
                    bccl bccl = (bccl) bcco.instance;
                    bccl.a |= 1;
                    bccl.b = 1;
                    bcco.copyOnWrite();
                    bccl = (bccl) bcco.instance;
                    bccl.a |= 2;
                    bccl.c = totalPss;
                    bccl bccl2 = (bccl) ((anxl) bcco.build());
                    ArrayList arrayList = twg.h.a;
                    bcer bcer = (bcer) bces.e.createBuilder();
                    bcer.copyOnWrite();
                    bces bces = (bces) bcer.instance;
                    if (!bces.d.a()) {
                        bces.d = anxl.mutableCopy(bces.d);
                    }
                    anvf.addAll(arrayList, bces.d);
                    bces bces2 = (bces) ((anxl) bcer.build());
                    if (twg.j.tryLock()) {
                        twg.l.set(SystemClock.elapsedRealtime());
                        try {
                            Debug.dumpHprofData(tyu.c(twg.a).getAbsolutePath());
                            tyv.b(str2, "Hprof data dumped", new Object[0]);
                            File c = tyu.c(twg.a);
                            File a = ucw.a(twg.a);
                            tvc tvc = new tvc(twg.i, (twe) twg.f.a());
                            List list;
                            if (c.exists()) {
                                ArrayList arrayList2 = new ArrayList(2);
                                bces a2 = tvc.a(new tvb(tvc, c), bccl2, a);
                                arrayList2.add(a2);
                                int a3 = bceu.a(a2.b);
                                if (a3 != 0 && a3 == 4) {
                                    arrayList2.add(tvc.a(new tve(tvc, c), bccl2, a));
                                }
                                list = arrayList2;
                            } else {
                                list = Collections.emptyList();
                            }
                            for (bces toByteArray : list) {
                                try {
                                    bces toByteArray2 = (bces) ((anxl) ((bcer) ((anvi) ((bcer) ((anxo) bces2.toBuilder())).mergeFrom(toByteArray2.toByteArray(), anxa.c()))).build());
                                    bcfd bcfd = (bcfd) bcfe.x.createBuilder();
                                    bcev bcev = (bcev) bcew.e.createBuilder();
                                    bcex bcex = (bcex) bcey.e.createBuilder();
                                    bcex.copyOnWrite();
                                    bcey bcey = (bcey) bcex.instance;
                                    if (toByteArray2 != null) {
                                        bcey.c = toByteArray2;
                                        bcey.a |= 2;
                                        bcev.a((bcey) ((anxl) bcex.build()));
                                        bcfd.a(bcev);
                                        twg.a((bcfe) ((anxl) bcfd.build()));
                                    } else {
                                        throw new NullPointerException();
                                    }
                                } catch (anyg e) {
                                    tyv.a(str2, "Failed to merge protos: ", e, new Object[0]);
                                }
                            }
                            if (a.exists()) {
                                tyv.b(str2, "Scheduling heap dump upload", new Object[0]);
                                Application application = twg.a;
                                String absolutePath = a.getAbsolutePath();
                                String str3 = "PRIMES_INTERNAL_ANDROID_PRIMES";
                                if (VERSION.SDK_INT >= 21 && uaa.a(application, str)) {
                                    PersistableBundle persistableBundle = new PersistableBundle();
                                    persistableBundle.putString("file_name", absolutePath);
                                    persistableBundle.putString("log_source", str3);
                                    ((JobScheduler) application.getSystemService("jobscheduler")).schedule(new Builder(184188964, new ComponentName(application, str)).setRequiredNetworkType(2).setRequiresCharging(true).setRequiresDeviceIdle(true).setExtras(persistableBundle).build());
                                }
                            } else {
                                tyv.b(str2, "Failed to serialize to file.", new Object[0]);
                            }
                            tyu.d(twg.a);
                            twg.j.unlock();
                        } catch (IOException e2) {
                            tyv.a(str2, "Failed to dump hprof data", e2, new Object[0]);
                            tyu.d(twg.a);
                            twg.j.unlock();
                        } catch (Throwable e22) {
                            tyu.d(twg.a);
                            twg.j.unlock();
                            throw e22;
                        }
                    }
                }
            }
        }
        twg twg2 = this.a.a;
        if (twg2.h.a()) {
            twg2.k.edit().putBoolean("primes.miniheapdump.isCalibrated", true).apply();
            bcep bcep = (bcep) bceq.d.createBuilder();
            double b = twg2.h.b(totalPss);
            bcep.copyOnWrite();
            bceq bceq = (bceq) bcep.instance;
            bceq.a |= 2;
            bceq.c = (float) b;
            twg2.a((bceq) ((anxl) bcep.build()));
        }
    }
}
