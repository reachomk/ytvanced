package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jzx */
final /* synthetic */ class jzx implements OnClickListener {
    private final jzu a;
    private final ajse b;
    private final akor c;

    jzx(jzu jzu, ajse ajse, akor akor) {
        this.a = jzu;
        this.b = ajse;
        this.c = akor;
    }

    public final void onClick(View view) {
        jzu jzu = this.a;
        ajse ajse = this.b;
        akor akor = this.c;
        if (ajse.b != null) {
            if (ajse.g == 2 && jzu.e.c()) {
                ajse.g = 1;
                kae.a(jzu.b, jzu.c, 1, jzu.a.getResources());
            }
            Map hashMap = new HashMap(1);
            String str = "sectionListController";
            hashMap.put(str, akor.a(str));
            jzu.d.a(ajse.b, hashMap);
        }
    }
}
