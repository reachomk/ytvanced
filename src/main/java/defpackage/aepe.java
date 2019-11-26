package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

/* renamed from: aepe */
public final class aepe {
    public static final amqh a = amqh.a("\n");

    public static String[] a(List list) {
        ArrayList arrayList = new ArrayList();
        for (aahr aahr : list) {
            Uri uri = aahr.d;
            if (uri == null || TextUtils.isEmpty(uri.getHost())) {
                throw new IllegalArgumentException("Invalid playback URL.");
            }
            arrayList.add(uri.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static aepd a(zzl zzl, zyw zyw, zzf zzf, xsc xsc) {
        long toMillis;
        long b = zzl.a.b();
        long a = xsc.a() - b;
        auuo auuo = zzl.b().k;
        if (auuo == null) {
            auuo = auuo.k;
        }
        avtg avtg = auuo.c;
        if (avtg == null) {
            avtg = avtg.k;
        }
        if ((avtg.a & 1) != 0) {
            avtg = auuo.c;
            if (avtg == null) {
                avtg = avtg.k;
            }
            if ((avtg.a & 2) != 0) {
                avtg = auuo.c;
                if (avtg == null) {
                    avtg = avtg.k;
                }
                if (avtg.d > 0) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    avtg avtg2 = auuo.c;
                    if (avtg2 == null) {
                        avtg2 = avtg.k;
                    }
                    toMillis = timeUnit.toMillis(avtg2.d);
                    if (b < 0 || a >= toMillis) {
                        return null;
                    }
                    avtg2 = auuo.c;
                    if (avtg2 == null) {
                        avtg2 = avtg.k;
                    }
                    byte[] d = avtg2.b.d();
                    avtg avtg3 = auuo.c;
                    if (avtg3 == null) {
                        avtg3 = avtg.k;
                    }
                    return new aepd(d, avtg3.c.d());
                }
            }
        }
        avtc t = zzf.t();
        toMillis = zyw.c();
        if (toMillis == -1) {
            toMillis = Long.MAX_VALUE;
        }
        toMillis = TimeUnit.SECONDS.convert(xsc.a() - toMillis, TimeUnit.MILLISECONDS);
        if (t == null || toMillis < 0 || toMillis > t.d) {
            return null;
        }
        return new aepd(t.b.d(), t.c.d());
    }

    public static atbq a(aaje aaje, aeoh aeoh) {
        atbt atbt = (atbt) atbu.f.createBuilder();
        aajg aajg = (aajg) aaje.m.get();
        if (aajg == null) {
            return null;
        }
        String a = aajg.a();
        atbt.copyOnWrite();
        atbu atbu = (atbu) atbt.instance;
        if (a != null) {
            atbu.a |= 1;
            atbu.b = a;
            Map b = aajg.b();
            String d = aajg.d();
            atbs[] atbsArr = new atbs[(b.size() + 1)];
            int i = 0;
            for (Entry entry : b.entrySet()) {
                atbr atbr = (atbr) atbs.d.createBuilder();
                atbr.a((String) entry.getKey());
                atbr.b((String) entry.getValue());
                atbsArr[i] = (atbs) ((anxl) atbr.build());
                i++;
            }
            atbr atbr2 = (atbr) atbs.d.createBuilder();
            atbr2.a("User-Agent");
            atbr2.b(String.valueOf(d).concat(" gzip"));
            atbsArr[i] = (atbs) ((anxl) atbr2.build());
            List asList = Arrays.asList(atbsArr);
            atbt.copyOnWrite();
            atbu = (atbu) atbt.instance;
            if (!atbu.c.a()) {
                atbu.c = anxl.mutableCopy(atbu.c);
            }
            anvf.addAll(asList, atbu.c);
            anvu a2 = anvu.a(aajg.c());
            atbt.copyOnWrite();
            atbu atbu2 = (atbu) atbt.instance;
            if (a2 != null) {
                atbu2.a |= 2;
                atbu2.d = a2;
                atbt.copyOnWrite();
                atbu atbu3 = (atbu) atbt.instance;
                atbu3.a |= 4;
                atbu3.e = false;
                atbp atbp = (atbp) atbq.i.createBuilder();
                if (aaje.d() != null) {
                    String d2 = aaje.d();
                    atbp.copyOnWrite();
                    atbq atbq = (atbq) atbp.instance;
                    if (d2 != null) {
                        atbq.a |= 64;
                        atbq.h = d2;
                    } else {
                        throw new NullPointerException();
                    }
                }
                aeoh.a((atbu) ((anxl) atbt.build()), atbp);
                asib asib = (asib) ashy.l.createBuilder();
                ashn ashn = (ashn) ashl.O.createBuilder();
                ashn.copyOnWrite();
                ashl ashl = (ashl) ashn.instance;
                ashl.a |= 1048576;
                ashl.k = "0";
                ashn.a(ashr.ANDROID);
                ashn.b("10.29");
                ashn.copyOnWrite();
                ashl = (ashl) ashn.instance;
                ashl.a |= 1;
                ashl.d = "zz";
                ashn.copyOnWrite();
                ashl = (ashl) ashn.instance;
                ashl.a |= 8;
                ashl.g = "ZZ";
                asib.a(ashn);
                ashy ashy = (ashy) ((anxl) asib.build());
                atbp.copyOnWrite();
                atbq atbq2 = (atbq) atbp.instance;
                if (ashy != null) {
                    atbq2.b = ashy;
                    atbq2.a |= 1;
                    return (atbq) ((anxl) atbp.build());
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public static void a(String str) {
        afpf afpf = afpf.onesie;
        String format = String.format(Locale.ENGLISH, "%.2f", new Object[]{Double.valueOf(0.01d)});
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 16) + String.valueOf(format).length());
        stringBuilder.append(str);
        stringBuilder.append(" [sample rate: ");
        stringBuilder.append(format);
        stringBuilder.append("]");
        afpc.a(1, afpf, stringBuilder.toString(), 0.01d);
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        if (!str.equals("redirector.googlevideo.com")) {
            String str2 = ".googlevideo.com";
            if (str.endsWith(str2)) {
                String str3 = ".a1.googlevideo.com";
                if (!str.endsWith(str3)) {
                    str = str.replaceFirst(str2, str3);
                }
            }
        }
        return str;
    }

    public static Uri a(Uri uri) {
        return uri.buildUpon().appendQueryParameter("cmo", "td=a1.googlevideo.com").build();
    }

    public static String a(aepf aepf, aepg aepg, boolean z) {
        aepf.a("por", "yes");
        int i = aepg.b;
        if (i > 0) {
            aepf.a("ohrtt", Integer.toString(i));
        }
        if (z && aepg.c != null) {
            Uri uri = aepg.d;
            if (uri != null) {
                for (String str : uri.getQueryParameterNames()) {
                    if (!TextUtils.equals(aepg.c.getQueryParameter(str), aepg.d.getQueryParameter(str))) {
                        aepf.b(str, aepg.d.getQueryParameter(str));
                    }
                }
            }
        }
        return aepg.a;
    }

    static {
        amqh.a(",");
    }
}
