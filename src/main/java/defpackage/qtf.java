package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qtf */
public final class qtf extends qsu {
    public qtf(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final List b(qui qui, Context context, qpa qpa, qoh qoh) {
        if (qui.b == null || !this.s) {
            return super.b(qui, context, qpa, qoh);
        }
        int b = qui.b();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.b(qui, context, qpa, qoh));
        arrayList.add(new rcd(qui, "l9ngAoug++lwJa6/HPwzMXGSwMruOOnY/2d16zLXikST+QC8N56qn9rVBD9+3HYT", "J6ni0I45qHkdjFv0IWyYulPFtOX9+fEerwGdTgmifnQ=", qpa, b));
        return arrayList;
    }
}
