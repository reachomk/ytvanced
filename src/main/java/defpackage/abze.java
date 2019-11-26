package defpackage;

/* renamed from: abze */
final class abze implements Runnable {
    private final /* synthetic */ abza a;

    abze(abza abza) {
        this.a = abza;
    }

    public final void run() {
        abzi abzi = this.a.b;
        synchronized (abzi) {
            for (abzk abzk : abzi.f) {
                try {
                    abzk.a(abzi.b);
                } catch (Exception e) {
                    String valueOf = String.valueOf(abzk);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 48);
                    stringBuilder.append("error on RenderScheduler thread while releasing ");
                    stringBuilder.append(valueOf);
                    xtl.a(stringBuilder.toString(), e);
                }
            }
            abyq abyq = abzi.b;
            if (abyq != null) {
                abyq.a();
                abzi.b = null;
            }
        }
    }
}
