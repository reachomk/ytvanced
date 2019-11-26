package defpackage;

import android.os.Looper;

/* renamed from: myo */
public final class myo extends mzn {
    private final msw a;

    public myo(msw msw) {
        this.a = msw;
    }

    public final void a(ngp ngp) {
        msw msw = this.a;
        ngn ngn = ngp.a;
        if (ngn == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            msw.a(ngn);
        } else {
            msw.a.post(new msy(msw, ngn));
        }
    }

    public final void a(ngp[] ngpArr) {
        ngn[] ngnArr = new ngn[ngpArr.length];
        for (int i = 0; i < ngpArr.length; i++) {
            ngnArr[i] = ngpArr[i].a;
        }
        msw msw = this.a;
        if (ngnArr.length == 0) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            msw.a(ngnArr);
        } else {
            msw.a.post(new msv(msw, ngnArr));
        }
    }
}
