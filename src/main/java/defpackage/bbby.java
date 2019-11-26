package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbby */
public final class bbby {
    public static final boolean a;
    public static final baur b = baur.a("grpc-timeout", new bbce());
    public static final baur c = baur.a("grpc-encoding", baum.a);
    public static final baur d = bats.a("grpc-accept-encoding", new bbcb());
    public static final baur e = baur.a("content-encoding", baum.a);
    public static final baur f = bats.a("accept-encoding", new bbcb());
    public static final baur g = baur.a("content-type", baum.a);
    public static final baur h = baur.a("te", baum.a);
    public static final baur i = baur.a("user-agent", baum.a);
    public static final bavs j = new bbfb();
    public static final bavs k = new bbbx();
    public static final bbhj l = new bbca();
    public static final bbhj m = new bbbz();
    public static final amro n = new bbcc();
    private static final Logger o = Logger.getLogger(bbby.class.getName());
    private static final bary p = bary.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");

    public static boolean a(barv barv) {
        return Boolean.TRUE.equals(barv.a(p)) ^ 1;
    }

    public static bavx a(int i) {
        bawa bawa;
        if (i < 100 || i >= 200) {
            if (i != 400) {
                if (i == 401) {
                    bawa = bawa.UNAUTHENTICATED;
                } else if (i == 403) {
                    bawa = bawa.PERMISSION_DENIED;
                } else if (i != 404) {
                    if (i != 429) {
                        if (i != 431) {
                            switch (i) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    bawa = bawa.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    bawa = bawa.UNAVAILABLE;
                } else {
                    bawa = bawa.UNIMPLEMENTED;
                }
            }
            bawa = bawa.INTERNAL;
        } else {
            bawa = bawa.INTERNAL;
        }
        bavx a = bawa.a();
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("HTTP status code ");
        stringBuilder.append(i);
        return a.a(stringBuilder.toString());
    }

    public static boolean a(String str) {
        if (str != null && str.length() >= 16) {
            str = str.toLowerCase();
            if (str.startsWith("application/grpc")) {
                if (str.length() != 16) {
                    char charAt = str.charAt(16);
                    if (charAt == '+' || charAt == ';') {
                        return true;
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str2 != null) {
            stringBuilder.append(str2);
            stringBuilder.append(' ');
        }
        stringBuilder.append("grpc-java-");
        stringBuilder.append(str);
        stringBuilder.append("/1.22.0-SNAPSHOT");
        return stringBuilder.toString();
    }

    public static String a(String str, int i) {
        Object str2;
        try {
            str2 = new URI(null, null, str2, i, null, null, null).getAuthority();
            return str2;
        } catch (URISyntaxException e) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 34);
            stringBuilder.append("Invalid host or port: ");
            stringBuilder.append(str2);
            stringBuilder.append(" ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
    }

    public static ThreadFactory b(String str) {
        if (a) {
            ThreadFactory threadFactory;
            if (System.getProperty("com.google.appengine.runtime.environment") != null) {
                try {
                    if (Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) != null) {
                        try {
                            threadFactory = (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
                            return threadFactory;
                        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException e) {
                            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
                        } catch (InvocationTargetException e2) {
                            throw amrs.b(e2.getCause());
                        }
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            threadFactory = Executors.defaultThreadFactory();
            return threadFactory;
        }
        ankn ankn = new ankn();
        ankn.a = Boolean.valueOf(true);
        ankn.a(str);
        return ankn.a(ankn);
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    static bazq a(baua baua, boolean z) {
        baue baue = baua.b;
        bazq c = baue != null ? ((baxk) baue).c() : null;
        if (c == null) {
            if (!baua.d.a()) {
                if (baua.e) {
                    return new bbbp(baua.d, 3);
                }
                if (!z) {
                    return new bbbp(baua.d, 1);
                }
            }
            return null;
        }
        bash bash = baua.c;
        return c;
    }

    static void a(bbhp bbhp) {
        while (true) {
            InputStream a = bbhp.a();
            if (a != null) {
                bbby.a(a);
            } else {
                return;
            }
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                o.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", e);
            }
        }
    }

    private bbby() {
    }

    static {
        boolean z;
        Charset.forName("US-ASCII");
        if (System.getProperty("com.google.appengine.runtime.environment") != null) {
            if ("1.7".equals(System.getProperty("java.specification.version"))) {
                z = true;
                a = z;
                amqz.a(',').b();
                TimeUnit.MINUTES.toNanos(1);
                TimeUnit.SECONDS.toNanos(20);
                TimeUnit.HOURS.toNanos(2);
                TimeUnit.SECONDS.toNanos(20);
            }
        }
        z = false;
        a = z;
        amqz.a(',').b();
        TimeUnit.MINUTES.toNanos(1);
        TimeUnit.SECONDS.toNanos(20);
        TimeUnit.HOURS.toNanos(2);
        TimeUnit.SECONDS.toNanos(20);
    }
}
