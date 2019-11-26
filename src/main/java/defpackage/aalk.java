package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: aalk */
public final class aalk implements aamt {
    public static final aalp a = new aaln();
    public final TelephonyManager b;
    public final bcaa c;
    public final bcaa d;
    public final xto e;
    private final ashr f;
    private final xsc g;
    private final zzl h;
    private final zyw i;
    private final aalp j;
    private final aaex k;
    private final xhv l;
    private final int m;

    public aalk(Context context, ashr ashr, TelephonyManager telephonyManager, xsc xsc, bcaa bcaa, bcaa bcaa2, zzl zzl, zyw zyw, aalp aalp, xhv xhv, aaex aaex) {
        this.f = ashr;
        this.b = telephonyManager;
        this.g = xsc;
        this.c = bcaa;
        this.h = zzl;
        this.i = zyw;
        this.d = bcaa2;
        this.j = aalp;
        this.e = new aalm("ClientVersion", context);
        int c = xss.c(context);
        int i = 3;
        if (c == 1 || c == 2) {
            i = 2;
        } else if (!(c == 3 || c == 4)) {
            i = 1;
        }
        this.m = i;
        this.l = xhv;
        this.k = aaex;
    }

    public final void a(asib asib) {
        ashn ashn = (ashn) ((anxo) asib.a().toBuilder());
        String a = aamr.a(Locale.getDefault());
        ashn.copyOnWrite();
        ashl ashl = (ashl) ashn.instance;
        if (a != null) {
            ashl.a |= 2;
            ashl.e = a;
            ashn.a(xvw.a(this.b));
            ashn.a(this.f);
            ashn.b((String) this.e.get());
            a = VERSION.RELEASE;
            ashn.copyOnWrite();
            ashl = (ashl) ashn.instance;
            if (a != null) {
                ashl.b |= 4;
                ashl.u = a;
                int i = VERSION.SDK_INT;
                ashn.copyOnWrite();
                ashl = (ashl) ashn.instance;
                ashl.a |= 33554432;
                ashl.o = i;
                ashn.copyOnWrite();
                ashl ashl2 = (ashl) ashn.instance;
                ashl2.b |= 2;
                ashl2.t = "Android";
                a = Build.MANUFACTURER;
                ashn.copyOnWrite();
                ashl = (ashl) ashn.instance;
                if (a != null) {
                    ashl.a |= aocf.UNSET_ENUM_VALUE;
                    ashl.r = a;
                    a = Build.MODEL;
                    ashn.copyOnWrite();
                    ashl = (ashl) ashn.instance;
                    if (a != null) {
                        ashl.b |= 1;
                        ashl.s = a;
                        i = ((Integer) this.c.get()).intValue();
                        ashn.copyOnWrite();
                        ashl = (ashl) ashn.instance;
                        ashl.b |= 67108864;
                        ashl.J = i;
                        i = this.m;
                        ashn.copyOnWrite();
                        ashl = (ashl) ashn.instance;
                        if (i != 0) {
                            ashl.b |= 16777216;
                            ashl.I = i - 1;
                            long toMinutes = TimeUnit.MILLISECONDS.toMinutes((long) TimeZone.getDefault().getOffset(this.g.a()));
                            ashn.copyOnWrite();
                            ashl ashl3 = (ashl) ashn.instance;
                            ashl3.b = aocf.UNSET_ENUM_VALUE | ashl3.b;
                            ashl3.L = (int) toMinutes;
                            a = TimeZone.getDefault().getID();
                            ashn.copyOnWrite();
                            ashl = (ashl) ashn.instance;
                            if (a != null) {
                                ashl.c |= 1;
                                ashl.M = a;
                                i = apvo.a(this.l.k());
                                if (i != 0) {
                                    ashn.copyOnWrite();
                                    ashl = (ashl) ashn.instance;
                                    ashl.b |= 8;
                                    ashl.v = i - 1;
                                }
                                a = this.h.a.a();
                                String b = this.i.b();
                                String str = this.i.a().c;
                                if (!(TextUtils.isEmpty(a) && TextUtils.isEmpty(b) && TextUtils.isEmpty(str))) {
                                    ashs ashs;
                                    anxl anxl = ((ashl) ashn.instance).x;
                                    if (anxl == null) {
                                        anxl = ashs.e;
                                    }
                                    ashv ashv = (ashv) ((anxo) anxl.toBuilder());
                                    if (TextUtils.isEmpty(a)) {
                                        ashv.copyOnWrite();
                                        ashs = (ashs) ashv.instance;
                                        ashs.a &= -5;
                                        ashs.d = ashs.e.d;
                                    } else {
                                        ashv.copyOnWrite();
                                        ashs ashs2 = (ashs) ashv.instance;
                                        if (a != null) {
                                            ashs2.a |= 4;
                                            ashs2.d = a;
                                        } else {
                                            throw new NullPointerException();
                                        }
                                    }
                                    if (TextUtils.isEmpty(b)) {
                                        ashv.copyOnWrite();
                                        ashs = (ashs) ashv.instance;
                                        ashs.a &= -3;
                                        ashs.c = ashs.e.c;
                                    } else {
                                        ashv.copyOnWrite();
                                        ashs = (ashs) ashv.instance;
                                        if (b != null) {
                                            ashs.a |= 2;
                                            ashs.c = b;
                                        } else {
                                            throw new NullPointerException();
                                        }
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        ashv.copyOnWrite();
                                        ashs = (ashs) ashv.instance;
                                        ashs.a &= -2;
                                        ashs.b = ashs.e.b;
                                    } else {
                                        ashv.copyOnWrite();
                                        ashs = (ashs) ashv.instance;
                                        if (str != null) {
                                            ashs.a |= 1;
                                            ashs.b = str;
                                        } else {
                                            throw new NullPointerException();
                                        }
                                    }
                                    ashn.copyOnWrite();
                                    ashl2 = (ashl) ashn.instance;
                                    ashl2.x = (ashs) ((anxl) ashv.build());
                                    ashl2.b |= 128;
                                }
                                aamv aamv = (aamv) this.d.get();
                                aamx a2 = aamv.a();
                                int i2 = a2.a;
                                ashn.copyOnWrite();
                                ashl3 = (ashl) ashn.instance;
                                ashl3.b |= 4096;
                                ashl3.z = i2;
                                i2 = a2.b;
                                ashn.copyOnWrite();
                                ashl3 = (ashl) ashn.instance;
                                ashl3.b |= 8192;
                                ashl3.A = i2;
                                float f = a2.c;
                                ashn.copyOnWrite();
                                ashl3 = (ashl) ashn.instance;
                                ashl3.b |= 65536;
                                ashl3.D = f;
                                f = a2.d;
                                ashn.copyOnWrite();
                                ashl3 = (ashl) ashn.instance;
                                ashl3.b |= 131072;
                                ashl3.E = f;
                                f = a2.e;
                                ashn.copyOnWrite();
                                ashl3 = (ashl) ashn.instance;
                                ashl3.b |= 524288;
                                ashl3.G = f;
                                int round = Math.round(a2.e);
                                ashn.copyOnWrite();
                                ashl ashl4 = (ashl) ashn.instance;
                                ashl4.b |= 262144;
                                ashl4.F = round;
                                aamx aamx = aamv.a;
                                if (aamx != null) {
                                    round = aamx.b;
                                    ashn.copyOnWrite();
                                    ashl4 = (ashl) ashn.instance;
                                    ashl4.b |= 32768;
                                    ashl4.C = round;
                                    i = aamx.a;
                                    ashn.copyOnWrite();
                                    ashl = (ashl) ashn.instance;
                                    ashl.b |= 16384;
                                    ashl.B = i;
                                }
                                aaex aaex = this.k;
                                ArrayList arrayList = new ArrayList();
                                for (Class cls : aaex.c.keySet()) {
                                    int i3 = aaex.a.getInt(cls.toString(), 0);
                                    if (!(i3 == 0 || i3 == -1)) {
                                        arrayList.add(Integer.valueOf(i3));
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    ashn.copyOnWrite();
                                    ((ashl) ashn.instance).m = anxl.emptyIntList();
                                    ashn.copyOnWrite();
                                    ashl2 = (ashl) ashn.instance;
                                    if (!ashl2.m.a()) {
                                        ashl2.m = anxl.mutableCopy(ashl2.m);
                                    }
                                    anvf.addAll(arrayList, ashl2.m);
                                }
                                this.j.a(ashn);
                                asib.a(ashn);
                                return;
                            }
                            throw new NullPointerException();
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
