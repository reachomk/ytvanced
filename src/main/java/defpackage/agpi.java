package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;

/* renamed from: agpi */
public class agpi implements agpk {
    public final Context a;
    public final String b;
    public final xmc c;
    public agph d;
    private final akkq e;
    private final ajgv f;
    private final xta g;
    private final zzf h;
    private final zyw i;
    private final agvs j;
    private final bcaa k;
    private final File l;
    private File m;
    private File n;
    private File o;

    private static File b(Context context, String str) {
        amqw.a((Object) context);
        xvd.a(str);
        File filesDir = context.getFilesDir();
        String str2 = File.separator;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 7) + String.valueOf(str).length());
        stringBuilder.append("offline");
        stringBuilder.append(str2);
        stringBuilder.append(str);
        return new File(filesDir, stringBuilder.toString());
    }

    private static boolean a(xmc xmc, agvs agvs) {
        return agvs.k() && xmc.a(agvs.a(xmc));
    }

    public static File a(Context context, String str) {
        amqw.a((Object) context);
        xvd.a(str);
        if (context.getExternalFilesDir(null) == null) {
            return null;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        String str2 = File.separator;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 7) + String.valueOf(str).length());
        stringBuilder.append("offline");
        stringBuilder.append(str2);
        stringBuilder.append(str);
        return new File(externalFilesDir, stringBuilder.toString());
    }

    public static File a(xmc xmc, String str, String str2) {
        amqw.a((Object) xmc);
        xvd.a(str2);
        if (!xmc.a(str)) {
            return null;
        }
        File b = xmc.b(str);
        str = File.separator;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length());
        stringBuilder.append("offline");
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return new File(b, stringBuilder.toString());
    }

    public static void a(Context context, xmc xmc, String str) {
        agpi.b(agpi.b(context, str));
        agpi.b(agpi.a(context, str));
        for (Entry entry : xmc.b().entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                agpi.b(agpi.a(xmc, (String) entry.getKey(), str));
            }
        }
    }

    private static void b(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            try {
                agpi.c(file);
                file.delete();
            } catch (IOException e) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                String str = "Failed to delete directory ";
                xtl.b(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), e);
            }
        }
    }

    public agpi(Context context, String str, akkq akkq, ajgv ajgv, xmc xmc, xta xta, zzf zzf, zyw zyw, agvs agvs, bcaa bcaa) {
        this.a = context;
        this.b = str;
        this.e = akkq;
        this.f = ajgv;
        this.c = xmc;
        this.g = xta;
        this.h = zzf;
        this.i = zyw;
        this.j = agvs;
        this.k = bcaa;
        this.l = new File(agpi.b(context, str), "data");
    }

    public final boolean a() {
        return agpi.a(this.c, this.j);
    }

    public static void a(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            try {
                agpi.c(file);
                file.delete();
            } catch (IOException e) {
                String valueOf = String.valueOf(file);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 27);
                stringBuilder.append("Failed to delete directory ");
                stringBuilder.append(valueOf);
                xtl.b(stringBuilder.toString(), e);
            }
        }
    }

    public final File a(String str) {
        xvd.a(str);
        if (this.n == null) {
            this.n = new File(this.l, "videos");
        }
        return new File(this.n, str);
    }

    public final File b(String str) {
        if (this.o == null) {
            this.o = new File(this.l, "playlists");
        }
        return new File(this.o, str);
    }

    public final File c(String str) {
        if (this.m == null) {
            this.m = new File(this.l, "channels");
        }
        return new File(this.m, str);
    }

    private static File a(File file, Uri uri) {
        amqw.a((Object) uri);
        xvd.a(uri.toString());
        int hashCode = uri.toString().hashCode();
        amqw.a((Object) uri);
        String uri2 = uri.toString();
        int lastIndexOf = uri2.lastIndexOf(46);
        Object substring = (lastIndexOf <= 0 || lastIndexOf <= uri2.lastIndexOf(47) || lastIndexOf == uri2.length() - 1) ? "" : uri2.substring(lastIndexOf);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(substring).length() + 11);
        stringBuilder.append(hashCode);
        stringBuilder.append(substring);
        return new File(file, String.valueOf(stringBuilder.toString()));
    }

    public final File a(String str, Uri uri) {
        return agpi.a(e(str), uri);
    }

    private final File d(String str, Uri uri) {
        return agpi.a(f(str), uri);
    }

    private final File e(String str) {
        return new File(a(str), "thumbnails");
    }

    private final File f(String str) {
        return new File(a(str), "tmpthumbnails");
    }

    public final File b(String str, Uri uri) {
        return agpi.a(d(str), uri);
    }

    public final File d(String str) {
        xvd.a(str);
        return new File(b(str), "thumbnails");
    }

    public final File c(String str, Uri uri) {
        return agpi.a(g(str), uri);
    }

    private final File g(String str) {
        return new File(c(str), "thumbnails");
    }

    public final void a(agqp agqp) {
        amqw.a((Object) agqp);
        amqw.a(agqp.e);
        xak.b();
        List arrayList = new ArrayList();
        apxn a = this.i.a();
        if ((a.a & 524288) != 0) {
            avnm avnm = a.l;
            if (avnm == null) {
                avnm = avnm.q;
            }
            for (Integer add : avnm.d) {
                arrayList.add(add);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Integer.valueOf(240));
            arrayList.add(Integer.valueOf(480));
        }
        aygk aygk = agqp.e.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        for (aafo aafo : new aaft(ahdh.a(aygk, arrayList)).a) {
            File a2 = a(agqp.a(), aafo.a());
            anbk.c(a2);
            a(aafo.a(), a2);
        }
    }

    public final void b(agqp agqp) {
        amqw.a((Object) agqp);
        amqw.a(agqp.e);
        xak.b();
        List arrayList = new ArrayList();
        apxn a = this.i.a();
        if ((a.a & 524288) != 0) {
            avnm avnm = a.l;
            if (avnm == null) {
                avnm = avnm.q;
            }
            for (Integer add : avnm.d) {
                arrayList.add(add);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Integer.valueOf(240));
            arrayList.add(Integer.valueOf(480));
        }
        aygk aygk = agqp.e.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        aaft aaft = new aaft(ahdh.a(aygk, arrayList));
        String a2 = agqp.a();
        for (aafo aafo : aaft.a) {
            try {
                File d = d(a2, aafo.a());
                anbk.c(d);
                a(aafo.a(), d);
            } catch (IOException | ExecutionException unused) {
                agpi.a(f(a2));
                return;
            }
        }
        agpi.a(e(a2));
        try {
            for (aafo aafo2 : aaft.a) {
                File d2 = d(a2, aafo2.a());
                File a3 = a(a2, aafo2.a());
                anbk.c(a3);
                anbk.b(d2, a3);
            }
        } finally {
            agpi.a(f(a2));
        }
    }

    public final aaft a(String str, aaft aaft) {
        List arrayList = new ArrayList();
        for (aafo aafo : aaft.a) {
            File a = a(str, aafo.a());
            if (a.exists()) {
                arrayList.add(new aafo(Uri.fromFile(a), aafo.a, aafo.b));
            }
        }
        aaft aaft2 = new aaft(arrayList);
        return !aaft2.a.isEmpty() ? aaft2 : aaft;
    }

    public final String a(String str, ajis ajis) {
        xvd.a(str);
        amqw.a((Object) ajis);
        xak.b();
        wxf a = wxf.a();
        this.f.b(new ajgu(ajis), a);
        amqw.a((Object) ajis);
        File file = new File(a(str), "subtitles");
        String str2 = ajis.a;
        int hashCode = ajis.hashCode();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 12);
        stringBuilder.append(str2);
        stringBuilder.append('_');
        stringBuilder.append(hashCode);
        File file2 = new File(file, stringBuilder.toString());
        anbk.c(file2);
        anbk.a((byte[]) a.get(), file2);
        return file2.getAbsolutePath();
    }

    public final void a(agqi agqi) {
        amqw.a((Object) agqi);
        amqw.a(agqi.i);
        xak.b();
        for (aafo aafo : new aaft(ahdh.a(a(agqi.i), Collections.singletonList(Integer.valueOf(480)))).a) {
            File b = b(agqi.a, aafo.a());
            anbk.c(b);
            a(aafo.a(), b);
        }
    }

    public final aaft b(String str, aaft aaft) {
        List arrayList = new ArrayList();
        for (aafo aafo : aaft.a) {
            File b = b(str, aafo.a());
            if (b.exists()) {
                arrayList.add(new aafo(Uri.fromFile(b), aafo.a, aafo.b));
            }
        }
        aaft aaft2 = new aaft(arrayList);
        return !aaft2.a.isEmpty() ? aaft2 : aaft;
    }

    public final void a(agpy agpy) {
        amqw.a((Object) agpy);
        xak.b();
        String str = agpy.a;
        avna avna = agpy.d.b;
        if (avna == null) {
            avna = avna.g;
        }
        aygk aygk = avna.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        if (c(str, new aaft(aygk)).a.isEmpty()) {
            str = agpy.a;
            xvd.a(str);
            agpi.a(g(str));
            amqw.a((Object) agpy);
            xak.b();
            avna avna2 = agpy.d.b;
            if (avna2 == null) {
                avna2 = avna.g;
            }
            aygk aygk2 = avna2.c;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
            for (aafo aafo : new aaft(ahdh.a(aygk2, Collections.singletonList(Integer.valueOf(240)))).a) {
                File c = c(agpy.a, aafo.a());
                anbk.c(c);
                a(aafo.a(), c);
            }
        }
    }

    public final aaft c(String str, aaft aaft) {
        List arrayList = new ArrayList();
        for (aafo aafo : aaft.a) {
            File c = c(str, aafo.a());
            if (c.exists()) {
                arrayList.add(new aafo(Uri.fromFile(c), aafo.a, aafo.b));
            }
        }
        return new aaft(arrayList);
    }

    private final void a(Uri uri, File file) {
        wxf a = wxf.a();
        ((afsk) this.k.get()).a(uri, a);
        long longValue = ((Long) a.get()).longValue();
        File parentFile = file.getParentFile();
        if (parentFile == null || xve.a(this.h, parentFile) < longValue) {
            throw new agxm(file.length());
        }
        a = wxf.a();
        this.e.c(uri, a);
        anbk.a((byte[]) a.get(), file);
    }

    @Deprecated
    private static void c(File file) {
        if (file == null || !file.isDirectory()) {
            xtl.d("Failed to delete directory since the directory file is null or it is not a directory ");
        } else if (file.getCanonicalPath().equals(file.getAbsolutePath())) {
            File[] listFiles = file.listFiles();
            StringBuilder stringBuilder;
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    amqw.a((Object) file2);
                    if (file2.isDirectory()) {
                        agpi.c(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        String valueOf = String.valueOf(file2);
                        stringBuilder = new StringBuilder(valueOf.length() + 17);
                        stringBuilder.append("Failed to delete ");
                        stringBuilder.append(valueOf);
                        throw new IOException(stringBuilder.toString());
                    }
                }
                return;
            }
            String valueOf2 = String.valueOf(file);
            stringBuilder = new StringBuilder(valueOf2.length() + 24);
            stringBuilder.append("Error listing files for ");
            stringBuilder.append(valueOf2);
            throw new IOException(stringBuilder.toString());
        }
    }

    public aygk a(avoq avoq) {
        if ((avoq.a & 2) == 0) {
            return null;
        }
        aygk aygk = avoq.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        return aygk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    public final java.io.File a(int r13) {
        /*
        r12 = this;
        r0 = r12.a;
        r1 = r12.j;
        r2 = r12.c;
        r3 = r12.b;
        r4 = defpackage.agpi.a(r2, r1);
        if (r4 == 0) goto L_0x0017;
    L_0x000e:
        r1 = r1.a(r2);
        r1 = defpackage.amqp.b(r1);
        goto L_0x0019;
    L_0x0017:
        r1 = defpackage.ampo.a;
    L_0x0019:
        r5 = 3;
        r6 = "youtube";
        r7 = 0;
        if (r13 == r5) goto L_0x0021;
    L_0x001f:
        goto L_0x0097;
    L_0x0021:
        if (r4 != 0) goto L_0x0097;
    L_0x0023:
        r13 = r1.a();
        if (r13 == 0) goto L_0x0081;
    L_0x0029:
        r13 = r1.b();
        r13 = (java.lang.String) r13;
        r13 = r2.b(r13);
        if (r13 != 0) goto L_0x0037;
    L_0x0035:
        r13 = r7;
        goto L_0x008c;
    L_0x0037:
        r13 = r13.getParentFile();
        if (r13 == 0) goto L_0x004e;
    L_0x003d:
        r13 = r13.getParentFile();
        if (r13 == 0) goto L_0x004e;
    L_0x0043:
        r13 = r13.getParentFile();
        if (r13 == 0) goto L_0x004e;
    L_0x0049:
        r13 = r13.getParentFile();
        goto L_0x004f;
    L_0x004e:
        r13 = r7;
    L_0x004f:
        if (r13 == 0) goto L_0x0035;
    L_0x0051:
        r4 = new java.io.File;
        r5 = android.os.Environment.DIRECTORY_DOWNLOADS;
        r8 = java.io.File.separator;
        r9 = java.lang.String.valueOf(r5);
        r9 = r9.length();
        r10 = java.lang.String.valueOf(r8);
        r10 = r10.length();
        r11 = new java.lang.StringBuilder;
        r9 = r9 + 7;
        r9 = r9 + r10;
        r11.<init>(r9);
        r11.append(r5);
        r11.append(r8);
        r11.append(r6);
        r5 = r11.toString();
        r4.<init>(r13, r5);
        r13 = r4;
        goto L_0x008c;
    L_0x0081:
        r13 = new java.io.File;
        r4 = android.os.Environment.DIRECTORY_DOWNLOADS;
        r4 = android.os.Environment.getExternalStoragePublicDirectory(r4);
        r13.<init>(r4, r6);
    L_0x008c:
        if (r13 != 0) goto L_0x0095;
    L_0x008e:
        r13 = "Failed to find external YTB download directory. Falling back to internal YTB";
        defpackage.xtl.c(r13);
        r13 = 4;
        goto L_0x0097;
    L_0x0095:
        r7 = r13;
        goto L_0x00bc;
    L_0x0097:
        r4 = r1.a();
        if (r4 == 0) goto L_0x00a8;
    L_0x009d:
        r0 = r1.b();
        r0 = (java.lang.String) r0;
        r0 = defpackage.agpi.a(r2, r0, r3);
        goto L_0x00ac;
    L_0x00a8:
        r0 = defpackage.agpi.a(r0, r3);
    L_0x00ac:
        if (r0 == 0) goto L_0x00bc;
    L_0x00ae:
        r13 = defpackage.agmn.a(r13);
        if (r13 == 0) goto L_0x00b5;
    L_0x00b4:
        goto L_0x00b7;
    L_0x00b5:
        r6 = "streams";
    L_0x00b7:
        r7 = new java.io.File;
        r7.<init>(r0, r6);
    L_0x00bc:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agpi.a(int):java.io.File");
    }
}
