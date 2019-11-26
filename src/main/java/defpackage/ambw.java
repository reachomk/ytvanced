package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: ambw */
public final class ambw {
    public final acum a;
    private final Context b;
    private final SharedPreferences c;
    private final String d;

    public ambw(Context context, acum acum, SharedPreferences sharedPreferences) {
        this.b = context;
        this.a = acum;
        this.c = sharedPreferences;
        this.d = xvd.a(context.getString(R.string.upload_network_policy_pref_value_wifi));
    }

    public final void a(amea amea) {
        amec amec = amea.m;
        if (amec == null) {
            amec = amec.g;
        }
        amqw.a(amjq.a(amec));
        String str = amea.g;
        amec = amea.m;
        if (amec == null) {
            amec = amec.g;
        }
        int a = amee.a(amec.b);
        int i = a != 0 ? a : 1;
        amec = amea.m;
        if (amec == null) {
            amec = amec.g;
        }
        a = ayuc.a(amec.c);
        int i2 = a != 0 ? a : 1;
        int a2 = ameg.a(amea.k);
        a(str, i, i2, a2 != 0 ? a2 : 1, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009e  */
    public final defpackage.aysx a(java.lang.String r11) {
        /*
        r10 = this;
        r0 = defpackage.aysx.e;
        r0 = r0.createBuilder();
        r0 = (defpackage.ayta) r0;
        r0.a(r11);
        r11 = r10.b;
        r1 = "connectivity";
        r11 = r11.getSystemService(r1);
        r11 = (android.net.ConnectivityManager) r11;
        r1 = 7;
        r2 = 6;
        r3 = 9;
        r4 = 2;
        r5 = 3;
        r6 = 8;
        r7 = 4;
        r8 = 1;
        if (r11 == 0) goto L_0x007b;
    L_0x0021:
        r11 = r11.getActiveNetworkInfo();
        if (r11 == 0) goto L_0x007b;
    L_0x0027:
        r9 = r11.isConnected();
        if (r9 == 0) goto L_0x007b;
    L_0x002d:
        r9 = r11.getType();
        if (r9 == 0) goto L_0x004a;
    L_0x0033:
        if (r9 == r8) goto L_0x0048;
    L_0x0035:
        if (r9 == r7) goto L_0x004a;
    L_0x0037:
        if (r9 == r3) goto L_0x0045;
    L_0x0039:
        if (r9 == r2) goto L_0x0042;
    L_0x003b:
        if (r9 == r1) goto L_0x003f;
    L_0x003d:
        r1 = 3;
        goto L_0x007c;
    L_0x003f:
        r1 = 21;
        goto L_0x007c;
    L_0x0042:
        r1 = 20;
        goto L_0x007c;
    L_0x0045:
        r1 = 22;
        goto L_0x007c;
    L_0x0048:
        r1 = 2;
        goto L_0x007c;
    L_0x004a:
        r11 = r11.getSubtype();
        switch(r11) {
            case 1: goto L_0x0079;
            case 2: goto L_0x0077;
            case 3: goto L_0x0074;
            case 4: goto L_0x007c;
            case 5: goto L_0x0071;
            case 6: goto L_0x006e;
            case 7: goto L_0x006c;
            case 8: goto L_0x0069;
            case 9: goto L_0x0066;
            case 10: goto L_0x0063;
            case 11: goto L_0x0060;
            case 12: goto L_0x005d;
            case 13: goto L_0x005a;
            case 14: goto L_0x0057;
            case 15: goto L_0x0054;
            default: goto L_0x0051;
        };
    L_0x0051:
        r1 = 19;
        goto L_0x007c;
    L_0x0054:
        r1 = 14;
        goto L_0x007c;
    L_0x0057:
        r1 = 8;
        goto L_0x007c;
    L_0x005a:
        r1 = 18;
        goto L_0x007c;
    L_0x005d:
        r1 = 11;
        goto L_0x007c;
    L_0x0060:
        r1 = 16;
        goto L_0x007c;
    L_0x0063:
        r1 = 13;
        goto L_0x007c;
    L_0x0066:
        r1 = 15;
        goto L_0x007c;
    L_0x0069:
        r1 = 12;
        goto L_0x007c;
    L_0x006c:
        r1 = 6;
        goto L_0x007c;
    L_0x006e:
        r1 = 10;
        goto L_0x007c;
    L_0x0071:
        r1 = 9;
        goto L_0x007c;
    L_0x0074:
        r1 = 17;
        goto L_0x007c;
    L_0x0077:
        r1 = 4;
        goto L_0x007c;
    L_0x0079:
        r1 = 5;
        goto L_0x007c;
    L_0x007b:
        r1 = 1;
    L_0x007c:
        r0.copyOnWrite();
        r11 = r0.instance;
        r11 = (defpackage.aysx) r11;
        r2 = r11.a;
        r2 = r2 | r6;
        r11.a = r2;
        r1 = r1 + -1;
        r11.d = r1;
        r11 = r10.c;
        r1 = 0;
        r2 = "upload_policy";
        r11 = r11.getString(r2, r1);
        r1 = r10.d;
        r11 = r1.equals(r11);
        if (r11 != 0) goto L_0x009e;
    L_0x009d:
        goto L_0x009f;
    L_0x009e:
        r4 = 3;
    L_0x009f:
        r0.copyOnWrite();
        r11 = r0.instance;
        r11 = (defpackage.aysx) r11;
        r1 = r11.a;
        r1 = r1 | r7;
        r11.a = r1;
        r4 = r4 + -1;
        r11.c = r4;
        r11 = r0.build();
        r11 = (defpackage.anxl) r11;
        r11 = (defpackage.aysx) r11;
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ambw.a(java.lang.String):aysx");
    }

    public final void a(String str, aytx aytx, int i, aytw[] aytwArr) {
        aytm a = a(str, 2);
        ayto ayto = (ayto) aytl.d.createBuilder();
        aysw aysw = (aysw) ayst.d.createBuilder();
        aysw.copyOnWrite();
        ayst ayst = (ayst) aysw.instance;
        if (aytx != null) {
            ayst.a |= 1;
            ayst.b = aytx.g;
            aysw.copyOnWrite();
            ayst ayst2 = (ayst) aysw.instance;
            ayst2.a = 2 | ayst2.a;
            ayst2.c = i - 1;
            ayto.copyOnWrite();
            aytl aytl = (aytl) ayto.instance;
            aytl.b = (ayst) ((anxl) aysw.build());
            aytl.a |= 1;
            List<aytw> asList = Arrays.asList(aytwArr);
            ayto.copyOnWrite();
            aytl aytl2 = (aytl) ayto.instance;
            if (!aytl2.c.a()) {
                aytl2.c = anxl.mutableCopy(aytl2.c);
            }
            for (aytw aytw : asList) {
                aytl2.c.d(aytw.c);
            }
            aytl = (aytl) ((anxl) ayto.build());
            a.copyOnWrite();
            aytj aytj = (aytj) a.instance;
            if (aytl != null) {
                aytj.d = aytl;
                aytj.a |= 4;
                asmz asmz = (asmz) asmw.f.createBuilder();
                asmz.a(a);
                this.a.a((asmw) ((anxl) asmz.build()));
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void a(String str, int i, int i2, int i3, long j) {
        boolean z = false;
        int i4 = 1;
        amqw.a(j >= 0);
        if (!(str == null || str.isEmpty())) {
            z = true;
        }
        amqw.a(z);
        aytq aytq = (aytq) aytn.e.createBuilder();
        aysx a = a(str);
        aytq.copyOnWrite();
        aytn aytn = (aytn) aytq.instance;
        if (a != null) {
            aytn.b = a;
            aytn.a |= 1;
            aytq.copyOnWrite();
            aytn aytn2 = (aytn) aytq.instance;
            aytn2.a |= 4;
            aytn2.d = j;
            if (i != 2) {
                i = i2 - 1;
                if (i2 == 0) {
                    throw null;
                } else if (i != 2) {
                    switch (i) {
                        case 9:
                            i4 = 3;
                            break;
                        case 10:
                            i4 = 4;
                            break;
                        case 11:
                            i4 = 5;
                            break;
                        case 12:
                            i = i3 - 1;
                            if (i3 != 0) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4) {
                                                i4 = 12;
                                                break;
                                            } else {
                                                i4 = 13;
                                                break;
                                            }
                                        }
                                        i4 = 11;
                                        break;
                                    }
                                    i4 = 10;
                                    break;
                                }
                                i4 = 9;
                                break;
                            }
                            throw null;
                        case 13:
                            i4 = 6;
                            break;
                        case 14:
                            i4 = 7;
                            break;
                        case 15:
                            i4 = 8;
                            break;
                    }
                } else {
                    i4 = 14;
                }
            } else {
                i4 = 2;
            }
            aytq.copyOnWrite();
            aytn2 = (aytn) aytq.instance;
            aytn2.a |= 2;
            aytn2.c = i4 - 1;
            aytn2 = (aytn) ((anxl) aytq.build());
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (aytn2 != null) {
                asmw.c = aytn2;
                asmw.b = 39;
                this.a.a((asmw) ((anxl) asmz.build()));
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final aytm a(String str, int i) {
        aytm aytm = (aytm) aytj.e.createBuilder();
        aysx a = a(str);
        aytm.copyOnWrite();
        aytj aytj = (aytj) aytm.instance;
        if (a != null) {
            aytj.b = a;
            aytj.a |= 1;
            aytm.copyOnWrite();
            aytj aytj2 = (aytj) aytm.instance;
            if (i != 0) {
                aytj2.a |= 2;
                aytj2.c = i - 1;
                return aytm;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
