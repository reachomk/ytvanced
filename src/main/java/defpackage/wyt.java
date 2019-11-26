package defpackage;

import android.os.ConditionVariable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: wyt */
public abstract class wyt implements wyi {
    private static final FilenameFilter b = wys.a;
    public final ConditionVariable a;
    private final File c;
    private final Map d;
    private volatile boolean e;

    protected wyt(File file) {
        this.e = false;
        amqw.a(file.isDirectory(), "%s is not a directory", file.getAbsolutePath());
        this.c = file;
        this.a = new ConditionVariable(false);
        this.d = new ConcurrentHashMap();
    }

    public abstract Object a(BufferedInputStream bufferedInputStream);

    public abstract void a(Object obj, BufferedOutputStream bufferedOutputStream);

    private wyt() {
        this.e = false;
        this.c = null;
        this.a = new ConditionVariable(false);
        this.d = amwm.a;
    }

    public final wyt a(Executor executor) {
        this.e = true;
        executor.execute(new wyv(this));
        return this;
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        File[] listFiles = this.c.listFiles(b);
        if (listFiles != null) {
            for (File name : listFiles) {
                this.d.put(name.getName(), "");
            }
        }
    }

    public final Object a(Object obj) {
        Object obj2;
        StringBuilder stringBuilder;
        Throwable th;
        amqw.a(obj);
        InputStream inputStream = null;
        if (this.c != null) {
            c();
            String b = wyt.b(obj);
            File file = new File(this.c, b);
            if (this.d.containsKey(b)) {
                try {
                    InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
                    try {
                        inputStream = a((BufferedInputStream) bufferedInputStream);
                        file.setLastModified(System.currentTimeMillis());
                        wyt.a(bufferedInputStream);
                        obj2 = inputStream;
                    } catch (Exception unused) {
                        obj2 = inputStream;
                        inputStream = bufferedInputStream;
                        try {
                            this.d.remove(b);
                            stringBuilder = new StringBuilder(String.valueOf(b).length() + 53);
                            stringBuilder.append("Error opening cache file (maybe removed). [filename=");
                            stringBuilder.append(b);
                            stringBuilder.append("]");
                            xtl.d(stringBuilder.toString());
                            wyt.a(inputStream);
                            return obj2;
                        } catch (Throwable th2) {
                            th = th2;
                            wyt.a(inputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = bufferedInputStream;
                        wyt.a(inputStream);
                        throw th;
                    }
                } catch (Exception unused2) {
                    obj2 = null;
                    this.d.remove(b);
                    stringBuilder = new StringBuilder(String.valueOf(b).length() + 53);
                    stringBuilder.append("Error opening cache file (maybe removed). [filename=");
                    stringBuilder.append(b);
                    stringBuilder.append("]");
                    xtl.d(stringBuilder.toString());
                    wyt.a(inputStream);
                    return obj2;
                }
                return obj2;
            }
        }
        return null;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0046=Splitter:B:22:0x0046, B:17:0x003e=Splitter:B:17:0x003e} */
    public final void a(java.lang.Object r6, java.lang.Object r7) {
        /*
        r5 = this;
        r0 = "Error creating cache file.";
        defpackage.amqw.a(r6);
        r1 = r5.c;
        if (r1 == 0) goto L_0x0051;
    L_0x0009:
        r5.c();
        r6 = defpackage.wyt.b(r6);
        r1 = new java.io.File;
        r2 = r5.c;
        r1.<init>(r2, r6);
        r2 = 0;
        r3 = new java.io.BufferedOutputStream;	 Catch:{ FileNotFoundException -> 0x0045, IOException -> 0x003d }
        r4 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0045, IOException -> 0x003d }
        r4.<init>(r1);	 Catch:{ FileNotFoundException -> 0x0045, IOException -> 0x003d }
        r1 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r3.<init>(r4, r1);	 Catch:{ FileNotFoundException -> 0x0045, IOException -> 0x003d }
        r5.a(r7, r3);	 Catch:{ FileNotFoundException -> 0x0038, IOException -> 0x0035, all -> 0x0032 }
        r7 = r5.d;	 Catch:{ FileNotFoundException -> 0x0038, IOException -> 0x0035, all -> 0x0032 }
        r1 = "";
        r7.put(r6, r1);	 Catch:{ FileNotFoundException -> 0x0038, IOException -> 0x0035, all -> 0x0032 }
        defpackage.wyt.a(r3);
        return;
    L_0x0032:
        r6 = move-exception;
        r2 = r3;
        goto L_0x004d;
    L_0x0035:
        r6 = move-exception;
        r2 = r3;
        goto L_0x003e;
    L_0x0038:
        r6 = move-exception;
        r2 = r3;
        goto L_0x0046;
    L_0x003b:
        r6 = move-exception;
        goto L_0x004d;
    L_0x003d:
        r6 = move-exception;
    L_0x003e:
        defpackage.xtl.b(r0, r6);	 Catch:{ all -> 0x003b }
        defpackage.wyt.a(r2);
        return;
    L_0x0045:
        r6 = move-exception;
    L_0x0046:
        defpackage.xtl.b(r0, r6);	 Catch:{ all -> 0x003b }
        defpackage.wyt.a(r2);
        return;
    L_0x004d:
        defpackage.wyt.a(r2);
        throw r6;
    L_0x0051:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyt.a(java.lang.Object, java.lang.Object):void");
    }

    public final void a() {
        c();
        if (this.c != null) {
            this.d.clear();
            File[] listFiles = this.c.listFiles(b);
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }
    }

    private static String b(Object obj) {
        int hashCode = obj.hashCode();
        StringBuilder stringBuilder = new StringBuilder(17);
        stringBuilder.append(hashCode);
        stringBuilder.append(".cache");
        return stringBuilder.toString();
    }

    protected static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    protected static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private final void c() {
        amqw.b(this.e, (Object) "init() must be called before calling to this method");
        this.a.block();
    }
}
