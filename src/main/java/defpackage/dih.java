package defpackage;

import android.util.Log;
import java.util.Map.Entry;

/* renamed from: dih */
public final class dih {
    private static dic a;

    public static synchronized void a(dib dib) {
        synchronized (dih.class) {
            StringBuilder stringBuilder;
            String str = dib.c;
            String str2 = dib.b;
            String valueOf = String.valueOf(dib.a);
            if (dib.i == null) {
                dib.i = new dii(dib.j, dib.k);
            }
            dic dic = new dic(str, str2, valueOf, dib.i, dib.d, dib.e, dib.f);
            a = dic;
            int i = dib.g;
            if (i <= 0) {
                stringBuilder = new StringBuilder(47);
                stringBuilder.append("too small batch size :");
                stringBuilder.append(i);
                stringBuilder.append(", changed to 1");
                Log.w("ReporterDefault", stringBuilder.toString());
                i = 1;
            }
            if (i > dic.e) {
                stringBuilder = new StringBuilder(71);
                stringBuilder.append("batch size :");
                stringBuilder.append(i);
                stringBuilder.append(" bigger than buffer size, change to buffer limit");
                Log.w("ReporterDefault", stringBuilder.toString());
            }
            dic.f = i;
            for (Entry entry : dib.h.entrySet()) {
                a.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public static synchronized did a() {
        dic dic;
        synchronized (dih.class) {
            if (a == null) {
                dih.a(new dib());
            }
            dic = a;
        }
        return dic;
    }
}
