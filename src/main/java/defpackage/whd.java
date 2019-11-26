package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: whd */
public final class whd {
    public whk a;
    public whj b;
    private final Context c;
    private final Executor d;
    private final Executor e;
    private final whm f;
    private final afnw g;

    public whd(Context context, Executor executor, Executor executor2, whm whm, afnw afnw) {
        this.c = context;
        this.d = executor;
        this.e = executor2;
        this.f = whm;
        this.g = afnw;
    }

    public final void a(String str, String str2, Uri uri) {
        this.d.execute(new whg(this, str, str2, uri));
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x00e3=Splitter:B:40:0x00e3, B:32:0x00c9=Splitter:B:32:0x00c9} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x00e3=Splitter:B:40:0x00e3, B:32:0x00c9=Splitter:B:32:0x00c9} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x00e3=Splitter:B:40:0x00e3, B:32:0x00c9=Splitter:B:32:0x00c9} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00e3 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:40|41|42) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:32|33|34) */
    /* JADX WARNING: Missing block: B:34:0x00d2, code skipped:
            throw new defpackage.bqf(defpackage.whm.a(200, r2, r0));
     */
    /* JADX WARNING: Missing block: B:42:0x00e8, code skipped:
            throw new defpackage.bqe();
     */
    public final void b(java.lang.String r11, java.lang.String r12, android.net.Uri r13) {
        /*
        r10 = this;
        r0 = r10.c;	 Catch:{ Exception -> 0x013f }
        r0 = r0.getContentResolver();	 Catch:{ Exception -> 0x013f }
        r0 = r0.openInputStream(r13);	 Catch:{ Exception -> 0x013f }
        r0 = defpackage.anaz.a(r0);	 Catch:{ Exception -> 0x013f }
        r1 = r10.a;	 Catch:{ Exception -> 0x013f }
        if (r1 == 0) goto L_0x0023;
    L_0x0012:
        r1 = r10.g;	 Catch:{ Exception -> 0x013f }
        r1 = r1.a(r0);	 Catch:{ Exception -> 0x013f }
        r1 = (android.graphics.drawable.Drawable) r1;	 Catch:{ Exception -> 0x013f }
        r2 = r0.length;	 Catch:{ Exception -> 0x013f }
        r3 = new whf;	 Catch:{ Exception -> 0x013f }
        r3.<init>(r10, r1, r2);	 Catch:{ Exception -> 0x013f }
        r10.a(r3);	 Catch:{ Exception -> 0x013f }
    L_0x0023:
        r1 = r10.f;	 Catch:{ Exception -> 0x013f }
        r2 = new java.io.ByteArrayInputStream;	 Catch:{ Exception -> 0x013f }
        r2.<init>(r0);	 Catch:{ Exception -> 0x013f }
        defpackage.xak.b();	 Catch:{ Exception -> 0x013f }
        r0 = r1.c;	 Catch:{ Exception -> 0x013f }
        r0 = r0.a();	 Catch:{ Exception -> 0x013f }
        if (r0 == 0) goto L_0x0137;
    L_0x0035:
        r7 = new azyu;	 Catch:{ Exception -> 0x013f }
        r0 = new java.io.BufferedInputStream;	 Catch:{ Exception -> 0x013f }
        r0.<init>(r2);	 Catch:{ Exception -> 0x013f }
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r7.<init>(r0, r2);	 Catch:{ Exception -> 0x013f }
        r6 = new azyn;	 Catch:{ Exception -> 0x013f }
        r6.<init>();	 Catch:{ Exception -> 0x013f }
        r0 = "X-YouTube-ChannelId";
        r6.a(r0, r12);	 Catch:{ Exception -> 0x013f }
        r0 = r1.c;	 Catch:{ Exception -> 0x013f }
        r0 = r0.c();	 Catch:{ Exception -> 0x013f }
        r2 = r0 instanceof defpackage.ust;	 Catch:{ Exception -> 0x013f }
        if (r2 == 0) goto L_0x012f;
    L_0x0055:
        r2 = r1.b;	 Catch:{ Exception -> 0x013f }
        r0 = (defpackage.ust) r0;	 Catch:{ Exception -> 0x013f }
        r0 = r2.b(r0);	 Catch:{ Exception -> 0x013f }
        r2 = r0.a();	 Catch:{ Exception -> 0x013f }
        if (r2 == 0) goto L_0x0127;
    L_0x0063:
        r0 = r0.d();	 Catch:{ Exception -> 0x013f }
        r2 = r0.first;	 Catch:{ Exception -> 0x013f }
        r2 = (java.lang.String) r2;	 Catch:{ Exception -> 0x013f }
        r0 = r0.second;	 Catch:{ Exception -> 0x013f }
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x013f }
        r6.a(r2, r0);	 Catch:{ Exception -> 0x013f }
        r3 = r1.d;	 Catch:{ Exception -> 0x013f }
        r5 = "POST";
        r9 = r1.e;	 Catch:{ Exception -> 0x013f }
        r8 = 0;
        r4 = r11;
        r0 = r3.a(r4, r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x013f }
        r1 = r0.a();	 Catch:{ ExecutionException -> 0x0108, InterruptedException -> 0x0103 }
        r1 = r1.get();	 Catch:{ ExecutionException -> 0x0108, InterruptedException -> 0x0103 }
        r1 = (defpackage.azzl) r1;	 Catch:{ ExecutionException -> 0x0108, InterruptedException -> 0x0103 }
        r0 = r1.a();	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        if (r0 != 0) goto L_0x00f5;
    L_0x008e:
        r0 = r1.b();	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        if (r0 == 0) goto L_0x00ef;
    L_0x0094:
        r0 = r1.b;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r1 = r0.a;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        if (r1 < 0) goto L_0x00e9;
    L_0x009a:
        r2 = r0.b;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r2 = defpackage.amqw.a(r2);	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r2 = (defpackage.azyn) r2;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r0 = r0.c;	 Catch:{ IOException -> 0x00e3 }
        if (r0 == 0) goto L_0x00dd;
    L_0x00a6:
        r0 = defpackage.anaz.a(r0);	 Catch:{ IOException -> 0x00e3 }
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 != r3) goto L_0x00d3;
    L_0x00ae:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00c9 }
        r4 = new java.lang.String;	 Catch:{ JSONException -> 0x00c9 }
        r5 = defpackage.whm.a;	 Catch:{ JSONException -> 0x00c9 }
        r4.<init>(r0, r5);	 Catch:{ JSONException -> 0x00c9 }
        r1.<init>(r4);	 Catch:{ JSONException -> 0x00c9 }
        r4 = "encryptedBlobId";
        r0 = r1.getString(r4);	 Catch:{ JSONException -> 0x00c9 }
        r1 = new whi;	 Catch:{ Exception -> 0x013f }
        r1.<init>(r10, r0);	 Catch:{ Exception -> 0x013f }
        r10.a(r1);	 Catch:{ Exception -> 0x013f }
        return;
    L_0x00c9:
        r1 = new bqf;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r0 = defpackage.whm.a(r3, r2, r0);	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r1.<init>(r0);	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        throw r1;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
    L_0x00d3:
        r3 = new bql;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r0 = defpackage.whm.a(r1, r2, r0);	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r3.<init>(r0);	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        throw r3;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
    L_0x00dd:
        r0 = new bqe;	 Catch:{ IOException -> 0x00e3 }
        r0.<init>();	 Catch:{ IOException -> 0x00e3 }
        throw r0;	 Catch:{ IOException -> 0x00e3 }
    L_0x00e3:
        r0 = new bqe;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r0.<init>();	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        throw r0;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
    L_0x00e9:
        r0 = new bqe;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r0.<init>();	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        throw r0;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
    L_0x00ef:
        r0 = new bqe;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r0.<init>();	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        throw r0;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
    L_0x00f5:
        r0 = new bqe;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r1 = r1.a;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r0.<init>(r1);	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        throw r0;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
        goto L_0x011f;
    L_0x00ff:
        r0 = move-exception;
        goto L_0x011f;
    L_0x0101:
        r0 = move-exception;
        goto L_0x011f;
    L_0x0103:
        r1 = move-exception;
        r0.f();	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        throw r1;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
    L_0x0108:
        r0 = move-exception;
        r1 = r0.getCause();	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        if (r1 != 0) goto L_0x0115;
    L_0x010f:
        r0 = new bqe;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r0.<init>();	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        throw r0;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
    L_0x0115:
        r1 = new bqe;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r0 = r0.getCause();	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        r1.<init>(r0);	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
        throw r1;	 Catch:{ bqe -> 0x0101, bql -> 0x00ff, bqf -> 0x00fd }
    L_0x011f:
        r1 = new whl;	 Catch:{ Exception -> 0x013f }
        r2 = "Error occured in the image data upload";
        r1.<init>(r2, r0);	 Catch:{ Exception -> 0x013f }
        throw r1;	 Catch:{ Exception -> 0x013f }
    L_0x0127:
        r0 = new whl;	 Catch:{ Exception -> 0x013f }
        r1 = "Could not fetch auth token";
        r0.<init>(r1);	 Catch:{ Exception -> 0x013f }
        throw r0;	 Catch:{ Exception -> 0x013f }
    L_0x012f:
        r0 = new whl;	 Catch:{ Exception -> 0x013f }
        r1 = "AccountIdentity is required";
        r0.<init>(r1);	 Catch:{ Exception -> 0x013f }
        throw r0;	 Catch:{ Exception -> 0x013f }
    L_0x0137:
        r0 = new whl;	 Catch:{ Exception -> 0x013f }
        r1 = "Must be signed in to upload";
        r0.<init>(r1);	 Catch:{ Exception -> 0x013f }
        throw r0;	 Catch:{ Exception -> 0x013f }
    L_0x013f:
        r0 = new whj;
        r0.<init>(r11, r12, r13);
        r10.b = r0;
        r11 = new whh;
        r11.<init>(r10);
        r10.a(r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whd.b(java.lang.String, java.lang.String, android.net.Uri):void");
    }

    private final void a(Runnable runnable) {
        if (this.a != null) {
            this.e.execute(runnable);
        }
    }
}
