package defpackage;

import android.os.SystemClock;
import java.util.Observable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: ajql */
public final class ajql extends Observable implements xcp {
    public final ScheduledExecutorService a;
    public ScheduledFuture b;
    private ajqo c;

    public ajql(ScheduledExecutorService scheduledExecutorService) {
        this.a = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
    }

    public final void a(ahkn ahkn) {
        int ordinal = ahkn.a.ordinal();
        if (ordinal == 6) {
            return;
        }
        if (ordinal == 7) {
            aakj aakj = ahkn.b;
            a();
            if (aakj != null) {
                azdm azdm;
                azdi p = aakj.p();
                if (p != null) {
                    azdm = p.b;
                    if (azdm == null) {
                        azdm = azdm.h;
                    }
                } else {
                    azdm = null;
                }
                if (azdm != null) {
                    this.c = new ajqo(this, azdm, aakj.p());
                    ajqo ajqo = this.c;
                    ajqo.b = SystemClock.elapsedRealtime();
                    ajqo.j = 1;
                }
            }
        } else if (ordinal != 8) {
            a();
        }
    }

    public final void a(ahkr ahkr) {
        ajqo ajqo = this.c;
        if (ajqo != null) {
            switch (ahkr.a) {
                case 2:
                    ajqo.b();
                    ajqo.a(3);
                    break;
                case 3:
                case 6:
                    ajqo.b();
                    ajqo.a(7);
                    return;
                case 4:
                case 7:
                case 8:
                    a();
                    break;
                case 5:
                    ajqo.b();
                    int i = ajqo.j;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    } else if (i2 == 0) {
                        ajqo.a(2);
                        ajqo.a(ajqo.c - ajqo.f);
                        return;
                    } else if (i2 == 2) {
                        ajqo.a(4);
                        ajqo.a(ajqo.d - ajqo.h);
                        return;
                    } else if (i2 == 4 || i2 == 6) {
                        ajqo.a(6);
                        return;
                    } else {
                        return;
                    }
                case 9:
                case 10:
                    ajqo.b();
                    ajqo.a(5);
                    return;
            }
        }
    }

    private final void a() {
        ajqo ajqo = this.c;
        if (ajqo != null) {
            ajqo.a();
            this.c = null;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class, ahkr.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else if (i == 1) {
            a((ahkr) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
