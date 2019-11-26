package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/* renamed from: duu */
public final class duu implements dus {
    public final fjg a;
    public final LinkedList b;

    public duu(Bundle bundle, fjg fjg) {
        this.a = fjg;
        Collection integerArrayList = bundle != null ? bundle.getIntegerArrayList("tabBackStack") : null;
        if (integerArrayList != null) {
            this.b = new LinkedList(integerArrayList);
        } else {
            this.b = new LinkedList();
        }
        fjg.a(new dut(this));
        fjg.a(new duv(this));
    }

    public final boolean a() {
        if (this.a.d()) {
            return true;
        }
        if (!this.b.isEmpty()) {
            this.a.a(((Integer) this.b.pollFirst()).intValue(), 1);
            return true;
        } else if (this.a.c() == 0) {
            return false;
        } else {
            this.a.a(0, 1);
            return true;
        }
    }

    public final void a(Bundle bundle) {
        bundle.putIntegerArrayList("tabBackStack", new ArrayList(this.b));
    }
}
