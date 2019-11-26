package defpackage;

import java.io.IOException;

/* renamed from: afse */
public final class afse extends afrq {
    private final xgq c;

    public afse(xgq xgq, afnx afnx, afnp afnp) {
        super(afnx, afnp);
        this.c = (xgq) amqw.a((Object) xgq);
    }

    private static void a(xho xho) {
        if (xho.e() != null) {
            xho.e().b();
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj, Object obj2, wxg wxg, Exception exception) {
        xhc xhc = (xhc) obj2;
        if (exception instanceof xhp) {
            xhp xhp = (xhp) exception;
            String.valueOf(xhc.b()).length();
            int i = xhp.a;
            String message = exception.getMessage();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(message).length() + 39);
            stringBuilder.append("Http error: status=[");
            stringBuilder.append(i);
            stringBuilder.append("] msg=[");
            stringBuilder.append(message);
            stringBuilder.append("]");
            xtl.c(stringBuilder.toString());
        }
        super.a(obj, xhc, wxg, exception);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void b(Object obj, wxg wxg) {
        String str = "Error consuming content response";
        obj = (xhc) obj;
        amqw.a(obj);
        xho xho = null;
        try {
            xho = this.c.a(obj);
            wxg.a(obj, (Object) xho);
            if (xho != null) {
                try {
                    afse.a(xho);
                } catch (IOException e) {
                    xtl.b(str, e);
                }
            }
        } catch (IllegalStateException e2) {
            wxg.a(obj, e2);
            if (xho != null) {
                try {
                    afse.a(xho);
                } catch (IOException e3) {
                    xtl.b(str, e3);
                }
            }
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception e22) {
            wxg.a(obj, e22);
            if (xho != null) {
                try {
                    afse.a(xho);
                } catch (IOException e32) {
                    xtl.b(str, e32);
                }
            }
        } catch (Throwable th) {
            if (xho != null) {
                try {
                    afse.a(xho);
                } catch (IOException e5) {
                    xtl.b(str, e5);
                }
            }
        }
    }
}
