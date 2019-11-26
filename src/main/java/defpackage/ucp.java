package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: ucp */
public final class ucp {
    private static volatile boolean a;
    private static Method b;

    private static Method a() {
        if (!a) {
            synchronized (ucp.class) {
                if (!a) {
                    try {
                        b = MemoryInfo.class.getDeclaredMethod("getOtherPss", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e) {
                        tyv.a("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) not found", e, new Object[0]);
                    } catch (Error | Exception e2) {
                        tyv.c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) failure", e2, new Object[0]);
                    }
                    a = true;
                }
            }
        }
        return b;
    }

    private static int a(MemoryInfo memoryInfo) {
        Method a = ucp.a();
        if (a != null) {
            try {
                return ((Integer) a.invoke(memoryInfo, new Object[]{Integer.valueOf(14)})).intValue();
            } catch (Error | Exception e) {
                b = null;
                tyv.c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) invocation failure", e, new Object[0]);
            }
        }
        return -1;
    }

    private ucp() {
    }

    private static Integer a(String str) {
        return str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
    }

    public static bcbn a(int i, int i2, String str, Context context, String str2, boolean z) {
        bcbh bcbh;
        uia.b();
        uhy.a((Object) context);
        MemoryInfo[] processMemoryInfo = ucv.a(context).getProcessMemoryInfo(new int[]{i2});
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ucv.a(context).getMemoryInfo(memoryInfo);
        bcbq bcbq = (bcbq) bcbn.g.createBuilder();
        bcbo bcbo = (bcbo) bcbl.c.createBuilder();
        MemoryInfo memoryInfo2 = processMemoryInfo[0];
        bcbk bcbk = (bcbk) bcbh.u.createBuilder();
        int i3 = memoryInfo2.dalvikPss;
        bcbk.copyOnWrite();
        bcbh bcbh2 = (bcbh) bcbk.instance;
        bcbh2.a |= 1;
        bcbh2.b = i3;
        i3 = memoryInfo2.nativePss;
        bcbk.copyOnWrite();
        bcbh2 = (bcbh) bcbk.instance;
        bcbh2.a |= 2;
        bcbh2.c = i3;
        i3 = memoryInfo2.otherPss;
        bcbk.copyOnWrite();
        bcbh2 = (bcbh) bcbk.instance;
        bcbh2.a |= 4;
        bcbh2.d = i3;
        i3 = memoryInfo2.dalvikPrivateDirty;
        bcbk.copyOnWrite();
        bcbh2 = (bcbh) bcbk.instance;
        bcbh2.a |= 8;
        bcbh2.e = i3;
        i3 = memoryInfo2.nativePrivateDirty;
        bcbk.copyOnWrite();
        bcbh2 = (bcbh) bcbk.instance;
        bcbh2.a |= 16;
        bcbh2.f = i3;
        i3 = memoryInfo2.otherPrivateDirty;
        bcbk.copyOnWrite();
        bcbh2 = (bcbh) bcbk.instance;
        bcbh2.a |= 32;
        bcbh2.g = i3;
        i3 = memoryInfo2.getTotalPss();
        bcbk.copyOnWrite();
        bcbh2 = (bcbh) bcbk.instance;
        bcbh2.a |= 64;
        bcbh2.h = i3;
        i3 = memoryInfo2.getTotalPrivateClean();
        bcbk.copyOnWrite();
        bcbh2 = (bcbh) bcbk.instance;
        bcbh2.a |= 128;
        bcbh2.i = i3;
        i3 = memoryInfo2.getTotalSwappablePss();
        bcbk.copyOnWrite();
        bcbh2 = (bcbh) bcbk.instance;
        bcbh2.a |= 512;
        bcbh2.k = i3;
        i3 = memoryInfo2.getTotalSharedDirty();
        bcbk.copyOnWrite();
        bcbh2 = (bcbh) bcbk.instance;
        bcbh2.a |= 256;
        bcbh2.j = i3;
        i3 = ucp.a(memoryInfo2);
        if (i3 != -1) {
            bcbk.copyOnWrite();
            bcbh bcbh3 = (bcbh) bcbk.instance;
            bcbh3.a |= 1024;
            bcbh3.l = i3;
        }
        if (VERSION.SDK_INT >= 23 && !z) {
            try {
                int intValue;
                bcbh bcbh4;
                Map memoryStats = memoryInfo2.getMemoryStats();
                Integer a = ucp.a((String) memoryStats.get("summary.code"));
                if (a != null) {
                    intValue = a.intValue();
                    bcbk.copyOnWrite();
                    bcbh4 = (bcbh) bcbk.instance;
                    bcbh4.a |= 4096;
                    bcbh4.n = intValue;
                }
                a = ucp.a((String) memoryStats.get("summary.stack"));
                if (a != null) {
                    intValue = a.intValue();
                    bcbk.copyOnWrite();
                    bcbh4 = (bcbh) bcbk.instance;
                    bcbh4.a |= 8192;
                    bcbh4.o = intValue;
                }
                a = ucp.a((String) memoryStats.get("summary.graphics"));
                if (a != null) {
                    intValue = a.intValue();
                    bcbk.copyOnWrite();
                    bcbh4 = (bcbh) bcbk.instance;
                    bcbh4.a |= 16384;
                    bcbh4.p = intValue;
                }
                a = ucp.a((String) memoryStats.get("summary.system"));
                if (a != null) {
                    intValue = a.intValue();
                    bcbk.copyOnWrite();
                    bcbh4 = (bcbh) bcbk.instance;
                    bcbh4.a |= 65536;
                    bcbh4.r = intValue;
                }
                a = ucp.a((String) memoryStats.get("summary.java-heap"));
                if (a != null) {
                    intValue = a.intValue();
                    bcbk.copyOnWrite();
                    bcbh4 = (bcbh) bcbk.instance;
                    bcbh4.a |= 2048;
                    bcbh4.m = intValue;
                }
                Integer a2 = ucp.a((String) memoryStats.get("summary.private-other"));
                if (a2 != null) {
                    i2 = a2.intValue();
                    bcbk.copyOnWrite();
                    bcbh = (bcbh) bcbk.instance;
                    bcbh.a |= 32768;
                    bcbh.q = i2;
                }
            } catch (NumberFormatException unused) {
                tyv.e("PrimesMemoryCapture", "failed to collect memory summary stats", new Object[0]);
            }
        }
        long j = memoryInfo.availMem;
        bcbk.copyOnWrite();
        bcbh bcbh5 = (bcbh) bcbk.instance;
        bcbh5.a |= 131072;
        bcbh5.s = (int) (j >> 10);
        long j2 = memoryInfo.totalMem;
        bcbk.copyOnWrite();
        bcbh = (bcbh) bcbk.instance;
        bcbh.a |= 262144;
        bcbh.t = (int) (j2 >> 20);
        bcbh5 = (bcbh) ((anxl) bcbk.build());
        bcbo.copyOnWrite();
        bcbl bcbl = (bcbl) bcbo.instance;
        if (bcbh5 != null) {
            bcbl.b = bcbh5;
            bcbl.a |= 1;
            bcbq.copyOnWrite();
            bcbn bcbn = (bcbn) bcbq.instance;
            bcbn.b = (bcbl) ((anxl) bcbo.build());
            bcbn.a |= 1;
            bcdk bcdk = (bcdk) bcdh.c.createBuilder();
            bcdk.a(ucu.a(null, context));
            bcbq.copyOnWrite();
            bcbn bcbn2 = (bcbn) bcbq.instance;
            bcbn2.c = (bcdh) ((anxl) bcdk.build());
            bcbn2.a |= 2;
            bcbm bcbm = (bcbm) bcbj.c.createBuilder();
            boolean c = ucv.c(context);
            bcbm.copyOnWrite();
            bcbj bcbj = (bcbj) bcbm.instance;
            bcbj.a |= 1;
            bcbj.b = c;
            bcbq.copyOnWrite();
            bcbn2 = (bcbn) bcbq.instance;
            bcbn2.e = (bcbj) ((anxl) bcbm.build());
            bcbn2.a |= 8;
            bcbq.copyOnWrite();
            bcbn = (bcbn) bcbq.instance;
            if (i != 0) {
                bcbn.a |= 4;
                bcbn.d = i - 1;
                if (str2 != null) {
                    bcbq.copyOnWrite();
                    bcbn bcbn3 = (bcbn) bcbq.instance;
                    bcbn3.a |= 16;
                    bcbn3.f = str2;
                }
                return (bcbn) ((anxl) bcbq.build());
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
