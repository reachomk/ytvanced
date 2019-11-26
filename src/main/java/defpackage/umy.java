package defpackage;

/* renamed from: umy */
final class umy implements Runnable {
    private final /* synthetic */ umw a;

    umy(umw umw) {
        this.a = umw;
    }

    public final void run() {
        synchronized (this.a.d) {
            if (this.a.e) {
                return;
            }
            while (this.a.d.size() > 0) {
                boolean a;
                umw umw = this.a;
                umw.e = true;
                int intValue = ((Integer) umw.d.peek()).intValue();
                if (intValue == 0) {
                    a = this.a.a(true);
                } else if (intValue != 1) {
                    StringBuilder stringBuilder = new StringBuilder(60);
                    stringBuilder.append("VideoPlayerCodecManager: unknown pending action: ");
                    stringBuilder.append(intValue);
                    ujo.a(stringBuilder.toString());
                    this.a.d.remove();
                } else {
                    a = this.a.a(false);
                }
                if (!a) {
                    break;
                }
                this.a.d.remove();
            }
            this.a.e = false;
        }
    }
}
