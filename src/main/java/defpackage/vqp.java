package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: vqp */
public final class vqp implements aftl {
    public aaga a;
    public Map b;
    public ahjn c = null;
    public boolean d;
    public long e;
    private final String g;
    private final Random h;
    private final vny i;
    private String j;
    private String k;
    private vqy l;

    vqp(String str, Random random, vny vny) {
        this.h = random;
        str = String.valueOf(str);
        String str2 = "a.";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        this.g = str;
        this.i = vny;
        vny.a();
    }

    public final void a(String str, String str2) {
        this.j = str2;
        this.k = str;
    }

    public final void a(vqy vqy) {
        this.l = vqy;
        Map map = null;
        if (!(vqy == null || vqy.b() == null)) {
            map = afti.b(vqy.b());
        }
        this.b = map;
    }

    public final String a(Uri uri, String str) {
        Integer num = (Integer) vqq.a.get(str);
        if (num == null) {
            return null;
        }
        if (!afti.a(this.b, str, uri)) {
            return (String) vqq.b.get(str);
        }
        int intValue = num.intValue();
        String str2 = "";
        aaga aaga;
        if (intValue == 1) {
            aaga = this.a;
            if (!(aaga == null || aaga.W() == null)) {
                str2 = this.a.W().toString();
            }
            return str2;
        } else if (intValue == 2) {
            return Integer.toString(this.h.nextInt(89999999) + 10000000);
        } else {
            if (intValue == 3) {
                return "00:00:00.000";
            }
            String str3 = "0";
            vqy vqy;
            if (intValue != 11) {
                if (intValue != 32) {
                    if (intValue != 59) {
                        if (intValue == 65) {
                            return str2;
                        }
                        switch (intValue) {
                            case 5:
                                return TextUtils.join(",", this.a.X());
                            case 6:
                                aaga = this.a;
                                if (aaga != null) {
                                    str2 = aaga.Y();
                                }
                                return str2;
                            case 7:
                                aaga = this.a;
                                if (aaga != null) {
                                    str3 = Integer.toString(aaga.n() * 1000);
                                }
                                return str3;
                            case 8:
                                aaga = this.a;
                                if (aaga != null) {
                                    str2 = aaga.Z();
                                }
                                return str2;
                            case 9:
                                aaga = this.a;
                                if (!(aaga == null || TextUtils.isEmpty(aaga.d()))) {
                                    str3 = this.a.d();
                                }
                                return str3;
                            default:
                                String str4;
                                switch (intValue) {
                                    case 13:
                                        return str3;
                                    case 14:
                                        str4 = this.k;
                                        return str4 == null ? str2 : str4;
                                    case 15:
                                        str4 = this.j;
                                        return str4 == null ? str2 : str4;
                                    default:
                                        switch (intValue) {
                                            case 18:
                                                return "detailpage";
                                            case 19:
                                                aaga = this.a;
                                                if (!(aaga == null || aaga.ab() == null)) {
                                                    str3 = this.a.ab().b;
                                                }
                                                return str3;
                                            case 20:
                                                aaga = this.a;
                                                if (aaga != null) {
                                                    str3 = aaga.ad().d;
                                                }
                                                return str3;
                                            case 21:
                                                if (this.a != null) {
                                                    str3 = "2";
                                                }
                                                return str3;
                                            default:
                                                ahjn ahjn;
                                                switch (intValue) {
                                                    case 26:
                                                        vqy = this.l;
                                                        if (vqy != null && vqy.e() == vsm.MID_ROLL) {
                                                            str3 = Long.toString(TimeUnit.MILLISECONDS.toSeconds(this.l.a()));
                                                        }
                                                        return str3;
                                                    case 27:
                                                        ahjn = this.c;
                                                        if (ahjn == null) {
                                                            str4 = Integer.toString(-1);
                                                        } else {
                                                            str4 = Integer.toString(ahjn.d);
                                                        }
                                                        return str4;
                                                    case 28:
                                                        ahjn = this.c;
                                                        if (ahjn != null) {
                                                            str3 = ahjn.a.a();
                                                        }
                                                        return str3;
                                                    case 29:
                                                        ahjn = this.c;
                                                        if (ahjn == null) {
                                                            str4 = Integer.toString(-1);
                                                        } else {
                                                            str4 = Integer.toString(ahjn.c);
                                                        }
                                                        return str4;
                                                    case 30:
                                                        aaga = this.a;
                                                        if (!(aaga == null || aaga.aa() == null)) {
                                                            str2 = this.a.aa();
                                                        }
                                                        return str2;
                                                    default:
                                                        switch (intValue) {
                                                            case 35:
                                                                aaga = this.a;
                                                                if (!(aaga == null || aaga.o())) {
                                                                    str3 = "1";
                                                                }
                                                                return str3;
                                                            case 36:
                                                                if (!(this.b == null || this.i.c == null)) {
                                                                    str2 = this.i.c;
                                                                }
                                                                return str2;
                                                            case 37:
                                                                return "DROID";
                                                            case 38:
                                                                return VERSION.RELEASE;
                                                            case 39:
                                                                return "UNWN";
                                                            case 40:
                                                                return "MBL";
                                                            case 41:
                                                                return this.g;
                                                            case 42:
                                                                return "a";
                                                            case 43:
                                                                return "android";
                                                            case 44:
                                                                return Build.MODEL;
                                                            case 45:
                                                                str4 = (this.b == null || this.i.c == null) ? "none" : this.i.c;
                                                                return str4;
                                                            default:
                                                                switch (intValue) {
                                                                    case cv.aU /*50*/:
                                                                        if (this.a == null || this.e <= 0) {
                                                                            str4 = "0.0";
                                                                        } else {
                                                                            Locale locale = Locale.US;
                                                                            Object[] objArr = new Object[1];
                                                                            double d = (double) this.e;
                                                                            Double.isNaN(d);
                                                                            objArr[0] = Double.valueOf(d / 1000.0d);
                                                                            str4 = String.format(locale, "%.1f", objArr);
                                                                        }
                                                                        return str4;
                                                                    case cv.aV /*51*/:
                                                                        aaga = this.a;
                                                                        if (aaga != null) {
                                                                            str2 = aaga.l();
                                                                        }
                                                                        return str2;
                                                                    case cv.aW /*52*/:
                                                                        if (this.a != null) {
                                                                            str2 = !this.d ? "pause" : "playing";
                                                                        }
                                                                        return str2;
                                                                    default:
                                                                        return null;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                    } else if (this.a != null) {
                        long j = this.e;
                        if (j > 0) {
                            str3 = Long.toString(j);
                        }
                    }
                }
                return str3;
            }
            vqy = this.l;
            if (vqy != null) {
                str3 = Integer.toString(vqy.f());
            }
            return str3;
        }
    }

    public final String a() {
        return vqp.class.getSimpleName();
    }

    public final vqo a(tps tps) {
        return new vqo(tps, this.b, (byte) 0);
    }
}
