package defpackage;

import android.os.IBinder;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: ux */
final class ux implements Runnable {
    private final /* synthetic */ vd a;
    private final /* synthetic */ String b;
    private final /* synthetic */ IBinder c;
    private final /* synthetic */ ut d;

    ux(ut utVar, vd vdVar, String str, IBinder iBinder) {
        this.d = utVar;
        this.a = vdVar;
        this.b = str;
        this.c = iBinder;
    }

    public final void run() {
        ub ubVar = (ub) this.d.a.d.get(this.a.a());
        String str = "MBServiceCompat";
        StringBuilder stringBuilder;
        if (ubVar == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("removeSubscription for callback that isn't registered id=");
            stringBuilder.append(this.b);
            Log.w(str, stringBuilder.toString());
            return;
        }
        tv tvVar = this.d.a;
        String str2 = this.b;
        IBinder iBinder = this.c;
        Object obj = 1;
        Object obj2 = null;
        if (iBinder == null) {
            try {
                if (ubVar.e.remove(str2) == null) {
                    obj = null;
                }
                tvVar.e = ubVar;
                tvVar.e = null;
            } catch (Throwable th) {
                tvVar.e = ubVar;
                tvVar.e = null;
            }
        } else {
            List list = (List) ubVar.e.get(str2);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((zz) it.next()).a) {
                        it.remove();
                        obj2 = 1;
                    }
                }
                if (list.size() == 0) {
                    ubVar.e.remove(str2);
                }
                obj = obj2;
            } else {
                obj = null;
            }
            tvVar.e = ubVar;
            tvVar.e = null;
        }
        if (obj == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("removeSubscription called for ");
            stringBuilder.append(this.b);
            stringBuilder.append(" which is not subscribed");
            Log.w(str, stringBuilder.toString());
        }
    }
}
