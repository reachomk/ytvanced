package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: zjj */
public final class zjj {
    public File a;
    private final long b;
    private final xsc c;

    public zjj(Context context, int i, String str, long j, xsc xsc) {
        File externalFilesDir;
        if (i != 1) {
            externalFilesDir = context.getExternalFilesDir(null);
        } else {
            externalFilesDir = context.getFilesDir();
        }
        if (externalFilesDir != null) {
            File file = new File(externalFilesDir, str);
            try {
                if (!file.exists()) {
                    if (!file.mkdirs()) {
                        file = null;
                    }
                }
                this.a = file;
            } catch (SecurityException e) {
                xtl.a("Error creating cache dir", e);
            }
        }
        this.b = TimeUnit.SECONDS.toMillis(j);
        this.c = xsc;
    }

    public final void a(Set set) {
        xak.b();
        if (this.a != null) {
            long a = this.c.a();
            if (set != null) {
                for (String file : set) {
                    File file2 = new File(this.a, file);
                    try {
                        if (file2.exists()) {
                            file2.setLastModified(a);
                        }
                    } catch (SecurityException e) {
                        xtl.a("Exception in modifying file's last modified timestamp", e);
                    }
                }
            }
            try {
                File[] listFiles = this.a.listFiles();
                if (listFiles != null) {
                    for (File file3 : listFiles) {
                        try {
                            if (a - file3.lastModified() > this.b) {
                                file3.delete();
                            }
                        } catch (SecurityException e2) {
                            xtl.a("Exception in examining/deleting existing file", e2);
                        }
                    }
                }
            } catch (SecurityException e3) {
                xtl.a("Exception in listing directory files", e3);
            }
        }
    }

    public final boolean a(String str, byte[] bArr) {
        xak.b();
        File file = this.a;
        if (file != null) {
            try {
                File file2 = new File(file, str);
                if (file2.exists()) {
                    file2.delete();
                }
                if (!file2.createNewFile()) {
                    return false;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                return true;
            } catch (IOException | SecurityException e) {
                xtl.a("Error saving file", e);
            }
        }
        return false;
    }
}
