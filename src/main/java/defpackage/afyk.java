package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: afyk */
public final class afyk implements afyf {
    private final vfj a;
    private final xsc b;
    private final bcaa c;
    private final bcaa d;
    private final aajx e;
    private final zzl f;
    private final acys g;
    private final long h;
    private final long i;
    private final long j;

    public afyk(vfj vfj, xsc xsc, agej agej, bcaa bcaa, bcaa bcaa2, aajx aajx, zzl zzl, afqv afqv, afti afti) {
        this.a = (vfj) amqw.a((Object) vfj);
        this.b = (xsc) amqw.a((Object) xsc);
        this.c = (bcaa) amqw.a((Object) bcaa2);
        this.d = (bcaa) amqw.a((Object) bcaa);
        this.e = (aajx) amqw.a((Object) aajx);
        this.f = zzl;
        this.g = new acys(afqv, afti, "adtracking");
        amqw.a((Object) agej);
        agek agek = (agek) agej;
        this.h = ((long) agek.c.a("pudl_ad_frequency_cap", (int) agek.a)) * 1000;
        this.i = ((long) agek.c.a("pudl_ad_lact_skippable", (int) agek.b)) * 1000;
        this.j = ((long) agek.c.a("pudl_ad_lact_nonskippable", 0)) * 1000;
    }

    private final agvz a() {
        return ((agwc) this.d.get()).b();
    }

    public final List a(aakj aakj) {
        if (aakj.k()) {
            return a().m().a(aakj.b());
        }
        return this.a.a(aakj);
    }

    public final boolean b(aakj aakj) {
        amqw.a((Object) aakj);
        return aakj.k() || this.a.b(aakj);
    }

    public final List c(aakj aakj) {
        return this.a.a(aakj);
    }

    public final List a(vsd vsd, aajj aajj, String str, xvk xvk) {
        vsd vsd2 = vsd;
        xak.b();
        if (vsd2.e) {
            List emptyList;
            agvz a = a();
            vse a2 = a.m().a(vsd2.f, vsd2.g);
            if (a2 != null) {
                agvz a3 = a();
                ArrayList arrayList = new ArrayList();
                if (this.a.a() > 0 && this.h > 0 && this.a.a() + this.h > this.b.a()) {
                    arrayList.add(aagf.REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP);
                }
                xpt xpt = ((vnx) this.c.get()).d;
                if (xpt != null) {
                    long b = xpt.b();
                    if (b != -1) {
                        long j;
                        if (a2.p()) {
                            j = this.i;
                        } else {
                            j = this.j;
                        }
                        if (j > 0 && b > j) {
                            arrayList.add(aagf.REASON_CLIENT_OFFLINE_INACTIVE_USER);
                        }
                    }
                }
                if (a2.ae() != -1) {
                    if (Math.max(a2.d() != null ? a3.m().d(a2.d()) : 0, a3.m().c(a2.f(), a2.k())) >= a2.ae()) {
                        arrayList.add(aagf.REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP);
                    }
                }
                if (a2.a.a(this.b)) {
                    arrayList.add(aagf.REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED);
                }
                if (!(a2.d() == null || a3.m().e(a2.d()) == agqf.COMPLETE)) {
                    arrayList.add(aagf.REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY);
                }
                if (!arrayList.isEmpty()) {
                    this.g.a("DISALLOW", TextUtils.join(",", arrayList));
                    this.g.a(a2.a.M());
                    emptyList = Collections.emptyList();
                } else if (TextUtils.isEmpty(a2.d())) {
                    emptyList = Arrays.asList(new aaga[]{a2});
                } else {
                    agqn a4 = a.p().a(a2.d(), this.b.b() + (a2.b() - this.b.a()));
                    if (a4 != null) {
                        aahr a5 = a4.a(a.j().a(), this.f);
                        aahr b2 = a4.b(a.j().a(), this.f);
                        if (a5 == null || b2 == null) {
                            emptyList = Collections.emptyList();
                        } else {
                            try {
                                aakj a6 = a2.q().a(this.e, a5, b2);
                                aaga[] aagaArr = new aaga[1];
                                this.b.a();
                                vtk vtk = (vtk) a2.a;
                                aagaArr[0] = new vse(new vtk(vtk.d, vtk.e, vtk.f, vtk.g, vtk.h, vtk.j, vtk.k, vtk.a, a6));
                                emptyList = Arrays.asList(aagaArr);
                            } catch (aocg unused) {
                            }
                        }
                    }
                    emptyList = Collections.emptyList();
                }
            } else {
                emptyList = Collections.emptyList();
            }
            return emptyList;
        } else if (((vnx) this.c.get()).b.c()) {
            return this.a.a(vsd2, aajj, str, xvk);
        } else {
            return Collections.emptyList();
        }
    }

    public final vsi a(aakj aakj, String str, String str2, String str3, String str4, long j, int i, xvk xvk) {
        if (((vnx) this.c.get()).b.c()) {
            return this.a.a(aakj, str, str2, str3, str4, j, i, xvk);
        }
        return vsi.a;
    }

    public final vrq a(vrt vrt) {
        return !vrt.d.k() ? this.a.a(vrt) : null;
    }

    public final List a(vsd vsd, xvk xvk) {
        xak.b();
        return this.a.a(vsd, aajj.b, "", xvk);
    }

    public final void a(aaga aaga) {
        agvz a = a();
        if (((vse) aaga).a.h) {
            a.m().b(aaga.f(), aaga.k());
            if (aaga.d() != null) {
                a.m().c(aaga.d());
            }
        }
        this.a.a(aaga);
    }

    public final aakj a(vqy vqy, aakj aakj) {
        if (vqy.g()) {
            agfi h = a().h();
            if (h != null) {
                String b = aakj.b();
                Object h2 = vqy.h();
                xvd.a(b);
                amqw.a(h2);
                Cursor query = h.f.c.a().query("ads", new String[]{"ad_intro_player_response"}, "original_video_id=? AND ad_break_id=?", new String[]{b, h2}, null, null, null, null);
                try {
                    if (query.moveToNext()) {
                        aakj = aakj.a(query.getBlob(0), 0);
                    } else {
                        query.close();
                        aakj = null;
                    }
                    return aakj;
                } finally {
                    query.close();
                }
            }
        }
        return aakj.s();
    }
}
