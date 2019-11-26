package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: eyh */
public final class eyh implements ezm {
    private final LinkedList a = new LinkedList();
    private View b;

    public final boolean a() {
        return this.b != null;
    }

    public final View b() {
        return this.b;
    }

    public final void a(ezp ezp) {
        if (a()) {
            ezp.a(this.b);
        } else {
            this.a.add(ezp);
        }
    }

    public final void a(View view) {
        this.b = view;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ezp) it.next()).a(view);
        }
        this.a.clear();
    }
}
