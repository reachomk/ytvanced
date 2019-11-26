package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.provider.SearchRecentSuggestions;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.libraries.youtube.notification.NotificationInteractionBroadcastReceiver;
import com.google.android.youtube.R;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: dnj */
public final class dnj {
    static akmi a(akll akll) {
        return akll;
    }

    static boolean b() {
        return true;
    }

    static PackageManager a(Context context) {
        return context.getPackageManager();
    }

    static abev a(aamf aamf, aamd aamd, afpu afpu, xhf xhf) {
        return new abev(aamf, aamd, afpu, xhf);
    }

    static amez a(Context context, zzf zzf, amdi amdi) {
        amez amez = new amez();
        amez.a(new amet(context.getContentResolver()));
        amez.a(new amew(context.getContentResolver()));
        amez.a(new zsd(context, zzf, amdi));
        amez.a(new amff());
        return amez;
    }

    static afpi a(Executor executor, afqv afqv, afmi afmi, afmz afmz, afpg afpg) {
        return new afpi(executor, afqv, afmi, afmz, afpg);
    }

    static aakv a(Executor executor, afpi afpi) {
        return new aakv(executor, afpi);
    }

    static afxq a(afxp afxp, afve afve) {
        return new afxq(afxp.a, (String) afxp.a("414843287017", 2), (SharedPreferences) afxp.a((SharedPreferences) afxp.b.get(), 3), (abev) afxp.a((abev) afxp.c.get(), 4), (ScheduledExecutorService) afxp.a((ScheduledExecutorService) afxp.d.get(), 5), (xsv) afxp.a((xsv) afxp.e.get(), 6), (afve) afxp.a(afve, 7), (Context) afxp.a((Context) afxp.f.get(), 8), (zyw) afxp.a((zyw) afxp.g.get(), 9), (zzl) afxp.a((zzl) afxp.h.get(), 10));
    }

    static haf a(Context context, bcaa bcaa, xsc xsc, ebw ebw, afve afve, zyw zyw, zzl zzl, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, Executor executor, bcaa bcaa5) {
        return new haf(context, bcaa, xsc, ebw, afve, zyw, zzl, bcaa2, bcaa3, bcaa4, executor, bcaa5);
    }

    static abhw a(amqp amqp, aamd aamd, afpu afpu, xhf xhf, zzf zzf, Set set, abhz abhz, xci xci) {
        return new abhw(amqp, aamd, afpu, xhf, zzf, set, abhz, xci);
    }

    static SearchRecentSuggestions b(Context context) {
        return new SearchRecentSuggestions(context, "com.google.android.youtube.SuggestionProvider", 1);
    }

    static abkc a(aamn aamn, amqp amqp, bcaa bcaa, aald aald) {
        return new abkc(aamn, amqp, bcaa, aald);
    }

    static abkn a(aamn aamn, aamd aamd, afpu afpu, xhf xhf, xci xci) {
        return new abkn(aamn, aamd, afpu, xhf, xci);
    }

    static aapn a(amqp amqp, aamn aamn, aamd aamd, afpu afpu, xhf xhf, zzf zzf, xci xci, zzl zzl, Executor executor) {
        return new aapn(amqp, aamn, aamd, afpu, xhf, zzf, zzl, xci, executor);
    }

    static aapq a(aamn aamn, xhf xhf, Set set) {
        return new aapq(aamn, xhf, set);
    }

    static aald a(bcaa bcaa, Executor executor) {
        return new aald(new haj(), new dni(bcaa), executor);
    }

    static amav a(xsc xsc, ScheduledExecutorService scheduledExecutorService, bcaa bcaa) {
        return new amav(xsc, scheduledExecutorService, bcaa, false);
    }

    static aboe a(xhf xhf, aboo aboo, xsc xsc) {
        return new aboe(xhf, aboo, xsc);
    }

    static abmw c(Context context) {
        return new abmw(context);
    }

    static abnx a(xsc xsc) {
        return new abnx(xsc);
    }

