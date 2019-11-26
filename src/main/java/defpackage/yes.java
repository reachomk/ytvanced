package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yes */
final class yes implements OnClickListener {
    private final /* synthetic */ yep a;

    yes(yep yep) {
        this.a = yep;
    }

    public final void onClick(View view) {
        yep yep = this.a;
        Map hashMap = new HashMap();
        hashMap.put("permission_requester", yep.n);
        apxu apxu = yep.a;
        if (apxu != null) {
            yep.g.a(apxu, hashMap);
            return;
        }
        apxu = yep.m;
        if (apxu != null) {
            yep.g.a(apxu, hashMap);
        }
    }
}
