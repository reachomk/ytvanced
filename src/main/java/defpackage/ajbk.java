package defpackage;

/* renamed from: ajbk */
final class ajbk implements aixt, aixw {
    public final aiyx a;
    public final xci b;
    public final ajbx c;
    public final aixn d;
    private final ajkl e;
    private final bcud f;
    private final airt g;
    private final aixu h;
    private final aiws i;

    ajbk(ajkl ajkl, bcud bcud, aiyx aiyx, xci xci, airt airt, ajbx ajbx, aixn aixn, aixu aixu, aiws aiws) {
        this.e = ajkl;
        this.f = bcud;
        this.a = aiyx;
        this.b = xci;
        this.g = airt;
        this.c = ajbx;
        this.d = aixn;
        this.i = aiws;
        this.h = aixu;
        xci.a((Object) this, aioa.class, new ajbm(this));
    }

    /* Access modifiers changed, original: final */
    public final void a(aiqq aiqq, aiqw aiqw) {
        if (aiqq != null) {
            this.i.a(aiqq, aiqw);
            this.g.c(aiqq.p() ^ 1);
            ajlj ajlj = this.i.a;
            String E = ajlj != null ? ajlj.E() : null;
            this.c.a();
            this.d.a(aiqq, E, d(), aiqw);
            return;
        }
        afpc.a(2, afpf.player, "Playbackservice#startRequest called without PlaybackStartDescriptor");
    }

    public final void a(ahjc ahjc) {
        this.c.b(ahjc);
    }

    public final void b(ahjc ahjc) {
        this.c.b(ahjc);
    }

    public final void a(aakj aakj, aiqq aiqq, acxt acxt) {
        this.h.a(aakj, aiqq, this, acxt);
    }

    public final void a(aafv aafv) {
        this.f.e_(new ahko(aafv));
    }

    public final void a() {
        this.c.a();
    }

    public final void c(ahjc ahjc) {
        this.c.b(ahjc);
    }

    public final void b() {
        this.e.b(aizl.a);
    }

    public final void c() {
        a(-1);
    }

    public final void a(aakr aakr) {
        this.d.a(aakr.b, null, null);
    }

    public final aiye d() {
        return new ajbn(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    public final void a(int r10) {
        /*
        r9 = this;
        r0 = r9.c;
        r0.a();
        r2 = r9.d;
        r0 = r2.o;
        r1 = 2;
        r0 = defpackage.airg.a(r0, r1);
        r3 = 0;
        if (r0 == 0) goto L_0x001d;
    L_0x0011:
        r0 = r9.i;
        r0 = r0.a;
        if (r0 == 0) goto L_0x001d;
    L_0x0017:
        r0 = r0.E();
        r4 = r0;
        goto L_0x001e;
    L_0x001d:
        r4 = r3;
    L_0x001e:
        r0 = r9.d();
        r5 = r2.l;
        r6 = "currentPlayerResponse";
        r5 = r2.a(r5, r6);
        if (r5 != 0) goto L_0x00d6;
    L_0x002c:
        r5 = r2.i;
        if (r5 == 0) goto L_0x00d6;
    L_0x0030:
        r5 = r2.g;
        if (r5 == 0) goto L_0x0036;
    L_0x0034:
        goto L_0x00d6;
    L_0x0036:
        r5 = r2.l;
        r5 = r5.l();
        if (r5 != 0) goto L_0x0040;
    L_0x003e:
        r1 = r3;
        goto L_0x0053;
    L_0x0040:
        r5 = r2.l;
        r5 = r5.l();
        r5 = defpackage.aiqr.g(r5);
        if (r5 == 0) goto L_0x003e;
    L_0x004c:
        r7 = r5.a;
        r1 = r1 & r7;
        if (r1 == 0) goto L_0x003e;
    L_0x0051:
        r1 = r5.c;
    L_0x0053:
        r5 = r2.o;
        r7 = 5;
        r5 = defpackage.airg.a(r5, r7);
        if (r5 == 0) goto L_0x005d;
    L_0x005c:
        goto L_0x0066;
    L_0x005d:
        if (r1 != 0) goto L_0x0066;
    L_0x005f:
        r2.b();
        r2.a(r4, r0);
        return;
    L_0x0066:
        r0 = new aixq;
        r0.<init>(r2);
        r0 = defpackage.wxi.a(r0);
        r2.g = r0;
        r5 = r2.k;
        r5 = r5.s();
        if (r1 == 0) goto L_0x007b;
    L_0x0079:
        r5.k = r1;
    L_0x007b:
        r1 = r2.k;
        r1 = r1.b();
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 == 0) goto L_0x0088;
    L_0x0087:
        goto L_0x00c5;
    L_0x0088:
        r1 = r2.o;
        r1 = defpackage.airg.a(r1, r7);
        if (r1 == 0) goto L_0x00a2;
    L_0x0090:
        r1 = r2.j;
        r6 = "lastFullyLoadedStartDescriptor";
        r1 = r2.a(r1, r6);
        if (r1 == 0) goto L_0x009b;
    L_0x009a:
        goto L_0x00c3;
    L_0x009b:
        r1 = r2.j;
        r3 = r1.b();
        goto L_0x00c3;
    L_0x00a2:
        r1 = r2.o;
        r7 = 4;
        r1 = defpackage.airg.a(r1, r7);
        if (r1 == 0) goto L_0x00bd;
    L_0x00ab:
        r1 = r2.c();
        r1 = r2.a(r1, r6);
        if (r1 == 0) goto L_0x00b6;
    L_0x00b5:
        goto L_0x00c3;
    L_0x00b6:
        r1 = r2.l;
        r3 = r1.b();
        goto L_0x00c3;
    L_0x00bd:
        r1 = r2.k;
        r3 = r1.b();
    L_0x00c3:
        r5.i = r3;
    L_0x00c5:
        r3 = r5.b();
        r7 = r2.d;
        r8 = new aixm;
        r1 = r8;
        r5 = r10;
        r6 = r0;
        r1.<init>(r2, r3, r4, r5, r6);
        r7.execute(r8);
    L_0x00d6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajbk.a(int):void");
    }
}
