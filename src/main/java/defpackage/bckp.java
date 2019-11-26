package defpackage;

import org.chromium.base.ApplicationStatus;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: bckp */
public final class bckp extends bcke implements bchj {
    private boolean b;

    /* Access modifiers changed, original: protected|final */
    public final void a(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.a = networkChangeNotifierAutoDetect;
        ApplicationStatus.a(this);
        int stateForApplication = ApplicationStatus.getStateForApplication();
        if (stateForApplication != 1) {
            if (stateForApplication == 2) {
                this.a.a();
            }
            return;
        }
        a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        if (!this.b) {
            bchv bchv = ApplicationStatus.b;
            int indexOf = bchv.a.indexOf(this);
            if (indexOf != -1) {
                if (bchv.b == 0) {
                    bchv.a.remove(indexOf);
                } else {
                    bchv.d = true;
                    bchv.a.set(indexOf, null);
                }
                bchv.c--;
            }
            this.b = true;
        }
    }
}
