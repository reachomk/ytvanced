package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jpg */
final class jpg implements OnClickListener {
    private final /* synthetic */ apxu a;
    private final /* synthetic */ jpe b;

    jpg(jpe jpe, apxu apxu) {
        this.b = jpe;
        this.a = apxu;
    }

    public final void onClick(View view) {
        Map hashMap = new HashMap(2);
        hashMap.put("parent_csn", this.b.d);
        hashMap.put("parent_ve_type", Integer.valueOf(this.b.e));
        this.b.c.a(this.a, hashMap);
    }
}
