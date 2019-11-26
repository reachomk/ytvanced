package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.logging.Level;

/* renamed from: bawp */
final class bawp extends bcix {
    private List a;
    private final /* synthetic */ bawq b;

    bawp(bawq bawq) {
        this.b = bawq;
    }

    public final void a(bciw bciw) {
        synchronized (this.b.n.a) {
            bawu bawu = this.b.n;
            amqw.b(bawu.k != null);
            synchronized (bawu.t) {
                amqw.b(bawu.w ^ 1, (Object) "Already allocated");
                bawu.w = true;
            }
            bawu.b();
            bawu = this.b.n;
            bawu.c = true;
            for (baws baws : bawu.b) {
                bawu.i.a(baws.a, baws.b, baws.c);
            }
            bawu.b.clear();
        }
    }

    public final void a(bciw bciw, bclb bclb) {
        a(bclb.d(), false);
        bciw.a(ByteBuffer.allocateDirect(4096));
    }

    public final void a(bciw bciw, bclb bclb, ByteBuffer byteBuffer, boolean z) {
        Throwable th;
        byteBuffer.flip();
        synchronized (this.b.n.a) {
            this.b.n.g = z;
            boolean z2 = true;
            if (byteBuffer.remaining() != 0) {
                bawu bawu = this.b.n;
                bawu.e += byteBuffer.remaining();
                bbff a = bbfi.a(byteBuffer);
                bavx bavx = bawu.z;
                if (bavx != null) {
                    String str = "DATA-----------------------------\n";
                    String valueOf = String.valueOf(bbfi.a(a, bawu.B));
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    bawu.z = bavx.b(valueOf);
                    a.close();
                    if (bawu.z.n.length() > 1000) {
                        bawu.a(bawu.z, false, bawu.A);
                    }
                } else if (bawu.C) {
                    amqw.a((Object) a, (Object) "frame");
                    try {
                        if (bawu.q) {
                            baxa.p.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                            a.close();
                        } else {
                            try {
                                bawu.s.a(a);
                            } catch (Throwable th2) {
                                th = th2;
                                z2 = false;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (z2) {
                            a.close();
                        }
                        throw th;
                    }
                } else {
                    bawu.a(bavx.i.a("headers not received before payload"), false, new baum());
                }
            }
        }
        if (z) {
            List list = this.a;
            if (list != null) {
                a(list, true);
            }
        }
    }

    public final void b(bciw bciw, bclb bclb, ByteBuffer byteBuffer, boolean z) {
        synchronized (this.b.n.a) {
            bawq bawq = this.b;
            bawu bawu = bawq.n;
            Object obj = null;
            if (!bawu.h) {
                bawu.h = true;
                for (int i = 0; i < bawq.d.a.length; i++) {
                }
            }
            bawu bawu2 = this.b.n;
            int position = byteBuffer.position();
            synchronized (bawu2.t) {
                amqw.b(bawu2.w, (Object) "onStreamAllocated was not called, but it seems the stream is active");
                int i2 = bawu2.v;
                position = i2 - position;
                bawu2.v = position;
                if (i2 >= 32768) {
                    if (position < 32768) {
                        obj = 1;
                    }
                }
            }
            if (obj != null) {
                bawu2.b();
            }
        }
    }

    public final void a(bciw bciw, bclb bclb, bcla bcla) {
        boolean z;
        List a = bcla.a();
        this.a = a;
        synchronized (this.b.n.a) {
            z = this.b.n.g;
        }
        if (z) {
            a(a, true);
        }
    }

    public final void b(bciw bciw, bclb bclb) {
        Object obj;
        synchronized (this.b.n.a) {
            obj = null;
            if (this.a != null) {
                if (this.b.n.g) {
                    obj = 1;
                }
            }
        }
        if (obj == null) {
            List list = this.a;
            if (list != null) {
                a(list, true);
            } else if (bclb != null) {
                a(bclb.d(), true);
            } else {
                throw new AssertionError("No response header or trailer");
            }
        }
        this.b.a(bawp.a(bclb));
    }

    public final void a(bciw bciw, bclb bclb, bcjd bcjd) {
        this.b.a(bavx.j.b((Throwable) bcjd));
    }

    public final void c(bciw bciw, bclb bclb) {
        bavx bavx;
        synchronized (this.b.n.a) {
            bavx = this.b.n.f;
            if (bavx == null) {
                if (bclb != null) {
                    bavx = bawp.a(bclb);
                } else {
                    bavx = bavx.c.a("stream cancelled without reason");
                }
            }
        }
        this.b.a(bavx);
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x02bc A:{Catch:{ all -> 0x0311 }} */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02bc A:{Catch:{ all -> 0x0311 }} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0268 A:{Catch:{ all -> 0x0311 }} */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02bc A:{Catch:{ all -> 0x0311 }} */
    private final void a(java.util.List r8, boolean r9) {
        /*
        r7 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r8 = r8.iterator();
    L_0x0009:
        r1 = r8.hasNext();
        if (r1 == 0) goto L_0x0028;
    L_0x000f:
        r1 = r8.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getKey();
        r2 = (java.lang.String) r2;
        r0.add(r2);
        r1 = r1.getValue();
        r1 = (java.lang.String) r1;
        r0.add(r1);
        goto L_0x0009;
    L_0x0028:
        r8 = r0.size();
        r8 = new byte[r8][];
        r1 = 0;
        r2 = 0;
    L_0x0030:
        r3 = r0.size();
        if (r2 >= r3) goto L_0x005f;
    L_0x0036:
        r3 = r0.get(r2);
        r3 = (java.lang.String) r3;
        r4 = "UTF-8";
        r4 = java.nio.charset.Charset.forName(r4);
        r3 = r3.getBytes(r4);
        r8[r2] = r3;
        r3 = r2 + 1;
        r4 = r0.get(r3);
        r4 = (java.lang.String) r4;
        r5 = "UTF-8";
        r5 = java.nio.charset.Charset.forName(r5);
        r4 = r4.getBytes(r5);
        r8[r3] = r4;
        r2 = r2 + 2;
        goto L_0x0030;
    L_0x005f:
        r8 = defpackage.bbhu.a(r8);
        r8 = defpackage.bats.a(r8);
        r0 = r7.b;
        r0 = r0.n;
        r0 = r0.a;
        monitor-enter(r0);
        r2 = r7.b;	 Catch:{ all -> 0x0340 }
        r2 = r2.n;	 Catch:{ all -> 0x0340 }
        r3 = 1;
        if (r9 == 0) goto L_0x0139;
    L_0x0075:
        r9 = "trailers";
        defpackage.amqw.a(r8, r9);	 Catch:{ all -> 0x0340 }
        r9 = r2.z;	 Catch:{ all -> 0x0340 }
        if (r9 != 0) goto L_0x008e;
    L_0x007e:
        r4 = r2.C;	 Catch:{ all -> 0x0340 }
        if (r4 != 0) goto L_0x008e;
    L_0x0082:
        r9 = defpackage.bbch.a(r8);	 Catch:{ all -> 0x0340 }
        r2.z = r9;	 Catch:{ all -> 0x0340 }
        r9 = r2.z;	 Catch:{ all -> 0x0340 }
        if (r9 == 0) goto L_0x008e;
    L_0x008c:
        r2.A = r8;	 Catch:{ all -> 0x0340 }
    L_0x008e:
        if (r9 == 0) goto L_0x00ba;
    L_0x0090:
        r8 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0340 }
        r3 = r8.length();	 Catch:{ all -> 0x0340 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0340 }
        r3 = r3 + 10;
        r4.<init>(r3);	 Catch:{ all -> 0x0340 }
        r3 = "trailers: ";
        r4.append(r3);	 Catch:{ all -> 0x0340 }
        r4.append(r8);	 Catch:{ all -> 0x0340 }
        r8 = r4.toString();	 Catch:{ all -> 0x0340 }
        r8 = r9.b(r8);	 Catch:{ all -> 0x0340 }
        r2.z = r8;	 Catch:{ all -> 0x0340 }
        r8 = r2.z;	 Catch:{ all -> 0x0340 }
        r9 = r2.A;	 Catch:{ all -> 0x0340 }
        r2.a(r8, r1, r9);	 Catch:{ all -> 0x0340 }
        goto L_0x030f;
    L_0x00ba:
        r9 = defpackage.batu.b;	 Catch:{ all -> 0x0340 }
        r9 = r8.a(r9);	 Catch:{ all -> 0x0340 }
        r9 = (defpackage.bavx) r9;	 Catch:{ all -> 0x0340 }
        if (r9 == 0) goto L_0x00d1;
    L_0x00c4:
        r4 = defpackage.batu.a;	 Catch:{ all -> 0x0340 }
        r4 = r8.a(r4);	 Catch:{ all -> 0x0340 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0340 }
        r9 = r9.a(r4);	 Catch:{ all -> 0x0340 }
        goto L_0x00ff;
    L_0x00d1:
        r9 = r2.C;	 Catch:{ all -> 0x0340 }
        if (r9 == 0) goto L_0x00de;
    L_0x00d5:
        r9 = defpackage.bavx.d;	 Catch:{ all -> 0x0340 }
        r4 = "missing GRPC status in response";
        r9 = r9.a(r4);	 Catch:{ all -> 0x0340 }
        goto L_0x00ff;
    L_0x00de:
        r9 = defpackage.bbch.y;	 Catch:{ all -> 0x0340 }
        r9 = r8.a(r9);	 Catch:{ all -> 0x0340 }
        r9 = (java.lang.Integer) r9;	 Catch:{ all -> 0x0340 }
        if (r9 == 0) goto L_0x00f1;
    L_0x00e8:
        r9 = r9.intValue();	 Catch:{ all -> 0x0340 }
        r9 = defpackage.bbby.a(r9);	 Catch:{ all -> 0x0340 }
        goto L_0x00f9;
    L_0x00f1:
        r9 = defpackage.bavx.i;	 Catch:{ all -> 0x0340 }
        r4 = "missing HTTP status code";
        r9 = r9.a(r4);	 Catch:{ all -> 0x0340 }
    L_0x00f9:
        r4 = "missing GRPC status, inferred error from HTTP status code";
        r9 = r9.b(r4);	 Catch:{ all -> 0x0340 }
    L_0x00ff:
        defpackage.bbch.c(r8);	 Catch:{ all -> 0x0340 }
        r4 = "status";
        defpackage.amqw.a(r9, r4);	 Catch:{ all -> 0x0340 }
        r4 = "trailers";
        defpackage.amqw.a(r8, r4);	 Catch:{ all -> 0x0340 }
        r4 = r2.q;	 Catch:{ all -> 0x0340 }
        if (r4 != 0) goto L_0x0120;
    L_0x0110:
        r3 = r2.j;	 Catch:{ all -> 0x0340 }
        r3 = r3.a;	 Catch:{ all -> 0x0340 }
        r3 = r3.length;	 Catch:{ all -> 0x0340 }
        r4 = 0;
    L_0x0116:
        if (r4 >= r3) goto L_0x011b;
    L_0x0118:
        r4 = r4 + 1;
        goto L_0x0116;
    L_0x011b:
        r2.b(r9, r1, r8);	 Catch:{ all -> 0x0340 }
        goto L_0x030f;
    L_0x0120:
        r2 = defpackage.baxa.p;	 Catch:{ all -> 0x0340 }
        r4 = java.util.logging.Level.INFO;	 Catch:{ all -> 0x0340 }
        r5 = 2;
        r6 = new java.lang.Object[r5];	 Catch:{ all -> 0x0340 }
        r6[r1] = r9;	 Catch:{ all -> 0x0340 }
        r6[r3] = r8;	 Catch:{ all -> 0x0340 }
        r3 = "io.grpc.internal.AbstractClientStream$TransportState";
        r8 = "inboundTrailersReceived";
        r5 = "Received trailers on closed stream:\n {1}\n {2}";
        r1 = r2;
        r2 = r4;
        r4 = r8;
        r1.logp(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0340 }
        goto L_0x030f;
    L_0x0139:
        r9 = "headers";
        defpackage.amqw.a(r8, r9);	 Catch:{ all -> 0x0340 }
        r9 = r2.z;	 Catch:{ all -> 0x0340 }
        if (r9 == 0) goto L_0x0165;
    L_0x0142:
        r8 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0340 }
        r1 = r8.length();	 Catch:{ all -> 0x0340 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0340 }
        r1 = r1 + 9;
        r3.<init>(r1);	 Catch:{ all -> 0x0340 }
        r1 = "headers: ";
        r3.append(r1);	 Catch:{ all -> 0x0340 }
        r3.append(r8);	 Catch:{ all -> 0x0340 }
        r8 = r3.toString();	 Catch:{ all -> 0x0340 }
        r8 = r9.b(r8);	 Catch:{ all -> 0x0340 }
        r2.z = r8;	 Catch:{ all -> 0x0340 }
        goto L_0x030f;
    L_0x0165:
        r9 = r2.C;	 Catch:{ all -> 0x0311 }
        if (r9 == 0) goto L_0x01a2;
    L_0x0169:
        r9 = defpackage.bavx.i;	 Catch:{ all -> 0x0311 }
        r1 = "Received headers twice";
        r9 = r9.a(r1);	 Catch:{ all -> 0x0311 }
        r2.z = r9;	 Catch:{ all -> 0x0311 }
        r9 = r2.z;	 Catch:{ all -> 0x0340 }
        if (r9 == 0) goto L_0x030f;
    L_0x0177:
        r1 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0340 }
        r3 = r1.length();	 Catch:{ all -> 0x0340 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0340 }
        r3 = r3 + 9;
        r4.<init>(r3);	 Catch:{ all -> 0x0340 }
        r3 = "headers: ";
        r4.append(r3);	 Catch:{ all -> 0x0340 }
        r4.append(r1);	 Catch:{ all -> 0x0340 }
        r1 = r4.toString();	 Catch:{ all -> 0x0340 }
        r9 = r9.b(r1);	 Catch:{ all -> 0x0340 }
        r2.z = r9;	 Catch:{ all -> 0x0340 }
        r2.A = r8;	 Catch:{ all -> 0x0340 }
        r8 = defpackage.bbch.b(r8);	 Catch:{ all -> 0x0340 }
        r2.B = r8;	 Catch:{ all -> 0x0340 }
        goto L_0x030f;
    L_0x01a2:
        r9 = defpackage.bbch.y;	 Catch:{ all -> 0x0311 }
        r9 = r8.a(r9);	 Catch:{ all -> 0x0311 }
        r9 = (java.lang.Integer) r9;	 Catch:{ all -> 0x0311 }
        if (r9 == 0) goto L_0x01ec;
    L_0x01ac:
        r4 = r9.intValue();	 Catch:{ all -> 0x0311 }
        r5 = 100;
        if (r4 < r5) goto L_0x01ec;
    L_0x01b4:
        r9 = r9.intValue();	 Catch:{ all -> 0x0311 }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r9 < r4) goto L_0x01bd;
    L_0x01bc:
        goto L_0x01ec;
    L_0x01bd:
        r9 = r2.z;	 Catch:{ all -> 0x0340 }
        if (r9 == 0) goto L_0x030f;
    L_0x01c1:
        r1 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0340 }
        r3 = r1.length();	 Catch:{ all -> 0x0340 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0340 }
        r3 = r3 + 9;
        r4.<init>(r3);	 Catch:{ all -> 0x0340 }
        r3 = "headers: ";
        r4.append(r3);	 Catch:{ all -> 0x0340 }
        r4.append(r1);	 Catch:{ all -> 0x0340 }
        r1 = r4.toString();	 Catch:{ all -> 0x0340 }
        r9 = r9.b(r1);	 Catch:{ all -> 0x0340 }
        r2.z = r9;	 Catch:{ all -> 0x0340 }
        r2.A = r8;	 Catch:{ all -> 0x0340 }
        r8 = defpackage.bbch.b(r8);	 Catch:{ all -> 0x0340 }
        r2.B = r8;	 Catch:{ all -> 0x0340 }
        goto L_0x030f;
    L_0x01ec:
        r2.C = r3;	 Catch:{ all -> 0x0311 }
        r9 = defpackage.bbch.a(r8);	 Catch:{ all -> 0x0311 }
        r2.z = r9;	 Catch:{ all -> 0x0311 }
        r9 = r2.z;	 Catch:{ all -> 0x0311 }
        if (r9 != 0) goto L_0x02e6;
    L_0x01f8:
        defpackage.bbch.c(r8);	 Catch:{ all -> 0x0311 }
        r9 = r2.q;	 Catch:{ all -> 0x0311 }
        r9 = r9 ^ r3;
        r4 = "Received headers on closed stream";
        defpackage.amqw.b(r9, r4);	 Catch:{ all -> 0x0311 }
        r9 = r2.j;	 Catch:{ all -> 0x0311 }
        r9 = r9.a;	 Catch:{ all -> 0x0311 }
        r9 = r9.length;	 Catch:{ all -> 0x0311 }
        r4 = 0;
    L_0x0209:
        if (r4 >= r9) goto L_0x020e;
    L_0x020b:
        r4 = r4 + 1;
        goto L_0x0209;
    L_0x020e:
        r9 = defpackage.bbby.e;	 Catch:{ all -> 0x0311 }
        r9 = r8.a(r9);	 Catch:{ all -> 0x0311 }
        r9 = (java.lang.String) r9;	 Catch:{ all -> 0x0311 }
        r4 = r2.l;	 Catch:{ all -> 0x0311 }
        if (r4 != 0) goto L_0x021c;
    L_0x021a:
        r9 = 0;
        goto L_0x025e;
    L_0x021c:
        if (r9 != 0) goto L_0x021f;
    L_0x021e:
        goto L_0x021a;
    L_0x021f:
        r4 = "gzip";
        r4 = r9.equalsIgnoreCase(r4);	 Catch:{ all -> 0x0311 }
        if (r4 == 0) goto L_0x023e;
    L_0x0227:
        r9 = new bbcd;	 Catch:{ all -> 0x0311 }
        r9.<init>();	 Catch:{ all -> 0x0311 }
        r4 = r2.s;	 Catch:{ all -> 0x0311 }
        r4.a(r9);	 Catch:{ all -> 0x0311 }
        r9 = new baxj;	 Catch:{ all -> 0x0311 }
        r4 = r2.s;	 Catch:{ all -> 0x0311 }
        r4 = (defpackage.bbem) r4;	 Catch:{ all -> 0x0311 }
        r9.<init>(r2, r2, r4);	 Catch:{ all -> 0x0311 }
        r2.s = r9;	 Catch:{ all -> 0x0311 }
        r9 = 1;
        goto L_0x025e;
    L_0x023e:
        r4 = "identity";
        r4 = r9.equalsIgnoreCase(r4);	 Catch:{ all -> 0x0311 }
        if (r4 != 0) goto L_0x021a;
    L_0x0246:
        r4 = defpackage.bavx.i;	 Catch:{ all -> 0x0311 }
        r5 = "Can't find full stream decompressor for %s";
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0311 }
        r3[r1] = r9;	 Catch:{ all -> 0x0311 }
        r9 = java.lang.String.format(r5, r3);	 Catch:{ all -> 0x0311 }
        r9 = r4.a(r9);	 Catch:{ all -> 0x0311 }
        r9 = r9.b();	 Catch:{ all -> 0x0311 }
        r2.a(r9);	 Catch:{ all -> 0x0311 }
        goto L_0x02b8;
    L_0x025e:
        r4 = defpackage.bbby.c;	 Catch:{ all -> 0x0311 }
        r4 = r8.a(r4);	 Catch:{ all -> 0x0311 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0311 }
        if (r4 == 0) goto L_0x02b3;
    L_0x0268:
        r5 = r2.m;	 Catch:{ all -> 0x0311 }
        r5 = r5.b;	 Catch:{ all -> 0x0311 }
        r5 = r5.get(r4);	 Catch:{ all -> 0x0311 }
        r5 = (defpackage.batb) r5;	 Catch:{ all -> 0x0311 }
        if (r5 == 0) goto L_0x0277;
    L_0x0274:
        r5 = r5.a;	 Catch:{ all -> 0x0311 }
        goto L_0x0278;
    L_0x0277:
        r5 = 0;
    L_0x0278:
        if (r5 != 0) goto L_0x0292;
    L_0x027a:
        r9 = defpackage.bavx.i;	 Catch:{ all -> 0x0311 }
        r5 = "Can't find decompressor for %s";
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0311 }
        r3[r1] = r4;	 Catch:{ all -> 0x0311 }
        r1 = java.lang.String.format(r5, r3);	 Catch:{ all -> 0x0311 }
        r9 = r9.a(r1);	 Catch:{ all -> 0x0311 }
        r9 = r9.b();	 Catch:{ all -> 0x0311 }
        r2.a(r9);	 Catch:{ all -> 0x0311 }
        goto L_0x02b8;
    L_0x0292:
        r3 = defpackage.baso.a;	 Catch:{ all -> 0x0311 }
        if (r5 == r3) goto L_0x02b3;
    L_0x0296:
        if (r9 == 0) goto L_0x02ae;
    L_0x0298:
        r9 = defpackage.bavx.i;	 Catch:{ all -> 0x0311 }
        r3 = "Full stream and gRPC message encoding cannot both be set";
        r1 = new java.lang.Object[r1];	 Catch:{ all -> 0x0311 }
        r1 = java.lang.String.format(r3, r1);	 Catch:{ all -> 0x0311 }
        r9 = r9.a(r1);	 Catch:{ all -> 0x0311 }
        r9 = r9.b();	 Catch:{ all -> 0x0311 }
        r2.a(r9);	 Catch:{ all -> 0x0311 }
        goto L_0x02b8;
    L_0x02ae:
        r9 = r2.s;	 Catch:{ all -> 0x0311 }
        r9.a(r5);	 Catch:{ all -> 0x0311 }
    L_0x02b3:
        r9 = r2.k;	 Catch:{ all -> 0x0311 }
        r9.a(r8);	 Catch:{ all -> 0x0311 }
    L_0x02b8:
        r9 = r2.z;	 Catch:{ all -> 0x0340 }
        if (r9 == 0) goto L_0x030f;
    L_0x02bc:
        r1 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0340 }
        r3 = r1.length();	 Catch:{ all -> 0x0340 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0340 }
        r3 = r3 + 9;
        r4.<init>(r3);	 Catch:{ all -> 0x0340 }
        r3 = "headers: ";
        r4.append(r3);	 Catch:{ all -> 0x0340 }
        r4.append(r1);	 Catch:{ all -> 0x0340 }
        r1 = r4.toString();	 Catch:{ all -> 0x0340 }
        r9 = r9.b(r1);	 Catch:{ all -> 0x0340 }
        r2.z = r9;	 Catch:{ all -> 0x0340 }
        r2.A = r8;	 Catch:{ all -> 0x0340 }
        r8 = defpackage.bbch.b(r8);	 Catch:{ all -> 0x0340 }
        r2.B = r8;	 Catch:{ all -> 0x0340 }
        goto L_0x030f;
    L_0x02e6:
        r1 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0340 }
        r3 = r1.length();	 Catch:{ all -> 0x0340 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0340 }
        r3 = r3 + 9;
        r4.<init>(r3);	 Catch:{ all -> 0x0340 }
        r3 = "headers: ";
        r4.append(r3);	 Catch:{ all -> 0x0340 }
        r4.append(r1);	 Catch:{ all -> 0x0340 }
        r1 = r4.toString();	 Catch:{ all -> 0x0340 }
        r9 = r9.b(r1);	 Catch:{ all -> 0x0340 }
        r2.z = r9;	 Catch:{ all -> 0x0340 }
        r2.A = r8;	 Catch:{ all -> 0x0340 }
        r8 = defpackage.bbch.b(r8);	 Catch:{ all -> 0x0340 }
        r2.B = r8;	 Catch:{ all -> 0x0340 }
    L_0x030f:
        monitor-exit(r0);	 Catch:{ all -> 0x0340 }
        return;
    L_0x0311:
        r9 = move-exception;
        r1 = r2.z;	 Catch:{ all -> 0x0340 }
        if (r1 == 0) goto L_0x033f;
    L_0x0316:
        r3 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0340 }
        r4 = r3.length();	 Catch:{ all -> 0x0340 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0340 }
        r4 = r4 + 9;
        r5.<init>(r4);	 Catch:{ all -> 0x0340 }
        r4 = "headers: ";
        r5.append(r4);	 Catch:{ all -> 0x0340 }
        r5.append(r3);	 Catch:{ all -> 0x0340 }
        r3 = r5.toString();	 Catch:{ all -> 0x0340 }
        r1 = r1.b(r3);	 Catch:{ all -> 0x0340 }
        r2.z = r1;	 Catch:{ all -> 0x0340 }
        r2.A = r8;	 Catch:{ all -> 0x0340 }
        r8 = defpackage.bbch.b(r8);	 Catch:{ all -> 0x0340 }
        r2.B = r8;	 Catch:{ all -> 0x0340 }
    L_0x033f:
        throw r9;	 Catch:{ all -> 0x0340 }
    L_0x0340:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0340 }
        goto L_0x0344;
    L_0x0343:
        throw r8;
    L_0x0344:
        goto L_0x0343;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bawp.a(java.util.List, boolean):void");
    }

    private static bavx a(bclb bclb) {
        return bbby.a(((bcoo) bclb).a);
    }
}
