package defpackage;

/* renamed from: aiai */
public final class aiai implements ajan, xcp {
    private final /* synthetic */ aiac a;

    public aiai(aiac aiac) {
        this.a = aiac;
    }

    public final long e() {
        return 2048;
    }

    public final void a(ahkn ahkn) {
        this.a.q = ahkn.a.a();
        int ordinal = ahkn.a.ordinal();
        if (ordinal == 0) {
            this.a.a();
            this.a.d();
        } else if (ordinal == 4) {
            aakj aakj = ahkn.c;
            if (aakj != null) {
                this.a.a(aiac.a(aakj), ahkn.f);
            }
        } else if (ordinal == 7) {
            this.a.a(aiac.a(ahkn.b), ahkn.e);
        } else if (ordinal == 8) {
            aiac aiac = this.a;
            if (!aiac.f) {
                aiac.a(aiac.a(ahkn.b), ahkn.e);
            }
        }
    }

    public final void a(ahkm ahkm) {
        int i = (int) ahkm.a;
        aiac aiac = this.a;
        if (i != aiac.r) {
            aiac.r = i;
            if (aiac.i != null) {
                aiac.e();
                if (aiac.i.d.size() != 0) {
                    int i2 = 0;
                    aygk aygk = null;
                    aovq aovq = null;
                    int i3 = -1;
                    for (int i4 = 0; i4 < aiac.n.size(); i4++) {
                        aovq aovq2 = (aovq) aiac.n.get(i4);
                        long j = aovq2.b;
                        long j2 = (long) i;
                        if (j <= j2 && aovq2.c > j2 && (aovq == null || j > aovq.b)) {
                            i3 = i4;
                            aovq = aovq2;
                        }
                    }
                    if (i3 != aiac.l) {
                        aiac.l = i3;
                        aiac.m = aovq;
                        aovq aovq3 = aiac.m;
                        if (aovq3 != null) {
                            aiaa aiaa = aiac.a;
                            i3 = aovq3.a;
                            aiaa.a((i3 & 16) != 0 ? aovq3.e : null, (i3 & 32) != 0 ? aovq3.f : null);
                            aiac.a.a(null);
                            aovq3 = aiac.m;
                            if ((aovq3.a & 128) != 0) {
                                aygk = aovq3.h;
                                if (aygk == null) {
                                    aygk = aygk.f;
                                }
                            }
                            aiac.h = aiac.a(aiac.a(aygk), new aiab(aiac));
                            aiac.d.a(aiac.m.j);
                        }
                    }
                    if (aiac.m == null) {
                        aiac.a(true);
                    } else if (aiac.b()) {
                        aiac.a(true);
                    } else if (aiac.c() && !aiac.o) {
                        if (!aiac.k[aiac.l]) {
                            i2 = aiac.m.d;
                        }
                        aiac.a(true, true, i2);
                    }
                }
            }
        }
    }

    public final void a(ahjn ahjn) {
        aiac aiac = this.a;
        aiac.g = ahjn.b;
        if (!aiac.b()) {
            aiac aiac2 = this.a;
            if (aiac2.o != aiac2.c()) {
                if (this.a.c()) {
                    aiac2 = this.a;
                    aiac2.a(false, false, aiac2.m.d);
                } else {
                    this.a.a(false);
                }
            }
            this.a.e();
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 2048)).a(ajcg.a(ajam.O(), 2048, 1)).a(new aiah(this), aiak.a), ajam.Q().b.a(ajcg.b(ajam.O(), 2048)).a(ajcg.a(ajam.O(), 2048, 1)).a(new aiaj(this), aiam.a), ajam.P().b.a(ajcg.b(ajam.O(), 2048)).a(ajcg.a(ajam.O(), 2048, 0)).a(new aial(this), aiao.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class, ahkn.class, ahkm.class};
        } else if (i == 0) {
            a((ahjn) obj);
            return null;
        } else if (i == 1) {
            a((ahkn) obj);
            return null;
        } else if (i == 2) {
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
