package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: tqd */
public final class tqd {
    private static final Map m;
    private static final Map n;
    private static final Map o;
    private static final Map p;
    public final WeakReference a;
    public boolean b;
    public final trm c;
    private final tqp d;
    private final tqe e;
    private final Handler f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final tqb j;
    private final Set k;
    private final tpr l;

    public tqd(tpr tpr, View view, tqe tqe, tpq tpq) {
        tqa tqa = new tqa();
        trm trm = new trm(tpq);
        trm.x = !tpq.a ? 1 : 2;
        this.l = tpr;
        this.a = new WeakReference(view);
        this.e = tqe;
        this.j = tqa;
        this.c = trm;
        this.k = EnumSet.noneOf(tqh.class);
        this.f = new Handler(view.getContext().getMainLooper(), new tqf(this));
        ((View) this.a.get()).addOnLayoutChangeListener(new tqc(this));
        this.d = new tqp(tpq.b, this.l);
        this.l.a.a((Object) this);
    }

    public final tps a(tqh tqh) {
        int ordinal = tqh.ordinal();
        if (ordinal == 9) {
            a(true);
            this.c.r = true;
        } else if (ordinal == 15) {
            a(false);
            this.c.s = true;
        } else if (ordinal != 16) {
            switch (ordinal) {
                case 0:
                    trm trm = this.c;
                    trm.q = false;
                    trm.b = this.j.a();
                    a(false);
                    this.c.a(tqh.START);
                    break;
                case 1:
                case 3:
                    c(tqh);
                    break;
                case 2:
                    c(tqh);
                    break;
                case 4:
                    a(true);
                    this.c.a(tqh.COMPLETE);
                    break;
                case 5:
                    a(false);
                    this.c.q = false;
                    break;
                case 6:
                case 7:
                    a(true);
                    this.c.q = true;
                    break;
                default:
                    a(false);
                    break;
            }
        } else {
            a(false);
            this.c.s = false;
        }
        if (!this.g && tqh.p) {
            this.e.c(b(tqh.MEASURABLE_IMPRESSION));
            this.g = true;
        }
        tps b = b(tqh);
        if (!tqh.q) {
            this.k.add(tqh);
        }
        if (tqh.a() && tqh != tqh.COMPLETE) {
            trm trm2 = this.c;
            int i = tqh.r + 1;
            if (i > 0 && i <= 4) {
                trm2.t = i;
            }
        }
        return b;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        a();
        if (!this.b) {
            View view = (View) this.a.get();
            if (view != null) {
                int i;
                tqi a;
                double min;
                int i2;
                tqg a2 = this.e.a();
                if (a2 != null) {
                    trm trm = this.c;
                    int i3 = a2.a;
                    if (trm.v == 0) {
                        trm.v = i3;
                        ((tro) trm.f).o = i3;
                    }
                    i = a2.b;
                } else {
                    trm trm2 = this.c;
                    if (trm2.x == 2) {
                        trm2.x = 1;
                    }
                    i = 0;
                }
                tqj tqj = this.c;
                if (tqj.l) {
                    a = this.d.a(tqj, view);
                } else {
                    tqi tqi = new tqi(!tqj.s ? this.d.a(view) : 1.0d, this.d.b(view), null, null, null, null);
                }
                trm trm3 = this.c;
                long a3 = this.j.a();
                AudioManager audioManager = (AudioManager) view.getContext().getSystemService("audio");
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                if (streamMaxVolume > 0) {
                    double streamVolume = (double) audioManager.getStreamVolume(3);
                    double d = (double) streamMaxVolume;
                    Double.isNaN(streamVolume);
                    Double.isNaN(d);
                    min = Math.min(streamVolume / d, 1.0d);
                } else {
                    min = 0.0d;
                }
                long j = trm3.b;
                long j2 = 0;
                if (j > 0 && !trm3.r) {
                    double d2;
                    long max;
                    int i4;
                    if (trm3.c == -1) {
                        trm3.c = a3;
                    }
                    int i5 = trm3.v;
                    if (i > i5 && i5 > 0) {
                        i = i5;
                    }
                    long j3 = a3 - j;
                    streamMaxVolume = i - trm3.w;
                    int i6 = i;
                    long j4 = trm3.n;
                    if (!trm3.q && streamMaxVolume >= 0) {
                        d2 = min;
                        max = Math.max(j3 - ((long) streamMaxVolume), 0);
                    } else {
                        d2 = min;
                        max = 0;
                    }
                    trm3.n = j4 + max;
                    j4 = trm3.o;
                    if (streamMaxVolume < 0) {
                        j2 = (long) Math.abs(streamMaxVolume);
                    }
                    trm3.o = j4 + j2;
                    if (trm3.p == -1 && i6 > 0) {
                        trm3.p = a3 - trm3.c;
                    }
                    j4 = trm3.x == 2 ? (long) streamMaxVolume : j3;
                    if (trm3.q) {
                        i4 = streamMaxVolume;
                    } else {
                        i4 = streamMaxVolume;
                        double d3 = d2;
                        boolean z2 = z;
                        int i7 = i6;
                        ((tro) trm3.f).a(j4, a.a, d3, trm3.u, trm3.s, z2, i7, a.b);
                        trm3.f().a(j4, a.a, d3, trm3.u, trm3.s, z2, i7, a.b);
                    }
                    trm3.w = i4 <= 0 ? trm3.w : i6;
                    trm3.b = a3;
                    trm3.u = d2;
                    if (trm3.l) {
                        trm3.m = a;
                    } else {
                        trm3.d = a.a;
                        trm3.e = a.b;
                    }
                }
                if (!this.c.c() || this.h) {
                    i2 = 1;
                } else {
                    this.e.b(b(tqh.VIEWABLE_IMPRESSION));
                    this.k.add(tqh.VIEWABLE_IMPRESSION);
                    i2 = 1;
                    this.h = true;
                }
                tro tro = (tro) this.c.f;
                if (tro.a(tro.j.a(i2, tqw.FULL.f)) && !this.i) {
                    this.e.a(b(tqh.GROUPM_VIEWABLE_IMPRESSION));
                    this.k.add(tqh.GROUPM_VIEWABLE_IMPRESSION);
                    this.i = true;
                }
                if (!z) {
                    this.f.sendEmptyMessageDelayed(0, 200);
                }
            }
        }
    }

