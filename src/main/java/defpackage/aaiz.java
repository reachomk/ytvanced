package defpackage;

import android.os.Handler;
import java.io.IOException;

/* renamed from: aaiz */
public final class aaiz extends nwn {
    public nwq o;
    public Handler p;

    public aaiz(String str, nwb nwb, nwd nwd, int i) {
        super(str, nwb, nwd, i);
    }

    public final void a(nvz nvz, IOException iOException) {
        super.a(nvz, iOException);
        Handler handler = this.p;
        if (handler != null && this.o != null) {
            handler.post(new aaiy(this, iOException));
        }
    }

    public final void a(nvz nvz) {
        super.a(nvz);
        Handler handler = this.p;
        if (handler != null && this.o != null) {
            handler.post(new aajb(this));
        }
    }
}
