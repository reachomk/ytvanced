package defpackage;

import com.google.android.youtube.R;

/* renamed from: gsv */
final /* synthetic */ class gsv implements xar {
    private final gso a;

    gsv(gso gso) {
        this.a = gso;
    }

    public final void accept(Object obj) {
        gso gso = this.a;
        if (gso.Y.isEmpty()) {
            xtl.d("nothing to upload");
            gso.a.finish();
            xpr.a(gso.a, (int) R.string.error_generic, 1);
        } else {
            for (alya alya : gso.Y) {
                String valueOf;
                String str = "";
                if (alya.a.getScheme() != null) {
                    valueOf = String.valueOf(alya.a.getScheme());
                    str = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
                }
                if (alya.a.getAuthority() != null) {
                    str = String.valueOf(str);
                    valueOf = alya.a.getAuthority();
                    StringBuilder stringBuilder = new StringBuilder((str.length() + 3) + String.valueOf(valueOf).length());
                    stringBuilder.append(str);
                    stringBuilder.append("://");
                    stringBuilder.append(valueOf);
                    str = stringBuilder.toString();
                }
                ambw ambw = gso.Z;
                String str2 = alya.b;
                aytx aytx = gso.al;
                Long l = alya.h;
                long longValue = l != null ? l.longValue() : 0;
                aysy aysy = (aysy) aysv.j.createBuilder();
                aysy.a(28);
                ayta ayta = (ayta) aysx.e.createBuilder();
                ayta.a(str2);
                aysy.a(ayta);
                aysy.copyOnWrite();
                aysv aysv = (aysv) aysy.instance;
                if (aytx != null) {
                    aysv.a |= 4096;
                    aysv.f = aytx.g;
                    aysy.copyOnWrite();
                    aysv = (aysv) aysy.instance;
                    if (str != null) {
                        aysv.a |= 8192;
                        aysv.g = str;
                        aysy.copyOnWrite();
                        aysv aysv2 = (aysv) aysy.instance;
                        aysv2.a |= 16384;
                        aysv2.h = longValue;
                        aysy.copyOnWrite();
                        aysv2 = (aysv) aysy.instance;
                        aysv2.a |= 32768;
                        aysv2.i = 0;
                        asmz asmz = (asmz) asmw.f.createBuilder();
                        asmz.a((aysv) ((anxl) aysy.build()));
                        ambw.a.a((asmw) ((anxl) asmz.build()));
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
        }
        gso.a(3);
    }
}
