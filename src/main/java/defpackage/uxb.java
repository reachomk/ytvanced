package defpackage;

import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;

/* renamed from: uxb */
final class uxb implements Runnable {
    public final /* synthetic */ UploadPhotoEndpointOuterClass$UploadPhotoEndpoint a;
    public final /* synthetic */ uwy b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;

    uxb(uwy uwy, String str, String str2, UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint) {
        this.b = uwy;
        this.c = str;
        this.d = str2;
        this.a = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0182=Splitter:B:42:0x0182, B:50:0x019c=Splitter:B:50:0x019c} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0182=Splitter:B:42:0x0182, B:50:0x019c=Splitter:B:50:0x019c} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0182=Splitter:B:42:0x0182, B:50:0x019c=Splitter:B:50:0x019c} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x019c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0182 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:50|51|52) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:42|43|44) */
    /* JADX WARNING: Missing block: B:44:0x018b, code skipped:
            throw new defpackage.bqf(defpackage.uxe.a(200, r3, r0));
     */
    /* JADX WARNING: Missing block: B:52:0x01a1, code skipped:
            throw new defpackage.bqe();
     */
    public final void run() {
        /*
        r13 = this;
        r0 = "true";
        r1 = r13.b;	 Catch:{ Exception -> 0x0217 }
        r2 = r1.b;	 Catch:{ Exception -> 0x0217 }
        r3 = r1.af;	 Catch:{ Exception -> 0x0217 }
        r4 = r13.c;	 Catch:{ Exception -> 0x0217 }
        r5 = r13.d;	 Catch:{ Exception -> 0x0217 }
        defpackage.xak.b();	 Catch:{ Exception -> 0x0217 }
        r6 = r2.d;	 Catch:{ Exception -> 0x0217 }
        r6 = r6.a();	 Catch:{ Exception -> 0x0217 }
        if (r6 == 0) goto L_0x020f;
    L_0x0017:
        r6 = r2.b;	 Catch:{ IOException -> 0x0208 }
        r6 = r6.getContentResolver();	 Catch:{ IOException -> 0x0208 }
        r3 = defpackage.uwv.a(r6, r3);	 Catch:{ IOException -> 0x0208 }
        r9 = new azyn;	 Catch:{ Exception -> 0x0217 }
        r9.<init>();	 Catch:{ Exception -> 0x0217 }
        r6 = "Content-Type";
        r7 = "application/json-rpc; charset=utf-8";
        r9.a(r6, r7);	 Catch:{ Exception -> 0x0217 }
        r6 = "X-Goog-Upload-Header-Content-Length";
        r7 = r3.c;	 Catch:{ Exception -> 0x0217 }
        r7 = java.lang.Long.toString(r7);	 Catch:{ Exception -> 0x0217 }
        r9.a(r6, r7);	 Catch:{ Exception -> 0x0217 }
        r6 = "X-Goog-Upload-Header-Content-Type";
        r7 = "image/jpeg";
        r9.a(r6, r7);	 Catch:{ Exception -> 0x0217 }
        r6 = r2.d;	 Catch:{ Exception -> 0x0217 }
        r6 = r6.c();	 Catch:{ Exception -> 0x0217 }
        r7 = r6 instanceof defpackage.ust;	 Catch:{ Exception -> 0x0217 }
        if (r7 == 0) goto L_0x0200;
    L_0x0049:
        r7 = r2.c;	 Catch:{ Exception -> 0x0217 }
        r6 = (defpackage.ust) r6;	 Catch:{ Exception -> 0x0217 }
        r6 = r7.b(r6);	 Catch:{ Exception -> 0x0217 }
        r7 = r6.a();	 Catch:{ Exception -> 0x0217 }
        if (r7 == 0) goto L_0x01f8;
    L_0x0057:
        r6 = r6.d();	 Catch:{ Exception -> 0x0217 }
        r7 = r6.first;	 Catch:{ Exception -> 0x0217 }
        r7 = (java.lang.String) r7;	 Catch:{ Exception -> 0x0217 }
        r6 = r6.second;	 Catch:{ Exception -> 0x0217 }
        r6 = (java.lang.String) r6;	 Catch:{ Exception -> 0x0217 }
        r9.a(r7, r6);	 Catch:{ Exception -> 0x0217 }
        r6 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0217 }
        r6.<init>();	 Catch:{ Exception -> 0x0217 }
        r7 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x01f1 }
        r7.<init>();	 Catch:{ JSONException -> 0x01f1 }
        r8 = "albumId";
        r7 = r7.put(r8, r5);	 Catch:{ JSONException -> 0x01f1 }
        r8 = "autoResize";
        r7 = r7.put(r8, r0);	 Catch:{ JSONException -> 0x01f1 }
        r8 = "ownerId";
        r4 = r7.put(r8, r4);	 Catch:{ JSONException -> 0x01f1 }
        r7 = "profile";
        r5 = r5.equals(r7);	 Catch:{ JSONException -> 0x01f1 }
        if (r5 == 0) goto L_0x008f;
    L_0x008a:
        r5 = "setProfilePhoto";
        r4.put(r5, r0);	 Catch:{ JSONException -> 0x01f1 }
    L_0x008f:
        r0 = "apiVersion";
        r5 = "v2";
        r0 = r6.put(r0, r5);	 Catch:{ JSONException -> 0x01f1 }
        r5 = "id";
        r7 = "gtl_31";
        r0 = r0.put(r5, r7);	 Catch:{ JSONException -> 0x01f1 }
        r5 = "jsonrpc";
        r7 = "2.0";
        r0 = r0.put(r5, r7);	 Catch:{ JSONException -> 0x01f1 }
        r5 = "method";
        r7 = "plusi.ozinternal.uploadmedia";
        r0 = r0.put(r5, r7);	 Catch:{ JSONException -> 0x01f1 }
        r5 = "params";
        r0.put(r5, r4);	 Catch:{ JSONException -> 0x01f1 }
        r10 = new azyu;	 Catch:{ FileNotFoundException -> 0x01ea }
        r0 = new java.io.BufferedInputStream;	 Catch:{ FileNotFoundException -> 0x01ea }
        r4 = r2.b;	 Catch:{ FileNotFoundException -> 0x01ea }
        r4 = r4.getContentResolver();	 Catch:{ FileNotFoundException -> 0x01ea }
        r5 = r3.a;	 Catch:{ FileNotFoundException -> 0x01ea }
        r4 = r4.openInputStream(r5);	 Catch:{ FileNotFoundException -> 0x01ea }
        r0.<init>(r4);	 Catch:{ FileNotFoundException -> 0x01ea }
        r4 = r3.c;	 Catch:{ FileNotFoundException -> 0x01ea }
        r7 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r10.<init>(r0, r4, r7);	 Catch:{ FileNotFoundException -> 0x01ea }
        r0 = defpackage.azzn.a();	 Catch:{ Exception -> 0x0217 }
        r4 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        r0.a = r4;	 Catch:{ Exception -> 0x0217 }
        r3 = r3.b;	 Catch:{ Exception -> 0x0217 }
        r0.b = r3;	 Catch:{ Exception -> 0x0217 }
        r12 = r0.a();	 Catch:{ Exception -> 0x0217 }
        r0 = r2.e;	 Catch:{ Exception -> 0x0217 }
        r7 = "https://www.googleapis.com/upload/rpc?uploadType=resumable&prettyPrint=false";
        r8 = "POST";
        r11 = r6.toString();	 Catch:{ Exception -> 0x0217 }
        r6 = r0;
        r0 = r6.a(r7, r8, r9, r10, r11, r12);	 Catch:{ Exception -> 0x0217 }
        r2 = r0.a();	 Catch:{ ExecutionException -> 0x01c1, InterruptedException -> 0x01bc }
        r2 = r2.get();	 Catch:{ ExecutionException -> 0x01c1, InterruptedException -> 0x01bc }
        r2 = (defpackage.azzl) r2;	 Catch:{ ExecutionException -> 0x01c1, InterruptedException -> 0x01bc }
        r0 = r2.a();	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        if (r0 != 0) goto L_0x01ae;
    L_0x00fd:
        r0 = r2.b();	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        if (r0 == 0) goto L_0x01a8;
    L_0x0103:
        r0 = r2.b;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r2 = r0.a;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        if (r2 < 0) goto L_0x01a2;
    L_0x0109:
        r3 = r0.b;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r3 = defpackage.amqw.a(r3);	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r3 = (defpackage.azyn) r3;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r0 = r0.c;	 Catch:{ IOException -> 0x019c }
        if (r0 == 0) goto L_0x0196;
    L_0x0115:
        r0 = defpackage.anaz.a(r0);	 Catch:{ IOException -> 0x019c }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 != r4) goto L_0x018c;
    L_0x011d:
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0182 }
        r5 = new java.lang.String;	 Catch:{ JSONException -> 0x0182 }
        r6 = defpackage.uxe.a;	 Catch:{ JSONException -> 0x0182 }
        r5.<init>(r0, r6);	 Catch:{ JSONException -> 0x0182 }
        r2.<init>(r5);	 Catch:{ JSONException -> 0x0182 }
        r5 = "result";
        r2 = r2.getJSONObject(r5);	 Catch:{ JSONException -> 0x0182 }
        r5 = "photo";
        r2 = r2.getJSONObject(r5);	 Catch:{ JSONException -> 0x0182 }
        r5 = "original";
        r2 = r2.getJSONObject(r5);	 Catch:{ JSONException -> 0x0182 }
        r5 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0182 }
        r5.<init>();	 Catch:{ JSONException -> 0x0182 }
        r6 = "url";
        r6 = r2.getString(r6);	 Catch:{ JSONException -> 0x0182 }
        r5.append(r6);	 Catch:{ JSONException -> 0x0182 }
        r6 = "=";
        r5.append(r6);	 Catch:{ JSONException -> 0x0182 }
        r6 = "w";
        r5.append(r6);	 Catch:{ JSONException -> 0x0182 }
        r6 = "width";
        r6 = r2.getInt(r6);	 Catch:{ JSONException -> 0x0182 }
        r5.append(r6);	 Catch:{ JSONException -> 0x0182 }
        r6 = "-";
        r5.append(r6);	 Catch:{ JSONException -> 0x0182 }
        r6 = "h";
        r5.append(r6);	 Catch:{ JSONException -> 0x0182 }
        r6 = "height";
        r2 = r2.getInt(r6);	 Catch:{ JSONException -> 0x0182 }
        r5.append(r2);	 Catch:{ JSONException -> 0x0182 }
        r0 = r5.toString();	 Catch:{ JSONException -> 0x0182 }
        r1.ag = r0;	 Catch:{ Exception -> 0x0217 }
        r0 = r13.b;	 Catch:{ Exception -> 0x0217 }
        r0 = r0.Z;	 Catch:{ Exception -> 0x0217 }
        r1 = new uxa;	 Catch:{ Exception -> 0x0217 }
        r1.<init>(r13);	 Catch:{ Exception -> 0x0217 }
        r0.execute(r1);	 Catch:{ Exception -> 0x0217 }
        return;
    L_0x0182:
        r1 = new bqf;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r0 = defpackage.uxe.a(r4, r3, r0);	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r1.<init>(r0);	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        throw r1;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
    L_0x018c:
        r1 = new bql;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r0 = defpackage.uxe.a(r2, r3, r0);	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r1.<init>(r0);	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        throw r1;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
    L_0x0196:
        r0 = new bqe;	 Catch:{ IOException -> 0x019c }
        r0.<init>();	 Catch:{ IOException -> 0x019c }
        throw r0;	 Catch:{ IOException -> 0x019c }
    L_0x019c:
        r0 = new bqe;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r0.<init>();	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        throw r0;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
    L_0x01a2:
        r0 = new bqe;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r0.<init>();	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        throw r0;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
    L_0x01a8:
        r0 = new bqe;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r0.<init>();	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        throw r0;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
    L_0x01ae:
        r0 = new bqe;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r1 = r2.a;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r0.<init>(r1);	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        throw r0;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
    L_0x01b6:
        r0 = move-exception;
        goto L_0x01d8;
    L_0x01b8:
        r0 = move-exception;
        goto L_0x01de;
    L_0x01ba:
        r0 = move-exception;
        goto L_0x01e4;
    L_0x01bc:
        r1 = move-exception;
        r0.f();	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        throw r1;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
    L_0x01c1:
        r0 = move-exception;
        r1 = r0.getCause();	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        if (r1 != 0) goto L_0x01ce;
    L_0x01c8:
        r0 = new bqe;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r0.<init>();	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        throw r0;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
    L_0x01ce:
        r1 = new bqe;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r0 = r0.getCause();	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        r1.<init>(r0);	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
        throw r1;	 Catch:{ bqe -> 0x01ba, bql -> 0x01b8, bqf -> 0x01b6 }
    L_0x01d8:
        r1 = new uwz;	 Catch:{ Exception -> 0x0217 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0217 }
        throw r1;	 Catch:{ Exception -> 0x0217 }
    L_0x01de:
        r1 = new uwz;	 Catch:{ Exception -> 0x0217 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0217 }
        throw r1;	 Catch:{ Exception -> 0x0217 }
    L_0x01e4:
        r1 = new uwz;	 Catch:{ Exception -> 0x0217 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0217 }
        throw r1;	 Catch:{ Exception -> 0x0217 }
    L_0x01ea:
        r0 = move-exception;
        r1 = new uwz;	 Catch:{ Exception -> 0x0217 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0217 }
        throw r1;	 Catch:{ Exception -> 0x0217 }
    L_0x01f1:
        r0 = move-exception;
        r1 = new uwz;	 Catch:{ Exception -> 0x0217 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0217 }
        throw r1;	 Catch:{ Exception -> 0x0217 }
    L_0x01f8:
        r0 = new uwz;	 Catch:{ Exception -> 0x0217 }
        r1 = "Could not fetch auth token";
        r0.<init>(r1);	 Catch:{ Exception -> 0x0217 }
        throw r0;	 Catch:{ Exception -> 0x0217 }
    L_0x0200:
        r0 = new uwz;	 Catch:{ Exception -> 0x0217 }
        r1 = "Sign in with AccountIdentity required";
        r0.<init>(r1);	 Catch:{ Exception -> 0x0217 }
        throw r0;	 Catch:{ Exception -> 0x0217 }
    L_0x0208:
        r0 = move-exception;
        r1 = new uwz;	 Catch:{ Exception -> 0x0217 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0217 }
        throw r1;	 Catch:{ Exception -> 0x0217 }
    L_0x020f:
        r0 = new uwz;	 Catch:{ Exception -> 0x0217 }
        r1 = "Must be signed in to upload";
        r0.<init>(r1);	 Catch:{ Exception -> 0x0217 }
        throw r0;	 Catch:{ Exception -> 0x0217 }
    L_0x0217:
        r0 = move-exception;
        r1 = r13.b;
        r1 = r1.Z;
        r2 = new uxd;
        r2.<init>(r13, r0);
        r1.execute(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uxb.run():void");
    }
}
