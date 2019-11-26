package defpackage;

/* renamed from: amx */
final class amx implements Runnable {
    private final /* synthetic */ amy a;

    amx(amy amy) {
        this.a = amy;
    }

    public final void run() {
        amy amy = this.a;
        int i = amy.o;
        if (i == 1) {
            amy.n.cancel();
        } else if (i != 2) {
            return;
        }
        amy.o = 3;
        amy.n.setFloatValues(new float[]{((Float) amy.n.getAnimatedValue()).floatValue(), 0.0f});
        amy.n.setDuration(500);
        amy.n.start();
    }
}
