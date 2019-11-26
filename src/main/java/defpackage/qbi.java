package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: qbi */
public final class qbi {
    private static String a;
    private static int b;

    public static String a() {
        Throwable th;
        Closeable closeable;
        if (a == null) {
            if (b == 0) {
                b = Process.myPid();
            }
            int i = b;
            String str = null;
            if (i > 0) {
                ThreadPolicy allowThreadDiskReads;
                Closeable bufferedReader;
                try {
                    StringBuilder stringBuilder = new StringBuilder(25);
                    stringBuilder.append("/proc/");
                    stringBuilder.append(i);
                    stringBuilder.append("/cmdline");
                    String stringBuilder2 = stringBuilder.toString();
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    bufferedReader = new BufferedReader(new FileReader(stringBuilder2));
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    try {
                        str = bufferedReader.readLine().trim();
                        qax.a(bufferedReader);
                    } catch (IOException unused) {
                        qax.a(bufferedReader);
                        a = str;
                        return a;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = bufferedReader;
                        qax.a(closeable);
                        throw th;
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                    qax.a(bufferedReader);
                    a = str;
                    return a;
                } catch (Throwable th3) {
                    th = th3;
                    qax.a(closeable);
                    throw th;
                }
            }
            a = str;
        }
        return a;
    }
}
