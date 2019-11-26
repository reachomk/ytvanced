package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fqx */
final class fqx implements OnClickListener {
    private final /* synthetic */ fqu a;

    fqx(fqu fqu) {
        this.a = fqu;
    }

    public final void onClick(View view) {
        xyl xyl = this.a.am.d;
        amqw.a(xyl.c);
        Map hashMap = new HashMap();
        hashMap.put("edit_conversation_entry_listener", xyl);
        xyl.a.a(xyl.c, hashMap);
    }
}
