package defpackage;

import android.content.Context;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.RemoteDataBus;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.SelectableItemRegistry;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PlayerMutedAutoplayOverlayRendererOuterClass;

/* renamed from: nip */
public final class nip implements xcp {
    public awem a;
    public boolean b;
    private final Context c;
    private final EmbedInteractionLoggerCoordinator d;
    private final SelectableItemRegistry e;
    private final niu f;
    private final OnClickListener g = new nis(this);
    private ahkr h;
    private airi i;
    private awel j;
    private aweo k;
    private final bdfg l = bdfg.h();

    public nip(Context context, EmbedInteractionLoggerCoordinator embedInteractionLoggerCoordinator, mqy mqy, SelectableItemRegistry selectableItemRegistry, RemoteDataBus remoteDataBus) {
        this.c = context;
        this.d = embedInteractionLoggerCoordinator;
        this.e = selectableItemRegistry;
        this.f = new niu(embedInteractionLoggerCoordinator, mqy, this.g);
        nhj nhj = this.f;
        nhj.e = 0;
        this.b = false;
        int a = this.e.a(nhj);
        niu niu = this.f;
        niu.a = new nhh(a, 1);
        niu.b = new nhh(a, 2);
        niu.c = new nhh(a, 3);
        bctz a2 = a();
        remoteDataBus.getClass();
        a2.a(new nir(remoteDataBus));
    }

    public final bctz a() {
        return this.l.a(bcxi.a);
    }

    public final void a(int i) {
        Object a;
        bdfg bdfg = this.l;
        if (i == 5) {
            a = ngz.a(null, null, null, null, 0, 5);
        } else {
            awem awem = this.a;
            if (awem == null) {
                a = ngz.a;
            } else {
                nhh nhh;
                String string;
                niu niu = this.f;
                niu.f = awem;
                niu.d.append(1, awem);
                nhh nhh2 = niu.a;
                niu niu2 = this.f;
                awel awel = this.j;
                if (awel == null) {
                    nhh = niu2.a;
                } else {
                    niu2.d.append(2, awel);
                    nhh = niu2.b;
                }
                nhh nhh3 = nhh;
                niu2 = this.f;
                aweo aweo = this.k;
                if (aweo == null) {
                    nhh = niu2.a;
                } else {
                    niu2.d.append(3, aweo);
                    nhh = niu2.c;
                }
                nhh nhh4 = nhh;
                awel awel2 = this.j;
                if (awel2 == null) {
                    string = this.c.getString(R.string.continue_watching);
                } else {
                    arml arml;
                    if ((awel2.a & 1) != 0) {
                        arml = awel2.b;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    string = ajqy.a(arml);
                }
                String str = string;
                aweo aweo2 = this.k;
                a = ngz.a(nhh2, nhh3, nhh4, str, aweo2 != null ? (long) aweo2.c : 3000, i);
            }
        }
        bdfg.e_(a);
        if (i == 1) {
            awem awem2 = this.a;
            if (awem2 != null) {
                this.d.a(awem2.f.d());
            }
        } else if (i == 2) {
            awel awel3 = this.j;
            if (awel3 != null) {
                this.d.a(awel3.c.d());
            }
        }
    }

    private static awem a(aakj aakj) {
        if (aakj != null) {
            ajxu ajxu = aakj.a;
            if (ajxu != null) {
                ateb ateb = ajxu.x;
                if (!(ateb == null || (ateb.a & 1) == 0)) {
                    awdk awdk = ateb.b;
                    if (awdk == null) {
                        awdk = awdk.h;
                    }
                    anxp anxp = awdk.f;
                    if (anxp == null) {
                        anxp = axak.a;
                    }
                    anxr access$000 = anxl.checkIsLite(PlayerMutedAutoplayOverlayRendererOuterClass.playerMutedAutoplayOverlayRenderer);
                    anxp.a(access$000);
                    if (anxp.h.a(access$000.d)) {
                        anxp anxp2 = awdk.f;
                        if (anxp2 == null) {
                            anxp2 = axak.a;
                        }
                        anxr access$0002 = anxl.checkIsLite(PlayerMutedAutoplayOverlayRendererOuterClass.playerMutedAutoplayOverlayRenderer);
                        anxp2.a(access$0002);
                        Object b = anxp2.h.b(access$0002.d);
                        if (b == null) {
                            b = access$0002.b;
                        } else {
                            b = access$0002.a(b);
                        }
                        return (awem) b;
                    }
                }
            }
        }
        return null;
    }

    private static awel a(awem awem) {
        if (awem != null) {
            anxp anxp = awem.e;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(PlayerMutedAutoplayOverlayRendererOuterClass.playerMutedAutoplayEndScreenRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = awem.e;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(PlayerMutedAutoplayOverlayRendererOuterClass.playerMutedAutoplayEndScreenRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                return (awel) b;
            }
        }
        return null;
    }

    private static aweo b(awem awem) {
        if (awem != null) {
            anxp anxp = awem.d;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(PlayerMutedAutoplayOverlayRendererOuterClass.playerYoutubeWatermarkRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = awem.d;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(PlayerMutedAutoplayOverlayRendererOuterClass.playerYoutubeWatermarkRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                return (aweo) b;
            }
        }
        return null;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i != -1) {
            int i2 = 5;
            if (i != 0) {
                if (i == 1) {
                    ahkn ahkn = (ahkn) obj;
                    this.a = nip.a(ahkn.b);
                    this.j = nip.a(this.a);
                    this.k = nip.b(this.a);
                    this.i = ahkn.a;
                    int ordinal = this.i.ordinal();
                    if (ordinal == 0) {
                        this.h = null;
                        this.i = null;
                        this.a = null;
                        this.f.e = 0;
                        if (!this.b) {
                            i2 = 4;
                        }
                        a(i2);
                    } else if (ordinal == 1) {
                        if (!this.b) {
                            i2 = 4;
                        }
                        a(i2);
                    } else if (ordinal != 2) {
                        switch (ordinal) {
                            case 6:
                            case 7:
                            case 8:
                                a(1);
                                break;
                            case 9:
                                a(2);
                                break;
                            default:
                                a(4);
                                break;
                        }
                    } else {
                        a(1);
                    }
                } else if (i == 2) {
                    ahkm ahkm = (ahkm) obj;
                    this.f.e = ahkm.a;
                } else if (i == 3) {
                    ahkr ahkr = (ahkr) obj;
                    this.h = ahkr;
                    if (!ahkr.b()) {
                        i2 = ahkr.a;
                        if (!(i2 == 7 || i2 == 4)) {
                            if (ahkr.a()) {
                                a(1);
                                return null;
                            }
                        }
                    }
                    a(2);
                } else {
                    StringBuilder stringBuilder = new StringBuilder(32);
                    stringBuilder.append("unsupported op code: ");
                    stringBuilder.append(i);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            } else if (((ahkf) obj).e == 5) {
                ahkr ahkr2 = this.h;
                if (ahkr2 != null && ahkr2.a == 4) {
                    airi airi = this.i;
                    if (!(airi == null || airi == airi.NEW)) {
                        a(2);
                        return null;
                    }
                }
            }
        }
        clsArr = new Class[]{ahkf.class, ahkn.class, ahkm.class, ahkr.class};
        return clsArr;
    }
}
