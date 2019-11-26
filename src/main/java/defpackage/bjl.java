package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: bjl */
final class bjl implements Callable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ String b;

    bjl(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00aa  */
    public final /* synthetic */ java.lang.Object call() {
        /*
        r9 = this;
        r0 = r9.a;
        r1 = r9.b;
        r2 = new bog;
        r2.<init>(r0, r1);
        r0 = r2.b;
        r1 = 0;
        r3 = 0;
        r4 = r0.b;	 Catch:{ FileNotFoundException -> 0x0080 }
        r5 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x0080 }
        r6 = r0.a;	 Catch:{ FileNotFoundException -> 0x0080 }
        r6 = r6.getCacheDir();	 Catch:{ FileNotFoundException -> 0x0080 }
        r7 = defpackage.boe.JSON;	 Catch:{ FileNotFoundException -> 0x0080 }
        r7 = defpackage.bod.a(r4, r7, r1);	 Catch:{ FileNotFoundException -> 0x0080 }
        r5.<init>(r6, r7);	 Catch:{ FileNotFoundException -> 0x0080 }
        r6 = r5.exists();	 Catch:{ FileNotFoundException -> 0x0080 }
        if (r6 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0040;
    L_0x0027:
        r5 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x0080 }
        r6 = r0.a;	 Catch:{ FileNotFoundException -> 0x0080 }
        r6 = r6.getCacheDir();	 Catch:{ FileNotFoundException -> 0x0080 }
        r7 = defpackage.boe.ZIP;	 Catch:{ FileNotFoundException -> 0x0080 }
        r4 = defpackage.bod.a(r4, r7, r1);	 Catch:{ FileNotFoundException -> 0x0080 }
        r5.<init>(r6, r4);	 Catch:{ FileNotFoundException -> 0x0080 }
        r4 = r5.exists();	 Catch:{ FileNotFoundException -> 0x0080 }
        if (r4 == 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0040;
    L_0x003f:
        r5 = r3;
    L_0x0040:
        if (r5 != 0) goto L_0x0043;
    L_0x0042:
        goto L_0x0080;
    L_0x0043:
        r4 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0080 }
        r4.<init>(r5);	 Catch:{ FileNotFoundException -> 0x0080 }
        r6 = r5.getAbsolutePath();
        r7 = ".zip";
        r6 = r6.endsWith(r7);
        if (r6 == 0) goto L_0x0057;
    L_0x0054:
        r6 = defpackage.boe.ZIP;
        goto L_0x0059;
    L_0x0057:
        r6 = defpackage.boe.JSON;
    L_0x0059:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = "Cache hit for ";
        r7.append(r8);
        r0 = r0.b;
        r7.append(r0);
        r0 = " at ";
        r7.append(r0);
        r0 = r5.getAbsolutePath();
        r7.append(r0);
        r7.toString();
        defpackage.bpb.a();
        r0 = new zz;
        r0.<init>(r6, r4);
        goto L_0x0081;
    L_0x0080:
        r0 = r3;
    L_0x0081:
        if (r0 == 0) goto L_0x00a8;
    L_0x0083:
        r4 = r0.a;
        r4 = (defpackage.boe) r4;
        r0 = r0.b;
        r0 = (java.io.InputStream) r0;
        r5 = defpackage.boe.ZIP;
        if (r4 != r5) goto L_0x009b;
    L_0x008f:
        r4 = new java.util.zip.ZipInputStream;
        r4.<init>(r0);
        r0 = r2.a;
        r0 = defpackage.bjm.a(r4, r0);
        goto L_0x00a1;
    L_0x009b:
        r4 = r2.a;
        r0 = defpackage.bjm.a(r0, r4);
    L_0x00a1:
        r0 = r0.a;
        if (r0 == 0) goto L_0x00a8;
    L_0x00a5:
        r3 = r0;
        r3 = (defpackage.bjj) r3;
    L_0x00a8:
        if (r3 != 0) goto L_0x0265;
    L_0x00aa:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = "Animation for ";
        r0.append(r3);
        r3 = r2.a;
        r0.append(r3);
        r3 = " not found in cache. Fetching from network.";
        r0.append(r3);
        r0.toString();
        defpackage.bpb.a();
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x025d }
        r0.<init>();	 Catch:{ IOException -> 0x025d }
        r3 = "Fetching ";
        r0.append(r3);	 Catch:{ IOException -> 0x025d }
        r3 = r2.a;	 Catch:{ IOException -> 0x025d }
        r0.append(r3);	 Catch:{ IOException -> 0x025d }
        r0.toString();	 Catch:{ IOException -> 0x025d }
        defpackage.bpb.a();	 Catch:{ IOException -> 0x025d }
        r0 = new java.net.URL;	 Catch:{ IOException -> 0x025d }
        r3 = r2.a;	 Catch:{ IOException -> 0x025d }
        r0.<init>(r3);	 Catch:{ IOException -> 0x025d }
        r0 = r0.openConnection();	 Catch:{ IOException -> 0x025d }
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ IOException -> 0x025d }
        r3 = "GET";
        r0.setRequestMethod(r3);	 Catch:{ IOException -> 0x025d }
        r0.connect();	 Catch:{ Exception -> 0x024e }
        r3 = r0.getErrorStream();	 Catch:{ Exception -> 0x024e }
        if (r3 != 0) goto L_0x01e9;
    L_0x00f4:
        r3 = r0.getResponseCode();	 Catch:{ Exception -> 0x024e }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r3 == r4) goto L_0x00fe;
    L_0x00fc:
        goto L_0x01e9;
    L_0x00fe:
        r0.disconnect();	 Catch:{ IOException -> 0x025d }
        r3 = r0.getContentType();	 Catch:{ IOException -> 0x025d }
        r4 = r3.hashCode();
        r5 = -1248325150; // 0xffffffffb59811e2 float:-1.1330087E-6 double:NaN;
        if (r4 == r5) goto L_0x010f;
    L_0x010e:
        goto L_0x0119;
    L_0x010f:
        r4 = "application/zip";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0119;
    L_0x0117:
        r3 = 0;
        goto L_0x011a;
    L_0x0119:
        r3 = -1;
    L_0x011a:
        if (r3 == 0) goto L_0x0140;
    L_0x011c:
        defpackage.bpb.a();	 Catch:{ IOException -> 0x025d }
        r3 = defpackage.boe.JSON;	 Catch:{ IOException -> 0x025d }
        r4 = r2.b;	 Catch:{ IOException -> 0x025d }
        r0 = r0.getInputStream();	 Catch:{ IOException -> 0x025d }
        r0 = r4.a(r0, r3);	 Catch:{ IOException -> 0x025d }
        r4 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x025d }
        r5 = new java.io.File;	 Catch:{ IOException -> 0x025d }
        r0 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x025d }
        r5.<init>(r0);	 Catch:{ IOException -> 0x025d }
        r4.<init>(r5);	 Catch:{ IOException -> 0x025d }
        r0 = r2.a;	 Catch:{ IOException -> 0x025d }
        r0 = defpackage.bjm.a(r4, r0);	 Catch:{ IOException -> 0x025d }
        goto L_0x015f;
    L_0x0140:
        defpackage.bpb.a();	 Catch:{ IOException -> 0x025d }
        r3 = defpackage.boe.ZIP;	 Catch:{ IOException -> 0x025d }
        r4 = r2.b;	 Catch:{ IOException -> 0x025d }
        r0 = r0.getInputStream();	 Catch:{ IOException -> 0x025d }
        r0 = r4.a(r0, r3);	 Catch:{ IOException -> 0x025d }
        r4 = new java.util.zip.ZipInputStream;	 Catch:{ IOException -> 0x025d }
        r5 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x025d }
        r5.<init>(r0);	 Catch:{ IOException -> 0x025d }
        r4.<init>(r5);	 Catch:{ IOException -> 0x025d }
        r0 = r2.a;	 Catch:{ IOException -> 0x025d }
        r0 = defpackage.bjm.a(r4, r0);	 Catch:{ IOException -> 0x025d }
    L_0x015f:
        r4 = r0.a;	 Catch:{ IOException -> 0x025d }
        r5 = 1;
        if (r4 == 0) goto L_0x01cf;
    L_0x0164:
        r2 = r2.b;	 Catch:{ IOException -> 0x025d }
        r4 = r2.b;	 Catch:{ IOException -> 0x025d }
        r3 = defpackage.bod.a(r4, r3, r5);	 Catch:{ IOException -> 0x025d }
        r4 = new java.io.File;	 Catch:{ IOException -> 0x025d }
        r2 = r2.a;	 Catch:{ IOException -> 0x025d }
        r2 = r2.getCacheDir();	 Catch:{ IOException -> 0x025d }
        r4.<init>(r2, r3);	 Catch:{ IOException -> 0x025d }
        r2 = r4.getAbsolutePath();	 Catch:{ IOException -> 0x025d }
        r3 = ".temp";
        r6 = "";
        r2 = r2.replace(r3, r6);	 Catch:{ IOException -> 0x025d }
        r3 = new java.io.File;	 Catch:{ IOException -> 0x025d }
        r3.<init>(r2);	 Catch:{ IOException -> 0x025d }
        r2 = r4.renameTo(r3);	 Catch:{ IOException -> 0x025d }
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x025d }
        r6.<init>();	 Catch:{ IOException -> 0x025d }
        r7 = "Copying temp file to real file (";
        r6.append(r7);	 Catch:{ IOException -> 0x025d }
        r6.append(r3);	 Catch:{ IOException -> 0x025d }
        r7 = ")";
        r6.append(r7);	 Catch:{ IOException -> 0x025d }
        r6.toString();	 Catch:{ IOException -> 0x025d }
        defpackage.bpb.a();	 Catch:{ IOException -> 0x025d }
        if (r2 != 0) goto L_0x01cf;
    L_0x01a6:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x025d }
        r2.<init>();	 Catch:{ IOException -> 0x025d }
        r6 = "Unable to rename cache file ";
        r2.append(r6);	 Catch:{ IOException -> 0x025d }
        r4 = r4.getAbsolutePath();	 Catch:{ IOException -> 0x025d }
        r2.append(r4);	 Catch:{ IOException -> 0x025d }
        r4 = " to ";
        r2.append(r4);	 Catch:{ IOException -> 0x025d }
        r3 = r3.getAbsolutePath();	 Catch:{ IOException -> 0x025d }
        r2.append(r3);	 Catch:{ IOException -> 0x025d }
        r3 = ".";
        r2.append(r3);	 Catch:{ IOException -> 0x025d }
        r2 = r2.toString();	 Catch:{ IOException -> 0x025d }
        defpackage.bpb.a(r2);	 Catch:{ IOException -> 0x025d }
    L_0x01cf:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x025d }
        r2.<init>();	 Catch:{ IOException -> 0x025d }
        r3 = "Completed fetch from network. Success: ";
        r2.append(r3);	 Catch:{ IOException -> 0x025d }
        r3 = r0.a;	 Catch:{ IOException -> 0x025d }
        if (r3 == 0) goto L_0x01de;
    L_0x01dd:
        r1 = 1;
    L_0x01de:
        r2.append(r1);	 Catch:{ IOException -> 0x025d }
        r2.toString();	 Catch:{ IOException -> 0x025d }
        defpackage.bpb.a();	 Catch:{ IOException -> 0x025d }
        goto L_0x026a;
    L_0x01e9:
        r1 = r0.getResponseCode();	 Catch:{ Exception -> 0x024e }
        r3 = new java.io.BufferedReader;	 Catch:{ Exception -> 0x024e }
        r4 = new java.io.InputStreamReader;	 Catch:{ Exception -> 0x024e }
        r5 = r0.getErrorStream();	 Catch:{ Exception -> 0x024e }
        r4.<init>(r5);	 Catch:{ Exception -> 0x024e }
        r3.<init>(r4);	 Catch:{ Exception -> 0x024e }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x024e }
        r4.<init>();	 Catch:{ Exception -> 0x024e }
    L_0x0200:
        r5 = r3.readLine();	 Catch:{ Exception -> 0x0246 }
        if (r5 == 0) goto L_0x020f;
    L_0x0206:
        r4.append(r5);	 Catch:{ Exception -> 0x0246 }
        r5 = 10;
        r4.append(r5);	 Catch:{ Exception -> 0x0246 }
        goto L_0x0200;
    L_0x020f:
        r3.close();	 Catch:{ Exception -> 0x024e }
        r3 = new bkf;	 Catch:{ Exception -> 0x024e }
        r5 = new java.lang.IllegalArgumentException;	 Catch:{ Exception -> 0x024e }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x024e }
        r6.<init>();	 Catch:{ Exception -> 0x024e }
        r7 = "Unable to fetch ";
        r6.append(r7);	 Catch:{ Exception -> 0x024e }
        r2 = r2.a;	 Catch:{ Exception -> 0x024e }
        r6.append(r2);	 Catch:{ Exception -> 0x024e }
        r2 = ". Failed with ";
        r6.append(r2);	 Catch:{ Exception -> 0x024e }
        r6.append(r1);	 Catch:{ Exception -> 0x024e }
        r1 = "\n";
        r6.append(r1);	 Catch:{ Exception -> 0x024e }
        r6.append(r4);	 Catch:{ Exception -> 0x024e }
        r1 = r6.toString();	 Catch:{ Exception -> 0x024e }
        r5.<init>(r1);	 Catch:{ Exception -> 0x024e }
        r3.<init>(r5);	 Catch:{ Exception -> 0x024e }
        r0.disconnect();	 Catch:{ IOException -> 0x025d }
        r0 = r3;
        goto L_0x026a;
    L_0x0244:
        r1 = move-exception;
        goto L_0x0248;
    L_0x0246:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0244 }
    L_0x0248:
        r3.close();	 Catch:{ Exception -> 0x024e }
        throw r1;	 Catch:{ Exception -> 0x024e }
    L_0x024c:
        r1 = move-exception;
        goto L_0x0259;
    L_0x024e:
        r1 = move-exception;
        r2 = new bkf;	 Catch:{ all -> 0x024c }
        r2.<init>(r1);	 Catch:{ all -> 0x024c }
        r0.disconnect();	 Catch:{ IOException -> 0x025d }
        r0 = r2;
        goto L_0x026a;
    L_0x0259:
        r0.disconnect();	 Catch:{ IOException -> 0x025d }
        throw r1;	 Catch:{ IOException -> 0x025d }
    L_0x025d:
        r0 = move-exception;
        r1 = new bkf;
        r1.<init>(r0);
        r0 = r1;
        goto L_0x026a;
    L_0x0265:
        r0 = new bkf;
        r0.<init>(r3);
    L_0x026a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjl.call():java.lang.Object");
    }
}
