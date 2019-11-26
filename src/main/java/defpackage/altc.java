package defpackage;

/* renamed from: altc */
final class altc {
    static String a(bqn bqn) {
        if (bqn instanceof bqo) {
            return "TimeoutError";
        }
        if (bqn instanceof bqf) {
            return "ParseError";
        }
        if (bqn instanceof bqg) {
            return "NoConnectionError";
        }
        if (bqn instanceof bql) {
            return "ServerError";
        }
        if (bqn instanceof bpx) {
            return "AuthFailureError";
        }
        if (bqn instanceof bqe) {
            return "NetworkError";
        }
        return bqn.getClass().getSimpleName();
    }
}
