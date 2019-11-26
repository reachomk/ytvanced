package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.Map;

/* renamed from: abvx */
final class abvx extends aaj {
    private final /* synthetic */ apxu b;
    private final /* synthetic */ Map c;
    private final /* synthetic */ abvm d;

    abvx(abvm abvm, apxu apxu, Map map) {
        this.d = abvm;
        this.b = apxu;
        this.c = map;
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.a(view, i, bundle);
        }
        this.d.c.a(this.b, this.c);
        return true;
    }
}
