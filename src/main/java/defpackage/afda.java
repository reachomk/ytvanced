package defpackage;

/* renamed from: afda */
final class afda implements aemt {
    public afcz b;
    public aepc c;
    public aepc d;
    private final aaje e;
    private final afcz f;
    private final aajs g;
    private final Object h;
    private final aeuy i;
    private final boolean j;
    private final boolean k;
    private int l;
    private final /* synthetic */ afbo m;

    public afda(afbo afbo, aaje aaje, afcz afcz, aajs aajs, Object obj, aeuy aeuy) {
        this.m = afbo;
        this.e = aaje;
        this.f = afcz;
        this.g = aajs;
        this.h = obj;
        this.i = aeuy;
        arvt b = afbo.k.d.b();
        boolean z = false;
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            apex apex = auuo.j;
            if (apex == null) {
                apex = apex.f;
            }
            if (apex.b) {
                z = true;
            }
        }
        this.j = z;
        this.k = afbo.k.a().j;
    }

    public final void a() {
        xak.a();
        if (this.h == this.m.B) {
            int i = this.c.d;
            xak.a();
            aajs a = aajx.a(i);
            aajj aajj = this.e.e;
            afbo afbo = this.m;
            affh a2 = affd.a(a, aajj, afbo.k, afbo.b, afbo.h);
            int L = this.e.e.L();
            if (this.j || this.k) {
                aepc aepc = this.c;
                if (aepc != null) {
                    aepc aepc2 = this.d;
                    if (aepc2 != null) {
                        aeuy aeuy;
                        StringBuilder stringBuilder;
                        String str;
                        int i2 = (int) (aepc.i + aepc2.i);
                        long d = this.m.f.d() / 8;
                        afjc afjc = this.m.k;
                        int L2 = this.e.e.L();
                        if (i2 > 0 && d > 0) {
                            arvt b = afjc.d.b();
                            if (b != null) {
                                auuo auuo = b.k;
                                if (auuo == null) {
                                    auuo = auuo.k;
                                }
                                apex apex = auuo.j;
                                if (apex == null) {
                                    apex = apex.f;
                                }
                                int i3 = apex.c;
                                if (i3 > 0 && apex.e >= 0) {
                                    L = Math.max(apex.d, Math.min(apex.e, (int) Math.max(0.0f, (1.0f - (((float) d) / ((float) i2))) * ((float) i3))));
                                    aeuy = this.i;
                                    stringBuilder = new StringBuilder(44);
                                    stringBuilder.append(L);
                                    str = ";";
                                    stringBuilder.append(str);
                                    stringBuilder.append(d);
                                    stringBuilder.append(str);
                                    stringBuilder.append(i2);
                                    aeuy.a("bamb", (aevf) new aetw(stringBuilder.toString()));
                                }
                            }
                        }
                        L = L2;
                        aeuy = this.i;
                        stringBuilder = new StringBuilder(44);
                        stringBuilder.append(L);
                        str = ";";
                        stringBuilder.append(str);
                        stringBuilder.append(d);
                        stringBuilder.append(str);
                        stringBuilder.append(i2);
                        aeuy.a("bamb", (aevf) new aetw(stringBuilder.toString()));
                    }
                }
            }
            int i4 = L;
            afbo afbo2 = this.m;
            if (afbo2.L == a2.c && afbo2.x() && !this.j) {
                this.m.C.d = a2;
                return;
            }
            afbo = this.m;
            aema aema = afbo.l;
            aemq a3 = aema.a("video/x-unknown", afbo.d);
            afbo afbo3 = this.m;
            aema aema2 = afbo3.l;
            this.b = new afcz(a3, aema.a("audio/x-unknown", afbo3.d));
            aemk aemk = new aemk();
            aemk.a = a2.c;
            this.m.a(this.e, this.b, this.g, aemk, i4);
            this.m.C.d = a2;
            this.b.a(this.c, 2);
            aepc aepc3 = this.d;
            if (aepc3 != null) {
                this.b.a(aepc3, 1);
            }
        }
    }

    public final void a(aepc aepc, int i) {
        int i2;
        if (this.j || this.k) {
            this.f.a(aepc, i);
            i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    this.d = aepc;
                } else if (i2 == 1) {
                    this.c = aepc;
                }
                int i3 = this.l + 1;
                this.l = i3;
                if (i3 == 2) {
                    if (this.c == null || this.d == null) {
                        aepe.a("PrewarmTrackRenderersListener missing video or audio data.");
                    } else {
                        this.m.j.post(new afdf(this));
                        return;
                    }
                }
                return;
            }
            throw null;
        }
        this.f.a(aepc, i);
        i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                this.m.j.post(new afdc(this, aepc));
            } else if (i2 == 1) {
                this.m.j.post(new afdd(this, aepc));
                return;
            }
            return;
        }
        throw null;
    }
}
