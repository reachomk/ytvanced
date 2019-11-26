package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: acxs */
public final class acxs implements acxw {
    private final xuu a;
    private final xsc b;
    private final acum c;
    private final SharedPreferences d;
    private final acxr e;
    private final ConcurrentHashMap f = new ConcurrentHashMap();

    public acxs(SharedPreferences sharedPreferences, xuu xuu, xsc xsc, acum acum, Executor executor) {
        this.d = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.a = (xuu) amqw.a((Object) xuu);
        this.b = (xsc) amqw.a((Object) xsc);
        this.c = (acum) amqw.a((Object) acum);
        this.e = new acxr(a(), xsc);
        ankc.a(executor);
    }

    private final boolean a() {
        return this.d.getBoolean("DebugCsiGelLogging", false);
    }

    private final String b() {
        return this.a.a(16);
    }

    private final String d(atyw atyw, String str) {
        zz zzVar = new zz(atyw, str);
        if (!this.f.containsKey(zzVar)) {
            this.f.put(zzVar, b());
        }
        return (String) this.f.get(zzVar);
    }

    public final acxt a(atyw atyw) {
        acxq acxq = new acxq(this, this.b, atyw, b(), a());
        acxq.a(acxq.a.a());
        return acxq;
    }

    public final void a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            this.e.b("logBaseline");
            return;
        }
        atyj atyj = (atyj) atyg.c.createBuilder();
        atyj.copyOnWrite();
        atyg atyg = (atyg) atyj.instance;
        if (str != null) {
            atyg.a |= 1;
            atyg.b = str;
            atyg atyg2 = (atyg) ((anxl) atyj.build());
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (atyg2 != null) {
                asmw.c = atyg2;
                asmw.b = 6;
                this.c.a((asmw) ((anxl) asmz.build()), j);
                acxr acxr = this.e;
                if (acxr.a) {
                    StringBuilder stringBuilder = new StringBuilder(32);
                    stringBuilder.append("logBaseline ");
                    stringBuilder.append(j);
                    acxr.a(str, stringBuilder.toString());
                }
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void a(atyw atyw, String str) {
        long a = this.b.a();
        String d = d(atyw, str);
        acxr acxr = this.e;
        if (acxr.a) {
            acxr.c.put(new zz(atyw, str), Long.valueOf(a));
        }
        a(d, a);
        acxr acxr2 = this.e;
        if (acxr2.a) {
            long a2 = acxr2.a(atyw, str);
            String valueOf = String.valueOf(atyw);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 66) + String.valueOf(str).length());
            stringBuilder.append("logBaseline actionType=[");
            stringBuilder.append(valueOf);
            stringBuilder.append("] actionDescriptor=[");
            stringBuilder.append(str);
            stringBuilder.append("] ");
            stringBuilder.append(a2);
            acxr2.a(d, stringBuilder.toString());
        }
        atyl atyl = (atyl) atyi.l.createBuilder();
        atyl.a(atyw);
        atyl.a(d(atyw, str));
        a((atyi) ((anxl) atyl.build()));
    }

    public final boolean b(atyw atyw, String str) {
        return this.f.containsKey(new zz(atyw, str));
    }

    public final void a(String str, String str2, long j) {
        if (TextUtils.isEmpty(str2)) {
            acxr acxr = this.e;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 9);
            stringBuilder.append("logTick(");
            stringBuilder.append(str);
            stringBuilder.append(")");
            acxr.b(stringBuilder.toString());
            return;
        }
        atyr atyr = (atyr) atyo.d.createBuilder();
        atyr.copyOnWrite();
        atyo atyo = (atyo) atyr.instance;
        if (str != null) {
            atyo.a |= 1;
            atyo.b = str;
            atyr.copyOnWrite();
            atyo = (atyo) atyr.instance;
            if (str2 != null) {
                atyo.a |= 2;
                atyo.c = str2;
                atyo atyo2 = (atyo) ((anxl) atyr.build());
                asmz asmz = (asmz) asmw.f.createBuilder();
                asmz.copyOnWrite();
                asmw asmw = (asmw) asmz.instance;
                if (atyo2 != null) {
                    asmw.c = atyo2;
                    asmw.b = 5;
                    this.c.a((asmw) ((anxl) asmz.build()), j);
                    acxr acxr2 = this.e;
                    if (acxr2.a) {
                        StringBuilder stringBuilder2 = new StringBuilder((str.length() + 33) + str2.length());
                        stringBuilder2.append("logTick: ");
                        stringBuilder2.append(str);
                        str = ", ";
                        stringBuilder2.append(str);
                        stringBuilder2.append(str2);
                        stringBuilder2.append(str);
                        stringBuilder2.append(j);
                        acxr2.a(str2, stringBuilder2.toString());
                    }
                    return;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void a(String str, atyw atyw, String str2) {
        long a = this.b.a();
        String d = d(atyw, str2);
        a(str, d, a);
        acxr acxr = this.e;
        if (!acxr.a) {
            return;
        }
        if (d != null) {
            long a2 = acxr.a(atyw, str2);
            String valueOf = String.valueOf(atyw);
            String a3 = acxr.a(a, a2);
            int length = String.valueOf(str).length();
            int length2 = valueOf.length();
            StringBuilder stringBuilder = new StringBuilder((((length + 54) + length2) + String.valueOf(str2).length()) + String.valueOf(a3).length());
            stringBuilder.append("logTick tickName=[");
            stringBuilder.append(str);
            stringBuilder.append("] actionType=[");
            stringBuilder.append(valueOf);
            stringBuilder.append("] actionDescriptor=[");
            stringBuilder.append(str2);
            stringBuilder.append("] ");
            stringBuilder.append(a3);
            acxr.a(d, stringBuilder.toString());
            return;
        }
        str = String.valueOf(atyw);
        StringBuilder stringBuilder2 = new StringBuilder((str.length() + 75) + String.valueOf(str2).length());
        stringBuilder2.append("logTick, actionNonce not found for given actionType=[");
        stringBuilder2.append(str);
        stringBuilder2.append("], actionDescriptor=[");
        stringBuilder2.append(str2);
        stringBuilder2.append("]");
        acxr.a(stringBuilder2.toString());
    }

    public final void b(String str, atyw atyw, String str2) {
        a(str, atyw, str2);
        c(atyw, str2);
    }

    public final void c(atyw atyw, String str) {
        String str2 = (String) this.f.remove(new zz(atyw, str));
        acxr acxr = this.e;
        if (!acxr.a) {
            return;
        }
        String valueOf;
        if (str2 != null) {
            long a = acxr.a(atyw, str);
            valueOf = String.valueOf(atyw);
            String a2 = acxr.a(acxr.b.a(), a);
            int length = valueOf.length();
            StringBuilder stringBuilder = new StringBuilder(((length + 51) + String.valueOf(str).length()) + String.valueOf(a2).length());
            stringBuilder.append("clearActionNonce actionType=[");
            stringBuilder.append(valueOf);
            stringBuilder.append("] actionDescriptor=[");
            stringBuilder.append(str);
            stringBuilder.append("] ");
            stringBuilder.append(a2);
            acxr.a(str2, stringBuilder.toString());
            return;
        }
        valueOf = String.valueOf(atyw);
        StringBuilder stringBuilder2 = new StringBuilder((valueOf.length() + 79) + String.valueOf(str).length());
        stringBuilder2.append("Attempted to clearActionNonce, didn't exist. actionType=[");
        stringBuilder2.append(valueOf);
        stringBuilder2.append("], actionDescriptor=[");
        stringBuilder2.append(str);
        stringBuilder2.append("]");
        acxr.a(stringBuilder2.toString());
    }

    public final void a(atyi atyi) {
        if (TextUtils.isEmpty(atyi.d)) {
            this.e.b("logActionInfo");
            return;
        }
        long a = this.b.a();
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        asmw.c = atyi;
        asmw.b = 7;
        this.c.a((asmw) ((anxl) asmz.build()), a);
        acxr acxr = this.e;
        if (acxr.a) {
            String str = atyi.d;
            Object a2 = atyw.a(atyi.c);
            if (a2 == null) {
                a2 = atyw.LATENCY_ACTION_UNKNOWN;
            }
            String valueOf = String.valueOf(a2);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 24) + valueOf.length());
            stringBuilder.append("logActionInfo: ");
            stringBuilder.append(str);
            stringBuilder.append(", action ");
            stringBuilder.append(valueOf);
            acxr.a(stringBuilder.toString());
        }
    }

    public final int a(atyw atyw, String str, atym atym) {
        if (atym == null || atym.b.isEmpty() || atym.d <= 0) {
            return -1;
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        String d = d(atyw, str);
        atyp atyp = (atyp) ((anxo) atym.toBuilder());
        atyp.copyOnWrite();
        atym = (atym) atyp.instance;
        if (d != null) {
            atym.a |= 2;
            atym.c = d;
            atyp.copyOnWrite();
            atym atym2 = (atym) atyp.instance;
            atym2.a |= 32;
            atym2.g = nextInt;
            atym2 = (atym) ((anxl) atyp.build());
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (atym2 != null) {
                asmw.c = atym2;
                asmw.b = 255;
                this.c.a((asmw) ((anxl) asmz.build()));
                acxr acxr = this.e;
                if (acxr.a) {
                    String str2 = atym2.b;
                    String str3 = atym2.c;
                    long j = atym2.e;
                    long j2 = atym2.d;
                    atys atys = atym2.f;
                    if (atys == null) {
                        atys = atys.d;
                    }
                    d = atys.c;
                    int length = String.valueOf(str2).length();
                    StringBuilder stringBuilder = new StringBuilder(((length + 102) + String.valueOf(str3).length()) + String.valueOf(d).length());
                    stringBuilder.append("logActionSpan: ");
                    stringBuilder.append(str2);
                    stringBuilder.append(", CAN ");
                    stringBuilder.append(str3);
                    stringBuilder.append(", Start Time ");
                    stringBuilder.append(j);
                    stringBuilder.append(", Span Length ");
                    stringBuilder.append(j2);
                    stringBuilder.append(", request URL ");
                    stringBuilder.append(d);
                    acxr.a(stringBuilder.toString());
                }
                return nextInt;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
