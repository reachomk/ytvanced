package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: mtb */
final class mtb implements Callback {
    private final /* synthetic */ mta a;

    public final boolean handleMessage(Message message) {
        boolean f;
        int i;
        int nextInt;
        mta mta = this.a;
        if (mta.p == 4 || !(mta.q.d || mta.a.contains(mta.b.getContext().getPackageName()))) {
            f = mta.f();
        } else {
            f = true;
        }
        boolean d = mta.d();
        boolean e = mta.e();
        if (!f) {
            mta.j++;
        }
        if (!d) {
            mta.k++;
        }
        if (!e) {
            mta.l++;
        }
        if (mta.j >= 3) {
            mta.c.a(mta.m);
            mta.j = 0;
        } else if (mta.k >= 3) {
            mta.c.b(mta.n);
            mta.k = 0;
        } else if (mta.l >= 3) {
            mta.c.c(mta.o);
            mta.l = 0;
        }
        if (f && d) {
            i = mta.e;
            nextInt = mta.d.nextInt(mta.f - i);
        } else {
            i = mta.g;
            nextInt = mta.d.nextInt(mta.h - i);
        }
        mta.i.sendEmptyMessageDelayed(0, (long) (i + nextInt));
        return true;
    }

    /* synthetic */ mtb(mta mta) {
        this.a = mta;
    }
}
