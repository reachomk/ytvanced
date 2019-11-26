package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aifl */
public final class aifl implements ajan, ajjo, wxg, xcp {
    public final aifi a;
    private final ajgv b;
    private final ajjl c;
    private final ajgn d;
    private final Executor e;
    private final Map f = new HashMap();
    private ajgk g;
    private wxi h;
    private ajis i;
    private boolean j;
    private String k;

    public aifl(aifi aifi, ajgv ajgv, ajjl ajjl, ajgn ajgn, Executor executor) {
        this.a = (aifi) amqw.a((Object) aifi);
        this.b = (ajgv) amqw.a((Object) ajgv);
        this.c = (ajjl) amqw.a((Object) ajjl);
        this.d = (ajgn) amqw.a((Object) ajgn);
        this.e = executor;
        ajjl.a((ajjo) this);
        aifi.a(ajjl.c());
        aifi.a(ajjl.b());
    }

    public final long e() {
        return 524288;
    }

    public final void a(ajji ajji) {
        this.a.a(ajji);
    }

    public final void a(float f) {
        this.a.a(f);
    }

    public final void a() {
        ajgk ajgk = this.g;
        if (ajgk != null) {
            ajgk.a();
            this.g = null;
        }
        this.c.b((ajjo) this);
    }

    private final void a(ajis ajis) {
        b();
        this.i = ajis;
        wxi wxi = this.h;
        if (wxi != null) {
            wxi.a();
            this.h = null;
        }
        if (!(ajis == null || ajis.a())) {
            if (ajis.e == aaho.DASH_FMP4_TT_WEBVTT.ax || ajis.e == aaho.DASH_FMP4_TT_FMT3.ax) {
                ajgn ajgn = this.d;
                String str = this.k;
                ajmv ajmv = (ajmv) this.f.get(ajis.d);
                aifi aifi = this.a;
                aifi.getClass();
                aifk aifk = new aifk(aifi);
                ScheduledExecutorService scheduledExecutorService = ajgn.c;
                for (aahr aahr : ajgn.k.c.l) {
                    if (TextUtils.equals(aahr.e, ajis.f)) {
                        break;
                    }
                }
                aahr aahr2 = null;
                this.g = new ajgk(str, scheduledExecutorService, aahr2, ajgn.d, ajmv, aifk);
            } else {
                this.h = wxi.a(this);
                this.b.a(new ajgu(ajis), this.h);
            }
        }
    }

    private final void b() {
        this.a.c();
        this.a.d();
        ajgk ajgk = this.g;
        if (ajgk != null) {
            ajgk.a();
            this.g = null;
        }
        for (ajmv a : this.f.values()) {
            a.a(ajit.class);
        }
        this.i = null;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 524288)).a(ajcg.a(ajam.O(), 524288, 1)).a(new aifr(this), aifq.a), ajam.Q().b.a(ajcg.b(ajam.O(), 524288)).a(ajcg.a(ajam.O(), 524288)).a(new aift(this), aifs.a), ajam.P().b.a(ajcg.b(ajam.O(), 524288)).a(ajcg.a(ajam.O(), 524288, 0)).a(new aifv(this), aifu.a), ajam.a(aifx.a, aifw.a).a(ajcg.b(ajam.O(), 524288)).a(ajcg.a(ajam.O(), 524288, 1)).a(new aifm(this), aifp.a)};
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a == airi.NEW) {
            b();
            this.f.clear();
            wxi wxi = this.h;
            if (wxi != null) {
                wxi.a();
                this.h = null;
            }
        }
        if (ahkn.a == airi.INTERSTITIAL_PLAYING || ahkn.a == airi.INTERSTITIAL_REQUESTED) {
            this.k = ahkn.f;
        } else {
            this.k = ahkn.e;
        }
        ajmq ajmq = ahkn.d;
        if (!(ajmq == null || ajmq.b() == null || ahkn.d.e() == null)) {
            this.f.put(ahkn.d.b().b(), ahkn.d.e());
        }
        if (ahkn.a == airi.ENDED) {
            a(this.i);
        }
    }

    public final void a(ahkm ahkm) {
        ajgk ajgk = this.g;
        if (ajgk != null) {
            long j = ahkm.a;
            Future future = null;
            try {
                Future future2 = ajgk.h;
                if (future2 != null) {
                    if (future2.isDone()) {
                        if (!future2.isCancelled()) {
                            ajig ajig = (ajig) future2.get();
                            if (!ajig.b.isEmpty()) {
                                ajgk.e.a(ajig.b);
                                ajgk.c.put(Long.valueOf(ajig.c), Integer.valueOf(ajig.a()));
                                if ("T".equals(ajig.a.a("Stream-Finished"))) {
                                    ajgk.i = Integer.valueOf(ajig.a());
                                }
                                if (ajgk.j == null) {
                                    ajgk.j = Integer.valueOf(ajig.a.b("Target-Duration-Us").intValue() / 1000);
                                }
                            }
                        }
                        future2 = null;
                    }
                    ajgk.h = future2;
                }
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof oae) {
                    ajgk.l = true;
                } else if (cause instanceof IOException) {
                    ajgk.k++;
                }
                ajgk.h = null;
            } catch (InterruptedException unused) {
                ajgk.h = null;
            }
            if (ajgk.h == null && !ajgk.l && !ajgk.m && ajgk.f != null) {
                Integer a;
                Entry floorEntry = ajgk.c.floorEntry(Long.valueOf(j));
                if (floorEntry == null) {
                    a = ajgk.a(j);
                } else if (j - ((Long) floorEntry.getKey()).longValue() >= ((long) ajgk.j.intValue())) {
                    a = ajgk.a(j);
                } else {
                    Entry higherEntry = ajgk.c.higherEntry((Long) floorEntry.getKey());
                    while (true) {
                        Entry entry = floorEntry;
                        floorEntry = higherEntry;
                        higherEntry = entry;
                        if (floorEntry == null || ((Integer) floorEntry.getValue()).intValue() != ((Integer) higherEntry.getValue()).intValue() + 1) {
                            a = Integer.valueOf(((Integer) higherEntry.getValue()).intValue() + 1);
                        } else {
                            higherEntry = ajgk.c.higherEntry((Long) floorEntry.getKey());
                        }
                    }
                    a = Integer.valueOf(((Integer) higherEntry.getValue()).intValue() + 1);
                }
                Integer num = a;
                if (num == null || ajgk.i == null || num.intValue() <= ajgk.i.intValue()) {
                    future = ajgk.a.submit(new ajih(ajgk.b, new ovr(ajgk.d), ajgk.g, num, ajgk.f));
                }
                ajgk.h = future;
            }
        }
    }

    public final void a(ahke ahke) {
        if (!this.j) {
            a(ahke.a);
        }
    }

    public final void a(ahjn ahjn) {
        this.j = ahjn.a == airc.REMOTE;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class, ahke.class, ahkn.class, ahkm.class};
        } else if (i == 0) {
            a((ahjn) obj);
            return null;
        } else if (i == 1) {
            a((ahke) obj);
            return null;
        } else if (i == 2) {
            a((ahkn) obj);
            return null;
        } else if (i == 3) {
            a((ahkm) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
