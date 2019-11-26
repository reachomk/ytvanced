package defpackage;

import android.os.AsyncTask;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* renamed from: gdj */
final class gdj extends AsyncTask {
    private final WeakReference a;

    public gdj(gdf gdf) {
        this.a = new WeakReference(gdf);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPreExecute() {
        gdf gdf = (gdf) this.a.get();
        if (gdf != null && gdf.e != null) {
            gdf.o.setEnabled(false);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        gdf gdf = (gdf) this.a.get();
        if (gdf != null && gdf.e != null) {
            if (bool.booleanValue()) {
                gdf.o.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.quantum_ic_check_circle_white_24, 0, 0);
                gge.a(gdf.e, R.string.reel_video_editor_succeed_save_media);
                gdf.b.postDelayed(new gdi(gdf), 2000);
                return;
            }
            gdf.o.setEnabled(true);
            gge.a(gdf.e, !gdf.f.f ? R.string.reel_video_editor_fail_save_video : R.string.reel_video_editor_fail_save_photo);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ad A:{SYNTHETIC, Splitter:B:72:0x01ad} */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b2 A:{Catch:{ Exception -> 0x0187, IOException -> 0x01b6 }} */
    public final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r22) {
        /*
        r21 = this;
        r1 = r21;
        r0 = r1.a;
        r0 = r0.get();
        r2 = r0;
        r2 = (defpackage.gdf) r2;
        r3 = 0;
        if (r2 != 0) goto L_0x0010;
    L_0x000e:
        goto L_0x01e0;
    L_0x0010:
        r0 = r2.e;
        if (r0 == 0) goto L_0x01e0;
    L_0x0014:
        r4 = java.lang.System.currentTimeMillis();
        r0 = new java.util.Date;
        r0.<init>(r4);
        r6 = new java.text.SimpleDateFormat;
        r7 = java.util.Locale.US;
        r8 = "'VID'_yyyyMMdd_HHmmss";
        r6.<init>(r8, r7);
        r6 = r6.format(r0);
        r0 = android.os.Environment.DIRECTORY_DCIM;
        r0 = android.os.Environment.getExternalStoragePublicDirectory(r0);
        r7 = new java.io.File;
        r8 = "Camera";
        r7.<init>(r0, r8);
        r7.mkdirs();
        r0 = r7.isDirectory();
        if (r0 == 0) goto L_0x01d8;
    L_0x0040:
        r0 = r7.canWrite();
        if (r0 == 0) goto L_0x01d8;
    L_0x0046:
        r0 = r2.f;
        r0 = r0.c;
        r8 = "content:";
        r0 = r0.startsWith(r8);
        r8 = 1;
        r9 = 0;
        r10 = "_data";
        if (r0 == 0) goto L_0x00a5;
    L_0x0056:
        r0 = r2.e;
        r11 = r2.f;
        r11 = r11.c;
        r13 = android.net.Uri.parse(r11);	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        r14 = new java.lang.String[r8];	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        r14[r9] = r10;	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        r12 = r0.getContentResolver();	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r11 = r12.query(r13, r14, r15, r16, r17);	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        r0 = r11.getColumnIndexOrThrow(r10);	 Catch:{ Exception -> 0x0082 }
        r11.moveToFirst();	 Catch:{ Exception -> 0x0082 }
        r0 = r11.getString(r0);	 Catch:{ Exception -> 0x0082 }
        r11.close();
        goto L_0x0094;
    L_0x0080:
        r0 = move-exception;
        goto L_0x009f;
    L_0x0082:
        r0 = move-exception;
        goto L_0x0089;
    L_0x0084:
        r0 = move-exception;
        r11 = r3;
        goto L_0x009f;
    L_0x0087:
        r0 = move-exception;
        r11 = r3;
    L_0x0089:
        r12 = "Failed to get video from media store.";
        defpackage.xtl.a(r12, r0);	 Catch:{ all -> 0x0080 }
        if (r11 == 0) goto L_0x0093;
    L_0x0090:
        r11.close();
    L_0x0093:
        r0 = r3;
    L_0x0094:
        if (r0 == 0) goto L_0x009d;
    L_0x0096:
        r11 = new java.io.File;
        r11.<init>(r0);
        r0 = r11;
        goto L_0x00ae;
    L_0x009d:
        r0 = r3;
        goto L_0x00ae;
    L_0x009f:
        if (r11 == 0) goto L_0x00a4;
    L_0x00a1:
        r11.close();
    L_0x00a4:
        throw r0;
    L_0x00a5:
        r0 = new java.io.File;
        r11 = r2.f;
        r11 = r11.c;
        r0.<init>(r11);
    L_0x00ae:
        if (r0 == 0) goto L_0x01bc;
    L_0x00b0:
        r11 = new java.io.File;
        r12 = java.lang.String.valueOf(r6);
        r13 = r2.f;
        r13 = r13.f;
        r14 = ".mp4";
        if (r13 == 0) goto L_0x00c1;
    L_0x00be:
        r13 = ".jpeg";
        goto L_0x00c2;
    L_0x00c1:
        r13 = r14;
    L_0x00c2:
        r15 = r13.length();
        if (r15 != 0) goto L_0x00ce;
    L_0x00c8:
        r13 = new java.lang.String;
        r13.<init>(r12);
        goto L_0x00d2;
    L_0x00ce:
        r13 = r12.concat(r13);
    L_0x00d2:
        r11.<init>(r7, r13);
        r7 = r11.exists();	 Catch:{ IOException -> 0x01b6 }
        if (r7 != 0) goto L_0x00de;
    L_0x00db:
        r11.createNewFile();	 Catch:{ IOException -> 0x01b6 }
    L_0x00de:
        r7 = new java.io.FileInputStream;	 Catch:{ all -> 0x01a9 }
        r7.<init>(r0);	 Catch:{ all -> 0x01a9 }
        r7 = r7.getChannel();	 Catch:{ all -> 0x01a9 }
        r0 = new java.io.FileOutputStream;	 Catch:{ all -> 0x01a7 }
        r0.<init>(r11);	 Catch:{ all -> 0x01a7 }
        r3 = r0.getChannel();	 Catch:{ all -> 0x01a7 }
        r19 = r7.size();	 Catch:{ all -> 0x01a7 }
        r17 = 0;
        r15 = r3;
        r16 = r7;
        r15.transferFrom(r16, r17, r19);	 Catch:{ all -> 0x01a7 }
        r7.close();	 Catch:{ IOException -> 0x01b6 }
        r3.close();	 Catch:{ IOException -> 0x01b6 }
        r0 = r2.f;	 Catch:{ IOException -> 0x01b6 }
        r3 = r0.f;	 Catch:{ IOException -> 0x01b6 }
        if (r3 != 0) goto L_0x018e;
    L_0x0108:
        r3 = r0.a;	 Catch:{ IOException -> 0x01b6 }
        r7 = r0.b;	 Catch:{ IOException -> 0x01b6 }
        r12 = r0.d;	 Catch:{ IOException -> 0x01b6 }
        r0 = r2.e;	 Catch:{ IOException -> 0x01b6 }
        r0 = r0.getContentResolver();	 Catch:{ IOException -> 0x01b6 }
        r15 = r11.toString();	 Catch:{ IOException -> 0x01b6 }
        r9 = new android.content.ContentValues;	 Catch:{ IOException -> 0x01b6 }
        r8 = 8;
        r9.<init>(r8);	 Catch:{ IOException -> 0x01b6 }
        r8 = "title";
        r9.put(r8, r6);	 Catch:{ IOException -> 0x01b6 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ IOException -> 0x01b6 }
        r8 = r14.length();	 Catch:{ IOException -> 0x01b6 }
        if (r8 != 0) goto L_0x0134;
    L_0x012e:
        r8 = new java.lang.String;	 Catch:{ IOException -> 0x01b6 }
        r8.<init>(r6);	 Catch:{ IOException -> 0x01b6 }
        goto L_0x0138;
    L_0x0134:
        r8 = r6.concat(r14);	 Catch:{ IOException -> 0x01b6 }
    L_0x0138:
        r6 = "_display_name";
        r9.put(r6, r8);	 Catch:{ IOException -> 0x01b6 }
        r6 = "datetaken";
        r8 = java.lang.Long.valueOf(r4);	 Catch:{ IOException -> 0x01b6 }
        r9.put(r6, r8);	 Catch:{ IOException -> 0x01b6 }
        r6 = "date_modified";
        r17 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 / r17;
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ IOException -> 0x01b6 }
        r9.put(r6, r4);	 Catch:{ IOException -> 0x01b6 }
        r4 = "mime_type";
        r5 = "video/mp4";
        r9.put(r4, r5);	 Catch:{ IOException -> 0x01b6 }
        r9.put(r10, r15);	 Catch:{ IOException -> 0x01b6 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01b6 }
        r5 = 23;
        r4.<init>(r5);	 Catch:{ IOException -> 0x01b6 }
        r4.append(r3);	 Catch:{ IOException -> 0x01b6 }
        r3 = "x";
        r4.append(r3);	 Catch:{ IOException -> 0x01b6 }
        r4.append(r7);	 Catch:{ IOException -> 0x01b6 }
        r3 = "resolution";
        r4 = r4.toString();	 Catch:{ IOException -> 0x01b6 }
        r9.put(r3, r4);	 Catch:{ IOException -> 0x01b6 }
        r3 = "duration";
        r4 = java.lang.Long.valueOf(r12);	 Catch:{ IOException -> 0x01b6 }
        r9.put(r3, r4);	 Catch:{ IOException -> 0x01b6 }
        r3 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;	 Catch:{ Exception -> 0x0187 }
        r0.insert(r3, r9);	 Catch:{ Exception -> 0x0187 }
        goto L_0x018e;
    L_0x0187:
        r0 = move-exception;
        r2 = "Failed to add video to media store.";
        defpackage.xtl.a(r2, r0);	 Catch:{ IOException -> 0x01b6 }
        throw r0;	 Catch:{ IOException -> 0x01b6 }
    L_0x018e:
        r0 = new android.content.Intent;	 Catch:{ IOException -> 0x01b6 }
        r3 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE";
        r0.<init>(r3);	 Catch:{ IOException -> 0x01b6 }
        r3 = android.net.Uri.fromFile(r11);	 Catch:{ IOException -> 0x01b6 }
        r0.setData(r3);	 Catch:{ IOException -> 0x01b6 }
        r2 = r2.e;	 Catch:{ IOException -> 0x01b6 }
        r2.sendBroadcast(r0);	 Catch:{ IOException -> 0x01b6 }
        r2 = 1;
        r3 = java.lang.Boolean.valueOf(r2);
        goto L_0x01e0;
    L_0x01a7:
        r0 = move-exception;
        goto L_0x01ab;
    L_0x01a9:
        r0 = move-exception;
        r7 = r3;
    L_0x01ab:
        if (r7 == 0) goto L_0x01b0;
    L_0x01ad:
        r7.close();	 Catch:{ IOException -> 0x01b6 }
    L_0x01b0:
        if (r3 == 0) goto L_0x01b5;
    L_0x01b2:
        r3.close();	 Catch:{ IOException -> 0x01b6 }
    L_0x01b5:
        throw r0;	 Catch:{ IOException -> 0x01b6 }
    L_0x01b6:
        r2 = 0;
        r3 = java.lang.Boolean.valueOf(r2);
        goto L_0x01e0;
    L_0x01bc:
        r0 = r2.e;
        r0 = r0.getResources();
        r2 = r2.f;
        r2 = r2.f;
        if (r2 != 0) goto L_0x01cc;
    L_0x01c8:
        r2 = 2131953522; // 0x7f130772 float:1.9543517E38 double:1.0533249938E-314;
        goto L_0x01cf;
    L_0x01cc:
        r2 = 2131953521; // 0x7f130771 float:1.9543515E38 double:1.0533249933E-314;
    L_0x01cf:
        r0.getString(r2);
        r2 = 0;
        r3 = java.lang.Boolean.valueOf(r2);
        goto L_0x01e0;
    L_0x01d8:
        r0 = new java.lang.RuntimeException;
        r2 = "Camera roll directory not accessible.";
        r0.<init>(r2);
        throw r0;
    L_0x01e0:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdj.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
