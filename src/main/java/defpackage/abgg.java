package defpackage;

/* renamed from: abgg */
final class abgg extends aann {
    private final /* synthetic */ abgc a;

    public abgg(abgc abgc, aamn aamn) {
        this.a = abgc;
        super(aamn, abgc.e, ajxw.class, abgj.a);
    }

    public final void c(aaml aaml) {
        abgc abgc = this.a;
        atev atev = (atev) ((anxl) ((atey) aaml.c()).build());
        for (awhn awhn : atev.d) {
            int a = awhp.a(awhn.b);
            if (a != 0 && a == 32) {
                abgc.a.d(new abge(atev.c, awhn.k, false));
            } else {
                a = awhp.a(awhn.b);
                if (a != 0 && a == 33) {
                    abgc.a.d(new abgf(atev.c, "", false));
                } else {
                    a = awhp.a(awhn.b);
                    if (a != 0 && a == 30) {
                        abgc.a.d(new abgl(atev.c, false));
                    } else {
                        a = awhp.a(awhn.b);
                        if (a != 0 && a == 2) {
                            xci xci = abgc.a;
                            String str = atev.c;
                            xci.d(new abgk(awhn.c));
                        }
                    }
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object a(aoca aoca) {
        return (ajxw) aoca;
    }

    public final /* synthetic */ void a(aaml aaml, Object obj) {
        ajxw ajxw = (ajxw) obj;
        abgc abgc = this.a;
        atev atev = (atev) ((anxl) ((atey) aaml.c()).build());
        for (awhn awhn : atev.d) {
            int a = awhp.a(awhn.b);
            if (a != 0 && a == 2) {
                abgc.a.d(new abgn(atev.c, awhn.c, ajxw));
            } else {
                a = awhp.a(awhn.b);
                if (a == 0 || a != 3) {
                    a = awhp.a(awhn.b);
                    if (a == 0 || a != 19) {
                        a = awhp.a(awhn.b);
                        xci xci;
                        String str;
                        String str2;
                        if (a != 0 && a == 4) {
                            xci = abgc.a;
                            str = atev.c;
                            str = awhn.d;
                            str2 = awhn.f;
                            xci.d(new abgp());
                        } else {
                            a = awhp.a(awhn.b);
                            if (a != 0 && a == 36) {
                                xci = abgc.a;
                                str = atev.c;
                                String str3 = awhn.d;
                                str2 = awhn.e;
                                xci.d(new abgm(str, ajxw));
                            } else {
                                a = awhp.a(awhn.b);
                                if (a != 0 && a == 32) {
                                    abgc.a.d(new abge(atev.c, awhn.k, true));
                                } else {
                                    a = awhp.a(awhn.b);
                                    if (a != 0 && a == 33) {
                                        abgc.a.d(new abgf(atev.c, xvd.f(ajxw.c), true));
                                    } else {
                                        a = awhp.a(awhn.b);
                                        if (a != 0 && a == 30) {
                                            abgc.a.d(new abgl(atev.c, true));
                                        } else {
                                            a = awhp.a(awhn.b);
                                            xci xci2;
                                            String str4;
                                            if (a != 0 && a == 11) {
                                                xci2 = abgc.a;
                                                str4 = atev.c;
                                                xci2.d(new abgi(ajxw));
                                            } else {
                                                int a2 = awhp.a(awhn.b);
                                                if (a2 != 0 && a2 == 15) {
                                                    xci2 = abgc.a;
                                                    str4 = atev.c;
                                                    xci2.d(new abgi(ajxw));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                abgc.a.d(new abgo(atev.c, awhn.j, awhn.d, ajxw));
            }
        }
    }
}
