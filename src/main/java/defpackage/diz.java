package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.AccountLinkCommandOuterClass$AccountLinkCommand;
import com.google.protos.youtube.api.innertube.AccountUnlinkCommandOuterClass$AccountUnlinkCommand;
import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import com.google.protos.youtube.api.innertube.ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import com.google.protos.youtube.api.innertube.GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand;
import com.google.protos.youtube.api.innertube.HideEnclosingActionOuterClass$HideEnclosingAction;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import com.google.protos.youtube.api.innertube.NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint;
import com.google.protos.youtube.api.innertube.OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint;
import com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint;
import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;
import com.google.protos.youtube.api.innertube.ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction;
import com.google.protos.youtube.api.innertube.WebviewEndpointOuterClass$WebviewEndpoint;

/* renamed from: diz */
final class diz implements bcaa {
    private final int a;
    private final /* synthetic */ diw b;

    diz(diw diw, int i) {
        this.b = diw;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        diw diw;
        Object obj;
        Object obj2;
        bcaa bcaa;
        bcaa hI;
        bcaa bcaa2;
        switch (i) {
            case 0:
                diw = this.b;
                obj = diw.s;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = diw.s;
                        if (obj2 instanceof baqe) {
                            Activity a = uhj.a(diw.a);
                            diu diu = diw.w;
                            bcaa bcaa3 = diu.ec;
                            if (bcaa3 == null) {
                                bcaa3 = new dlk(diu, 521);
                                diu.ec = bcaa3;
                            }
                            bcaa = bcaa3;
                            hI = diw.w.hI();
                            iyy a2 = diw.a();
                            bcaa2 = diw.q;
                            if (bcaa2 == null) {
                                bcaa2 = new diz(diw, 1);
                                diw.q = bcaa2;
                            }
                            bcaa bcaa4 = bcaa2;
                            lyw kS = diw.w.kS();
                            dyv dyv = diw.r;
                            if (dyv == null) {
                                dyv = new dyv(diw.w.c(), diw.w.eF(), diw.w.dr(), diw.w.mJ());
                                diw.r = dyv;
                            }
                            obj2 = (aaas) baqd.a(new acwi(new jbs(a, bcaa, hI, a2, bcaa4, kS, dyv), diw.e()), "Cannot return null from a non-@Nullable @Provides method");
                            diw.s = bapx.a(diw.s, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (aaas) obj;
            case 1:
                diw = this.b;
                obj = diw.p;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = diw.p;
                        if (obj2 instanceof baqe) {
                            amuu a3 = amur.a(18);
                            Class cls = OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class;
                            Object obj3 = diw.b;
                            if (obj3 == null) {
                                obj3 = new ageb(diw.w.jq(), diw.w.dr());
                                diw.b = obj3;
                            }
                            a3 = a3.b(cls, obj3).b(AccountLinkCommandOuterClass$AccountLinkCommand.class, new zsm(diw.b(), diw.f())).b(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class, new zso(diw.b(), diw.f()));
                            cls = WebviewEndpointOuterClass$WebviewEndpoint.class;
                            obj3 = diw.c;
                            if (obj3 == null) {
                                obj3 = new eaj(uhj.a(diw.a), diw.w.ht(), diw.w.k(), diw.w.oz());
                                diw.c = obj3;
                            }
                            a3 = a3.b(cls, obj3).b(AddToToastActionOuterClass$AddToToastAction.class, diw.w.eQ());
                            cls = ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.class;
                            obj3 = diw.d;
                            if (obj3 == null) {
                                dxm dxm = new dxm(diw.w.eP(), diw.w.oz(), diw.w.oB(), diw.w.gQ(), diw.w.gV(), diw.w.k(), diw.f(), diw.w.oI(), diw.w.gT(), diw.w.gU());
                                diw.d = dxm;
                            }
                            a3 = a3.b(cls, obj3);
                            cls = ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.class;
                            obj3 = diw.e;
                            if (obj3 == null) {
                                obj3 = akct.a(uhj.a(diw.a), diw.f(), diw.w.s(), diw.w.bx());
                                diw.e = obj3;
                            }
                            a3 = a3.b(cls, obj3).b(GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.class, diw.c()).b(GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.class, diw.c());
                            cls = HideEnclosingActionOuterClass$HideEnclosingAction.class;
                            obj3 = diw.f;
                            if (obj3 == null) {
                                obj3 = new zyj(diw.w.oC());
                                diw.f = obj3;
                            }
                            a3 = a3.b(cls, obj3);
                            cls = ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.class;
                            obj3 = diw.g;
                            if (obj3 == null) {
                                eum eum = new eum(diw.w.ow(), diw.w.eH(), diw.f(), diw.w.oI(), diw.w.eI(), diw.w.bB());
                                diw.g = eum;
                            }
                            a3 = a3.b(cls, obj3);
                            cls = NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class;
                            obj3 = diw.h;
                            if (obj3 == null) {
                                obj3 = new fvn(uhj.a(diw.a), diw.w.eH(), diw.w.oI(), diw.f());
                                diw.h = obj3;
                            }
                            a3 = a3.b(cls, obj3);
                            cls = SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class;
                            obj3 = diw.i;
                            if (obj3 == null) {
                                obj3 = new dzs(diw.f(), diw.w.ox(), diw.d());
                                diw.i = obj3;
                            }
                            a3 = a3.b(cls, obj3);
                            cls = SetSettingEndpointOuterClass$SetSettingEndpoint.class;
                            obj3 = diw.j;
                            if (obj3 == null) {
                                obj3 = new abii(diw.w.eP(), diw.f(), diw.w.oI(), diw.w.oB());
                                diw.j = obj3;
                            }
                            a3 = a3.b(cls, obj3);
                            cls = ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class;
                            obj3 = diw.k;
                            if (obj3 == null) {
                                diu diu2 = diw.w;
                                hI = diu2.ed;
                                if (hI == null) {
                                    hI = new dlk(diu2, 522);
                                    diu2.ed = hI;
                                }
                                obj3 = new aapx(bapx.b(hI));
                                diw.k = obj3;
                            }
                            a3 = a3.b(cls, obj3);
                            cls = arjq.class;
                            obj3 = diw.l;
                            if (obj3 == null) {
                                obj3 = new aawr(diw.w.kj(), diw.w.oC(), diw.w.oI(), diw.f());
                                diw.l = obj3;
                            }
                            a3 = a3.b(cls, obj3);
                            cls = InlineAuthCommandOuterClass$InlineAuthCommand.class;
                            obj3 = diw.n;
                            if (obj3 == null) {
                                bcaa = diw.m;
                                if (bcaa == null) {
                                    bcaa = new diz(diw, 2);
                                    diw.m = bcaa;
                                }
                                obj3 = new uuj(bcaa);
                                diw.n = obj3;
                            }
                            a3 = a3.b(cls, obj3);
                            cls = CommandExecutorCommandOuterClass$CommandExecutorCommand.class;
                            obj3 = diw.o;
                            if (obj3 == null) {
                                obj3 = new zyo(diw.f());
                                diw.o = obj3;
                            }
                            obj2 = new aaat(a3.b(cls, obj3).b());
                            diw.p = bapx.a(diw.p, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (aaat) obj;
            case 2:
                diw = this.b;
                return new uuu(diw.f(), diw.w.oF(), diw.w.mP(), uhj.a(diw.a));
            case 3:
                return uhj.a(this.b.a);
            case 4:
                return this.b.f();
            case 5:
                diw = this.b;
                bcaa h = diw.h();
                bcaa2 = diw.u;
                if (bcaa2 == null) {
                    bcaa2 = new diz(diw, 6);
                    diw.u = bcaa2;
                }
                return new aldt(h, bcaa2);
            case 6:
                diw = this.b;
                obj = diw.t;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = diw.t;
                        if (obj2 instanceof baqe) {
                            obj2 = (akvp) baqd.a(new fhr(uhj.a(diw.a), diw.w.bx()), "Cannot return null from a non-@Nullable @Provides method");
                            diw.t = bapx.a(diw.t, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (akvp) obj;
            case 7:
                return new aldx(this.b.h());
            case 8:
                return new akpe(this.b.j());
            case 9:
                diw = this.b;
                obj = diw.v;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = diw.v;
                        if (obj2 instanceof baqe) {
                            obj2 = new akpi();
                            diw.v = bapx.a(diw.v, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (akpi) obj;
            case 10:
                diw = this.b;
                return new jec(diw.h(), diw.k(), diw.i(), diw.l(), diw.w.nY());
            case 11:
                return new flu(uhj.a(this.b.a));
            case 12:
                return this.b.g();
            case 13:
                return this.b.e();
            case 14:
                diw = this.b;
                return new jen(diw.h(), diw.k(), diw.i(), diw.w.oa(), diw.l());
            case 15:
                return this.b.b();
            case 16:
                diw = this.b;
                uvw a4 = uvv.a();
                a4.a = diw.w.ow();
                a4.b = diw.w.A();
                a4.c = diw.w.t();
                a4.d = diw.w.al();
                return new uvy(a4, diw.w.oA());
            case 17:
                diw = this.b;
                return new akzb(diw.i(), diw.w.jw(), diw.j());
            case 18:
                return amuw.a(this.b.w.js());
            default:
                throw new AssertionError(i);
        }
    }
}
