package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: agtw */
public final class agtw implements afsk {
    private final xwk a;
    private final xwi b = ajgw.a();

    public agtw(xwk xwk) {
        this.a = (xwk) amqw.a((Object) xwk);
    }

    private static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final /* synthetic */ void a(Object obj, wxg wxg) {
        Exception e;
        Throwable th;
        obj = (ajgu) obj;
        xak.b();
        amqw.a(obj);
        amqw.a(obj.a.g);
        File file = new File(obj.a.g);
        if (file.exists()) {
            InputStream inputStream = null;
            try {
                InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 4096);
                try {
                    wxg.a(obj, (ajjg) ((afqj) this.a.a(bufferedInputStream, this.b)).b());
                    agtw.a(bufferedInputStream);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    inputStream = bufferedInputStream;
                    try {
                        wxg.a(obj, e);
                        agtw.a(inputStream);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        agtw.a(inputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = bufferedInputStream;
                    agtw.a(inputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                wxg.a(obj, e);
                agtw.a(inputStream);
                return;
            }
        }
        wxg.a(obj, new IOException());
    }
}
