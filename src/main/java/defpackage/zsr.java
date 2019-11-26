package defpackage;

import android.content.Context;
import android.text.Spanned;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand;
import com.google.protos.youtube.api.innertube.GamingAccountLinkConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingRendererOuterClass;
import java.util.Map;

/* renamed from: zsr */
public final class zsr implements aaap {
    private final Context a;
    private final aaas b;
    private final acvx c;
    private final akvp d;
    private final akkq e;

    public zsr(Context context, akkq akkq, aaas aaas, acvx acvx, akvp akvp) {
        this.a = context;
        this.b = aaas;
        this.c = acvx;
        this.d = akvp;
        this.e = akkq;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        arop arop;
        anxp anxp;
        anxr access$000;
        amqw.a((Object) apxu);
        zsq zsq = new zsq(this.b, this.c, this.d, this.e);
        anxr access$0002 = anxl.checkIsLite(GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.gamingAccountLinkConfirmDialogCommand);
        apxu.a(access$0002);
        Object b = apxu.h.b(access$0002.d);
        if (b == null) {
            obj = access$0002.b;
        } else {
            obj = access$0002.a(b);
        }
        GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand = (GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand) obj;
        if (gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand == null || (gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.a & 1) == 0) {
            arop = null;
        } else {
            anxp = gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(GamingAccountLinkConfirmDialogRendererOuterClass.gamingAccountLinkConfirmDialogRenderer);
            anxp.a(access$000);
            obj = anxp.h.b(access$000.d);
            if (obj == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(obj);
            }
            arop = (arop) obj;
        }
        arml arml;
        Spanned a;
        anyd anyd;
        aygk aygk;
        aygk aygk2;
        aygk aygk3;
        aygk aygk4;
        arwf arwf;
        arwf arwf2;
        if (arop == null) {
            arot arot;
            access$0002 = anxl.checkIsLite(GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.gamingAccountLinkSettingCommand);
            apxu.a(access$0002);
            b = apxu.h.b(access$0002.d);
            if (b == null) {
                obj = access$0002.b;
            } else {
                obj = access$0002.a(b);
            }
            GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand = (GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand) obj;
            if (gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand == null || (gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.a & 1) == 0) {
                arot = null;
            } else {
                anxp = gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.b;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(GamingAccountLinkSettingRendererOuterClass.gamingAccountLinkSettingRenderer);
                anxp.a(access$000);
                obj = anxp.h.b(access$000.d);
                if (obj == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(obj);
                }
                arot = (arot) obj;
            }
            if (arot != null) {
                Context context = this.a;
                aphj aphj = arot.p;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                zsq.b = aphg;
                aphj = arot.f;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                zsq.a = aphg;
                zsq.c = map;
                arml = arot.h;
                if (arml == null) {
                    arml = arml.f;
                }
                a = ajqy.a(arml);
                anyd = arot.j;
                if ((arot.a & 8192) != 0) {
                    aygk = arot.n;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    aygk2 = aygk;
                } else {
                    aygk2 = null;
                }
                if ((arot.a & 4) != 0) {
                    aygk = arot.c;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    aygk3 = aygk;
                } else {
                    aygk3 = null;
                }
                if ((arot.a & 2) != 0) {
                    aygk = arot.b;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    aygk4 = aygk;
                } else {
                    aygk4 = null;
                }
                if ((arot.a & 16384) != 0) {
                    arwf = arot.o;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    arwf2 = arwf;
                } else {
                    arwf2 = null;
                }
                zsq.a(context, R.layout.linked_account_settings_dialog_main, a, anyd, aygk2, aygk3, aygk4, arwf2, true);
                this.c.a(acwl.p, apxu, null);
            }
            return;
        }
        this.c.a(acwl.o, apxu, null);
        Context context2 = this.a;
        aphj aphj2 = arop.i;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        aphg aphg2 = aphj2.b;
        if (aphg2 == null) {
            aphg2 = aphg.s;
        }
        zsq.b = aphg2;
        aphj2 = arop.h;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        aphg2 = aphj2.b;
        if (aphg2 == null) {
            aphg2 = aphg.s;
        }
        zsq.a = aphg2;
        zsq.c = map;
        arml = arop.b;
        if (arml == null) {
            arml = arml.f;
        }
        a = ajqy.a(arml);
        anyd = arop.g;
        if ((arop.a & 2) != 0) {
            aygk = arop.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            aygk2 = aygk;
        } else {
            aygk2 = null;
        }
        if ((arop.a & 8) != 0) {
            aygk = arop.e;
            if (aygk == null) {
                aygk = aygk.f;
            }
            aygk3 = aygk;
        } else {
            aygk3 = null;
        }
        if ((arop.a & 4) != 0) {
            aygk = arop.d;
            if (aygk == null) {
                aygk = aygk.f;
            }
            aygk4 = aygk;
        } else {
            aygk4 = null;
        }
        if ((arop.a & 16) != 0) {
            arwf = arop.f;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwf2 = arwf;
        } else {
            arwf2 = null;
        }
        zsq.a(context2, R.layout.linked_account_confirmation_dialog, a, anyd, aygk2, aygk3, aygk4, arwf2, false);
    }
}
