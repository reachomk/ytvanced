package defpackage;

/* renamed from: ojt */
final class ojt implements ofg {
    private final ozo a;
    private final oza b = new oza();

    public final ofh a(ofp ofp, long j) {
        ofp ofp2 = ofp;
        ofl ofl = (ofl) ofp2;
        long j2 = ofl.c;
        int min = (int) Math.min(20000, ofl.b - j2);
        this.b.a(min);
        ofp2.c(this.b.a, 0, min);
        oza oza = this.b;
        min = -1;
        long j3 = -9223372036854775807L;
        int i = -1;
        while (oza.b() >= 4) {
            if (ojq.a(oza.a, oza.b) != 442) {
                oza.d(1);
            } else {
                oza.d(4);
                long a = ojs.a(oza);
                if (a != -9223372036854775807L) {
                    a = this.a.b(a);
                    if (a <= j) {
                        if (100000 + a > j) {
                            return ofh.a(j2 + ((long) oza.b));
                        }
                        i = oza.b;
                        j3 = a;
                    } else if (j3 != -9223372036854775807L) {
                        return ofh.a(j2 + ((long) i));
                    } else {
                        return ofh.a(a, j2);
                    }
                }
                min = oza.c;
                if (oza.b() >= 10) {
                    oza.d(9);
                    int d = oza.d() & 7;
                    if (oza.b() >= d) {
                        oza.d(d);
                        if (oza.b() >= 4) {
                            if (ojq.a(oza.a, oza.b) == 443) {
                                oza.d(4);
                                d = oza.e();
                                if (oza.b() < d) {
                                    oza.c(min);
                                } else {
                                    oza.d(d);
                                }
                            }
                            while (oza.b() >= 4) {
                                d = ojq.a(oza.a, oza.b);
                                if (d == 442 || d == 441 || (d >>> 8) != 1) {
                                    break;
                                }
                                oza.d(4);
                                if (oza.b() < 2) {
                                    oza.c(min);
                                    break;
                                }
                                oza.c(Math.min(oza.c, oza.b + oza.e()));
                            }
                        } else {
                            oza.c(min);
                        }
                    } else {
                        oza.c(min);
                    }
                } else {
                    oza.c(min);
                }
                min = oza.b;
            }
        }
        if (j3 != -9223372036854775807L) {
            return ofh.b(j3, j2 + ((long) min));
        }
        return ofh.a;
    }

    public final void a() {
        this.b.a(ozp.f);
    }

    /* synthetic */ ojt(ozo ozo) {
        this.a = ozo;
    }
}
