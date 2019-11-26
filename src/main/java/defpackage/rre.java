package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;

/* renamed from: rre */
public final class rre extends rrn {
    public final rqy a;

    public rre(Context context, Looper looper, pte pte, pth pth, String str, pyp pyp) {
        super(context, looper, pte, pth, str, pyp);
        this.a = new rqy(context, this.b);
    }

    public final void e() {
        synchronized (this.a) {
            if (i()) {
                try {
                    rqy rqy = this.a;
                    synchronized (rqy.c) {
                        for (rrf rrf : rqy.c.values()) {
                            if (rrf != null) {
                                rqw rqw = (rqw) rqy.a.a();
                                rrf.asBinder();
                                rqw.a(new rrj(2, null, rrf, null, null, null));
                            }
                        }
                        rqy.c.clear();
                    }
                    synchronized (rqy.e) {
                        for (rrb rrb : rqy.e.values()) {
                            if (rrb != null) {
                                ((rqw) rqy.a.a()).a(rrj.a(rrb, null));
                            }
                        }
                        rqy.e.clear();
                    }
                    synchronized (rqy.d) {
                        for (rrc rrc : rqy.d.values()) {
                            if (rrc != null) {
                                rqw rqw2 = (rqw) rqy.a.a();
                                rrc.asBinder();
                                rqw2.a(new rrr(2, null, rrc, null));
                            }
                        }
                        rqy.d.clear();
                    }
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.e();
        }
    }

    public final Location d() {
        rqy rqy = this.a;
        rqy.a.b();
        return ((rqw) rqy.a.a()).a(rqy.b.getPackageName());
    }
}
