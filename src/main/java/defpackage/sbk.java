package defpackage;

/* renamed from: sbk */
final class sbk implements Runnable {
    private final /* synthetic */ sap a;

    sbk(sap sap) {
        this.a = sap;
    }

    public final void run() {
        sap sap = this.a;
        if (sap.E != 4 && sap.h()) {
            sap = this.a;
            if (sap.C != null) {
                try {
                    int y = (int) sap.y();
                    if (y > 0) {
                        int z = (int) this.a.z();
                        sap sap2 = this.a;
                        synchronized (sap2.B) {
                            for (sdg b : sap2.B) {
                                b.b(z, y);
                            }
                        }
                    }
                } catch (sbt | sbv e) {
                    sdf.a(sap.r, "Failed to update the progress tracker due to network issues", e);
                }
            }
        }
    }
}
