package defpackage;

import android.os.Handler.Callback;
import android.os.Message;
import android.util.Pair;

@Deprecated
/* renamed from: afes */
abstract class afes implements Callback {
    private final aeuy a;

    afes(aeuy aeuy) {
        this.a = aeuy;
    }

    /* Access modifiers changed, original: protected|final */
    @Deprecated
    public final boolean a(Message message) {
        Pair pair;
        switch (message.what) {
            case 0:
                this.a.a();
                break;
            case 2:
                this.a.c();
                break;
            case 3:
                this.a.d();
                break;
            case 4:
                this.a.e();
                break;
            case 5:
                this.a.g();
                break;
            case 6:
                this.a.h();
                break;
            case 7:
                this.a.f();
                break;
            case 8:
                this.a.a((afif) message.obj);
                break;
            case 9:
                this.a.a(((Long) message.obj).longValue());
                break;
            case 10:
                this.a.b(((Long) message.obj).longValue());
                break;
            case 11:
                this.a.a((aetv) message.obj);
                break;
            case 15:
                this.a.a(message.arg1);
                break;
            case 16:
                pair = (Pair) message.obj;
                this.a.a(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
                break;
            case 18:
                this.a.a(((Float) message.obj).floatValue());
                break;
            case 19:
                pair = (Pair) message.obj;
                this.a.a((String) pair.first, (aevf) pair.second);
                break;
            case 20:
                this.a.a((aett) message.obj);
                break;
            case 21:
                this.a.i();
                break;
            case 24:
                this.a.b(((Integer) message.obj).intValue());
                break;
            case 25:
                this.a.c(((Integer) message.obj).intValue());
                break;
        }
        return true;
    }
}
