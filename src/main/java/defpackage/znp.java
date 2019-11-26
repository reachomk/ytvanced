package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: znp */
public final class znp {
    public File a;
    public final Context b;
    public final xhf c;
    public final Object d = new Object();
    public final List e = new ArrayList();
    public final znt f;
    private volatile boolean g;

    public znp(Context context, xhf xhf, znt znt) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (xhf) amqw.a((Object) xhf);
        this.f = (znt) amqw.a((Object) znt);
    }

    /* Access modifiers changed, original: final */
    public final String[] a() {
        String[] strArr;
        xak.b();
        c();
        synchronized (this.d) {
            strArr = new String[this.e.size()];
            this.e.toArray(strArr);
        }
        return strArr;
    }

    /* Access modifiers changed, original: final */
    public final String b() {
        return String.valueOf(znp.a(this.b).getAbsolutePath()).concat("/");
    }

    private static File a(Context context) {
        File file = new File(context.getFilesDir(), zjz.a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final void c() {
        xak.b();
        if (!this.g) {
            Context context = this.b;
            xak.b();
            File a = znp.a(context);
            AssetManager assets = context.getAssets();
            try {
                String[] list = assets.list("kazoo");
                if (list != null) {
                    if (r4 != 0) {
                        for (String str : list) {
                            String str2;
                            String path = new File("kazoo", str2).getPath();
                            File file = new File(a, str2);
                            if (!file.exists()) {
                                try {
                                    file.createNewFile();
                                    InputStream open = assets.open(path);
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    znp.a(open, fileOutputStream);
                                    open.close();
                                    fileOutputStream.close();
                                } catch (IOException | SecurityException e) {
                                    str2 = String.valueOf(str2);
                                    String str3 = "Error saving asset: ";
                                    if (str2.length() == 0) {
                                        str2 = new String(str3);
                                    } else {
                                        str2 = str3.concat(str2);
                                    }
                                    xtl.a(str2, e);
                                }
                            }
                        }
                    }
                }
            } catch (IOException unused) {
            }
            this.a = a;
            synchronized (this.d) {
                try {
                    for (File file2 : this.a.listFiles()) {
                        if (file2.isFile()) {
                            this.e.add(file2.getName());
                        }
                    }
                } catch (SecurityException e2) {
                    xtl.a("Error finding built-in assets: ", e2);
                }
            }
            this.c.a();
            this.g = true;
        }
    }

    static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
