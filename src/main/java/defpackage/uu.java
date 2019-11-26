package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uu */
final class uu implements Runnable {
    private final /* synthetic */ vd a;
    private final /* synthetic */ String b;
    private final /* synthetic */ IBinder c;
    private final /* synthetic */ Bundle d;
    private final /* synthetic */ ut e;

    uu(ut utVar, vd vdVar, String str, IBinder iBinder, Bundle bundle) {
        this.e = utVar;
        this.a = vdVar;
        this.b = str;
        this.c = iBinder;
        this.d = bundle;
    }

    public final void run() {
        ub ubVar = (ub) this.e.a.d.get(this.a.a());
        if (ubVar == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("addSubscription for callback that isn't registered id=");
            stringBuilder.append(this.b);
            Log.w("MBServiceCompat", stringBuilder.toString());
            return;
        }
        tv tvVar = this.e.a;
        String str = this.b;
        IBinder iBinder = this.c;
        Bundle bundle = this.d;
        List list = (List) ubVar.e.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (zz zzVar : list) {
            if (iBinder == zzVar.a) {
                Bundle bundle2 = (Bundle) zzVar.b;
                if (bundle != bundle2) {
                    String str2 = "android.media.browse.extra.PAGE_SIZE";
                    String str3 = "android.media.browse.extra.PAGE";
                    if (bundle == null) {
                        if (bundle2.getInt(str3, -1) == -1 && bundle2.getInt(str2, -1) == -1) {
                        }
                    } else if (bundle2 != null) {
                        if (bundle.getInt(str3, -1) == bundle2.getInt(str3, -1) && bundle.getInt(str2, -1) == bundle2.getInt(str2, -1)) {
                        }
                    } else if (bundle.getInt(str3, -1) == -1 && bundle.getInt(str2, -1) == -1) {
                    }
                }
                return;
            }
        }
        list.add(new zz(iBinder, bundle));
        ubVar.e.put(str, list);
        tu tuVar = new tu(tvVar, str, ubVar, str, bundle);
        tvVar.e = ubVar;
        if (bundle == null) {
            tvVar.a(tuVar);
        } else {
            tvVar.b(tuVar);
        }
        tvVar.e = null;
        if (tuVar.a()) {
            tvVar.e = ubVar;
            tvVar.e = null;
            return;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("onLoadChildren must call detach() or sendResult() before returning for package=");
        stringBuilder2.append(ubVar.a);
        stringBuilder2.append(" id=");
        stringBuilder2.append(str);
        throw new IllegalStateException(stringBuilder2.toString());
    }
}