    private final tps b(tqh tqh) {
        boolean z = false;
        if (!this.k.contains(tqh) && this.e.a(tqh).contains("VIEWABILITY")) {
            z = true;
        }
        Map a = this.c.a(z);
        if (tqh == tqh.GROUPM_VIEWABLE_IMPRESSION) {
            a.put(tpz.GROUPM_VIEWABLE, "csm");
        }
        return tqd.a(tqh, a);
    }

    public static tps a(tqh tqh, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sv", tqy.a("41"));
        String str = "a";
        linkedHashMap.put("cb", tqy.a(str));
        linkedHashMap.put("sdk", tqy.a(tpz.SDK));
        linkedHashMap.put("gmm", tqy.a(tpz.GROUPM_MEASURABLE_VERSION));
        linkedHashMap.put(str, tqy.a(tpz.VOLUME, tpt.b));
        linkedHashMap.put("nv", tqy.a(tpz.MIN_VOLUME, tpt.b));
        linkedHashMap.put("mv", tqy.a(tpz.MAX_VOLUME, tpt.b));
        linkedHashMap.put("c", tqy.a(tpz.COVERAGE, tpt.a));
        linkedHashMap.put("nc", tqy.a(tpz.MIN_COVERAGE, tpt.a));
        linkedHashMap.put("mc", tqy.a(tpz.MAX_COVERAGE, tpt.a));
        linkedHashMap.put("tos", tqy.b(tpz.TOS));
        linkedHashMap.put("mtos", tqy.b(tpz.MAX_CONSECUTIVE_TOS));
        linkedHashMap.put("pt", tqy.b(tpz.PERCENTAGES));
        linkedHashMap.put("p", tqy.b(tpz.POSITION));
        linkedHashMap.put("cp", tqy.b(tpz.CONTAINER_POSITION));
        linkedHashMap.put("bs", tqy.b(tpz.VIEWPORT_SIZE));
        linkedHashMap.put("ps", tqy.b(tpz.APP_SIZE));
        linkedHashMap.put("scs", tqy.b(tpz.SCREEN_SIZE));
        linkedHashMap.put("at", tqy.a(tpz.AUDIBLE_TIME));
        linkedHashMap.put("as", tqy.a(tpz.AUDIBLE_SINCE_START));
        linkedHashMap.put("dur", tqy.a(tpz.DURATION));
        linkedHashMap.put("vmtime", tqy.a(tpz.CURRENT_MEDIA_TIME));
        linkedHashMap.put("dvs", tqy.a(tpz.VISIBLE_TIME_DELTA));
        linkedHashMap.put("dtos", tqy.a(tpz.TOS_DELTA));
        linkedHashMap.put("dtoss", tqy.a(tpz.TOS_DELTA_SEQUENCE));
        linkedHashMap.put("std", tqy.a(tpz.GROUPM_VIEWABLE));
        linkedHashMap.put("tcm", tqy.a(tpz.TIME_CALCULATION_MODE));
        linkedHashMap.put("bt", tqy.a(tpz.BUFFERING_TIME));
        linkedHashMap.put("pst", tqy.a(tpz.PLAYBACK_STARTED_TIME));
        linkedHashMap.put("nmt", tqy.a(tpz.NEGATIVE_MEDIA_TIME));
        linkedHashMap.put("ft", tqy.a(tpz.FULLSCREEN_TIME));
        linkedHashMap.put("dat", tqy.a(tpz.AUDIBLE_TIME_DELTA));
        linkedHashMap.put("dft", tqy.a(tpz.FULLSCREEN_TIME_DELTA));
        linkedHashMap.put("is", tqy.a(tpz.INSTANTANEOUS_STATE));
        linkedHashMap.put("i0", tqy.a(tpz.INSTANTANEOUS_STATE_AT_START));
        linkedHashMap.put("i1", tqy.a(tpz.INSTANTANEOUS_STATE_AT_Q1));
        linkedHashMap.put("i2", tqy.a(tpz.INSTANTANEOUS_STATE_AT_Q2));
        linkedHashMap.put("i3", tqy.a(tpz.INSTANTANEOUS_STATE_AT_Q3));
        linkedHashMap.put("ic", tqy.a(tpz.IMPRESSION_COUNTING_STATE));
        linkedHashMap.put("cs", tqy.a(tpz.CUMULATIVE_STATE));
        linkedHashMap.put("vpt", tqy.a(tpz.PLAY_TIME));
        linkedHashMap.put("dvpt", tqy.a(tpz.PLAY_TIME_DELTA));
        linkedHashMap.put("lte", tqy.a("1"));
        linkedHashMap.put("avms", tqy.a("nl"));
        if (tqh != null && (tqh.a() || tqh == tqh.SKIP || tqh == tqh.COMPLETE || tqh == tqh.ABANDON)) {
            linkedHashMap.put("qmt", tqy.b(tpz.QUARTILE_MAX_CONSECUTIVE_TOS));
            linkedHashMap.put("qnc", tqy.a(tpz.QUARTILE_MIN_COVERAGE, tpt.a));
            linkedHashMap.put("qmv", tqy.a(tpz.QUARTILE_MAX_VOLUME, tpt.b));
            linkedHashMap.put("qnv", tqy.a(tpz.QUARTILE_MIN_VOLUME, tpt.b));
        }
        linkedHashMap.put("psm", tqy.a(tpz.PER_SECOND_MEASURABLE));
        linkedHashMap.put("psv", tqy.a(tpz.PER_SECOND_VIEWABLE));
        linkedHashMap.put("psfv", tqy.a(tpz.PER_SECOND_FULLY_VIEWABLE));
        linkedHashMap.put("psa", tqy.a(tpz.PER_SECOND_AUDIBLE));
        String a = tpy.a(map, Collections.unmodifiableMap(linkedHashMap), null, null);
        String a2 = tpy.a(map, m, null, null);
        String str2 = "h";
        str = tpy.a(map, n, str2, "kArwaWEsTs");
        String a3 = tpy.a(map, o, str2, "b96YPMzfnx");
        String a4 = tpy.a(map, p, str2, "yb8Wev6QDg");
        tpv a5 = tps.a();
        a5.a = a;
        a5.b = str;
        a5.c = a2;
        a5.d = a3;
        a5.e = a4;
        return a5.a();
    }

