package defpackage;

import java.io.File;
import java.nio.charset.Charset;

/* renamed from: foz */
public final class foz {
    public static String a(int i) {
        try {
            StringBuilder stringBuilder = new StringBuilder(25);
            stringBuilder.append("/proc/");
            stringBuilder.append(i);
            stringBuilder.append("/cmdline");
            String str = new String(anbk.a(new File(stringBuilder.toString())).b(), Charset.forName("iso-8859-1"));
            int indexOf = str.indexOf(0);
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return str;
        } catch (Error | Exception unused) {
            return null;
        }
    }
}
