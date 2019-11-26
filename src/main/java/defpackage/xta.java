package defpackage;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xta */
public final class xta {
    public static long a() {
        return "mounted".equals(Environment.getExternalStorageState()) ? xta.a(Environment.getExternalStorageDirectory()) : 0;
    }

    public static long a(File file) {
        long j = 0;
        if (file != null && file.exists()) {
            try {
                StatFs statFs = new StatFs(file.getAbsolutePath());
                long availableBlocksLong = statFs.getAvailableBlocksLong();
                j = statFs.getBlockSizeLong();
                return availableBlocksLong * j;
            } catch (IllegalArgumentException unused) {
            }
        }
        return j;
    }

    public static void a(File... fileArr) {
        if (fileArr != null) {
            if (r0 != 0) {
                try {
                    List arrayList = new ArrayList(r0 + 2);
                    arrayList.add("rm");
                    arrayList.add("-r");
                    for (File absolutePath : fileArr) {
                        arrayList.add(absolutePath.getAbsolutePath());
                    }
                    xta.a(arrayList);
                } catch (IOException | InterruptedException e) {
                    String valueOf = String.valueOf(fileArr[0]);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 28);
                    stringBuilder.append("Unable to remove the files: ");
                    stringBuilder.append(valueOf);
                    xtl.a(stringBuilder.toString(), e);
                }
            }
        }
    }

    public static void b(File file) {
        if (file != null && !file.isFile()) {
            xta.a(file.listFiles(xsz.a));
        }
    }

    public static void a(List list) {
        Runtime.getRuntime().exec((String[]) list.toArray(new String[list.size()])).waitFor();
    }
}
