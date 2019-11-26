package defpackage;

import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/* renamed from: ucm */
public final class ucm {
    public static long a(File[] fileArr) {
        long j;
        Throwable e;
        String str = "DirStatsCapture";
        try {
            int length = fileArr.length;
            j = 0;
            int i = 0;
            while (i < length) {
                try {
                    File file = fileArr[i];
                    if (!ucm.a(file)) {
                        long length2;
                        if (file.isFile()) {
                            length2 = file.length();
                        } else if (file.isDirectory()) {
                            length2 = ucm.a(file.listFiles());
                        } else {
                            tyv.d(str, "not a link / dir / regular file: %s", file);
                        }
                        j += length2;
                    }
                    i++;
                } catch (IOException | SecurityException e2) {
                    e = e2;
                    tyv.b(str, "failure computing subtree size", e, new Object[0]);
                    return j;
                }
            }
        } catch (IOException | SecurityException e3) {
            e = e3;
            j = 0;
            tyv.b(str, "failure computing subtree size", e, new Object[0]);
            return j;
        }
        return j;
    }

    static boolean a(File file) {
        if (VERSION.SDK_INT >= 26) {
            return Files.isSymbolicLink(file.toPath());
        }
        try {
            File file2 = new File(file.getParentFile().getCanonicalFile(), file.getName());
            file = file2.getCanonicalFile().equals(file2.getAbsoluteFile());
            return file ^ 1;
        } catch (IOException unused) {
            tyv.d("DirStatsCapture", "Could not check symlink for file: %s, assuming symlink.", file);
            return true;
        }
    }
}
