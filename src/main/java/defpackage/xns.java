package defpackage;

import android.accounts.AuthenticatorException;
import android.content.Context;
import com.google.android.youtube.R;
import java.io.IOException;
import java.net.SocketException;
import java.util.Locale;

/* renamed from: xns */
public final class xns implements xoi {
    private final Context a;
    private final xhv b;
    private final yx c = yx.a();

    public xns(Context context, xhv xhv) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (xhv) amqw.a((Object) xhv);
    }

    public final String a(Throwable th) {
        return b(th).a;
    }

    public final xst b(Throwable th) {
        Throwable th2 = th;
        if (th2 == null) {
            return xst.a(this.a, R.string.common_error_generic, new Object[0]);
        }
        if (th2 instanceof xtm) {
            return ((xtm) th2).a(this.a);
        }
        if (th2 instanceof AuthenticatorException) {
            return xst.a(this.a, R.string.common_error_authenticating, new Object[0]);
        }
        if (!(th2 instanceof SocketException)) {
            String str = "%d";
            String format;
            if (th2 instanceof xhp) {
                xst xst;
                xhp xhp = (xhp) th2;
                Context context = this.a;
                int i = xhp.a;
                if (i == 403) {
                    xst = new xst(context.getString(R.string.common_error_forbidden_action), xst.b(context, R.string.common_error_http, Integer.valueOf(403)));
                } else if (i == 500) {
                    xst = new xst(context.getString(R.string.common_error_generic), xst.b(context, R.string.common_error_http, Integer.valueOf(500)));
                } else if (i == 401) {
                    xst = new xst(context.getString(R.string.common_error_unauthorized), xst.b(context, R.string.common_error_http, Integer.valueOf(401)));
                } else {
                    format = String.format(Locale.US, str, new Object[]{Integer.valueOf(xhp.a)});
                    xst = new xst(context.getString(R.string.common_error_http, new Object[]{this.c.a(format)}), xst.b(context, R.string.common_error_http, format));
                }
                return xst;
            }
            if (th2 instanceof bqn) {
                bqn bqn = (bqn) th2;
                bqd bqd = bqn.b;
                if (bqd != null) {
                    int i2 = bqd.a;
                    if (i2 > 0) {
                        if (i2 == 403) {
                            return new xst(this.a.getString(R.string.common_error_forbidden_action), xst.b(this.a, R.string.common_error_http, Integer.valueOf(403)));
                        } else if (i2 == 401) {
                            return new xst(this.a.getString(R.string.common_error_unauthorized), xst.b(this.a, R.string.common_error_http, Integer.valueOf(401)));
                        } else if (i2 == 500) {
                            return new xst(this.a.getString(R.string.common_error_generic), xst.b(this.a, R.string.common_error_http, Integer.valueOf(500)));
                        } else {
                            format = String.format(Locale.US, str, new Object[]{Integer.valueOf(bqd.a)});
                            return new xst(this.a.getString(R.string.common_error_http, new Object[]{this.c.a(format)}), xst.b(this.a, R.string.common_error_http, format));
                        }
                    }
                }
                if ((th2 instanceof bpx) && !(th.getCause() instanceof IOException)) {
                    format = th.getMessage();
                    if (format == null || format.isEmpty()) {
                        return xst.a(this.a, R.string.common_error_authenticating, new Object[0]);
                    }
                    return new xst(this.a.getString(R.string.common_error_authenticating), xst.b(this.a, R.string.common_error_authenticating, format.replace(' ', '_')));
                } else if (bqn instanceof bqo) {
                    return xst.a(this.a, R.string.common_error_timeout, new Object[0]);
                }
            }
            if (!(th2 instanceof IOException)) {
                return b(th.getCause());
            }
            if (this.b.c()) {
                return xst.a(this.a, R.string.common_error_network, new Object[0]);
            }
            return xst.a(this.a, 1, R.string.common_no_network, new Object[0]);
        } else if (this.b.c()) {
            return xst.a(this.a, R.string.common_error_connection, new Object[0]);
        } else {
            return xst.a(this.a, 1, R.string.common_no_network, new Object[0]);
        }
    }

    public final void c(Throwable th) {
        a(a(th));
    }

    public final void a(int i) {
        a(this.a.getString(i));
    }

    public final void a(String str) {
        xpr.a(this.a, (CharSequence) str, 1);
    }
}
