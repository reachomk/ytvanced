package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: qax */
public final class qax {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
