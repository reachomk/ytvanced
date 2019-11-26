package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: pox */
public class pox extends ppb {
    public final List h = Collections.synchronizedList(new ArrayList());

    public pox(String str, String str2) {
        super(str, str2);
    }

    public void e() {
        synchronized (this.h) {
            for (pos b : this.h) {
                b.b();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(pos pos) {
        this.h.add(pos);
    }
}
