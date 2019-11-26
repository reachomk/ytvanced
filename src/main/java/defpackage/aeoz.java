package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* renamed from: aeoz */
final class aeoz {
    public final aeow a;
    public final aeov b;
    public njm c = null;
    public ByteBuffer d;
    public ByteBuffer e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public int h = 0;

    public aeoz(aeow aeow, aeov aeov) {
        this.a = aeow;
        this.b = aeov;
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        if (min != 0) {
            ByteBuffer slice = byteBuffer.slice();
            slice.limit(min);
            byteBuffer2.put(slice);
            byteBuffer.position(byteBuffer.position() + min);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(njm njm) {
        a(njm, new byte[0]);
    }

    /* Access modifiers changed, original: final */
    public final void a(njm njm, byte[] bArr) {
        int a = njs.a(njm.b);
        if (a == 0) {
            a = 9;
        }
        a--;
        if (a != 0) {
            if (a == 2) {
                this.b.a(this.a, bArr);
            } else if (a == 6) {
                this.b.a(this.a, new String(bArr));
                return;
            } else if (a != 9) {
                if (a == 11) {
                    this.b.b(this.a, new String(bArr));
                    return;
                } else if (a == 14) {
                    Set a2 = aeow.a(njm);
                    if (a2.isEmpty()) {
                        afpc.a(1, afpf.onesie, "RESTRICTED_FORMATS_HINT header with no itags. Ignored.", 1.0E-4d);
                        return;
                    } else {
                        this.b.a(this.a, njm.c, a2);
                        return;
                    }
                } else if (a == 16) {
                    try {
                        int parseInt = Integer.parseInt(njm.d);
                        amqp amqp = ampo.a;
                        long j = njm.i;
                        if (j > 0) {
                            amqp = amqp.b(Long.valueOf(j));
                        }
                        amqp amqp2 = amqp;
                        amqp = ampo.a;
                        if ((njm.a & 4096) != 0) {
                            njw njw = njm.o;
                            if (njw == null) {
                                njw = njw.d;
                            }
                            if (njw.b >= 0) {
                                njw = njm.o;
                                if (njw == null) {
                                    njw = njw.d;
                                }
                                if (njw.c > 0) {
                                    njw njw2 = njm.o;
                                    if (njw2 == null) {
                                        njw2 = njw.d;
                                    }
                                    j = njw2.b;
                                    njw2 = njm.o;
                                    if (njw2 == null) {
                                        njw2 = njw.d;
                                    }
                                    amqp = amqp.b(aepa.a(j, njw2.c));
                                }
                            }
                        }
                        this.b.a(this.a, aeox.a(njm.c, parseInt, njm.f, (njm.a & 32768) != 0 ? njm.p : -1, njm.e, amqp2, amqp));
                        return;
                    } catch (NumberFormatException unused) {
                        afpc.a(1, afpf.onesie, "STREAM_METADATA invalid itag received.");
                        return;
                    }
                }
            } else if (URLUtil.isValidUrl(njm.j)) {
                this.b.a(this.a, Uri.parse(njm.j));
                return;
            } else {
                throw new aeoy(106, "OnesieMultipartWrapper: Malformed server push URL");
            }
            return;
        }
        nju nju = njm.h;
        if (nju == null) {
            nju = nju.d;
        }
        if ((nju.a & 1) != 0) {
            nju = njm.h;
            if (nju == null) {
                nju = nju.d;
            }
            if ((nju.a & 2) != 0) {
                nju = njm.h;
                if (nju == null) {
                    nju = nju.d;
                }
                if (nju.b.b() != 0) {
                    aeov aeov = this.b;
                    aeow aeow = this.a;
                    nju nju2 = njm.h;
                    if (nju2 == null) {
                        nju2 = nju.d;
                    }
                    byte[] d = nju2.b.d();
                    nju nju3 = njm.h;
                    if (nju3 == null) {
                        nju3 = nju.d;
                    }
                    aeov.a(aeow, bArr, d, nju3.c.d());
                    return;
                }
            }
        }
        throw new aeoy(103, "OnesieMultipartWrapper: Missing crypto params");
    }

    public final void a(njg njg, aepb aepb, byte[] bArr, boolean z, boolean z2) {
        byte[] bArr2;
        njg njg2 = njg;
        int a = nji.a(njg2.h);
        if (a == 0 || a != 3) {
            bArr2 = bArr;
        } else {
            try {
                bArr2 = anaz.a(new GZIPInputStream(new ByteArrayInputStream(bArr)));
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                String str = "OnesieMultipartWrapper: Failed to decompress part body. ";
                throw new aeoy(107, valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
        }
        aepc aepc = new aepc(bArr2, njg2.c, njg2.d, njg2.e, (njg2.a & 256) != 0 ? njg2.j : -1, z2, z, njg2.f, njg2.k, aepb == null ? aepc.a : aepb);
        if (njg2.i) {
            this.b.b(this.a, aepc);
        } else {
            this.b.a(this.a, aepc);
        }
    }
}
