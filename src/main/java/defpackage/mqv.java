package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.RemoteDataBus;

/* renamed from: mqv */
public final class mqv implements xcp {
    private final xhv a;
    private final RemoteDataBus b;

    public mqv(xhv xhv, RemoteDataBus remoteDataBus) {
        this.a = xhv;
        this.b = remoteDataBus;
    }

    private final void a(int i) {
        this.b.a(new ngr(i));
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ahjc.class};
        } else if (i == 0) {
            int i2 = ((ahjc) obj).h;
            i = i2 - 1;
            if (i2 != 0) {
                switch (i) {
                    case 1:
                    case 2:
                    case 12:
                        a(0);
                        break;
                    case 3:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                        if (!this.a.c()) {
                            a(1);
                            break;
                        }
                        a(9);
                        break;
                    case 4:
                    case 5:
                        a(7);
                        break;
                    default:
                        if (ahje.a(i2)) {
                            a(10);
                            return null;
                        }
                        break;
                }
            }
            throw null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
