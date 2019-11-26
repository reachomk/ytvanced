package defpackage;

import android.os.Bundle;
import android.view.View;

/* renamed from: fh */
final class fh extends aaj {
    private final /* synthetic */ ff b;

    fh(ff ffVar) {
        this.b = ffVar;
    }

    public final void a(View view, aca aca) {
        super.a(view, aca);
        if (this.b.a) {
            aca.a(1048576);
            aca.i(true);
            return;
        }
        aca.i(false);
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            ff ffVar = this.b;
            if (ffVar.a) {
                ffVar.cancel();
                return true;
            }
        }
        return super.a(view, i, bundle);
    }
}
