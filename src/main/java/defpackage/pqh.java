package defpackage;

import com.google.android.gms.cast.MediaInfo;
import org.json.JSONObject;

/* renamed from: pqh */
public final class pqh extends pkj {
    private final /* synthetic */ ptd h;
    private final /* synthetic */ boolean i = true;
    private final /* synthetic */ long j;
    private final /* synthetic */ JSONObject k;
    private final /* synthetic */ MediaInfo l;
    private final /* synthetic */ pka m;

    public pqh(pka pka, ptd ptd, ptd ptd2, long j, JSONObject jSONObject, MediaInfo mediaInfo) {
        this.m = pka;
        this.h = ptd2;
        this.j = j;
        this.k = jSONObject;
        this.l = mediaInfo;
        super(ptd);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0088 */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x040f A:{Catch:{ JSONException -> 0x043d }} */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x040e A:{Catch:{ JSONException -> 0x043d }} */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0421 A:{Catch:{ JSONException -> 0x043d }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:225:0x03e8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:218:0x03dc */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x040e A:{Catch:{ JSONException -> 0x043d }} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x040f A:{Catch:{ JSONException -> 0x043d }} */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0421 A:{Catch:{ JSONException -> 0x043d }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:249:0x043d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x0260 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x0316 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:216:0x03d9 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:252:0x0446, B:262:0x045b] */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:25|26|27|28|29|30|(3:32|(2:34|(2:36|(2:38|(3:40|41|42)(1:44))(1:45))(1:46))(1:47)|43)(6:48|49|50|51|52|53)|54) */
    /* JADX WARNING: Can't wrap try/catch for region: R(18:56|55|221|225|226|227|228|229|(0)(0)|236|(0)|249|250|251|252|253|266|267) */
    /* JADX WARNING: Can't wrap try/catch for region: R(18:56|55|221|225|226|227|228|229|(0)(0)|236|(0)|249|250|251|252|253|266|267) */
    /* JADX WARNING: Can't wrap try/catch for region: R(23:74|75|76|77|78|79|(2:81|(2:83|(1:85)(1:86))(1:87))(1:88)|89|(1:91)|92|(1:94)|95|(1:97)|98|(1:100)|101|102|(2:104|(2:106|(2:108|(2:110|(2:112|113))(1:114))(1:115))(1:116))(1:117)|118|(1:120)|125|126|72) */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:144|145|146|147|148|149|150|151|152|(4:154|(4:157|158|159|160)|280|156)|161|163|164|141) */
    /* JADX WARNING: Can't wrap try/catch for region: R(29:171|172|173|174|175|176|(4:178|179|180|181)|182|(1:184)|185|(1:187)|188|(1:190)|191|(1:193)|194|(1:196)|197|(1:199)|200|(1:202)|203|(1:205)|206|(8:208|209|210|(1:212)|213|(1:215)|216|217)|218|219|220|168) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:208|209|210|(1:212)|213|(1:215)|216|217) */
    /* JADX WARNING: Missing block: B:254:0x044e, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:255:0x0450, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:268:0x047b, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:277:0x048b, code skipped:
            r0 = th;
     */
    public final void a() {
        /*
        r26 = this;
        r1 = r26;
        r2 = r1.m;
        r2 = r2.a;
        monitor-enter(r2);
        r3 = r1.m;	 Catch:{ all -> 0x0485 }
        r3 = r3.c;	 Catch:{ all -> 0x0485 }
        r4 = r1.h;	 Catch:{ all -> 0x0485 }
        r3.a = r4;	 Catch:{ all -> 0x0485 }
        r3 = new pjt;	 Catch:{ all -> 0x0485 }
        r3.<init>();	 Catch:{ all -> 0x0485 }
        r5 = r1.i;	 Catch:{ all -> 0x0485 }
        r6 = r1.j;	 Catch:{ all -> 0x0485 }
        r10 = 0;
        r3.a = r10;	 Catch:{ all -> 0x0485 }
        r4 = r1.k;	 Catch:{ all -> 0x0485 }
        r3.b = r4;	 Catch:{ all -> 0x0485 }
        r11 = new pju;	 Catch:{ all -> 0x0485 }
        r9 = r3.b;	 Catch:{ all -> 0x0485 }
        r8 = 0;
        r4 = r11;
        r4.<init>(r5, r6, r8, r9);	 Catch:{ all -> 0x0485 }
        r3 = r1.m;	 Catch:{ IllegalStateException -> 0x0457, all -> 0x0452 }
        r3 = r3.b;	 Catch:{ IllegalStateException -> 0x0457, all -> 0x0452 }
        r4 = r1.a;	 Catch:{ IllegalStateException -> 0x0457, all -> 0x0452 }
        r5 = r1.l;	 Catch:{ IllegalStateException -> 0x0457, all -> 0x0452 }
        r6 = new org.json.JSONObject;	 Catch:{ IllegalStateException -> 0x0457, all -> 0x0452 }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x0457, all -> 0x0452 }
        r7 = r3.f();	 Catch:{ IllegalStateException -> 0x0457, all -> 0x0452 }
        r9 = r3.c;	 Catch:{ IllegalStateException -> 0x0457, all -> 0x0452 }
        r9.a(r7, r4);	 Catch:{ IllegalStateException -> 0x0457, all -> 0x0452 }
        r4 = "requestId";
        r6.put(r4, r7);	 Catch:{ JSONException -> 0x043b }
        r4 = "type";
        r9 = "LOAD";
        r6.put(r4, r9);	 Catch:{ JSONException -> 0x043b }
        r4 = "media";
        r9 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x043b }
        r9.<init>();	 Catch:{ JSONException -> 0x043b }
        r15 = "contentId";
        r10 = r5.a;	 Catch:{  }
        r9.put(r15, r10);	 Catch:{  }
        r10 = r5.b;	 Catch:{  }
        r15 = 2;
        r12 = 1;
        if (r10 == r12) goto L_0x0066;
    L_0x005e:
        if (r10 == r15) goto L_0x0063;
    L_0x0060:
        r10 = "NONE";
        goto L_0x0068;
    L_0x0063:
        r10 = "LIVE";
        goto L_0x0068;
    L_0x0066:
        r10 = "BUFFERED";
    L_0x0068:
        r13 = "streamType";
        r9.put(r13, r10);	 Catch:{  }
        r10 = r5.c;	 Catch:{  }
        if (r10 == 0) goto L_0x0076;
    L_0x0071:
        r13 = "contentType";
        r9.put(r13, r10);	 Catch:{ JSONException -> 0x03e4 }
    L_0x0076:
        r10 = r5.d;	 Catch:{  }
        if (r10 == 0) goto L_0x0181;
    L_0x007a:
        r13 = "metadata";
        r14 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x017d }
        r14.<init>();	 Catch:{ JSONException -> 0x017d }
        r15 = "metadataType";
        r12 = r10.c;	 Catch:{ JSONException -> 0x0088 }
        r14.put(r15, r12);	 Catch:{ JSONException -> 0x0088 }
    L_0x0088:
        r12 = r10.a;	 Catch:{ JSONException -> 0x017d }
        defpackage.qoj.a(r14, r12);	 Catch:{ JSONException -> 0x017d }
        r12 = r10.c;	 Catch:{ JSONException -> 0x017d }
        if (r12 == 0) goto L_0x015b;
    L_0x0091:
        r15 = 1;
        if (r12 == r15) goto L_0x013b;
    L_0x0094:
        r15 = 2;
        if (r12 == r15) goto L_0x0115;
    L_0x0097:
        r24 = 6;
        r15 = 3;
        if (r12 == r15) goto L_0x00df;
    L_0x009c:
        r15 = 4;
        if (r12 == r15) goto L_0x00a9;
    L_0x009f:
        r12 = 0;
        r15 = new java.lang.String[r12];	 Catch:{ JSONException -> 0x03e4 }
        r10.a(r14, r15);	 Catch:{ JSONException -> 0x03e4 }
    L_0x00a5:
        r19 = 0;
        goto L_0x0179;
    L_0x00a9:
        r12 = 8;
        r12 = new java.lang.String[r12];	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.TITLE";
        r19 = 0;
        r12[r19] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.ARTIST";
        r23 = 1;
        r12[r23] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.LOCATION_NAME";
        r22 = 2;
        r12[r22] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
        r21 = 3;
        r12[r21] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
        r20 = 4;
        r12[r20] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.WIDTH";
        r18 = 5;
        r12[r18] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.HEIGHT";
        r12[r24] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.CREATION_DATE";
        r24 = 7;
        r12[r24] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r10.a(r14, r12);	 Catch:{ JSONException -> 0x03e4 }
        goto L_0x00a5;
    L_0x00df:
        r12 = 8;
        r12 = new java.lang.String[r12];	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.TITLE";
        r19 = 0;
        r12[r19] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.ARTIST";
        r23 = 1;
        r12[r23] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
        r22 = 2;
        r12[r22] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
        r21 = 3;
        r12[r21] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.COMPOSER";
        r20 = 4;
        r12[r20] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
        r18 = 5;
        r12[r18] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.DISC_NUMBER";
        r12[r24] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r15 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        r24 = 7;
        r12[r24] = r15;	 Catch:{ JSONException -> 0x03e4 }
        r10.a(r14, r12);	 Catch:{ JSONException -> 0x03e4 }
        goto L_0x00a5;
    L_0x0115:
        r12 = 5;
        r15 = new java.lang.String[r12];	 Catch:{ JSONException -> 0x03e4 }
        r12 = "com.google.android.gms.cast.metadata.TITLE";
        r19 = 0;
        r15[r19] = r12;	 Catch:{ JSONException -> 0x03e4 }
        r12 = "com.google.android.gms.cast.metadata.SERIES_TITLE";
        r23 = 1;
        r15[r23] = r12;	 Catch:{ JSONException -> 0x03e4 }
        r12 = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
        r22 = 2;
        r15[r22] = r12;	 Catch:{ JSONException -> 0x03e4 }
        r12 = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
        r21 = 3;
        r15[r21] = r12;	 Catch:{ JSONException -> 0x03e4 }
        r12 = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
        r20 = 4;
        r15[r20] = r12;	 Catch:{ JSONException -> 0x03e4 }
        r10.a(r14, r15);	 Catch:{ JSONException -> 0x03e4 }
        goto L_0x00a5;
    L_0x013b:
        r12 = 4;
        r15 = new java.lang.String[r12];	 Catch:{ JSONException -> 0x03e4 }
        r12 = "com.google.android.gms.cast.metadata.TITLE";
        r19 = 0;
        r15[r19] = r12;	 Catch:{ JSONException -> 0x03e4 }
        r12 = "com.google.android.gms.cast.metadata.STUDIO";
        r23 = 1;
        r15[r23] = r12;	 Catch:{ JSONException -> 0x03e4 }
        r12 = "com.google.android.gms.cast.metadata.SUBTITLE";
        r22 = 2;
        r15[r22] = r12;	 Catch:{ JSONException -> 0x03e4 }
        r12 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        r21 = 3;
        r15[r21] = r12;	 Catch:{ JSONException -> 0x03e4 }
        r10.a(r14, r15);	 Catch:{ JSONException -> 0x03e4 }
        goto L_0x00a5;
    L_0x015b:
        r12 = 4;
        r15 = new java.lang.String[r12];	 Catch:{ JSONException -> 0x017d }
        r12 = "com.google.android.gms.cast.metadata.TITLE";
        r19 = 0;
        r15[r19] = r12;	 Catch:{ JSONException -> 0x03e1 }
        r12 = "com.google.android.gms.cast.metadata.ARTIST";
        r23 = 1;
        r15[r23] = r12;	 Catch:{ JSONException -> 0x03e1 }
        r12 = "com.google.android.gms.cast.metadata.SUBTITLE";
        r22 = 2;
        r15[r22] = r12;	 Catch:{ JSONException -> 0x03e1 }
        r12 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        r21 = 3;
        r15[r21] = r12;	 Catch:{ JSONException -> 0x03e1 }
        r10.a(r14, r15);	 Catch:{ JSONException -> 0x03e1 }
    L_0x0179:
        r9.put(r13, r14);	 Catch:{ JSONException -> 0x03e1 }
        goto L_0x0183;
    L_0x017d:
        r19 = 0;
        goto L_0x03e1;
    L_0x0181:
        r19 = 0;
    L_0x0183:
        r12 = r5.e;	 Catch:{ IllegalStateException -> 0x0435, all -> 0x042f }
        r14 = -1;
        r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r10 > 0) goto L_0x0193;
    L_0x018b:
        r10 = "duration";
        r12 = org.json.JSONObject.NULL;	 Catch:{ JSONException -> 0x03e1 }
        r9.put(r10, r12);	 Catch:{ JSONException -> 0x03e1 }
        goto L_0x01a3;
    L_0x0193:
        r10 = "duration";
        r12 = (double) r12;
        java.lang.Double.isNaN(r12);
        r16 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r12 = r12 / r16;
        r9.put(r10, r12);	 Catch:{ IllegalStateException -> 0x0435, all -> 0x042f }
    L_0x01a3:
        r10 = r5.f;	 Catch:{ IllegalStateException -> 0x0435, all -> 0x042f }
        if (r10 == 0) goto L_0x0273;
    L_0x01a7:
        r10 = new org.json.JSONArray;	 Catch:{ IllegalStateException -> 0x0435, all -> 0x042f }
        r10.<init>();	 Catch:{ IllegalStateException -> 0x0435, all -> 0x042f }
        r12 = r5.f;	 Catch:{ IllegalStateException -> 0x0435, all -> 0x042f }
        r12 = r12.iterator();	 Catch:{ IllegalStateException -> 0x0435, all -> 0x042f }
    L_0x01b2:
        r13 = r12.hasNext();	 Catch:{ IllegalStateException -> 0x0435, all -> 0x042f }
        if (r13 == 0) goto L_0x026b;
    L_0x01b8:
        r13 = r12.next();	 Catch:{ IllegalStateException -> 0x0435, all -> 0x042f }
        r13 = (com.google.android.gms.cast.MediaTrack) r13;	 Catch:{ IllegalStateException -> 0x0435, all -> 0x042f }
        r14 = new org.json.JSONObject;	 Catch:{ IllegalStateException -> 0x0435, all -> 0x042f }
        r14.<init>();	 Catch:{ IllegalStateException -> 0x0435, all -> 0x042f }
        r15 = "trackId";
        r25 = r2;
        r1 = r13.a;	 Catch:{ JSONException -> 0x025f }
        r14.put(r15, r1);	 Catch:{ JSONException -> 0x025f }
        r1 = r13.b;	 Catch:{ JSONException -> 0x025f }
        r2 = 1;
        if (r1 == r2) goto L_0x01e8;
    L_0x01d1:
        r2 = 2;
        if (r1 == r2) goto L_0x01e0;
    L_0x01d4:
        r2 = 3;
        if (r1 == r2) goto L_0x01d8;
    L_0x01d7:
        goto L_0x01ef;
    L_0x01d8:
        r1 = "type";
        r2 = "VIDEO";
        r14.put(r1, r2);	 Catch:{ JSONException -> 0x025f }
        goto L_0x01ef;
    L_0x01e0:
        r1 = "type";
        r2 = "AUDIO";
        r14.put(r1, r2);	 Catch:{ JSONException -> 0x025f }
        goto L_0x01ef;
    L_0x01e8:
        r1 = "type";
        r2 = "TEXT";
        r14.put(r1, r2);	 Catch:{ JSONException -> 0x025f }
    L_0x01ef:
        r1 = r13.c;	 Catch:{ JSONException -> 0x025f }
        if (r1 == 0) goto L_0x01f8;
    L_0x01f3:
        r2 = "trackContentId";
        r14.put(r2, r1);	 Catch:{ JSONException -> 0x025f }
    L_0x01f8:
        r1 = r13.d;	 Catch:{ JSONException -> 0x025f }
        if (r1 == 0) goto L_0x0201;
    L_0x01fc:
        r2 = "trackContentType";
        r14.put(r2, r1);	 Catch:{ JSONException -> 0x025f }
    L_0x0201:
        r1 = r13.e;	 Catch:{ JSONException -> 0x025f }
        if (r1 == 0) goto L_0x020a;
    L_0x0205:
        r2 = "name";
        r14.put(r2, r1);	 Catch:{ JSONException -> 0x025f }
    L_0x020a:
        r1 = r13.f;	 Catch:{ JSONException -> 0x025f }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x025f }
        if (r1 != 0) goto L_0x0219;
    L_0x0212:
        r1 = "language";
        r2 = r13.f;	 Catch:{ JSONException -> 0x025f }
        r14.put(r1, r2);	 Catch:{ JSONException -> 0x025f }
    L_0x0219:
        r1 = r13.g;	 Catch:{ JSONException -> 0x025f }
        r2 = 1;
        if (r1 == r2) goto L_0x024b;
    L_0x021e:
        r15 = 2;
        if (r1 == r15) goto L_0x0243;
    L_0x0221:
        r2 = 3;
        if (r1 == r2) goto L_0x023b;
    L_0x0224:
        r2 = 4;
        if (r1 == r2) goto L_0x0233;
    L_0x0227:
        r2 = 5;
        if (r1 == r2) goto L_0x022b;
    L_0x022a:
        goto L_0x0253;
    L_0x022b:
        r1 = "subtype";
        r2 = "METADATA";
        r14.put(r1, r2);	 Catch:{ JSONException -> 0x0260 }
        goto L_0x0253;
    L_0x0233:
        r1 = "subtype";
        r2 = "CHAPTERS";
        r14.put(r1, r2);	 Catch:{ JSONException -> 0x0260 }
        goto L_0x0253;
    L_0x023b:
        r1 = "subtype";
        r2 = "DESCRIPTIONS";
        r14.put(r1, r2);	 Catch:{ JSONException -> 0x0260 }
        goto L_0x0253;
    L_0x0243:
        r1 = "subtype";
        r2 = "CAPTIONS";
        r14.put(r1, r2);	 Catch:{ JSONException -> 0x0260 }
        goto L_0x0253;
    L_0x024b:
        r15 = 2;
        r1 = "subtype";
        r2 = "SUBTITLES";
        r14.put(r1, r2);	 Catch:{ JSONException -> 0x0260 }
    L_0x0253:
        r1 = r13.h;	 Catch:{ JSONException -> 0x0260 }
        if (r1 == 0) goto L_0x0260;
    L_0x0257:
        r2 = "customData";
        r14.put(r2, r1);	 Catch:{ JSONException -> 0x0260 }
        goto L_0x0260;
    L_0x025d:
        r25 = r2;
    L_0x025f:
        r15 = 2;
    L_0x0260:
        r10.put(r14);	 Catch:{ JSONException -> 0x03e8 }
        r14 = -1;
        r1 = r26;
        r2 = r25;
        goto L_0x01b2;
    L_0x026b:
        r25 = r2;
        r1 = "tracks";
        r9.put(r1, r10);	 Catch:{ JSONException -> 0x03e8 }
        goto L_0x0275;
    L_0x0273:
        r25 = r2;
    L_0x0275:
        r1 = r5.g;	 Catch:{ JSONException -> 0x03e8 }
        if (r1 == 0) goto L_0x0282;
    L_0x0279:
        r2 = "textTrackStyle";
        r1 = r1.a();	 Catch:{ JSONException -> 0x03e8 }
        r9.put(r2, r1);	 Catch:{ JSONException -> 0x03e8 }
    L_0x0282:
        r1 = r5.k;	 Catch:{ JSONException -> 0x03e8 }
        if (r1 == 0) goto L_0x028b;
    L_0x0286:
        r2 = "customData";
        r9.put(r2, r1);	 Catch:{ JSONException -> 0x03e8 }
    L_0x028b:
        r1 = r5.j;	 Catch:{ JSONException -> 0x03e8 }
        if (r1 == 0) goto L_0x0294;
    L_0x028f:
        r2 = "entity";
        r9.put(r2, r1);	 Catch:{ JSONException -> 0x03e8 }
    L_0x0294:
        r1 = r5.h;	 Catch:{ JSONException -> 0x03e8 }
        if (r1 == 0) goto L_0x031c;
    L_0x0298:
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x03e8 }
        r1.<init>();	 Catch:{ JSONException -> 0x03e8 }
        r2 = r5.h;	 Catch:{ JSONException -> 0x03e8 }
        r2 = r2.iterator();	 Catch:{ JSONException -> 0x03e8 }
    L_0x02a3:
        r10 = r2.hasNext();	 Catch:{ JSONException -> 0x03e8 }
        if (r10 != 0) goto L_0x02af;
    L_0x02a9:
        r2 = "breaks";
        r9.put(r2, r1);	 Catch:{ JSONException -> 0x03e8 }
        goto L_0x031c;
    L_0x02af:
        r10 = r2.next();	 Catch:{ JSONException -> 0x03e8 }
        r10 = (defpackage.piz) r10;	 Catch:{ JSONException -> 0x03e8 }
        r12 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x03e8 }
        r12.<init>();	 Catch:{ JSONException -> 0x03e8 }
        r13 = "id";
        r14 = r10.b;	 Catch:{ JSONException -> 0x0314 }
        r12.put(r13, r14);	 Catch:{ JSONException -> 0x0314 }
        r13 = "position";
        r14 = r10.a;	 Catch:{ JSONException -> 0x0314 }
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        r16 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r14 = r14 / r16;
        r12.put(r13, r14);	 Catch:{ JSONException -> 0x0314 }
        r13 = "isWatched";
        r14 = r10.d;	 Catch:{ JSONException -> 0x0314 }
        r12.put(r13, r14);	 Catch:{ JSONException -> 0x0314 }
        r13 = "isEmbedded";
        r14 = r10.f;	 Catch:{ JSONException -> 0x0314 }
        r12.put(r13, r14);	 Catch:{ JSONException -> 0x0314 }
        r13 = "duration";
        r14 = r10.c;	 Catch:{ JSONException -> 0x0314 }
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        r16 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r14 = r14 / r16;
        r12.put(r13, r14);	 Catch:{ JSONException -> 0x0314 }
        r13 = r10.e;	 Catch:{ JSONException -> 0x0314 }
        if (r13 == 0) goto L_0x0314;
    L_0x02f7:
        r13 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0314 }
        r13.<init>();	 Catch:{ JSONException -> 0x0314 }
        r10 = r10.e;	 Catch:{ JSONException -> 0x0314 }
        r14 = r10.length;	 Catch:{ JSONException -> 0x0314 }
        r15 = 0;
    L_0x0300:
        if (r15 < r14) goto L_0x0308;
    L_0x0302:
        r10 = "breakClipIds";
        r12.put(r10, r13);	 Catch:{ JSONException -> 0x0314 }
        goto L_0x0314;
    L_0x0308:
        r18 = r2;
        r2 = r10[r15];	 Catch:{ JSONException -> 0x0316 }
        r13.put(r2);	 Catch:{ JSONException -> 0x0316 }
        r15 = r15 + 1;
        r2 = r18;
        goto L_0x0300;
    L_0x0314:
        r18 = r2;
    L_0x0316:
        r1.put(r12);	 Catch:{ JSONException -> 0x03e8 }
        r2 = r18;
        goto L_0x02a3;
    L_0x031c:
        r1 = r5.i;	 Catch:{ JSONException -> 0x03e8 }
        if (r1 == 0) goto L_0x03e8;
    L_0x0320:
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x03e8 }
        r1.<init>();	 Catch:{ JSONException -> 0x03e8 }
        r2 = r5.i;	 Catch:{ JSONException -> 0x03e8 }
        r2 = r2.iterator();	 Catch:{ JSONException -> 0x03e8 }
    L_0x032b:
        r5 = r2.hasNext();	 Catch:{ JSONException -> 0x03e8 }
        if (r5 != 0) goto L_0x0338;
    L_0x0331:
        r2 = "breakClips";
        r9.put(r2, r1);	 Catch:{ JSONException -> 0x03e8 }
        goto L_0x03e8;
    L_0x0338:
        r5 = r2.next();	 Catch:{ JSONException -> 0x03e8 }
        r5 = (defpackage.pja) r5;	 Catch:{ JSONException -> 0x03e8 }
        r10 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x03e8 }
        r10.<init>();	 Catch:{ JSONException -> 0x03e8 }
        r12 = "id";
        r13 = r5.a;	 Catch:{ JSONException -> 0x03dc }
        r10.put(r12, r13);	 Catch:{ JSONException -> 0x03dc }
        r12 = "duration";
        r13 = r5.c;	 Catch:{ JSONException -> 0x03dc }
        r13 = (double) r13;
        java.lang.Double.isNaN(r13);
        r16 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r13 = r13 / r16;
        r10.put(r12, r13);	 Catch:{ JSONException -> 0x03dc }
        r12 = r5.i;	 Catch:{ JSONException -> 0x03dc }
        r14 = -1;
        r18 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r18 == 0) goto L_0x0374;
    L_0x0364:
        r14 = "whenSkippable";
        r12 = (double) r12;
        java.lang.Double.isNaN(r12);
        r16 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r12 = r12 / r16;
        r10.put(r14, r12);	 Catch:{ JSONException -> 0x03dc }
    L_0x0374:
        r12 = r5.g;	 Catch:{ JSONException -> 0x03dc }
        if (r12 == 0) goto L_0x037d;
    L_0x0378:
        r13 = "contentId";
        r10.put(r13, r12);	 Catch:{ JSONException -> 0x03dc }
    L_0x037d:
        r12 = r5.e;	 Catch:{ JSONException -> 0x03dc }
        if (r12 == 0) goto L_0x0386;
    L_0x0381:
        r13 = "contentType";
        r10.put(r13, r12);	 Catch:{ JSONException -> 0x03dc }
    L_0x0386:
        r12 = r5.b;	 Catch:{ JSONException -> 0x03dc }
        if (r12 == 0) goto L_0x038f;
    L_0x038a:
        r13 = "title";
        r10.put(r13, r12);	 Catch:{ JSONException -> 0x03dc }
    L_0x038f:
        r12 = r5.d;	 Catch:{ JSONException -> 0x03dc }
        if (r12 == 0) goto L_0x0398;
    L_0x0393:
        r13 = "contentUrl";
        r10.put(r13, r12);	 Catch:{ JSONException -> 0x03dc }
    L_0x0398:
        r12 = r5.f;	 Catch:{ JSONException -> 0x03dc }
        if (r12 == 0) goto L_0x03a1;
    L_0x039c:
        r13 = "clickThroughUrl";
        r10.put(r13, r12);	 Catch:{ JSONException -> 0x03dc }
    L_0x03a1:
        r12 = r5.l;	 Catch:{ JSONException -> 0x03dc }
        if (r12 == 0) goto L_0x03aa;
    L_0x03a5:
        r13 = "customData";
        r10.put(r13, r12);	 Catch:{ JSONException -> 0x03dc }
    L_0x03aa:
        r12 = r5.h;	 Catch:{ JSONException -> 0x03dc }
        if (r12 == 0) goto L_0x03b3;
    L_0x03ae:
        r13 = "posterUrl";
        r10.put(r13, r12);	 Catch:{ JSONException -> 0x03dc }
    L_0x03b3:
        r12 = r5.j;	 Catch:{ JSONException -> 0x03dc }
        if (r12 == 0) goto L_0x03bc;
    L_0x03b7:
        r13 = "hlsSegmentFormat";
        r10.put(r13, r12);	 Catch:{ JSONException -> 0x03dc }
    L_0x03bc:
        r5 = r5.k;	 Catch:{ JSONException -> 0x03dc }
        if (r5 == 0) goto L_0x03dc;
    L_0x03c0:
        r12 = "vastAdsRequest";
        r13 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x03dc }
        r13.<init>();	 Catch:{ JSONException -> 0x03dc }
        r14 = r5.a;	 Catch:{ JSONException -> 0x03d9 }
        if (r14 == 0) goto L_0x03d0;
    L_0x03cb:
        r15 = "adTagUrl";
        r13.put(r15, r14);	 Catch:{ JSONException -> 0x03d9 }
    L_0x03d0:
        r5 = r5.b;	 Catch:{ JSONException -> 0x03d9 }
        if (r5 == 0) goto L_0x03d9;
    L_0x03d4:
        r14 = "adsResponse";
        r13.put(r14, r5);	 Catch:{ JSONException -> 0x03d9 }
    L_0x03d9:
        r10.put(r12, r13);	 Catch:{ JSONException -> 0x03dc }
    L_0x03dc:
        r1.put(r10);	 Catch:{ JSONException -> 0x03e8 }
        goto L_0x032b;
    L_0x03e1:
        r25 = r2;
        goto L_0x03e8;
    L_0x03e4:
        r25 = r2;
        r19 = 0;
    L_0x03e8:
        r6.put(r4, r9);	 Catch:{ JSONException -> 0x043d }
        r1 = "autoplay";
        r2 = r11.a;	 Catch:{ JSONException -> 0x043d }
        r6.put(r1, r2);	 Catch:{ JSONException -> 0x043d }
        r1 = "currentTime";
        r4 = r11.b;	 Catch:{ JSONException -> 0x043d }
        r4 = (double) r4;
        java.lang.Double.isNaN(r4);
        r9 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r4 = r4 / r9;
        r6.put(r1, r4);	 Catch:{ JSONException -> 0x043d }
        r1 = "playbackRate";
        r4 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r6.put(r1, r4);	 Catch:{ JSONException -> 0x043d }
        r1 = r11.d;	 Catch:{ JSONException -> 0x043d }
        if (r1 != 0) goto L_0x040f;
    L_0x040e:
        goto L_0x041d;
    L_0x040f:
        r2 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x043d }
        r2.<init>();	 Catch:{ JSONException -> 0x043d }
        r4 = 0;
    L_0x0415:
        r5 = r1.length;	 Catch:{ JSONException -> 0x043d }
        if (r4 < r5) goto L_0x0427;
    L_0x0418:
        r1 = "activeTrackIds";
        r6.put(r1, r2);	 Catch:{ JSONException -> 0x043d }
    L_0x041d:
        r1 = r11.e;	 Catch:{ JSONException -> 0x043d }
        if (r1 == 0) goto L_0x043d;
    L_0x0421:
        r2 = "customData";
        r6.put(r2, r1);	 Catch:{ JSONException -> 0x043d }
        goto L_0x043d;
    L_0x0427:
        r9 = r1[r4];	 Catch:{ JSONException -> 0x043d }
        r2.put(r4, r9);	 Catch:{ JSONException -> 0x043d }
        r4 = r4 + 1;
        goto L_0x0415;
    L_0x042f:
        r0 = move-exception;
        r25 = r2;
    L_0x0432:
        r1 = r26;
        goto L_0x0455;
    L_0x0435:
        r0 = move-exception;
        r25 = r2;
    L_0x0438:
        r1 = r26;
        goto L_0x045a;
    L_0x043b:
        r25 = r2;
    L_0x043d:
        r1 = r6.toString();	 Catch:{ IllegalStateException -> 0x0450, all -> 0x044e }
        r3.a(r1, r7);	 Catch:{ IllegalStateException -> 0x0450, all -> 0x044e }
        r1 = r26;
        r2 = r1.m;	 Catch:{ all -> 0x048b }
        r2 = r2.c;	 Catch:{ all -> 0x048b }
        r3 = 0;
        r2.a = r3;	 Catch:{ all -> 0x048b }
        goto L_0x0479;
    L_0x044e:
        r0 = move-exception;
        goto L_0x0432;
    L_0x0450:
        r0 = move-exception;
        goto L_0x0438;
    L_0x0452:
        r0 = move-exception;
        r25 = r2;
    L_0x0455:
        r2 = r0;
        goto L_0x047d;
    L_0x0457:
        r0 = move-exception;
        r25 = r2;
    L_0x045a:
        r2 = r0;
        r3 = "RemoteMediaPlayer";
        r4 = "load - channel error";
        android.util.Log.e(r3, r4, r2);	 Catch:{ all -> 0x047b }
        r2 = new com.google.android.gms.common.api.Status;	 Catch:{ all -> 0x047b }
        r3 = 2100; // 0x834 float:2.943E-42 double:1.0375E-320;
        r2.<init>(r3);	 Catch:{ all -> 0x047b }
        r2 = r1.a(r2);	 Catch:{ all -> 0x047b }
        r2 = (defpackage.pkd) r2;	 Catch:{ all -> 0x047b }
        r1.a(r2);	 Catch:{ all -> 0x047b }
        r2 = r1.m;	 Catch:{ all -> 0x048b }
        r2 = r2.c;	 Catch:{ all -> 0x048b }
        r3 = 0;
        r2.a = r3;	 Catch:{ all -> 0x048b }
    L_0x0479:
        monitor-exit(r25);	 Catch:{ all -> 0x048b }
        return;
    L_0x047b:
        r0 = move-exception;
        goto L_0x0455;
    L_0x047d:
        r3 = r1.m;	 Catch:{ all -> 0x048b }
        r3 = r3.c;	 Catch:{ all -> 0x048b }
        r4 = 0;
        r3.a = r4;	 Catch:{ all -> 0x048b }
        throw r2;	 Catch:{ all -> 0x048b }
    L_0x0485:
        r0 = move-exception;
        r25 = r2;
    L_0x0488:
        r2 = r0;
        monitor-exit(r25);	 Catch:{ all -> 0x048b }
        throw r2;
    L_0x048b:
        r0 = move-exception;
        goto L_0x0488;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqh.a():void");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(psp psp) {
        a();
    }
}