    public final void a() {
        this.f.removeMessages(0);
    }

    private final void c(tqh tqh) {
        a(false);
        this.c.a(tqh);
    }

    public static int a(Context context, int i) {
        return (int) Math.ceil((double) (((float) i) / tqd.a(context).density));
    }

    public static DisplayMetrics a(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    static {
        Set hashSet = new HashSet();
        Integer valueOf = Integer.valueOf(2);
        hashSet.add(valueOf);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "atos";
        linkedHashMap.put(str, tqy.b(tpz.AUDIBLE_TOS));
        linkedHashMap.put("avt", tqy.a(tpz.AUDIBLE_TOS, hashSet));
        linkedHashMap.put("davs", tqy.a(tpz.AUDIBLE_VISIBLE_TIME_DELTA));
        linkedHashMap.put("dafvs", tqy.a(tpz.AUDIBLE_FULLY_VISIBLE_TIME_DELTA));
        linkedHashMap.put("dav", tqy.a(tpz.AUDIBLE_VIEWABLE_TIME_DELTA));
        String str2 = "ss";
        linkedHashMap.put(str2, tqy.a(tpz.SCREEN_SHARE, tpt.a));
        linkedHashMap.put("ssb", new trb(tpz.SCREEN_SHARE_BUCKETS));
        String str3 = "t";
        linkedHashMap.put(str3, tqy.a(tpz.TIMESTAMP));
        m = Collections.unmodifiableMap(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str4 = "c";
        linkedHashMap2.put(str4, tqy.a(tpz.COVERAGE, tpt.a));
        linkedHashMap2.put(str2, tqy.a(tpz.SCREEN_SHARE, tpt.a));
        str2 = "a";
        linkedHashMap2.put(str2, tqy.a(tpz.VOLUME, tpt.b));
        String str5 = "dur";
        linkedHashMap2.put(str5, tqy.a(tpz.DURATION));
        String str6 = "p";
        linkedHashMap2.put(str6, tqy.b(tpz.POSITION));
        String str7 = "gmm";
        linkedHashMap2.put(str7, tqy.a(tpz.GROUPM_MEASURABLE_VERSION));
        String str8 = "gdr";
        linkedHashMap2.put(str8, tqy.a(tpz.GROUPM_DURATION_REACHED));
        linkedHashMap2.put(str3, tqy.a(tpz.TIMESTAMP));
        Set hashSet2 = new HashSet();
        Integer valueOf2 = Integer.valueOf(0);
        hashSet2.add(valueOf2);
        hashSet2.add(valueOf);
        Integer valueOf3 = Integer.valueOf(4);
        hashSet2.add(valueOf3);
        String str9 = "at";
        linkedHashMap2.put(str9, tqy.a(tpz.AUDIBLE_TIME));
        linkedHashMap2.put(str, tqy.a(tpz.AUDIBLE_TOS, hashSet2));
        String str10 = "tos";
        linkedHashMap2.put(str10, tqy.b(tpz.TOS, hashSet2));
        str = "mtos";
        linkedHashMap2.put(str, tqy.a(tpz.MAX_CONSECUTIVE_TOS, hashSet2));
        String str11 = "vsv";
        linkedHashMap2.put(str11, tqy.a("a5"));
        n = Collections.unmodifiableMap(linkedHashMap2);
        hashSet = new HashSet();
        hashSet.add(valueOf2);
        hashSet.add(valueOf);
        hashSet.add(valueOf3);
        linkedHashMap = new LinkedHashMap();
        Integer num = valueOf3;
        Integer num2 = valueOf;
        linkedHashMap.put(str2, tqy.a(tpz.VOLUME, tpt.b));
        linkedHashMap.put(str10, tqy.b(tpz.TOS, hashSet));
        linkedHashMap.put(str9, tqy.a(tpz.AUDIBLE_TIME));
        linkedHashMap.put(str4, tqy.a(tpz.COVERAGE, tpt.a));
        linkedHashMap.put(str, tqy.a(tpz.MAX_CONSECUTIVE_TOS, hashSet));
        linkedHashMap.put(str5, tqy.a(tpz.DURATION));
        linkedHashMap.put("fs", tqy.a(tpz.FULLSCREEN));
        linkedHashMap.put(str6, tqy.b(tpz.POSITION));
        String str12 = "vpt";
        linkedHashMap.put(str12, tqy.a(tpz.PLAY_TIME));
        linkedHashMap.put(str11, tqy.a("ias_a2"));
        linkedHashMap.put(str7, tqy.a(tpz.GROUPM_MEASURABLE_VERSION));
        linkedHashMap.put(str8, tqy.a(tpz.GROUPM_DURATION_REACHED));
        linkedHashMap.put(str3, tqy.a(tpz.TIMESTAMP));
        o = Collections.unmodifiableMap(linkedHashMap);
        hashSet = new HashSet();
        hashSet.add(valueOf2);
        hashSet.add(num2);
        hashSet.add(num);
        linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str10, tqy.b(tpz.TOS, hashSet));
        linkedHashMap.put(str9, tqy.a(tpz.AUDIBLE_TIME));
        linkedHashMap.put(str4, tqy.a(tpz.COVERAGE, tpt.a));
        linkedHashMap.put(str, tqy.a(tpz.MAX_CONSECUTIVE_TOS, hashSet));
        linkedHashMap.put(str6, tqy.b(tpz.POSITION));
        linkedHashMap.put(str12, tqy.a(tpz.PLAY_TIME));
        linkedHashMap.put(str11, tqy.a("dv_a4"));
        linkedHashMap.put(str7, tqy.a(tpz.GROUPM_MEASURABLE_VERSION));
        linkedHashMap.put(str8, tqy.a(tpz.GROUPM_DURATION_REACHED));
        linkedHashMap.put(str3, tqy.a(tpz.TIMESTAMP));
        linkedHashMap.put("mv", tqy.a(tpz.MAX_VOLUME, tpt.a));
        linkedHashMap.put("qmpt", tqy.a(tpz.QUARTILE_MAX_CONSECUTIVE_TOS, hashSet));
        linkedHashMap.put("qvs", new trh(tpz.QUARTILE_MIN_COVERAGE, new int[]{100, 50, 0}));
        linkedHashMap.put("qmv", tqy.a(tpz.QUARTILE_MAX_VOLUME, tpt.a));
        linkedHashMap.put("qa", tqy.a(tpz.QUARTILE_AUDIBLE_SINCE_START));
        linkedHashMap.put(str2, tqy.a(tpz.VOLUME, tpt.b));
        p = Collections.unmodifiableMap(linkedHashMap);
    }
}
