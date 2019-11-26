package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: ugi */
public final class ugi {
    public static ArrayList a(String str, String str2) {
        ArrayList arrayList = new ArrayList(r2);
        for (String str3 : str.split("\n")) {
            Object str4;
            int indexOf = str3.indexOf(32);
            String[] split = str3.substring(0, indexOf).split(":");
            boolean z = split.length == 2 && indexOf > 0;
            String str5 = "Invalid license meta-data line:\n";
            if (str3.length() == 0) {
                str4 = new String(str5);
            } else {
                str4 = str5.concat(str3);
            }
            uhy.b(z, str4);
            arrayList.add(new ufz(str3.substring(indexOf + 1), Long.parseLong(split[0]), Integer.parseInt(split[1]), str2));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String a(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return ugi.a(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder))), j, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x002f A:{SYNTHETIC, Splitter:B:25:0x002f} */
    public static java.lang.String a(java.lang.String r2, java.lang.String r3, long r4, int r6) {
        /*
        r0 = 0;
        r1 = new java.util.jar.JarFile;	 Catch:{ IOException -> 0x0024 }
        r1.<init>(r3);	 Catch:{ IOException -> 0x0024 }
        r2 = r1.getJarEntry(r2);	 Catch:{ IOException -> 0x001f, all -> 0x001c }
        if (r2 == 0) goto L_0x0018;
    L_0x000c:
        r2 = r1.getInputStream(r2);	 Catch:{ IOException -> 0x001f, all -> 0x001c }
        r2 = defpackage.ugi.a(r2, r4, r6);	 Catch:{ IOException -> 0x001f, all -> 0x001c }
        r1.close();	 Catch:{ IOException -> 0x0017 }
    L_0x0017:
        return r2;
    L_0x0018:
        r1.close();	 Catch:{ IOException -> 0x001b }
    L_0x001b:
        return r0;
    L_0x001c:
        r2 = move-exception;
        r0 = r1;
        goto L_0x002d;
    L_0x001f:
        r2 = move-exception;
        r0 = r1;
        goto L_0x0025;
    L_0x0022:
        r2 = move-exception;
        goto L_0x002d;
    L_0x0024:
        r2 = move-exception;
    L_0x0025:
        r3 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0022 }
        r4 = "Failed to read license text.";
        r3.<init>(r4, r2);	 Catch:{ all -> 0x0022 }
        throw r3;	 Catch:{ all -> 0x0022 }
    L_0x002d:
        if (r0 == 0) goto L_0x0032;
    L_0x002f:
        r0.close();	 Catch:{ IOException -> 0x0032 }
    L_0x0032:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugi.a(java.lang.String, java.lang.String, long, int):java.lang.String");
    }

    private static String a(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }
}
