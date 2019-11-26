package defpackage;

/* renamed from: zzf */
public final class zzf extends xax {
    public final zyw b;
    private final bcaa c;

    public zzf(bcaa bcaa, zyw zyw) {
        this.c = (bcaa) amqw.a((Object) bcaa);
        this.b = (zyw) amqw.a((Object) zyw);
    }

    @Deprecated
    public final int h() {
        awzj awzj = x().c;
        if (awzj == null) {
            awzj = awzj.c;
        }
        return zzf.a(awzj);
    }

    public static int a(awzj awzj) {
        int i = awzj.b;
        return i <= 0 ? 86400 : i;
    }

    public final aort a() {
        aort aort = x().y;
        return aort == null ? aort.s : aort;
    }

    @Deprecated
    public final aovk i() {
        aovk aovk = x().m;
        return aovk == null ? aovk.b : aovk;
    }

    @Deprecated
    public final atlx j() {
        atlx atlx;
        auya x = x();
        if ((x.a & 8) != 0) {
            atlx = x.f;
            if (atlx == null) {
                return atlx.H;
            }
        }
        atlx = zzh.a;
        return atlx;
    }

    @Deprecated
    public final arhb k() {
        arhb arhb = x().n;
        return arhb == null ? arhb.h : arhb;
    }

    @Deprecated
    public final boolean l() {
        aysl n = n();
        return ((xwa) this.c.get()).compareTo(new xwa((n.a & 8) != 0 ? n.c : null)) < 0;
    }

    @Deprecated
    public final boolean m() {
        aysl n = n();
        return ((xwa) this.c.get()).compareTo(new xwa((n.a & 16) != 0 ? n.d : null)) < 0;
    }

    @Deprecated
    public final aysl n() {
        aysl aysl = x().d;
        return aysl == null ? aysl.f : aysl;
    }

    public final boolean d() {
        aotl aotl = x().F;
        if (aotl == null) {
            aotl = aotl.c;
        }
        return aotl.b;
    }

    @Deprecated
    public final aosh o() {
        aosh aosh = x().r;
        return aosh == null ? aosh.n : aosh;
    }

    @Deprecated
    public final boolean p() {
        return q().b;
    }

    @Deprecated
    public final aovf q() {
        aovf aovf;
        auya x = x();
        if ((x.b & 256) != 0) {
            aovf = x.z;
            if (aovf == null) {
                return aovf.g;
            }
        }
        aovf = zzh.b;
        return aovf;
    }

    @Deprecated
    public final boolean r() {
        boolean a = xy.a();
        for (atwo atwo : s().b) {
            if (atwo.d.equals("android_resume_during_on_start")) {
                if (atwo.b != 5) {
                    return false;
                }
                return ((Boolean) atwo.c).booleanValue();
            }
        }
        return a;
    }

    @Deprecated
    public final arhx s() {
        arhx arhx = x().q;
        return arhx == null ? arhx.d : arhx;
    }

    @Deprecated
    public final avtc t() {
        auya x = x();
        if ((x.b & 4) == 0) {
            return null;
        }
        avtc avtc = x.u;
        if (avtc == null) {
            avtc = avtc.w;
        }
        return avtc;
    }

    public final aydm b() {
        aydm aydm;
        auya x = x();
        if ((x.b & 8192) != 0) {
            aydm = x.B;
            if (aydm == null) {
                return aydm.i;
            }
        }
        aydm = zzh.c;
        return aydm;
    }

    public final avam c() {
        avam avam;
        apxn a = this.b.a();
        if ((a.a & 2097152) != 0) {
            avam = a.n;
            if (avam == null) {
                return avam.j;
            }
        }
        avam = xax.a.c();
        return avam;
    }

    @Deprecated
    public final zzn u() {
        avzm avzm = x().i;
        if (avzm == null) {
            avzm = avzm.i;
        }
        return new zzn(avzm);
    }

    @Deprecated
    public final zzg v() {
        aqtu aqtu = x().j;
        if (aqtu == null) {
            aqtu = aqtu.g;
        }
        return new zzg(aqtu);
    }

    public final afmu w() {
        zze zze = new zze(this);
        afmu afmu = new afmu();
        afmu.c = zze;
        return afmu;
    }

    public final aosl e() {
        apxn a = this.b.a();
        if (a == null || (a.a & 8) == 0) {
            return xax.a.e();
        }
        aosl aosl = a.d;
        if (aosl == null) {
            aosl = aosl.f;
        }
        return aosl;
    }

    public final auya x() {
        auya auya = this.b.a().i;
        return auya == null ? auya.J : auya;
    }
}
