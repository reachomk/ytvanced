package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

/* renamed from: epg */
final /* synthetic */ class epg implements OnClickListener {
    private final eph a;
    private final epk b;

    epg(eph eph, epk epk) {
        this.a = eph;
        this.b = epk;
    }

    public final void onClick(View view) {
        eph eph = this.a;
        epk epk = this.b;
        Object obj = eph.c;
        if (obj != null && epk != null) {
            ArrayList arrayList = new ArrayList(((aohe) obj).k);
            aohe aohe = (aohe) eph.c;
            if ((aohe.a & 256) != 0) {
                obj = aohe.j;
                if (obj == null) {
                    obj = apxu.d;
                }
                arrayList.add(obj);
            }
            epk.a(eph.c, arrayList);
        }
    }
}
