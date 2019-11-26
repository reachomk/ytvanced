package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ajgn */
public final class ajgn implements xcp {
    private static final String m = xtl.b("subtitles");
    public final xci a;
    public final Context b;
    public final ScheduledExecutorService c;
    public final String d;
    public final Set e = Collections.newSetFromMap(new WeakHashMap());
    public boolean f;
    public ajis g;
    public ajiu h;
    public wxg i;
    public ajhn j;
    public aakj k;
    public ajpu l;
    private final SharedPreferences n;
    private final ajhi o;
    private final ahhq p;
    private final zzl q;
    private wxi r;

    public ajgn(xci xci, bctz bctz, bctz bctz2, Context context, SharedPreferences sharedPreferences, ajhi ajhi, ahhq ahhq, ScheduledExecutorService scheduledExecutorService, String str, zzl zzl) {
        this.a = (xci) amqw.a((Object) xci);
        this.n = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.o = (ajhi) amqw.a((Object) ajhi);
        this.p = (ahhq) amqw.a((Object) ahhq);
        this.b = (Context) amqw.a((Object) context);
        this.c = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.d = (String) amqw.a((Object) str);
        this.q = (zzl) amqw.a((Object) zzl);
        bctz.c().a(new ajgm(this));
        bctz2.c().a(new ajgp(this));
    }

    public final void a(ajis ajis) {
        if (ajis != null) {
            xtl.c(m, String.format("setSubtitleTrack name:%s languageCode:%s languageName:%s format:%d trackName:%s vssid:%s videoid:%s", new Object[]{ajis, ajis.a, ajis.b, Integer.valueOf(ajis.e), ajis.c, ajis.h, ajis.d}), new Throwable());
        } else {
            xtl.c(m, "subtitleTrack is null");
        }
        if (ajis != null) {
            boolean a = ajis.a();
            String str = xay.SUBTITLES_ENABLED;
            String str2 = xay.SUBTITLES_LANGUAGE_CODE;
            if (a) {
                this.n.edit().remove(str2).apply();
                this.n.edit().putBoolean(str, false).apply();
            } else {
                this.n.edit().putString(str2, ajis.a).apply();
                this.n.edit().putBoolean(str, true).apply();
            }
        }
        b(ajis);
    }

    private final void b(ajis ajis) {
        this.g = ajis;
        ajis ajis2 = null;
        if (ajis != null && ajis.a()) {
            this.g = null;
        }
        if (this.g == null) {
            ajiu ajiu = this.h;
            if (ajiu != null) {
                awcw awcw = ajiu.c;
                if (awcw != null && awcw.g) {
                    int i = awcw.f;
                    if (i >= 0 && i < ajiu.b.b.size()) {
                        arml arml;
                        awdc awdc = ajiu.b;
                        awda awda = (awda) awdc.b.get(ajiu.c.f);
                        String str = awda.e;
                        String str2 = ajiu.a;
                        String str3 = awda.d;
                        String str4 = awda.b;
                        if ((awda.a & 16) != 0) {
                            arml = awda.c;
                            if (arml == null) {
                                arml = arml.f;
                            }
                        }
                        ajis2 = new ajis(str, str2, str3, str4, ajqy.a(arml), true);
                    }
                }
                this.g = ajis2;
            }
        }
        ajis = this.g;
        ajpu ajpu = this.l;
        if (ajpu != null) {
            ajpu.N().e_(new ahke(ajis));
        } else {
            this.a.c(new ahke(ajis));
        }
    }

    public final int a() {
        if (aipo.a(this.q).w) {
            return aaho.DASH_FMP4_TT_FMT3.ax;
        }
        return aaho.DASH_FMP4_TT_WEBVTT.ax;
    }

    public final boolean b() {
        aakj aakj = this.k;
        if (aakj != null) {
            aajs aajs = aakj.c;
            if (!(aajs == null || !aajs.d() || ajii.a(this.k, a()).isEmpty())) {
                return true;
            }
        }
        return false;
    }

    private final void d() {
        this.i = null;
        this.h = null;
        a(false);
        b(null);
        this.j = null;
        e();
        this.k = null;
    }

    public final ajis c() {
        ajiu ajiu = this.h;
        return ajiu != null ? ajiu.c() : null;
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a.a(airi.NEW)) {
            d();
        } else {
            if (ahkn.a.a(airi.PLAYBACK_LOADED, airi.VIDEO_PLAYING, airi.INTERSTITIAL_PLAYING)) {
                Object obj;
                if (ahkn.a == airi.INTERSTITIAL_PLAYING) {
                    obj = ahkn.c;
                    if (obj == null) {
                        obj = null;
                    }
                } else {
                    obj = ahkn.b;
                }
                if (!amqq.a(obj, this.k)) {
                    this.k = obj;
                    if (obj == null) {
                        d();
                        return;
                    }
                    aajs aajs = obj.c;
                    if (aajs == null || (!aajs.a() && aajs.j != 11)) {
                        this.h = ajiu.a(obj, this.b.getString(R.string.turn_off_subtitles));
                        ajiu ajiu = this.h;
                        if (ajiu == null) {
                            a(false);
                            b(null);
                            return;
                        }
                        if (ajiu.a().size() > 0) {
                            a(true);
                        }
                        int ordinal = this.h.b().ordinal();
                        if (ordinal == 1 || !(ordinal == 2 || this.n.getBoolean(xay.SUBTITLES_ENABLED, false))) {
                            b(null);
                            return;
                        }
                        ajiu = this.h;
                        if (ajiu != null) {
                            ajis c;
                            if (ajiu.b() == ajix.ON) {
                                c = this.h.c();
                            } else {
                                c = this.h.a(this.n.getString(xay.SUBTITLES_LANGUAGE_CODE, null));
                                if (c == null) {
                                    c = this.h.c();
                                }
                            }
                            b(c);
                        }
                        for (ajgr a : this.e) {
                            a.a();
                        }
                    } else if (obj.c != null) {
                        e();
                        if (this.p.d() && obj.n() != null && obj.n().Y() && obj.c.j() != null) {
                            this.r = wxi.a(new ajgo(this));
                            ajhi ajhi = this.o;
                            wxi wxi = this.r;
                            ajhi.a.execute(new ajhl(ajhi, obj.c.j(), wxi));
                        } else if (b()) {
                            a(true);
                        }
                    }
                }
            }
        }
    }

    public final void a(aetv aetv) {
        if (this.h != null) {
            aahr aahr = aetv.c;
            if (aahr != null && !aahr.k().isEmpty()) {
                ajiu ajiu = this.h;
                String k = aetv.c.k();
                for (awcw awcw : ajiu.b.c) {
                    if (TextUtils.equals(k, awcw.b)) {
                        ajiu.c = awcw;
                        break;
                    }
                }
                ajis ajis = this.g;
                if (ajis != null && ajis.k) {
                    this.g = null;
                }
                ajis = this.g;
                if (ajis != null) {
                    ajis = this.h.a(ajis.a);
                    if (ajis != null) {
                        this.g = ajis;
                    }
                }
                b(this.g);
            }
        }
    }

    private final void e() {
        wxi wxi = this.r;
        if (wxi != null) {
            wxi.a();
            this.r = null;
        }
    }

    public final void a(boolean z) {
        this.f = z;
        ajpu ajpu = this.l;
        if (ajpu != null) {
            ajpu.O().e_(new ahkh(this.f));
        } else {
            this.a.d(new ahkh(z));
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aetv.class, ahkn.class};
        } else if (i == 0) {
            a((aetv) obj);
            return null;
        } else if (i == 1) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
