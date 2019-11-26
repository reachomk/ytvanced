package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: aql */
public final class aql extends aaj {
    private final aqi b;

    public aql(aqi aqi) {
        this.b = aqi;
    }

    public final void a(View view, aca aca) {
        super.a(view, aca);
        if (!this.b.a()) {
            apn apn = this.b.b.n;
            if (apn != null) {
                apn.a(view, aca);
            }
        }
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (!this.b.a()) {
            apn apn = this.b.b.n;
            if (apn != null) {
                RecyclerView recyclerView = apn.j;
                apw apw = recyclerView.e;
                aqh aqh = recyclerView.L;
            }
        }
        return false;
    }
}
