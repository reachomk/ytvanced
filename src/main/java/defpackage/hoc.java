package defpackage;

/* renamed from: hoc */
public final class hoc {
    private final hof a;

    public hoc(hof hof) {
        this.a = hof;
    }

    public final aqgs a(agqy agqy, int i, acwc acwc) {
        return (aqgs) a(agqy.class, aqgs.class, (agqy) amqw.a((Object) agqy), amur.a("downloads_page_item_index", Integer.valueOf(i), "downloads_page_item_ve_type", acwc));
    }

    public final auwl a(eki eki) {
        return (auwl) a(eki.class, auwl.class, eki, null);
    }

    public final auvp a(agqy agqy, String str) {
        amur amur;
        Class cls = agqy.class;
        Class cls2 = auvp.class;
        agqy = (agqy) amqw.a((Object) agqy);
        if (amqu.a(str)) {
            amur = null;
        } else {
            amur = amur.a("downloaded_video_playlist_id", xvd.a(str));
        }
        return (auvp) a(cls, cls2, agqy, amur);
    }

    public final auvp a(agqk agqk) {
        return (auvp) a(agqk.class, auvp.class, (agqk) amqw.a((Object) agqk), null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
    public final java.lang.Object a(java.lang.Class r8, java.lang.Class r9, java.lang.Object r10, defpackage.amur r11) {
        /*
        r7 = this;
        r0 = 0;
        r1 = 1;
        if (r10 != 0) goto L_0x000b;
    L_0x0004:
        r2 = java.lang.Void.class;
        if (r8 != r2) goto L_0x0009;
    L_0x0008:
        goto L_0x000b;
    L_0x0009:
        r2 = 0;
        goto L_0x000c;
    L_0x000b:
        r2 = 1;
    L_0x000c:
        r3 = "Passed in a null model.";
        defpackage.amqw.a(r2, r3);
        r2 = r7.a;
        r3 = defpackage.amqw.a(r8);
        r3 = (java.lang.Class) r3;
        r4 = defpackage.amqw.a(r9);
        r4 = (java.lang.Class) r4;
        r5 = new hno;
        r5.<init>(r3, r4);
        r3 = r2.a;
        r3 = r3.containsKey(r5);
        r4 = 0;
        if (r3 == 0) goto L_0x006b;
    L_0x002d:
        r2 = r2.a;
        r2 = r2.get(r5);
        r2 = (defpackage.hnt) r2;
        r3 = r2.b();
        r3 = r8.equals(r3);
        if (r3 == 0) goto L_0x0049;
    L_0x003f:
        r3 = r2.c();
        r3 = r9.equals(r3);
        if (r3 != 0) goto L_0x006c;
    L_0x0049:
        r3 = r2.b();
        r2 = r2.c();
        r5 = java.util.Locale.ROOT;
        r6 = 2;
        r6 = new java.lang.Object[r6];
        r8 = defpackage.hof.a(r8, r9);
        r6[r0] = r8;
        r8 = defpackage.hof.a(r3, r2);
        r6[r1] = r8;
        r8 = "Type mismatch for OfflineModelToRendererGenerator object. Expected=%s, Actual=%s";
        r8 = java.lang.String.format(r5, r8, r6);
        defpackage.xtl.c(r8);
    L_0x006b:
        r2 = r4;
    L_0x006c:
        if (r2 == 0) goto L_0x0073;
    L_0x006e:
        r8 = r2.a(r10, r11);
        return r8;
    L_0x0073:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hoc.a(java.lang.Class, java.lang.Class, java.lang.Object, amur):java.lang.Object");
    }

    public final akab a(eki eki, int i) {
        int i2 = i - 1;
        Class cls = eki.class;
        Class cls2 = akab.class;
        if (i != 0) {
            return (akab) a(cls, cls2, eki, amur.a("downloads_page_filter_type", Integer.valueOf(i2)));
        }
        throw null;
    }

    public final apaj b(eki eki, int i) {
        int i2 = i - 1;
        Class cls = eki.class;
        Class cls2 = apaj.class;
        if (i != 0) {
            return (apaj) a(cls, cls2, eki, amur.a("downloads_page_filter_type", Integer.valueOf(i2)));
        }
        throw null;
    }

    public final atwd c(eki eki, int i) {
        int i2 = i - 1;
        Class cls = eki.class;
        Class cls2 = atwd.class;
        if (i != 0) {
            return (atwd) a(cls, cls2, eki, amur.a("downloads_page_filter_type", Integer.valueOf(i2)));
        }
        throw null;
    }
}
