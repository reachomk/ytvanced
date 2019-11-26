package defpackage;

/* renamed from: pqd */
public final class pqd extends pkj {
    private final /* synthetic */ ptd h;
    private final /* synthetic */ long[] i;
    private final /* synthetic */ pka j;

    public pqd(pka pka, ptd ptd, ptd ptd2, long[] jArr) {
        this.j = pka;
        this.h = ptd2;
        this.i = jArr;
        super(ptd);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005e */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e A:{SYNTHETIC, Splitter:B:19:0x005e} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005e */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:2|3|4|5|6|7|8|(3:12|13|9)|26|11|14|15|16|17|22) */
    /* JADX WARNING: Missing block: B:20:?, code skipped:
            a((defpackage.pkd) a(new com.google.android.gms.common.api.Status(2100)));
     */
    /* JADX WARNING: Missing block: B:24:0x0076, code skipped:
            r11.j.c.a = null;
     */
    public final void a() {
        /*
        r11 = this;
        r0 = r11.j;
        r0 = r0.a;
        monitor-enter(r0);
        r1 = r11.j;	 Catch:{ all -> 0x007d }
        r2 = r1.c;	 Catch:{ all -> 0x007d }
        r3 = r11.h;	 Catch:{ all -> 0x007d }
        r2.a = r3;	 Catch:{ all -> 0x007d }
        r2 = 0;
        r1 = r1.b;	 Catch:{ IllegalStateException | por -> 0x005e, IllegalStateException | por -> 0x005e }
        r3 = r11.a;	 Catch:{ IllegalStateException | por -> 0x005e, IllegalStateException | por -> 0x005e }
        r4 = r11.i;	 Catch:{ IllegalStateException | por -> 0x005e, IllegalStateException | por -> 0x005e }
        r5 = new org.json.JSONObject;	 Catch:{ IllegalStateException | por -> 0x005e, IllegalStateException | por -> 0x005e }
        r5.<init>();	 Catch:{ IllegalStateException | por -> 0x005e, IllegalStateException | por -> 0x005e }
        r6 = r1.f();	 Catch:{ IllegalStateException | por -> 0x005e, IllegalStateException | por -> 0x005e }
        r8 = r1.d;	 Catch:{ IllegalStateException | por -> 0x005e, IllegalStateException | por -> 0x005e }
        r8.a(r6, r3);	 Catch:{ IllegalStateException | por -> 0x005e, IllegalStateException | por -> 0x005e }
        r3 = "requestId";
        r5.put(r3, r6);	 Catch:{ JSONException -> 0x004e }
        r3 = "type";
        r8 = "EDIT_TRACKS_INFO";
        r5.put(r3, r8);	 Catch:{ JSONException -> 0x004e }
        r3 = "mediaSessionId";
        r8 = r1.d();	 Catch:{ JSONException -> 0x004e }
        r5.put(r3, r8);	 Catch:{ JSONException -> 0x004e }
        r3 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x004e }
        r3.<init>();	 Catch:{ JSONException -> 0x004e }
        r8 = 0;
    L_0x003d:
        r9 = r4.length;	 Catch:{ JSONException -> 0x004e }
        if (r8 < r9) goto L_0x0046;
    L_0x0040:
        r4 = "activeTrackIds";
        r5.put(r4, r3);	 Catch:{ JSONException -> 0x004e }
        goto L_0x004e;
    L_0x0046:
        r9 = r4[r8];	 Catch:{ JSONException -> 0x004e }
        r3.put(r8, r9);	 Catch:{ JSONException -> 0x004e }
        r8 = r8 + 1;
        goto L_0x003d;
    L_0x004e:
        r3 = r5.toString();	 Catch:{ IllegalStateException | por -> 0x005e, IllegalStateException | por -> 0x005e }
        r1.a(r3, r6);	 Catch:{ IllegalStateException | por -> 0x005e, IllegalStateException | por -> 0x005e }
        r1 = r11.j;	 Catch:{ all -> 0x007d }
        r1 = r1.c;	 Catch:{ all -> 0x007d }
        r1.a = r2;	 Catch:{ all -> 0x007d }
        goto L_0x0074;
    L_0x005c:
        r1 = move-exception;
        goto L_0x0076;
    L_0x005e:
        r1 = new com.google.android.gms.common.api.Status;	 Catch:{ all -> 0x005c }
        r3 = 2100; // 0x834 float:2.943E-42 double:1.0375E-320;
        r1.<init>(r3);	 Catch:{ all -> 0x005c }
        r1 = r11.a(r1);	 Catch:{ all -> 0x005c }
        r1 = (defpackage.pkd) r1;	 Catch:{ all -> 0x005c }
        r11.a(r1);	 Catch:{ all -> 0x005c }
        r1 = r11.j;	 Catch:{ all -> 0x007d }
        r1 = r1.c;	 Catch:{ all -> 0x007d }
        r1.a = r2;	 Catch:{ all -> 0x007d }
    L_0x0074:
        monitor-exit(r0);	 Catch:{ all -> 0x007d }
        return;
    L_0x0076:
        r3 = r11.j;	 Catch:{ all -> 0x007d }
        r3 = r3.c;	 Catch:{ all -> 0x007d }
        r3.a = r2;	 Catch:{ all -> 0x007d }
        throw r1;	 Catch:{ all -> 0x007d }
    L_0x007d:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x007d }
        goto L_0x0081;
    L_0x0080:
        throw r1;
    L_0x0081:
        goto L_0x0080;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqd.a():void");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(psp psp) {
        a();
    }
}
