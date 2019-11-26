package defpackage;

/* renamed from: wge */
final /* synthetic */ class wge implements Runnable {
    private final wfz a;

    wge(wfz wfz) {
        this.a = wfz;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098 A:{Catch:{ MediaPipeException -> 0x00a8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083 A:{Catch:{ MediaPipeException -> 0x00a8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0079 */
    /* JADX WARNING: Failed to process nested try/catch */
    public final void run() {
        /*
        r10 = this;
        r0 = r10.a;
        r1 = r0.ac;
        r2 = r0.ad;
        r1.setImageBitmap(r2);
        r1 = r0.Z;
        r0 = r0.ad;
        r2 = r1.e;
        r3 = new com.google.mediapipe.framework.PacketCreator;
        r4 = r2.b;
        r3.<init>(r4);
        r4 = new zj;
        r4.<init>();
        r5 = defpackage.anuu.a();
        r6 = "frame_blurred.png";
        r7 = r6.length();
        r8 = "kazoo/";
        if (r7 != 0) goto L_0x002f;
    L_0x0029:
        r7 = new java.lang.String;
        r7.<init>(r8);
        goto L_0x0033;
    L_0x002f:
        r7 = r8.concat(r6);
    L_0x0033:
        r5 = r5.b(r7);
        r7 = 0;
        if (r5 == 0) goto L_0x004b;
    L_0x003a:
        r8 = r5.endsWith(r6);
        if (r8 == 0) goto L_0x004b;
    L_0x0040:
        r6 = r5.length();
        r6 = r6 + -17;
        r5 = r5.substring(r7, r6);
        goto L_0x0062;
    L_0x004b:
        r5 = "Failed to get asset_base for: ";
        r8 = r6.length();
        if (r8 != 0) goto L_0x0059;
    L_0x0053:
        r6 = new java.lang.String;
        r6.<init>(r5);
        goto L_0x005d;
    L_0x0059:
        r6 = r5.concat(r6);
    L_0x005d:
        defpackage.xtl.c(r6);
        r5 = "";
    L_0x0062:
        r3 = r3.a(r5);
        r5 = "asset_base";
        r4.put(r5, r3);
        r3 = defpackage.anuu.a();
        r5 = "kazoo";
        r3.a(r5);
        r3 = r2.b;	 Catch:{ MediaPipeException -> 0x0079 }
        r3.a(r4);	 Catch:{ MediaPipeException -> 0x0079 }
    L_0x0079:
        r3 = r2.b;	 Catch:{ MediaPipeException -> 0x00a8 }
        r4 = "gpu_shared";
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ MediaPipeException -> 0x00a8 }
        r6 = 21;
        if (r5 >= r6) goto L_0x0098;
    L_0x0083:
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ MediaPipeException -> 0x00a8 }
        r6 = 17;
        if (r5 >= r6) goto L_0x008e;
    L_0x0089:
        r5 = com.google.mediapipe.framework.Compat.getCurrentNativeEGLContext();	 Catch:{ MediaPipeException -> 0x00a8 }
        goto L_0x00a0;
    L_0x008e:
        r5 = android.opengl.EGL14.eglGetCurrentContext();	 Catch:{ MediaPipeException -> 0x00a8 }
        r5 = r5.getHandle();	 Catch:{ MediaPipeException -> 0x00a8 }
        r5 = (long) r5;	 Catch:{ MediaPipeException -> 0x00a8 }
        goto L_0x00a0;
    L_0x0098:
        r5 = android.opengl.EGL14.eglGetCurrentContext();	 Catch:{ MediaPipeException -> 0x00a8 }
        r5 = r5.getNativeHandle();	 Catch:{ MediaPipeException -> 0x00a8 }
    L_0x00a0:
        r3.a(r4, r5);	 Catch:{ MediaPipeException -> 0x00a8 }
        r2 = r2.b;	 Catch:{ MediaPipeException -> 0x00a8 }
        r2.b();	 Catch:{ MediaPipeException -> 0x00a8 }
    L_0x00a8:
        r2 = r1.e;
        r1 = r1.d;
        r3 = new com.google.mediapipe.framework.AndroidPacketCreator;
        r4 = r2.b;
        r3.<init>(r4);
        r4 = r0.getConfig();
        r5 = android.graphics.Bitmap.Config.ARGB_8888;
        if (r4 != r5) goto L_0x013b;
    L_0x00bb:
        r4 = r3.a;
        r4 = r4.a();
        r4 = r3.nativeCreateRgbaImageFrame(r4, r0);
        r0 = com.google.mediapipe.framework.Packet.create(r4);
        r4 = 0;
        r6 = r2.b;	 Catch:{ MediaPipeException -> 0x00d3 }
        r8 = "video_input";
        r6.a(r8, r0, r4);	 Catch:{ MediaPipeException -> 0x00d3 }
        goto L_0x00d8;
    L_0x00d3:
        r6 = "addGpuPacket: image input return false";
        defpackage.xtl.d(r6);
    L_0x00d8:
        r0.c();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r6 = r1.length;
    L_0x00e1:
        if (r7 >= r6) goto L_0x0104;
    L_0x00e3:
        r8 = r1[r7];
        r9 = defpackage.badu.d;
        r9 = r9.createBuilder();
        r9 = (defpackage.badx) r9;
        r8 = r8.b;
        r9.a(r8);
        r8 = 1;
        r9.a(r8);
        r8 = r9.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.badu) r8;
        r0.add(r8);
        r7 = r7 + 1;
        goto L_0x00e1;
    L_0x0104:
        r1 = defpackage.badw.e;
        r1 = r1.createBuilder();
        r1 = (defpackage.badz) r1;
        r1.a(r0);
        r0 = r1.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.badw) r0;
        r1 = new java.lang.String;
        r0 = r0.toByteArray();
        r6 = "UTF-8";
        r6 = java.nio.charset.Charset.forName(r6);
        r1.<init>(r0, r6);
        r0 = r3.a(r1);
        r1 = r2.b;	 Catch:{ MediaPipeException -> 0x0132 }
        r2 = "runtime_control";
        r1.a(r2, r0, r4);	 Catch:{ MediaPipeException -> 0x0132 }
        goto L_0x0137;
    L_0x0132:
        r1 = "addGpuPacket: runtime control input return false";
        defpackage.xtl.d(r1);
    L_0x0137:
        r0.c();
        return;
    L_0x013b:
        r0 = new java.lang.RuntimeException;
        r1 = "bitmap must use ARGB_8888 config.";
        r0.<init>(r1);
        goto L_0x0144;
    L_0x0143:
        throw r0;
    L_0x0144:
        goto L_0x0143;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wge.run():void");
    }
}
