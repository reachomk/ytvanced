package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: acfo */
public final class acfo implements acfe {
    public final acvx a;
    public final Handler b;
    private final abce c;
    private final abci d;
    private final abag e;
    private final abac f;
    private final abal g;
    private final abdj h;
    private final abcr i;
    private final abcv j;
    private final abju k;
    private final Executor l;
    private final xsc m;

    public acfo(Context context, acvx acvx, abce abce, abci abci, abag abag, abac abac, abal abal, abdj abdj, abcr abcr, abcv abcv, abju abju, Handler handler, Executor executor, xsc xsc) {
        amqw.a((Object) context);
        this.a = (acvx) amqw.a((Object) acvx);
        this.c = abce;
        this.d = abci;
        this.e = abag;
        this.f = abac;
        this.g = abal;
        this.h = abdj;
        this.i = abcr;
        this.j = abcv;
        this.k = abju;
        this.b = handler;
        this.l = executor;
        this.m = xsc;
    }

    public final void a(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, asjd asjd, awnx awnx, zrb zrb, Date date, String str3, acfh acfh) {
        amqw.a((Object) acfh);
        abce abce = this.c;
        aaml abcj = new abcj(abce.c, abce.d.c());
        abcj.e = awnx;
        if (str != null) {
            abcj.c = str;
        }
        if (str2 != null) {
            abcj.d = str2;
        }
        if (bool != null) {
            abcj.a = Boolean.valueOf(bool.booleanValue());
        }
        if (bool2 != null) {
            abcj.b = Boolean.valueOf(bool2.booleanValue());
        }
        if (bool3 != null) {
            abcj.q = Boolean.valueOf(bool3.booleanValue());
        }
        if (bool4 != null) {
            abcj.s = bool4;
        }
        if (asjd != null) {
            Boolean valueOf = Boolean.valueOf(asjd.b);
            Boolean valueOf2 = Boolean.valueOf(asjd.c);
            bool = Boolean.valueOf(asjd.d);
            String str4 = asjd.e;
            bool3 = Boolean.valueOf(asjd.f);
            String str5 = asjd.g;
            if ((asjd.a & 1) != 0) {
                abcj.p = Boolean.valueOf(valueOf.booleanValue());
                if (valueOf.booleanValue() && (asjd.a & 2) != 0) {
                    abcj.r = Boolean.valueOf(valueOf2.booleanValue());
                }
            }
            if ((asjd.a & 4) != 0) {
                abcj.t = bool;
            }
            if (!TextUtils.isEmpty(str4)) {
                abcj.u = str4;
            }
            if ((asjd.a & 16) != 0) {
                abcj.v = bool3;
            }
            if (!TextUtils.isEmpty(str5)) {
                abcj.w = str5;
            }
        }
        if (zrb != null) {
            str = zrb.a;
            str2 = zrb.b;
            abcj.x = str;
            abcj.y = str2;
        }
        if (date != null) {
            abcj.z = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(date.getTime()));
        }
        if (str3 != null) {
            abcj.A = str3;
        }
        abce abce2 = this.c;
        abce2.a(asiz.k, abce2.a, abch.a, abcg.a).a(abcj, new acfs(this, acfh));
    }

    public final void a(String str, boolean z, boolean z2, MediaFormat mediaFormat, acfg acfg) {
        amqw.a(str.isEmpty() ^ 1);
        amqw.a((Object) acfg);
        if (!z) {
            amqw.a((Object) mediaFormat);
        }
        int integer = mediaFormat != null ? mediaFormat.getInteger("height") : 0;
        abci abci = this.d;
        aaml abcn = new abcn(abci.c, abci.d.c());
        abcn.b = str;
        abcn.c = "YouTube Mobile Stream";
        if (z) {
            abcn.d = 10005;
        } else {
            abcn.d = abcn.a.get(integer, 10003);
        }
        abcn.e = z;
        abci abci2 = this.d;
        abci2.a(asjx.h, abci2.a, abcl.a, abck.a).a(abcn, new acfx(this, z2, acfg));
    }

    public final void a(String str, acfj acfj) {
        amqw.a(str.isEmpty() ^ 1);
        aaml a = this.k.a();
        a.a = str;
        a.g();
        xan.a(this.k.a(a), this.l, new acfr(this, acfj), new acfq(acfj, str));
    }

    public final void a(aukf aukf, String str, acfl acfl) {
        abag abag = this.e;
        aaml abai = new abai(abag.c, abag.d.c());
        abai.a = aukf;
        abai.b = str;
        abag abag2 = this.e;
        abag2.a.a(abai, new acfy(this, acfl));
    }

    public final void a(acfi acfi) {
        amqw.a((Object) acfi);
        abac abac = this.f;
        abac.a.a(new abah(abac.c, abac.d.c()), new acgj(this.b, this.a, acfi));
    }

    public final void a(String str, ayyw ayyw, acfk acfk) {
        amqw.a((Object) acfk);
        abal abal = this.g;
        aaml abam = new abam(abal.c, abal.d.c());
        if (str != null) {
            abam.a = str;
        }
        if (ayyw != null) {
            abam.b = ayyw;
        }
        abal abal2 = this.g;
        abal2.a.a(abam, new acgn(this.b, this.a, acfk));
    }

    public final void a(asxv asxv, acfp acfp) {
        amqw.a((Object) asxv);
        this.h.a(asxv, new acgo(this.b, acfp), null);
    }

    public final asxv a(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, asjd asjd, asjf asjf, awnx awnx, acff acff, Date date, acff acff2, byte[] bArr) {
        aswv aswv;
        asxw asxw;
        boolean booleanValue;
        asxw asxw2;
        String str4 = str2;
        String str5 = str3;
        asjd asjd2 = asjd;
        asjf asjf2 = asjf;
        awnx awnx2 = awnx;
        amqw.a((Object) str);
        asxv asxv = (asxv) asxw.u.createBuilder();
        String str6 = str;
        asxv.a(str);
        if (str4 != null) {
            asxq asxq = (asxq) asxn.c.createBuilder();
            asxq.a(str2);
            asxv.a(asxq);
        }
        if (str5 != null) {
            aswu aswu = (aswu) aswr.c.createBuilder();
            aswu.a(str3);
            asxv.a(aswu);
        }
        aswy aswy = (aswy) aswv.e.createBuilder();
        if (bool != null) {
            boolean booleanValue2 = bool.booleanValue();
            aswy.copyOnWrite();
            aswv = (aswv) aswy.instance;
            aswv.a |= 1;
            aswv.b = booleanValue2;
        }
        if (bool2 != null) {
            augo augo = (augo) augp.e.createBuilder();
            augq augq = (augq) augr.e.createBuilder();
            augo.a(bool2.booleanValue());
            augq.a();
            aswy.copyOnWrite();
            aswv aswv2 = (aswv) aswy.instance;
            aswv2.c = (augp) ((anxl) augo.build());
            aswv2.a |= 2;
            aswy.copyOnWrite();
            aswv = (aswv) aswy.instance;
            aswv.d = (augr) ((anxl) augq.build());
            aswv.a |= 4;
        }
        int i = ((aswv) aswy.instance).a;
        if (!((i & 1) == 0 && (i & 2) == 0)) {
            asxv.copyOnWrite();
            asxw = (asxw) asxv.instance;
            asxw.r = (aswv) ((anxl) aswy.build());
            asxw.a |= 33554432;
        }
        if (bool3 != null) {
            aswq aswq = (aswq) aswn.c.createBuilder();
            booleanValue = bool3.booleanValue();
            aswq.copyOnWrite();
            aswn aswn = (aswn) aswq.instance;
            aswn.a |= 1;
            aswn.b = booleanValue;
            asxv.copyOnWrite();
            asxw = (asxw) asxv.instance;
            asxw.j = (aswn) ((anxl) aswq.build());
            asxw.a |= 4096;
        }
        if (bool4 != null) {
            asxm asxm = (asxm) asxj.c.createBuilder();
            booleanValue = bool4.booleanValue();
            asxm.copyOnWrite();
            asxj asxj = (asxj) asxm.instance;
            asxj.a |= 1;
            asxj.b = booleanValue;
            asxv.copyOnWrite();
            asxw = (asxw) asxv.instance;
            asxw.t = (asxj) ((anxl) asxm.build());
            asxw.b |= 16384;
        }
        if (asjf2 != null) {
            asxk asxk;
            boolean z;
            asxh asxh;
            amqw.a((Object) asjd);
            if (asjf2.b) {
                if (asxv.a()) {
                    asxk = (asxk) ((anxo) asxv.b().toBuilder());
                } else {
                    asxk = (asxk) asxh.d.createBuilder();
                }
                z = asjd2.b;
                asxk.copyOnWrite();
                asxh = (asxh) asxk.instance;
                asxh.a |= 1;
                asxh.b = z;
                asxv.a(asxk);
            }
            if (asjf2.c) {
                if (asxv.a()) {
                    asxk = (asxk) ((anxo) asxv.b().toBuilder());
                } else {
                    asxk = (asxk) asxh.d.createBuilder();
                }
                z = asjd2.c;
                asxk.copyOnWrite();
                asxh = (asxh) asxk.instance;
                asxh.a |= 2;
                asxh.c = z;
                asxv.a(asxk);
            }
            asxe asxe;
            if (asjf2.g) {
                asxe = (asxe) asxb.d.createBuilder();
                String str7 = asjd2.g;
                asxe.copyOnWrite();
                asxb asxb = (asxb) asxe.instance;
                if (str7 != null) {
                    asxb.a |= 1;
                    asxb.b = str7;
                    asxe.a(2);
                    asxv.a(asxe);
                } else {
                    throw new NullPointerException();
                }
            } else if (asjf2.f && !asjd2.f) {
                asxe = (asxe) asxb.d.createBuilder();
                asxe.a(3);
                asxv.a(asxe);
            }
            if (asjf2.e) {
                amqw.b((asjd2.a & 8) != 0);
                asxs asxs = (asxs) asxp.c.createBuilder();
                String str8 = asjd2.e;
                asxs.copyOnWrite();
                asxp asxp = (asxp) asxs.instance;
                if (str8 != null) {
                    asxp.a |= 1;
                    asxp.b = str8;
                    asxv.copyOnWrite();
                    asxw2 = (asxw) asxv.instance;
                    asxw2.n = (asxp) ((anxl) asxs.build());
                    asxw2.a |= 524288;
                } else {
                    throw new NullPointerException();
                }
            } else if (asjf2.d) {
                asxg asxg = (asxg) asxd.c.createBuilder();
                boolean z2 = asjd2.d;
                asxg.copyOnWrite();
                asxd asxd = (asxd) asxg.instance;
                asxd.a |= 1;
                asxd.b = z2;
                asxv.copyOnWrite();
                asxw2 = (asxw) asxv.instance;
                asxw2.l = (asxd) ((anxl) asxg.build());
                asxw2.a |= 32768;
            }
        }
        if (awnx2 != null) {
            asxi asxi = (asxi) asxf.c.createBuilder();
            asxi.a(awnx2);
            asxv.a(asxi);
        }
        if (!acff.b()) {
            asxc asxc = (asxc) aswz.g.createBuilder();
            if (acff.c()) {
                asxc.a(3);
            } else {
                asxc.b(((zrb) acff.a()).a);
                asxc.a(((zrb) acff.a()).b);
            }
            asxv.a(asxc);
        }
        if (date != null) {
            long time = date.getTime();
            if (time == 0) {
                time = TimeUnit.MILLISECONDS.toSeconds(this.m.a());
            } else {
                time = TimeUnit.MILLISECONDS.toSeconds(time);
            }
            asxa asxa = (asxa) aswx.c.createBuilder();
            asxa.copyOnWrite();
            aswx aswx = (aswx) asxa.instance;
            aswx.a |= 1;
            aswx.b = time;
            asxv.copyOnWrite();
            asxw2 = (asxw) asxv.instance;
            asxw2.s = (aswx) ((anxl) asxa.build());
            asxw2.a |= 67108864;
        }
        if (!acff2.b()) {
            asww asww = (asww) aswt.d.createBuilder();
            if (acff2.c()) {
                asww.copyOnWrite();
                aswt aswt = (aswt) asww.instance;
                aswt.a |= 4;
                aswt.c = true;
            } else {
                String str9 = (String) acff2.a();
                asww.copyOnWrite();
                aswt aswt2 = (aswt) asww.instance;
                if (str9 != null) {
                    aswt2.a = 2 | aswt2.a;
                    aswt2.b = str9;
                    asws asws = (asws) aswp.c.createBuilder();
                    int i2 = acea.b;
                    i = i2 - 1;
                    if (i2 != 0) {
                        asws.copyOnWrite();
                        aswp aswp = (aswp) asws.instance;
                        aswp.a |= 1;
                        aswp.b = i;
                        aswp aswp2 = (aswp) ((anxl) asws.build());
                        asxv.copyOnWrite();
                        asxw asxw3 = (asxw) asxv.instance;
                        if (aswp2 != null) {
                            asxw3.i = aswp2;
                            asxw3.a |= 256;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    throw null;
                }
                throw new NullPointerException();
            }
            asxv.copyOnWrite();
            asxw asxw4 = (asxw) asxv.instance;
            asxw4.m = (aswt) ((anxl) asww.build());
            asxw4.a |= 262144;
        }
        if (bArr != null) {
            asxu asxu = (asxu) asxr.d.createBuilder();
            asxu.copyOnWrite();
            asxr asxr = (asxr) asxu.instance;
            asxr.a |= 1;
            asxr.b = 3;
            aswm aswm = (aswm) aswj.c.createBuilder();
            anvu a = anvu.a(bArr);
            aswm.copyOnWrite();
            aswj aswj = (aswj) aswm.instance;
            if (a != null) {
                aswj.a = 1;
                aswj.b = a;
                asxu.copyOnWrite();
                asxr asxr2 = (asxr) asxu.instance;
                asxr2.c = (aswj) ((anxl) aswm.build());
                asxr2.a |= 4;
                asxv.copyOnWrite();
                asxw asxw5 = (asxw) asxv.instance;
                asxw5.o = (asxr) ((anxl) asxu.build());
                asxw5.a |= 2097152;
            } else {
                throw new NullPointerException();
            }
        }
        return asxv;
    }

    public final void a(String str, acfn acfn) {
        amqw.a(str.isEmpty() ^ 1);
        amqw.a((Object) acfn);
        abcr abcr = this.i;
        aaml abcs = new abcs(abcr.c, abcr.d.c());
        abcs.a = str;
        abcr abcr2 = this.i;
        abcr2.a(atik.e, abcr2.a, abcq.a, abct.a).a(abcs, new acgd(this, acfn));
    }

    public final void a(String str, acfm acfm) {
        amqw.a(str.isEmpty() ^ 1);
        amqw.a((Object) acfm);
        abcv abcv = this.j;
        aaml abcw = new abcw(abcv.c, abcv.d.c());
        abcw.a = str;
        abcv abcv2 = this.j;
        abcv2.a(atis.h, abcv2.a, abcu.a, abcx.a).a(abcw, new acge(this, acfm));
    }

    public static String a(bqn bqn) {
        if (bqn.b == null) {
            return bqn.toString();
        }
        String valueOf = String.valueOf(bqn);
        int i = bqn.b.a;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 14);
        stringBuilder.append(valueOf);
        stringBuilder.append(" - ");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public static int a(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return 4;
        } else {
            if (i2 == 2) {
                return 21;
            }
            if (i2 == 3) {
                return 22;
            }
            if (i2 == 5) {
                return 2;
            }
            if (i2 == 6) {
                return 33;
            }
            if (i2 != 9) {
                return i2 != 13 ? 1 : 27;
            } else {
                return 32;
            }
        }
    }

    public static int b(int i) {
        int i2 = i - 1;
        if (i != 0) {
            i = 1;
            switch (i2) {
                case 0:
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 9;
                case 9:
                    return 10;
                case 10:
                    return 11;
                case 11:
                    return 12;
                case 12:
                    return 13;
                case 13:
                    return 14;
                case 14:
                    return 15;
                case 15:
                    return 16;
                case 16:
                    return 17;
                case 17:
                    return 18;
                case 19:
                    return 19;
                case 20:
                    return 20;
                case 21:
                    return 21;
                default:
                    return 1;
            }
            return i;
        }
        throw null;
    }
}
