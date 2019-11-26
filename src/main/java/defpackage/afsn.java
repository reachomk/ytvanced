package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: afsn */
public final class afsn implements afsa {
    private final SharedPreferences a;
    private String b = null;
    private anrs c;

    public afsn(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final boolean b() {
        return true;
    }

    public final void a(Map map, afsl afsl) {
        String string = this.a.getString("debug_sherlog_public_id", "");
        if (!TextUtils.isEmpty(string)) {
            if (this.c == null || !string.equals(this.b)) {
                this.b = string;
                anrv anrv = new anrv();
                for (azxk azxk : ((azxi) ((anxl) anrv.a.build())).b) {
                    int a = azxm.a(azxk.b);
                    if (a != 0 && a == 2) {
                        break;
                    }
                }
                azxl azxl = anrv.a;
                azxn azxn = (azxn) azxk.c.createBuilder();
                azxn.copyOnWrite();
                azxk azxk2 = (azxk) azxn.instance;
                azxk2.a |= 1;
                azxk2.b = 1;
                azxl.copyOnWrite();
                azxi azxi = (azxi) azxl.instance;
                if (!azxi.b.a()) {
                    azxi.b = anxl.mutableCopy(azxi.b);
                }
                azxi.b.add((azxk) ((anxl) azxn.build()));
                anxl anxl = ((azxi) anrv.a.instance).c;
                if (anxl == null) {
                    anxl = azxo.c;
                }
                azxr azxr = (azxr) ((anxo) anxl.toBuilder());
                azxr.copyOnWrite();
                azxo azxo = (azxo) azxr.instance;
                if (string != null) {
                    azxo.a |= 16;
                    azxo.b = string;
                    azxo azxo2 = (azxo) ((anxl) azxr.build());
                    azxl = anrv.a;
                    azxl.copyOnWrite();
                    azxi = (azxi) azxl.instance;
                    if (azxo2 != null) {
                        azxi.c = azxo2;
                        azxi.a |= 1;
                        if ((((azxi) anrv.a.instance).a & 4) == 0) {
                            long nextLong = anrv.b.nextLong();
                            while (nextLong == 0) {
                                nextLong = anrv.b.nextLong();
                            }
                            azxl azxl2 = anrv.a;
                            azxl2.copyOnWrite();
                            azxi azxi2 = (azxi) azxl2.instance;
                            azxi2.a |= 4;
                            azxi2.d = nextLong;
                        }
                        this.c = new anrs(anrv);
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
            map.put("X-Google-ext-194588755-bin", anar.b.a().a(this.c.a.toByteArray()));
        }
    }

    public final aulc a() {
        return aulc.UNKNOWN;
    }
}