    static abol a(zzl zzl, zyw zyw, SharedPreferences sharedPreferences, aboe aboe, Context context, afpu afpu, utc utc, ScheduledExecutorService scheduledExecutorService, xsc xsc, ixb ixb, abno abno, abns abns, abmw abmw, aboi aboi) {
        zzl zzl2 = zzl;
        zyw zyw2 = zyw;
        ixd ixd = new ixd(sharedPreferences, zzl, zyw);
        ixd.a = "androidyt";
        ixd.c = true;
        ixd.d = false;
        ixd.b = false;
        return new abol(ixd, aboe, context, afpu, utc, scheduledExecutorService, xsc, ixb, abno, abns, abmw, aboi);
    }

    static abol a(zzl zzl, zyw zyw, SharedPreferences sharedPreferences, aboe aboe, Context context, afpu afpu, utc utc, ScheduledExecutorService scheduledExecutorService, xsc xsc, ixb ixb, abno abno, abns abns, aboi aboi) {
        zzl zzl2 = zzl;
        zyw zyw2 = zyw;
        ixd ixd = new ixd(sharedPreferences, zzl, zyw);
        ixd.a = "youtube-android";
        ixd.c = false;
        ixd.d = true;
        ixd.b = true;
        return new abol(ixd, aboe, context, afpu, utc, scheduledExecutorService, xsc, ixb, abno, abns, null, aboi);
    }

    static abnd a(zyw zyw, SharedPreferences sharedPreferences) {
        return new ixa(sharedPreferences, zyw);
    }

    static abny a(bcaa bcaa) {
        return (abny) bcaa.get();
    }

    static abob b(bcaa bcaa) {
        return (abob) bcaa.get();
    }

    static aboi c(bcaa bcaa) {
        return (aboi) bcaa.get();
    }

    static afpp a(wya wya) {
        return new afpp(wya, "offline_settings_fetch");
    }

    static afpp b(wya wya) {
        return new afpp(wya, "offline_library_browse_fetch");
    }

    static xbg a(Context context, zyw zyw) {
        avce avce;
        apxn a = zyw.a();
        if (a == null) {
            avce = avce.d;
        } else {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            avce = auya.C;
            if (avce == null) {
                avce = avce.d;
            }
        }
        if (avce.b) {
            return new xbi(context, avce);
        }
        return new xbh();
    }

    static String a(Context context, SharedPreferences sharedPreferences, String str) {
        String d;
        Set set = zzp.c;
        CharSequence string = sharedPreferences.getString(ebn.COUNTRY, "");
        if (!TextUtils.isEmpty(string)) {
            string = xvd.d(string);
            if (set.contains(string)) {
                return string;
            }
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            string = telephonyManager.getSimCountryIso();
            if (!TextUtils.isEmpty(string)) {
                string = xvd.d(string);
                if (set.contains(string)) {
                    return string;
                }
            }
        }
        if (TextUtils.isEmpty(string) && !TextUtils.isEmpty(str)) {
            d = xvd.d(str);
            if (set.contains(d)) {
                return d;
            }
        }
        d = xvd.d(Locale.getDefault().getCountry());
        if (!set.contains(d)) {
            d = null;
        }
        return d;
    }

    static PendingIntent d(Context context) {
        return PendingIntent.getActivity(context, 0, ebl.a(context), 134217728);
    }

    static aaxz a(aamn aamn, aamd aamd, afpu afpu, xhf xhf, Context context) {
        return new aaxz(aamn, aamd, afpu, xhf, aald.a, eal.a(context));
    }

    static akkq a(aort aort, bcaa bcaa, bcaa bcaa2) {
        if (aort.b) {
            return (akkq) bcaa.get();
        }
        return (akkq) bcaa2.get();
    }

    static akko a() {
        return akko.g;
    }

    static adnh a(adqf adqf, lhs lhs, bcaa bcaa, enl enl, airt airt, xua xua, Executor executor, Executor executor2) {
        return new adnh(adqf, lhs, bcaa, enl, airt, xua, executor, executor2);
    }

    static aikf a(bcaa bcaa, enl enl) {
        return new aikf(bcaa, enl);
    }

    static adnt a(aikf aikf, xci xci, lgy lgy, bcaa bcaa) {
        return new adnt(aikf, lgy, new adnr(bcaa, xci));
    }

