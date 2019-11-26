package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: abnh */
public final class abnh {
    public final abnd a;
    public final Context b;
    public azyg c;

    public abnh(Context context, abnd abnd) {
        this.a = abnd;
        this.b = context;
    }

    public final synchronized void a() {
        if (this.c == null) {
            amqp e = this.a.e();
            if (e.a()) {
                a((String) e.b());
            } else {
                xtl.d("OnDeviceSuggestIndexStore: Index file is absent in SharedPrefrences, probably not fetched yet. No on-device suggestions will be returned until the file is fetched.");
            }
        }
    }

    public final synchronized boolean a(String str) {
        File file = new File(str);
        if (file.exists()) {
            try {
                this.c = new azyg(file.getPath(), this.a.h());
                str = String.valueOf(file);
                StringBuilder stringBuilder = new StringBuilder(str.length() + 70);
                stringBuilder.append("OnDeviceSuggestIndexStore: Successfully created Serving instance from ");
                stringBuilder.append(str);
                xtl.e(stringBuilder.toString());
                return true;
            } catch (IOException e) {
                xtl.a("OnDeviceSuggestIndexStore: Failed to create Serving instance. ", e);
                return false;
            }
        }
        xtl.c("OnDeviceSuggestIndexStore: Index file does not exist.");
        return false;
    }

    public static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
