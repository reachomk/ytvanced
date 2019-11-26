package defpackage;

/* renamed from: bdl */
final class bdl implements bdq {
    bdl() {
    }

    public final boolean a(float[] fArr) {
        float f = fArr[2];
        if (f < 0.95f && f > 0.05f) {
            f = fArr[0];
            if (f < 10.0f || f > 37.0f || fArr[1] > 0.82f) {
                return true;
            }
        }
        return false;
    }
}
