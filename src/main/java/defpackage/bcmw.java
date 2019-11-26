package defpackage;

import android.net.TrafficStats;
import android.util.Log;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* renamed from: bcmw */
final class bcmw extends bcom {
    public static final String a = bcmw.class.getSimpleName();
    public final bcno b;
    public final Executor c;
    public final String d;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicReference g = new AtomicReference(Integer.valueOf(0));
    public final boolean h;
    public String i;
    public bcou j;
    public Executor k;
    public volatile int l = -1;
    public String m;
    public ReadableByteChannel n;
    public bcoo o;
    public String p;
    public HttpURLConnection q;
    public bcnx r;
    private final AtomicBoolean s = new AtomicBoolean(false);

    bcmw(bckz bckz, Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2) {
        if (str == null) {
            throw new NullPointerException("URL is required");
        } else if (bckz == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor == null) {
            throw new NullPointerException("Executor is required");
        } else if (executor2 != null) {
            this.h = z;
            this.b = new bcno(this, bckz, executor2);
            this.c = new bcog(new bcmy(executor, TrafficStats.getThreadStatsTag(), false, 0));
            this.m = str;
            this.d = str2;
        } else {
            throw new NullPointerException("userExecutor is required");
        }
    }

    public final void a(String str) {
        h();
        if ("OPTIONS".equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str) || "DELETE".equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || "PATCH".equalsIgnoreCase(str)) {
            this.i = str;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid http method ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private final void h() {
        int intValue = ((Integer) this.g.get()).intValue();
        if (intValue != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request is already started. State is: ");
            stringBuilder.append(intValue);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void a(String str, String str2) {
        StringBuilder stringBuilder;
        h();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (!(charAt == ',' || charAt == '/' || charAt == '{' || charAt == '}')) {
                switch (charAt) {
                    case '\'':
                    case '(':
                    case ')':
                        break;
                    default:
                        switch (charAt) {
                            case ':':
                            case cv.bc /*59*/:
                            case cv.bd /*60*/:
                            case cv.be /*61*/:
                            case cv.bf /*62*/:
                            case cv.bg /*63*/:
                            case '@':
                                break;
                            default:
                                switch (charAt) {
                                    case '[':
                                    case '\\':
                                    case ']':
                                        break;
                                    default:
                                        if (!(Character.isISOControl(charAt) || Character.isWhitespace(charAt))) {
                                            i++;
                                        }
                                }
                        }
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid header ");
            stringBuilder.append(str);
            stringBuilder.append("=");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (!str2.contains("\r\n")) {
            if (this.e.containsKey(str)) {
                this.e.remove(str);
            }
            this.e.put(str, str2);
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid header ");
        stringBuilder.append(str);
        stringBuilder.append("=");
        stringBuilder.append(str2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void a(bcks bcks, Executor executor) {
        if (this.e.containsKey("Content-Type")) {
            h();
            if (this.i == null) {
                this.i = "POST";
            }
            this.j = new bcou(bcks);
            if (this.h) {
                this.k = executor;
                return;
            } else {
                this.k = new bcnv(executor);
                return;
            }
        }
        throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
    }

    public final void a() {
        this.l = 10;
        a(0, 1, new bcnd(this));
    }

    public final void a(bcjd bcjd) {
        int intValue;
        do {
            intValue = ((Integer) this.g.get()).intValue();
            if (intValue == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            } else if (intValue == 6 || intValue == 7 || intValue == 8) {
                return;
            }
        } while (!this.g.compareAndSet(Integer.valueOf(intValue), Integer.valueOf(6)));
        g();
        e();
        bcno bcno = this.b;
        bcoo bcoo = this.o;
        bcno.d.i();
        bcnt bcnt = new bcnt(bcno, bcoo, bcjd);
        try {
            bcno.b.execute(bcnt);
        } catch (bcjq unused) {
            Executor executor = bcno.c;
            if (executor != null) {
                executor.execute(bcnt);
            }
        }
    }

    public final void a(Throwable th) {
        a(new bclh("Exception received from UploadDataProvider", th));
    }

    public final void a(int i, int i2, Runnable runnable) {
        if (this.g.compareAndSet(Integer.valueOf(i), Integer.valueOf(i2))) {
            runnable.run();
            return;
        }
        i2 = ((Integer) this.g.get()).intValue();
        if (i2 != 8 && i2 != 6) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid state transition - expected ");
            stringBuilder.append(i);
            stringBuilder.append(" but was ");
            stringBuilder.append(i2);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void b() {
        a(3, 1, new bcng(this));
    }

    public final void d() {
        this.l = 13;
        this.c.execute(a(new bcnf(this)));
    }

    public final void e() {
        if (this.j != null && this.s.compareAndSet(false, true)) {
            try {
                this.k.execute(b(new bcni(this)));
            } catch (RejectedExecutionException e) {
                Log.e(a, "Exception when closing uploadDataProvider", e);
            }
        }
    }

    public final void f() {
        this.c.execute(a(new bcnj(this)));
    }

    public final Runnable a(bcnw bcnw) {
        return new bcnm(this, bcnw);
    }

    public final Runnable b(bcnw bcnw) {
        return new bcna(this, bcnw);
    }

    public final void a(ByteBuffer byteBuffer) {
        bcol.a(byteBuffer);
        bcol.b(byteBuffer);
        a(4, 5, new bcmz(this, byteBuffer));
    }

    public final void g() {
        this.c.execute(new bcnb(this));
    }

    public final void c() {
        int intValue = ((Integer) this.g.getAndSet(Integer.valueOf(8))).intValue();
        if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4 || intValue == 5) {
            g();
            e();
            bcno bcno = this.b;
            bcoo bcoo = this.o;
            bcno.d.i();
            bcno.b.execute(new bcnr(bcno, bcoo));
        }
    }

    public final void a(bcky bcky) {
        int intValue = ((Integer) this.g.get()).intValue();
        int i = this.l;
        switch (intValue) {
            case 0:
            case 6:
            case 7:
            case 8:
                i = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i = 0;
                break;
            case 5:
                i = 14;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Switch is exhaustive: ");
                stringBuilder.append(intValue);
                throw new IllegalStateException(stringBuilder.toString());
        }
        this.b.b.execute(new bcnn(new VersionSafeCallbacks$UrlRequestStatusListener(bcky), i));
    }

    private final void i() {
        this.c.execute(new bcne(this));
    }
}
