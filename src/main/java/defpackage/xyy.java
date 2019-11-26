package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Collections;

/* renamed from: xyy */
final /* synthetic */ class xyy implements OnClickListener {
    private final xyv a;

    xyy(xyv xyv) {
        this.a = xyv;
    }

    public final void onClick(View view) {
        xyv xyv = this.a;
        byte[] bArr = xyv.i;
        if (bArr != null) {
            xyv.a.a(3, new acvs(bArr), null);
        }
        apxu apxu = xyv.j;
        if (apxu != null) {
            xyv.b.a(apxu, Collections.singletonMap("edit_conversation_entry_listener", xyv.h));
        }
    }
}