    static xaa a(ScheduledExecutorService scheduledExecutorService, zyw zyw) {
        apxn a = zyw.a();
        aotn aotn = null;
        if (!(a == null || (a.a & 536870912) == 0)) {
            aycu aycu = a.r;
            if (aycu == null) {
                aycu = aycu.f;
            }
            aotn = aycu.b;
            if (aotn == null) {
                aotn = aotn.i;
            }
        }
        return new xaa(scheduledExecutorService, aotn);
    }

    static wzp a(xaa xaa, Executor executor, zyw zyw) {
        apxn a = zyw.a();
        aycu aycu = a.r;
        if (aycu == null) {
            aycu = aycu.f;
        }
        if ((aycu.a & 1) == 0) {
            return new wzp(executor);
        }
        aycu aycu2 = a.r;
        if (aycu2 == null) {
            aycu2 = aycu.f;
        }
        aotn aotn = aycu2.b;
        if (aotn == null) {
            aotn = aotn.i;
        }
        anyc anyc = new anyc(aotn.f, aotn.g);
        aycu aycu3 = a.r;
        if (aycu3 == null) {
            aycu3 = aycu.f;
        }
        aotn aotn2 = aycu3.b;
        if (aotn2 == null) {
            aotn2 = aotn.i;
        }
        return new wzp(xaa, executor, anyc, new anyc(aotn2.d, aotn.e));
    }

    static tpu a(Context context, tpr tpr, vdg vdg) {
        return new tpu(context, tpr, new vdh(vdg));
    }

