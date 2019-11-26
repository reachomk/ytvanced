package defpackage;

import android.content.SharedPreferences;
import java.util.Locale;

/* renamed from: mlb */
public final class mlb implements xcp {
    public final bdfi a = bdfi.h();
    public final bdfi b = bdfi.h();
    private final SharedPreferences c;
    private final afpu d;
    private final acum e;
    private final zyw f;

    public mlb(SharedPreferences sharedPreferences, afpu afpu, xci xci, acum acum, zyw zyw) {
        this.c = sharedPreferences;
        this.d = afpu;
        this.e = acum;
        this.f = zyw;
        xci.a((Object) this);
    }

    public final void a(boolean z) {
        if (a() != z) {
            this.c.edit().putBoolean(a("%s:bollard_enabled"), z).apply();
            this.a.e_(Boolean.valueOf(z));
            azfz azfz = (azfz) azfw.c.createBuilder();
            azfz.copyOnWrite();
            azfw azfw = (azfw) azfz.instance;
            azfw.a |= 1;
            azfw.b = z;
            azfw azfw2 = (azfw) ((anxl) azfz.build());
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (azfw2 != null) {
                asmw.c = azfw2;
                asmw.b = 181;
                this.e.a((asmw) ((anxl) asmz.build()));
                return;
            }
            throw new NullPointerException();
        }
    }

    public final boolean a() {
        SharedPreferences sharedPreferences = this.c;
        String a = a("%s:bollard_enabled");
        apxn a2 = this.f.a();
        boolean z = false;
        if (a2 != null) {
            aulu aulu = a2.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            azga azga = aulu.ap;
            if (azga == null) {
                azga = azga.f;
            }
            if (azga.d) {
                z = true;
            }
        }
        return sharedPreferences.getBoolean(a, z);
    }

    public final void a(int i) {
        amqw.a(i > 0);
        if (b() != i) {
            this.c.edit().putInt(a("%s:bollard_frequency_mins"), i).apply();
            this.b.e_(Integer.valueOf(i));
            azgb azgb = (azgb) azfy.c.createBuilder();
            azgb.copyOnWrite();
            azfy azfy = (azfy) azgb.instance;
            azfy.a = 1 | azfy.a;
            azfy.b = i;
            azfy azfy2 = (azfy) ((anxl) azgb.build());
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (azfy2 != null) {
                asmw.c = azfy2;
                asmw.b = 182;
                this.e.a((asmw) ((anxl) asmz.build()));
                return;
            }
            throw new NullPointerException();
        }
    }

    public final int b() {
        SharedPreferences sharedPreferences = this.c;
        String a = a("%s:bollard_frequency_mins");
        apxn a2 = this.f.a();
        int i = 75;
        if (a2 != null) {
            aulu aulu = a2.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if ((aulu.g & 2) != 0) {
                aulu aulu2 = a2.e;
                if (aulu2 == null) {
                    aulu2 = aulu.bw;
                }
                azga azga = aulu2.ap;
                if (azga == null) {
                    azga = azga.f;
                }
                i = azga.e;
            }
        }
        return sharedPreferences.getInt(a, i);
    }

    private final void c() {
        this.a.e_(Boolean.valueOf(a()));
        this.b.e_(Integer.valueOf(b()));
    }

    private final String a(String str) {
        return String.format(Locale.US, str, new Object[]{this.d.c().a()});
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqf.class, afqh.class};
        } else if (i == 0) {
            c();
            return null;
        } else if (i == 1) {
            c();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
