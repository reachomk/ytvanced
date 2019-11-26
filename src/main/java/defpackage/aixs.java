package defpackage;

/* renamed from: aixs */
public final class aixs implements xcp {
    private final /* synthetic */ aixn a;

    public aixs(aixn aixn) {
        this.a = aixn;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ahjc.class, ahkn.class};
        } else if (i != 0) {
            if (i == 1) {
                ahkn ahkn = (ahkn) obj;
                if (aipo.c(this.a.b)) {
                    if (ahkn.a.a(airi.INTERSTITIAL_PLAYING, airi.VIDEO_PLAYING) && this.a.h != null) {
                        this.a.h.a();
                        return null;
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (aipo.c(this.a.b) && this.a.h != null) {
            this.a.h.a();
            return null;
        }
        return clsArr;
    }
}
