package defpackage;

import org.chromium.base.ApplicationStatus;

/* renamed from: bchi */
public final class bchi implements Runnable {
    public final void run() {
        if (ApplicationStatus.a == null) {
            bchk bchk = new bchk();
            ApplicationStatus.a = bchk;
            ApplicationStatus.a(bchk);
        }
    }
}
