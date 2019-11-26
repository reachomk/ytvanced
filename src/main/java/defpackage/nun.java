package defpackage;

/* renamed from: nun */
final class nun extends nuq {
    private final nxa a = new nxa(new byte[5]);
    private final nwz b = new nwz();
    private final int c;
    private int d;
    private int e;
    private int f;
    private final /* synthetic */ num g;

    public nun(num num, int i) {
        this.g = num;
        super();
        this.c = i;
    }

    public final void a() {
    }

    public final void a(nwz nwz, boolean z, nre nre) {
        nwz nwz2 = nwz;
        nre nre2 = nre;
        int i = 12;
        if (z) {
            nwz2.d(nwz.d());
            nwz2.a(this.a, 3);
            this.a.b(12);
            this.d = this.a.c(12);
            this.e = 0;
            this.f = nxf.a(this.a.a, 3, -1);
            this.b.a(this.d);
        }
        int min = Math.min(nwz.b(), this.d - this.e);
        nwz2.a(this.b.a, this.e, min);
        int i2 = this.e + min;
        this.e = i2;
        min = this.d;
        if (i2 >= min && nxf.a(this.b.a, min, this.f) == 0) {
            num num;
            int i3;
            this.b.d(7);
            this.b.a(this.a, 2);
            this.a.b(4);
            i2 = this.a.c(12);
            this.b.d(i2);
            int i4 = this.g.e;
            i4 = ((this.d - 9) - i2) - 4;
            while (i4 > 0) {
                int i5 = 5;
                this.b.a(this.a, 5);
                int c = this.a.c(8);
                this.a.b(3);
                int c2 = this.a.c(13);
                this.a.b(4);
                int c3 = this.a.c(i);
                if (c == 6) {
                    nwz nwz3 = this.b;
                    c = nwz3.b + c3;
                    int i6 = -1;
                    while (nwz3.b < c) {
                        int d = nwz3.d();
                        i = nwz3.d();
                        if (d == i5) {
                            long h = nwz3.h();
                            if (h == num.a) {
                                i6 = 129;
                            } else if (h == num.b) {
                                i6 = 135;
                            } else if (h == num.c) {
                                i6 = 36;
                            }
                            nwz3.c(c);
                            c = i6;
                        } else {
                            if (d == 106) {
                                i6 = 129;
                            } else if (d == afy.av) {
                                i6 = 135;
                            } else if (d == 123) {
                                i6 = 138;
                            }
                            nwz3.d(i);
                            i5 = 5;
                        }
                    }
                    nwz3.c(c);
                    c = i6;
                } else {
                    this.b.d(c3);
                }
                i4 -= c3 + 5;
                num num2 = this.g;
                i = num2.e;
                if (!num2.g.get(c2)) {
                    ntv nty;
                    if (c == 2) {
                        nty = new nty(nre2.d_(c2));
                    } else if (c == 3) {
                        nty = new nug(nre2.d_(c2));
                    } else if (c == 4) {
                        nty = new nug(nre2.d_(c2));
                    } else if (c == 15) {
                        i2 = this.g.e;
                        nty = new ntt(nre2.d_(c2), new nqz());
                    } else if (c == 21) {
                        num = this.g;
                        i3 = num.e;
                        nty = new nud(nre2.d_(num.m = num.m + 1));
                    } else if (c == 27) {
                        i2 = this.g.e;
                        nrs d_ = nre2.d_(c2);
                        nuj nuj = new nuj(nre2.d_(this.g.m = this.g.m + 1));
                        i = this.g.e;
                        nty = new nua(d_, nuj);
                    } else if (c == 36) {
                        nty = new nub(nre2.d_(c2), new nuj(nre2.d_(this.g.m = this.g.m + 1)));
                    } else if (c != 135) {
                        if (c != 138) {
                            if (c == 129) {
                                nty = new ntr(nre2.d_(c2), false);
                            } else if (c != 130) {
                                nty = null;
                            }
                        }
                        nty = new ntw(nre2.d_(c2));
                    } else {
                        nty = new ntr(nre2.d_(c2), true);
                    }
                    if (nty != null) {
                        this.g.g.put(c2, true);
                        num num3 = this.g;
                        num3.f.put(c2, new nuo(nty, num3.d));
                    }
                }
                i = 12;
            }
            num = this.g;
            i3 = num.e;
            num.f.remove(0);
            this.g.f.remove(this.c);
            nre.a();
            this.g.h = true;
        }
    }
}
