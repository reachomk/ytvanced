package defpackage;

import java.io.InputStream;

/* renamed from: afno */
public final class afno extends afnp {
    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(xhn xhn) {
        if (xhn == null) {
            return null;
        }
        InputStream a = xhn.a();
        int c = (int) xhn.c();
        Object obj = new byte[(c < 0 ? 16384 : c)];
        int i = 0;
        while (true) {
            try {
                int length = obj.length;
                int read = a.read(obj, i, length - i);
                if (read != -1) {
                    i += read;
                    if (i == length) {
                        if (i == c) {
                            break;
                        }
                        Object obj2 = new byte[(length + length)];
                        System.arraycopy(obj, 0, obj2, 0, length);
                        obj = obj2;
                    }
                } else {
                    a.close();
                    Object obj3 = new byte[i];
                    System.arraycopy(obj, 0, obj3, 0, i);
                    return obj3;
                }
            } finally {
                a.close();
            }
        }
        return obj;
    }
}
