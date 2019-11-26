package defpackage;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: myz */
public final class myz {
    private final List a = new ArrayList();
    private long b = 0;
    private boolean c;
    private int d = 0;

    public final synchronized void a(int i) {
        this.d = i;
        if (i == 5) {
            this.c = false;
        }
        a();
    }

    public final synchronized void a(long j) {
        this.b = j;
        this.c = true;
        a();
    }

    public final synchronized void a(amle amle) {
        if (amle != null) {
            this.a.add(amle);
            a();
        }
    }

    private final void a() {
        int i = this.d;
        if ((i == 2 || i == 3) && this.c) {
            for (amle a : this.a) {
                try {
                    a.a(this.b);
                } catch (RemoteException unused) {
                    ammj.b("Problem sending getDuration result to client.", new Object[0]);
                }
            }
            this.a.clear();
        }
    }
}
