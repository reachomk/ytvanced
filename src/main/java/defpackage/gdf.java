package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.VideoSelectedActionOuterClass$VideoSelectedAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: gdf */
public final class gdf implements OnClickListener, ggb {
    public apxu a;
    public final Handler b;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public nn e;
    public zin f;
    public gdg g;
    public VideoSelectedActionOuterClass$VideoSelectedAction h;
    public Bitmap i;
    public acvx j;
    public gep k;
    public zrp l;
    public apxu m;
    public View n;
    public Button o;
    public Button p;
    public View q;
    public boolean r;
    public float s;
    private final afpu t;
    private final aaas u;
    private final alyv v;
    private final zkw w;
    private final znw x;
    private final alyf y;

    public gdf(afpu afpu, aaas aaas, Handler handler, alyv alyv, zkw zkw, znw znw, alyf alyf) {
        this.t = afpu;
        this.u = aaas;
        this.b = handler;
        this.v = alyv;
        this.w = zkw;
        this.x = znw;
        this.y = alyf;
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void onClick(View view) {
        if (view == this.o) {
            this.j.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_SAVE_LOCALLY_BUTTON), null);
            new gdj(this).execute(new Void[0]);
        } else if (view == this.p) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.k);
            this.u.a(this.a, hashMap);
            this.g.j();
        } else {
            View view2 = this.q;
            if (view == view2) {
                view2.setEnabled(false);
                Context applicationContext = view.getContext().getApplicationContext();
                zrp zrp = this.l;
                boolean l = this.g.l();
                gde gde = new gde(this);
                zlw a = zrp.a();
                if (l && a != null) {
                    a.a(true, new gfp(gde, applicationContext));
                    return;
                }
                gde.a(null, null);
            }
        }
    }

    public final void a(String str, String str2) {
        if (str2 == null) {
            this.d.add(str);
        } else {
            this.c.add(str2);
        }
        if (!this.c.isEmpty() || !this.d.isEmpty()) {
            a(R.drawable.quantum_ic_add_circle_white_24);
        }
    }

    public final void a(int i) {
        adl.a(this.p, null, agb.b(this.e, i), null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0965  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f9 A:{SYNTHETIC, Splitter:B:32:0x00f9} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0965  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0965  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0965  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0965  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0965  */
    public final void a(java.io.File r31, defpackage.bada r32) {
        /*
        r30 = this;
        r1 = r30;
        r2 = r32;
        r0 = "isom";
        r3 = r1.v;
        r4 = 5;
        r5 = 0;
        r3 = r3.a(r4, r5);
        r6 = r1.f;
        r15 = 0;
        if (r6 == 0) goto L_0x0030;
    L_0x0013:
        r7 = r6.c;
        r8 = "content:";
        r7 = r7.startsWith(r8);
        if (r7 == 0) goto L_0x0024;
    L_0x001d:
        r6 = r6.c;
        r6 = android.net.Uri.parse(r6);
        goto L_0x0031;
    L_0x0024:
        r7 = new java.io.File;
        r6 = r6.c;
        r7.<init>(r6);
        r6 = android.net.Uri.fromFile(r7);
        goto L_0x0031;
    L_0x0030:
        r6 = r15;
    L_0x0031:
        r7 = r1.g;
        r14 = r7.h();
        r7 = r1.h;
        r13 = 1;
        if (r7 != 0) goto L_0x003f;
    L_0x003c:
        r16 = r15;
        goto L_0x005e;
    L_0x003f:
        r7 = r7.a;
        r7 = r7 & r13;
        if (r7 != 0) goto L_0x0045;
    L_0x0044:
        goto L_0x003c;
    L_0x0045:
        r7 = defpackage.askm.c;
        r7 = r7.createBuilder();
        r7 = (defpackage.askp) r7;
        r8 = r1.h;
        r8 = r8.b;
        r7.a(r8);
        r7 = r7.build();
        r7 = (defpackage.anxl) r7;
        r7 = (defpackage.askm) r7;
        r16 = r7;
    L_0x005e:
        r7 = r1.c;
        r7 = r7.size();
        r12 = new java.lang.String[r7];
        r7 = r1.c;
        r7.toArray(r12);
        r7 = r1.d;
        r7 = defpackage.amux.a(r7, r15);
        r17 = r7;
        r17 = (java.lang.String) r17;
        r7 = r1.m;
        if (r7 == 0) goto L_0x00ef;
    L_0x0079:
        r8 = com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint;
        r8 = defpackage.anxl.checkIsLite(r8);
        r7.a(r8);
        r7 = r7.h;
        r8 = r8.d;
        r7 = r7.a(r8);
        if (r7 != 0) goto L_0x008d;
    L_0x008c:
        goto L_0x00ef;
    L_0x008d:
        r7 = r1.m;
        r8 = com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint;
        r8 = defpackage.anxl.checkIsLite(r8);
        r7.a(r8);
        r7 = r7.h;
        r9 = r8.d;
        r7 = r7.b(r9);
        if (r7 != 0) goto L_0x00a5;
    L_0x00a2:
        r7 = r8.b;
        goto L_0x00a9;
    L_0x00a5:
        r7 = r8.a(r7);
    L_0x00a9:
        r7 = (com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) r7;
        r7 = r7.c;
        if (r7 == 0) goto L_0x00b0;
    L_0x00af:
        goto L_0x00b2;
    L_0x00b0:
        r7 = defpackage.apxu.d;
    L_0x00b2:
        r8 = com.google.protos.youtube.api.innertube.ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint.d;
        r8 = r8.createBuilder();
        r8 = (defpackage.awyr) r8;
        r8.copyOnWrite();
        r9 = r8.instance;
        r9 = (com.google.protos.youtube.api.innertube.ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint) r9;
        if (r7 == 0) goto L_0x00e9;
    L_0x00c3:
        r9.b = r7;
        r10 = r9.a;
        r10 = r10 | r13;
        r9.a = r10;
        r8 = r8.build();
        r8 = (defpackage.anxl) r8;
        r8 = (com.google.protos.youtube.api.innertube.ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint) r8;
        r9 = defpackage.apxu.d;
        r9 = r9.createBuilder();
        r9 = (defpackage.apxx) r9;
        r10 = com.google.protos.youtube.api.innertube.ReelUploadSnackbarEndpointOuterClass$ReelUploadSnackbarEndpoint.reelUploadSnackbarEndpoint;
        r9.a(r10, r8);
        r8 = r9.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.apxu) r8;
        r11 = r8;
        goto L_0x00f1;
    L_0x00e9:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x00ef:
        r7 = r15;
        r11 = r7;
    L_0x00f1:
        r8 = r1.f;
        r8 = r8.f;
        r21 = 8;
        if (r8 == 0) goto L_0x02a4;
    L_0x00f9:
        r8 = r1.e;	 Catch:{ Exception -> 0x0104 }
        r8 = r8.getContentResolver();	 Catch:{ Exception -> 0x0104 }
        r6 = android.provider.MediaStore.Images.Media.getBitmap(r8, r6);	 Catch:{ Exception -> 0x0104 }
        goto L_0x010a;
    L_0x0104:
        r6 = "Error retrieve image from uri";
        defpackage.xtl.c(r6);
        r6 = r15;
    L_0x010a:
        r8 = new java.io.File;
        r9 = r1.e;
        r9 = defpackage.gbt.b(r9);
        r9 = r9.a;
        r18 = java.lang.System.currentTimeMillis();
        r10 = defpackage.zha.a(r18);
        r10 = java.lang.String.valueOf(r10);
        r15 = ".mp4";
        r19 = r15.length();
        if (r19 != 0) goto L_0x012e;
    L_0x0128:
        r15 = new java.lang.String;
        r15.<init>(r10);
        goto L_0x0132;
    L_0x012e:
        r15 = r10.concat(r15);
    L_0x0132:
        r8.<init>(r9, r15);
        r9 = r1.f;
        r9 = r9.d;
        r15 = r6.getWidth();
        r4 = r6.getHeight();
        r5 = new java.io.ByteArrayOutputStream;
        r5.<init>();
        r13 = android.graphics.Bitmap.CompressFormat.JPEG;
        r20 = r11;
        r11 = 90;
        r6.compress(r13, r11, r5);
        r5 = r5.toByteArray();
        r6 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0297 }
        r6.<init>(r8);	 Catch:{ IOException -> 0x0297 }
        r11 = new java.util.Date;	 Catch:{ IOException -> 0x0297 }
        r11.<init>();	 Catch:{ IOException -> 0x0297 }
        r13 = r5.length;	 Catch:{ IOException -> 0x0297 }
        r22 = r3;
        r2 = (long) r13;
        r23 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r25 = r9 / r23;
        r2 = r2 / r25;
        r3 = (int) r2;	 Catch:{ IOException -> 0x0295 }
        r2 = new uml;	 Catch:{ IOException -> 0x0295 }
        r2.<init>(r6);	 Catch:{ IOException -> 0x0295 }
        r6 = new umd;	 Catch:{ IOException -> 0x0295 }
        r6.<init>();	 Catch:{ IOException -> 0x0295 }
        r25 = r12;
        r12 = defpackage.umi.a(r0);	 Catch:{ IOException -> 0x0293 }
        r6.a = r12;	 Catch:{ IOException -> 0x0293 }
        r26 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r12 = r7;
        r28 = r8;
        r7 = defpackage.umi.a(r26);	 Catch:{ IOException -> 0x0291 }
        r6.b = r7;	 Catch:{ IOException -> 0x0291 }
        r6.a(r0);	 Catch:{ IOException -> 0x0291 }
        r0 = "iso2";
        r6.a(r0);	 Catch:{ IOException -> 0x0291 }
        r0 = "mp41";
        r6.a(r0);	 Catch:{ IOException -> 0x0291 }
        r2.a(r6);	 Catch:{ IOException -> 0x0291 }
        r0 = r2.a;	 Catch:{ IOException -> 0x0291 }
        r6 = r0.a;	 Catch:{ IOException -> 0x0291 }
        r26 = 8;
        r6 = r6 + r26;
        r0 = java.nio.ByteBuffer.allocate(r21);	 Catch:{ IOException -> 0x0291 }
        r8 = r13 + 8;
        r26 = r6;
        r6 = (long) r8;	 Catch:{ IOException -> 0x0291 }
        r6 = defpackage.bana.a(r6);	 Catch:{ IOException -> 0x0291 }
        r6 = (long) r6;	 Catch:{ IOException -> 0x0291 }
        defpackage.cin.a(r0, r6);	 Catch:{ IOException -> 0x0291 }
        r6 = "mdat";
        r6 = defpackage.cil.a(r6);	 Catch:{ IOException -> 0x0291 }
        r0.put(r6);	 Catch:{ IOException -> 0x0291 }
        r0.rewind();	 Catch:{ IOException -> 0x0291 }
        r6 = r2.b;	 Catch:{ IOException -> 0x0291 }
        r6.write(r0);	 Catch:{ IOException -> 0x0291 }
        r0 = r2.b;	 Catch:{ IOException -> 0x0291 }
        r5 = java.nio.ByteBuffer.wrap(r5);	 Catch:{ IOException -> 0x0291 }
        r0.write(r5);	 Catch:{ IOException -> 0x0291 }
        r0 = new umf;	 Catch:{ IOException -> 0x0291 }
        r0.<init>();	 Catch:{ IOException -> 0x0291 }
        r5 = defpackage.amqw.a(r11);	 Catch:{ IOException -> 0x0291 }
        r5 = (java.util.Date) r5;	 Catch:{ IOException -> 0x0291 }
        r0.a = r5;	 Catch:{ IOException -> 0x0291 }
        r5 = defpackage.amqw.a(r11);	 Catch:{ IOException -> 0x0291 }
        r5 = (java.util.Date) r5;	 Catch:{ IOException -> 0x0291 }
        r0.b = r5;	 Catch:{ IOException -> 0x0291 }
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ IOException -> 0x0291 }
        r0.c = r5;	 Catch:{ IOException -> 0x0291 }
        r5 = java.lang.Long.valueOf(r9);	 Catch:{ IOException -> 0x0291 }
        r0.d = r5;	 Catch:{ IOException -> 0x0291 }
        r6 = new umh;	 Catch:{ IOException -> 0x0291 }
        r6.<init>();	 Catch:{ IOException -> 0x0291 }
        r7 = defpackage.amqw.a(r11);	 Catch:{ IOException -> 0x0291 }
        r7 = (java.util.Date) r7;	 Catch:{ IOException -> 0x0291 }
        r6.b = r7;	 Catch:{ IOException -> 0x0291 }
        r7 = defpackage.amqw.a(r11);	 Catch:{ IOException -> 0x0291 }
        r7 = (java.util.Date) r7;	 Catch:{ IOException -> 0x0291 }
        r6.c = r7;	 Catch:{ IOException -> 0x0291 }
        r7 = java.lang.Long.valueOf(r23);	 Catch:{ IOException -> 0x0291 }
        r6.d = r7;	 Catch:{ IOException -> 0x0291 }
        r7 = 0;
        r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r11 < 0) goto L_0x020e;
    L_0x020c:
        r7 = 1;
        goto L_0x020f;
    L_0x020e:
        r7 = 0;
    L_0x020f:
        defpackage.amqw.a(r7);	 Catch:{ IOException -> 0x0291 }
        r6.e = r5;	 Catch:{ IOException -> 0x0291 }
        r5 = (float) r15;	 Catch:{ IOException -> 0x0291 }
        r5 = java.lang.Float.valueOf(r5);	 Catch:{ IOException -> 0x0291 }
        r6.f = r5;	 Catch:{ IOException -> 0x0291 }
        r5 = (float) r4;	 Catch:{ IOException -> 0x0291 }
        r5 = java.lang.Float.valueOf(r5);	 Catch:{ IOException -> 0x0291 }
        r6.g = r5;	 Catch:{ IOException -> 0x0291 }
        r5 = defpackage.umk.a;	 Catch:{ IOException -> 0x0291 }
        r6.a = r5;	 Catch:{ IOException -> 0x0291 }
        r5 = 1;
        r7 = java.lang.Boolean.valueOf(r5);	 Catch:{ IOException -> 0x0291 }
        r6.h = r7;	 Catch:{ IOException -> 0x0291 }
        r6.i = r7;	 Catch:{ IOException -> 0x0291 }
        r5 = new umg;	 Catch:{ IOException -> 0x0291 }
        r5.<init>();	 Catch:{ IOException -> 0x0291 }
        if (r15 <= 0) goto L_0x0238;
    L_0x0236:
        r7 = 1;
        goto L_0x0239;
    L_0x0238:
        r7 = 0;
    L_0x0239:
        defpackage.amqw.a(r7);	 Catch:{ IOException -> 0x0291 }
        r7 = java.lang.Integer.valueOf(r15);	 Catch:{ IOException -> 0x0291 }
        r5.a = r7;	 Catch:{ IOException -> 0x0291 }
        if (r4 <= 0) goto L_0x0246;
    L_0x0244:
        r7 = 1;
        goto L_0x0247;
    L_0x0246:
        r7 = 0;
    L_0x0247:
        defpackage.amqw.a(r7);	 Catch:{ IOException -> 0x0291 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ IOException -> 0x0291 }
        r5.b = r4;	 Catch:{ IOException -> 0x0291 }
        if (r3 <= 0) goto L_0x0254;
    L_0x0252:
        r4 = 1;
        goto L_0x0255;
    L_0x0254:
        r4 = 0;
    L_0x0255:
        defpackage.amqw.a(r4);	 Catch:{ IOException -> 0x0291 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IOException -> 0x0291 }
        r5.c = r3;	 Catch:{ IOException -> 0x0291 }
        defpackage.amqw.a(r4);	 Catch:{ IOException -> 0x0291 }
        r5.d = r3;	 Catch:{ IOException -> 0x0291 }
        r6.m = r5;	 Catch:{ IOException -> 0x0291 }
        r3 = (int) r9;	 Catch:{ IOException -> 0x0291 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IOException -> 0x0291 }
        r6.j = r3;	 Catch:{ IOException -> 0x0291 }
        r3 = java.lang.Integer.valueOf(r13);	 Catch:{ IOException -> 0x0291 }
        r6.k = r3;	 Catch:{ IOException -> 0x0291 }
        r3 = java.lang.Long.valueOf(r26);	 Catch:{ IOException -> 0x0291 }
        r6.l = r3;	 Catch:{ IOException -> 0x0291 }
        r3 = r0.e;	 Catch:{ IOException -> 0x0291 }
        r3.add(r6);	 Catch:{ IOException -> 0x0291 }
        r3 = r0.f;	 Catch:{ IOException -> 0x0291 }
        r3 = (long) r3;	 Catch:{ IOException -> 0x0291 }
        defpackage.umi.a(r3);	 Catch:{ IOException -> 0x0291 }
        r3 = r0.f;	 Catch:{ IOException -> 0x0291 }
        r4 = 1;
        r3 = r3 + r4;
        r0.f = r3;	 Catch:{ IOException -> 0x0291 }
        r2.a(r0);	 Catch:{ IOException -> 0x0291 }
        r15 = android.net.Uri.fromFile(r28);	 Catch:{ IOException -> 0x0291 }
        goto L_0x02ac;
    L_0x0291:
        r0 = move-exception;
        goto L_0x029d;
    L_0x0293:
        r0 = move-exception;
        goto L_0x029c;
    L_0x0295:
        r0 = move-exception;
        goto L_0x029a;
    L_0x0297:
        r0 = move-exception;
        r22 = r3;
    L_0x029a:
        r25 = r12;
    L_0x029c:
        r12 = r7;
    L_0x029d:
        r2 = "Failed transcoding photo to mp4";
        defpackage.ujo.a(r2, r0);
        r15 = 0;
        goto L_0x02ac;
    L_0x02a4:
        r22 = r3;
        r20 = r11;
        r25 = r12;
        r12 = r7;
        r15 = r6;
    L_0x02ac:
        r0 = r1.f;
        r2 = r0.e;
        if (r2 == 0) goto L_0x02d5;
    L_0x02b2:
        r2 = r0.f;
        if (r2 != 0) goto L_0x02c0;
    L_0x02b6:
        r2 = 1;
        r3 = new java.lang.String[r2];
        r0 = r0.c;
        r4 = 0;
        r3[r4] = r0;
        r0 = r3;
        goto L_0x02d7;
    L_0x02c0:
        r2 = 1;
        r4 = 0;
        r3 = new java.io.File;
        r0 = r0.c;
        r3.<init>(r0);
        r3.delete();
        r0 = new java.lang.String[r2];
        r2 = r15.toString();
        r0[r4] = r2;
        goto L_0x02d7;
    L_0x02d5:
        r4 = 0;
        r0 = 0;
    L_0x02d7:
        if (r14 == 0) goto L_0x02f3;
    L_0x02d9:
        r2 = r14.c();
        if (r2 != 0) goto L_0x02e0;
    L_0x02df:
        goto L_0x02e3;
    L_0x02e0:
        if (r31 != 0) goto L_0x02e3;
    L_0x02e2:
        goto L_0x02f3;
    L_0x02e3:
        r2 = r1.f;
        r2 = r2.f;
        if (r2 != 0) goto L_0x02ee;
    L_0x02e9:
        r2 = defpackage.zsa.b(r14);
        goto L_0x02f4;
    L_0x02ee:
        r2 = defpackage.zsa.a(r14, r15);
        goto L_0x02f4;
    L_0x02f3:
        r2 = r15;
    L_0x02f4:
        r3 = 3;
        r5 = 2;
        r15 = r32;
        if (r15 == 0) goto L_0x0456;
    L_0x02fa:
        r6 = new java.util.ArrayList;
        r6.<init>();
        r7 = r15.a;
        r7 = r7.iterator();
    L_0x0305:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x0422;
    L_0x030b:
        r8 = r7.next();
        r8 = (defpackage.bacz) r8;
        r8 = r8.f;
        r8 = r8.iterator();
    L_0x0317:
        r9 = r8.hasNext();
        if (r9 == 0) goto L_0x0305;
    L_0x031d:
        r9 = r8.next();
        r9 = (defpackage.babs) r9;
        r10 = defpackage.azbb.f;
        r10 = r10.createBuilder();
        r10 = (defpackage.azba) r10;
        r11 = r9.d;
        r13 = defpackage.babw.a(r11);
        if (r13 == 0) goto L_0x0334;
    L_0x0333:
        goto L_0x0335;
    L_0x0334:
        r13 = 1;
    L_0x0335:
        r13 = r13 + -1;
        if (r13 == 0) goto L_0x033b;
    L_0x0339:
        r11 = 2;
        goto L_0x033c;
    L_0x033b:
        r11 = 1;
    L_0x033c:
        r10.copyOnWrite();
        r13 = r10.instance;
        r13 = (defpackage.azbb) r13;
        r4 = r13.a;
        r19 = 1;
        r4 = r4 | 1;
        r13.a = r4;
        r11 = r11 + -1;
        r13.d = r11;
        r4 = r9.b;
        if (r4 != r5) goto L_0x0358;
    L_0x0353:
        r4 = r9.c;
        r4 = (defpackage.babu) r4;
        goto L_0x035a;
    L_0x0358:
        r4 = defpackage.babu.c;
    L_0x035a:
        r11 = defpackage.azbd.c;
        r11 = r11.createBuilder();
        r11 = (defpackage.azbc) r11;
        r4 = r4.b;
        r11.copyOnWrite();
        r13 = r11.instance;
        r13 = (defpackage.azbd) r13;
        if (r4 == 0) goto L_0x041c;
    L_0x036d:
        r5 = r13.a;
        r19 = 1;
        r5 = r5 | 1;
        r13.a = r5;
        r13.b = r4;
        r4 = r11.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.azbd) r4;
        r10.copyOnWrite();
        r5 = r10.instance;
        r5 = (defpackage.azbb) r5;
        if (r4 == 0) goto L_0x0416;
    L_0x0388:
        r5.c = r4;
        r5.b = r3;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = r9.e;
        r5 = r5.iterator();
    L_0x0397:
        r9 = r5.hasNext();
        if (r9 == 0) goto L_0x03ea;
    L_0x039d:
        r9 = r5.next();
        r9 = (defpackage.baby) r9;
        r11 = r9.a;
        r13 = 1;
        if (r11 != r13) goto L_0x03ad;
    L_0x03a8:
        r9 = r9.b;
        r9 = (defpackage.aocz) r9;
        goto L_0x03b7;
    L_0x03ad:
        r13 = 2;
        if (r11 == r13) goto L_0x03b3;
    L_0x03b0:
        r9 = defpackage.aocz.f;
        goto L_0x03b7;
    L_0x03b3:
        r9 = r9.b;
        r9 = (defpackage.aocz) r9;
    L_0x03b7:
        r11 = defpackage.azbf.b;
        r11 = r11.createBuilder();
        r11 = (defpackage.azbe) r11;
        r9 = r9.d;
        r11.copyOnWrite();
        r13 = r11.instance;
        r13 = (defpackage.azbf) r13;
        r3 = r13.a;
        r3 = r3.a();
        if (r3 != 0) goto L_0x03d8;
    L_0x03d0:
        r3 = r13.a;
        r3 = defpackage.anxl.mutableCopy(r3);
        r13.a = r3;
    L_0x03d8:
        r3 = r13.a;
        defpackage.anvf.addAll(r9, r3);
        r3 = r11.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.azbf) r3;
        r4.add(r3);
        r3 = 3;
        goto L_0x0397;
    L_0x03ea:
        r10.copyOnWrite();
        r3 = r10.instance;
        r3 = (defpackage.azbb) r3;
        r5 = r3.e;
        r5 = r5.a();
        if (r5 != 0) goto L_0x0401;
    L_0x03f9:
        r5 = r3.e;
        r5 = defpackage.anxl.mutableCopy(r5);
        r3.e = r5;
    L_0x0401:
        r3 = r3.e;
        defpackage.anvf.addAll(r4, r3);
        r3 = r10.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.azbb) r3;
        r6.add(r3);
        r3 = 3;
        r4 = 0;
        r5 = 2;
        goto L_0x0317;
    L_0x0416:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x041c:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0422:
        r3 = r6.isEmpty();
        if (r3 == 0) goto L_0x0429;
    L_0x0428:
        goto L_0x0456;
    L_0x0429:
        r3 = defpackage.azaz.b;
        r3 = r3.createBuilder();
        r3 = (defpackage.azay) r3;
        r3.copyOnWrite();
        r4 = r3.instance;
        r4 = (defpackage.azaz) r4;
        r5 = r4.a;
        r5 = r5.a();
        if (r5 != 0) goto L_0x0448;
    L_0x0440:
        r5 = r4.a;
        r5 = defpackage.anxl.mutableCopy(r5);
        r4.a = r5;
    L_0x0448:
        r4 = r4.a;
        defpackage.anvf.addAll(r6, r4);
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.azaz) r3;
        goto L_0x0457;
    L_0x0456:
        r3 = 0;
    L_0x0457:
        r4 = r1.y;
        r5 = r1.t;
        r9 = r5.c();
        r5 = r1.f;
        r13 = r5.f;
        r5 = r5.g;
        r11 = r1.i;
        if (r12 == 0) goto L_0x0470;
    L_0x0469:
        r6 = r12.toByteArray();
        r26 = r6;
        goto L_0x0472;
    L_0x0470:
        r26 = 0;
    L_0x0472:
        r12 = new alyh;
        r6 = r12;
        r7 = r4;
        r8 = r22;
        r10 = r31;
        r29 = r20;
        r1 = r12;
        r20 = r25;
        r12 = r2;
        r2 = 1;
        r25 = r14;
        r14 = r20;
        r15 = r17;
        r17 = r26;
        r18 = r0;
        r19 = r3;
        r20 = r5;
        r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r0 = r4.b;
        r0 = defpackage.anjf.a(r1, r0);
        r1 = new alym;
        r1.<init>(r4);
        r3 = defpackage.aniv.a;
        defpackage.anjf.a(r0, r1, r3);
        r1 = r30;
        r0 = r1.e;
        r0 = r0.getApplicationContext();
        r0 = defpackage.xly.a(r0);
        r0 = r0.edit();
        r3 = "REEL_UPLOAD_IN_PROGRESS";
        r0 = r0.putBoolean(r3, r2);
        r0.apply();
        r0 = r1.f;
        r3 = r0.h;
        r4 = r0.i;
        r0 = r0.j;
        r5 = 6;
        r6 = 4;
        r7 = r32;
        if (r7 != 0) goto L_0x04cb;
    L_0x04c9:
        r8 = 0;
        goto L_0x0511;
    L_0x04cb:
        r8 = r7.a;
        r8 = r8.iterator();
    L_0x04d1:
        r9 = r8.hasNext();
        if (r9 == 0) goto L_0x04c9;
    L_0x04d7:
        r9 = r8.next();
        r9 = (defpackage.bacz) r9;
        r10 = r9.a;
        r10 = r10 & r6;
        if (r10 == 0) goto L_0x04d1;
    L_0x04e2:
        r10 = r9.d;
        if (r10 != 0) goto L_0x04e8;
    L_0x04e6:
        r10 = defpackage.bacx.e;
    L_0x04e8:
        r10 = r10.b;
        r11 = 2;
        if (r10 != r11) goto L_0x04ef;
    L_0x04ed:
        r8 = 1;
        goto L_0x0511;
    L_0x04ef:
        r10 = r9.d;
        if (r10 != 0) goto L_0x04f5;
    L_0x04f3:
        r10 = defpackage.bacx.e;
    L_0x04f5:
        r10 = r10.b;
        r11 = 3;
        if (r10 != r11) goto L_0x04fb;
    L_0x04fa:
        goto L_0x04ed;
    L_0x04fb:
        r10 = r9.d;
        if (r10 != 0) goto L_0x0501;
    L_0x04ff:
        r10 = defpackage.bacx.e;
    L_0x0501:
        r10 = r10.b;
        if (r10 != r6) goto L_0x0506;
    L_0x0505:
        goto L_0x04fa;
    L_0x0506:
        r9 = r9.d;
        if (r9 != 0) goto L_0x050c;
    L_0x050a:
        r9 = defpackage.bacx.e;
    L_0x050c:
        r9 = r9.b;
        if (r9 != r5) goto L_0x04d1;
    L_0x0510:
        goto L_0x04ed;
    L_0x0511:
        if (r7 != 0) goto L_0x0515;
    L_0x0513:
        r9 = 0;
        goto L_0x0537;
    L_0x0515:
        r9 = r7.a;
        r9 = r9.iterator();
    L_0x051b:
        r10 = r9.hasNext();
        if (r10 == 0) goto L_0x0513;
    L_0x0521:
        r10 = r9.next();
        r10 = (defpackage.bacz) r10;
        r11 = r10.a;
        r11 = r11 & r6;
        if (r11 == 0) goto L_0x051b;
    L_0x052c:
        r10 = r10.d;
        if (r10 != 0) goto L_0x0532;
    L_0x0530:
        r10 = defpackage.bacx.e;
    L_0x0532:
        r10 = r10.b;
        if (r10 != r2) goto L_0x051b;
    L_0x0536:
        r9 = 1;
    L_0x0537:
        r10 = r1.j;
        r11 = new acvs;
        r12 = defpackage.acwc.UPLOAD_VIDEO_EDITING_DONE_BUTTON;
        r11.<init>(r12);
        r12 = defpackage.atst.q;
        r12 = r12.createBuilder();
        r12 = (defpackage.atss) r12;
        r13 = defpackage.attd.e;
        r13 = r13.createBuilder();
        r13 = (defpackage.attc) r13;
        r14 = "Reel video";
        r13.b(r14);
        r14 = r22;
        r13.a(r14);
        if (r25 != 0) goto L_0x055d;
    L_0x055c:
        goto L_0x05cc;
    L_0x055d:
        r15 = defpackage.attf.m;
        r15 = r15.createBuilder();
        r15 = (defpackage.atte) r15;
        r16 = r25.e();
        if (r16 == 0) goto L_0x057c;
    L_0x056b:
        r15.a();
        r5 = r25.j();
        r15.a(r5);
        r5 = r25.l();
        r15.b(r5);
    L_0x057c:
        r5 = r25.g();
        if (r5 == 0) goto L_0x059e;
    L_0x0582:
        r15.b();
        r5 = r25.t();
        r5 = r5.toString();
        r15.a(r5);
        r5 = r25.u();
        r15.c(r5);
        r5 = r25.v();
        r15.a(r5);
    L_0x059e:
        r5 = r25.f();
        if (r5 == 0) goto L_0x05ab;
    L_0x05a4:
        r5 = r25.d();
        r15.b(r5);
    L_0x05ab:
        r15.copyOnWrite();
        r5 = r15.instance;
        r5 = (defpackage.attf) r5;
        r6 = r5.a;
        r6 = r6 | 4096;
        r5.a = r6;
        r5.l = r8;
        r15.copyOnWrite();
        r5 = r15.instance;
        r5 = (defpackage.attf) r5;
        r6 = r5.a;
        r6 = r6 | 2048;
        r5.a = r6;
        r5.k = r9;
        r13.a(r15);
    L_0x05cc:
        r12.a(r13);
        r5 = r12.build();
        r5 = (defpackage.anxl) r5;
        r5 = (defpackage.atst) r5;
        r6 = 3;
        r10.a(r6, r11, r5);
        if (r25 == 0) goto L_0x05e2;
    L_0x05dd:
        r15 = r25.d();
        goto L_0x05e3;
    L_0x05e2:
        r15 = 0;
    L_0x05e3:
        r5 = r1.x;
        r6 = android.text.TextUtils.isEmpty(r15);
        if (r6 == 0) goto L_0x05ed;
    L_0x05eb:
        r15 = "NORMAL";
    L_0x05ed:
        r6 = defpackage.ayzw.e;
        r6 = r6.createBuilder();
        r6 = (defpackage.ayzv) r6;
        r6.copyOnWrite();
        r8 = r6.instance;
        r8 = (defpackage.ayzw) r8;
        if (r14 == 0) goto L_0x0965;
    L_0x05fe:
        r9 = r8.a;
        r9 = r9 | r2;
        r8.a = r9;
        r8.d = r14;
        r8 = android.text.TextUtils.isEmpty(r3);
        if (r8 != 0) goto L_0x0637;
    L_0x060b:
        r8 = defpackage.ayzk.f;
        r8 = r8.createBuilder();
        r8 = (defpackage.ayzj) r8;
        r8.a(r3);
        r8.a(r4);
        r8.copyOnWrite();
        r3 = r8.instance;
        r3 = (defpackage.ayzk) r3;
        r4 = r3.a;
        r4 = r4 | 8;
        r3.a = r4;
        r3.d = r0;
        r0 = 2;
        r8.a(r0);
        r0 = r8.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.ayzk) r0;
        r6.a(r0);
    L_0x0637:
        r0 = defpackage.ayzk.f;
        r0 = r0.createBuilder();
        r0 = (defpackage.ayzj) r0;
        r0.a(r15);
        r3 = defpackage.ayza.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
        r0.a(r3);
        r3 = 3;
        r0.a(r3);
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.ayzk) r0;
        r6.a(r0);
        if (r7 != 0) goto L_0x065a;
    L_0x0658:
        goto L_0x08d2;
    L_0x065a:
        r0 = r7.a;
        r0 = r0.iterator();
    L_0x0660:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x08d2;
    L_0x0666:
        r3 = r0.next();
        r3 = (defpackage.bacz) r3;
        r4 = r3.a;
        r7 = 4;
        r4 = r4 & r7;
        if (r4 == 0) goto L_0x0660;
    L_0x0672:
        r3 = r3.d;
        if (r3 != 0) goto L_0x0678;
    L_0x0676:
        r3 = defpackage.bacx.e;
    L_0x0678:
        r4 = defpackage.ayzq.f;
        r4 = r4.createBuilder();
        r4 = (defpackage.ayzp) r4;
        r7 = r3.d;
        r4.copyOnWrite();
        r8 = r4.instance;
        r8 = (defpackage.ayzq) r8;
        r9 = r8.a;
        r9 = r9 | 32;
        r8.a = r9;
        r8.e = r7;
        r7 = r3.b;
        r8 = 2;
        if (r7 != r8) goto L_0x0708;
    L_0x0696:
        r3 = r3.c;
        r3 = (defpackage.bade) r3;
        r7 = r3.a;
        r7 = r7 & r8;
        if (r7 == 0) goto L_0x06b2;
    L_0x069f:
        r3 = r3.b;
        if (r3 != 0) goto L_0x06a5;
    L_0x06a3:
        r3 = defpackage.baao.c;
    L_0x06a5:
        r7 = r3.a;
        if (r7 != r2) goto L_0x06af;
    L_0x06a9:
        r3 = r3.b;
        r15 = r3;
        r15 = (java.lang.String) r15;
        goto L_0x06b3;
    L_0x06af:
        r15 = "";
        goto L_0x06b3;
    L_0x06b2:
        r15 = 0;
    L_0x06b3:
        if (r15 != 0) goto L_0x06b6;
    L_0x06b5:
        goto L_0x06be;
    L_0x06b6:
        r3 = android.net.Uri.parse(r15);
        r15 = r3.getLastPathSegment();
    L_0x06be:
        r3 = defpackage.ayzo.c;
        r3 = r3.createBuilder();
        r3 = (defpackage.ayzn) r3;
        r3.copyOnWrite();
        r7 = r3.instance;
        r7 = (defpackage.ayzo) r7;
        if (r15 == 0) goto L_0x0702;
    L_0x06cf:
        r8 = r7.a;
        r8 = r8 | r2;
        r7.a = r8;
        r7.b = r15;
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.ayzo) r3;
        r7 = 3;
        r4.a(r7);
        r4.copyOnWrite();
        r8 = r4.instance;
        r8 = (defpackage.ayzq) r8;
        if (r3 == 0) goto L_0x06fc;
    L_0x06eb:
        r8.c = r3;
        r8.b = r7;
        r3 = r4.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.ayzq) r3;
        r6.a(r3);
        goto L_0x0660;
    L_0x06fc:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0702:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0708:
        if (r7 != r2) goto L_0x083c;
    L_0x070a:
        r7 = defpackage.ayzs.g;
        r7 = r7.createBuilder();
        r7 = (defpackage.ayzr) r7;
        r8 = r3.b;
        if (r8 != r2) goto L_0x071b;
    L_0x0716:
        r8 = r3.c;
        r8 = (defpackage.badg) r8;
        goto L_0x071d;
    L_0x071b:
        r8 = defpackage.badg.k;
    L_0x071d:
        r8 = r8.j;
        r7.copyOnWrite();
        r9 = r7.instance;
        r9 = (defpackage.ayzs) r9;
        r10 = r9.a;
        r10 = r10 | r2;
        r9.a = r10;
        r9.b = r8;
        r8 = r3.b;
        if (r8 != r2) goto L_0x0736;
    L_0x0731:
        r8 = r3.c;
        r8 = (defpackage.badg) r8;
        goto L_0x0738;
    L_0x0736:
        r8 = defpackage.badg.k;
    L_0x0738:
        r8 = r8.d;
        if (r8 != 0) goto L_0x073e;
    L_0x073c:
        r8 = defpackage.aocv.f;
    L_0x073e:
        r8 = defpackage.znw.a(r8);
        r7.copyOnWrite();
        r9 = r7.instance;
        r9 = (defpackage.ayzs) r9;
        r10 = r9.a;
        r11 = 2;
        r10 = r10 | r11;
        r9.a = r10;
        r9.c = r8;
        r8 = r3.b;
        if (r8 != r2) goto L_0x075a;
    L_0x0755:
        r8 = r3.c;
        r8 = (defpackage.badg) r8;
        goto L_0x075c;
    L_0x075a:
        r8 = defpackage.badg.k;
    L_0x075c:
        r8 = r8.e;
        if (r8 != 0) goto L_0x0762;
    L_0x0760:
        r8 = defpackage.aocv.f;
    L_0x0762:
        r8 = defpackage.znw.a(r8);
        r7.copyOnWrite();
        r9 = r7.instance;
        r9 = (defpackage.ayzs) r9;
        r10 = r9.a;
        r11 = 4;
        r10 = r10 | r11;
        r9.a = r10;
        r9.d = r8;
        r8 = r3.b;
        if (r8 != r2) goto L_0x077e;
    L_0x0779:
        r3 = r3.c;
        r3 = (defpackage.badg) r3;
        goto L_0x0780;
    L_0x077e:
        r3 = defpackage.badg.k;
    L_0x0780:
        r3 = r3.h;
        r3 = defpackage.babk.a(r3);
        if (r3 != 0) goto L_0x078a;
    L_0x0788:
        r3 = defpackage.babk.FONT_FAMILY_UNSPECIFIED;
    L_0x078a:
        r8 = defpackage.znw.a;
        r8 = r8.get(r3);
        if (r8 == 0) goto L_0x07b4;
    L_0x0792:
        r8 = defpackage.znw.a;
        r8 = r8.get(r3);
        r8 = (defpackage.ayzg) r8;
        r7.copyOnWrite();
        r9 = r7.instance;
        r9 = (defpackage.ayzs) r9;
        if (r8 == 0) goto L_0x07ae;
    L_0x07a3:
        r10 = r9.a;
        r10 = r10 | 16;
        r9.a = r10;
        r8 = r8.g;
        r9.f = r8;
        goto L_0x07d2;
    L_0x07ae:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x07b4:
        r8 = java.lang.String.valueOf(r3);
        r9 = r8.length();
        r10 = new java.lang.StringBuilder;
        r9 = r9 + 23;
        r10.<init>(r9);
        r9 = "Missing font name for: ";
        r10.append(r9);
        r10.append(r8);
        r8 = r10.toString();
        defpackage.xtl.d(r8);
    L_0x07d2:
        r8 = defpackage.znw.b;
        r8 = r8.get(r3);
        if (r8 == 0) goto L_0x07fc;
    L_0x07da:
        r8 = defpackage.znw.b;
        r3 = r8.get(r3);
        r3 = (defpackage.ayzi) r3;
        r7.copyOnWrite();
        r8 = r7.instance;
        r8 = (defpackage.ayzs) r8;
        if (r3 == 0) goto L_0x07f6;
    L_0x07eb:
        r9 = r8.a;
        r9 = r9 | 8;
        r8.a = r9;
        r3 = r3.g;
        r8.e = r3;
        goto L_0x081a;
    L_0x07f6:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x07fc:
        r3 = java.lang.String.valueOf(r3);
        r8 = r3.length();
        r9 = new java.lang.StringBuilder;
        r8 = r8 + 24;
        r9.<init>(r8);
        r8 = "Missing font style for: ";
        r9.append(r8);
        r9.append(r3);
        r3 = r9.toString();
        defpackage.xtl.d(r3);
    L_0x081a:
        r8 = 2;
        r4.a(r8);
        r4.copyOnWrite();
        r3 = r4.instance;
        r3 = (defpackage.ayzq) r3;
        r7 = r7.build();
        r7 = (defpackage.anxl) r7;
        r3.c = r7;
        r3.b = r8;
        r3 = r4.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.ayzq) r3;
        r6.a(r3);
        goto L_0x0660;
    L_0x083c:
        r8 = 2;
        r9 = 3;
        if (r7 == r9) goto L_0x08bf;
    L_0x0840:
        r10 = 4;
        if (r7 != r10) goto L_0x0854;
    L_0x0843:
        r10 = 5;
        r4.a(r10);
        r3 = r4.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.ayzq) r3;
        r6.a(r3);
        goto L_0x0660;
    L_0x0854:
        r10 = 6;
        if (r7 != r10) goto L_0x0867;
    L_0x0857:
        r4.a(r10);
        r3 = r4.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.ayzq) r3;
        r6.a(r3);
        goto L_0x0660;
    L_0x0867:
        r11 = 7;
        if (r7 != r11) goto L_0x08b7;
    L_0x086a:
        r4.a(r11);
        r7 = defpackage.ayzu.c;
        r7 = r7.createBuilder();
        r7 = (defpackage.ayzt) r7;
        r12 = r3.b;
        if (r12 != r11) goto L_0x087e;
    L_0x0879:
        r3 = r3.c;
        r3 = (defpackage.badp) r3;
        goto L_0x0880;
    L_0x087e:
        r3 = defpackage.badp.e;
    L_0x0880:
        r3 = r3.c;
        r7.copyOnWrite();
        r11 = r7.instance;
        r11 = (defpackage.ayzu) r11;
        if (r3 == 0) goto L_0x08b1;
    L_0x088b:
        r12 = r11.a;
        r12 = r12 | r2;
        r11.a = r12;
        r11.b = r3;
        r4.copyOnWrite();
        r3 = r4.instance;
        r3 = (defpackage.ayzq) r3;
        r7 = r7.build();
        r7 = (defpackage.anxl) r7;
        r3.c = r7;
        r7 = 5;
        r3.b = r7;
        r3 = r4.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.ayzq) r3;
        r6.a(r3);
        goto L_0x0660;
    L_0x08b1:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x08b7:
        r7 = 5;
        r3 = "Unhandled sticker not being logged.";
        defpackage.xtl.c(r3);
        goto L_0x0660;
    L_0x08bf:
        r3 = 4;
        r7 = 5;
        r10 = 6;
        r4.a(r3);
        r4 = r4.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.ayzq) r4;
        r6.a(r4);
        goto L_0x0660;
    L_0x08d2:
        r0 = defpackage.ayzy.c;
        r0 = r0.createBuilder();
        r0 = (defpackage.ayzx) r0;
        r3 = r6.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.ayzw) r3;
        r0.copyOnWrite();
        r4 = r0.instance;
        r4 = (defpackage.ayzy) r4;
        if (r3 == 0) goto L_0x095f;
    L_0x08eb:
        r4.b = r3;
        r4.a = r2;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.ayzy) r0;
        r2 = defpackage.asmw.f;
        r2 = r2.createBuilder();
        r2 = (defpackage.asmz) r2;
        r2.copyOnWrite();
        r3 = r2.instance;
        r3 = (defpackage.asmw) r3;
        if (r0 == 0) goto L_0x0959;
    L_0x0908:
        r3.c = r0;
        r0 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r3.b = r0;
        r0 = r2.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.asmw) r0;
        r2 = r0.toString();
        r2 = java.lang.String.valueOf(r2);
        r3 = "Logging VFX GEL event:\n";
        r4 = r2.length();
        if (r4 != 0) goto L_0x092c;
    L_0x0926:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x092f;
    L_0x092c:
        r3.concat(r2);
    L_0x092f:
        r2 = r5.c;
        r2.a(r0);
        r15 = r29;
        if (r15 == 0) goto L_0x0949;
    L_0x0938:
        r0 = r1.j;
        r2 = r1.m;
        r0 = r0.a(r2);
        r1.m = r0;
        r0 = r1.u;
        r2 = 0;
        r0.a(r15, r2);
        goto L_0x094e;
    L_0x0949:
        r0 = "Destination endpoint not set.";
        defpackage.xtl.c(r0);
    L_0x094e:
        r0 = r1.e;
        r2 = new gdh;
        r2.<init>(r1);
        r0.runOnUiThread(r2);
        return;
    L_0x0959:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x095f:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0965:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        goto L_0x096c;
    L_0x096b:
        throw r0;
    L_0x096c:
        goto L_0x096b;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdf.a(java.io.File, bada):void");
    }

    public final View a() {
        return this.n;
    }

    public final float b() {
        return !this.r ? this.s : 0.0f;
    }

    public final float c() {
        return this.r ? this.s : 0.0f;
    }
}
