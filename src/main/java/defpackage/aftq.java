package defpackage;

/* renamed from: aftq */
public final class aftq {
    public static boolean a(bqn bqn) {
        if (bqn instanceof afqi) {
            return true;
        }
        bqd bqd = bqn instanceof bqe ? ((bqe) bqn).b : bqn instanceof bql ? ((bql) bqn).b : null;
        if (bqd == null) {
            return false;
        }
        int i = bqd.a;
        if (i == 400 || i == 403) {
            return true;
        }
        return false;
    }
}
