package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alwv */
public final class alwv {
    public final Object a = new Object();
    public final Map b = new HashMap();
    private final bcaa c;

    public alwv(bcaa bcaa) {
        this.c = bcaa;
    }

    public final void a(aycn aycn, boolean z) {
        synchronized (this.a) {
            alwe alwe = (alwe) this.c.get();
            aycm aycm = (aycm) ((anxo) aycn.toBuilder());
            anxl anxl = ((aycn) aycm.instance).c;
            if (anxl == null) {
                anxl = aycj.j;
            }
            ayci ayci = (ayci) ((anxo) anxl.toBuilder());
            int i = alwe.b;
            ayci.copyOnWrite();
            aycj aycj = (aycj) ayci.instance;
            aycj.a |= 1;
            aycj.b = i;
            i = alwe.c;
            ayci.copyOnWrite();
            aycj = (aycj) ayci.instance;
            aycj.a |= 2;
            aycj.c = i;
            i = alwe.d;
            ayci.copyOnWrite();
            aycj = (aycj) ayci.instance;
            aycj.a |= 4;
            aycj.d = i;
            long j = alwe.e;
            ayci.copyOnWrite();
            aycj aycj2 = (aycj) ayci.instance;
            aycj2.a |= 8;
            aycj2.e = j;
            i = alwe.f;
            ayci.copyOnWrite();
            aycj = (aycj) ayci.instance;
            aycj.a |= 16;
            aycj.f = i;
            String str = alwe.g;
            ayci.copyOnWrite();
            aycj = (aycj) ayci.instance;
            if (str != null) {
                aycj.a |= 32;
                aycj.g = str;
                str = alwe.h;
                ayci.copyOnWrite();
                aycj = (aycj) ayci.instance;
                if (str != null) {
                    aycj.a |= 64;
                    aycj.h = str;
                    i = alwe.i;
                    ayci.copyOnWrite();
                    aycj = (aycj) ayci.instance;
                    aycj.a |= 128;
                    aycj.i = i;
                    aycm.copyOnWrite();
                    aycn aycn2 = (aycn) aycm.instance;
                    aycn2.c = (aycj) ((anxl) ayci.build());
                    aycn2.a |= 2;
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) alwe.a.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        alwe.l = 0;
                        alwe.m = State.DISCONNECTED.ordinal();
                    } else {
                        alwe.l = activeNetworkInfo.getType();
                        alwe.m = activeNetworkInfo.getState().ordinal();
                    }
                    alwe.k = ((WindowManager) alwe.a.getSystemService("window")).getDefaultDisplay().getRotation();
                    alwe.a();
                    anxl = ((aycn) aycm.instance).d;
                    if (anxl == null) {
                        anxl = aych.h;
                    }
                    aycg aycg = (aycg) ((anxo) anxl.toBuilder());
                    boolean z2 = alwe.j;
                    aycg.copyOnWrite();
                    aych aych = (aych) aycg.instance;
                    aych.a |= 1;
                    aych.b = z2;
                    i = alwe.k;
                    aycg.copyOnWrite();
                    aych = (aych) aycg.instance;
                    aych.a |= 2;
                    aych.c = i;
                    i = alwe.l;
                    aycg.copyOnWrite();
                    aych = (aych) aycg.instance;
                    aych.a |= 4;
                    aych.d = i;
                    i = alwe.m;
                    aycg.copyOnWrite();
                    aych = (aych) aycg.instance;
                    aych.a |= 8;
                    aych.e = i;
                    i = alwe.o;
                    aycg.copyOnWrite();
                    aych = (aych) aycg.instance;
                    if (i != 0) {
                        aych.a |= 16;
                        aych.f = i - 1;
                        boolean z3 = alwe.n;
                        aycg.copyOnWrite();
                        aych aych2 = (aych) aycg.instance;
                        aych2.a |= 32;
                        aych2.g = z3;
                        aycm.copyOnWrite();
                        aycn aycn3 = (aycn) aycm.instance;
                        aycn3.d = (aych) ((anxl) aycg.build());
                        aycn3.a |= 4;
                        aycn = (aycn) ((anxl) aycm.build());
                        for (alxr alxr : this.b.values()) {
                            if (alxr.a()) {
                                if (z) {
                                    alxr.b(aycn);
                                } else {
                                    alxr.a(aycn);
                                }
                            }
                        }
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
    }
}
