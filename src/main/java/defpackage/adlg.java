package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: adlg */
public final class adlg implements adku {
    private static final String a = xtl.b("MDX.MdxPlaylistNotificationRendererPresenter");
    private final int b;
    private final bcaa c;
    private final abdf d;
    private final adbz e;
    private final akkq f;
    private final aeaz g;
    private final Context h;
    private final qk i;
    private final adkn j;
    private final adkl k;
    private final adhn l;
    private final Executor m;
    private final Handler n = new Handler(Looper.getMainLooper());

    public adlg(int i, bcaa bcaa, abdf abdf, adbz adbz, aeaz aeaz, Context context, akkq akkq, qk qkVar, adkn adkn, adkl adkl, adhn adhn, Executor executor) {
        this.b = i;
        this.c = bcaa;
        this.d = abdf;
        this.e = adbz;
        this.g = aeaz;
        this.h = context;
        this.f = akkq;
        this.i = qkVar;
        this.j = adkn;
        this.k = adkl;
        this.l = adhn;
        this.m = executor;
    }

    public final void a() {
        this.i.a("local-notifications", 6);
    }

    public final void a(bbs bbs, adkt adkt) {
        this.m.execute(new adlf(this, bbs, adkt));
    }

    public final Bitmap a(Bitmap bitmap, int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        }
        bitmap = BitmapFactory.decodeResource(this.h.getResources(), i3);
        double width = (double) (createBitmap.getWidth() - bitmap.getWidth());
        Double.isNaN(width);
        float max = Math.max(0.0f, (float) (width * 0.5d));
        width = (double) (createBitmap.getHeight() - bitmap.getHeight());
        Double.isNaN(width);
        canvas.drawBitmap(bitmap, max, Math.max(0.0f, (float) (width * 0.5d)), null);
        return createBitmap;
    }

    /* Access modifiers changed, original: final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x047a  */
    /* JADX WARNING: Missing block: B:108:0x01cb, code skipped:
            if ((r1.a & 8) != 0) goto L_0x01cd;
     */
    /* JADX WARNING: Missing block: B:141:0x0234, code skipped:
            if ((r1.a & 8) != 0) goto L_0x0236;
     */
    public final /* synthetic */ void b(defpackage.bbs r28, defpackage.adkt r29) {
        /*
        r27 = this;
        r7 = r27;
        r8 = r28;
        r9 = r29;
        r0 = r8.d;
        r1 = defpackage.aswf.g;
        r1 = r1.createBuilder();
        r1 = (defpackage.aswi) r1;
        r2 = r7.e;
        r2 = r2.a;
        r2.a();
        r3 = defpackage.aurg.e;
        r3 = r3.createBuilder();
        r3 = (defpackage.auri) r3;
        r3.a(r0);
        r2.a(r3);
        r0 = r2.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aurc) r0;
        r1.a(r0);
        r1.copyOnWrite();
        r0 = r1.instance;
        r0 = (defpackage.aswf) r0;
        r2 = r0.a;
        r2 = r2 | 4;
        r0.a = r2;
        r10 = 1;
        r0.d = r10;
        r0 = r7.d;
        r2 = 2;
        r11 = 0;
        r3 = r0.b;	 Catch:{ aanq -> 0x005a }
        r4 = new abdc;	 Catch:{ aanq -> 0x005a }
        r5 = r0.c;	 Catch:{ aanq -> 0x005a }
        r0 = r0.d;	 Catch:{ aanq -> 0x005a }
        r0 = r0.c();	 Catch:{ aanq -> 0x005a }
        r4.<init>(r5, r0, r1);	 Catch:{ aanq -> 0x005a }
        r0 = r3.b(r4);	 Catch:{ aanq -> 0x005a }
        r0 = (defpackage.aswh) r0;	 Catch:{ aanq -> 0x005a }
        goto L_0x006a;
    L_0x005a:
        r0 = move-exception;
        r1 = defpackage.abdf.a;
        r3 = "Error in sending GetMdxNotificationsRequest.";
        defpackage.xtl.a(r1, r3, r0);
        r1 = defpackage.afpf.mdx;
        r3 = "GetMdxNotificationsRequest error.";
        defpackage.afpc.a(r2, r1, r3, r0);
        r0 = r11;
    L_0x006a:
        if (r0 != 0) goto L_0x0076;
    L_0x006c:
        r0 = a;
        r1 = "Error sending GetMdxNotifications request.";
        defpackage.xtl.b(r0, r1);
    L_0x0073:
        r1 = r11;
        goto L_0x0478;
    L_0x0076:
        r1 = r0.c;
        if (r1 == 0) goto L_0x007b;
    L_0x007a:
        goto L_0x007d;
    L_0x007b:
        r1 = defpackage.axak.a;
    L_0x007d:
        r3 = com.google.protos.youtube.api.innertube.MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer.mdxPlaylistAndroidNotificationRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r1 = r1.h;
        r3 = r3.d;
        r1 = r1.a(r3);
        if (r1 != 0) goto L_0x0098;
    L_0x0090:
        r0 = a;
        r1 = "Notification renderer was not filled.";
        defpackage.xtl.b(r0, r1);
        goto L_0x0073;
    L_0x0098:
        r0 = r0.c;
        if (r0 == 0) goto L_0x009d;
    L_0x009c:
        goto L_0x009f;
    L_0x009d:
        r0 = defpackage.axak.a;
    L_0x009f:
        r1 = com.google.protos.youtube.api.innertube.MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer.mdxPlaylistAndroidNotificationRenderer;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r3 = r1.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x00b5;
    L_0x00b2:
        r0 = r1.b;
        goto L_0x00b9;
    L_0x00b5:
        r0 = r1.a(r0);
    L_0x00b9:
        r0 = (com.google.protos.youtube.api.innertube.MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer) r0;
        r1 = r0.a;
        r1 = r1 & r10;
        if (r1 == 0) goto L_0x046f;
    L_0x00c0:
        r1 = r0.d;
        if (r1 != 0) goto L_0x00c6;
    L_0x00c4:
        r1 = defpackage.apxu.d;
    L_0x00c6:
        r3 = com.google.protos.youtube.api.innertube.MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.mdxPlaybackEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r1 = r1.h;
        r4 = r3.d;
        r1 = r1.b(r4);
        if (r1 != 0) goto L_0x00dc;
    L_0x00d9:
        r1 = r3.b;
        goto L_0x00e0;
    L_0x00dc:
        r1 = r3.a(r1);
    L_0x00e0:
        r1 = (com.google.protos.youtube.api.innertube.MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint) r1;
        r1 = r1.a;
        r1 = r1 & r10;
        if (r1 != 0) goto L_0x00ef;
    L_0x00e7:
        r0 = a;
        r1 = "Mdx playback endpoint not filled";
        defpackage.xtl.b(r0, r1);
        goto L_0x0073;
    L_0x00ef:
        r1 = r0.d;
        if (r1 != 0) goto L_0x00f5;
    L_0x00f3:
        r1 = defpackage.apxu.d;
    L_0x00f5:
        r3 = com.google.protos.youtube.api.innertube.MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.mdxPlaybackEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r1 = r1.h;
        r4 = r3.d;
        r1 = r1.b(r4);
        if (r1 != 0) goto L_0x010b;
    L_0x0108:
        r1 = r3.b;
        goto L_0x010f;
    L_0x010b:
        r1 = r3.a(r1);
    L_0x010f:
        r1 = (com.google.protos.youtube.api.innertube.MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint) r1;
        r1 = r1.b;
        if (r1 != 0) goto L_0x0117;
    L_0x0115:
        r1 = defpackage.autt.i;
    L_0x0117:
        r13 = defpackage.adpw.a(r1);
        r14 = new adjn;
        r14.<init>();
        r1 = r0.b;
        if (r1 != 0) goto L_0x0126;
    L_0x0124:
        r1 = defpackage.autv.f;
    L_0x0126:
        r1 = r1.a;
        r1 = r1 & r10;
        if (r1 != 0) goto L_0x012d;
    L_0x012b:
        r1 = r11;
        goto L_0x0139;
    L_0x012d:
        r1 = r0.b;
        if (r1 != 0) goto L_0x0133;
    L_0x0131:
        r1 = defpackage.autv.f;
    L_0x0133:
        r1 = r1.b;
        if (r1 != 0) goto L_0x0139;
    L_0x0137:
        r1 = defpackage.arml.f;
    L_0x0139:
        r1 = defpackage.ajqy.a(r1);
        r3 = "Null contentTitle";
        if (r1 == 0) goto L_0x0469;
    L_0x0141:
        r14.a = r1;
        r1 = r0.b;
        if (r1 != 0) goto L_0x0149;
    L_0x0147:
        r1 = defpackage.autv.f;
    L_0x0149:
        r1 = r1.a;
        r1 = r1 & r2;
        if (r1 != 0) goto L_0x0150;
    L_0x014e:
        r1 = r11;
        goto L_0x015c;
    L_0x0150:
        r1 = r0.b;
        if (r1 != 0) goto L_0x0156;
    L_0x0154:
        r1 = defpackage.autv.f;
    L_0x0156:
        r1 = r1.c;
        if (r1 != 0) goto L_0x015c;
    L_0x015a:
        r1 = defpackage.arml.f;
    L_0x015c:
        r1 = defpackage.ajqy.a(r1);
        r14.b = r1;
        r1 = r0.a;
        r1 = r1 & r2;
        if (r1 != 0) goto L_0x0169;
    L_0x0167:
        r15 = r11;
        goto L_0x01af;
    L_0x0169:
        r1 = new adjh;
        r1.<init>();
        r4 = r0.c;
        if (r4 != 0) goto L_0x0174;
    L_0x0172:
        r4 = defpackage.autw.h;
    L_0x0174:
        r4 = r4.a;
        r4 = r4 & r10;
        if (r4 != 0) goto L_0x017b;
    L_0x0179:
        r4 = r11;
        goto L_0x0187;
    L_0x017b:
        r4 = r0.c;
        if (r4 != 0) goto L_0x0181;
    L_0x017f:
        r4 = defpackage.autw.h;
    L_0x0181:
        r4 = r4.b;
        if (r4 != 0) goto L_0x0187;
    L_0x0185:
        r4 = defpackage.arml.f;
    L_0x0187:
        r4 = defpackage.ajqy.a(r4);
        if (r4 == 0) goto L_0x0463;
    L_0x018d:
        r1.a = r4;
        r3 = r0.c;
        if (r3 != 0) goto L_0x0195;
    L_0x0193:
        r3 = defpackage.autw.h;
    L_0x0195:
        r3 = r3.a;
        r3 = r3 & r2;
        if (r3 != 0) goto L_0x019c;
    L_0x019a:
        r3 = r11;
        goto L_0x01a8;
    L_0x019c:
        r3 = r0.c;
        if (r3 != 0) goto L_0x01a2;
    L_0x01a0:
        r3 = defpackage.autw.h;
    L_0x01a2:
        r3 = r3.c;
        if (r3 != 0) goto L_0x01a8;
    L_0x01a6:
        r3 = defpackage.arml.f;
    L_0x01a8:
        r3 = defpackage.ajqy.a(r3);
        r1.b = r3;
        r15 = r1;
    L_0x01af:
        r6 = new java.util.ArrayList;
        r6.<init>();
        r1 = r0.b;
        if (r1 != 0) goto L_0x01ba;
    L_0x01b8:
        r1 = defpackage.autv.f;
    L_0x01ba:
        r1 = r1.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x01c1;
    L_0x01c0:
        goto L_0x01cd;
    L_0x01c1:
        r1 = r0.b;
        if (r1 != 0) goto L_0x01c7;
    L_0x01c5:
        r1 = defpackage.autv.f;
    L_0x01c7:
        r1 = r1.a;
        r1 = r1 & 8;
        if (r1 == 0) goto L_0x0214;
    L_0x01cd:
        r1 = new aaft;
        r3 = r0.b;
        if (r3 != 0) goto L_0x01d5;
    L_0x01d3:
        r3 = defpackage.autv.f;
    L_0x01d5:
        r3 = r3.d;
        if (r3 != 0) goto L_0x01db;
    L_0x01d9:
        r3 = defpackage.aygk.f;
    L_0x01db:
        r1.<init>(r3);
        r3 = r0.b;
        if (r3 != 0) goto L_0x01e4;
    L_0x01e2:
        r3 = defpackage.autv.f;
    L_0x01e4:
        r3 = r3.a;
        r3 = r3 & 8;
        if (r3 != 0) goto L_0x01ed;
    L_0x01ea:
        r20 = r11;
        goto L_0x01fc;
    L_0x01ed:
        r3 = r0.b;
        if (r3 != 0) goto L_0x01f3;
    L_0x01f1:
        r3 = defpackage.autv.f;
    L_0x01f3:
        r3 = r3.e;
        if (r3 == 0) goto L_0x01f8;
    L_0x01f7:
        goto L_0x01fa;
    L_0x01f8:
        r3 = defpackage.arwf.c;
    L_0x01fa:
        r20 = r3;
    L_0x01fc:
        r3 = new adlk;
        r3.<init>(r14);
        r17 = 2131625963; // 0x7f0e07eb float:1.8879149E38 double:1.053163158E-314;
        r18 = 2131625962; // 0x7f0e07ea float:1.8879147E38 double:1.0531631576E-314;
        r19 = 0;
        r16 = r1;
        r21 = r3;
        r1 = defpackage.adlp.a(r16, r17, r18, r19, r20, r21);
        r6.add(r1);
    L_0x0214:
        r1 = r0.a;
        r1 = r1 & r2;
        if (r1 != 0) goto L_0x021b;
    L_0x0219:
        goto L_0x02d0;
    L_0x021b:
        if (r15 == 0) goto L_0x02d0;
    L_0x021d:
        r1 = r0.c;
        if (r1 != 0) goto L_0x0223;
    L_0x0221:
        r1 = defpackage.autw.h;
    L_0x0223:
        r1 = r1.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x022a;
    L_0x0229:
        goto L_0x0236;
    L_0x022a:
        r1 = r0.c;
        if (r1 != 0) goto L_0x0230;
    L_0x022e:
        r1 = defpackage.autw.h;
    L_0x0230:
        r1 = r1.a;
        r1 = r1 & 8;
        if (r1 == 0) goto L_0x027d;
    L_0x0236:
        r1 = new aaft;
        r2 = r0.c;
        if (r2 != 0) goto L_0x023e;
    L_0x023c:
        r2 = defpackage.autw.h;
    L_0x023e:
        r2 = r2.d;
        if (r2 != 0) goto L_0x0244;
    L_0x0242:
        r2 = defpackage.aygk.f;
    L_0x0244:
        r1.<init>(r2);
        r2 = r0.c;
        if (r2 != 0) goto L_0x024d;
    L_0x024b:
        r2 = defpackage.autw.h;
    L_0x024d:
        r2 = r2.a;
        r2 = r2 & 8;
        if (r2 != 0) goto L_0x0256;
    L_0x0253:
        r20 = r11;
        goto L_0x0265;
    L_0x0256:
        r2 = r0.c;
        if (r2 != 0) goto L_0x025c;
    L_0x025a:
        r2 = defpackage.autw.h;
    L_0x025c:
        r2 = r2.e;
        if (r2 == 0) goto L_0x0261;
    L_0x0260:
        goto L_0x0263;
    L_0x0261:
        r2 = defpackage.arwf.c;
    L_0x0263:
        r20 = r2;
    L_0x0265:
        r2 = new adlj;
        r2.<init>(r15);
        r17 = 2131625963; // 0x7f0e07eb float:1.8879149E38 double:1.053163158E-314;
        r18 = 2131625962; // 0x7f0e07ea float:1.8879147E38 double:1.0531631576E-314;
        r19 = 0;
        r16 = r1;
        r21 = r2;
        r1 = defpackage.adlp.a(r16, r17, r18, r19, r20, r21);
        r6.add(r1);
    L_0x027d:
        r1 = r0.c;
        if (r1 != 0) goto L_0x0283;
    L_0x0281:
        r1 = defpackage.autw.h;
    L_0x0283:
        r1 = r1.a;
        r1 = r1 & 16;
        if (r1 == 0) goto L_0x02d0;
    L_0x0289:
        r1 = new aaft;
        r2 = r0.c;
        if (r2 != 0) goto L_0x0291;
    L_0x028f:
        r2 = defpackage.autw.h;
    L_0x0291:
        r2 = r2.f;
        if (r2 != 0) goto L_0x0297;
    L_0x0295:
        r2 = defpackage.aygk.f;
    L_0x0297:
        r1.<init>(r2);
        r2 = r0.c;
        if (r2 != 0) goto L_0x02a0;
    L_0x029e:
        r2 = defpackage.autw.h;
    L_0x02a0:
        r2 = r2.a;
        r2 = r2 & 32;
        if (r2 == 0) goto L_0x02b6;
    L_0x02a6:
        r0 = r0.c;
        if (r0 != 0) goto L_0x02ac;
    L_0x02aa:
        r0 = defpackage.autw.h;
    L_0x02ac:
        r0 = r0.g;
        if (r0 == 0) goto L_0x02b3;
    L_0x02b0:
        r20 = r0;
        goto L_0x02b8;
    L_0x02b3:
        r0 = defpackage.arwf.c;
        goto L_0x02b0;
    L_0x02b6:
        r20 = r11;
    L_0x02b8:
        r0 = new adlm;
        r0.<init>(r15);
        r17 = 2131625943; // 0x7f0e07d7 float:1.8879108E38 double:1.053163148E-314;
        r18 = 2131625942; // 0x7f0e07d6 float:1.8879106E38 double:1.0531631477E-314;
        r19 = 1;
        r16 = r1;
        r21 = r0;
        r0 = defpackage.adlp.a(r16, r17, r18, r19, r20, r21);
        r6.add(r0);
    L_0x02d0:
        r0 = r6.isEmpty();
        if (r0 != 0) goto L_0x03ef;
    L_0x02d6:
        r0 = new java.util.concurrent.CountDownLatch;
        r1 = r6.size();
        r0.<init>(r1);
        r5 = r6.size();
        r4 = 0;
    L_0x02e4:
        if (r4 >= r5) goto L_0x03df;
    L_0x02e6:
        r1 = r6.get(r4);
        r3 = r1;
        r3 = (defpackage.adlp) r3;
        r1 = r3.e();
        if (r1 == 0) goto L_0x0309;
    L_0x02f3:
        r1 = r7.g;
        r2 = r3.e();
        r2 = r2.b;
        r2 = defpackage.arwh.a(r2);
        if (r2 != 0) goto L_0x0303;
    L_0x0301:
        r2 = defpackage.arwh.UNKNOWN;
    L_0x0303:
        r1 = r1.a(r2);
        r2 = r1;
        goto L_0x030a;
    L_0x0309:
        r2 = 0;
    L_0x030a:
        if (r2 == 0) goto L_0x030f;
    L_0x030c:
        r16 = 1;
        goto L_0x0311;
    L_0x030f:
        r16 = 0;
    L_0x0311:
        if (r16 == 0) goto L_0x0327;
    L_0x0313:
        r1 = r3.a();
        if (r1 == 0) goto L_0x0327;
    L_0x0319:
        r1 = r3.a();
        r1 = r1.a();
        if (r1 != 0) goto L_0x0324;
    L_0x0323:
        goto L_0x0327;
    L_0x0324:
        r20 = 1;
        goto L_0x0329;
    L_0x0327:
        r20 = 0;
    L_0x0329:
        r1 = r3.a();
        if (r1 == 0) goto L_0x0339;
    L_0x032f:
        r1 = r3.a();
        r1 = r1.a();
        if (r1 != 0) goto L_0x036d;
    L_0x0339:
        r1 = r3.e();
        if (r1 == 0) goto L_0x036d;
    L_0x033f:
        r1 = r7.h;
        r1 = r1.getResources();
        r12 = r3.b();
        r1 = r1.getDimensionPixelSize(r12);
        r12 = r7.h;
        r12 = r12.getResources();
        r10 = r3.c();
        r10 = r12.getDimensionPixelSize(r10);
        r1 = r7.a(r11, r1, r10, r2);
        r2 = r3.f();
        r2.a(r3, r1);
        r16 = r4;
        r12 = r5;
        r26 = r6;
        goto L_0x03d7;
    L_0x036d:
        r10 = r7.h;
        r24 = new adll;
        r1 = r24;
        r12 = r2;
        r2 = r27;
        r17 = r3;
        r3 = r16;
        r16 = r4;
        r4 = r12;
        r12 = r5;
        r5 = r17;
        r26 = r6;
        r6 = r0;
        r1.<init>(r2, r3, r4, r5, r6);
        r1 = r10.getResources();
        r2 = r17.b();
        r1 = r1.getDimensionPixelSize(r2);
        r2 = r10.getResources();
        r3 = r17.c();
        r2 = r2.getDimensionPixelSize(r3);
        r3 = r17.a();
        r3 = r3.a(r1, r2);
        if (r3 == 0) goto L_0x03d7;
    L_0x03a8:
        r4 = android.graphics.Bitmap.Config.ARGB_8888;
        r4 = android.graphics.Bitmap.createBitmap(r1, r2, r4);
        r5 = new android.graphics.Canvas;
        r5.<init>(r4);
        r21 = new android.graphics.Paint;
        r21.<init>();
        r6 = 2131558955; // 0x7f0d022b float:1.874324E38 double:1.0531300518E-314;
        r22 = defpackage.ra.c(r10, r6);
        r6 = new adlo;
        r17 = r6;
        r18 = r1;
        r19 = r2;
        r23 = r5;
        r25 = r4;
        r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25);
        r1 = r7.f;
        r2 = r3.a();
        r1.b(r2, r6);
    L_0x03d7:
        r4 = r16 + 1;
        r5 = r12;
        r6 = r26;
        r10 = 1;
        goto L_0x02e4;
    L_0x03df:
        r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x03e7 }
        r2 = 10;
        r0.await(r2, r1);	 Catch:{ InterruptedException -> 0x03e7 }
        goto L_0x03ef;
    L_0x03e7:
        r0 = move-exception;
        r1 = a;
        r2 = "Timed out downloading thumbnails.";
        defpackage.xtl.b(r1, r2, r0);
    L_0x03ef:
        r0 = "Missing required properties:";
        r1 = " contentTitle";
        r2 = "";
        if (r15 == 0) goto L_0x042c;
    L_0x03f7:
        r3 = r15.a;
        if (r3 != 0) goto L_0x0400;
    L_0x03fb:
        r3 = r2.concat(r1);
        goto L_0x0401;
    L_0x0400:
        r3 = r2;
    L_0x0401:
        r4 = r3.isEmpty();
        if (r4 != 0) goto L_0x041d;
    L_0x0407:
        r1 = new java.lang.IllegalStateException;
        r2 = r3.length();
        if (r2 != 0) goto L_0x0415;
    L_0x040f:
        r2 = new java.lang.String;
        r2.<init>(r0);
        goto L_0x0419;
    L_0x0415:
        r2 = r0.concat(r3);
    L_0x0419:
        r1.<init>(r2);
        throw r1;
    L_0x041d:
        r3 = new adji;
        r4 = r15.a;
        r5 = r15.b;
        r6 = r15.c;
        r10 = r15.d;
        r3.<init>(r4, r5, r6, r10);
        r14.d = r3;
    L_0x042c:
        r3 = r14.a;
        if (r3 != 0) goto L_0x0434;
    L_0x0430:
        r2 = r2.concat(r1);
    L_0x0434:
        r1 = r2.isEmpty();
        if (r1 != 0) goto L_0x0450;
    L_0x043a:
        r1 = new java.lang.IllegalStateException;
        r3 = r2.length();
        if (r3 != 0) goto L_0x0448;
    L_0x0442:
        r2 = new java.lang.String;
        r2.<init>(r0);
        goto L_0x044c;
    L_0x0448:
        r2 = r0.concat(r2);
    L_0x044c:
        r1.<init>(r2);
        throw r1;
    L_0x0450:
        r0 = new adjo;
        r1 = r14.a;
        r2 = r14.b;
        r3 = r14.c;
        r4 = r14.d;
        r0.<init>(r1, r2, r3, r4);
        r1 = new adjm;
        r1.<init>(r0, r13);
        goto L_0x0478;
    L_0x0463:
        r0 = new java.lang.NullPointerException;
        r0.<init>(r3);
        throw r0;
    L_0x0469:
        r0 = new java.lang.NullPointerException;
        r0.<init>(r3);
        throw r0;
    L_0x046f:
        r0 = a;
        r1 = "Basic notification data is null.";
        defpackage.xtl.b(r0, r1);
        goto L_0x0073;
    L_0x0478:
        if (r1 == 0) goto L_0x05bd;
    L_0x047a:
        r0 = r1.a;
        r2 = r7.j;
        r3 = r7.k;
        r3 = r3.b();
        r4 = r2.g;
        if (r3 != 0) goto L_0x048b;
    L_0x0488:
        r3 = defpackage.adkn.b;
        goto L_0x048d;
    L_0x048b:
        r3 = defpackage.adkn.c;
    L_0x048d:
        r4.a(r3, r11, r11);
        r3 = r2.g;
        r4 = defpackage.adkn.d;
        r3.b(r4, r11);
        r3 = r2.g;
        r4 = defpackage.adkn.e;
        r3.b(r4, r11);
        r2 = r2.g;
        r2 = r2.c();
        r3 = new qg;
        r4 = r7.h;
        r3.<init>(r4);
        r3.c();
        r4 = r7.h;
        r5 = 2131558540; // 0x7f0d008c float:1.8742399E38 double:1.0531298467E-314;
        r4 = defpackage.ra.c(r4, r5);
        r3.t = r4;
        r4 = r7.b;
        r3.a(r4);
        r4 = r0.c();
        r3.a(r4);
        r4 = r0.a();
        r3.a(r4);
        r4 = r0.b();
        r3.b(r4);
        r4 = r7.c;
        r4 = r4.get();
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        r5 = 1;
        r4 = r4 ^ r5;
        r3.b(r4);
        r4 = new qf;
        r5 = r7.h;
        r5 = r5.getResources();
        r6 = 2131953744; // 0x7f130850 float:1.9543968E38 double:1.0533251034E-314;
        r5 = r5.getString(r6);
        r6 = new android.content.Intent;
        r10 = r7.h;
        r11 = com.google.android.libraries.youtube.mdx.notification.LocalNotificationsBroadcastReceiver.class;
        r6.<init>(r10, r11);
        r10 = "com.google.android.libraries.youtube.mdx.background.actions.TURN_OFF";
        r6.setAction(r10);
        r10 = "INTERACTION_SCREEN";
        r6.putExtra(r10, r2);
        r11 = r7.h;
        r12 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r13 = 0;
        r6 = android.app.PendingIntent.getBroadcast(r11, r13, r6, r12);
        r4.<init>(r13, r5, r6);
        r4 = r4.a();
        r3.a(r4);
        r1 = r1.b;
        r4 = defpackage.aczq.g();
        r5 = r8.d;
        r4 = r4.b(r5);
        r5 = r8.c;
        r4 = r4.a(r5);
        r5 = r7.l;
        r5 = r5.e(r8);
        r4 = r4.b(r5);
        r1 = r4.a(r1);
        r1 = r1.a();
        r4 = com.google.android.libraries.youtube.mdx.notification.LocalNotificationsBroadcastReceiver.class;
        r5 = r7.h;
        r6 = defpackage.adkn.d;
        r1 = com.google.android.libraries.youtube.mdx.background.MdxBackgroundPlaybackBroadcastReceiver.a(r4, r5, r1, r2, r6);
        r4 = "com.google.android.libraries.youtube.mdx.background.actions.PLAY";
        r1.setAction(r4);
        r4 = r7.h;
        r5 = 0;
        r1 = android.app.PendingIntent.getBroadcast(r4, r5, r1, r12);
        r3.f = r1;
        r1 = new android.content.Intent;
        r4 = r7.h;
        r6 = com.google.android.libraries.youtube.mdx.notification.LocalNotificationsBroadcastReceiver.class;
        r1.<init>(r4, r6);
        r4 = "com.google.android.libraries.youtube.mdx.background.actions.DISMISS";
        r1.setAction(r4);
        r1.putExtra(r10, r2);
        r2 = r7.h;
        r1 = android.app.PendingIntent.getBroadcast(r2, r5, r1, r12);
        r3.a(r1);
        r0 = r0.d();
        if (r0 == 0) goto L_0x0598;
    L_0x0575:
        r1 = new qe;
        r1.<init>();
        r2 = r0.a();
        r1.a(r2);
        r2 = r0.b();
        r1.b(r2);
        r2 = r0.c();
        r1.a(r2);
        r0 = r0.d();
        r1.a = r0;
        r3.a(r1);
    L_0x0598:
        defpackage.xlr.a(r3);
        r0 = r7.k;
        r0 = r0.b();
        if (r0 != 0) goto L_0x05af;
    L_0x05a3:
        r0 = r7.i;
        r1 = 6;
        r2 = r3.e();
        r3 = "local-notifications";
        r0.a(r3, r1, r2);
    L_0x05af:
        r0 = r7.n;
        r29.getClass();
        r1 = new adlh;
        r1.<init>(r9);
        r0.post(r1);
        return;
    L_0x05bd:
        r0 = r7.n;
        r29.getClass();
        r1 = new adli;
        r1.<init>(r9);
        r0.post(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adlg.b(bbs, adkt):void");
    }
}
