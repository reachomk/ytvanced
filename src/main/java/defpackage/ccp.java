package defpackage;

import java.io.InputStream;

/* renamed from: ccp */
public final class ccp implements bsp {
    private final ccb a;
    private final bwb b;

    public ccp(ccb ccb, bwb bwb) {
        this.a = ccb;
        this.b = bwb;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, bsq bsq) {
        return true;
    }

    public final /* synthetic */ bvw a(Object obj, int i, int i2, bsq bsq) {
        Object obj2;
        cho cho;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof ccl) {
            inputStream = (ccl) inputStream;
            obj2 = null;
        } else {
            inputStream = new ccl(inputStream, this.b);
            obj2 = 1;
        }
        synchronized (cho.a) {
            cho = (cho) cho.a.poll();
        }
        if (cho == null) {
            cho = new cho();
        }
        cho.b = inputStream;
        try {
            bvw a = this.a.a(new chu(cho), i, i2, bsq, new ccs(inputStream, cho));
            cho.a();
            if (obj2 != null) {
                inputStream.b();
            }
            return a;
        } catch (Throwable th) {
            cho.a();
            if (obj2 != null) {
                inputStream.b();
            }
        }
    }
}
