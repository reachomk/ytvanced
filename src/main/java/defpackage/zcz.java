package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint;

/* renamed from: zcz */
public final class zcz {
    public static boolean a(Object obj) {
        return (obj instanceof aqoj) || (obj instanceof aqof) || (obj instanceof aqnt) || (obj instanceof ajtu) || (obj instanceof aqnr) || (obj instanceof aqnx) || (obj instanceof aqmx);
    }

    public static String b(Object obj) {
        String a = zdb.a(obj);
        return TextUtils.isEmpty(a) ? zcz.c(obj) : a;
    }

    public static String c(Object obj) {
        if (obj instanceof aqoj) {
            return ((aqoj) obj).e;
        }
        if (obj instanceof ajtu) {
            return ((ajtu) obj).q;
        }
        if (obj instanceof aqnx) {
            aqnx aqnx = (aqnx) obj;
            if ((aqnx.a & 8) != 0) {
                return aqnx.e;
            }
            return null;
        }
        if (obj instanceof aqmx) {
            aqmx aqmx = (aqmx) obj;
            if ((aqmx.a & 8) != 0) {
                return aqmx.e;
            }
        }
        return null;
    }

    public static long d(Object obj) {
        if (obj instanceof aqoj) {
            return ((aqoj) obj).b;
        }
        if (obj instanceof ajtu) {
            return ((ajtu) obj).a;
        }
        if (obj instanceof aqnt) {
            return ((aqnt) obj).b;
        }
        if (obj instanceof aqnr) {
            return ((aqnr) obj).b;
        }
        if (obj instanceof aqnx) {
            return ((aqnx) obj).b;
        }
        return obj instanceof aqmx ? ((aqmx) obj).b : 0;
    }

