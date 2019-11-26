package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cso */
public abstract class cso extends crr {
    public final ArrayList c = new ArrayList();

    cso(List list) {
        for (int i = 0; i < list.size(); i++) {
            crr crr = (crr) list.get(i);
            if (crr instanceof crt) {
                ArrayList b = ((crt) crr).b();
                if (b.size() > 1) {
                    this.c.add(new cqr(b));
                } else {
                    this.c.add((crr) b.get(0));
                }
            } else if (crr != null) {
                this.c.add(crr);
            } else {
                throw new IllegalStateException("Null element is not allowed in transition set");
            }
        }
    }

    public abstract ctq a(List list);
}
