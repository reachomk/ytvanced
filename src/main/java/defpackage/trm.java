package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: trm */
public final class trm extends tqj {
    public long n;
    public long o;
    public long p = -1;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t = 1;
    public double u;
    public int v;
    public int w;
    public int x = 1;
    private final tro[] y = new tro[4];
    private final List z = new ArrayList();

    public trm(tpq tpq) {
        super(new tro(), tpq.c);
    }

    public final boolean d() {
        return this.s;
    }

    public final void a(tqh tqh) {
        if (tqh.r >= 0) {
            for (int size = this.z.size(); size <= tqh.r; size++) {
                this.z.add(new trp());
            }
            this.z.set(tqh.r, new trp((int) (this.d * 100.0d), Integer.valueOf(((tro) this.f).p.a())));
        }
    }

    public final Map a(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (trp trp : this.z) {
            arrayList.add(Integer.valueOf(trp.a));
        }
        Map b = b();
        b.put(tpz.GROUPM_MEASURABLE_VERSION, Integer.valueOf(4));
        b.put(tpz.VOLUME, Double.valueOf(this.u));
        b.put(tpz.PERCENTAGES, arrayList);
        b.put(tpz.DURATION, Integer.valueOf(this.v));
        b.put(tpz.CURRENT_MEDIA_TIME, Integer.valueOf(this.w));
        tpz tpz = tpz.TIME_CALCULATION_MODE;
        int i = this.x;
        if (i != 0) {
            b.put(tpz, Integer.valueOf(i - 1));
            b.put(tpz.BUFFERING_TIME, Long.valueOf(this.n));
            b.put(tpz.FULLSCREEN, Boolean.valueOf(this.s));
            b.put(tpz.PLAYBACK_STARTED_TIME, Long.valueOf(this.p));
            b.put(tpz.NEGATIVE_MEDIA_TIME, Long.valueOf(this.o));
            b.put(tpz.MIN_VOLUME, Double.valueOf(((tro) this.f).e));
            b.put(tpz.MAX_VOLUME, Double.valueOf(((tro) this.f).f));
            b.put(tpz.AUDIBLE_TOS, ((tro) this.f).j.a(1, true));
            b.put(tpz.AUDIBLE_TIME, Long.valueOf(((tro) this.f).i.a(1)));
            b.put(tpz.AUDIBLE_SINCE_START, Boolean.valueOf(((tro) this.f).e()));
            b.put(tpz.QUARTILE_AUDIBLE_SINCE_START, Boolean.valueOf(((tro) this.f).e()));
            b.put(tpz.PLAY_TIME, Long.valueOf(((tro) this.f).f()));
            b.put(tpz.FULLSCREEN_TIME, Long.valueOf(((tro) this.f).g));
            b.put(tpz.GROUPM_DURATION_REACHED, Boolean.valueOf(((tro) this.f).d()));
            b.put(tpz.INSTANTANEOUS_STATE, Integer.valueOf(((tro) this.f).p.a()));
            if (this.z.size() > 0) {
                b.put(tpz.INSTANTANEOUS_STATE_AT_START, ((trp) this.z.get(0)).b);
            }
            if (this.z.size() >= 2) {
                b.put(tpz.INSTANTANEOUS_STATE_AT_Q1, ((trp) this.z.get(1)).b);
            }
            if (this.z.size() >= 3) {
                b.put(tpz.INSTANTANEOUS_STATE_AT_Q2, ((trp) this.z.get(2)).b);
            }
            if (this.z.size() >= 4) {
                b.put(tpz.INSTANTANEOUS_STATE_AT_Q3, ((trp) this.z.get(3)).b);
            }
            tpz = tpz.CUMULATIVE_STATE;
            int i2 = 0;
            for (tqv tqv : ((tro) this.f).p.b.keySet()) {
                i2 |= tqv.o;
            }
            b.put(tpz, Integer.valueOf(i2));
            if (z) {
                tpz tpz2;
                tro tro;
                int i3;
                if (((tro) this.f).a()) {
                    b.put(tpz.TOS_DELTA, Integer.valueOf((int) ((tro) this.f).k.b()));
                    tpz2 = tpz.TOS_DELTA_SEQUENCE;
                    tro = (tro) this.f;
                    i3 = tro.n;
                    tro.n = i3 + 1;
                    b.put(tpz2, Integer.valueOf(i3));
                    b.put(tpz.AUDIBLE_VIEWABLE_TIME_DELTA, Integer.valueOf((int) ((tro) this.f).m.b()));
                }
                b.put(tpz.VISIBLE_TIME_DELTA, Integer.valueOf((int) ((tro) this.f).c.a(tqw.HALF.f)));
                b.put(tpz.FULLY_VISIBLE_TIME_DELTA, Integer.valueOf((int) ((tro) this.f).c.a(tqw.FULL.f)));
                b.put(tpz.AUDIBLE_VISIBLE_TIME_DELTA, Integer.valueOf((int) ((tro) this.f).j.a(tqw.HALF.f)));
                b.put(tpz.AUDIBLE_FULLY_VISIBLE_TIME_DELTA, Integer.valueOf((int) ((tro) this.f).j.a(tqw.FULL.f)));
                tpz2 = tpz.IMPRESSION_COUNTING_STATE;
                tqs tqs = ((tro) this.f).p;
                i2 = 0;
                for (tqv tqv2 : tqs.b.keySet()) {
                    if (!((Boolean) tqs.b.get(tqv2)).booleanValue()) {
                        i2 |= tqv2.n;
                        tqs.b.put(tqv2, Boolean.valueOf(true));
                    }
                }
                b.put(tpz2, Integer.valueOf(i2));
                ((tro) this.f).j.b();
                ((tro) this.f).c.b();
                b.put(tpz.AUDIBLE_TIME_DELTA, Integer.valueOf((int) ((tro) this.f).i.b()));
                b.put(tpz.PLAY_TIME_DELTA, Integer.valueOf((int) ((tro) this.f).h.b()));
                tpz2 = tpz.FULLSCREEN_TIME_DELTA;
                tro = (tro) this.f;
                i3 = tro.l;
                tro.l = 0;
                b.put(tpz2, Integer.valueOf(i3));
            }
            b.put(tpz.QUARTILE_MAX_CONSECUTIVE_TOS, f().b());
            b.put(tpz.QUARTILE_MIN_COVERAGE, Double.valueOf(f().a));
            b.put(tpz.QUARTILE_MAX_VOLUME, Double.valueOf(f().f));
            b.put(tpz.QUARTILE_AUDIBLE_SINCE_START, Boolean.valueOf(f().e()));
            b.put(tpz.QUARTILE_MIN_VOLUME, Double.valueOf(f().e));
            b.put(tpz.PER_SECOND_MEASURABLE, Integer.valueOf(((tro) this.f).q.b));
            b.put(tpz.PER_SECOND_VIEWABLE, Integer.valueOf(((tro) this.f).q.a));
            b.put(tpz.PER_SECOND_FULLY_VIEWABLE, Integer.valueOf(((tro) this.f).r.a));
            b.put(tpz.PER_SECOND_AUDIBLE, Integer.valueOf(((tro) this.f).s.a));
            return b;
        }
        throw null;
    }

    public final tro f() {
        tro[] troArr = this.y;
        int i = this.t - 1;
        if (troArr[i] == null) {
            troArr[i] = new tro();
        }
        return this.y[this.t - 1];
    }
}
