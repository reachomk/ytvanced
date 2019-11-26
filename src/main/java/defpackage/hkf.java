package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: hkf */
public final class hkf implements xcp {
    public final ScheduledExecutorService a;
    public final ahdm b;
    public final bcaa c;
    public anjv d;
    private final swm e;

    public hkf(ScheduledExecutorService scheduledExecutorService, swm swm, ahdm ahdm, bcaa bcaa) {
        this.a = scheduledExecutorService;
        this.e = swm;
        this.b = ahdm;
        this.c = bcaa;
    }

    public final void a(String str) {
        swm swm = this.e;
        String a = hkc.a(str);
        azal azal = azal.DOWNLOAD_STATE_COMPLETE;
        avry avry = (avry) avrw.f.createBuilder();
        avry.a(hkc.a(str));
        avry.copyOnWrite();
        avrw avrw = (avrw) avry.instance;
        if (azal != null) {
            avrw.a |= 2;
            avrw.c = azal.c;
            swm.a(a, ((avrw) ((anxl) avry.build())).toByteArray());
            return;
        }
        throw new NullPointerException();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{aglm.class, agll.class};
        } else if (i == 0) {
            aglm aglm = (aglm) obj;
            if (aglm.a.u() == agqs.PLAYABLE) {
                a(aglm.a.a());
                return null;
            }
        } else if (i == 1) {
            this.e.a(hkc.a(((agll) obj).a));
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
