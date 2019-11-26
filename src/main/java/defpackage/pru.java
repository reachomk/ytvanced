package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: pru */
public final class pru implements prf {
    private static final Charset a = Charset.forName("UTF-8");
    private static final quk b;
    private static final quk c;
    private static final ConcurrentHashMap e = new ConcurrentHashMap();
    private static final HashMap f = new HashMap();
    private static Boolean g = null;
    private static Long h = null;
    private static final qtx i = new qub(b, "enable_log_sampling_rules", Boolean.valueOf(false));
    private final Context d;

    public pru(Context context) {
        this.d = context;
        context = this.d;
        if (context != null && qtx.a == null) {
            qtx.a(context);
        }
    }

    private static boolean a(Context context) {
        if (g == null) {
            g = Boolean.valueOf(qph.a(context).a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return g.booleanValue();
    }

    private static long b(Context context) {
        if (h == null) {
            long j = 0;
            if (context == null) {
                return 0;
            }
            if (pru.a(context)) {
                ContentResolver contentResolver = context.getContentResolver();
                Object a = qtn.a(contentResolver);
                String str = "android_id";
                Object obj = (Long) qtn.a(qtn.d, str, Long.valueOf(0));
                if (obj != null) {
                    j = obj.longValue();
                } else {
                    String a2 = qtn.a(contentResolver, str);
                    if (a2 != null) {
                        try {
                            long parseLong = Long.parseLong(a2);
                            obj = Long.valueOf(parseLong);
                            j = parseLong;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    qtn.a(a, qtn.d, str, obj);
                }
                h = Long.valueOf(j);
            } else {
                h = Long.valueOf(0);
            }
        }
        return h.longValue();
    }

    private static long a(String str, long j) {
        if (str == null || str.isEmpty()) {
            return prr.a(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(a);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return prr.a(allocate.array());
    }

    public final boolean a(pri pri) {
        prn prn = pri.a;
        Object obj = prn.b;
        int i = prn.a;
        rjx rjx = pri.c;
        int i2 = 0;
        int i3 = rjx != null ? rjx.c : 0;
        boolean z = true;
        rju rju = null;
        qtx qtx;
        if (((Boolean) i.a()).booleanValue()) {
            if (obj == null || obj.isEmpty()) {
                obj = i < 0 ? null : String.valueOf(i);
            }
            if (obj != null) {
                List emptyList;
                if (this.d == null) {
                    emptyList = Collections.emptyList();
                } else {
                    qtx = (qtx) e.get(obj);
                    if (qtx == null) {
                        qtx qud = new qud(b, obj, rjs.zzwou, prx.a);
                        qtx = (qtx) e.putIfAbsent(obj, qud);
                        if (qtx == null) {
                            qtx = qud;
                        }
                    }
                    emptyList = ((rjs) qtx.a()).zzwot;
                }
                for (rju rju2 : emptyList) {
                    if ((rju2.zzbfv & 1) == 1) {
                        int i4 = rju2.zzvbc;
                        if (!(i4 == 0 || i4 == i3)) {
                        }
                    }
                    if (!pru.a(pru.a(rju2.zzwov, pru.b(this.d)), rju2.zzwow, rju2.zzwox)) {
                        z = false;
                        break;
                    }
                }
            }
        } else {
            if (obj == null || obj.isEmpty()) {
                if (i >= 0) {
                    obj = String.valueOf(i);
                } else {
                    obj = null;
                }
            }
            if (obj != null) {
                String str;
                Context context = this.d;
                if (context == null || !pru.a(context)) {
                    str = null;
                } else {
                    qtx qtx2 = (qtx) f.get(obj);
                    if (qtx2 == null) {
                        qtx = new que(c, obj);
                        f.put(obj, qtx);
                        qtx2 = qtx;
                    }
                    str = (String) qtx2.a();
                }
                if (str != null) {
                    String substring;
                    i = str.indexOf(44);
                    if (i >= 0) {
                        substring = str.substring(0, i);
                        i2 = i + 1;
                    } else {
                        substring = "";
                    }
                    i = str.indexOf(47, i2);
                    String str2 = "LogSamplerImpl";
                    if (i <= 0) {
                        String str3 = "Failed to parse the rule: ";
                        if (str.length() == 0) {
                            str = new String(str3);
                        } else {
                            str = str3.concat(str);
                        }
                        Log.e(str2, str);
                    } else {
                        try {
                            long parseLong = Long.parseLong(str.substring(i2, i));
                            long parseLong2 = Long.parseLong(str.substring(i + 1));
                            if (parseLong >= 0 && parseLong2 >= 0) {
                                rjt rjt = (rjt) ((ret) rju.zzwoy.a(5));
                                rjt.b();
                                rju rju3 = (rju) rjt.a;
                                if (substring != null) {
                                    rju3.zzbfv |= 2;
                                    rju3.zzwov = substring;
                                    rjt.b();
                                    rju3 = (rju) rjt.a;
                                    rju3.zzbfv |= 4;
                                    rju3.zzwow = parseLong;
                                    rjt.b();
                                    rju3 = (rju) rjt.a;
                                    rju3.zzbfv |= 8;
                                    rju3.zzwox = parseLong2;
                                    rju = (rju) rjt.f();
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                            StringBuilder stringBuilder = new StringBuilder(72);
                            stringBuilder.append("negative values not supported: ");
                            stringBuilder.append(parseLong);
                            stringBuilder.append("/");
                            stringBuilder.append(parseLong2);
                            Log.e(str2, stringBuilder.toString());
                        } catch (NumberFormatException e) {
                            substring = "parseLong() failed while parsing: ";
                            if (str.length() == 0) {
                                str = new String(substring);
                            } else {
                                str = substring.concat(str);
                            }
                            Log.e(str2, str, e);
                        }
                    }
                }
                if (rju != null) {
                    return pru.a(pru.a(rju.zzwov, pru.b(this.d)), rju.zzwow, rju.zzwox);
                }
            }
        }
        return z;
    }

    private static boolean a(long j, long j2, long j3) {
        if (j2 >= 0 && j3 > 0) {
            long j4;
            if (j < 0) {
                j4 = (((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3)) % j3;
            } else {
                j4 = j % j3;
            }
            if (j4 >= j2) {
                return false;
            }
        }
        return true;
    }

    static {
        String str = "com.google.android.gms.clearcut.public";
        b = new quk(rwd.a(str)).a("gms:playlog:service:samplingrules_").b("LogSamplingRules__");
        c = new quk(rwd.a(str)).a("gms:playlog:service:sampling_").b("LogSampling__");
    }
}
