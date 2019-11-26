package defpackage;

/* renamed from: dxw */
final class dxw implements afsw {
    private final /* synthetic */ dxt a;

    dxw(dxt dxt) {
        this.a = dxt;
    }

    public final void a(bqn bqn) {
        String valueOf = String.valueOf(bqn);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 44);
        stringBuilder.append("DataPlanPromoServiceEndpointCommand failed: ");
        stringBuilder.append(valueOf);
        xtl.c(stringBuilder.toString());
    }
}
