package defpackage;

/* renamed from: jom */
public final class jom implements t, xcp {
    public final aizy a;
    public boolean b;
    public String c;
    private final ahas d;
    private final acvx e;
    private final emd f;
    private final xto g;
    private final xci h;
    private final ajam i;
    private final zyw j;
    private final bdfu k = new bdfu();
    private boolean l;

    public jom(aizy aizy, ahas ahas, acvx acvx, emd emd, xci xci, ajam ajam, zyw zyw) {
        this.a = aizy;
        this.d = ahas;
        this.e = acvx;
        this.f = emd;
        this.h = xci;
        this.i = ajam;
        this.j = zyw;
        this.g = new jor(this, "OfflineDialogListener", emd);
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void B_() {
        if (foh.x(this.j)) {
            this.k.a(this.i.Q().a.f().a(emg.a(this.j, 67108864, 1)).a(new jop(this), joo.a));
        } else {
            this.h.a((Object) this);
        }
    }

    public final void C_() {
        if (foh.x(this.j)) {
            this.k.a();
        } else {
            this.h.b(this);
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:20:0x0047, code skipped:
            if (r2 != 0) goto L_0x0049;
     */
    public final void a(defpackage.ahkn r9) {
        /*
        r8 = this;
        r0 = r9.a;
        r1 = 1;
        r2 = new defpackage.airi[r1];
        r3 = defpackage.airi.NEW;
        r4 = 0;
        r2[r4] = r3;
        r0 = r0.a(r2);
        if (r0 == 0) goto L_0x0012;
    L_0x0010:
        r8.l = r4;
    L_0x0012:
        r0 = r8.l;
        if (r0 == 0) goto L_0x0018;
    L_0x0016:
        goto L_0x00bb;
    L_0x0018:
        r0 = r9.b;
        if (r0 == 0) goto L_0x00bb;
    L_0x001c:
        r0 = r0.a;
        r0 = defpackage.jom.a(r0);
        if (r0 == 0) goto L_0x00bb;
    L_0x0024:
        r0 = r9.b;
        r0 = r0.a;
        r0 = defpackage.jom.a(r0);
        r2 = r0.p;
        if (r2 != 0) goto L_0x0032;
    L_0x0030:
        r2 = defpackage.ayvk.c;
    L_0x0032:
        if (r2 != 0) goto L_0x0036;
    L_0x0034:
        r2 = 1;
        goto L_0x0049;
    L_0x0036:
        r3 = r2.a;
        r3 = r3 & r1;
        if (r3 == 0) goto L_0x0034;
    L_0x003b:
        r2 = r2.b;
        if (r2 != 0) goto L_0x0041;
    L_0x003f:
        r2 = defpackage.ayvg.c;
    L_0x0041:
        r2 = r2.b;
        r2 = defpackage.ayve.a(r2);
        if (r2 == 0) goto L_0x0034;
    L_0x0049:
        if (r2 == r1) goto L_0x00bb;
    L_0x004b:
        r3 = 2;
        if (r2 != r3) goto L_0x0050;
    L_0x004e:
        goto L_0x00bb;
    L_0x0050:
        r3 = r9.a;
        r5 = new defpackage.airi[r1];
        r6 = defpackage.airi.READY;
        r5[r4] = r6;
        r3 = r3.a(r5);
        if (r3 == 0) goto L_0x0064;
    L_0x005e:
        r3 = 5;
        if (r2 == r3) goto L_0x0062;
    L_0x0061:
        goto L_0x0064;
    L_0x0062:
        r3 = 1;
        goto L_0x0065;
    L_0x0064:
        r3 = 0;
    L_0x0065:
        r5 = r9.a;
        r6 = new defpackage.airi[r1];
        r7 = defpackage.airi.VIDEO_PLAYING;
        r6[r4] = r7;
        r5 = r5.a(r6);
        if (r5 == 0) goto L_0x0079;
    L_0x0073:
        r5 = 3;
        if (r2 == r5) goto L_0x0077;
    L_0x0076:
        goto L_0x0079;
    L_0x0077:
        r5 = 1;
        goto L_0x007a;
    L_0x0079:
        r5 = 0;
    L_0x007a:
        r9 = r9.a;
        r6 = new defpackage.airi[r1];
        r7 = defpackage.airi.ENDED;
        r6[r4] = r7;
        r9 = r9.a(r6);
        if (r9 == 0) goto L_0x008d;
    L_0x0088:
        r9 = 4;
        if (r2 == r9) goto L_0x008c;
    L_0x008b:
        goto L_0x008d;
    L_0x008c:
        r4 = 1;
    L_0x008d:
        r8.b = r4;
        r9 = 0;
        if (r4 == 0) goto L_0x0099;
    L_0x0092:
        r2 = r8.f;
        r2 = r2.b();
        goto L_0x009a;
    L_0x0099:
        r2 = r9;
    L_0x009a:
        r8.c = r2;
        if (r3 == 0) goto L_0x009f;
    L_0x009e:
        goto L_0x00a5;
    L_0x009f:
        if (r5 != 0) goto L_0x00a5;
    L_0x00a1:
        r2 = r8.b;
        if (r2 == 0) goto L_0x00bb;
    L_0x00a5:
        r2 = r8.a;
        r2.b();
        r2 = r8.d;
        r3 = r8.e;
        r4 = r8.g;
        r4 = r4.get();
        r4 = (defpackage.ahcr) r4;
        r2.a(r0, r3, r9, r4);
        r8.l = r1;
    L_0x00bb:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jom.a(ahkn):void");
    }

    private static ayvi a(ajxu ajxu) {
        aozu aozu = ajxu.z;
        if (aozu != null) {
            aozw aozw = aozu.b;
            if (aozw == null) {
                aozw = aozw.c;
            }
            if ((aozw.a & 1) != 0) {
                aozw aozw2 = ajxu.z.b;
                if (aozw2 == null) {
                    aozw2 = aozw.c;
                }
                ayvi ayvi = aozw2.b;
                if (ayvi == null) {
                    ayvi = ayvi.r;
                }
                return ayvi;
            }
        }
        return null;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