    static imj a(zyw zyw, abgc abgc) {
        apxn a = zyw.a();
        if (!(a == null || (a.a & 16) == 0)) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.ai) {
                return new ilx(abgc);
            }
        }
        return new imk(abgc);
    }

    static ahhq c() {
        boolean z = true;
        ahhs a = ahhq.n().a(true);
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        return a.b(z).a();
    }

    static afmv a(zzf zzf, SharedPreferences sharedPreferences) {
        afmg afmg;
        afmu w = zzf.w();
        if (afmt.b(sharedPreferences) == afmt.TEST) {
            afmg = eao.b;
        } else {
            afmg = eao.a;
        }
        w.a = afmg;
        w.b = afmn.ANDROID;
        return w.a();
    }

    static zxp a(gze gze) {
        zxo zxo = new zxo();
        zxo.a = abmj.a();
        zxo.b = abmj.a();
        zxo.c = ashr.ANDROID;
        zxo.d = gze;
        zxo.e = true;
        return zxo.a();
    }

    static afuz a(bcaa bcaa, Context context) {
        afux afux = new afux();
        afux.a(0);
        afux.b(0);
        afux.c(0);
        afux.a = new Intent(context, NotificationInteractionBroadcastReceiver.class);
        afux.b = ebl.a(context);
        afux.a(R.drawable.ic_stat_yt_notification_logo);
        afux.b(R.mipmap.ic_launcher);
        afux.c(R.string.application_name);
        afux.f = "414843287017";
        afux.g = new ejk(bcaa);
        String str = "";
        if (afux.c == null) {
            str = str.concat(" smallIcon");
        }
        if (afux.d == null) {
            str = String.valueOf(str).concat(" largeIcon");
        }
        if (afux.e == null) {
            str = String.valueOf(str).concat(" appLabel");
        }
        if (str.isEmpty()) {
            return new afuy(afux.a, afux.b, afux.c.intValue(), afux.d.intValue(), afux.e.intValue(), afux.f, afux.g);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    static agee d() {
        agef agef = new agef();
        Boolean valueOf = Boolean.valueOf(false);
        agef.a = valueOf;
        agef.a(false);
        agef.b(false);
        agef.d = valueOf;
        agef.a(true);
        agef.b(true);
        String str = "";
        if (agef.a == null) {
            str = str.concat(" channelAutoOfflineEnabled");
        }
        if (agef.b == null) {
            str = String.valueOf(str).concat(" videoListAutoOfflineEnabled");
        }
        if (agef.c == null) {
            str = String.valueOf(str).concat(" offlineCandidatesEnabled");
        }
        if (agef.d == null) {
            str = String.valueOf(str).concat(" offlineSubscriptionsSyncEnabled");
        }
        if (str.isEmpty()) {
            return new ageg(agef.a.booleanValue(), agef.b.booleanValue(), agef.c.booleanValue(), agef.d.booleanValue());
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    static agem e() {
        ageh ageh = new ageh();
        ageh.a(false);
        Boolean valueOf = Boolean.valueOf(false);
        ageh.b = valueOf;
        ageh.c = Integer.valueOf(1);
        ageh.d = Integer.valueOf(35);
        ageh.e = Long.valueOf(2000);
        ageh.f = Long.valueOf(agxj.a);
        ageh.i = valueOf;
        ageh.g = valueOf;
        ageh.h = Integer.valueOf(0);
        ageh.a(true);
        String str = "";
        if (ageh.a == null) {
            str = str.concat(" enablePlaylistAutoSync");
        }
        if (ageh.b == null) {
            str = String.valueOf(str).concat(" enableYouTubeBundles");
        }
        if (ageh.c == null) {
            str = String.valueOf(str).concat(" transferRetryStrategy");
        }
        if (ageh.d == null) {
            str = String.valueOf(str).concat(" transferMaxRetries");
        }
        if (ageh.e == null) {
            str = String.valueOf(str).concat(" transferBaseRetryMilliSecs");
        }
        if (ageh.f == null) {
            str = String.valueOf(str).concat(" transferMaxRetryMilliSecs");
        }
        if (ageh.g == null) {
            str = String.valueOf(str).concat(" disableOfflineWhenDatabaseOpenException");
        }
        if (ageh.h == null) {
            str = String.valueOf(str).concat(" databaseOpenRetries");
        }
        if (ageh.i == null) {
            str = String.valueOf(str).concat(" enableFallbackToAudioOnlyDownload");
        }
        if (str.isEmpty()) {
            return new agei(ageh.a.booleanValue(), ageh.b.booleanValue(), ageh.c.intValue(), ageh.d.intValue(), ageh.e.longValue(), ageh.f.longValue(), ageh.g.booleanValue(), ageh.h.intValue(), ageh.i.booleanValue());
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    static amur f() {
        return acts.a;
    }

    static aisl a(zyw zyw, xci xci, abka abka, aisj aisj, bcaa bcaa) {
        if (foh.f(zyw)) {
            return new lha(xci, abka, aisj, bcaa);
        }
        return new aisl(xci, abka, aisj);
    }

    static aisj a(zyw zyw, bcaa bcaa) {
        if (foh.f(zyw)) {
            return (aisj) bcaa.get();
        }
        return new aisj();
    }

    static lht d(bcaa bcaa) {
        return new lht(bcaa);
    }

    static bdfp g() {
        return bdfi.h();
    }

    static etx a(zyw zyw, etz etz) {
        aovd D = foh.D(zyw);
        if (D != null && D.b && D.c) {
            return new ety(etz);
        }
        return new eua();
    }

    static aeci a(zyw zyw, bcaa bcaa, bcaa bcaa2) {
        if (foh.f(zyw)) {
            return new aecm(bcaa2);
        }
        return (aeci) bcaa.get();
    }

    static afvq a(xsc xsc, SharedPreferences sharedPreferences, zyw zyw) {
        auya auya = zyw.a().i;
        if (auya == null) {
            auya = auya.J;
        }
        aosh aosh = auya.r;
        if (aosh == null) {
            aosh = aosh.n;
        }
        if (aosh.k) {
            return new afvp(xsc);
        }
        return new afvs(sharedPreferences, xsc);
    }

    static akll a(Context context, aort aort) {
        return new akll(context, aort);
    }

    static lhg b(zyw zyw, bcaa bcaa) {
        if (foh.g(zyw)) {
            return (lhg) bcaa.get();
        }
        return new lhe();
    }

    static fnh h() {
        return new fnh();
    }

    static {
        TimeUnit.MINUTES.toSeconds(90);
    }
}
