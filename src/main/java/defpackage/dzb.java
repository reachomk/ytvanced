package defpackage;

import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import java.util.Map;

/* renamed from: dzb */
public final class dzb implements aaap {
    private final ahcn a;
    private final eki b;
    private final bcaa c;

    public dzb(ahcn ahcn, eki eki, bcaa bcaa) {
        this.a = ahcn;
        this.b = eki;
        this.c = bcaa;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) b;
        int a = avrj.a(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d);
        if (a == 0) {
            a = 1;
        }
        String str = ") but user does not have downloads.";
        String valueOf;
        StringBuilder stringBuilder;
        switch (a - 1) {
            case 1:
                avsj avsj;
                avsj avsj2;
                Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                if ((offlineVideoEndpointOuterClass$OfflineVideoEndpoint.a & 16) != 0) {
                    anxp anxp = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.e;
                    if (anxp == null) {
                        anxp = axak.a;
                    }
                    anxr access$0002 = anxl.checkIsLite(OfflineabilityRendererOuterClass.offlineabilityRenderer);
                    anxp.a(access$0002);
                    Object b2 = anxp.h.b(access$0002.d);
                    if (b2 == null) {
                        b2 = access$0002.b;
                    } else {
                        b2 = access$0002.a(b2);
                    }
                    avsj = (avsj) b2;
                } else {
                    avsj = null;
                }
                if (avsj == null) {
                    azdv azdv;
                    azdv azdv2;
                    if (c instanceof aqgs) {
                        aqgs aqgs = (aqgs) c;
                        aqgu aqgu = aqgs.w;
                        if (aqgu == null) {
                            aqgu = aqgu.c;
                        }
                        if ((1 & aqgu.a) != 0) {
                            aqgu aqgu2 = aqgs.w;
                            if (aqgu2 == null) {
                                aqgu2 = aqgu.c;
                            }
                            avsj2 = aqgu2.b;
                            if (avsj2 == null) {
                                avsj2 = avsj.h;
                            }
                        }
                    } else if (c instanceof ajyc) {
                        awjl awjl = ((ajyc) c).j;
                        if (awjl != null && awjl.a == 60572968) {
                            avsj2 = (avsj) awjl.b;
                        }
                    } else if (c instanceof arss) {
                        arss arss = (arss) c;
                        arsu arsu = arss.u;
                        if (arsu == null) {
                            arsu = arsu.c;
                        }
                        if ((1 & arsu.a) != 0) {
                            arsu arsu2 = arss.u;
                            if (arsu2 == null) {
                                arsu2 = arsu.c;
                            }
                            avsj2 = arsu2.b;
                            if (avsj2 == null) {
                                avsj2 = avsj.h;
                            }
                        }
                    } else if (c instanceof awlq) {
                        awlq awlq = (awlq) c;
                        awlo awlo = awlq.p;
                        if (awlo == null) {
                            awlo = awlo.c;
                        }
                        if ((1 & awlo.a) != 0) {
                            awlo awlo2 = awlq.p;
                            if (awlo2 == null) {
                                awlo2 = awlo.c;
                            }
                            avsj2 = awlo2.b;
                            if (avsj2 == null) {
                                avsj2 = avsj.h;
                            }
                        }
                    } else if (c instanceof azem) {
                        azem azem = (azem) c;
                        if ((azem.a & 1024) != 0) {
                            azeo azeo = azem.l;
                            if (azeo == null) {
                                azeo = azeo.c;
                            }
                            avsj2 = azeo.b;
                            if (avsj2 == null) {
                                avsj2 = avsj.h;
                            }
                        }
                    } else if (c instanceof azdt) {
                        azdt azdt = (azdt) c;
                        azdv = azdt.y;
                        if (azdv == null) {
                            azdv = azdv.c;
                        }
                        if ((1 & azdv.a) != 0) {
                            azdv2 = azdt.y;
                            if (azdv2 == null) {
                                azdv2 = azdv.c;
                            }
                            avsj2 = azdv2.b;
                            if (avsj2 == null) {
                                avsj2 = avsj.h;
                            }
                        }
                    } else if (c instanceof ham) {
                        ham ham = (ham) c;
                        azdv = ham.a().y;
                        if (azdv == null) {
                            azdv = azdv.c;
                        }
                        if ((1 & azdv.a) != 0) {
                            azdv2 = ham.a().y;
                            if (azdv2 == null) {
                                azdv2 = azdv.c;
                            }
                            avsj2 = azdv2.b;
                            if (avsj2 == null) {
                                avsj2 = avsj.h;
                            }
                        }
                    } else if (c instanceof awvz) {
                        awvz awvz = (awvz) c;
                        awvx awvx = awvz.h;
                        if (awvx == null) {
                            awvx = awvx.c;
                        }
                        if ((1 & awvx.a) != 0) {
                            awvx awvx2 = awvz.h;
                            if (awvx2 == null) {
                                awvx2 = awvx.c;
                            }
                            avsj2 = awvx2.b;
                            if (avsj2 == null) {
                                avsj2 = avsj.h;
                            }
                        }
                    } else if (c instanceof ayye) {
                        ayye ayye = (ayye) c;
                        ayyg ayyg = ayye.m;
                        if (ayyg == null) {
                            ayyg = ayyg.c;
                        }
                        if (ayyg.a == 60572968) {
                            ayyg ayyg2 = ayye.m;
                            if (ayyg2 == null) {
                                ayyg2 = ayyg.c;
                            }
                            if (ayyg2.a == 60572968) {
                                avsj2 = (avsj) ayyg2.b;
                            } else {
                                avsj2 = avsj.h;
                            }
                        }
                    }
                    avsj2 = null;
                } else {
                    avsj2 = avsj;
                }
                if (avsj2 == null) {
                    valueOf = String.valueOf(c);
                    stringBuilder = new StringBuilder(valueOf.length() + 36);
                    stringBuilder.append("Object is not an offlineable video: ");
                    stringBuilder.append(valueOf);
                    xtl.c(stringBuilder.toString());
                    return;
                }
                this.a.a(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b, avsj2, null, (acvx) xsb.a(map, (Object) "com.google.android.libraries.youtube.logging.interaction_logger", acvx.class));
                return;
            case 2:
                this.a.a(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b, false);
                return;
            case 3:
                if (this.b.b()) {
                    ((agwc) this.c.get()).b().k().d(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b);
                    return;
                }
                valueOf = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b;
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 63);
                stringBuilder.append("Trying to pause download (id=");
                stringBuilder.append(valueOf);
                stringBuilder.append(") but user does not have downloads");
                xtl.d(stringBuilder.toString());
                return;
            case 4:
                this.a.a(null);
                return;
            case 5:
                if (this.b.b()) {
                    ((agwc) this.c.get()).b().k().e(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b);
                    return;
                }
                valueOf = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b;
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 65);
                stringBuilder.append("Trying to resume download (id=");
                stringBuilder.append(valueOf);
                stringBuilder.append(str);
                xtl.d(stringBuilder.toString());
                return;
            case 7:
                this.a.a(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c, offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b, null, true);
                return;
            case 8:
                if (this.b.b()) {
                    agqy a2 = ((agwc) this.c.get()).b().k().a(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b);
                    if (a2 != null) {
                        this.a.a(a2.j, false);
                        return;
                    }
                }
                valueOf = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b;
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 64);
                stringBuilder.append("Trying to renew download (id=");
                stringBuilder.append(valueOf);
                stringBuilder.append(str);
                xtl.d(stringBuilder.toString());
                return;
                break;
            default:
                int a3 = avrj.a(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d);
                if (a3 == 0) {
                    a3 = 1;
                }
                valueOf = String.valueOf(avrj.b(a3));
                stringBuilder = new StringBuilder(valueOf.length() + 34);
                stringBuilder.append("Unsupported Offline Video Action: ");
                stringBuilder.append(valueOf);
                xtl.d(stringBuilder.toString());
                break;
        }
    }
}
