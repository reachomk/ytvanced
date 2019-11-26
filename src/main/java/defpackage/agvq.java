package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: agvq */
public class agvq implements agvs {
    private static final avsi b = avsi.SD;
    public final amul a;
    private final SharedPreferences c;
    private final zzl d;
    private final amul e;
    private final CopyOnWriteArrayList f = new CopyOnWriteArrayList();

    public agvq(SharedPreferences sharedPreferences, zzl zzl, int i) {
        this.c = sharedPreferences;
        this.d = zzl;
        Collection arrayList = new ArrayList();
        for (avsi avsi : ahdl.a.keySet()) {
            if (ahdl.a(avsi, 0) <= i) {
                arrayList.add(avsi);
            }
        }
        this.e = amul.a(arrayList);
        amul amul = this.e;
        Collection arrayList2 = new ArrayList();
        if (amul.contains(avsi.LD)) {
            arrayList2.add(avsi.LD);
        }
        if (amul.contains(avsi.SD)) {
            arrayList2.add(avsi.SD);
        }
        if (amul.contains(avsi.HD)) {
            arrayList2.add(avsi.HD);
        }
        this.a = amul.a(arrayList2);
    }

    public boolean a() {
        return false;
    }

    public final float l() {
        return 0.0f;
    }

    public final void a(agvr agvr) {
        this.f.add(agvr);
    }

    public final boolean b(agvr agvr) {
        return this.f.remove(agvr);
    }

    public final amul e() {
        return this.e;
    }

    public amul c() {
        return this.a;
    }

    public final boolean f() {
        return this.a.size() > 1;
    }

    public final boolean a(avsj avsj) {
        if (avsj == null || !f()) {
            return false;
        }
        avsi c = c(avsi.UNKNOWN_FORMAT_TYPE);
        if (c != avsi.UNKNOWN_FORMAT_TYPE) {
            return agqa.a(avsj).containsKey(c) ^ 1;
        }
        return true;
    }

    public final avsi g() {
        return c(b);
    }

    private final avsi c(avsi avsi) {
        String string = this.c.getString(ageo.QUALITY, null);
        if (string != null) {
            try {
                int parseInt = Integer.parseInt(string);
                amxn amxn = (amxn) this.e.listIterator();
                while (amxn.hasNext()) {
                    avsi avsi2 = (avsi) amxn.next();
                    if (ahdl.a(avsi2, -1) == parseInt) {
                        return avsi2;
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        return avsi;
    }

    public final void a(avsi avsi) {
        amqw.a(avsi != avsi.UNKNOWN_FORMAT_TYPE);
        int a = ahdl.a(avsi, -1);
        if (a != -1) {
            this.c.edit().putString(ageo.QUALITY, Integer.toString(a)).commit();
        }
    }

    public final void h() {
        this.c.edit().putBoolean(ageo.PLAYLIST_WARNING, false).commit();
    }

    public final boolean i() {
        return this.c.getBoolean(ageo.PLAYLIST_WARNING, true);
    }

    public final boolean j() {
        return this.c.getBoolean(ageo.WIFI_POLICY, false);
    }

    public final boolean k() {
        return this.c.getBoolean("offline_use_sd_card", true);
    }

    public final void a(boolean z) {
        this.c.edit().putBoolean("offline_use_sd_card", z).apply();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((agvr) it.next()).h();
        }
    }

    public final String a(xmc xmc) {
        return this.c.getString("video_storage_location_on_sdcard", xmc.a(xmc.d()));
    }

    public final long a(String str) {
        return this.c.getLong(agvq.g(str), 0);
    }

    public final void a(String str, long j) {
        this.c.edit().putLong(agvq.g(str), j).apply();
    }

    public final long b(String str) {
        return this.c.getLong(agvq.h(str), 0);
    }

    public final void b(String str, long j) {
        this.c.edit().putLong(agvq.h(str), j).apply();
    }

    public final long c(String str) {
        return this.c.getLong(agvq.i(str), 0);
    }

    public final void c(String str, long j) {
        this.c.edit().putLong(agvq.i(str), j).apply();
    }

    public final long d(String str) {
        return this.c.getLong(agvq.j(str), 0);
    }

    public final void d(String str, long j) {
        this.c.edit().putLong(agvq.j(str), j).apply();
    }

    private static String g(String str) {
        return xuq.a("offline_resync_interval_%s", str);
    }

    private static String h(String str) {
        return xuq.a("offline_auto_offline_interval_%s", str);
    }

    private static String i(String str) {
        return xuq.a("offline_auto_offline_time_%s", str);
    }

    private static String j(String str) {
        return xuq.a("offline_auto_offline_execution_window_%s", str);
    }

    public boolean a(agqz agqz) {
        return agxj.g(agqz.f);
    }

    public Comparator b() {
        return agqa.c;
    }

    public amqv d() {
        return agvp.a;
    }

    public final boolean e(String str) {
        return this.c.getBoolean(xuq.a("should_record_offline_playback_last_position_%s", str), true);
    }

    public final void a(String str, boolean z) {
        this.c.edit().putBoolean(xuq.a("should_record_offline_playback_last_position_%s", str), z).apply();
    }

    public final long f(String str) {
        return this.c.getLong(xuq.a("last_offline_video_playback_position_sync_timestamp_%s", str), 0);
    }

    public final void e(String str, long j) {
        this.c.edit().putLong(xuq.a("last_offline_video_playback_position_sync_timestamp_%s", str), j).apply();
    }

    public final int b(avsi avsi) {
        avoa avoa = this.d.b().h;
        if (avoa == null) {
            avoa = avoa.w;
        }
        if (avoa.r) {
            switch (avsi.ordinal()) {
                case 1:
                case 5:
                    return 2;
                case 2:
                case 6:
                    return 3;
                case 3:
                case 7:
                case 8:
                case 9:
                    return 4;
            }
        }
        return 1;
    }
}
