package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: sfg */
public final class sfg {
    public static final String[] a = new String[]{"GDI_DEFAULT_SCOPE_FLAG"};
    private static final sfg b = new sfg();

    private sfg() {
    }

    public static void a(sir sir) {
        sga.b = sir;
    }

    public static sfg a() {
        if (sga.b != null) {
            return b;
        }
        throw new IllegalStateException("GDIDeps must be set");
    }

    @Deprecated
    public static sfq a(Context context, String str, String str2, String[] strArr, boolean z, sfi sfi) {
        amul g = amul.g();
        sfo sfo = new sfo(context, str, str2, strArr);
        sfo.f = z;
        sfo.g = g;
        sfo.e = sfi;
        sfl sfl = new sfl();
        sfl.a = sfo.a;
        sfl.b = sfo.b;
        sfl.g = false;
        sfl.c = sfo.c;
        sfi sfi2 = sfo.e;
        if (sfi2 == null) {
            sfi2 = new sfk().a();
        }
        sfl.e = sfi2;
        sfl.f = sfo.f;
        sfl.i = false;
        sfl.d = sfo.d;
        List list = sfo.g;
        if (list == null) {
            list = amul.g();
        }
        sfl.h = list;
        if (sfl.a == null || sfl.b == null || sfl.c == null || sfl.d == null || sfl.h == null || sfl.e == null) {
            str = "Invalid null parameter found.";
            return new sfq(3, str, new sfw(3, str));
        }
        sga a = sga.a();
        str2 = sfl.c;
        sjl sjl = a.c;
        sjl.a(sfl.a, str2);
        try {
            String a2 = sga.b.a().a(str2);
            sfu a3 = sfu.a(sfl.a);
            String str3 = sfl.b;
            String[] strArr2 = sfl.d;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(str3)) {
                String str4 = !TextUtils.isEmpty(a2) ? "serviceId" : "userName";
                throw new IllegalArgumentException(String.format("%s in getTokenInfo cannot be null", new Object[]{str4}));
            }
            Cursor rawQuery = a3.a.getReadableDatabase().rawQuery("SELECT * FROM CacheTable WHERE thirdPartyServiceProvider=? AND accountId=? ORDER BY expiryTime DESC", new String[]{str3, a2});
            loop0:
            while (rawQuery.moveToNext()) {
                try {
                    if (300 + currentTimeMillis <= ((long) rawQuery.getInt(rawQuery.getColumnIndex("expiryTime")))) {
                        String[] split = rawQuery.getString(rawQuery.getColumnIndex("scopes")).split(",");
                        int length = strArr2.length;
                        int i = 0;
                        while (i < length) {
                            if (Arrays.asList(split).contains(strArr2[i])) {
                                i++;
                            }
                        }
                        str2 = rawQuery.getString(rawQuery.getColumnIndex("token"));
                        break loop0;
                    } else if (!a3.a(a2, str3)) {
                        Log.e("GDICache", "Failed to delete expired token");
                    }
                } catch (Throwable th) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                }
            }
            str2 = null;
            rawQuery.close();
            if (!sfl.f && str2 != null) {
                return new sfq(str2);
            }
            sgm sgm = new sgm();
            sgm.a = sfl.b;
            sgm.b = sfl.d;
            z = sfl.f;
            sgm.c = z;
            sgm.e = false;
            if (z) {
                sfu.a(sfl.a).a(a2, sfl.b);
                sgm.d = str2;
            }
            Context context2 = sfl.a;
            str = sgm.a;
            if (str == null) {
                throw new IllegalArgumentException("Service id must be set");
            } else if (sgm.b != null) {
                answ a4 = sgf.a(sgf.a(str));
                a4.a(antp.TOKEN_REQUESTED);
                a4.a(sgm.a);
                boolean z2 = sgm.e;
                a4.copyOnWrite();
                ((ansx) a4.instance).k = z2;
                a4.a(sju.a(Arrays.asList(sgm.b)));
                z2 = sgm.c;
                a4.copyOnWrite();
                ((ansx) a4.instance).f = z2;
                str2 = sgm.d;
                if (str2 != null) {
                    if (sgm.c) {
                        a4.copyOnWrite();
                        ((ansx) a4.instance).g = str2;
                    } else {
                        throw new IllegalArgumentException("forceRefresh must be true if invalidateAccessToken is set.");
                    }
                }
                return a.a(context2, a2, (ansx) ((anxl) a4.build()), sfl.d, sfl.e, false, sfl.h);
            } else {
                throw new IllegalArgumentException("Scopes must be set");
            }
        } catch (IllegalArgumentException e) {
            return new sfq(3, e);
        }
    }

    public static sfq a(Intent intent) {
        if (!(intent == null || intent.getExtras() == null || !intent.hasExtra("GDI"))) {
            String str = "EXTRA_RESULT";
            if (intent.getBundleExtra(str) != null) {
                return (sfq) intent.getBundleExtra(str).get("TOKEN_RESPONSE");
            }
        }
        return null;
    }

    public static List a(Context context, String str, List list, sfi sfi) {
        sga a = sga.a();
        sjl sjl = a.c;
        sjl.a(context, str);
        ArrayList arrayList = new ArrayList();
        try {
            bauw a2;
            sjl sjl2 = a.c;
            String a3 = sjl.a(context);
            anth anth = (anth) a.a(context, sfi.a, str).a(new sjo(a3));
            antd antd = (antd) anta.c.createBuilder();
            antj antj = (antj) antg.c.createBuilder();
            antj.a(sga.a.toString());
            antd.copyOnWrite();
            ((anta) antd.instance).a = (antg) ((anxl) antj.build());
            antd.copyOnWrite();
            anta anta = (anta) antd.instance;
            if (!anta.b.a()) {
                anta.b = anxl.mutableCopy(anta.b);
            }
            anvf.addAll(list, anta.b);
            anta anta2 = (anta) ((anxl) antd.build());
            barx barx = anth.a;
            bauw bauw = ante.b;
            if (bauw == null) {
                synchronized (ante.class) {
                    bauw bauw2 = ante.b;
                    if (bauw2 == null) {
                        bauv a4 = bauw.a();
                        a4.c = baux.UNARY;
                        a4.d = bauw.a("google.identity.oauthintegrations.v1.OAuthIntegrationsService", "ListAssociatedAccounts");
                        a4.e = true;
                        a4.a = bbic.a(anta.c);
                        a4.b = bbic.a(antc.b);
                        a2 = a4.a();
                        ante.b = a2;
                    } else {
                        a2 = bauw2;
                    }
                }
            } else {
                a2 = bauw;
            }
            List list2 = ((antc) bbif.a(barx, a2, anth.b, anta2)).a;
            if (list2 == null) {
                list2 = new ArrayList();
            }
            for (ansl sff : list2) {
                arrayList.add(new sff(sff));
            }
            return arrayList;
        } catch (bawe e) {
            throw new IOException(e);
        }
    }

    public static void a(Context context, String str, String str2, sfi sfi) {
        sga a = sga.a();
        sjl sjl = a.c;
        sjl.a(context, str2);
        try {
            sjl = a.c;
            String a2 = sjl.a(context);
            anth anth = (anth) a.a(context, sfi.a, str2).a(new sjo(a2));
            anss anss = (anss) anst.c.createBuilder();
            antj antj = (antj) antg.c.createBuilder();
            antj.a(sga.a.toString());
            anss.copyOnWrite();
            ((anst) anss.instance).a = (antg) ((anxl) antj.build());
            anss.copyOnWrite();
            anst anst = (anst) anss.instance;
            if (str != null) {
                anst.b = str;
                anst anst2 = (anst) ((anxl) anss.build());
                barx barx = anth.a;
                bauw bauw = ante.c;
                if (bauw == null) {
                    bauw bauw2;
                    synchronized (ante.class) {
                        bauw2 = ante.c;
                        if (bauw2 == null) {
                            bauv a3 = bauw.a();
                            a3.c = baux.UNARY;
                            a3.d = bauw.a("google.identity.oauthintegrations.v1.OAuthIntegrationsService", "DeleteAssociatedAccount");
                            a3.e = true;
                            a3.a = bbic.a(anst.c);
                            a3.b = bbic.a(anww.a);
                            bauw2 = a3.a();
                            ante.c = bauw2;
                        }
                    }
                    bauw = bauw2;
                }
                bbif.a(barx, bauw, anth.b, anst2);
                if (TextUtils.isEmpty(null)) {
                    String[] strArr = new String[]{str2};
                    sfu.a(context).a.getWritableDatabase().delete("CacheTable", "accountId=?", strArr);
                    return;
                }
                sfu.a(context).a(str2, null);
                return;
            }
            throw new NullPointerException();
        } catch (bawe e) {
            throw new IOException(e);
        }
    }

    public static List b() {
        return sga.a().d;
    }

    public static String c() {
        return sga.a().e;
    }

    public static sfq a(Context context, sfj sfj) {
        sga a = sga.a();
        try {
            String str = sfj.e;
            antv antv = (antv) ants.e.createBuilder();
            if (TextUtils.isEmpty(null)) {
                if (!TextUtils.isEmpty(str)) {
                    antv.copyOnWrite();
                    ants ants = (ants) antv.instance;
                    if (str != null) {
                        ants.c = str;
                    } else {
                        throw new NullPointerException();
                    }
                }
                ants ants2 = (ants) ((anxl) antv.build());
                String str2 = sfj.g.a;
                String[] strArr = sfj.c;
                String str3 = sfj.a;
                String str4 = sfj.b;
                int i = sfj.j;
                sjl sjl = a.c;
                sjl.a(context, str4);
                sjl = a.c;
                String a2 = sjl.a(context);
                anth a3 = a.a(context, str2, str4);
                antr antr = (antr) anto.f.createBuilder();
                List asList = Arrays.asList(strArr);
                antr.copyOnWrite();
                anto anto = (anto) antr.instance;
                if (!anto.c.a()) {
                    anto.c = anxl.mutableCopy(anto.c);
                }
                anvf.addAll(asList, anto.c);
                antr.copyOnWrite();
                anto anto2 = (anto) antr.instance;
                if (str3 != null) {
                    anto2.b = str3;
                    antr.copyOnWrite();
                    anto2 = (anto) antr.instance;
                    if (ants2 != null) {
                        anto2.d = ants2;
                        antr.copyOnWrite();
                        anto anto3 = (anto) antr.instance;
                        if (i != 0) {
                            bauw a4;
                            anto3.e = ansi.a(i);
                            antj antj = (antj) antg.c.createBuilder();
                            antj.a(sga.a.toString());
                            antr.copyOnWrite();
                            ((anto) antr.instance).a = (antg) ((anxl) antj.build());
                            anto anto4 = (anto) ((anxl) antr.build());
                            a3 = (anth) a3.a(new sjo(a2));
                            barx barx = a3.a;
                            bauw bauw = ante.d;
                            if (bauw == null) {
                                synchronized (ante.class) {
                                    bauw bauw2 = ante.d;
                                    if (bauw2 == null) {
                                        bauv a5 = bauw.a();
                                        a5.c = baux.UNARY;
                                        a5.d = bauw.a("google.identity.oauthintegrations.v1.OAuthIntegrationsService", "StoreSSOToken");
                                        a5.e = true;
                                        a5.a = bbic.a(anto.f);
                                        a5.b = bbic.a(antq.c);
                                        a4 = a5.a();
                                        ante.d = a4;
                                    } else {
                                        a4 = bauw2;
                                    }
                                }
                            } else {
                                a4 = bauw;
                            }
                            antq antq = (antq) bbif.a(barx, a4, a3.b, anto4);
                            ants ants3 = antq.b;
                            if (ants3 != null) {
                                ants a6 = sga.a(ants3);
                                sga.a(context, str4, str3, strArr, a6);
                                return new sfq(a6.a);
                            }
                            String valueOf = String.valueOf(antq);
                            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 57);
                            stringBuilder.append("Invalid server response: Response must contain TokenInfo,");
                            stringBuilder.append(valueOf);
                            throw new sfs(100, stringBuilder.toString());
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            antv.copyOnWrite();
            throw new NullPointerException();
        } catch (bawe e) {
            throw new IOException(e);
        } catch (IllegalArgumentException e2) {
            throw new sfs(3, e2.getMessage());
        }
    }
}