    public static CharSequence a(Object obj, aaas aaas) {
        arml arml = null;
        if (obj instanceof aqoj) {
            aqoj aqoj = (aqoj) obj;
            if ((aqoj.a & 256) != 0) {
                arml = aqoj.j;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            return aabb.a(arml, aaas, false);
        } else if (obj instanceof ajtu) {
            return aabb.a(((ajtu) obj).j, aaas, false);
        } else {
            if (obj instanceof aqnt) {
                aqnt aqnt = (aqnt) obj;
                if ((aqnt.a & 4) != 0) {
                    arml = aqnt.d;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                return ajqy.a(arml);
            } else if (obj instanceof aqof) {
                aqof aqof = (aqof) obj;
                if ((aqof.a & 4) != 0) {
                    arml = aqof.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                return aabb.a(arml, aaas, false);
            } else if (!(obj instanceof aqnr)) {
                return null;
            } else {
                aqnr aqnr = (aqnr) obj;
                if ((aqnr.a & 64) != 0) {
                    arml = aqnr.h;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                return aabb.a(arml, aaas, false);
            }
        }
    }

    public static apxu e(Object obj) {
        apxu apxu;
        if (obj instanceof aqoj) {
            aqoj aqoj = (aqoj) obj;
            if ((aqoj.a & 16384) == 0) {
                return null;
            }
            apxu = aqoj.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            return apxu;
        } else if (obj instanceof ajtu) {
            return ((ajtu) obj).g;
        } else {
            if (obj instanceof aqnx) {
                aqnx aqnx = (aqnx) obj;
                if ((aqnx.a & 32768) == 0) {
                    return null;
                }
                apxu = aqnx.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                return apxu;
            }
            if (obj instanceof aqmx) {
                aqmx aqmx = (aqmx) obj;
                if ((aqmx.a & 32768) != 0) {
                    apxu = aqmx.m;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    return apxu;
                }
            }
            return null;
        }
    }

    public static aqnf f(Object obj) {
        aqnh aqnh;
        aqnh aqnh2;
        aqnf aqnf;
        if (obj instanceof aqoj) {
            aqoj aqoj = (aqoj) obj;
            aqnh = aqoj.l;
            if (aqnh == null) {
                aqnh = aqnh.c;
            }
            if ((aqnh.a & 1) == 0) {
                return null;
            }
            aqnh2 = aqoj.l;
            if (aqnh2 == null) {
                aqnh2 = aqnh.c;
            }
            aqnf = aqnh2.b;
            if (aqnf == null) {
                aqnf = aqnf.j;
            }
            return aqnf;
        }
        if (obj instanceof ajtu) {
            aqnh = ((ajtu) obj).f;
            if (aqnh != null) {
                if ((aqnh.a & 1) == 0) {
                    return null;
                }
                aqnf = aqnh.b;
                if (aqnf == null) {
                    aqnf = aqnf.j;
                }
                return aqnf;
            }
        }
        if (obj instanceof aqnx) {
            aqnx aqnx = (aqnx) obj;
            if ((aqnx.a & 4096) != 0) {
                aqnh2 = aqnx.m;
                if (aqnh2 == null) {
                    aqnh2 = aqnh.c;
                }
                if ((aqnh2.a & 1) == 0) {
                    return null;
                }
                aqnh2 = aqnx.m;
                if (aqnh2 == null) {
                    aqnh2 = aqnh.c;
                }
                aqnf = aqnh2.b;
                if (aqnf == null) {
                    aqnf = aqnf.j;
                }
                return aqnf;
            }
        }
        if (obj instanceof aqmx) {
            aqmx aqmx = (aqmx) obj;
            if ((aqmx.a & 4096) != 0) {
                aqnh = aqmx.l;
                if (aqnh == null) {
                    aqnh = aqnh.c;
                }
                if ((aqnh.a & 1) != 0) {
                    aqnh2 = aqmx.l;
                    if (aqnh2 == null) {
                        aqnh2 = aqnh.c;
                    }
                    aqnf = aqnh2.b;
                    if (aqnf == null) {
                        aqnf = aqnf.j;
                    }
                    return aqnf;
                }
            }
        }
        return null;
    }

    public static boolean g(Object obj) {
        aqnf f;
        if (zcz.a(obj)) {
            f = zcz.f(obj);
        } else if (obj instanceof aqnf) {
            f = (aqnf) obj;
        } else {
            f = null;
        }
        if (!(f == null || (f.a & 8) == 0)) {
            aphj aphj = f.e;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphv aphv = aphj.c;
            if (aphv == null) {
                aphv = aphv.s;
            }
            if (aphv.b) {
                return true;
            }
        }
        return false;
    }

    public static auvn h(Object obj) {
        aqnj aqnj;
        if (obj instanceof aqoj) {
            aqnj = ((aqoj) obj).i;
            if (aqnj == null) {
                aqnj = aqnj.c;
            }
        } else if (obj instanceof ajtu) {
            aqnj = ((ajtu) obj).m;
        } else {
            if (obj instanceof aqnx) {
                aqnx aqnx = (aqnx) obj;
                if ((aqnx.a & 128) != 0) {
                    aqnj = aqnx.i;
                    if (aqnj == null) {
                        aqnj = aqnj.c;
                    }
                }
            } else if (obj instanceof aqmx) {
                aqmx aqmx = (aqmx) obj;
                if ((aqmx.a & 128) != 0) {
                    aqnj = aqmx.i;
                    if (aqnj == null) {
                        aqnj = aqnj.c;
                    }
                }
            }
            aqnj = null;
        }
        if (aqnj == null || (aqnj.a & 1) == 0) {
            return null;
        }
        auvn auvn = aqnj.b;
        if (auvn == null) {
            auvn = auvn.l;
        }
        return auvn;
    }

    public static aqnl i(Object obj) {
        aqnl aqnl;
        if (obj instanceof aqoj) {
            aqoj aqoj = (aqoj) obj;
            if ((aqoj.a & 262144) == 0) {
                return null;
            }
            aqnl = aqoj.o;
            if (aqnl == null) {
                aqnl = aqnl.e;
            }
            return aqnl;
        } else if (obj instanceof ajtu) {
            return ((ajtu) obj).o;
        } else {
            if (obj instanceof aqnr) {
                aqnr aqnr = (aqnr) obj;
                if ((aqnr.a & 512) == 0) {
                    return null;
                }
                aqnl = aqnr.k;
                if (aqnl == null) {
                    aqnl = aqnl.e;
                }
                return aqnl;
            } else if (obj instanceof aqnx) {
                aqnx aqnx = (aqnx) obj;
                if ((aqnx.a & 262144) == 0) {
                    return null;
                }
                aqnl = aqnx.p;
                if (aqnl == null) {
                    aqnl = aqnl.e;
                }
                return aqnl;
            } else {
                if (obj instanceof aqmx) {
                    aqmx aqmx = (aqmx) obj;
                    if ((aqmx.a & 262144) != 0) {
                        aqnl = aqmx.o;
                        if (aqnl == null) {
                            aqnl = aqnl.e;
                        }
                        return aqnl;
                    }
                }
                return null;
            }
        }
    }

    public static aqmz j(Object obj) {
        aqnb aqnb;
        aqmz aqmz;
        aqnb aqnb2;
        if (obj instanceof ajtu) {
            aqnb = ((ajtu) obj).n;
            if (aqnb == null || (aqnb.a & 1) == 0) {
                return null;
            }
            aqmz = aqnb.b;
            if (aqmz == null) {
                aqmz = aqmz.i;
            }
            return aqmz;
        } else if (obj instanceof aqoj) {
            aqoj aqoj = (aqoj) obj;
            if ((aqoj.a & 1024) != 0) {
                aqnb2 = aqoj.k;
                if (aqnb2 == null) {
                    aqnb2 = aqnb.c;
                }
                if ((aqnb2.a & 1) == 0) {
                    return null;
                }
                aqnb = aqoj.k;
                if (aqnb == null) {
                    aqnb = aqnb.c;
                }
                aqmz = aqnb.b;
                if (aqmz == null) {
                    aqmz = aqmz.i;
                }
                return aqmz;
            }
        } else if (obj instanceof aqnx) {
            aqnx aqnx = (aqnx) obj;
            aqnb2 = aqnx.l;
            if (aqnb2 == null) {
                aqnb2 = aqnb.c;
            }
            if ((aqnb2.a & 1) != 0) {
                aqnb = aqnx.l;
                if (aqnb == null) {
                    aqnb = aqnb.c;
                }
                aqmz = aqnb.b;
                if (aqmz == null) {
                    aqmz = aqmz.i;
                }
                return aqmz;
            }
        } else if (obj instanceof aqmx) {
            aqmx aqmx = (aqmx) obj;
            if ((aqmx.a & 2048) != 0) {
                aqnb2 = aqmx.k;
                if (aqnb2 == null) {
                    aqnb2 = aqnb.c;
                }
                if ((aqnb2.a & 1) != 0) {
                    aqnb = aqmx.k;
                    if (aqnb == null) {
                        aqnb = aqnb.c;
                    }
                    aqmz = aqnb.b;
                    if (aqmz == null) {
                        aqmz = aqmz.i;
                    }
                    return aqmz;
                }
            }
        }
        return null;
    }

    public static String k(Object obj) {
        if (obj instanceof ajtu) {
            return ((ajtu) obj).p;
        }
        if (obj instanceof aqoj) {
            return ((aqoj) obj).p;
        }
        if (obj instanceof aqnr) {
            aqnr aqnr = (aqnr) obj;
            if ((aqnr.a & 32) != 0) {
                return aqnr.g;
            }
            return null;
        } else if (obj instanceof aqnx) {
            aqnx aqnx = (aqnx) obj;
            if ((aqnx.a & 524288) != 0) {
                return aqnx.q;
            }
            return null;
        } else {
            if (obj instanceof aqmx) {
                aqmx aqmx = (aqmx) obj;
                if ((aqmx.a & 524288) != 0) {
                    return aqmx.p;
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    public static defpackage.aqoj a(defpackage.aqnz r4, java.lang.String r5, java.lang.String r6) {
        /*
        r4 = r4.d;
        if (r4 != 0) goto L_0x0006;
    L_0x0004:
        r4 = defpackage.apxu.d;
    L_0x0006:
        r0 = com.google.protos.youtube.api.innertube.ShareToConversationEndpointOuterClass$ShareToConversationEndpoint.shareToConversationEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r4.a(r0);
        r1 = r4.h;
        r0 = r0.d;
        r0 = r1.a(r0);
        r1 = 0;
        if (r0 != 0) goto L_0x005e;
    L_0x001a:
        r0 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r4.a(r0);
        r2 = r4.h;
        r0 = r0.d;
        r0 = r2.a(r0);
        if (r0 == 0) goto L_0x005c;
    L_0x002d:
        r0 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r4.a(r0);
        r4 = r4.h;
        r2 = r0.d;
        r4 = r4.b(r2);
        if (r4 != 0) goto L_0x0043;
    L_0x0040:
        r4 = r0.b;
        goto L_0x0047;
    L_0x0043:
        r4 = r0.a(r4);
    L_0x0047:
        r4 = (com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint) r4;
        r0 = r4.a;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x005c;
    L_0x004f:
        r4 = r4.d;
        if (r4 != 0) goto L_0x0055;
    L_0x0053:
        r4 = defpackage.aqnn.i;
    L_0x0055:
        r4 = r4.b;
        if (r4 != 0) goto L_0x008c;
    L_0x0059:
        r4 = defpackage.aqoj.s;
        goto L_0x008c;
    L_0x005c:
        r4 = r1;
        goto L_0x008c;
    L_0x005e:
        r0 = com.google.protos.youtube.api.innertube.ShareToConversationEndpointOuterClass$ShareToConversationEndpoint.shareToConversationEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r4.a(r0);
        r4 = r4.h;
        r2 = r0.d;
        r4 = r4.b(r2);
        if (r4 != 0) goto L_0x0074;
    L_0x0071:
        r4 = r0.b;
        goto L_0x0078;
    L_0x0074:
        r4 = r0.a(r4);
    L_0x0078:
        r4 = (com.google.protos.youtube.api.innertube.ShareToConversationEndpointOuterClass$ShareToConversationEndpoint) r4;
        r0 = r4.a;
        r0 = r0 & 8;
        if (r0 == 0) goto L_0x005c;
    L_0x0080:
        r4 = r4.g;
        if (r4 != 0) goto L_0x0086;
    L_0x0084:
        r4 = defpackage.aqnn.i;
    L_0x0086:
        r4 = r4.b;
        if (r4 != 0) goto L_0x008c;
    L_0x008a:
        r4 = defpackage.aqoj.s;
    L_0x008c:
        if (r4 == 0) goto L_0x00ce;
    L_0x008e:
        r0 = defpackage.aqoj.s;
        r0 = r0.createBuilder();
        r0 = (defpackage.aqoi) r0;
        r4 = r4.toByteArray();	 Catch:{ anyg -> 0x00ce }
        r2 = defpackage.anxa.c();	 Catch:{ anyg -> 0x00ce }
        r0.mergeFrom(r4, r2);	 Catch:{ anyg -> 0x00ce }
        r2 = 0;
        r0.a(r2);
        r4 = 1;
        r4 = new java.lang.String[r4];
        r2 = 0;
        r4[r2] = r5;
        r4 = defpackage.ajqy.a(r4);
        r0.a(r4);
        r0.copyOnWrite();
        r4 = r0.instance;
        r4 = (defpackage.aqoj) r4;
        r4.g = r1;
        r5 = r4.a;
        r5 = r5 & -33;
        r4.a = r5;
        r0.a(r6);
        r4 = r0.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.aqoj) r4;
        return r4;
    L_0x00ce:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcz.a(aqnz, java.lang.String, java.lang.String):aqoj");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3 A:{SYNTHETIC, Splitter:B:36:0x00a3} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3 A:{SYNTHETIC, Splitter:B:36:0x00a3} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e3  */
    public static defpackage.ajtu a(defpackage.aqpp r5, java.lang.String r6, java.lang.String r7) {
        /*
        r0 = r5.b;
        if (r0 != 0) goto L_0x0006;
    L_0x0004:
        r0 = defpackage.apxu.d;
    L_0x0006:
        r1 = com.google.protos.youtube.api.innertube.ShareToConversationEndpointOuterClass$ShareToConversationEndpoint.shareToConversationEndpoint;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r2 = r0.h;
        r1 = r1.d;
        r1 = r2.a(r1);
        r2 = 0;
        if (r1 != 0) goto L_0x0066;
    L_0x001a:
        r1 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r3 = r0.h;
        r1 = r1.d;
        r1 = r3.a(r1);
        if (r1 == 0) goto L_0x0064;
    L_0x002d:
        r1 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r3 = r1.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x0043;
    L_0x0040:
        r0 = r1.b;
        goto L_0x0047;
    L_0x0043:
        r0 = r1.a(r0);
    L_0x0047:
        r0 = (com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint) r0;
        r1 = r0.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x0064;
    L_0x004f:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0055;
    L_0x0053:
        r0 = defpackage.aqnn.i;
    L_0x0055:
        r0 = r0.d;
        if (r0 != 0) goto L_0x005b;
    L_0x0059:
        r0 = defpackage.aqon.o;
    L_0x005b:
        r1 = defpackage.ajtu.class;
        r0 = defpackage.ajzv.a(r0, r1);
        r0 = (defpackage.ajtu) r0;
        goto L_0x009c;
    L_0x0064:
        r0 = r2;
        goto L_0x009c;
    L_0x0066:
        r1 = com.google.protos.youtube.api.innertube.ShareToConversationEndpointOuterClass$ShareToConversationEndpoint.shareToConversationEndpoint;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r3 = r1.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x007c;
    L_0x0079:
        r0 = r1.b;
        goto L_0x0080;
    L_0x007c:
        r0 = r1.a(r0);
    L_0x0080:
        r0 = (com.google.protos.youtube.api.innertube.ShareToConversationEndpointOuterClass$ShareToConversationEndpoint) r0;
        r1 = r0.a;
        r1 = r1 & 8;
        if (r1 == 0) goto L_0x0064;
    L_0x0088:
        r0 = r0.g;
        if (r0 != 0) goto L_0x008e;
    L_0x008c:
        r0 = defpackage.aqnn.i;
    L_0x008e:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0094;
    L_0x0092:
        r0 = defpackage.aqon.o;
    L_0x0094:
        r1 = defpackage.ajtu.class;
        r0 = defpackage.ajzv.a(r0, r1);
        r0 = (defpackage.ajtu) r0;
    L_0x009c:
        r1 = new ajtu;
        r1.<init>();
        if (r0 == 0) goto L_0x00ac;
    L_0x00a3:
        r0 = defpackage.aocf.toByteArray(r0);	 Catch:{ aocg -> 0x00ab }
        defpackage.aocf.mergeFrom(r1, r0);	 Catch:{ aocg -> 0x00ab }
        goto L_0x00ac;
    L_0x00ab:
        return r2;
    L_0x00ac:
        r3 = 0;
        r1.a = r3;
        r0 = 1;
        r3 = new java.lang.String[r0];
        if (r6 != 0) goto L_0x00b7;
    L_0x00b5:
        r6 = "";
    L_0x00b7:
        r4 = 0;
        r3[r4] = r6;
        r6 = defpackage.ajqy.a(r3);
        r1.j = r6;
        r6 = r5.c;
        if (r6 != 0) goto L_0x00c6;
    L_0x00c4:
        r6 = defpackage.aqpn.c;
    L_0x00c6:
        r6 = r6.a;
        r6 = r6 & r0;
        if (r6 == 0) goto L_0x00d8;
    L_0x00cb:
        r5 = r5.c;
        if (r5 != 0) goto L_0x00d1;
    L_0x00cf:
        r5 = defpackage.aqpn.c;
    L_0x00d1:
        r5 = r5.b;
        if (r5 != 0) goto L_0x00d9;
    L_0x00d5:
        r5 = defpackage.aryi.o;
        goto L_0x00d9;
    L_0x00d8:
        r5 = r2;
    L_0x00d9:
        r6 = defpackage.aqnp.d;
        r6 = r6.createBuilder();
        r6 = (defpackage.aqno) r6;
        if (r5 == 0) goto L_0x00f2;
    L_0x00e3:
        r6.copyOnWrite();
        r0 = r6.instance;
        r0 = (defpackage.aqnp) r0;
        r0.c = r5;
        r5 = r0.a;
        r5 = r5 | 2;
        r0.a = r5;
    L_0x00f2:
        r5 = r6.build();
        r5 = (defpackage.anxl) r5;
        r5 = (defpackage.aqnp) r5;
        r1.e = r5;
        r1.c = r2;
        r1.q = r7;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcz.a(aqpp, java.lang.String, java.lang.String):ajtu");
    }

    public static aqpp a(apxu apxu) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        aqpr aqpr = ((ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint) obj).d;
        if (aqpr == null) {
            aqpr = aqpr.c;
        }
        if ((aqpr.a & 1) == 0) {
            return null;
        }
        access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
        apxu.a(access$000);
        Object b2 = apxu.h.b(access$000.d);
        if (b2 == null) {
            b2 = access$000.b;
        } else {
            b2 = access$000.a(b2);
        }
        aqpr aqpr2 = ((ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint) b2).d;
        if (aqpr2 == null) {
            aqpr2 = aqpr.c;
        }
        aqpp aqpp = aqpr2.b;
        if (aqpp == null) {
            aqpp = aqpp.d;
        }
        return aqpp;
    }
}
