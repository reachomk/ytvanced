package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;

/* renamed from: tu */
final class tu extends ur {
    private final /* synthetic */ ub a;
    private final /* synthetic */ String f;
    private final /* synthetic */ Bundle g;
    private final /* synthetic */ tv h;

    tu(tv tvVar, Object obj, ub ubVar, String str, Bundle bundle) {
        this.h = tvVar;
        this.a = ubVar;
        this.f = str;
        this.g = bundle;
        super(obj);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        if (this.h.d.get(this.a.d.a()) == this.a) {
            List obj2;
            if ((this.e & 1) != 0) {
                obj2 = tv.a(obj2, this.g);
            }
            try {
                this.a.d.a(this.f, obj2, this.g);
            } catch (RemoteException unused) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Calling onLoadChildren() failed for id=");
                stringBuilder.append(this.f);
                stringBuilder.append(" package=");
                stringBuilder.append(this.a.a);
                Log.w("MBServiceCompat", stringBuilder.toString());
            }
        }
    }
}
